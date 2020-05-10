package typingsSlinky.awsSdk.chimeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SearchAvailablePhoneNumbersRequest extends js.Object {
  /**
    * The area code used to filter results.
    */
  var AreaCode: js.UndefOr[String] = js.native
  /**
    * The city used to filter results.
    */
  var City: js.UndefOr[String] = js.native
  /**
    * The country used to filter results.
    */
  var Country: js.UndefOr[String] = js.native
  /**
    * The maximum number of results to return in a single call.
    */
  var MaxResults: js.UndefOr[PhoneNumberMaxResults] = js.native
  /**
    * The token to use to retrieve the next page of results.
    */
  var NextToken: js.UndefOr[String] = js.native
  /**
    * The state used to filter results.
    */
  var State: js.UndefOr[String] = js.native
  /**
    * The toll-free prefix that you use to filter results.
    */
  var TollFreePrefix: js.UndefOr[typingsSlinky.awsSdk.chimeMod.TollFreePrefix] = js.native
}

object SearchAvailablePhoneNumbersRequest {
  @scala.inline
  def apply(): SearchAvailablePhoneNumbersRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SearchAvailablePhoneNumbersRequest]
  }
  @scala.inline
  implicit class SearchAvailablePhoneNumbersRequestOps[Self <: SearchAvailablePhoneNumbersRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAreaCode(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AreaCode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAreaCode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AreaCode")(js.undefined)
        ret
    }
    @scala.inline
    def withCity(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("City")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCity: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("City")(js.undefined)
        ret
    }
    @scala.inline
    def withCountry(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Country")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCountry: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Country")(js.undefined)
        ret
    }
    @scala.inline
    def withMaxResults(value: PhoneNumberMaxResults): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MaxResults")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxResults: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MaxResults")(js.undefined)
        ret
    }
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
    def withState(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("State")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutState: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("State")(js.undefined)
        ret
    }
    @scala.inline
    def withTollFreePrefix(value: TollFreePrefix): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TollFreePrefix")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTollFreePrefix: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TollFreePrefix")(js.undefined)
        ret
    }
  }
  
}

