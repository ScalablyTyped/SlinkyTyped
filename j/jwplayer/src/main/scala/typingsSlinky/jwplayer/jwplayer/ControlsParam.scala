package typingsSlinky.jwplayer.jwplayer

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ControlsParam extends js.Object {
  var controls: Boolean = js.native
}

object ControlsParam {
  @scala.inline
  def apply(controls: Boolean): ControlsParam = {
    val __obj = js.Dynamic.literal(controls = controls.asInstanceOf[js.Any])
    __obj.asInstanceOf[ControlsParam]
  }
  @scala.inline
  implicit class ControlsParamOps[Self <: ControlsParam] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withControls(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("controls")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

