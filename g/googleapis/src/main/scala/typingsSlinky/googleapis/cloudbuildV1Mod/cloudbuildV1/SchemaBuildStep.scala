package typingsSlinky.googleapis.cloudbuildV1Mod.cloudbuildV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A step in the build pipeline.
  */
@js.native
trait SchemaBuildStep extends js.Object {
  /**
    * A list of arguments that will be presented to the step when it is
    * started.  If the image used to run the step&#39;s container has an
    * entrypoint, the `args` are used as arguments to that entrypoint. If the
    * image does not define an entrypoint, the first element in args is used as
    * the entrypoint, and the remainder will be used as arguments.
    */
  var args: js.UndefOr[js.Array[String]] = js.native
  /**
    * Working directory to use when running this step&#39;s container.  If this
    * value is a relative path, it is relative to the build&#39;s working
    * directory. If this value is absolute, it may be outside the build&#39;s
    * working directory, in which case the contents of the path may not be
    * persisted across build step executions, unless a `volume` for that path
    * is specified.  If the build specifies a `RepoSource` with `dir` and a
    * step with a `dir`, which specifies an absolute path, the `RepoSource`
    * `dir` is ignored for the step&#39;s execution.
    */
  var dir: js.UndefOr[String] = js.native
  /**
    * Entrypoint to be used instead of the build step image&#39;s default
    * entrypoint. If unset, the image&#39;s default entrypoint is used.
    */
  var entrypoint: js.UndefOr[String] = js.native
  /**
    * A list of environment variable definitions to be used when running a
    * step.  The elements are of the form &quot;KEY=VALUE&quot; for the
    * environment variable &quot;KEY&quot; being given the value
    * &quot;VALUE&quot;.
    */
  var env: js.UndefOr[js.Array[String]] = js.native
  /**
    * Unique identifier for this build step, used in `wait_for` to reference
    * this build step as a dependency.
    */
  var id: js.UndefOr[String] = js.native
  /**
    * Required. The name of the container image that will run this particular
    * build step.  If the image is available in the host&#39;s Docker
    * daemon&#39;s cache, it will be run directly. If not, the host will
    * attempt to pull the image first, using the builder service account&#39;s
    * credentials if necessary.  The Docker daemon&#39;s cache will already
    * have the latest versions of all of the officially supported build steps
    * ([https://github.com/GoogleCloudPlatform/cloud-builders](https://github.com/GoogleCloudPlatform/cloud-builders)).
    * The Docker daemon will also have cached many of the layers for some
    * popular images, like &quot;ubuntu&quot;, &quot;debian&quot;, but they
    * will be refreshed at the time you attempt to use them.  If you built an
    * image in a previous build step, it will be stored in the host&#39;s
    * Docker daemon&#39;s cache and is available to use as the name for a later
    * build step.
    */
  var name: js.UndefOr[String] = js.native
  /**
    * Output only. Stores timing information for pulling this build step&#39;s
    * builder image only.
    */
  var pullTiming: js.UndefOr[SchemaTimeSpan] = js.native
  /**
    * A list of environment variables which are encrypted using a Cloud Key
    * Management Service crypto key. These values must be specified in the
    * build&#39;s `Secret`.
    */
  var secretEnv: js.UndefOr[js.Array[String]] = js.native
  /**
    * Output only. Status of the build step. At this time, build step status is
    * only updated on build completion; step status is not updated in real-time
    * as the build progresses.
    */
  var status: js.UndefOr[String] = js.native
  /**
    * Time limit for executing this build step. If not defined, the step has no
    * time limit and will be allowed to continue to run until either it
    * completes or the build itself times out.
    */
  var timeout: js.UndefOr[String] = js.native
  /**
    * Output only. Stores timing information for executing this build step.
    */
  var timing: js.UndefOr[SchemaTimeSpan] = js.native
  /**
    * List of volumes to mount into the build step.  Each volume is created as
    * an empty volume prior to execution of the build step. Upon completion of
    * the build, volumes and their contents are discarded.  Using a named
    * volume in only one step is not valid as it is indicative of a build
    * request with an incorrect configuration.
    */
  var volumes: js.UndefOr[js.Array[SchemaVolume]] = js.native
  /**
    * The ID(s) of the step(s) that this build step depends on. This build step
    * will not start until all the build steps in `wait_for` have completed
    * successfully. If `wait_for` is empty, this build step will start when all
    * previous build steps in the `Build.Steps` list have completed
    * successfully.
    */
  var waitFor: js.UndefOr[js.Array[String]] = js.native
}

object SchemaBuildStep {
  @scala.inline
  def apply(): SchemaBuildStep = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaBuildStep]
  }
  @scala.inline
  implicit class SchemaBuildStepOps[Self <: SchemaBuildStep] (val x: Self) extends AnyVal {
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
    def withPullTiming(value: SchemaTimeSpan): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pullTiming")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPullTiming: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pullTiming")(js.undefined)
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
    def withStatus(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("status")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStatus: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("status")(js.undefined)
        ret
    }
    @scala.inline
    def withTimeout(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timeout")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTimeout: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timeout")(js.undefined)
        ret
    }
    @scala.inline
    def withTiming(value: SchemaTimeSpan): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timing")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTiming: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timing")(js.undefined)
        ret
    }
    @scala.inline
    def withVolumes(value: js.Array[SchemaVolume]): Self = {
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

