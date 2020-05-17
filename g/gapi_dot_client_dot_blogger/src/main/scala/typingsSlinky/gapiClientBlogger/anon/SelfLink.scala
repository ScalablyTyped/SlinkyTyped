package typingsSlinky.gapiClientBlogger.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SelfLink extends js.Object {
  /** The URL of the container for pages in this blog. */
  var selfLink: js.UndefOr[String] = js.native
  /** The count of pages in this blog. */
  var totalItems: js.UndefOr[Double] = js.native
}

object SelfLink {
  @scala.inline
  def apply(): SelfLink = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SelfLink]
  }
  @scala.inline
  implicit class SelfLinkOps[Self <: SelfLink] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withSelfLink(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selfLink")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSelfLink: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selfLink")(js.undefined)
        ret
    }
    @scala.inline
    def withTotalItems(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("totalItems")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTotalItems: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("totalItems")(js.undefined)
        ret
    }
  }
  
}

