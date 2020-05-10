package typingsSlinky.awsSdk.dataexchangeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait JobError extends js.Object {
  /**
    * The code for the job error.
    */
  var Code: typingsSlinky.awsSdk.dataexchangeMod.Code = js.native
  var Details: js.UndefOr[typingsSlinky.awsSdk.dataexchangeMod.Details] = js.native
  /**
    * The name of the limit that was reached.
    */
  var LimitName: js.UndefOr[JobErrorLimitName] = js.native
  /**
    * The value of the exceeded limit.
    */
  var LimitValue: js.UndefOr[double] = js.native
  /**
    * The message related to the job error.
    */
  var Message: string = js.native
  /**
    * The unqiue identifier for the resource related to the error.
    */
  var ResourceId: js.UndefOr[string] = js.native
  /**
    * The type of resource related to the error.
    */
  var ResourceType: js.UndefOr[JobErrorResourceTypes] = js.native
}

object JobError {
  @scala.inline
  def apply(Code: Code, Message: string): JobError = {
    val __obj = js.Dynamic.literal(Code = Code.asInstanceOf[js.Any], Message = Message.asInstanceOf[js.Any])
    __obj.asInstanceOf[JobError]
  }
  @scala.inline
  implicit class JobErrorOps[Self <: JobError] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCode(value: Code): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Code")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMessage(value: string): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Message")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDetails(value: Details): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Details")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDetails: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Details")(js.undefined)
        ret
    }
    @scala.inline
    def withLimitName(value: JobErrorLimitName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LimitName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLimitName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LimitName")(js.undefined)
        ret
    }
    @scala.inline
    def withLimitValue(value: double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LimitValue")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLimitValue: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LimitValue")(js.undefined)
        ret
    }
    @scala.inline
    def withResourceId(value: string): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ResourceId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutResourceId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ResourceId")(js.undefined)
        ret
    }
    @scala.inline
    def withResourceType(value: JobErrorResourceTypes): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ResourceType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutResourceType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ResourceType")(js.undefined)
        ret
    }
  }
  
}

