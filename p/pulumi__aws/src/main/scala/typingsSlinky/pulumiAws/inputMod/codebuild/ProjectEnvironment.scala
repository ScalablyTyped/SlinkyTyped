package typingsSlinky.pulumiAws.inputMod.codebuild

import typingsSlinky.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ProjectEnvironment extends js.Object {
  /**
    * The ARN of the S3 bucket, path prefix and object key that contains the PEM-encoded certificate.
    */
  var certificate: js.UndefOr[Input[String]] = js.native
  /**
    * Information about the compute resources the build project will use. Available values for this parameter are: `BUILD_GENERAL1_SMALL`, `BUILD_GENERAL1_MEDIUM`, `BUILD_GENERAL1_LARGE` or `BUILD_GENERAL1_2XLARGE`. `BUILD_GENERAL1_SMALL` is only valid if `type` is set to `LINUX_CONTAINER`. When `type` is set to `LINUX_GPU_CONTAINER`, `computeType` need to be `BUILD_GENERAL1_LARGE`.
    */
  var computeType: Input[String] = js.native
  /**
    * A set of environment variables to make available to builds for this build project.
    */
  var environmentVariables: js.UndefOr[Input[js.Array[Input[ProjectEnvironmentEnvironmentVariable]]]] = js.native
  /**
    * The Docker image to use for this build project. Valid values include [Docker images provided by CodeBuild](https://docs.aws.amazon.com/codebuild/latest/userguide/build-env-ref-available.html) (e.g `aws/codebuild/standard:2.0`), [Docker Hub images](https://hub.docker.com/) (e.g. `nginx:latest`), and full Docker repository URIs such as those for ECR (e.g. `137112412989.dkr.ecr.us-west-2.amazonaws.com/amazonlinux:latest`).
    */
  var image: Input[String] = js.native
  /**
    * The type of credentials AWS CodeBuild uses to pull images in your build. Available values for this parameter are `CODEBUILD` or `SERVICE_ROLE`. When you use a cross-account or private registry image, you must use SERVICE_ROLE credentials. When you use an AWS CodeBuild curated image, you must use CODEBUILD credentials. Default to `CODEBUILD`
    */
  var imagePullCredentialsType: js.UndefOr[Input[String]] = js.native
  /**
    * If set to true, enables running the Docker daemon inside a Docker container. Defaults to `false`.
    */
  var privilegedMode: js.UndefOr[Input[Boolean]] = js.native
  /**
    * Information about credentials for access to a private Docker registry. Registry Credential config blocks are documented below.
    */
  var registryCredential: js.UndefOr[Input[ProjectEnvironmentRegistryCredential]] = js.native
  /**
    * The type of repository that contains the source code to be built. Valid values for this parameter are: `CODECOMMIT`, `CODEPIPELINE`, `GITHUB`, `GITHUB_ENTERPRISE`, `BITBUCKET` or `S3`.
    */
  var `type`: Input[String] = js.native
}

object ProjectEnvironment {
  @scala.inline
  def apply(computeType: Input[String], image: Input[String], `type`: Input[String]): ProjectEnvironment = {
    val __obj = js.Dynamic.literal(computeType = computeType.asInstanceOf[js.Any], image = image.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProjectEnvironment]
  }
  @scala.inline
  implicit class ProjectEnvironmentOps[Self <: ProjectEnvironment] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withComputeType(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("computeType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withImage(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("image")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withType(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCertificate(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("certificate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCertificate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("certificate")(js.undefined)
        ret
    }
    @scala.inline
    def withEnvironmentVariables(value: Input[js.Array[Input[ProjectEnvironmentEnvironmentVariable]]]): Self = {
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
    def withImagePullCredentialsType(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("imagePullCredentialsType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutImagePullCredentialsType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("imagePullCredentialsType")(js.undefined)
        ret
    }
    @scala.inline
    def withPrivilegedMode(value: Input[Boolean]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("privilegedMode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPrivilegedMode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("privilegedMode")(js.undefined)
        ret
    }
    @scala.inline
    def withRegistryCredential(value: Input[ProjectEnvironmentRegistryCredential]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("registryCredential")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRegistryCredential: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("registryCredential")(js.undefined)
        ret
    }
  }
  
}

