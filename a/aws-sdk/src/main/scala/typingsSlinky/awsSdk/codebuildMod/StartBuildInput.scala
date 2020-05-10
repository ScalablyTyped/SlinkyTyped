package typingsSlinky.awsSdk.codebuildMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StartBuildInput extends js.Object {
  /**
    * Build output artifact settings that override, for this build only, the latest ones already defined in the build project.
    */
  var artifactsOverride: js.UndefOr[ProjectArtifacts] = js.native
  /**
    * A buildspec file declaration that overrides, for this build only, the latest one already defined in the build project.  If this value is set, it can be either an inline buildspec definition, the path to an alternate buildspec file relative to the value of the built-in CODEBUILD_SRC_DIR environment variable, or the path to an S3 bucket. The bucket must be in the same AWS Region as the build project. Specify the buildspec file using its ARN (for example, arn:aws:s3:::my-codebuild-sample2/buildspec.yml). If this value is not provided or is set to an empty string, the source code must contain a buildspec file in its root directory. For more information, see Buildspec File Name and Storage Location. 
    */
  var buildspecOverride: js.UndefOr[String] = js.native
  /**
    * A ProjectCache object specified for this build that overrides the one defined in the build project.
    */
  var cacheOverride: js.UndefOr[ProjectCache] = js.native
  /**
    * The name of a certificate for this build that overrides the one specified in the build project.
    */
  var certificateOverride: js.UndefOr[String] = js.native
  /**
    * The name of a compute type for this build that overrides the one specified in the build project.
    */
  var computeTypeOverride: js.UndefOr[ComputeType] = js.native
  /**
    * The AWS Key Management Service (AWS KMS) customer master key (CMK) that overrides the one specified in the build project. The CMK key encrypts the build output artifacts.   You can use a cross-account KMS key to encrypt the build output artifacts if your service role has permission to that key.   You can specify either the Amazon Resource Name (ARN) of the CMK or, if available, the CMK's alias (using the format alias/alias-name ).
    */
  var encryptionKeyOverride: js.UndefOr[NonEmptyString] = js.native
  /**
    * A container type for this build that overrides the one specified in the build project.
    */
  var environmentTypeOverride: js.UndefOr[EnvironmentType] = js.native
  /**
    * A set of environment variables that overrides, for this build only, the latest ones already defined in the build project.
    */
  var environmentVariablesOverride: js.UndefOr[EnvironmentVariables] = js.native
  /**
    * The user-defined depth of history, with a minimum value of 0, that overrides, for this build only, any previous depth of history defined in the build project.
    */
  var gitCloneDepthOverride: js.UndefOr[GitCloneDepth] = js.native
  /**
    *  Information about the Git submodules configuration for this build of an AWS CodeBuild build project. 
    */
  var gitSubmodulesConfigOverride: js.UndefOr[GitSubmodulesConfig] = js.native
  /**
    * A unique, case sensitive identifier you provide to ensure the idempotency of the StartBuild request. The token is included in the StartBuild request and is valid for 12 hours. If you repeat the StartBuild request with the same token, but change a parameter, AWS CodeBuild returns a parameter mismatch error. 
    */
  var idempotencyToken: js.UndefOr[String] = js.native
  /**
    * The name of an image for this build that overrides the one specified in the build project.
    */
  var imageOverride: js.UndefOr[NonEmptyString] = js.native
  /**
    *  The type of credentials AWS CodeBuild uses to pull images in your build. There are two valid values:     CODEBUILD specifies that AWS CodeBuild uses its own credentials. This requires that you modify your ECR repository policy to trust AWS CodeBuild's service principal.    SERVICE_ROLE specifies that AWS CodeBuild uses your build project's service role.     When using a cross-account or private registry image, you must use SERVICE_ROLE credentials. When using an AWS CodeBuild curated image, you must use CODEBUILD credentials. 
    */
  var imagePullCredentialsTypeOverride: js.UndefOr[ImagePullCredentialsType] = js.native
  /**
    * Enable this flag to override the insecure SSL setting that is specified in the build project. The insecure SSL setting determines whether to ignore SSL warnings while connecting to the project source code. This override applies only if the build's source is GitHub Enterprise.
    */
  var insecureSslOverride: js.UndefOr[WrapperBoolean] = js.native
  /**
    *  Log settings for this build that override the log settings defined in the build project. 
    */
  var logsConfigOverride: js.UndefOr[LogsConfig] = js.native
  /**
    * Enable this flag to override privileged mode in the build project.
    */
  var privilegedModeOverride: js.UndefOr[WrapperBoolean] = js.native
  /**
    * The name of the AWS CodeBuild build project to start running a build.
    */
  var projectName: NonEmptyString = js.native
  /**
    *  The number of minutes a build is allowed to be queued before it times out. 
    */
  var queuedTimeoutInMinutesOverride: js.UndefOr[TimeOut] = js.native
  /**
    *  The credentials for access to a private registry. 
    */
  var registryCredentialOverride: js.UndefOr[RegistryCredential] = js.native
  /**
    *  Set to true to report to your source provider the status of a build's start and completion. If you use this option with a source provider other than GitHub, GitHub Enterprise, or Bitbucket, an invalidInputException is thrown.    The status of a build triggered by a webhook is always reported to your source provider.  
    */
  var reportBuildStatusOverride: js.UndefOr[WrapperBoolean] = js.native
  /**
    *  An array of ProjectArtifacts objects. 
    */
  var secondaryArtifactsOverride: js.UndefOr[ProjectArtifactsList] = js.native
  /**
    *  An array of ProjectSource objects. 
    */
  var secondarySourcesOverride: js.UndefOr[ProjectSources] = js.native
  /**
    *  An array of ProjectSourceVersion objects that specify one or more versions of the project's secondary sources to be used for this build only. 
    */
  var secondarySourcesVersionOverride: js.UndefOr[ProjectSecondarySourceVersions] = js.native
  /**
    * The name of a service role for this build that overrides the one specified in the build project.
    */
  var serviceRoleOverride: js.UndefOr[NonEmptyString] = js.native
  /**
    * An authorization type for this build that overrides the one defined in the build project. This override applies only if the build project's source is BitBucket or GitHub.
    */
  var sourceAuthOverride: js.UndefOr[SourceAuth] = js.native
  /**
    * A location that overrides, for this build, the source location for the one defined in the build project.
    */
  var sourceLocationOverride: js.UndefOr[String] = js.native
  /**
    * A source input type, for this build, that overrides the source input defined in the build project.
    */
  var sourceTypeOverride: js.UndefOr[SourceType] = js.native
  /**
    * A version of the build input to be built, for this build only. If not specified, the latest version is used. If specified, must be one of:   For AWS CodeCommit: the commit ID, branch, or Git tag to use.   For GitHub: the commit ID, pull request ID, branch name, or tag name that corresponds to the version of the source code you want to build. If a pull request ID is specified, it must use the format pr/pull-request-ID (for example pr/25). If a branch name is specified, the branch's HEAD commit ID is used. If not specified, the default branch's HEAD commit ID is used.   For Bitbucket: the commit ID, branch name, or tag name that corresponds to the version of the source code you want to build. If a branch name is specified, the branch's HEAD commit ID is used. If not specified, the default branch's HEAD commit ID is used.   For Amazon Simple Storage Service (Amazon S3): the version ID of the object that represents the build input ZIP file to use.    If sourceVersion is specified at the project level, then this sourceVersion (at the build level) takes precedence.   For more information, see Source Version Sample with CodeBuild in the AWS CodeBuild User Guide. 
    */
  var sourceVersion: js.UndefOr[String] = js.native
  /**
    * The number of build timeout minutes, from 5 to 480 (8 hours), that overrides, for this build only, the latest setting already defined in the build project.
    */
  var timeoutInMinutesOverride: js.UndefOr[TimeOut] = js.native
}

