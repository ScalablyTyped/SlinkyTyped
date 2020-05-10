package typingsSlinky.awsSdk.guarddutyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AwsApiCallAction extends js.Object {
  /**
    * AWS API name.
    */
  var Api: js.UndefOr[String] = js.native
  /**
    * AWS API caller type.
    */
  var CallerType: js.UndefOr[String] = js.native
  /**
    * Domain information for the AWS API call.
    */
  var DomainDetails: js.UndefOr[typingsSlinky.awsSdk.guarddutyMod.DomainDetails] = js.native
  /**
    * Remote IP information of the connection.
    */
  var RemoteIpDetails: js.UndefOr[typingsSlinky.awsSdk.guarddutyMod.RemoteIpDetails] = js.native
  /**
    * AWS service name whose API was invoked.
    */
  var ServiceName: js.UndefOr[String] = js.native
}

object AwsApiCallAction {
  @scala.inline
  def apply(): AwsApiCallAction = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AwsApiCallAction]
  }
  @scala.inline
  implicit class AwsApiCallActionOps[Self <: AwsApiCallAction] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withApi(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Api")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutApi: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Api")(js.undefined)
        ret
    }
    @scala.inline
    def withCallerType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CallerType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCallerType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CallerType")(js.undefined)
        ret
    }
    @scala.inline
    def withDomainDetails(value: DomainDetails): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DomainDetails")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDomainDetails: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DomainDetails")(js.undefined)
        ret
    }
    @scala.inline
    def withRemoteIpDetails(value: RemoteIpDetails): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RemoteIpDetails")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRemoteIpDetails: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RemoteIpDetails")(js.undefined)
        ret
    }
    @scala.inline
    def withServiceName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ServiceName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutServiceName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ServiceName")(js.undefined)
        ret
    }
  }
  
}

