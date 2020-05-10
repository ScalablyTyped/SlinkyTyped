package typingsSlinky.pulumiKubernetes.inputMod.meta.v1

import typingsSlinky.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * StatusCause provides more information about an api.Status failure, including cases when
  * multiple errors are encountered.
  */
@js.native
trait StatusCause extends js.Object {
  /**
    * The field of the resource that has caused this error, as named by its JSON serialization.
    * May include dot and postfix notation for nested attributes. Arrays are zero-indexed.
    * Fields may appear more than once in an array of causes due to fields having multiple
    * errors. Optional.
    *
    * Examples:
    *   "name" - the field "name" on the current resource
    *   "items[0].name" - the field "name" on the first array entry in "items"
    */
  var field: js.UndefOr[Input[String]] = js.native
  /**
    * A human-readable description of the cause of the error.  This field may be presented as-is
    * to a reader.
    */
  var message: js.UndefOr[Input[String]] = js.native
  /**
    * A machine-readable description of the cause of the error. If this value is empty there is
    * no information available.
    */
  var reason: js.UndefOr[Input[String]] = js.native
}

object StatusCause {
  @scala.inline
  def apply(): StatusCause = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StatusCause]
  }
  @scala.inline
  implicit class StatusCauseOps[Self <: StatusCause] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withField(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("field")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutField: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("field")(js.undefined)
        ret
    }
    @scala.inline
    def withMessage(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("message")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMessage: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("message")(js.undefined)
        ret
    }
    @scala.inline
    def withReason(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reason")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReason: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reason")(js.undefined)
        ret
    }
  }
  
}

