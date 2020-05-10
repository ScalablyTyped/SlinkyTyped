package typingsSlinky.awsSdk.accessanalyzerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetAnalyzedResourceRequest extends js.Object {
  /**
    * The ARN of the analyzer to retrieve information from.
    */
  var analyzerArn: AnalyzerArn = js.native
  /**
    * The ARN of the resource to retrieve information about.
    */
  var resourceArn: ResourceArn = js.native
}

object GetAnalyzedResourceRequest {
  @scala.inline
  def apply(analyzerArn: AnalyzerArn, resourceArn: ResourceArn): GetAnalyzedResourceRequest = {
    val __obj = js.Dynamic.literal(analyzerArn = analyzerArn.asInstanceOf[js.Any], resourceArn = resourceArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetAnalyzedResourceRequest]
  }
  @scala.inline
  implicit class GetAnalyzedResourceRequestOps[Self <: GetAnalyzedResourceRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAnalyzerArn(value: AnalyzerArn): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("analyzerArn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withResourceArn(value: ResourceArn): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resourceArn")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

