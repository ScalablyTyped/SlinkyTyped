package typingsSlinky.awsSdk.snsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListPlatformApplicationsResponse extends js.Object {
  /**
    * NextToken string is returned when calling ListPlatformApplications action if additional records are available after the first page results.
    */
  var NextToken: js.UndefOr[String] = js.native
  /**
    * Platform applications returned when calling ListPlatformApplications action.
    */
  var PlatformApplications: js.UndefOr[ListOfPlatformApplications] = js.native
}

object ListPlatformApplicationsResponse {
  @scala.inline
  def apply(): ListPlatformApplicationsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListPlatformApplicationsResponse]
  }
  @scala.inline
  implicit class ListPlatformApplicationsResponseOps[Self <: ListPlatformApplicationsResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withNextToken(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NextToken")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNextToken: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NextToken")(js.undefined)
        ret
    }
    @scala.inline
    def withPlatformApplications(value: ListOfPlatformApplications): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PlatformApplications")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPlatformApplications: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PlatformApplications")(js.undefined)
        ret
    }
  }
  
}

