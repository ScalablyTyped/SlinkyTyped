package typingsSlinky.awsSdk.amplifyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait App extends js.Object {
  /**
    *  ARN for the Amplify App. 
    */
  var appArn: AppArn = js.native
  /**
    *  Unique Id for the Amplify App. 
    */
  var appId: AppId = js.native
  /**
    *  Automated branch creation config for the Amplify App. 
    */
  var autoBranchCreationConfig: js.UndefOr[AutoBranchCreationConfig] = js.native
  /**
    *  Automated branch creation glob patterns for the Amplify App. 
    */
  var autoBranchCreationPatterns: js.UndefOr[AutoBranchCreationPatterns] = js.native
  /**
    *  Basic Authorization credentials for branches for the Amplify App. 
    */
  var basicAuthCredentials: js.UndefOr[BasicAuthCredentials] = js.native
  /**
    *  BuildSpec content for Amplify App. 
    */
  var buildSpec: js.UndefOr[BuildSpec] = js.native
  /**
    *  Create date / time for the Amplify App. 
    */
  var createTime: js.Date = js.native
  /**
    *  Custom redirect / rewrite rules for the Amplify App. 
    */
  var customRules: js.UndefOr[CustomRules] = js.native
  /**
    *  Default domain for the Amplify App. 
    */
  var defaultDomain: DefaultDomain = js.native
  /**
    *  Description for the Amplify App. 
    */
  var description: Description = js.native
  /**
    *  Enables automated branch creation for the Amplify App. 
    */
  var enableAutoBranchCreation: js.UndefOr[EnableAutoBranchCreation] = js.native
  /**
    *  Enables Basic Authorization for branches for the Amplify App. 
    */
  var enableBasicAuth: EnableBasicAuth = js.native
  /**
    *  Enables auto-building of branches for the Amplify App. 
    */
  var enableBranchAutoBuild: EnableBranchAutoBuild = js.native
  /**
    *  Environment Variables for the Amplify App. 
    */
  var environmentVariables: EnvironmentVariables = js.native
  /**
    *  IAM service role ARN for the Amplify App. 
    */
  var iamServiceRoleArn: js.UndefOr[ServiceRoleArn] = js.native
  /**
    *  Name for the Amplify App. 
    */
  var name: Name = js.native
  /**
    *  Platform for the Amplify App. 
    */
  var platform: Platform = js.native
  /**
    *  Structure with Production Branch information. 
    */
  var productionBranch: js.UndefOr[ProductionBranch] = js.native
  /**
    *  Repository for the Amplify App. 
    */
  var repository: Repository = js.native
  /**
    *  Tag for Amplify App. 
    */
  var tags: js.UndefOr[TagMap] = js.native
  /**
    *  Update date / time for the Amplify App. 
    */
  var updateTime: js.Date = js.native
}

object App {
  @scala.inline
  def apply(
    appArn: AppArn,
    appId: AppId,
    createTime: js.Date,
    defaultDomain: DefaultDomain,
    description: Description,
    enableBasicAuth: EnableBasicAuth,
    enableBranchAutoBuild: EnableBranchAutoBuild,
    environmentVariables: EnvironmentVariables,
    name: Name,
    platform: Platform,
    repository: Repository,
    updateTime: js.Date
  ): App = {
    val __obj = js.Dynamic.literal(appArn = appArn.asInstanceOf[js.Any], appId = appId.asInstanceOf[js.Any], createTime = createTime.asInstanceOf[js.Any], defaultDomain = defaultDomain.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any], enableBasicAuth = enableBasicAuth.asInstanceOf[js.Any], enableBranchAutoBuild = enableBranchAutoBuild.asInstanceOf[js.Any], environmentVariables = environmentVariables.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], platform = platform.asInstanceOf[js.Any], repository = repository.asInstanceOf[js.Any], updateTime = updateTime.asInstanceOf[js.Any])
    __obj.asInstanceOf[App]
  }
  @scala.inline
  implicit class AppOps[Self <: App] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAppArn(value: AppArn): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("appArn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAppId(value: AppId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("appId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCreateTime(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("createTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDefaultDomain(value: DefaultDomain): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultDomain")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDescription(value: Description): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("description")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEnableBasicAuth(value: EnableBasicAuth): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableBasicAuth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEnableBranchAutoBuild(value: EnableBranchAutoBuild): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableBranchAutoBuild")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEnvironmentVariables(value: EnvironmentVariables): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("environmentVariables")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withName(value: Name): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPlatform(value: Platform): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("platform")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRepository(value: Repository): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("repository")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUpdateTime(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("updateTime")(value.asInstanceOf[js.Any])
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
    def withProductionBranch(value: ProductionBranch): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("productionBranch")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProductionBranch: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("productionBranch")(js.undefined)
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

