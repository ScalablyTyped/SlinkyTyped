package typingsSlinky.pulumiAws.getEndpointMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetEndpointResult extends js.Object {
  /**
    * The endpoint based on `endpointType`:
    * * No `endpointType`: Either `iot:Data` or `iot:Data-ATS` [depending on region](https://aws.amazon.com/blogs/iot/aws-iot-core-ats-endpoints/)
    * * `iot:CredentialsProvider`: `IDENTIFIER.credentials.iot.REGION.amazonaws.com`
    * * `iot:Data`: `IDENTIFIER.iot.REGION.amazonaws.com`
    * * `iot:Data-ATS`: `IDENTIFIER-ats.iot.REGION.amazonaws.com`
    * * `iot:Job`: `IDENTIFIER.jobs.iot.REGION.amazonaws.com`
    */
  val endpointAddress: String = js.native
  val endpointType: js.UndefOr[String] = js.native
  /**
    * id is the provider-assigned unique ID for this managed resource.
    */
  val id: String = js.native
}

object GetEndpointResult {
  @scala.inline
  def apply(endpointAddress: String, id: String): GetEndpointResult = {
    val __obj = js.Dynamic.literal(endpointAddress = endpointAddress.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetEndpointResult]
  }
  @scala.inline
  implicit class GetEndpointResultOps[Self <: GetEndpointResult] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEndpointAddress(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("endpointAddress")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEndpointType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("endpointType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEndpointType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("endpointType")(js.undefined)
        ret
    }
  }
  
}

