package typingsSlinky.awsSdk.securityhubMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AwsIamAccessKeyDetails extends js.Object {
  /**
    * The creation date/time of the IAM access key related to a finding.
    */
  var CreatedAt: js.UndefOr[NonEmptyString] = js.native
  /**
    * The ID of the principal associated with an access key.
    */
  var PrincipalId: js.UndefOr[NonEmptyString] = js.native
  /**
    * The name of the principal.
    */
  var PrincipalName: js.UndefOr[NonEmptyString] = js.native
  /**
    * The type of principal associated with an access key.
    */
  var PrincipalType: js.UndefOr[NonEmptyString] = js.native
  /**
    * The status of the IAM access key related to a finding.
    */
  var Status: js.UndefOr[AwsIamAccessKeyStatus] = js.native
  /**
    * The user associated with the IAM access key related to a finding. The UserName parameter has been replaced with the PrincipalName parameter because access keys can also be assigned to principals that are not IAM users.
    */
  var UserName: js.UndefOr[NonEmptyString] = js.native
}

object AwsIamAccessKeyDetails {
  @scala.inline
  def apply(): AwsIamAccessKeyDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AwsIamAccessKeyDetails]
  }
  @scala.inline
  implicit class AwsIamAccessKeyDetailsOps[Self <: AwsIamAccessKeyDetails] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCreatedAt(value: NonEmptyString): Self = {
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
    def withPrincipalId(value: NonEmptyString): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PrincipalId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPrincipalId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PrincipalId")(js.undefined)
        ret
    }
    @scala.inline
    def withPrincipalName(value: NonEmptyString): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PrincipalName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPrincipalName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PrincipalName")(js.undefined)
        ret
    }
    @scala.inline
    def withPrincipalType(value: NonEmptyString): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PrincipalType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPrincipalType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PrincipalType")(js.undefined)
        ret
    }
    @scala.inline
    def withStatus(value: AwsIamAccessKeyStatus): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Status")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStatus: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Status")(js.undefined)
        ret
    }
    @scala.inline
    def withUserName(value: NonEmptyString): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("UserName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUserName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("UserName")(js.undefined)
        ret
    }
  }
  
}

