package typingsSlinky.googleapis.alphaMod.computeAlpha

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaSecurityPolicyAssociation extends js.Object {
  /**
    * The resource that the security policy is attached to.
    */
  var attachmentId: js.UndefOr[String] = js.native
  /**
    * The name for an association.
    */
  var name: js.UndefOr[String] = js.native
  /**
    * [Output Only] The security policy ID of the association.
    */
  var securityPolicyId: js.UndefOr[String] = js.native
}

object SchemaSecurityPolicyAssociation {
  @scala.inline
  def apply(): SchemaSecurityPolicyAssociation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaSecurityPolicyAssociation]
  }
  @scala.inline
  implicit class SchemaSecurityPolicyAssociationOps[Self <: SchemaSecurityPolicyAssociation] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAttachmentId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("attachmentId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAttachmentId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("attachmentId")(js.undefined)
        ret
    }
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(js.undefined)
        ret
    }
    @scala.inline
    def withSecurityPolicyId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("securityPolicyId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSecurityPolicyId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("securityPolicyId")(js.undefined)
        ret
    }
  }
  
}

