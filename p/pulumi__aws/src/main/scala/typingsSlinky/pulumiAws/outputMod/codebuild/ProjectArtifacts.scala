package typingsSlinky.pulumiAws.outputMod.codebuild

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ProjectArtifacts extends js.Object {
  /**
    * The artifact identifier. Must be the same specified inside AWS CodeBuild buildspec.
    */
  var artifactIdentifier: js.UndefOr[String] = js.native
  /**
    * If set to true, output artifacts will not be encrypted. If `type` is set to `NO_ARTIFACTS` then this value will be ignored. Defaults to `false`.
    */
  var encryptionDisabled: js.UndefOr[Boolean] = js.native
  /**
    * The location of the source code from git or s3.
    */
  var location: js.UndefOr[String] = js.native
  /**
    * The name of the project. If `type` is set to `S3`, this is the name of the output artifact object
    */
  var name: js.UndefOr[String] = js.native
  /**
    * The namespace to use in storing build artifacts. If `type` is set to `S3`, then valid values for this parameter are: `BUILD_ID` or `NONE`.
    */
  var namespaceType: js.UndefOr[String] = js.native
  /**
    * If set to true, a name specified in the build spec file overrides the artifact name.
    */
  var overrideArtifactName: js.UndefOr[Boolean] = js.native
  /**
    * The type of build output artifact to create. If `type` is set to `S3`, valid values for this parameter are: `NONE` or `ZIP`
    */
  var packaging: js.UndefOr[String] = js.native
  /**
    * If `type` is set to `S3`, this is the path to the output artifact
    */
  var path: js.UndefOr[String] = js.native
  /**
    * The type of repository that contains the source code to be built. Valid values for this parameter are: `CODECOMMIT`, `CODEPIPELINE`, `GITHUB`, `GITHUB_ENTERPRISE`, `BITBUCKET` or `S3`.
    */
  var `type`: String = js.native
}

object ProjectArtifacts {
  @scala.inline
  def apply(`type`: String): ProjectArtifacts = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProjectArtifacts]
  }
  @scala.inline
  implicit class ProjectArtifactsOps[Self <: ProjectArtifacts] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withArtifactIdentifier(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("artifactIdentifier")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutArtifactIdentifier: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("artifactIdentifier")(js.undefined)
        ret
    }
    @scala.inline
    def withEncryptionDisabled(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("encryptionDisabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEncryptionDisabled: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("encryptionDisabled")(js.undefined)
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
    def withName(value: String): Self = {
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
    def withNamespaceType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("namespaceType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNamespaceType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("namespaceType")(js.undefined)
        ret
    }
    @scala.inline
    def withOverrideArtifactName(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("overrideArtifactName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOverrideArtifactName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("overrideArtifactName")(js.undefined)
        ret
    }
    @scala.inline
    def withPackaging(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("packaging")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPackaging: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("packaging")(js.undefined)
        ret
    }
    @scala.inline
    def withPath(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("path")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPath: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("path")(js.undefined)
        ret
    }
  }
  
}

