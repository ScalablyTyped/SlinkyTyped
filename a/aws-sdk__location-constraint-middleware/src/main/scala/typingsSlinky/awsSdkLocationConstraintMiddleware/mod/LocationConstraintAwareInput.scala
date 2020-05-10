package typingsSlinky.awsSdkLocationConstraintMiddleware.mod

import typingsSlinky.awsSdkLocationConstraintMiddleware.AnonLocationConstraint
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LocationConstraintAwareInput extends js.Object {
  var CreateBucketConfiguration: js.UndefOr[AnonLocationConstraint] = js.native
}

object LocationConstraintAwareInput {
  @scala.inline
  def apply(): LocationConstraintAwareInput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LocationConstraintAwareInput]
  }
  @scala.inline
  implicit class LocationConstraintAwareInputOps[Self <: LocationConstraintAwareInput] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCreateBucketConfiguration(value: AnonLocationConstraint): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CreateBucketConfiguration")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCreateBucketConfiguration: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CreateBucketConfiguration")(js.undefined)
        ret
    }
  }
  
}

