package typingsSlinky.awsSdk.quicksightMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateTemplateAliasRequest extends js.Object {
  /**
    * The alias of the template that you want to update. If you name a specific alias, you update the version that the alias points to. You can specify the latest version of the template by providing the keyword $LATEST in the AliasName parameter. The keyword $PUBLISHED doesn't apply to templates.
    */
  var AliasName: typingsSlinky.awsSdk.quicksightMod.AliasName = js.native
  /**
    * The ID of the AWS account that contains the template alias that you're updating.
    */
  var AwsAccountId: typingsSlinky.awsSdk.quicksightMod.AwsAccountId = js.native
  /**
    * The ID for the template.
    */
  var TemplateId: RestrictiveResourceId = js.native
  /**
    * The version number of the template.
    */
  var TemplateVersionNumber: VersionNumber = js.native
}

object UpdateTemplateAliasRequest {
  @scala.inline
  def apply(
    AliasName: AliasName,
    AwsAccountId: AwsAccountId,
    TemplateId: RestrictiveResourceId,
    TemplateVersionNumber: VersionNumber
  ): UpdateTemplateAliasRequest = {
    val __obj = js.Dynamic.literal(AliasName = AliasName.asInstanceOf[js.Any], AwsAccountId = AwsAccountId.asInstanceOf[js.Any], TemplateId = TemplateId.asInstanceOf[js.Any], TemplateVersionNumber = TemplateVersionNumber.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateTemplateAliasRequest]
  }
  @scala.inline
  implicit class UpdateTemplateAliasRequestOps[Self <: UpdateTemplateAliasRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAliasName(value: AliasName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AliasName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAwsAccountId(value: AwsAccountId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AwsAccountId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTemplateId(value: RestrictiveResourceId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TemplateId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTemplateVersionNumber(value: VersionNumber): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TemplateVersionNumber")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

