package typingsSlinky.gapiClientFirebaserules.gapi.client.firebaserules

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TestResult extends js.Object {
  /**
    * Debug messages related to test execution issues encountered during
    * evaluation.
    *
    * Debug messages may be related to too many or too few invocations of
    * function mocks or to runtime errors that occur during evaluation.
    *
    * For example: ```Unable to read variable [name: "resource"]```
    */
  var debugMessages: js.UndefOr[js.Array[String]] = js.native
  /**
    * Position in the `Source` or `Ruleset` where the principle runtime error
    * occurs.
    *
    * Evaluation of an expression may result in an error. Rules are deny by
    * default, so a `DENY` expectation when an error is generated is valid.
    * When there is a `DENY` with an error, the `SourcePosition` is returned.
    *
    * E.g. `error_position { line: 19 column: 37 }`
    */
  var errorPosition: js.UndefOr[SourcePosition] = js.native
  /**
    * The set of function calls made to service-defined methods.
    *
    * Function calls are included in the order in which they are encountered
    * during evaluation, are provided for both mocked and unmocked functions,
    * and included on the response regardless of the test `state`.
    */
  var functionCalls: js.UndefOr[js.Array[FunctionCall]] = js.native
  /** State of the test. */
  var state: js.UndefOr[String] = js.native
}

object TestResult {
  @scala.inline
  def apply(): TestResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TestResult]
  }
  @scala.inline
  implicit class TestResultOps[Self <: TestResult] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDebugMessages(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("debugMessages")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDebugMessages: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("debugMessages")(js.undefined)
        ret
    }
    @scala.inline
    def withErrorPosition(value: SourcePosition): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("errorPosition")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutErrorPosition: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("errorPosition")(js.undefined)
        ret
    }
    @scala.inline
    def withFunctionCalls(value: js.Array[FunctionCall]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("functionCalls")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFunctionCalls: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("functionCalls")(js.undefined)
        ret
    }
    @scala.inline
    def withState(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("state")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutState: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("state")(js.undefined)
        ret
    }
  }
  
}

