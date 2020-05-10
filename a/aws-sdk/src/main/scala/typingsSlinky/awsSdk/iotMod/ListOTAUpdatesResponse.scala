package typingsSlinky.awsSdk.iotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListOTAUpdatesResponse extends js.Object {
  /**
    * A token to use to get the next set of results.
    */
  var nextToken: js.UndefOr[NextToken] = js.native
  /**
    * A list of OTA update jobs.
    */
  var otaUpdates: js.UndefOr[OTAUpdatesSummary] = js.native
}

object ListOTAUpdatesResponse {
  @scala.inline
  def apply(): ListOTAUpdatesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListOTAUpdatesResponse]
  }
  @scala.inline
  implicit class ListOTAUpdatesResponseOps[Self <: ListOTAUpdatesResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withNextToken(value: NextToken): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nextToken")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNextToken: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nextToken")(js.undefined)
        ret
    }
    @scala.inline
    def withOtaUpdates(value: OTAUpdatesSummary): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("otaUpdates")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOtaUpdates: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("otaUpdates")(js.undefined)
        ret
    }
  }
  
}

