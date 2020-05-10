package typingsSlinky.googleapis.binaryauthorizationV1beta1Mod.binaryauthorizationV1beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Associates `members` with a `role`.
  */
@js.native
trait SchemaBinding extends js.Object {
  /**
    * The condition that is associated with this binding. NOTE: an unsatisfied
    * condition will not allow user access via current binding. Different
    * bindings, including their conditions, are examined independently.
    */
  var condition: js.UndefOr[SchemaExpr] = js.native
  /**
    * Specifies the identities requesting access for a Cloud Platform resource.
    * `members` can have the following values:  * `allUsers`: A special
    * identifier that represents anyone who is    on the internet; with or
    * without a Google account.  * `allAuthenticatedUsers`: A special
    * identifier that represents anyone    who is authenticated with a Google
    * account or a service account.  * `user:{emailid}`: An email address that
    * represents a specific Google    account. For example, `alice@gmail.com` .
    * * `serviceAccount:{emailid}`: An email address that represents a service
    * account. For example, `my-other-app@appspot.gserviceaccount.com`.  *
    * `group:{emailid}`: An email address that represents a Google group. For
    * example, `admins@example.com`.   * `domain:{domain}`: The G Suite domain
    * (primary) that represents all the    users of that domain. For example,
    * `google.com` or `example.com`.
    */
  var members: js.UndefOr[js.Array[String]] = js.native
  /**
    * Role that is assigned to `members`. For example, `roles/viewer`,
    * `roles/editor`, or `roles/owner`.
    */
  var role: js.UndefOr[String] = js.native
}

object SchemaBinding {
  @scala.inline
  def apply(): SchemaBinding = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaBinding]
  }
  @scala.inline
  implicit class SchemaBindingOps[Self <: SchemaBinding] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCondition(value: SchemaExpr): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("condition")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCondition: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("condition")(js.undefined)
        ret
    }
    @scala.inline
    def withMembers(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("members")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMembers: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("members")(js.undefined)
        ret
    }
    @scala.inline
    def withRole(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("role")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRole: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("role")(js.undefined)
        ret
    }
  }
  
}

