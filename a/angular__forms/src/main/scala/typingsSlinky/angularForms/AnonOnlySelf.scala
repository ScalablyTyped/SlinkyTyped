package typingsSlinky.angularForms

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonOnlySelf extends js.Object {
  var onlySelf: js.UndefOr[Boolean] = js.native
}

object AnonOnlySelf {
  @scala.inline
  def apply(): AnonOnlySelf = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnonOnlySelf]
  }
  @scala.inline
  implicit class AnonOnlySelfOps[Self <: AnonOnlySelf] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withOnlySelf(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onlySelf")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOnlySelf: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onlySelf")(js.undefined)
        ret
    }
  }
  
}

