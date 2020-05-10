package typingsSlinky.googleapis.firebaserulesV1Mod.firebaserulesV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The request for FirebaseRulesService.TestRuleset.
  */
@js.native
trait SchemaTestRulesetRequest extends js.Object {
  /**
    * Optional `Source` to be checked for correctness.  This field must not be
    * set when the resource name refers to a `Ruleset`.
    */
  var source: js.UndefOr[SchemaSource] = js.native
  /**
    * Inline `TestSuite` to run.
    */
  var testSuite: js.UndefOr[SchemaTestSuite] = js.native
}

object SchemaTestRulesetRequest {
  @scala.inline
  def apply(): SchemaTestRulesetRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaTestRulesetRequest]
  }
  @scala.inline
  implicit class SchemaTestRulesetRequestOps[Self <: SchemaTestRulesetRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withSource(value: SchemaSource): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("source")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSource: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("source")(js.undefined)
        ret
    }
    @scala.inline
    def withTestSuite(value: SchemaTestSuite): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("testSuite")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTestSuite: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("testSuite")(js.undefined)
        ret
    }
  }
  
}

