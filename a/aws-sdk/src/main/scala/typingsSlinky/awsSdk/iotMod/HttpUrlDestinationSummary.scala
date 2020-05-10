package typingsSlinky.awsSdk.iotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait HttpUrlDestinationSummary extends js.Object {
  /**
    * The URL used to confirm ownership of or access to the HTTP topic rule destination URL.
    */
  var confirmationUrl: js.UndefOr[Url] = js.native
}

object HttpUrlDestinationSummary {
  @scala.inline
  def apply(): HttpUrlDestinationSummary = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[HttpUrlDestinationSummary]
  }
  @scala.inline
  implicit class HttpUrlDestinationSummaryOps[Self <: HttpUrlDestinationSummary] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withConfirmationUrl(value: Url): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("confirmationUrl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutConfirmationUrl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("confirmationUrl")(js.undefined)
        ret
    }
  }
  
}

