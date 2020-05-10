package typingsSlinky.pulumiPulumi.dynamicMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CheckResult extends js.Object {
  /**
    * Any validation failures that occurred.
    */
  val failures: js.UndefOr[js.Array[CheckFailure]] = js.native
  /**
    * The inputs to use, if any.
    */
  val inputs: js.UndefOr[js.Any] = js.native
}

object CheckResult {
  @scala.inline
  def apply(): CheckResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CheckResult]
  }
  @scala.inline
  implicit class CheckResultOps[Self <: CheckResult] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFailures(value: js.Array[CheckFailure]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("failures")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFailures: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("failures")(js.undefined)
        ret
    }
    @scala.inline
    def withInputs(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inputs")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInputs: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inputs")(js.undefined)
        ret
    }
  }
  
}

