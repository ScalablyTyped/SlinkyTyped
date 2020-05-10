package typingsSlinky.awsSdk.serverlessapplicationrepositoryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetCloudFormationTemplateResponse extends js.Object {
  /**
    * The application Amazon Resource Name (ARN).
    */
  var ApplicationId: js.UndefOr[string] = js.native
  /**
    * The date and time this resource was created.
    */
  var CreationTime: js.UndefOr[string] = js.native
  /**
    * The date and time this template expires. Templates
    expire 1 hour after creation.
    */
  var ExpirationTime: js.UndefOr[string] = js.native
  /**
    * The semantic version of the application:
    https://semver.org/
    
    */
  var SemanticVersion: js.UndefOr[string] = js.native
  /**
    * Status of the template creation workflow.Possible values: PREPARING | ACTIVE | EXPIRED
    
    */
  var Status: js.UndefOr[typingsSlinky.awsSdk.serverlessapplicationrepositoryMod.Status] = js.native
  /**
    * The UUID returned by CreateCloudFormationTemplate.Pattern: [0-9a-fA-F]{8}\-[0-9a-fA-F]{4}\-[0-9a-fA-F]{4}\-[0-9a-fA-F]{4}\-[0-9a-fA-F]{12}
    */
  var TemplateId: js.UndefOr[string] = js.native
  /**
    * A link to the template that can be used to deploy the application using
    AWS CloudFormation.
    */
  var TemplateUrl: js.UndefOr[string] = js.native
}

object GetCloudFormationTemplateResponse {
  @scala.inline
  def apply(): GetCloudFormationTemplateResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetCloudFormationTemplateResponse]
  }
  @scala.inline
  implicit class GetCloudFormationTemplateResponseOps[Self <: GetCloudFormationTemplateResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withApplicationId(value: string): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ApplicationId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutApplicationId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ApplicationId")(js.undefined)
        ret
    }
    @scala.inline
    def withCreationTime(value: string): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CreationTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCreationTime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CreationTime")(js.undefined)
        ret
    }
    @scala.inline
    def withExpirationTime(value: string): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ExpirationTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExpirationTime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ExpirationTime")(js.undefined)
        ret
    }
    @scala.inline
    def withSemanticVersion(value: string): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SemanticVersion")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSemanticVersion: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SemanticVersion")(js.undefined)
        ret
    }
    @scala.inline
    def withStatus(value: Status): Self = {
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
    def withTemplateId(value: string): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TemplateId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTemplateId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TemplateId")(js.undefined)
        ret
    }
    @scala.inline
    def withTemplateUrl(value: string): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TemplateUrl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTemplateUrl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TemplateUrl")(js.undefined)
        ret
    }
  }
  
}

