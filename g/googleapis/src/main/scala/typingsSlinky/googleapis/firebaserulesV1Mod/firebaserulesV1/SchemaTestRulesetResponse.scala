package typingsSlinky.googleapis.firebaserulesV1Mod.firebaserulesV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The response for FirebaseRulesService.TestRuleset.
  */
@js.native
trait SchemaTestRulesetResponse extends js.Object {
  /**
    * Syntactic and semantic `Source` issues of varying severity. Issues of
    * `ERROR` severity will prevent tests from executing.
    */
  var issues: js.UndefOr[js.Array[SchemaIssue]] = js.native
  /**
    * The set of test results given the test cases in the `TestSuite`. The
    * results will appear in the same order as the test cases appear in the
    * `TestSuite`.
    */
  var testResults: js.UndefOr[js.Array[SchemaTestResult]] = js.native
}

object SchemaTestRulesetResponse {
  @scala.inline
  def apply(): SchemaTestRulesetResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaTestRulesetResponse]
  }
  @scala.inline
  implicit class SchemaTestRulesetResponseOps[Self <: SchemaTestRulesetResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withIssues(value: js.Array[SchemaIssue]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("issues")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIssues: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("issues")(js.undefined)
        ret
    }
    @scala.inline
    def withTestResults(value: js.Array[SchemaTestResult]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("testResults")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTestResults: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("testResults")(js.undefined)
        ret
    }
  }
  
}

