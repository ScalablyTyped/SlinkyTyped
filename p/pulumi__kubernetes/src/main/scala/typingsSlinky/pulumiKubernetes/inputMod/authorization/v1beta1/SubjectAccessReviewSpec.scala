package typingsSlinky.pulumiKubernetes.inputMod.authorization.v1beta1

import typingsSlinky.pulumiPulumi.outputMod.Input
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
  var extra: js.UndefOr[Input[js.Object]] = js.native
  /**
    * Groups is the groups you're testing for.
    */
  var group: js.UndefOr[Input[js.Array[Input[String]]]] = js.native
  /**
    * NonResourceAttributes describes information for a non-resource access request
    */
  var nonResourceAttributes: js.UndefOr[Input[NonResourceAttributes]] = js.native
  /**
    * ResourceAuthorizationAttributes describes information for a resource access request
    */
  var resourceAttributes: js.UndefOr[Input[ResourceAttributes]] = js.native
  /**
    * UID information about the requesting user.
    */
  var uid: js.UndefOr[Input[String]] = js.native
  /**
    * User is the user you're testing for. If you specify "User" but not "Group", then is it
    * interpreted as "What if User were not a member of any groups
    */
  var user: js.UndefOr[Input[String]] = js.native
}

object SubjectAccessReviewSpec {
  @scala.inline
  def apply(): SubjectAccessReviewSpec = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SubjectAccessReviewSpec]
  }
  @scala.inline
  implicit class SubjectAccessReviewSpecOps[Self <: SubjectAccessReviewSpec] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withExtra(value: Input[js.Object]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("extra")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExtra: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("extra")(js.undefined)
        ret
    }
    @scala.inline
    def withGroup(value: Input[js.Array[Input[String]]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("group")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGroup: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("group")(js.undefined)
        ret
    }
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
    @scala.inline
    def withUid(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("uid")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUid: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("uid")(js.undefined)
        ret
    }
    @scala.inline
    def withUser(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("user")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUser: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("user")(js.undefined)
        ret
    }
  }
  
}

