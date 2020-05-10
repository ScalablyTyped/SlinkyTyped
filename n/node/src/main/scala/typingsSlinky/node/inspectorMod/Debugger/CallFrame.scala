package typingsSlinky.node.inspectorMod.Debugger

import typingsSlinky.node.inspectorMod.Runtime.RemoteObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * JavaScript call frame. Array of call frames form the call stack.
  */
@js.native
trait CallFrame extends js.Object {
  /**
    * Call frame identifier. This identifier is only valid while the virtual machine is paused.
    */
  var callFrameId: CallFrameId = js.native
  /**
    * Location in the source code.
    */
  var functionLocation: js.UndefOr[Location] = js.native
  /**
    * Name of the JavaScript function called on this call frame.
    */
  var functionName: String = js.native
  /**
    * Location in the source code.
    */
  var location: Location = js.native
  /**
    * The value being returned, if the function is at return point.
    */
  var returnValue: js.UndefOr[RemoteObject] = js.native
  /**
    * Scope chain for this call frame.
    */
  var scopeChain: js.Array[Scope] = js.native
  /**
    * <code>this</code> object for this call frame.
    */
  var `this`: RemoteObject = js.native
  /**
    * JavaScript script name or url.
    */
  var url: String = js.native
}

object CallFrame {
  @scala.inline
  def apply(
    callFrameId: CallFrameId,
    functionName: String,
    location: Location,
    scopeChain: js.Array[Scope],
    `this`: RemoteObject,
    url: String
  ): CallFrame = {
    val __obj = js.Dynamic.literal(callFrameId = callFrameId.asInstanceOf[js.Any], functionName = functionName.asInstanceOf[js.Any], location = location.asInstanceOf[js.Any], scopeChain = scopeChain.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.updateDynamic("this")(`this`.asInstanceOf[js.Any])
    __obj.asInstanceOf[CallFrame]
  }
  @scala.inline
  implicit class CallFrameOps[Self <: CallFrame] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCallFrameId(value: CallFrameId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("callFrameId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFunctionName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("functionName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLocation(value: Location): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("location")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withScopeChain(value: js.Array[Scope]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scopeChain")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withThis(value: RemoteObject): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("this")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUrl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("url")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFunctionLocation(value: Location): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("functionLocation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFunctionLocation: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("functionLocation")(js.undefined)
        ret
    }
    @scala.inline
    def withReturnValue(value: RemoteObject): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("returnValue")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReturnValue: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("returnValue")(js.undefined)
        ret
    }
  }
  
}

