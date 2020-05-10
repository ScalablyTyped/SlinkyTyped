package typingsSlinky.awsSdk.acmpcaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Permission extends js.Object {
  /**
    * The private CA actions that can be performed by the designated AWS service.
    */
  var Actions: js.UndefOr[ActionList] = js.native
  /**
    * The Amazon Resource Number (ARN) of the private CA from which the permission was issued.
    */
  var CertificateAuthorityArn: js.UndefOr[Arn] = js.native
  /**
    * The time at which the permission was created.
    */
  var CreatedAt: js.UndefOr[js.Date] = js.native
  /**
    * The name of the policy that is associated with the permission.
    */
  var Policy: js.UndefOr[String] = js.native
  /**
    * The AWS service or entity that holds the permission. At this time, the only valid principal is acm.amazonaws.com.
    */
  var Principal: js.UndefOr[String] = js.native
  /**
    * The ID of the account that assigned the permission.
    */
  var SourceAccount: js.UndefOr[String] = js.native
}

object Permission {
  @scala.inline
  def apply(): Permission = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Permission]
  }
  @scala.inline
  implicit class PermissionOps[Self <: Permission] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withActions(value: ActionList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Actions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutActions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Actions")(js.undefined)
        ret
    }
    @scala.inline
    def withCertificateAuthorityArn(value: Arn): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CertificateAuthorityArn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCertificateAuthorityArn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CertificateAuthorityArn")(js.undefined)
        ret
    }
    @scala.inline
    def withCreatedAt(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CreatedAt")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCreatedAt: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CreatedAt")(js.undefined)
        ret
    }
    @scala.inline
    def withPolicy(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Policy")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPolicy: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Policy")(js.undefined)
        ret
    }
    @scala.inline
    def withPrincipal(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Principal")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPrincipal: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Principal")(js.undefined)
        ret
    }
    @scala.inline
    def withSourceAccount(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SourceAccount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSourceAccount: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SourceAccount")(js.undefined)
        ret
    }
  }
  
}

