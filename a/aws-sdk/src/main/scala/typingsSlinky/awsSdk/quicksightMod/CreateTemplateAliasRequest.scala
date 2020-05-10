package typingsSlinky.awsSdk.quicksightMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateTemplateAliasRequest extends js.Object {
  /**
    * The name that you want to give to the template alias that you're creating. Don't start the alias name with the $ character. Alias names that start with $ are reserved by QuickSight. 
    */
  var AliasName: typingsSlinky.awsSdk.quicksightMod.AliasName = js.native
  /**
    * The ID of the AWS account that contains the template that you creating an alias for.
    */
  var AwsAccountId: typingsSlinky.awsSdk.quicksightMod.AwsAccountId = js.native
  /**
    * An ID for the template.
    */
  var TemplateId: RestrictiveResourceId = js.native
  /**
    * The version number of the template.
    */
  var TemplateVersionNumber: VersionNumber = js.native
}

object CreateTemplateAliasRequest {
  @scala.inline
  def apply(
    AliasName: AliasName,
    AwsAccountId: AwsAccountId,
    TemplateId: RestrictiveResourceId,
    TemplateVersionNumber: VersionNumber
  ): CreateTemplateAliasRequest = {
    val __obj = js.Dynamic.literal(AliasName = AliasName.asInstanceOf[js.Any], AwsAccountId = AwsAccountId.asInstanceOf[js.Any], TemplateId = TemplateId.asInstanceOf[js.Any], TemplateVersionNumber = TemplateVersionNumber.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateTemplateAliasRequest]
  }
  @scala.inline
  implicit class CreateTemplateAliasRequestOps[Self <: CreateTemplateAliasRequest] (val x: Self) extends AnyVal {
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

