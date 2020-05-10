package typingsSlinky.awsSdk.amplifyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateBranchRequest extends js.Object {
  /**
    *  Unique Id for an Amplify App. 
    */
  var appId: AppId = js.native
  /**
    *  ARN for a Backend Environment, part of an Amplify App. 
    */
  var backendEnvironmentArn: js.UndefOr[BackendEnvironmentArn] = js.native
  /**
    *  Basic Authorization credentials for the branch. 
    */
  var basicAuthCredentials: js.UndefOr[BasicAuthCredentials] = js.native
  /**
    *  Name for the branch. 
    */
  var branchName: BranchName = js.native
  /**
    *  BuildSpec for the branch. 
    */
  var buildSpec: js.UndefOr[BuildSpec] = js.native
  /**
    *  Description for the branch. 
    */
  var description: js.UndefOr[Description] = js.native
  /**
    *  Display name for a branch, will use as the default domain prefix. 
    */
  var displayName: js.UndefOr[DisplayName] = js.native
  /**
    *  Enables auto building for the branch. 
    */
  var enableAutoBuild: js.UndefOr[EnableAutoBuild] = js.native
  /**
    *  Enables Basic Auth for the branch. 
    */
  var enableBasicAuth: js.UndefOr[EnableBasicAuth] = js.native
  /**
    *  Enables notifications for the branch. 
    */
  var enableNotification: js.UndefOr[EnableNotification] = js.native
  /**
    *  Enables Pull Request Preview for this branch. 
    */
  var enablePullRequestPreview: js.UndefOr[EnablePullRequestPreview] = js.native
  /**
    *  Environment Variables for the branch. 
    */
  var environmentVariables: js.UndefOr[EnvironmentVariables] = js.native
  /**
    *  Framework for the branch. 
    */
  var framework: js.UndefOr[Framework] = js.native
  /**
    *  The Amplify Environment name for the pull request. 
    */
  var pullRequestEnvironmentName: js.UndefOr[PullRequestEnvironmentName] = js.native
  /**
    *  Stage for the branch. 
    */
  var stage: js.UndefOr[Stage] = js.native
  /**
    *  The content TTL for the website in seconds. 
    */
  var ttl: js.UndefOr[TTL] = js.native
}

object UpdateBranchRequest {
  @scala.inline
  def apply(appId: AppId, branchName: BranchName): UpdateBranchRequest = {
    val __obj = js.Dynamic.literal(appId = appId.asInstanceOf[js.Any], branchName = branchName.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateBranchRequest]
  }
  @scala.inline
  implicit class UpdateBranchRequestOps[Self <: UpdateBranchRequest] (val x: Self) extends AnyVal {
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
    def withBranchName(value: BranchName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("branchName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBackendEnvironmentArn(value: BackendEnvironmentArn): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("backendEnvironmentArn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBackendEnvironmentArn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("backendEnvironmentArn")(js.undefined)
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
    def withDisplayName(value: DisplayName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("displayName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDisplayName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("displayName")(js.undefined)
        ret
    }
    @scala.inline
    def withEnableAutoBuild(value: EnableAutoBuild): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableAutoBuild")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnableAutoBuild: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableAutoBuild")(js.undefined)
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
    def withEnableNotification(value: EnableNotification): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableNotification")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnableNotification: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableNotification")(js.undefined)
        ret
    }
    @scala.inline
    def withEnablePullRequestPreview(value: EnablePullRequestPreview): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enablePullRequestPreview")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnablePullRequestPreview: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enablePullRequestPreview")(js.undefined)
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
    def withFramework(value: Framework): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("framework")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFramework: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("framework")(js.undefined)
        ret
    }
    @scala.inline
    def withPullRequestEnvironmentName(value: PullRequestEnvironmentName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pullRequestEnvironmentName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPullRequestEnvironmentName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pullRequestEnvironmentName")(js.undefined)
        ret
    }
    @scala.inline
    def withStage(value: Stage): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stage")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStage: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stage")(js.undefined)
        ret
    }
    @scala.inline
    def withTtl(value: TTL): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ttl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTtl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ttl")(js.undefined)
        ret
    }
  }
  
}

