package typingsSlinky.htmlWebpackTemplate.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GoogleAnalyticsOptions extends js.Object {
  /** Log a pageview event after the analytics code loads. */
  var pageViewOnLoad: js.UndefOr[Boolean] = js.native
  var trackingId: String = js.native
}

object GoogleAnalyticsOptions {
  @scala.inline
  def apply(trackingId: String): GoogleAnalyticsOptions = {
    val __obj = js.Dynamic.literal(trackingId = trackingId.asInstanceOf[js.Any])
    __obj.asInstanceOf[GoogleAnalyticsOptions]
  }
  @scala.inline
  implicit class GoogleAnalyticsOptionsOps[Self <: GoogleAnalyticsOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withTrackingId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("trackingId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPageViewOnLoad(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pageViewOnLoad")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPageViewOnLoad: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pageViewOnLoad")(js.undefined)
        ret
    }
  }
  
}

