package typingsSlinky.pulumiKubernetes.outputMod.authorization.v1beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * SubjectAccessReviewSpec is a description of the access request.  Exactly one of
  * ResourceAuthorizationAttributes and NonResourceAuthorizationAttributes must be set
  */
@js.native
trait SubjectAccessReviewSpec extends js.Object {
  /**
    * Extra corresponds to the user.Info.GetExtra() method from the authenticator.  Since that is
    * input to the authorizer it needs a reflection here.
    */
  val extra: js.Object = js.native
  /**
    * Groups is the groups you're testing for.
    */
  val group: js.Array[String] = js.native
  /**
    * NonResourceAttributes describes information for a non-resource access request
    */
  val nonResourceAttributes: NonResourceAttributes = js.native
  /**
    * ResourceAuthorizationAttributes describes information for a resource access request
    */
  val resourceAttributes: ResourceAttributes = js.native
  /**
    * UID information about the requesting user.
    */
  val uid: String = js.native
  /**
    * User is the user you're testing for. If you specify "User" but not "Group", then is it
    * interpreted as "What if User were not a member of any groups
    */
  val user: String = js.native
}

object SubjectAccessReviewSpec {
  @scala.inline
  def apply(
    extra: js.Object,
    group: js.Array[String],
    nonResourceAttributes: NonResourceAttributes,
    resourceAttributes: ResourceAttributes,
    uid: String,
    user: String
  ): SubjectAccessReviewSpec = {
    val __obj = js.Dynamic.literal(extra = extra.asInstanceOf[js.Any], group = group.asInstanceOf[js.Any], nonResourceAttributes = nonResourceAttributes.asInstanceOf[js.Any], resourceAttributes = resourceAttributes.asInstanceOf[js.Any], uid = uid.asInstanceOf[js.Any], user = user.asInstanceOf[js.Any])
    __obj.asInstanceOf[SubjectAccessReviewSpec]
  }
  @scala.inline
  implicit class SubjectAccessReviewSpecOps[Self <: SubjectAccessReviewSpec] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withExtra(value: js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("extra")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGroup(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("group")(value.asInstanceOf[js.Any])
        ret
    }
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
    @scala.inline
    def withUid(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("uid")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUser(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("user")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

