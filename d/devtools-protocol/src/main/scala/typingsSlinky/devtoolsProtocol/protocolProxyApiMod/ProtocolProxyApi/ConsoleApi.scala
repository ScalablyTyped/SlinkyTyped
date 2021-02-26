package typingsSlinky.devtoolsProtocol.protocolProxyApiMod.ProtocolProxyApi

import typingsSlinky.devtoolsProtocol.devtoolsProtocolStrings.messageAdded
import typingsSlinky.devtoolsProtocol.mod.Protocol.Console.MessageAddedEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ConsoleApi extends StObject {
  
  /**
    * Does nothing.
    */
  def clearMessages(): js.Promise[Unit] = js.native
  
  /**
    * Disables console domain, prevents further console messages from being reported to the client.
    */
  def disable(): js.Promise[Unit] = js.native
  
  /**
    * Enables console domain, sends the messages collected so far to the client by means of the
    * `messageAdded` notification.
    */
  def enable(): js.Promise[Unit] = js.native
  
  /**
    * Issued when new console message is added.
    */
  @JSName("on")
  def on_messageAdded(event: messageAdded, listener: js.Function1[/* params */ MessageAddedEvent, Unit]): Unit = js.native
}
object ConsoleApi {
  
  @scala.inline
  def apply(
    clearMessages: () => js.Promise[Unit],
    disable: () => js.Promise[Unit],
    enable: () => js.Promise[Unit],
    on: (messageAdded, js.Function1[/* params */ MessageAddedEvent, Unit]) => Unit
  ): ConsoleApi = {
    val __obj = js.Dynamic.literal(clearMessages = js.Any.fromFunction0(clearMessages), disable = js.Any.fromFunction0(disable), enable = js.Any.fromFunction0(enable), on = js.Any.fromFunction2(on))
    __obj.asInstanceOf[ConsoleApi]
  }
  
  @scala.inline
  implicit class ConsoleApiMutableBuilder[Self <: ConsoleApi] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setClearMessages(value: () => js.Promise[Unit]): Self = StObject.set(x, "clearMessages", js.Any.fromFunction0(value))
    
    @scala.inline
    def setDisable(value: () => js.Promise[Unit]): Self = StObject.set(x, "disable", js.Any.fromFunction0(value))
    
    @scala.inline
    def setEnable(value: () => js.Promise[Unit]): Self = StObject.set(x, "enable", js.Any.fromFunction0(value))
    
    @scala.inline
    def setOn(value: (messageAdded, js.Function1[/* params */ MessageAddedEvent, Unit]) => Unit): Self = StObject.set(x, "on", js.Any.fromFunction2(value))
  }
}
