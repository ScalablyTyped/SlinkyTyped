package typingsSlinky.googleapis.firebaserulesV1Mod.firebaserulesV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * `TestSuite` is a collection of `TestCase` instances that validate the
  * logical correctness of a `Ruleset`. The `TestSuite` may be referenced
  * in-line within a `TestRuleset` invocation or as part of a `Release` object
  * as a pre-release check.
  */
@js.native
trait SchemaTestSuite extends js.Object {
  /**
    * Collection of test cases associated with the `TestSuite`.
    */
  var testCases: js.UndefOr[js.Array[SchemaTestCase]] = js.native
}

object SchemaTestSuite {
  @scala.inline
  def apply(): SchemaTestSuite = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaTestSuite]
  }
  @scala.inline
  implicit class SchemaTestSuiteOps[Self <: SchemaTestSuite] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withTestCases(value: js.Array[SchemaTestCase]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("testCases")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTestCases: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("testCases")(js.undefined)
        ret
    }
  }
  
}

