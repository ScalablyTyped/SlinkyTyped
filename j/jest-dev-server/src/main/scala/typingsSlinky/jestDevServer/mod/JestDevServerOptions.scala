package typingsSlinky.jestDevServer.mod

import typingsSlinky.jestDevServer.PartialWaitOnOptions
import typingsSlinky.jestDevServer.jestDevServerStrings.ask
import typingsSlinky.jestDevServer.jestDevServerStrings.error
import typingsSlinky.jestDevServer.jestDevServerStrings.http
import typingsSlinky.jestDevServer.jestDevServerStrings.https
import typingsSlinky.jestDevServer.jestDevServerStrings.ignore
import typingsSlinky.jestDevServer.jestDevServerStrings.kill
import typingsSlinky.jestDevServer.jestDevServerStrings.socket
import typingsSlinky.jestDevServer.jestDevServerStrings.tcp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait JestDevServerOptions extends js.Object {
  /**
    * Command to execute to start the port. Directly passed to spawnd.
    *
    * ```js
    * module.exports = {
    *   command: 'npm run start',
    * }
    * ```
    */
  var command: String = js.native
  /**
    * Log server output, useful if server is crashing at start.
    * @default false
    * ```js
    * module.exports = {
    *   command: 'npm run start',
    *   debug: true,
    * }
    * ```
    */
  var debug: js.UndefOr[Boolean] = js.native
  /**
    * Host to wait for activity on before considering the server running. Must be used in conjunction with port.
    * @default 'localhost'
    *
    * ```js
    * module.exports = {
    *   command: 'npm run start --port 3000',
    *   host: 'customhost.com',
    *   port: 3000
    * }
    * ```
    */
  var host: js.UndefOr[String] = js.native
  /**
    * How many milliseconds to wait for the spawned server to be available before giving up. Defaults to wait-port's default.
    * @default 5000
    * ```js
    * module.exports = {
    *   command: 'npm run start',
    *   launchTimeout: 30000,
    * }
    * ```
    */
  var launchTimeout: js.UndefOr[Double] = js.native
  /**
    * Port to wait for activity on before considering the server running. If not provided, the server is assumed to immediately be running.
    * @default null
    *
    * ```js
    * module.exports = {
    *   command: 'npm run start --port 3000',
    *   port: 3000,
    * }
    * ```
    */
  var port: js.UndefOr[Double] = js.native
  /**
    * To wait for an HTTP or TCP endpoint before considering the server running, include http or tcp as a protocol. Must be used in conjunction with port.
    * @default 'tcp'
    * ```js
    * module.exports = {
    *   command: 'npm run start --port 3000',
    *   protocol: 'http',
    *   port: 3000,
    * }
    * ```
    */
  var protocol: js.UndefOr[https | http | tcp | socket] = js.native
  /**
    * It defines the action to take if port is already used:
    * @default 'ask'
    *
    * - ask: a prompt is shown to decide if you want to kill the process or not
    * - error: an errow is thrown
    * - ignore: your test are executed, we assume that the server is already started
    * - kill: the process is automatically killed without a prompt
    *
    * ```js
    * module.exports = {
    *   command: 'npm run start --port 3000',
    *   port: 3000,
    *   usedPortAction: 'kill',
    * }
    */
  var usedPortAction: js.UndefOr[ask | error | ignore | kill] = js.native
  /**
    * jest-dev-server uses the wait-on npm package to wait for resources to become available before calling callback.
    * @default {}
    *
    * ```js
    * module.exports = {
    *   command: 'npm run start --port 3000',
    *   port: 3000,
    *   usedPortAction: 'kill',
    *   waitOnScheme: {
    *     delay: 1000,
    *   },
    * }
    */
  var waitOnScheme: js.UndefOr[PartialWaitOnOptions] = js.native
}

object JestDevServerOptions {
  @scala.inline
  def apply(command: String): JestDevServerOptions = {
    val __obj = js.Dynamic.literal(command = command.asInstanceOf[js.Any])
    __obj.asInstanceOf[JestDevServerOptions]
  }
  @scala.inline
  implicit class JestDevServerOptionsOps[Self <: JestDevServerOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCommand(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("command")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDebug(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("debug")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDebug: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("debug")(js.undefined)
        ret
    }
    @scala.inline
    def withHost(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("host")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHost: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("host")(js.undefined)
        ret
    }
    @scala.inline
    def withLaunchTimeout(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("launchTimeout")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLaunchTimeout: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("launchTimeout")(js.undefined)
        ret
    }
    @scala.inline
    def withPort(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("port")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPort: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("port")(js.undefined)
        ret
    }
    @scala.inline
    def withProtocol(value: https | http | tcp | socket): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("protocol")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProtocol: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("protocol")(js.undefined)
        ret
    }
    @scala.inline
    def withUsedPortAction(value: ask | error | ignore | kill): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("usedPortAction")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUsedPortAction: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("usedPortAction")(js.undefined)
        ret
    }
    @scala.inline
    def withWaitOnScheme(value: PartialWaitOnOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("waitOnScheme")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWaitOnScheme: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("waitOnScheme")(js.undefined)
        ret
    }
  }
  
}

