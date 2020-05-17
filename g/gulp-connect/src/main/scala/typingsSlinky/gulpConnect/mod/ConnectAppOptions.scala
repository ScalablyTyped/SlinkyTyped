package typingsSlinky.gulpConnect.mod

import typingsSlinky.connect.mod.HandleFunction
import typingsSlinky.gulpConnect.anon.TypeofconnectModule
import typingsSlinky.node.httpMod.Server
import typingsSlinky.node.httpsMod.ServerOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ConnectAppOptions extends js.Object {
  /** Whether or not to log debug messages. Defaults to false. */
  var debug: js.UndefOr[Boolean] = js.native
  /** File to serve if url results in a 404. Defaults to undefined */
  var fallback: js.UndefOr[String] = js.native
  /** Host to bind server to. Defaults to localhost. */
  var host: js.UndefOr[String] = js.native
  /**
    * Options to pass to http.createServer (or false to disable https).
    * Defaults to false. When https is just set to true, then internally
    * some defaults will be used.
    */
  var https: js.UndefOr[Boolean | ServerOptions] = js.native
  /** Value to pass into the serve-static's index option. See serve-static documentation for details. Defaults to true. */
  var index: js.UndefOr[Boolean | String | js.Array[String]] = js.native
  /** Enable/disable livereload or set live reload options. Defaults to false. */
  var livereload: js.UndefOr[Boolean | LiveReloadOptions] = js.native
  /** Middleware factory function which should return a list of connect handler functions . Defaults to () => []; */
  var middleware: js.UndefOr[MiddlewareFactory] = js.native
  /** The name of this server. Used in logs. Defaults to "Server". */
  var name: js.UndefOr[String] = js.native
  /** The connect webserver port. Defaults to 8080 */
  var port: js.UndefOr[Double] = js.native
  /** The root path. Defaults to directory with gulpfile */
  var root: js.UndefOr[String | js.Array[String]] = js.native
  /** A function to run custom initialization on the underlying http or https server */
  var serverInit: js.UndefOr[js.Function1[/* server */ Server | typingsSlinky.node.httpsMod.Server, Unit]] = js.native
  /** Don't log any messages. Defaults to false. */
  var silent: js.UndefOr[Boolean] = js.native
}

object ConnectAppOptions {
  @scala.inline
  def apply(): ConnectAppOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ConnectAppOptions]
  }
  @scala.inline
  implicit class ConnectAppOptionsOps[Self <: ConnectAppOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
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
    def withFallback(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fallback")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFallback: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fallback")(js.undefined)
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
    def withHttps(value: Boolean | ServerOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("https")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHttps: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("https")(js.undefined)
        ret
    }
    @scala.inline
    def withIndex(value: Boolean | String | js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("index")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIndex: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("index")(js.undefined)
        ret
    }
    @scala.inline
    def withLivereload(value: Boolean | LiveReloadOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("livereload")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLivereload: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("livereload")(js.undefined)
        ret
    }
    @scala.inline
    def withMiddleware(
      value: (/* connect */ js.Function0[typingsSlinky.connect.mod.Server] with TypeofconnectModule, /* options */ ConnectAppOptions) => js.Array[HandleFunction | ConnectRouteHandler]
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("middleware")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutMiddleware: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("middleware")(js.undefined)
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
    def withRoot(value: String | js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("root")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRoot: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("root")(js.undefined)
        ret
    }
    @scala.inline
    def withServerInit(value: /* server */ Server | typingsSlinky.node.httpsMod.Server => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("serverInit")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutServerInit: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("serverInit")(js.undefined)
        ret
    }
    @scala.inline
    def withSilent(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("silent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSilent: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("silent")(js.undefined)
        ret
    }
  }
  
}

