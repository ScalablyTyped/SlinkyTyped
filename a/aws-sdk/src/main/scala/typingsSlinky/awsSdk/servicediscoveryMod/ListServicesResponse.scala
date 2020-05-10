package typingsSlinky.awsSdk.servicediscoveryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListServicesResponse extends js.Object {
  /**
    * If the response contains NextToken, submit another ListServices request to get the next group of results. Specify the value of NextToken from the previous response in the next request.  AWS Cloud Map gets MaxResults services and then filters them based on the specified criteria. It's possible that no services in the first MaxResults services matched the specified criteria but that subsequent groups of MaxResults services do contain services that match the criteria. 
    */
  var NextToken: js.UndefOr[typingsSlinky.awsSdk.servicediscoveryMod.NextToken] = js.native
  /**
    * An array that contains one ServiceSummary object for each service that matches the specified filter criteria.
    */
  var Services: js.UndefOr[ServiceSummariesList] = js.native
}

object ListServicesResponse {
  @scala.inline
  def apply(): ListServicesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListServicesResponse]
  }
  @scala.inline
  implicit class ListServicesResponseOps[Self <: ListServicesResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withNextToken(value: NextToken): Self = {
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
    def withServices(value: ServiceSummariesList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Services")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutServices: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Services")(js.undefined)
        ret
    }
  }
  
}

