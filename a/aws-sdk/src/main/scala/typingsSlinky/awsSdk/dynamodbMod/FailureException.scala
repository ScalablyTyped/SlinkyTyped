package typingsSlinky.awsSdk.dynamodbMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FailureException extends js.Object {
  /**
    * Description of the failure.
    */
  var ExceptionDescription: js.UndefOr[typingsSlinky.awsSdk.dynamodbMod.ExceptionDescription] = js.native
  /**
    * Exception name.
    */
  var ExceptionName: js.UndefOr[typingsSlinky.awsSdk.dynamodbMod.ExceptionName] = js.native
}

object FailureException {
  @scala.inline
  def apply(): FailureException = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FailureException]
  }
  @scala.inline
  implicit class FailureExceptionOps[Self <: FailureException] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withExceptionDescription(value: ExceptionDescription): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ExceptionDescription")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExceptionDescription: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ExceptionDescription")(js.undefined)
        ret
    }
    @scala.inline
    def withExceptionName(value: ExceptionName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ExceptionName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExceptionName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ExceptionName")(js.undefined)
        ret
    }
  }
  
}

