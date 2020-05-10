package typingsSlinky.awsSdk.cloudwatchMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PartialFailure extends js.Object {
  /**
    * The type of error.
    */
  var ExceptionType: js.UndefOr[typingsSlinky.awsSdk.cloudwatchMod.ExceptionType] = js.native
  /**
    * The code of the error.
    */
  var FailureCode: js.UndefOr[typingsSlinky.awsSdk.cloudwatchMod.FailureCode] = js.native
  /**
    * A description of the error.
    */
  var FailureDescription: js.UndefOr[typingsSlinky.awsSdk.cloudwatchMod.FailureDescription] = js.native
  /**
    * The specified rule that could not be deleted.
    */
  var FailureResource: js.UndefOr[typingsSlinky.awsSdk.cloudwatchMod.FailureResource] = js.native
}

object PartialFailure {
  @scala.inline
  def apply(): PartialFailure = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialFailure]
  }
  @scala.inline
  implicit class PartialFailureOps[Self <: PartialFailure] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withExceptionType(value: ExceptionType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ExceptionType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExceptionType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ExceptionType")(js.undefined)
        ret
    }
    @scala.inline
    def withFailureCode(value: FailureCode): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("FailureCode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFailureCode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("FailureCode")(js.undefined)
        ret
    }
    @scala.inline
    def withFailureDescription(value: FailureDescription): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("FailureDescription")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFailureDescription: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("FailureDescription")(js.undefined)
        ret
    }
    @scala.inline
    def withFailureResource(value: FailureResource): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("FailureResource")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFailureResource: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("FailureResource")(js.undefined)
        ret
    }
  }
  
}

