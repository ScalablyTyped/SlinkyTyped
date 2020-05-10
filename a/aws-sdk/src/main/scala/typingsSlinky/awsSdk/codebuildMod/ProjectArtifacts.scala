package typingsSlinky.awsSdk.codebuildMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ProjectArtifacts extends js.Object {
  /**
    *  An identifier for this artifact definition. 
    */
  var artifactIdentifier: js.UndefOr[String] = js.native
  /**
    *  Set to true if you do not want your output artifacts encrypted. This option is valid only if your artifacts type is Amazon Simple Storage Service (Amazon S3). If this is set with another artifacts type, an invalidInputException is thrown. 
    */
  var encryptionDisabled: js.UndefOr[WrapperBoolean] = js.native
  /**
    * Information about the build output artifact location:   If type is set to CODEPIPELINE, AWS CodePipeline ignores this value if specified. This is because AWS CodePipeline manages its build output locations instead of AWS CodeBuild.   If type is set to NO_ARTIFACTS, this value is ignored if specified, because no build output is produced.   If type is set to S3, this is the name of the output bucket.  
    */
  var location: js.UndefOr[String] = js.native
  /**
    * Along with path and namespaceType, the pattern that AWS CodeBuild uses to name and store the output artifact:   If type is set to CODEPIPELINE, AWS CodePipeline ignores this value if specified. This is because AWS CodePipeline manages its build output names instead of AWS CodeBuild.   If type is set to NO_ARTIFACTS, this value is ignored if specified, because no build output is produced.   If type is set to S3, this is the name of the output artifact object. If you set the name to be a forward slash ("/"), the artifact is stored in the root of the output bucket.   For example:    If path is set to MyArtifacts, namespaceType is set to BUILD_ID, and name is set to MyArtifact.zip, then the output artifact is stored in MyArtifacts/build-ID/MyArtifact.zip.     If path is empty, namespaceType is set to NONE, and name is set to "/", the output artifact is stored in the root of the output bucket.     If path is set to MyArtifacts, namespaceType is set to BUILD_ID, and name is set to "/", the output artifact is stored in MyArtifacts/build-ID .   
    */
  var name: js.UndefOr[String] = js.native
  /**
    * Along with path and name, the pattern that AWS CodeBuild uses to determine the name and location to store the output artifact:   If type is set to CODEPIPELINE, AWS CodePipeline ignores this value if specified. This is because AWS CodePipeline manages its build output names instead of AWS CodeBuild.   If type is set to NO_ARTIFACTS, this value is ignored if specified, because no build output is produced.   If type is set to S3, valid values include:    BUILD_ID: Include the build ID in the location of the build output artifact.    NONE: Do not include the build ID. This is the default if namespaceType is not specified.     For example, if path is set to MyArtifacts, namespaceType is set to BUILD_ID, and name is set to MyArtifact.zip, the output artifact is stored in MyArtifacts/build-ID/MyArtifact.zip.
    */
  var namespaceType: js.UndefOr[ArtifactNamespace] = js.native
  /**
    *  If this flag is set, a name specified in the buildspec file overrides the artifact name. The name specified in a buildspec file is calculated at build time and uses the Shell Command Language. For example, you can append a date and time to your artifact name so that it is always unique. 
    */
  var overrideArtifactName: js.UndefOr[WrapperBoolean] = js.native
  /**
    * The type of build output artifact to create:   If type is set to CODEPIPELINE, AWS CodePipeline ignores this value if specified. This is because AWS CodePipeline manages its build output artifacts instead of AWS CodeBuild.   If type is set to NO_ARTIFACTS, this value is ignored if specified, because no build output is produced.   If type is set to S3, valid values include:    NONE: AWS CodeBuild creates in the output bucket a folder that contains the build output. This is the default if packaging is not specified.    ZIP: AWS CodeBuild creates in the output bucket a ZIP file that contains the build output.    
    */
  var packaging: js.UndefOr[ArtifactPackaging] = js.native
  /**
    * Along with namespaceType and name, the pattern that AWS CodeBuild uses to name and store the output artifact:   If type is set to CODEPIPELINE, AWS CodePipeline ignores this value if specified. This is because AWS CodePipeline manages its build output names instead of AWS CodeBuild.   If type is set to NO_ARTIFACTS, this value is ignored if specified, because no build output is produced.   If type is set to S3, this is the path to the output artifact. If path is not specified, path is not used.   For example, if path is set to MyArtifacts, namespaceType is set to NONE, and name is set to MyArtifact.zip, the output artifact is stored in the output bucket at MyArtifacts/MyArtifact.zip.
    */
  var path: js.UndefOr[String] = js.native
  /**
    * The type of build output artifact. Valid values include:    CODEPIPELINE: The build project has build output generated through AWS CodePipeline.   The CODEPIPELINE type is not supported for secondaryArtifacts.     NO_ARTIFACTS: The build project does not produce any build output.    S3: The build project stores build output in Amazon Simple Storage Service (Amazon S3).  
    */
  var `type`: ArtifactsType = js.native
}

object ProjectArtifacts {
  @scala.inline
  def apply(`type`: ArtifactsType): ProjectArtifacts = {
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
    def withType(value: ArtifactsType): Self = {
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
    def withEncryptionDisabled(value: WrapperBoolean): Self = {
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
    def withNamespaceType(value: ArtifactNamespace): Self = {
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
    def withOverrideArtifactName(value: WrapperBoolean): Self = {
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
    def withPackaging(value: ArtifactPackaging): Self = {
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

