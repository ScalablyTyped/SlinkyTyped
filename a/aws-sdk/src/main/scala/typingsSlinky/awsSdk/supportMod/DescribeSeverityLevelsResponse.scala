package typingsSlinky.awsSdk.supportMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeSeverityLevelsResponse extends js.Object {
  /**
    * The available severity levels for the support case. Available severity levels are defined by your service level agreement with AWS.
    */
  var severityLevels: js.UndefOr[SeverityLevelsList] = js.native
}

object DescribeSeverityLevelsResponse {
  @scala.inline
  def apply(): DescribeSeverityLevelsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeSeverityLevelsResponse]
  }
  @scala.inline
  implicit class DescribeSeverityLevelsResponseOps[Self <: DescribeSeverityLevelsResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withSeverityLevels(value: SeverityLevelsList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("severityLevels")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSeverityLevels: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("severityLevels")(js.undefined)
        ret
    }
  }
  
}

