package typingsSlinky.pulumiKubernetes.outputMod.authorization.v1

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
  val nonResourceAttributes: NonResourceAttributes = js.native
  /**
    * ResourceAuthorizationAttributes describes information for a resource access request
    */
  val resourceAttributes: ResourceAttributes = js.native
}

object SelfSubjectAccessReviewSpec {
  @scala.inline
  def apply(nonResourceAttributes: NonResourceAttributes, resourceAttributes: ResourceAttributes): SelfSubjectAccessReviewSpec = {
    val __obj = js.Dynamic.literal(nonResourceAttributes = nonResourceAttributes.asInstanceOf[js.Any], resourceAttributes = resourceAttributes.asInstanceOf[js.Any])
    __obj.asInstanceOf[SelfSubjectAccessReviewSpec]
  }
  @scala.inline
  implicit class SelfSubjectAccessReviewSpecOps[Self <: SelfSubjectAccessReviewSpec] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withNonResourceAttributes(value: NonResourceAttributes): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nonResourceAttributes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withResourceAttributes(value: ResourceAttributes): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resourceAttributes")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

