package typingsSlinky.awsSdk.amplifyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AutoBranchCreationConfig extends js.Object {
  /**
    *  Basic Authorization credentials for the auto created branch. 
    */
  var basicAuthCredentials: js.UndefOr[BasicAuthCredentials] = js.native
  /**
    *  BuildSpec for the auto created branch. 
    */
  var buildSpec: js.UndefOr[BuildSpec] = js.native
  /**
    *  Enables auto building for the auto created branch. 
    */
  var enableAutoBuild: js.UndefOr[EnableAutoBuild] = js.native
  /**
    *  Enables Basic Auth for the auto created branch. 
    */
  var enableBasicAuth: js.UndefOr[EnableBasicAuth] = js.native
  /**
    *  Enables Pull Request Preview for auto created branch. 
    */
  var enablePullRequestPreview: js.UndefOr[EnablePullRequestPreview] = js.native
  /**
    *  Environment Variables for the auto created branch. 
    */
  var environmentVariables: js.UndefOr[EnvironmentVariables] = js.native
  /**
    *  Framework for the auto created branch. 
    */
  var framework: js.UndefOr[Framework] = js.native
  /**
    *  The Amplify Environment name for the pull request. 
    */
  var pullRequestEnvironmentName: js.UndefOr[PullRequestEnvironmentName] = js.native
  /**
    *  Stage for the auto created branch. 
    */
  var stage: js.UndefOr[Stage] = js.native
}

object AutoBranchCreationConfig {
  @scala.inline
  def apply(): AutoBranchCreationConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AutoBranchCreationConfig]
  }
  @scala.inline
  implicit class AutoBranchCreationConfigOps[Self <: AutoBranchCreationConfig] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
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
  }
  
}

