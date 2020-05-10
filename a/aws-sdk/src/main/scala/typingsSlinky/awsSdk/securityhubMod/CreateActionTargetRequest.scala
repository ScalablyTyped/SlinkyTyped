package typingsSlinky.awsSdk.securityhubMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateActionTargetRequest extends js.Object {
  /**
    * The description for the custom action target.
    */
  var Description: NonEmptyString = js.native
  /**
    * The ID for the custom action target.
    */
  var Id: NonEmptyString = js.native
  /**
    * The name of the custom action target.
    */
  var Name: NonEmptyString = js.native
}

object CreateActionTargetRequest {
  @scala.inline
  def apply(Description: NonEmptyString, Id: NonEmptyString, Name: NonEmptyString): CreateActionTargetRequest = {
    val __obj = js.Dynamic.literal(Description = Description.asInstanceOf[js.Any], Id = Id.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateActionTargetRequest]
  }
  @scala.inline
  implicit class CreateActionTargetRequestOps[Self <: CreateActionTargetRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDescription(value: NonEmptyString): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Description")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withId(value: NonEmptyString): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withName(value: NonEmptyString): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Name")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

