package typingsSlinky.googleapis.v2alpha1Mod.genomicsV2alpha1

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Specifies a single action that runs a Docker container.
  */
@js.native
trait SchemaAction extends js.Object {
  /**
    * If specified, overrides the `CMD` specified in the container. If the
    * container also has an `ENTRYPOINT` the values are used as entrypoint
    * arguments. Otherwise, they are used as a command and arguments to run
    * inside the container.
    */
  var commands: js.UndefOr[js.Array[String]] = js.native
  /**
    * If the specified image is hosted on a private registry other than Google
    * Container Registry, the credentials required to pull the image must be
    * specified here as an encrypted secret.  The secret must decrypt to a
    * JSON-encoded dictionary containing both `username` and `password` keys.
    */
  var credentials: js.UndefOr[SchemaSecret] = js.native
  /**
    * If specified, overrides the `ENTRYPOINT` specified in the container.
    */
  var entrypoint: js.UndefOr[String] = js.native
  /**
    * The environment to pass into the container. This environment is merged
    * with any values specified in the `Pipeline` message. These values
    * overwrite any in the `Pipeline` message.  In addition to the values
    * passed here, a few other values are automatically injected into the
    * environment. These cannot be hidden or overwritten.
    * `GOOGLE_PIPELINE_FAILED` will be set to &quot;1&quot; if the pipeline
    * failed because an action has exited with a non-zero status (and did not
    * have the `IGNORE_EXIT_STATUS` flag set). This can be used to determine if
    * additional debug or logging actions should execute.
    * `GOOGLE_LAST_EXIT_STATUS` will be set to the exit status of the last
    * non-background action that executed. This can be used by workflow engine
    * authors to determine whether an individual action has succeeded or
    * failed.
    */
  var environment: js.UndefOr[StringDictionary[String]] = js.native
  /**
    * The set of flags to apply to this action.
    */
  var flags: js.UndefOr[js.Array[String]] = js.native
  /**
    * The URI to pull the container image from. Note that all images referenced
    * by actions in the pipeline are pulled before the first action runs. If
    * multiple actions reference the same image, it is only pulled once,
    * ensuring that the same image is used for all actions in a single
    * pipeline.
    */
  var imageUri: js.UndefOr[String] = js.native
  /**
    * Labels to associate with the action. This field is provided to assist
    * workflow engine authors in identifying actions (for example, to indicate
    * what sort of action they perform, such as localization or debugging).
    * They are returned in the operation metadata, but are otherwise ignored.
    */
  var labels: js.UndefOr[StringDictionary[String]] = js.native
  /**
    * A list of mounts to make available to the action.  In addition to the
    * values specified here, every action has a special virtual disk mounted
    * under `/google` that contains log files and other operational components.
    * &lt;ul&gt;   &lt;li&gt;&lt;code&gt;/google/logs&lt;/code&gt; All logs
    * written during the pipeline   execution.&lt;/li&gt;
    * &lt;li&gt;&lt;code&gt;/google/logs/output&lt;/code&gt; The combined
    * standard output and   standard error of all actions run as part of the
    * pipeline   execution.&lt;/li&gt;
    * &lt;li&gt;&lt;code&gt;/google/logs/action/x/stdout&lt;/code&gt; The
    * complete contents of   each individual action&#39;s standard
    * output.&lt;/li&gt;
    * &lt;li&gt;&lt;code&gt;/google/logs/action/x/stderr&lt;/code&gt; The
    * complete contents of   each individual action&#39;s standard error
    * output.&lt;/li&gt; &lt;/ul&gt;
    */
  var mounts: js.UndefOr[js.Array[SchemaMount]] = js.native
  /**
    * An optional name for the container. The container hostname will be set to
    * this name, making it useful for inter-container communication. The name
    * must contain only upper and lowercase alphanumeric characters and hypens
    * and cannot start with a hypen.
    */
  var name: js.UndefOr[String] = js.native
  /**
    * An optional identifier for a PID namespace to run the action inside.
    * Multiple actions should use the same string to share a namespace.  If
    * unspecified, a separate isolated namespace is used.
    */
  var pidNamespace: js.UndefOr[String] = js.native
  /**
    * A map of containers to host port mappings for this container. If the
    * container already specifies exposed ports, use the
    * `PUBLISH_EXPOSED_PORTS` flag instead.  The host port number must be less
    * than 65536. If it is zero, an unused random port is assigned. To
    * determine the resulting port number, consult the `ContainerStartedEvent`
    * in the operation metadata.
    */
  var portMappings: js.UndefOr[StringDictionary[Double]] = js.native
  /**
    * The maximum amount of time to give the action to complete. If the action
    * fails to complete before the timeout, it will be terminated and the exit
    * status will be non-zero. The pipeline will continue or terminate based on
    * the rules defined by the `ALWAYS_RUN` and `IGNORE_EXIT_STATUS` flags.
    */
  var timeout: js.UndefOr[String] = js.native
}

object SchemaAction {
  @scala.inline
  def apply(): SchemaAction = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaAction]
  }
  @scala.inline
  implicit class SchemaActionOps[Self <: SchemaAction] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCommands(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("commands")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCommands: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("commands")(js.undefined)
        ret
    }
    @scala.inline
    def withCredentials(value: SchemaSecret): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("credentials")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCredentials: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("credentials")(js.undefined)
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
    def withEnvironment(value: StringDictionary[String]): Self = {
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
    def withFlags(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("flags")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFlags: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("flags")(js.undefined)
        ret
    }
    @scala.inline
    def withImageUri(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("imageUri")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutImageUri: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("imageUri")(js.undefined)
        ret
    }
    @scala.inline
    def withLabels(value: StringDictionary[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("labels")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLabels: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("labels")(js.undefined)
        ret
    }
    @scala.inline
    def withMounts(value: js.Array[SchemaMount]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mounts")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMounts: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mounts")(js.undefined)
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
    def withPidNamespace(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pidNamespace")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPidNamespace: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pidNamespace")(js.undefined)
        ret
    }
    @scala.inline
    def withPortMappings(value: StringDictionary[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("portMappings")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPortMappings: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("portMappings")(js.undefined)
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
  }
  
}

