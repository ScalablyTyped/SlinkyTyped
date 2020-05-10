package typingsSlinky.awsSdk.elasticbeanstalkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListPlatformVersionsRequest extends js.Object {
  /**
    * List only the platforms where the platform member value relates to one of the supplied values.
    */
  var Filters: js.UndefOr[PlatformFilters] = js.native
  /**
    * The maximum number of platform values returned in one call.
    */
  var MaxRecords: js.UndefOr[PlatformMaxRecords] = js.native
  /**
    * The starting index into the remaining list of platforms. Use the NextToken value from a previous ListPlatformVersion call.
    */
  var NextToken: js.UndefOr[Token] = js.native
}

object ListPlatformVersionsRequest {
  @scala.inline
  def apply(): ListPlatformVersionsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListPlatformVersionsRequest]
  }
  @scala.inline
  implicit class ListPlatformVersionsRequestOps[Self <: ListPlatformVersionsRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFilters(value: PlatformFilters): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Filters")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFilters: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Filters")(js.undefined)
        ret
    }
    @scala.inline
    def withMaxRecords(value: PlatformMaxRecords): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MaxRecords")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxRecords: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MaxRecords")(js.undefined)
        ret
    }
    @scala.inline
    def withNextToken(value: Token): Self = {
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
  }
  
}

