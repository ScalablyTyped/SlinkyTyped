package typingsSlinky.gapiClientSearchconsole.gapi.client.searchconsole

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RunMobileFriendlyTestRequest extends js.Object {
  /** Whether or not screenshot is requested. Default is false. */
  var requestScreenshot: js.UndefOr[Boolean] = js.native
  /** URL for inspection. */
  var url: js.UndefOr[String] = js.native
}

object RunMobileFriendlyTestRequest {
  @scala.inline
  def apply(): RunMobileFriendlyTestRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RunMobileFriendlyTestRequest]
  }
  @scala.inline
  implicit class RunMobileFriendlyTestRequestOps[Self <: RunMobileFriendlyTestRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withRequestScreenshot(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("requestScreenshot")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRequestScreenshot: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("requestScreenshot")(js.undefined)
        ret
    }
    @scala.inline
    def withUrl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("url")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUrl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("url")(js.undefined)
        ret
    }
  }
  
}

