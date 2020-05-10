package typingsSlinky.awsSdk.xrayMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetSamplingTargetsRequest extends js.Object {
  /**
    * Information about rules that the service is using to sample requests.
    */
  var SamplingStatisticsDocuments: SamplingStatisticsDocumentList = js.native
}

object GetSamplingTargetsRequest {
  @scala.inline
  def apply(SamplingStatisticsDocuments: SamplingStatisticsDocumentList): GetSamplingTargetsRequest = {
    val __obj = js.Dynamic.literal(SamplingStatisticsDocuments = SamplingStatisticsDocuments.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetSamplingTargetsRequest]
  }
  @scala.inline
  implicit class GetSamplingTargetsRequestOps[Self <: GetSamplingTargetsRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withSamplingStatisticsDocuments(value: SamplingStatisticsDocumentList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SamplingStatisticsDocuments")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

