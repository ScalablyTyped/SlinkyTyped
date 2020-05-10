package typingsSlinky.branchSdk

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonMakenewlink extends js.Object {
  var make_new_link: js.UndefOr[Boolean] = js.native
}

object AnonMakenewlink {
  @scala.inline
  def apply(): AnonMakenewlink = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnonMakenewlink]
  }
  @scala.inline
  implicit class AnonMakenewlinkOps[Self <: AnonMakenewlink] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withMake_new_link(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("make_new_link")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMake_new_link: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("make_new_link")(js.undefined)
        ret
    }
  }
  
}

