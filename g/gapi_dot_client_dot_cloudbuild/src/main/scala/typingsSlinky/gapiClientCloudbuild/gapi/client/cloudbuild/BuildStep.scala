package typingsSlinky.gapiClientCloudbuild.gapi.client.cloudbuild

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BuildStep extends js.Object {
  
  /**
    * A list of arguments that will be presented to the step when it is started.
    *
    * If the image used to run the step's container has an entrypoint, these args
    * will be used as arguments to that entrypoint. If the image does not define
    * an entrypoint, the first element in args will be used as the entrypoint,
    * and the remainder will be used as arguments.
    */
  var args: js.UndefOr[js.Array[String]] = js.native
  
  /**
    * Working directory (relative to project source root) to use when running
    * this operation's container.
    */
  var dir: js.UndefOr[String] = js.native
  
  /**
    * Optional entrypoint to be used instead of the build step image's default
    * If unset, the image's default will be used.
    */
  var entrypoint: js.UndefOr[String] = js.native
  
  /**
    * A list of environment variable definitions to be used when running a step.
    *
    * The elements are of the form "KEY=VALUE" for the environment variable "KEY"
    * being given the value "VALUE".
    */
  var env: js.UndefOr[js.Array[String]] = js.native
  
  /**
    * Optional unique identifier for this build step, used in wait_for to
    * reference this build step as a dependency.
    */
  var id: js.UndefOr[String] = js.native
  
  /**
    * The name of the container image that will run this particular build step.
    *
    * If the image is already available in the host's Docker daemon's cache, it
    * will be run directly. If not, the host will attempt to pull the image
    * first, using the builder service account's credentials if necessary.
    *
    * The Docker daemon's cache will already have the latest versions of all of
    * the officially supported build steps
    * ([https://github.com/GoogleCloudPlatform/cloud-builders](https://github.com/GoogleCloudPlatform/cloud-builders)).
    * The Docker daemon will also have cached many of the layers for some popular
    * images, like "ubuntu", "debian", but they will be refreshed at the time you
    * attempt to use them.
    *
    * If you built an image in a previous build step, it will be stored in the
    * host's Docker daemon's cache and is available to use as the name for a
    * later build step.
    */
  var name: js.UndefOr[String] = js.native
  
  /**
    * A list of environment variables which are encrypted using a Cloud KMS
    * crypto key. These values must be specified in the build's secrets.
    */
  var secretEnv: js.UndefOr[js.Array[String]] = js.native
  
  /**
    * List of volumes to mount into the build step.
    *
    * Each volume will be created as an empty volume prior to execution of the
    * build step. Upon completion of the build, volumes and their contents will
    * be discarded.
    *
    * Using a named volume in only one step is not valid as it is indicative
    * of a mis-configured build request.
    */
  var volumes: js.UndefOr[js.Array[Volume]] = js.native
  
  /**
    * The ID(s) of the step(s) that this build step depends on.
    * This build step will not start until all the build steps in wait_for
    * have completed successfully. If wait_for is empty, this build step will
    * start when all previous build steps in the Build.Steps list have completed
    * successfully.
    */
  var waitFor: js.UndefOr[js.Array[String]] = js.native
}
object BuildStep {
  
  @scala.inline
  def apply(): BuildStep = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BuildStep]
  }
  
  @scala.inline
  implicit class BuildStepOps[Self <: BuildStep] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setArgsVarargs(value: String*): Self = this.set("args", js.Array(value :_*))
    
    @scala.inline
    def setArgs(value: js.Array[String]): Self = this.set("args", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteArgs: Self = this.set("args", js.undefined)
    
    @scala.inline
    def setDir(value: String): Self = this.set("dir", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDir: Self = this.set("dir", js.undefined)
    
    @scala.inline
    def setEntrypoint(value: String): Self = this.set("entrypoint", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEntrypoint: Self = this.set("entrypoint", js.undefined)
    
    @scala.inline
    def setEnvVarargs(value: String*): Self = this.set("env", js.Array(value :_*))
    
    @scala.inline
    def setEnv(value: js.Array[String]): Self = this.set("env", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnv: Self = this.set("env", js.undefined)
    
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteId: Self = this.set("id", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    
    @scala.inline
    def setSecretEnvVarargs(value: String*): Self = this.set("secretEnv", js.Array(value :_*))
    
    @scala.inline
    def setSecretEnv(value: js.Array[String]): Self = this.set("secretEnv", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSecretEnv: Self = this.set("secretEnv", js.undefined)
    
    @scala.inline
    def setVolumesVarargs(value: Volume*): Self = this.set("volumes", js.Array(value :_*))
    
    @scala.inline
    def setVolumes(value: js.Array[Volume]): Self = this.set("volumes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVolumes: Self = this.set("volumes", js.undefined)
    
    @scala.inline
    def setWaitForVarargs(value: String*): Self = this.set("waitFor", js.Array(value :_*))
    
    @scala.inline
    def setWaitFor(value: js.Array[String]): Self = this.set("waitFor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWaitFor: Self = this.set("waitFor", js.undefined)
  }
}
