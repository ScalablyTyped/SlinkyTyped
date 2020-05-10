package typingsSlinky.qlikEngineapi.EngineAPI

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * EditorBreakpoint...
  */
@js.native
trait IEditorBreakpoint extends js.Object {
  /**
    * If set to true then the breakpoint is enabled (in use).
    */
  var qEnabled: Boolean = js.native
  /**
    * Name of the breakpoint.
    */
  var qbufferName: String = js.native
  /**
    * Line number in the script where the breakpoint is set.
    */
  var qlineIx: Double = js.native
}

object IEditorBreakpoint {
  @scala.inline
  def apply(qEnabled: Boolean, qbufferName: String, qlineIx: Double): IEditorBreakpoint = {
    val __obj = js.Dynamic.literal(qEnabled = qEnabled.asInstanceOf[js.Any], qbufferName = qbufferName.asInstanceOf[js.Any], qlineIx = qlineIx.asInstanceOf[js.Any])
    __obj.asInstanceOf[IEditorBreakpoint]
  }
  @scala.inline
  implicit class IEditorBreakpointOps[Self <: IEditorBreakpoint] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withQEnabled(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("qEnabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withQbufferName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("qbufferName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withQlineIx(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("qlineIx")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

