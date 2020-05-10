package typingsSlinky.awsSdk.amplifyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateAppRequest extends js.Object {
  /**
    *  Personal Access token for 3rd party source control system for an Amplify App, used to create webhook and read-only deploy key. Token is not stored. 
    */
  var accessToken: js.UndefOr[AccessToken] = js.native
  /**
    *  Unique Id for an Amplify App. 
    */
  var appId: AppId = js.native
  /**
    *  Automated branch creation branchConfig for the Amplify App. 
    */
  var autoBranchCreationConfig: js.UndefOr[AutoBranchCreationConfig] = js.native
  /**
    *  Automated branch creation glob patterns for the Amplify App. 
    */
  var autoBranchCreationPatterns: js.UndefOr[AutoBranchCreationPatterns] = js.native
  /**
    *  Basic Authorization credentials for an Amplify App. 
    */
  var basicAuthCredentials: js.UndefOr[BasicAuthCredentials] = js.native
  /**
    *  BuildSpec for an Amplify App. 
    */
  var buildSpec: js.UndefOr[BuildSpec] = js.native
  /**
    *  Custom redirect / rewrite rules for an Amplify App. 
    */
  var customRules: js.UndefOr[CustomRules] = js.native
  /**
    *  Description for an Amplify App. 
    */
  var description: js.UndefOr[Description] = js.native
  /**
    *  Enables automated branch creation for the Amplify App. 
    */
  var enableAutoBranchCreation: js.UndefOr[EnableAutoBranchCreation] = js.native
  /**
    *  Enables Basic Authorization for an Amplify App. 
    */
  var enableBasicAuth: js.UndefOr[EnableBasicAuth] = js.native
  /**
    *  Enables branch auto-building for an Amplify App. 
    */
  var enableBranchAutoBuild: js.UndefOr[EnableAutoBuild] = js.native
  /**
    *  Environment Variables for an Amplify App. 
    */
  var environmentVariables: js.UndefOr[EnvironmentVariables] = js.native
  /**
    *  IAM service role for an Amplify App. 
    */
  var iamServiceRoleArn: js.UndefOr[ServiceRoleArn] = js.native
  /**
    *  Name for an Amplify App. 
    */
  var name: js.UndefOr[Name] = js.native
  /**
    *  OAuth token for 3rd party source control system for an Amplify App, used to create webhook and read-only deploy key. OAuth token is not stored. 
    */
  var oauthToken: js.UndefOr[OauthToken] = js.native
  /**
    *  Platform for an Amplify App. 
    */
  var platform: js.UndefOr[Platform] = js.native
  /**
    *  Repository for an Amplify App 
    */
  var repository: js.UndefOr[Repository] = js.native
}

object UpdateAppRequest {
  @scala.inline
  def apply(appId: AppId): UpdateAppRequest = {
    val __obj = js.Dynamic.literal(appId = appId.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateAppRequest]
  }
  @scala.inline
  implicit class UpdateAppRequestOps[Self <: UpdateAppRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAppId(value: AppId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("appId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAccessToken(value: AccessToken): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("accessToken")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAccessToken: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("accessToken")(js.undefined)
        ret
    }
    @scala.inline
    def withAutoBranchCreationConfig(value: AutoBranchCreationConfig): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoBranchCreationConfig")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAutoBranchCreationConfig: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoBranchCreationConfig")(js.undefined)
        ret
    }
    @scala.inline
    def withAutoBranchCreationPatterns(value: AutoBranchCreationPatterns): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoBranchCreationPatterns")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAutoBranchCreationPatterns: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoBranchCreationPatterns")(js.undefined)
        ret
    }
    @scala.inline
    def withBasicAuthCredentials(value: BasicAuthCredentials): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("basicAuthCredentials")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBasicAuthCredentials: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("basicAuthCredentials")(js.undefined)
        ret
    }
    @scala.inline
    def withBuildSpec(value: BuildSpec): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("buildSpec")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBuildSpec: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("buildSpec")(js.undefined)
        ret
    }
    @scala.inline
    def withCustomRules(value: CustomRules): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("customRules")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCustomRules: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("customRules")(js.undefined)
        ret
    }
    @scala.inline
    def withDescription(value: Description): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("description")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDescription: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("description")(js.undefined)
        ret
    }
    @scala.inline
    def withEnableAutoBranchCreation(value: EnableAutoBranchCreation): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableAutoBranchCreation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnableAutoBranchCreation: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableAutoBranchCreation")(js.undefined)
        ret
    }
    @scala.inline
    def withEnableBasicAuth(value: EnableBasicAuth): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableBasicAuth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnableBasicAuth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableBasicAuth")(js.undefined)
        ret
    }
    @scala.inline
    def withEnableBranchAutoBuild(value: EnableAutoBuild): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableBranchAutoBuild")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnableBranchAutoBuild: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableBranchAutoBuild")(js.undefined)
        ret
    }
    @scala.inline
    def withEnvironmentVariables(value: EnvironmentVariables): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("environmentVariables")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnvironmentVariables: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("environmentVariables")(js.undefined)
        ret
    }
    @scala.inline
    def withIamServiceRoleArn(value: ServiceRoleArn): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("iamServiceRoleArn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIamServiceRoleArn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("iamServiceRoleArn")(js.undefined)
        ret
    }
    @scala.inline
    def withName(value: Name): Self = {
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
    def withOauthToken(value: OauthToken): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("oauthToken")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOauthToken: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("oauthToken")(js.undefined)
        ret
    }
    @scala.inline
    def withPlatform(value: Platform): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("platform")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPlatform: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("platform")(js.undefined)
        ret
    }
    @scala.inline
    def withRepository(value: Repository): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("repository")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRepository: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("repository")(js.undefined)
        ret
    }
  }
  
}

