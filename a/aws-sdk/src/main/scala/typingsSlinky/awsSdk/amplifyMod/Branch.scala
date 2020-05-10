package typingsSlinky.awsSdk.amplifyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Branch extends js.Object {
  /**
    *  Id of the active job for a branch, part of an Amplify App. 
    */
  var activeJobId: ActiveJobId = js.native
  /**
    *  List of custom resources that are linked to this branch. 
    */
  var associatedResources: js.UndefOr[AssociatedResources] = js.native
  /**
    *  ARN for a Backend Environment, part of an Amplify App. 
    */
  var backendEnvironmentArn: js.UndefOr[BackendEnvironmentArn] = js.native
  /**
    *  Basic Authorization credentials for a branch, part of an Amplify App. 
    */
  var basicAuthCredentials: js.UndefOr[BasicAuthCredentials] = js.native
  /**
    *  ARN for a branch, part of an Amplify App. 
    */
  var branchArn: BranchArn = js.native
  /**
    *  Name for a branch, part of an Amplify App. 
    */
  var branchName: BranchName = js.native
  /**
    *  BuildSpec content for branch for Amplify App. 
    */
  var buildSpec: js.UndefOr[BuildSpec] = js.native
  /**
    *  Creation date and time for a branch, part of an Amplify App. 
    */
  var createTime: js.Date = js.native
  /**
    *  Custom domains for a branch, part of an Amplify App. 
    */
  var customDomains: CustomDomains = js.native
  /**
    *  Description for a branch, part of an Amplify App. 
    */
  var description: Description = js.native
  /**
    *  The destination branch if the branch is a pull request branch. 
    */
  var destinationBranch: js.UndefOr[BranchName] = js.native
  /**
    *  Display name for a branch, will use as the default domain prefix. 
    */
  var displayName: DisplayName = js.native
  /**
    *  Enables auto-building on push for a branch, part of an Amplify App. 
    */
  var enableAutoBuild: EnableAutoBuild = js.native
  /**
    *  Enables Basic Authorization for a branch, part of an Amplify App. 
    */
  var enableBasicAuth: EnableBasicAuth = js.native
  /**
    *  Enables notifications for a branch, part of an Amplify App. 
    */
  var enableNotification: EnableNotification = js.native
  /**
    *  Enables Pull Request Preview for this branch. 
    */
  var enablePullRequestPreview: EnablePullRequestPreview = js.native
  /**
    *  Environment Variables specific to a branch, part of an Amplify App. 
    */
  var environmentVariables: EnvironmentVariables = js.native
  /**
    *  Framework for a branch, part of an Amplify App. 
    */
  var framework: Framework = js.native
  /**
    *  The Amplify Environment name for the pull request. 
    */
  var pullRequestEnvironmentName: js.UndefOr[PullRequestEnvironmentName] = js.native
  /**
    *  The source branch if the branch is a pull request branch. 
    */
  var sourceBranch: js.UndefOr[BranchName] = js.native
  /**
    *  Stage for a branch, part of an Amplify App. 
    */
  var stage: Stage = js.native
  /**
    *  Tag for branch for Amplify App. 
    */
  var tags: js.UndefOr[TagMap] = js.native
  /**
    *  Thumbnail URL for the branch. 
    */
  var thumbnailUrl: js.UndefOr[ThumbnailUrl] = js.native
  /**
    *  Total number of Jobs part of an Amplify App. 
    */
  var totalNumberOfJobs: TotalNumberOfJobs = js.native
  /**
    *  The content TTL for the website in seconds. 
    */
  var ttl: TTL = js.native
  /**
    *  Last updated date and time for a branch, part of an Amplify App. 
    */
  var updateTime: js.Date = js.native
}

object Branch {
  @scala.inline
  def apply(
    activeJobId: ActiveJobId,
    branchArn: BranchArn,
    branchName: BranchName,
    createTime: js.Date,
    customDomains: CustomDomains,
    description: Description,
    displayName: DisplayName,
    enableAutoBuild: EnableAutoBuild,
    enableBasicAuth: EnableBasicAuth,
    enableNotification: EnableNotification,
    enablePullRequestPreview: EnablePullRequestPreview,
    environmentVariables: EnvironmentVariables,
    framework: Framework,
    stage: Stage,
    totalNumberOfJobs: TotalNumberOfJobs,
    ttl: TTL,
    updateTime: js.Date
  ): Branch = {
    val __obj = js.Dynamic.literal(activeJobId = activeJobId.asInstanceOf[js.Any], branchArn = branchArn.asInstanceOf[js.Any], branchName = branchName.asInstanceOf[js.Any], createTime = createTime.asInstanceOf[js.Any], customDomains = customDomains.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any], displayName = displayName.asInstanceOf[js.Any], enableAutoBuild = enableAutoBuild.asInstanceOf[js.Any], enableBasicAuth = enableBasicAuth.asInstanceOf[js.Any], enableNotification = enableNotification.asInstanceOf[js.Any], enablePullRequestPreview = enablePullRequestPreview.asInstanceOf[js.Any], environmentVariables = environmentVariables.asInstanceOf[js.Any], framework = framework.asInstanceOf[js.Any], stage = stage.asInstanceOf[js.Any], totalNumberOfJobs = totalNumberOfJobs.asInstanceOf[js.Any], ttl = ttl.asInstanceOf[js.Any], updateTime = updateTime.asInstanceOf[js.Any])
    __obj.asInstanceOf[Branch]
  }
  @scala.inline
  implicit class BranchOps[Self <: Branch] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withActiveJobId(value: ActiveJobId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("activeJobId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBranchArn(value: BranchArn): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("branchArn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBranchName(value: BranchName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("branchName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCreateTime(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("createTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCustomDomains(value: CustomDomains): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("customDomains")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDescription(value: Description): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("description")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDisplayName(value: DisplayName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("displayName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEnableAutoBuild(value: EnableAutoBuild): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableAutoBuild")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEnableBasicAuth(value: EnableBasicAuth): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableBasicAuth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEnableNotification(value: EnableNotification): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableNotification")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEnablePullRequestPreview(value: EnablePullRequestPreview): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enablePullRequestPreview")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEnvironmentVariables(value: EnvironmentVariables): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("environmentVariables")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFramework(value: Framework): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("framework")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStage(value: Stage): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stage")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTotalNumberOfJobs(value: TotalNumberOfJobs): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("totalNumberOfJobs")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTtl(value: TTL): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ttl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUpdateTime(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("updateTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAssociatedResources(value: AssociatedResources): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("associatedResources")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAssociatedResources: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("associatedResources")(js.undefined)
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
    def withDestinationBranch(value: BranchName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("destinationBranch")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDestinationBranch: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("destinationBranch")(js.undefined)
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
    def withSourceBranch(value: BranchName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sourceBranch")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSourceBranch: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sourceBranch")(js.undefined)
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
    @scala.inline
    def withThumbnailUrl(value: ThumbnailUrl): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("thumbnailUrl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutThumbnailUrl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("thumbnailUrl")(js.undefined)
        ret
    }
  }
  
}

