package typingsSlinky.pulumiAws.projectMod

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.pulumiAws.inputMod.codebuild.ProjectArtifacts
import typingsSlinky.pulumiAws.inputMod.codebuild.ProjectCache
import typingsSlinky.pulumiAws.inputMod.codebuild.ProjectEnvironment
import typingsSlinky.pulumiAws.inputMod.codebuild.ProjectLogsConfig
import typingsSlinky.pulumiAws.inputMod.codebuild.ProjectSecondaryArtifact
import typingsSlinky.pulumiAws.inputMod.codebuild.ProjectSecondarySource
import typingsSlinky.pulumiAws.inputMod.codebuild.ProjectSource
import typingsSlinky.pulumiAws.inputMod.codebuild.ProjectVpcConfig
import typingsSlinky.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ProjectArgs extends js.Object {
  /**
    * Information about the project's build output artifacts. Artifact blocks are documented below.
    */
  val artifacts: Input[ProjectArtifacts] = js.native
  /**
    * Generates a publicly-accessible URL for the projects build badge. Available as `badgeUrl` attribute when enabled.
    */
  val badgeEnabled: js.UndefOr[Input[Boolean]] = js.native
  /**
    * How long in minutes, from 5 to 480 (8 hours), for AWS CodeBuild to wait until timing out any related build that does not get marked as completed. The default is 60 minutes.
    */
  val buildTimeout: js.UndefOr[Input[Double]] = js.native
  /**
    * Information about the cache storage for the project. Cache blocks are documented below.
    */
  val cache: js.UndefOr[Input[ProjectCache]] = js.native
  /**
    * A short description of the project.
    */
  val description: js.UndefOr[Input[String]] = js.native
  /**
    * The AWS Key Management Service (AWS KMS) customer master key (CMK) to be used for encrypting the build project's build output artifacts.
    */
  val encryptionKey: js.UndefOr[Input[String]] = js.native
  /**
    * Information about the project's build environment. Environment blocks are documented below.
    */
  val environment: Input[ProjectEnvironment] = js.native
  /**
    * Configuration for the builds to store log data to CloudWatch or S3.
    */
  val logsConfig: js.UndefOr[Input[ProjectLogsConfig]] = js.native
  /**
    * The name of the project. If `type` is set to `S3`, this is the name of the output artifact object
    */
  val name: js.UndefOr[Input[String]] = js.native
  /**
    * How long in minutes, from 5 to 480 (8 hours), a build is allowed to be queued before it times out. The default is 8 hours.
    */
  val queuedTimeout: js.UndefOr[Input[Double]] = js.native
  /**
    * A set of secondary artifacts to be used inside the build. Secondary artifacts blocks are documented below.
    */
  val secondaryArtifacts: js.UndefOr[Input[js.Array[Input[ProjectSecondaryArtifact]]]] = js.native
  /**
    * A set of secondary sources to be used inside the build. Secondary sources blocks are documented below.
    */
  val secondarySources: js.UndefOr[Input[js.Array[Input[ProjectSecondarySource]]]] = js.native
  /**
    * The Amazon Resource Name (ARN) of the AWS Identity and Access Management (IAM) role that enables AWS CodeBuild to interact with dependent AWS services on behalf of the AWS account.
    */
  val serviceRole: Input[String] = js.native
  /**
    * Information about the project's input source code. Source blocks are documented below.
    */
  val source: Input[ProjectSource] = js.native
  /**
    * A version of the build input to be built for this project. If not specified, the latest version is used.
    */
  val sourceVersion: js.UndefOr[Input[String]] = js.native
  /**
    * A mapping of tags to assign to the resource.
    */
  val tags: js.UndefOr[Input[StringDictionary[_]]] = js.native
  /**
    * Configuration for the builds to run inside a VPC. VPC config blocks are documented below.
    */
  val vpcConfig: js.UndefOr[Input[ProjectVpcConfig]] = js.native
}

object ProjectArgs {
  @scala.inline
  def apply(
    artifacts: Input[ProjectArtifacts],
    environment: Input[ProjectEnvironment],
    serviceRole: Input[String],
    source: Input[ProjectSource]
  ): ProjectArgs = {
    val __obj = js.Dynamic.literal(artifacts = artifacts.asInstanceOf[js.Any], environment = environment.asInstanceOf[js.Any], serviceRole = serviceRole.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProjectArgs]
  }
  @scala.inline
  implicit class ProjectArgsOps[Self <: ProjectArgs] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withArtifacts(value: Input[ProjectArtifacts]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("artifacts")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEnvironment(value: Input[ProjectEnvironment]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("environment")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withServiceRole(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("serviceRole")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSource(value: Input[ProjectSource]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("source")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBadgeEnabled(value: Input[Boolean]): Self = {
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
    def withBuildTimeout(value: Input[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("buildTimeout")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBuildTimeout: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("buildTimeout")(js.undefined)
        ret
    }
    @scala.inline
    def withCache(value: Input[ProjectCache]): Self = {
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
    def withDescription(value: Input[String]): Self = {
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
    def withEncryptionKey(value: Input[String]): Self = {
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
    def withLogsConfig(value: Input[ProjectLogsConfig]): Self = {
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
    def withName(value: Input[String]): Self = {
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
    def withQueuedTimeout(value: Input[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("queuedTimeout")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutQueuedTimeout: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("queuedTimeout")(js.undefined)
        ret
    }
    @scala.inline
    def withSecondaryArtifacts(value: Input[js.Array[Input[ProjectSecondaryArtifact]]]): Self = {
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
    def withSecondarySources(value: Input[js.Array[Input[ProjectSecondarySource]]]): Self = {
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
    def withSourceVersion(value: Input[String]): Self = {
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
    def withTags(value: Input[StringDictionary[_]]): Self = {
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
    def withVpcConfig(value: Input[ProjectVpcConfig]): Self = {
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

