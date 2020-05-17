package typingsSlinky.jpm.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Script extends js.Object {
  var script: Boolean = js.native
}

object Script {
  @scala.inline
  def apply(script: Boolean): Script = {
    val __obj = js.Dynamic.literal(script = script.asInstanceOf[js.Any])
    __obj.asInstanceOf[Script]
  }
  @scala.inline
  implicit class ScriptOps[Self <: Script] (val x: Self) extends AnyVal {
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
  }
  
}

