package typingsSlinky.awsSdk.accessanalyzerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteArchiveRuleRequest extends js.Object {
  /**
    * The name of the analyzer that associated with the archive rule to delete.
    */
  var analyzerName: Name = js.native
  /**
    * A client token.
    */
  var clientToken: js.UndefOr[String] = js.native
  /**
    * The name of the rule to delete.
    */
  var ruleName: Name = js.native
}

object DeleteArchiveRuleRequest {
  @scala.inline
  def apply(analyzerName: Name, ruleName: Name): DeleteArchiveRuleRequest = {
    val __obj = js.Dynamic.literal(analyzerName = analyzerName.asInstanceOf[js.Any], ruleName = ruleName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteArchiveRuleRequest]
  }
  @scala.inline
  implicit class DeleteArchiveRuleRequestOps[Self <: DeleteArchiveRuleRequest] (val x: Self) extends AnyVal {
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
    @scala.inline
    def withRuleName(value: Name): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ruleName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withClientToken(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clientToken")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClientToken: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clientToken")(js.undefined)
        ret
    }
  }
  
}

