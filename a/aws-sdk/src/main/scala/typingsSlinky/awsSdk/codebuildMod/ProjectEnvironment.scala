package typingsSlinky.awsSdk.codebuildMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ProjectEnvironment extends js.Object {
  
  /**
    * The certificate to use with this build project.
    */
  var certificate: js.UndefOr[String] = js.native
  
  /**
    * Information about the compute resources the build project uses. Available values include:    BUILD_GENERAL1_SMALL: Use up to 3 GB memory and 2 vCPUs for builds.    BUILD_GENERAL1_MEDIUM: Use up to 7 GB memory and 4 vCPUs for builds.    BUILD_GENERAL1_LARGE: Use up to 16 GB memory and 8 vCPUs for builds, depending on your environment type.    BUILD_GENERAL1_2XLARGE: Use up to 145 GB memory, 72 vCPUs, and 824 GB of SSD storage for builds. This compute type supports Docker images up to 100 GB uncompressed.    If you use BUILD_GENERAL1_LARGE:     For environment type LINUX_CONTAINER, you can use up to 15 GB memory and 8 vCPUs for builds.     For environment type LINUX_GPU_CONTAINER, you can use up to 255 GB memory, 32 vCPUs, and 4 NVIDIA Tesla V100 GPUs for builds.    For environment type ARM_CONTAINER, you can use up to 16 GB memory and 8 vCPUs on ARM-based processors for builds.    For more information, see Build Environment Compute Types in the AWS CodeBuild User Guide. 
    */
  var computeType: ComputeType = js.native
  
  /**
    * A set of environment variables to make available to builds for this build project.
    */
  var environmentVariables: js.UndefOr[EnvironmentVariables] = js.native
  
  /**
    * The image tag or image digest that identifies the Docker image to use for this build project. Use the following formats:   For an image tag: registry/repository:tag. For example, to specify an image with the tag "latest," use registry/repository:latest.   For an image digest: registry/repository@digest. For example, to specify an image with the digest "sha256:cbbf2f9a99b47fc460d422812b6a5adff7dfee951d8fa2e4a98caa0382cfbdbf," use registry/repository@sha256:cbbf2f9a99b47fc460d422812b6a5adff7dfee951d8fa2e4a98caa0382cfbdbf.  
    */
  var image: NonEmptyString = js.native
  
  /**
    *  The type of credentials AWS CodeBuild uses to pull images in your build. There are two valid values:     CODEBUILD specifies that AWS CodeBuild uses its own credentials. This requires that you modify your ECR repository policy to trust AWS CodeBuild's service principal.     SERVICE_ROLE specifies that AWS CodeBuild uses your build project's service role.     When you use a cross-account or private registry image, you must use SERVICE_ROLE credentials. When you use an AWS CodeBuild curated image, you must use CODEBUILD credentials. 
    */
  var imagePullCredentialsType: js.UndefOr[ImagePullCredentialsType] = js.native
  
  /**
    * Enables running the Docker daemon inside a Docker container. Set to true only if the build project is used to build Docker images. Otherwise, a build that attempts to interact with the Docker daemon fails. The default setting is false. You can initialize the Docker daemon during the install phase of your build by adding one of the following sets of commands to the install phase of your buildspec file: If the operating system's base image is Ubuntu Linux:  - nohup /usr/local/bin/dockerd --host=unix:///var/run/docker.sock --host=tcp://0.0.0.0:2375 --storage-driver=overlay&amp;   - timeout 15 sh -c "until docker info; do echo .; sleep 1; done"  If the operating system's base image is Alpine Linux and the previous command does not work, add the -t argument to timeout:  - nohup /usr/local/bin/dockerd --host=unix:///var/run/docker.sock --host=tcp://0.0.0.0:2375 --storage-driver=overlay&amp;   - timeout -t 15 sh -c "until docker info; do echo .; sleep 1; done" 
    */
  var privilegedMode: js.UndefOr[WrapperBoolean] = js.native
  
  /**
    *  The credentials for access to a private registry.
    */
  var registryCredential: js.UndefOr[RegistryCredential] = js.native
  
  /**
    * The type of build environment to use for related builds.   The environment type ARM_CONTAINER is available only in regions US East (N. Virginia), US East (Ohio), US West (Oregon), EU (Ireland), Asia Pacific (Mumbai), Asia Pacific (Tokyo), Asia Pacific (Sydney), and EU (Frankfurt).   The environment type LINUX_CONTAINER with compute type build.general1.2xlarge is available only in regions US East (N. Virginia), US East (Ohio), US West (Oregon), Canada (Central), EU (Ireland), EU (London), EU (Frankfurt), Asia Pacific (Tokyo), Asia Pacific (Seoul), Asia Pacific (Singapore), Asia Pacific (Sydney), China (Beijing), and China (Ningxia).   The environment type LINUX_GPU_CONTAINER is available only in regions US East (N. Virginia), US East (Ohio), US West (Oregon), Canada (Central), EU (Ireland), EU (London), EU (Frankfurt), Asia Pacific (Tokyo), Asia Pacific (Seoul), Asia Pacific (Singapore), Asia Pacific (Sydney) , China (Beijing), and China (Ningxia).  
    */
  var `type`: EnvironmentType = js.native
}
object ProjectEnvironment {
  
  @scala.inline
  def apply(computeType: ComputeType, image: NonEmptyString, `type`: EnvironmentType): ProjectEnvironment = {
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
    def set(key: java.lang.String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setComputeType(value: ComputeType): Self = this.set("computeType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setImage(value: NonEmptyString): Self = this.set("image", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: EnvironmentType): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCertificate(value: String): Self = this.set("certificate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCertificate: Self = this.set("certificate", js.undefined)
    
    @scala.inline
    def setEnvironmentVariablesVarargs(value: EnvironmentVariable*): Self = this.set("environmentVariables", js.Array(value :_*))
    
    @scala.inline
    def setEnvironmentVariables(value: EnvironmentVariables): Self = this.set("environmentVariables", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnvironmentVariables: Self = this.set("environmentVariables", js.undefined)
    
    @scala.inline
    def setImagePullCredentialsType(value: ImagePullCredentialsType): Self = this.set("imagePullCredentialsType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteImagePullCredentialsType: Self = this.set("imagePullCredentialsType", js.undefined)
    
    @scala.inline
    def setPrivilegedMode(value: WrapperBoolean): Self = this.set("privilegedMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePrivilegedMode: Self = this.set("privilegedMode", js.undefined)
    
    @scala.inline
    def setRegistryCredential(value: RegistryCredential): Self = this.set("registryCredential", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRegistryCredential: Self = this.set("registryCredential", js.undefined)
  }
}
