package typingsSlinky.jpm.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ScriptBoolean extends js.Object {
  var script: js.UndefOr[Boolean] = js.native
}

object ScriptBoolean {
  @scala.inline
  def apply(): ScriptBoolean = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ScriptBoolean]
  }
  @scala.inline
  implicit class ScriptBooleanOps[Self <: ScriptBoolean] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withScript(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("script")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutScript: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("script")(js.undefined)
        ret
    }
  }
  
}

