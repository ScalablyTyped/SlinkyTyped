package typingsSlinky.awsSdk.firehoseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FailureDescription extends js.Object {
  /**
    * A message providing details about the error that caused the failure.
    */
  var Details: NonEmptyString = js.native
  /**
    * The type of error that caused the failure.
    */
  var Type: DeliveryStreamFailureType = js.native
}

object FailureDescription {
  @scala.inline
  def apply(Details: NonEmptyString, Type: DeliveryStreamFailureType): FailureDescription = {
    val __obj = js.Dynamic.literal(Details = Details.asInstanceOf[js.Any], Type = Type.asInstanceOf[js.Any])
    __obj.asInstanceOf[FailureDescription]
  }
  @scala.inline
  implicit class FailureDescriptionOps[Self <: FailureDescription] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDetails(value: NonEmptyString): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Details")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withType(value: DeliveryStreamFailureType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Type")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

