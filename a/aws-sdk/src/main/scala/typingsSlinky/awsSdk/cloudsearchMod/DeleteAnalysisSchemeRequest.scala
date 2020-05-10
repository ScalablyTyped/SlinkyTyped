package typingsSlinky.awsSdk.cloudsearchMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteAnalysisSchemeRequest extends js.Object {
  /**
    * The name of the analysis scheme you want to delete.
    */
  var AnalysisSchemeName: StandardName = js.native
  var DomainName: typingsSlinky.awsSdk.cloudsearchMod.DomainName = js.native
}

object DeleteAnalysisSchemeRequest {
  @scala.inline
  def apply(AnalysisSchemeName: StandardName, DomainName: DomainName): DeleteAnalysisSchemeRequest = {
    val __obj = js.Dynamic.literal(AnalysisSchemeName = AnalysisSchemeName.asInstanceOf[js.Any], DomainName = DomainName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteAnalysisSchemeRequest]
  }
  @scala.inline
  implicit class DeleteAnalysisSchemeRequestOps[Self <: DeleteAnalysisSchemeRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAnalysisSchemeName(value: StandardName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AnalysisSchemeName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDomainName(value: DomainName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DomainName")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

