package typingsSlinky.puppeteer.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DirectNavigationOptions extends NavigationOptions {
  /**
    * Referer header value.
    * If provided it will take preference over the referer header value set by
    * [page.setExtraHTTPHeaders()](#pagesetextrahttpheadersheaders).
    */
  var referer: js.UndefOr[String] = js.native
}

object DirectNavigationOptions {
  @scala.inline
  def apply(): DirectNavigationOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DirectNavigationOptions]
  }
  @scala.inline
  implicit class DirectNavigationOptionsOps[Self <: DirectNavigationOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withReferer(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("referer")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReferer: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("referer")(js.undefined)
        ret
    }
  }
  
}

