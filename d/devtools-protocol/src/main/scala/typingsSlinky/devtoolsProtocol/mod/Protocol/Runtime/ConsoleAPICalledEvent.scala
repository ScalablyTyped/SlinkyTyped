package typingsSlinky.devtoolsProtocol.mod.Protocol.Runtime

import typingsSlinky.devtoolsProtocol.devtoolsProtocolStrings.assert
import typingsSlinky.devtoolsProtocol.devtoolsProtocolStrings.clear
import typingsSlinky.devtoolsProtocol.devtoolsProtocolStrings.count
import typingsSlinky.devtoolsProtocol.devtoolsProtocolStrings.debug
import typingsSlinky.devtoolsProtocol.devtoolsProtocolStrings.dir
import typingsSlinky.devtoolsProtocol.devtoolsProtocolStrings.dirxml
import typingsSlinky.devtoolsProtocol.devtoolsProtocolStrings.endGroup
import typingsSlinky.devtoolsProtocol.devtoolsProtocolStrings.error
import typingsSlinky.devtoolsProtocol.devtoolsProtocolStrings.info
import typingsSlinky.devtoolsProtocol.devtoolsProtocolStrings.log
import typingsSlinky.devtoolsProtocol.devtoolsProtocolStrings.profile
import typingsSlinky.devtoolsProtocol.devtoolsProtocolStrings.profileEnd
import typingsSlinky.devtoolsProtocol.devtoolsProtocolStrings.startGroup
import typingsSlinky.devtoolsProtocol.devtoolsProtocolStrings.startGroupCollapsed
import typingsSlinky.devtoolsProtocol.devtoolsProtocolStrings.table
import typingsSlinky.devtoolsProtocol.devtoolsProtocolStrings.timeEnd
import typingsSlinky.devtoolsProtocol.devtoolsProtocolStrings.trace
import typingsSlinky.devtoolsProtocol.devtoolsProtocolStrings.warning
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ConsoleAPICalledEvent extends js.Object {
  
  /**
    * Call arguments.
    */
  var args: js.Array[RemoteObject] = js.native
  
  /**
    * Console context descriptor for calls on non-default console context (not console.*):
    * 'anonymous#unique-logger-id' for call on unnamed context, 'name#unique-logger-id' for call
    * on named context.
    */
  var context: js.UndefOr[String] = js.native
  
  /**
    * Identifier of the context where the call was made.
    */
  var executionContextId: ExecutionContextId = js.native
  
  /**
    * Stack trace captured when the call was made. The async stack chain is automatically reported for
    * the following call types: `assert`, `error`, `trace`, `warning`. For other types the async call
    * chain can be retrieved using `Debugger.getStackTrace` and `stackTrace.parentId` field.
    */
  var stackTrace: js.UndefOr[StackTrace] = js.native
  
  /**
    * Call timestamp.
    */
  var timestamp: Timestamp = js.native
  
  /**
    * Type of the call. (ConsoleAPICalledEventType enum)
    */
  var `type`: log | debug | info | error | warning | dir | dirxml | table | trace | clear | startGroup | startGroupCollapsed | endGroup | assert | profile | profileEnd | count | timeEnd = js.native
}
object ConsoleAPICalledEvent {
  
  @scala.inline
  def apply(
    args: js.Array[RemoteObject],
    executionContextId: ExecutionContextId,
    timestamp: Timestamp,
    `type`: log | debug | info | error | warning | dir | dirxml | table | trace | clear | startGroup | startGroupCollapsed | endGroup | assert | profile | profileEnd | count | timeEnd
  ): ConsoleAPICalledEvent = {
    val __obj = js.Dynamic.literal(args = args.asInstanceOf[js.Any], executionContextId = executionContextId.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConsoleAPICalledEvent]
  }
  
  @scala.inline
  implicit class ConsoleAPICalledEventOps[Self <: ConsoleAPICalledEvent] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setArgsVarargs(value: RemoteObject*): Self = this.set("args", js.Array(value :_*))
    
    @scala.inline
    def setArgs(value: js.Array[RemoteObject]): Self = this.set("args", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExecutionContextId(value: ExecutionContextId): Self = this.set("executionContextId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimestamp(value: Timestamp): Self = this.set("timestamp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(
      value: log | debug | info | error | warning | dir | dirxml | table | trace | clear | startGroup | startGroupCollapsed | endGroup | assert | profile | profileEnd | count | timeEnd
    ): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContext(value: String): Self = this.set("context", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteContext: Self = this.set("context", js.undefined)
    
    @scala.inline
    def setStackTrace(value: StackTrace): Self = this.set("stackTrace", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStackTrace: Self = this.set("stackTrace", js.undefined)
  }
}
