package typingsSlinky.pulumiAws.inputMod.codebuild

import typingsSlinky.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ProjectSource extends js.Object {
  /**
    * Information about the authorization settings for AWS CodeBuild to access the source code to be built. Auth blocks are documented below.
    */
  var auths: js.UndefOr[Input[js.Array[Input[ProjectSourceAuth]]]] = js.native
  /**
    * The build spec declaration to use for this build project's related builds.
    */
  var buildspec: js.UndefOr[Input[String]] = js.native
  /**
    * Truncate git history to this many commits.
    */
  var gitCloneDepth: js.UndefOr[Input[Double]] = js.native
  /**
    * Information about the Git submodules configuration for an AWS CodeBuild build project. Git submodules config blocks are documented below. This option is only valid when the `type` is `CODECOMMIT`.
    */
  var gitSubmodulesConfig: js.UndefOr[Input[ProjectSourceGitSubmodulesConfig]] = js.native
  /**
    * Ignore SSL warnings when connecting to source control.
    */
  var insecureSsl: js.UndefOr[Input[Boolean]] = js.native
  /**
    * The location of the source code from git or s3.
    */
  var location: js.UndefOr[Input[String]] = js.native
  /**
    * Set to `true` to report the status of a build's start and finish to your source provider. This option is only valid when your source provider is `GITHUB`, `BITBUCKET`, or `GITHUB_ENTERPRISE`.
    */
  var reportBuildStatus: js.UndefOr[Input[Boolean]] = js.native
  /**
    * The type of repository that contains the source code to be built. Valid values for this parameter are: `CODECOMMIT`, `CODEPIPELINE`, `GITHUB`, `GITHUB_ENTERPRISE`, `BITBUCKET` or `S3`.
    */
  var `type`: Input[String] = js.native
}

object ProjectSource {
  @scala.inline
  def apply(`type`: Input[String]): ProjectSource = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProjectSource]
  }
  @scala.inline
  implicit class ProjectSourceOps[Self <: ProjectSource] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withType(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAuths(value: Input[js.Array[Input[ProjectSourceAuth]]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("auths")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAuths: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("auths")(js.undefined)
        ret
    }
    @scala.inline
    def withBuildspec(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("buildspec")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBuildspec: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("buildspec")(js.undefined)
        ret
    }
    @scala.inline
    def withGitCloneDepth(value: Input[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gitCloneDepth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGitCloneDepth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gitCloneDepth")(js.undefined)
        ret
    }
    @scala.inline
    def withGitSubmodulesConfig(value: Input[ProjectSourceGitSubmodulesConfig]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gitSubmodulesConfig")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGitSubmodulesConfig: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gitSubmodulesConfig")(js.undefined)
        ret
    }
    @scala.inline
    def withInsecureSsl(value: Input[Boolean]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("insecureSsl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInsecureSsl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("insecureSsl")(js.undefined)
        ret
    }
    @scala.inline
    def withLocation(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("location")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLocation: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("location")(js.undefined)
        ret
    }
    @scala.inline
    def withReportBuildStatus(value: Input[Boolean]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reportBuildStatus")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReportBuildStatus: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reportBuildStatus")(js.undefined)
        ret
    }
  }
  
}

