package typingsSlinky.awsSdk.accessanalyzerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetAnalyzerRequest extends js.Object {
  /**
    * The name of the analyzer retrieved.
    */
  var analyzerName: Name = js.native
}

object GetAnalyzerRequest {
  @scala.inline
  def apply(analyzerName: Name): GetAnalyzerRequest = {
    val __obj = js.Dynamic.literal(analyzerName = analyzerName.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetAnalyzerRequest]
  }
  @scala.inline
  implicit class GetAnalyzerRequestOps[Self <: GetAnalyzerRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAnalyzerName(value: Name): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("analyzerName")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

