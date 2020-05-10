package typingsSlinky.angularForms

import typingsSlinky.angularForms.mod.FormHooks
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonUpdateOn extends js.Object {
  var updateOn: js.UndefOr[FormHooks] = js.native
}

object AnonUpdateOn {
  @scala.inline
  def apply(): AnonUpdateOn = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnonUpdateOn]
  }
  @scala.inline
  implicit class AnonUpdateOnOps[Self <: AnonUpdateOn] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withUpdateOn(value: FormHooks): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("updateOn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUpdateOn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("updateOn")(js.undefined)
        ret
    }
  }
  
}

