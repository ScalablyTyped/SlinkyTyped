package typingsSlinky.awsSdk.accessanalyzerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetArchiveRuleResponse extends js.Object {
  var archiveRule: ArchiveRuleSummary = js.native
}

object GetArchiveRuleResponse {
  @scala.inline
  def apply(archiveRule: ArchiveRuleSummary): GetArchiveRuleResponse = {
    val __obj = js.Dynamic.literal(archiveRule = archiveRule.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetArchiveRuleResponse]
  }
  @scala.inline
  implicit class GetArchiveRuleResponseOps[Self <: GetArchiveRuleResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withArchiveRule(value: ArchiveRuleSummary): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("archiveRule")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

