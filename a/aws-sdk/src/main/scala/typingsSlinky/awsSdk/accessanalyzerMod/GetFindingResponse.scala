package typingsSlinky.awsSdk.accessanalyzerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetFindingResponse extends js.Object {
  /**
    * A finding object that contains finding details.
    */
  var finding: js.UndefOr[Finding] = js.native
}

object GetFindingResponse {
  @scala.inline
  def apply(): GetFindingResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetFindingResponse]
  }
  @scala.inline
  implicit class GetFindingResponseOps[Self <: GetFindingResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFinding(value: Finding): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("finding")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFinding: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("finding")(js.undefined)
        ret
    }
  }
  
}

