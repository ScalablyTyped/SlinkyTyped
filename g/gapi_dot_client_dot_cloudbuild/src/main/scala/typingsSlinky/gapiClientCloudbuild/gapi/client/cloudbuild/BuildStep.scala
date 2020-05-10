package typingsSlinky.gapiClientCloudbuild.gapi.client.cloudbuild

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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
    def withArgs(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("args")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutArgs: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("args")(js.undefined)
        ret
    }
    @scala.inline
    def withDir(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dir")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDir: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dir")(js.undefined)
        ret
    }
    @scala.inline
    def withEntrypoint(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("entrypoint")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEntrypoint: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("entrypoint")(js.undefined)
        ret
    }
    @scala.inline
    def withEnv(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("env")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnv: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("env")(js.undefined)
        ret
    }
    @scala.inline
    def withId(value: String): Self = {
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
    def withSecretEnv(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("secretEnv")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSecretEnv: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("secretEnv")(js.undefined)
        ret
    }
    @scala.inline
    def withVolumes(value: js.Array[Volume]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("volumes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVolumes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("volumes")(js.undefined)
        ret
    }
    @scala.inline
    def withWaitFor(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("waitFor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWaitFor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("waitFor")(js.undefined)
        ret
    }
  }
  
}