object StartBuildInput {
  @scala.inline
  def apply(projectName: NonEmptyString): StartBuildInput = {
    val __obj = js.Dynamic.literal(projectName = projectName.asInstanceOf[js.Any])
    __obj.asInstanceOf[StartBuildInput]
  }
  @scala.inline
  implicit class StartBuildInputOps[Self <: StartBuildInput] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withProjectName(value: NonEmptyString): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("projectName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withArtifactsOverride(value: ProjectArtifacts): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("artifactsOverride")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutArtifactsOverride: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("artifactsOverride")(js.undefined)
        ret
    }
    @scala.inline
    def withBuildspecOverride(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("buildspecOverride")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBuildspecOverride: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("buildspecOverride")(js.undefined)
        ret
    }
    @scala.inline
    def withCacheOverride(value: ProjectCache): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cacheOverride")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCacheOverride: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cacheOverride")(js.undefined)
        ret
    }
    @scala.inline
    def withCertificateOverride(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("certificateOverride")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCertificateOverride: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("certificateOverride")(js.undefined)
        ret
    }
    @scala.inline
    def withComputeTypeOverride(value: ComputeType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("computeTypeOverride")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutComputeTypeOverride: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("computeTypeOverride")(js.undefined)
        ret
    }
    @scala.inline
    def withEncryptionKeyOverride(value: NonEmptyString): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("encryptionKeyOverride")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEncryptionKeyOverride: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("encryptionKeyOverride")(js.undefined)
        ret
    }
    @scala.inline
    def withEnvironmentTypeOverride(value: EnvironmentType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("environmentTypeOverride")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnvironmentTypeOverride: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("environmentTypeOverride")(js.undefined)
        ret
    }
    @scala.inline
    def withEnvironmentVariablesOverride(value: EnvironmentVariables): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("environmentVariablesOverride")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnvironmentVariablesOverride: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("environmentVariablesOverride")(js.undefined)
        ret
    }
    @scala.inline
    def withGitCloneDepthOverride(value: GitCloneDepth): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gitCloneDepthOverride")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGitCloneDepthOverride: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gitCloneDepthOverride")(js.undefined)
        ret
    }
    @scala.inline
    def withGitSubmodulesConfigOverride(value: GitSubmodulesConfig): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gitSubmodulesConfigOverride")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGitSubmodulesConfigOverride: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gitSubmodulesConfigOverride")(js.undefined)
        ret
    }
    @scala.inline
    def withIdempotencyToken(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("idempotencyToken")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIdempotencyToken: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("idempotencyToken")(js.undefined)
        ret
    }
    @scala.inline
    def withImageOverride(value: NonEmptyString): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("imageOverride")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutImageOverride: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("imageOverride")(js.undefined)
        ret
    }
    @scala.inline
    def withImagePullCredentialsTypeOverride(value: ImagePullCredentialsType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("imagePullCredentialsTypeOverride")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutImagePullCredentialsTypeOverride: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("imagePullCredentialsTypeOverride")(js.undefined)
        ret
    }
    @scala.inline
    def withInsecureSslOverride(value: WrapperBoolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("insecureSslOverride")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInsecureSslOverride: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("insecureSslOverride")(js.undefined)
        ret
    }
    @scala.inline
    def withLogsConfigOverride(value: LogsConfig): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("logsConfigOverride")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLogsConfigOverride: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("logsConfigOverride")(js.undefined)
        ret
    }
    @scala.inline
    def withPrivilegedModeOverride(value: WrapperBoolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("privilegedModeOverride")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPrivilegedModeOverride: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("privilegedModeOverride")(js.undefined)
        ret
    }
    @scala.inline
    def withQueuedTimeoutInMinutesOverride(value: TimeOut): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("queuedTimeoutInMinutesOverride")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutQueuedTimeoutInMinutesOverride: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("queuedTimeoutInMinutesOverride")(js.undefined)
        ret
    }
    @scala.inline
    def withRegistryCredentialOverride(value: RegistryCredential): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("registryCredentialOverride")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRegistryCredentialOverride: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("registryCredentialOverride")(js.undefined)
        ret
    }
    @scala.inline
    def withReportBuildStatusOverride(value: WrapperBoolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reportBuildStatusOverride")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReportBuildStatusOverride: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reportBuildStatusOverride")(js.undefined)
        ret
    }
    @scala.inline
    def withSecondaryArtifactsOverride(value: ProjectArtifactsList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("secondaryArtifactsOverride")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSecondaryArtifactsOverride: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("secondaryArtifactsOverride")(js.undefined)
        ret
    }
    @scala.inline
    def withSecondarySourcesOverride(value: ProjectSources): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("secondarySourcesOverride")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSecondarySourcesOverride: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("secondarySourcesOverride")(js.undefined)
        ret
    }
    @scala.inline
    def withSecondarySourcesVersionOverride(value: ProjectSecondarySourceVersions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("secondarySourcesVersionOverride")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSecondarySourcesVersionOverride: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("secondarySourcesVersionOverride")(js.undefined)
        ret
    }
    @scala.inline
    def withServiceRoleOverride(value: NonEmptyString): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("serviceRoleOverride")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutServiceRoleOverride: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("serviceRoleOverride")(js.undefined)
        ret
    }
    @scala.inline
    def withSourceAuthOverride(value: SourceAuth): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sourceAuthOverride")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSourceAuthOverride: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sourceAuthOverride")(js.undefined)
        ret
    }
    @scala.inline
    def withSourceLocationOverride(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sourceLocationOverride")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSourceLocationOverride: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sourceLocationOverride")(js.undefined)
        ret
    }
    @scala.inline
    def withSourceTypeOverride(value: SourceType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sourceTypeOverride")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSourceTypeOverride: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sourceTypeOverride")(js.undefined)
        ret
    }
    @scala.inline
    def withSourceVersion(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sourceVersion")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSourceVersion: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sourceVersion")(js.undefined)
        ret
    }
    @scala.inline
    def withTimeoutInMinutesOverride(value: TimeOut): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timeoutInMinutesOverride")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTimeoutInMinutesOverride: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timeoutInMinutesOverride")(js.undefined)
        ret
    }
  }
  
}

