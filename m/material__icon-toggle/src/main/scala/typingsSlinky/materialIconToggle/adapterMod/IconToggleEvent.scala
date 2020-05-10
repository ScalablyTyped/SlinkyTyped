package typingsSlinky.materialIconToggle.adapterMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IconToggleEvent extends js.Object {
  var isOn: Boolean = js.native
}

object IconToggleEvent {
  @scala.inline
  def apply(isOn: Boolean): IconToggleEvent = {
    val __obj = js.Dynamic.literal(isOn = isOn.asInstanceOf[js.Any])
    __obj.asInstanceOf[IconToggleEvent]
  }
  @scala.inline
  implicit class IconToggleEventOps[Self <: IconToggleEvent] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withIsOn(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isOn")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

