package typingsSlinky.pulumiKubernetes.inputMod.authorization.v1beta1

import typingsSlinky.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * SelfSubjectAccessReviewSpec is a description of the access request.  Exactly one of
  * ResourceAuthorizationAttributes and NonResourceAuthorizationAttributes must be set
  */
@js.native
trait SelfSubjectAccessReviewSpec extends js.Object {
  /**
    * NonResourceAttributes describes information for a non-resource access request
    */
  var nonResourceAttributes: js.UndefOr[Input[NonResourceAttributes]] = js.native
  /**
    * ResourceAuthorizationAttributes describes information for a resource access request
    */
  var resourceAttributes: js.UndefOr[Input[ResourceAttributes]] = js.native
}

object SelfSubjectAccessReviewSpec {
  @scala.inline
  def apply(): SelfSubjectAccessReviewSpec = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SelfSubjectAccessReviewSpec]
  }
  @scala.inline
  implicit class SelfSubjectAccessReviewSpecOps[Self <: SelfSubjectAccessReviewSpec] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withNonResourceAttributes(value: Input[NonResourceAttributes]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nonResourceAttributes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNonResourceAttributes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nonResourceAttributes")(js.undefined)
        ret
    }
    @scala.inline
    def withResourceAttributes(value: Input[ResourceAttributes]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resourceAttributes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutResourceAttributes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resourceAttributes")(js.undefined)
        ret
    }
  }
  
}

