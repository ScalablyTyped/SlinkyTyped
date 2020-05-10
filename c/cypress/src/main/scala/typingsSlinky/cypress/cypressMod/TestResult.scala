package typingsSlinky.cypress.cypressMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Cypress single test result
  */
@js.native
trait TestResult extends js.Object {
  var body: String = js.native
  /**
    * Error message if there is an error
    */
  var error: String | Null = js.native
  var failedFromHookId: hookId | Null = js.native
  /**
    * Error stack string if there is an error
    */
  var stack: String | Null = js.native
  var state: String = js.native
  var testId: typingsSlinky.cypress.cypressMod.testId = js.native
  var timings: js.Any = js.native
  var title: js.Array[String] = js.native
  var videoTimestamp: ms = js.native
  var wallClockDuration: ms = js.native
  var wallClockStartedAt: dateTimeISO = js.native
}

object TestResult {
  @scala.inline
  def apply(
    body: String,
    state: String,
    testId: testId,
    timings: js.Any,
    title: js.Array[String],
    videoTimestamp: ms,
    wallClockDuration: ms,
    wallClockStartedAt: dateTimeISO
  ): TestResult = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any], testId = testId.asInstanceOf[js.Any], timings = timings.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any], videoTimestamp = videoTimestamp.asInstanceOf[js.Any], wallClockDuration = wallClockDuration.asInstanceOf[js.Any], wallClockStartedAt = wallClockStartedAt.asInstanceOf[js.Any])
    __obj.asInstanceOf[TestResult]
  }
  @scala.inline
  implicit class TestResultOps[Self <: TestResult] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBody(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("body")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withState(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("state")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTestId(value: testId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("testId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTimings(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timings")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTitle(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("title")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withVideoTimestamp(value: ms): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("videoTimestamp")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withWallClockDuration(value: ms): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("wallClockDuration")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withWallClockStartedAt(value: dateTimeISO): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("wallClockStartedAt")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withError(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("error")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withErrorNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("error")(null)
        ret
    }
    @scala.inline
    def withFailedFromHookId(value: hookId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("failedFromHookId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFailedFromHookIdNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("failedFromHookId")(null)
        ret
    }
    @scala.inline
    def withStack(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stack")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStackNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stack")(null)
        ret
    }
  }
  
}

