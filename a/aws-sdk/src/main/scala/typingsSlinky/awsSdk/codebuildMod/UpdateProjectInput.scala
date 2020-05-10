package typingsSlinky.awsSdk.codebuildMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateProjectInput extends js.Object {
  /**
    * Information to be changed about the build output artifacts for the build project.
    */
  var artifacts: js.UndefOr[ProjectArtifacts] = js.native
  /**
    * Set this to true to generate a publicly accessible URL for your project's build badge.
    */
  var badgeEnabled: js.UndefOr[WrapperBoolean] = js.native
  /**
    * Stores recently used information so that it can be quickly accessed at a later time.
    */
  var cache: js.UndefOr[ProjectCache] = js.native
  /**
    * A new or replacement description of the build project.
    */
  var description: js.UndefOr[ProjectDescription] = js.native
  /**
    * The AWS Key Management Service (AWS KMS) customer master key (CMK) to be used for encrypting the build output artifacts.   You can use a cross-account KMS key to encrypt the build output artifacts if your service role has permission to that key.   You can specify either the Amazon Resource Name (ARN) of the CMK or, if available, the CMK's alias (using the format alias/alias-name ).
    */
  var encryptionKey: js.UndefOr[NonEmptyString] = js.native
  /**
    * Information to be changed about the build environment for the build project.
    */
  var environment: js.UndefOr[ProjectEnvironment] = js.native
  /**
    *  An array of ProjectFileSystemLocation objects for a CodeBuild build project. A ProjectFileSystemLocation object specifies the identifier, location, mountOptions, mountPoint, and type of a file system created using Amazon Elastic File System. 
    */
  var fileSystemLocations: js.UndefOr[ProjectFileSystemLocations] = js.native
  /**
    *  Information about logs for the build project. A project can create logs in Amazon CloudWatch Logs, logs in an S3 bucket, or both. 
    */
  var logsConfig: js.UndefOr[LogsConfig] = js.native
  /**
    * The name of the build project.  You cannot change a build project's name. 
    */
  var name: NonEmptyString = js.native
  /**
    *  The number of minutes a build is allowed to be queued before it times out. 
    */
  var queuedTimeoutInMinutes: js.UndefOr[TimeOut] = js.native
  /**
    *  An array of ProjectSource objects. 
    */
  var secondaryArtifacts: js.UndefOr[ProjectArtifactsList] = js.native
  /**
    *  An array of ProjectSourceVersion objects. If secondarySourceVersions is specified at the build level, then they take over these secondarySourceVersions (at the project level). 
    */
  var secondarySourceVersions: js.UndefOr[ProjectSecondarySourceVersions] = js.native
  /**
    *  An array of ProjectSource objects. 
    */
  var secondarySources: js.UndefOr[ProjectSources] = js.native
  /**
    * The replacement ARN of the AWS Identity and Access Management (IAM) role that enables AWS CodeBuild to interact with dependent AWS services on behalf of the AWS account.
    */
  var serviceRole: js.UndefOr[NonEmptyString] = js.native
  /**
    * Information to be changed about the build input source code for the build project.
    */
  var source: js.UndefOr[ProjectSource] = js.native
  /**
    *  A version of the build input to be built for this project. If not specified, the latest version is used. If specified, it must be one of:    For AWS CodeCommit: the commit ID, branch, or Git tag to use.   For GitHub: the commit ID, pull request ID, branch name, or tag name that corresponds to the version of the source code you want to build. If a pull request ID is specified, it must use the format pr/pull-request-ID (for example pr/25). If a branch name is specified, the branch's HEAD commit ID is used. If not specified, the default branch's HEAD commit ID is used.   For Bitbucket: the commit ID, branch name, or tag name that corresponds to the version of the source code you want to build. If a branch name is specified, the branch's HEAD commit ID is used. If not specified, the default branch's HEAD commit ID is used.   For Amazon Simple Storage Service (Amazon S3): the version ID of the object that represents the build input ZIP file to use.    If sourceVersion is specified at the build level, then that version takes precedence over this sourceVersion (at the project level).   For more information, see Source Version Sample with CodeBuild in the AWS CodeBuild User Guide. 
    */
  var sourceVersion: js.UndefOr[String] = js.native
  /**
    * The replacement set of tags for this build project. These tags are available for use by AWS services that support AWS CodeBuild build project tags.
    */
  var tags: js.UndefOr[TagList] = js.native
  /**
    * The replacement value in minutes, from 5 to 480 (8 hours), for AWS CodeBuild to wait before timing out any related build that did not get marked as completed.
    */
  var timeoutInMinutes: js.UndefOr[TimeOut] = js.native
  /**
    * VpcConfig enables AWS CodeBuild to access resources in an Amazon VPC.
    */
  var vpcConfig: js.UndefOr[VpcConfig] = js.native
}

object UpdateProjectInput {
  @scala.inline
  def apply(name: NonEmptyString): UpdateProjectInput = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateProjectInput]
  }
  @scala.inline
  implicit class UpdateProjectInputOps[Self <: UpdateProjectInput] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withName(value: NonEmptyString): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withArtifacts(value: ProjectArtifacts): Self = {
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
    def withBadgeEnabled(value: WrapperBoolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("badgeEnabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBadgeEnabled: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("badgeEnabled")(js.undefined)
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
    def withDescription(value: ProjectDescription): Self = {
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
    def withLogsConfig(value: LogsConfig): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("logsConfig")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLogsConfig: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("logsConfig")(js.undefined)
        ret
    }
    @scala.inline
    def withQueuedTimeoutInMinutes(value: TimeOut): Self = {
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
    def withSecondaryArtifacts(value: ProjectArtifactsList): Self = {
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
    def withTags(value: TagList): Self = {
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
    def withTimeoutInMinutes(value: TimeOut): Self = {
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

