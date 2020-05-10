package typingsSlinky.awsSdk.lightsailMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetBlueprintsRequest extends js.Object {
  /**
    * A Boolean value indicating whether to include inactive results in your request.
    */
  var includeInactive: js.UndefOr[Boolean] = js.native
  /**
    * The token to advance to the next page of results from your request. To get a page token, perform an initial GetBlueprints request. If your results are paginated, the response will return a next page token that you can specify as the page token in a subsequent request.
    */
  var pageToken: js.UndefOr[String] = js.native
}

object GetBlueprintsRequest {
  @scala.inline
  def apply(): GetBlueprintsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetBlueprintsRequest]
  }
  @scala.inline
  implicit class GetBlueprintsRequestOps[Self <: GetBlueprintsRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withIncludeInactive(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("includeInactive")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIncludeInactive: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("includeInactive")(js.undefined)
        ret
    }
    @scala.inline
    def withPageToken(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pageToken")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPageToken: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pageToken")(js.undefined)
        ret
    }
  }
  
}

