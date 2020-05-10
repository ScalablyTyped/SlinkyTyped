package typingsSlinky.reactAlert.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AlertCustomOptionsWithType extends AlertCustomOptions {
  var `type`: js.UndefOr[AlertType] = js.native
}

object AlertCustomOptionsWithType {
  @scala.inline
  def apply(): AlertCustomOptionsWithType = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AlertCustomOptionsWithType]
  }
  @scala.inline
  implicit class AlertCustomOptionsWithTypeOps[Self <: AlertCustomOptionsWithType] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withType(value: AlertType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(js.undefined)
        ret
    }
  }
  
}

