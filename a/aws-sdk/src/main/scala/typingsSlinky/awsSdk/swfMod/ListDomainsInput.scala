package typingsSlinky.awsSdk.swfMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListDomainsInput extends js.Object {
  /**
    * The maximum number of results that are returned per call. Use nextPageToken to obtain further pages of results. 
    */
  var maximumPageSize: js.UndefOr[PageSize] = js.native
  /**
    * If NextPageToken is returned there are more results available. The value of NextPageToken is a unique pagination token for each page. Make the call again using the returned token to retrieve the next page. Keep all other arguments unchanged. Each pagination token expires after 60 seconds. Using an expired pagination token will return a 400 error: "Specified token has exceeded its maximum lifetime".  The configured maximumPageSize determines how many results can be returned in a single call. 
    */
  var nextPageToken: js.UndefOr[PageToken] = js.native
  /**
    * Specifies the registration status of the domains to list.
    */
  var registrationStatus: RegistrationStatus = js.native
  /**
    * When set to true, returns the results in reverse order. By default, the results are returned in ascending alphabetical order by name of the domains.
    */
  var reverseOrder: js.UndefOr[ReverseOrder] = js.native
}

object ListDomainsInput {
  @scala.inline
  def apply(registrationStatus: RegistrationStatus): ListDomainsInput = {
    val __obj = js.Dynamic.literal(registrationStatus = registrationStatus.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListDomainsInput]
  }
  @scala.inline
  implicit class ListDomainsInputOps[Self <: ListDomainsInput] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withRegistrationStatus(value: RegistrationStatus): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("registrationStatus")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMaximumPageSize(value: PageSize): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maximumPageSize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaximumPageSize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maximumPageSize")(js.undefined)
        ret
    }
    @scala.inline
    def withNextPageToken(value: PageToken): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nextPageToken")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNextPageToken: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nextPageToken")(js.undefined)
        ret
    }
    @scala.inline
    def withReverseOrder(value: ReverseOrder): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reverseOrder")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReverseOrder: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reverseOrder")(js.undefined)
        ret
    }
  }
  
}

