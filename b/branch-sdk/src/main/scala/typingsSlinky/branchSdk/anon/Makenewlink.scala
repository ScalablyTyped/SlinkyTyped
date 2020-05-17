package typingsSlinky.branchSdk.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Makenewlink extends js.Object {
  var make_new_link: js.UndefOr[Boolean] = js.native
}

object Makenewlink {
  @scala.inline
  def apply(): Makenewlink = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Makenewlink]
  }
  @scala.inline
  implicit class MakenewlinkOps[Self <: Makenewlink] (val x: Self) extends AnyVal {
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

