package typingsSlinky.nodeWindows.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ServiceConfig extends js.Object {
  /**
    * @cfg {Boolean} [abortOnError=false]
    * Setting this to `true` will force the process to exit if it encounters an error that stops the node.js script from running.
    * This does not mean the process will stop if the script throws an error. It will only abort if the
    * script throws an error causing the process to exit (i.e. `process.exit(1)`).
    */
  var abortOnError: js.UndefOr[Boolean] = js.native
  var description: js.UndefOr[String] = js.native
  /**
    * @cfg {Array|Object} [env]
    * An optional array or object used to pass environment variables to the node.js script.
    * You can do this by setting environment variables in the service config, as shown below:
    *
    *     var svc = new Service({
    *      name:'Hello World',
    *      description: 'The nodejs.org example web server.',
    *      script: 'C:\\path\\to\\helloworld.js',
    *      env: {
    *        name: "NODE_ENV",
    *        value: "production"
    *      }
    *     });
    *
    * You can also supply an array to set multiple environment variables:
    *
    *     var svc = new Service({
    *      name:'Hello World',
    *      description: 'The nodejs.org example web server.',
    *      script: 'C:\\path\\to\\helloworld.js',
    *      env: [{
    *        name: "HOME",
    *        value: process.env["USERPROFILE"] // Access the user home directory
    *      },{
    *        name: "NODE_ENV",
    *        value: "production"
    *      }]
    *     });
    */
  var env: js.UndefOr[EnvironmentPair | js.Array[EnvironmentPair]] = js.native
  /**
    * @cfg {String} execPath
    * The absolute path to the executable that will launch the script.
    * If omitted process.execPath is used.
    */
  var execPath: js.UndefOr[String] = js.native
  /**
    * @cfg {Number} [grow=.25]
    * A number between 0-1 representing the percentage growth rate for the #wait interval.
    * Setting this to anything other than `0` allows the process to increase it's wait period
    * on every restart attempt. If a process dies fatally, this will prevent the server from
    * restarting the process too rapidly (and too strenuously).
    */
  var grow: js.UndefOr[Double] = js.native
  var logmode: js.UndefOr[LogMode] = js.native
  var logpath: js.UndefOr[String] = js.native
  /**
    * @cfg {Number} [maxRestarts=3]
    * The maximum number of restarts within a 60 second period before haulting the process.
    * This cannot be _disabled_, but it can be rendered ineffective by setting a value of `0`.
    */
  var maxRestarts: js.UndefOr[Double] = js.native
  /**
    * @cfg {Number} [maxRetries=null]
    * The maximum number of restart attempts to make before the service is considered non-responsive/faulty.
    * Ignored by default.
    */
  var maxRetries: js.UndefOr[Double] = js.native
  var name: js.UndefOr[String] = js.native
  /**
    * @cfg {string} [nodeOptions='--harmony']
    * Options to be passed to the node process.
    */
  var nodeOptions: js.UndefOr[String] = js.native
  /**
    * @cfg {String} script
    * The absolute path of the script to launch as a service.
    * @required
    */
  var script: String = js.native
  /**
    * @cfg {Boolean} [stopparentfirst=false]
    * Allow the service to shutdown cleanly.
    */
  var stopparentfirst: js.UndefOr[Boolean] = js.native
  /**
    * @cfg {Number} [stoptimeout=30]
    * How long to wait in seconds before force killing the application.
    * This only takes effect when stopparentfirst is enabled.
    */
  var stoptimeout: js.UndefOr[Double] = js.native
  /**
    * @cfg {Number} [wait=1]
    * The initial number of seconds to wait before attempting a restart (after the script stops).
    */
  @JSName("wait")
  var wait_FServiceConfig: js.UndefOr[Double] = js.native
}

object ServiceConfig {
  @scala.inline
  def apply(script: String): ServiceConfig = {
    val __obj = js.Dynamic.literal(script = script.asInstanceOf[js.Any])
    __obj.asInstanceOf[ServiceConfig]
  }
  @scala.inline
  implicit class ServiceConfigOps[Self <: ServiceConfig] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withScript(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("script")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAbortOnError(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("abortOnError")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAbortOnError: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("abortOnError")(js.undefined)
        ret
    }
    @scala.inline
    def withDescription(value: String): Self = {
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
    def withEnv(value: EnvironmentPair | js.Array[EnvironmentPair]): Self = {
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
    def withExecPath(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("execPath")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExecPath: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("execPath")(js.undefined)
        ret
    }
    @scala.inline
    def withGrow(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("grow")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGrow: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("grow")(js.undefined)
        ret
    }
    @scala.inline
    def withLogmode(value: LogMode): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("logmode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLogmode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("logmode")(js.undefined)
        ret
    }
    @scala.inline
    def withLogpath(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("logpath")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLogpath: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("logpath")(js.undefined)
        ret
    }
    @scala.inline
    def withMaxRestarts(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxRestarts")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxRestarts: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxRestarts")(js.undefined)
        ret
    }
    @scala.inline
    def withMaxRetries(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxRetries")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxRetries: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxRetries")(js.undefined)
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
    def withNodeOptions(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nodeOptions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNodeOptions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nodeOptions")(js.undefined)
        ret
    }
    @scala.inline
    def withStopparentfirst(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stopparentfirst")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStopparentfirst: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stopparentfirst")(js.undefined)
        ret
    }
    @scala.inline
    def withStoptimeout(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stoptimeout")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStoptimeout: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stoptimeout")(js.undefined)
        ret
    }
    @scala.inline
    def withWait(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("wait")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWait: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("wait")(js.undefined)
        ret
    }
  }
  
}

