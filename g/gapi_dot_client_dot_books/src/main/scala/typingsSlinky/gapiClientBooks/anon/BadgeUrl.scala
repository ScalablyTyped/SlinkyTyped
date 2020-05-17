package typingsSlinky.gapiClientBooks.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BadgeUrl extends js.Object {
  var badgeUrl: js.UndefOr[String] = js.native
  var categoryId: js.UndefOr[String] = js.native
  var name: js.UndefOr[String] = js.native
}

object BadgeUrl {
  @scala.inline
  def apply(): BadgeUrl = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BadgeUrl]
  }
  @scala.inline
  implicit class BadgeUrlOps[Self <: BadgeUrl] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBadgeUrl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("badgeUrl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBadgeUrl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("badgeUrl")(js.undefined)
        ret
    }
    @scala.inline
    def withCategoryId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("categoryId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCategoryId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("categoryId")(js.undefined)
        ret
    }
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(js.undefined)
        ret
    }
  }
  
}

