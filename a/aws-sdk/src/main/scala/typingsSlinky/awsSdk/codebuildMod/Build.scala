package typingsSlinky.awsSdk.codebuildMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Build extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of the build.
    */
  var arn: js.UndefOr[NonEmptyString] = js.native
  /**
    * Information about the output artifacts for the build.
    */
  var artifacts: js.UndefOr[BuildArtifacts] = js.native
  /**
    * Whether the build is complete. True if complete; otherwise, false.
    */
  var buildComplete: js.UndefOr[Boolean] = js.native
  /**
    * The number of the build. For each project, the buildNumber of its first build is 1. The buildNumber of each subsequent build is incremented by 1. If a build is deleted, the buildNumber of other builds does not change.
    */
  var buildNumber: js.UndefOr[WrapperLong] = js.native
  /**
    * The current status of the build. Valid values include:    FAILED: The build failed.    FAULT: The build faulted.    IN_PROGRESS: The build is still in progress.    STOPPED: The build stopped.    SUCCEEDED: The build succeeded.    TIMED_OUT: The build timed out.  
    */
  var buildStatus: js.UndefOr[StatusType] = js.native
  /**
    * Information about the cache for the build.
    */
  var cache: js.UndefOr[ProjectCache] = js.native
  /**
    * The current build phase.
    */
  var currentPhase: js.UndefOr[String] = js.native
  /**
    * The AWS Key Management Service (AWS KMS) customer master key (CMK) to be used for encrypting the build output artifacts.   You can use a cross-account KMS key to encrypt the build output artifacts if your service role has permission to that key.   You can specify either the Amazon Resource Name (ARN) of the CMK or, if available, the CMK's alias (using the format alias/alias-name ).
    */
  var encryptionKey: js.UndefOr[NonEmptyString] = js.native
  /**
    * When the build process ended, expressed in Unix time format.
    */
  var endTime: js.UndefOr[js.Date] = js.native
  /**
    * Information about the build environment for this build.
    */
  var environment: js.UndefOr[ProjectEnvironment] = js.native
  /**
    *  A list of exported environment variables for this build. 
    */
  var exportedEnvironmentVariables: js.UndefOr[ExportedEnvironmentVariables] = js.native
  /**
    *  An array of ProjectFileSystemLocation objects for a CodeBuild build project. A ProjectFileSystemLocation object specifies the identifier, location, mountOptions, mountPoint, and type of a file system created using Amazon Elastic File System. 
    */
  var fileSystemLocations: js.UndefOr[ProjectFileSystemLocations] = js.native
  /**
    * The unique ID for the build.
    */
  var id: js.UndefOr[NonEmptyString] = js.native
  /**
    * The entity that started the build. Valid values include:   If AWS CodePipeline started the build, the pipeline's name (for example, codepipeline/my-demo-pipeline).   If an AWS Identity and Access Management (IAM) user started the build, the user's name (for example, MyUserName).   If the Jenkins plugin for AWS CodeBuild started the build, the string CodeBuild-Jenkins-Plugin.  
    */
  var initiator: js.UndefOr[String] = js.native
  /**
    * Information about the build's logs in Amazon CloudWatch Logs.
    */
  var logs: js.UndefOr[LogsLocation] = js.native
  /**
    * Describes a network interface.
    */
  var networkInterface: js.UndefOr[NetworkInterface] = js.native
  /**
    * Information about all previous build phases that are complete and information about any current build phase that is not yet complete.
    */
  var phases: js.UndefOr[BuildPhases] = js.native
  /**
    * The name of the AWS CodeBuild project.
    */
  var projectName: js.UndefOr[NonEmptyString] = js.native
  /**
    *  The number of minutes a build is allowed to be queued before it times out. 
    */
  var queuedTimeoutInMinutes: js.UndefOr[WrapperInt] = js.native
  /**
    *  An array of the ARNs associated with this build's reports. 
    */
  var reportArns: js.UndefOr[BuildReportArns] = js.native
  /**
    *  An identifier for the version of this build's source code.     For AWS CodeCommit, GitHub, GitHub Enterprise, and BitBucket, the commit ID.     For AWS CodePipeline, the source revision provided by AWS CodePipeline.     For Amazon Simple Storage Service (Amazon S3), this does not apply.   
    */
  var resolvedSourceVersion: js.UndefOr[NonEmptyString] = js.native
  /**
    *  An array of ProjectArtifacts objects. 
    */
  var secondaryArtifacts: js.UndefOr[BuildArtifactsList] = js.native
  /**
    *  An array of ProjectSourceVersion objects. Each ProjectSourceVersion must be one of:    For AWS CodeCommit: the commit ID, branch, or Git tag to use.   For GitHub: the commit ID, pull request ID, branch name, or tag name that corresponds to the version of the source code you want to build. If a pull request ID is specified, it must use the format pr/pull-request-ID (for example, pr/25). If a branch name is specified, the branch's HEAD commit ID is used. If not specified, the default branch's HEAD commit ID is used.   For Bitbucket: the commit ID, branch name, or tag name that corresponds to the version of the source code you want to build. If a branch name is specified, the branch's HEAD commit ID is used. If not specified, the default branch's HEAD commit ID is used.   For Amazon Simple Storage Service (Amazon S3): the version ID of the object that represents the build input ZIP file to use.  
    */
  var secondarySourceVersions: js.UndefOr[ProjectSecondarySourceVersions] = js.native
  /**
    *  An array of ProjectSource objects. 
    */
  var secondarySources: js.UndefOr[ProjectSources] = js.native
  /**
    * The name of a service role used for this build.
    */
  var serviceRole: js.UndefOr[NonEmptyString] = js.native
  /**
    * Information about the source code to be built.
    */
  var source: js.UndefOr[ProjectSource] = js.native
  /**
    * Any version identifier for the version of the source code to be built. If sourceVersion is specified at the project level, then this sourceVersion (at the build level) takes precedence.   For more information, see Source Version Sample with CodeBuild in the AWS CodeBuild User Guide. 
    */
  var sourceVersion: js.UndefOr[NonEmptyString] = js.native
  /**
    * When the build process started, expressed in Unix time format.
    */
  var startTime: js.UndefOr[js.Date] = js.native
  /**
    * How long, in minutes, for AWS CodeBuild to wait before timing out this build if it does not get marked as completed.
    */
  var timeoutInMinutes: js.UndefOr[WrapperInt] = js.native
  /**
    * If your AWS CodeBuild project accesses resources in an Amazon VPC, you provide this parameter that identifies the VPC ID and the list of security group IDs and subnet IDs. The security groups and subnets must belong to the same VPC. You must provide at least one security group and one subnet ID.
    */
  var vpcConfig: js.UndefOr[VpcConfig] = js.native
}

