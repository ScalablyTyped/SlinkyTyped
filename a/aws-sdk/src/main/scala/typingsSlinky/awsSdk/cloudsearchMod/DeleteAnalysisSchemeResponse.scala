package typingsSlinky.awsSdk.cloudsearchMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteAnalysisSchemeResponse extends js.Object {
  /**
    * The status of the analysis scheme being deleted.
    */
  var AnalysisScheme: AnalysisSchemeStatus = js.native
}

object DeleteAnalysisSchemeResponse {
  @scala.inline
  def apply(AnalysisScheme: AnalysisSchemeStatus): DeleteAnalysisSchemeResponse = {
    val __obj = js.Dynamic.literal(AnalysisScheme = AnalysisScheme.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteAnalysisSchemeResponse]
  }
  @scala.inline
  implicit class DeleteAnalysisSchemeResponseOps[Self <: DeleteAnalysisSchemeResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAnalysisScheme(value: AnalysisSchemeStatus): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AnalysisScheme")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

