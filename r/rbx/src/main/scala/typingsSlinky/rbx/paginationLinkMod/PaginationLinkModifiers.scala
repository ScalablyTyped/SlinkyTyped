package typingsSlinky.rbx.paginationLinkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PaginationLinkModifiers extends js.Object {
  var current: js.UndefOr[Boolean] = js.native
}

object PaginationLinkModifiers {
  @scala.inline
  def apply(): PaginationLinkModifiers = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PaginationLinkModifiers]
  }
  @scala.inline
  implicit class PaginationLinkModifiersOps[Self <: PaginationLinkModifiers] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCurrent(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("current")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCurrent: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("current")(js.undefined)
        ret
    }
  }
  
}

