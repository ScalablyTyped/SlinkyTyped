package typingsSlinky.awsSdk.amplifyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateAppRequest extends js.Object {
  /**
    *  Personal Access token for 3rd party source control system for an Amplify App, used to create webhook and read-only deploy key. Token is not stored. 
    */
  var accessToken: js.UndefOr[AccessToken] = js.native
  /**
    *  Automated branch creation config for the Amplify App. 
    */
  var autoBranchCreationConfig: js.UndefOr[AutoBranchCreationConfig] = js.native
  /**
    *  Automated branch creation glob patterns for the Amplify App. 
    */
  var autoBranchCreationPatterns: js.UndefOr[AutoBranchCreationPatterns] = js.native
  /**
    *  Credentials for Basic Authorization for an Amplify App. 
    */
  var basicAuthCredentials: js.UndefOr[BasicAuthCredentials] = js.native
  /**
    *  BuildSpec for an Amplify App 
    */
  var buildSpec: js.UndefOr[BuildSpec] = js.native
  /**
    *  Custom rewrite / redirect rules for an Amplify App. 
    */
  var customRules: js.UndefOr[CustomRules] = js.native
  /**
    *  Description for an Amplify App 
    */
  var description: js.UndefOr[Description] = js.native
  /**
    *  Enables automated branch creation for the Amplify App. 
    */
  var enableAutoBranchCreation: js.UndefOr[EnableAutoBranchCreation] = js.native
  /**
    *  Enable Basic Authorization for an Amplify App, this will apply to all branches part of this App. 
    */
  var enableBasicAuth: js.UndefOr[EnableBasicAuth] = js.native
  /**
    *  Enable the auto building of branches for an Amplify App. 
    */
  var enableBranchAutoBuild: js.UndefOr[EnableBranchAutoBuild] = js.native
  /**
    *  Environment variables map for an Amplify App. 
    */
  var environmentVariables: js.UndefOr[EnvironmentVariables] = js.native
  /**
    *  AWS IAM service role for an Amplify App 
    */
  var iamServiceRoleArn: js.UndefOr[ServiceRoleArn] = js.native
  /**
    *  Name for the Amplify App 
    */
  var name: Name = js.native
  /**
    *  OAuth token for 3rd party source control system for an Amplify App, used to create webhook and read-only deploy key. OAuth token is not stored. 
    */
  var oauthToken: js.UndefOr[OauthToken] = js.native
  /**
    *  Platform / framework for an Amplify App 
    */
  var platform: js.UndefOr[Platform] = js.native
  /**
    *  Repository for an Amplify App 
    */
  var repository: js.UndefOr[Repository] = js.native
  /**
    *  Tag for an Amplify App 
    */
  var tags: js.UndefOr[TagMap] = js.native
}

object CreateAppRequest {
  @scala.inline
  def apply(name: Name): CreateAppRequest = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateAppRequest]
  }
  @scala.inline
  implicit class CreateAppRequestOps[Self <: CreateAppRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withName(value: Name): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
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
    def withEnableBranchAutoBuild(value: EnableBranchAutoBuild): Self = {
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
    @scala.inline
    def withTags(value: TagMap): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tags")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTags: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tags")(js.undefined)
        ret
    }
  }
  
}

