package typingsSlinky.awsSdk.cloudsearchMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DefineAnalysisSchemeRequest extends js.Object {
  var AnalysisScheme: typingsSlinky.awsSdk.cloudsearchMod.AnalysisScheme = js.native
  var DomainName: typingsSlinky.awsSdk.cloudsearchMod.DomainName = js.native
}

object DefineAnalysisSchemeRequest {
  @scala.inline
  def apply(AnalysisScheme: AnalysisScheme, DomainName: DomainName): DefineAnalysisSchemeRequest = {
    val __obj = js.Dynamic.literal(AnalysisScheme = AnalysisScheme.asInstanceOf[js.Any], DomainName = DomainName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DefineAnalysisSchemeRequest]
  }
  @scala.inline
  implicit class DefineAnalysisSchemeRequestOps[Self <: DefineAnalysisSchemeRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAnalysisScheme(value: AnalysisScheme): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AnalysisScheme")(value.asInstanceOf[js.Any])
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

