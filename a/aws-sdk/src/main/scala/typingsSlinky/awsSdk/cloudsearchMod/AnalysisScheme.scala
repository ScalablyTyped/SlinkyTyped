package typingsSlinky.awsSdk.cloudsearchMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnalysisScheme extends js.Object {
  var AnalysisOptions: js.UndefOr[typingsSlinky.awsSdk.cloudsearchMod.AnalysisOptions] = js.native
  var AnalysisSchemeLanguage: typingsSlinky.awsSdk.cloudsearchMod.AnalysisSchemeLanguage = js.native
  var AnalysisSchemeName: StandardName = js.native
}

object AnalysisScheme {
  @scala.inline
  def apply(AnalysisSchemeLanguage: AnalysisSchemeLanguage, AnalysisSchemeName: StandardName): AnalysisScheme = {
    val __obj = js.Dynamic.literal(AnalysisSchemeLanguage = AnalysisSchemeLanguage.asInstanceOf[js.Any], AnalysisSchemeName = AnalysisSchemeName.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnalysisScheme]
  }
  @scala.inline
  implicit class AnalysisSchemeOps[Self <: AnalysisScheme] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAnalysisSchemeLanguage(value: AnalysisSchemeLanguage): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AnalysisSchemeLanguage")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAnalysisSchemeName(value: StandardName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AnalysisSchemeName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAnalysisOptions(value: AnalysisOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AnalysisOptions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAnalysisOptions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AnalysisOptions")(js.undefined)
        ret
    }
  }
  
}

