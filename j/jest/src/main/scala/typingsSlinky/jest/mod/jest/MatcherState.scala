package typingsSlinky.jest.mod.jest

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MatcherState extends js.Object {
  var assertionCalls: Double = js.native
  var currentTestName: String = js.native
  var expand: Boolean = js.native
  var expectedAssertionsNumber: Double = js.native
  var isExpectingAssertions: js.UndefOr[Boolean] = js.native
  var suppressedErrors: js.Array[js.Error] = js.native
  var testPath: String = js.native
}

object MatcherState {
  @scala.inline
  def apply(
    assertionCalls: Double,
    currentTestName: String,
    expand: Boolean,
    expectedAssertionsNumber: Double,
    suppressedErrors: js.Array[js.Error],
    testPath: String
  ): MatcherState = {
    val __obj = js.Dynamic.literal(assertionCalls = assertionCalls.asInstanceOf[js.Any], currentTestName = currentTestName.asInstanceOf[js.Any], expand = expand.asInstanceOf[js.Any], expectedAssertionsNumber = expectedAssertionsNumber.asInstanceOf[js.Any], suppressedErrors = suppressedErrors.asInstanceOf[js.Any], testPath = testPath.asInstanceOf[js.Any])
    __obj.asInstanceOf[MatcherState]
  }
  @scala.inline
  implicit class MatcherStateOps[Self <: MatcherState] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAssertionCalls(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("assertionCalls")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCurrentTestName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("currentTestName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withExpand(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("expand")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withExpectedAssertionsNumber(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("expectedAssertionsNumber")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSuppressedErrors(value: js.Array[js.Error]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("suppressedErrors")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTestPath(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("testPath")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsExpectingAssertions(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isExpectingAssertions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsExpectingAssertions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isExpectingAssertions")(js.undefined)
        ret
    }
  }
  
}

