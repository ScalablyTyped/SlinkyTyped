package typingsSlinky.pulumiAws.outputMod.codebuild

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ProjectSecondarySource extends js.Object {
  /**
    * Information about the authorization settings for AWS CodeBuild to access the source code to be built. Auth blocks are documented below.
    */
  var auths: js.UndefOr[js.Array[ProjectSecondarySourceAuth]] = js.native
  /**
    * The build spec declaration to use for this build project's related builds.
    */
  var buildspec: js.UndefOr[String] = js.native
  /**
    * Truncate git history to this many commits.
    */
  var gitCloneDepth: js.UndefOr[Double] = js.native
  /**
    * Information about the Git submodules configuration for an AWS CodeBuild build project. Git submodules config blocks are documented below. This option is only valid when the `type` is `CODECOMMIT`.
    */
  var gitSubmodulesConfig: js.UndefOr[ProjectSecondarySourceGitSubmodulesConfig] = js.native
  /**
    * Ignore SSL warnings when connecting to source control.
    */
  var insecureSsl: js.UndefOr[Boolean] = js.native
  /**
    * The location of the source code from git or s3.
    */
  var location: js.UndefOr[String] = js.native
  /**
    * Set to `true` to report the status of a build's start and finish to your source provider. This option is only valid when your source provider is `GITHUB`, `BITBUCKET`, or `GITHUB_ENTERPRISE`.
    */
  var reportBuildStatus: js.UndefOr[Boolean] = js.native
  /**
    * The source identifier. Source data will be put inside a folder named as this parameter inside AWS CodeBuild source directory
    */
  var sourceIdentifier: String = js.native
  /**
    * The type of repository that contains the source code to be built. Valid values for this parameter are: `CODECOMMIT`, `CODEPIPELINE`, `GITHUB`, `GITHUB_ENTERPRISE`, `BITBUCKET` or `S3`.
    */
  var `type`: String = js.native
}

object ProjectSecondarySource {
  @scala.inline
  def apply(sourceIdentifier: String, `type`: String): ProjectSecondarySource = {
    val __obj = js.Dynamic.literal(sourceIdentifier = sourceIdentifier.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProjectSecondarySource]
  }
  @scala.inline
  implicit class ProjectSecondarySourceOps[Self <: ProjectSecondarySource] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withSourceIdentifier(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sourceIdentifier")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAuths(value: js.Array[ProjectSecondarySourceAuth]): Self = {
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
    def withBuildspec(value: String): Self = {
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
    def withGitCloneDepth(value: Double): Self = {
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
    def withGitSubmodulesConfig(value: ProjectSecondarySourceGitSubmodulesConfig): Self = {
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
    def withInsecureSsl(value: Boolean): Self = {
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
    def withLocation(value: String): Self = {
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
    def withReportBuildStatus(value: Boolean): Self = {
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