object Build {
  @scala.inline
  def apply(): Build = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Build]
  }
  @scala.inline
  implicit class BuildOps[Self <: Build] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withArn(value: NonEmptyString): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("arn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutArn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("arn")(js.undefined)
        ret
    }
    @scala.inline
    def withArtifacts(value: BuildArtifacts): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("artifacts")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutArtifacts: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("artifacts")(js.undefined)
        ret
    }
    @scala.inline
    def withBuildComplete(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("buildComplete")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBuildComplete: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("buildComplete")(js.undefined)
        ret
    }
    @scala.inline
    def withBuildNumber(value: WrapperLong): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("buildNumber")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBuildNumber: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("buildNumber")(js.undefined)
        ret
    }
    @scala.inline
    def withBuildStatus(value: StatusType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("buildStatus")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBuildStatus: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("buildStatus")(js.undefined)
        ret
    }
    @scala.inline
    def withCache(value: ProjectCache): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cache")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCache: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cache")(js.undefined)
        ret
    }
    @scala.inline
    def withCurrentPhase(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("currentPhase")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCurrentPhase: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("currentPhase")(js.undefined)
        ret
    }
    @scala.inline
    def withEncryptionKey(value: NonEmptyString): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("encryptionKey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEncryptionKey: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("encryptionKey")(js.undefined)
        ret
    }
    @scala.inline
    def withEndTime(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("endTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEndTime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("endTime")(js.undefined)
        ret
    }
    @scala.inline
    def withEnvironment(value: ProjectEnvironment): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("environment")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnvironment: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("environment")(js.undefined)
        ret
    }
    @scala.inline
    def withExportedEnvironmentVariables(value: ExportedEnvironmentVariables): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("exportedEnvironmentVariables")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExportedEnvironmentVariables: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("exportedEnvironmentVariables")(js.undefined)
        ret
    }
    @scala.inline
    def withFileSystemLocations(value: ProjectFileSystemLocations): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fileSystemLocations")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFileSystemLocations: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fileSystemLocations")(js.undefined)
        ret
    }
    @scala.inline
    def withId(value: NonEmptyString): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(js.undefined)
        ret
    }
    @scala.inline
    def withInitiator(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("initiator")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInitiator: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("initiator")(js.undefined)
        ret
    }
    @scala.inline
    def withLogs(value: LogsLocation): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("logs")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLogs: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("logs")(js.undefined)
        ret
    }
    @scala.inline
    def withNetworkInterface(value: NetworkInterface): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("networkInterface")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNetworkInterface: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("networkInterface")(js.undefined)
        ret
    }
    @scala.inline
    def withPhases(value: BuildPhases): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("phases")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPhases: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("phases")(js.undefined)
        ret
    }
    @scala.inline
    def withProjectName(value: NonEmptyString): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("projectName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProjectName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("projectName")(js.undefined)
        ret
    }
    @scala.inline
    def withQueuedTimeoutInMinutes(value: WrapperInt): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("queuedTimeoutInMinutes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutQueuedTimeoutInMinutes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("queuedTimeoutInMinutes")(js.undefined)
        ret
    }
    @scala.inline
    def withReportArns(value: BuildReportArns): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reportArns")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReportArns: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reportArns")(js.undefined)
        ret
    }
    @scala.inline
    def withResolvedSourceVersion(value: NonEmptyString): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resolvedSourceVersion")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutResolvedSourceVersion: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resolvedSourceVersion")(js.undefined)
        ret
    }
    @scala.inline
    def withSecondaryArtifacts(value: BuildArtifactsList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("secondaryArtifacts")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSecondaryArtifacts: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("secondaryArtifacts")(js.undefined)
        ret
    }
    @scala.inline
    def withSecondarySourceVersions(value: ProjectSecondarySourceVersions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("secondarySourceVersions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSecondarySourceVersions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("secondarySourceVersions")(js.undefined)
        ret
    }
    @scala.inline
    def withSecondarySources(value: ProjectSources): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("secondarySources")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSecondarySources: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("secondarySources")(js.undefined)
        ret
    }
    @scala.inline
    def withServiceRole(value: NonEmptyString): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("serviceRole")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutServiceRole: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("serviceRole")(js.undefined)
        ret
    }
    @scala.inline
    def withSource(value: ProjectSource): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("source")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSource: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("source")(js.undefined)
        ret
    }
    @scala.inline
    def withSourceVersion(value: NonEmptyString): Self = {
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
    def withStartTime(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("startTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStartTime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("startTime")(js.undefined)
        ret
    }
    @scala.inline
    def withTimeoutInMinutes(value: WrapperInt): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timeoutInMinutes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTimeoutInMinutes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timeoutInMinutes")(js.undefined)
        ret
    }
    @scala.inline
    def withVpcConfig(value: VpcConfig): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("vpcConfig")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVpcConfig: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("vpcConfig")(js.undefined)
        ret
    }
  }
  
}

