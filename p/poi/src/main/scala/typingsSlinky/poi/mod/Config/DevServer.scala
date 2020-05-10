package typingsSlinky.poi.mod.Config

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.connectHistoryApiFallback.mod.Options
import typingsSlinky.express.mod.Application_
import typingsSlinky.node.httpsMod.ServerOptions
import typingsSlinky.webpack.mod.Compiler_
import typingsSlinky.webpackDevServer.mod.ProxyConfigArray
import typingsSlinky.webpackDevServer.mod.ProxyConfigMap
import typingsSlinky.webpackDevServer.mod.WebpackDevServer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DevServer extends js.Object {
  var after: js.UndefOr[
    js.Function3[/* app */ Application_, /* server */ WebpackDevServer, /* compiler */ Compiler_, Unit]
  ] = js.native
  var before: js.UndefOr[
    js.Function3[/* app */ Application_, /* server */ WebpackDevServer, /* compiler */ Compiler_, Unit]
  ] = js.native
  var headers: js.UndefOr[StringDictionary[String]] = js.native
  var historyApiFallback: js.UndefOr[Boolean | Options] = js.native
  var host: js.UndefOr[String] = js.native
  var hot: js.UndefOr[Boolean] = js.native
  var hotEntries: js.UndefOr[js.Array[String]] = js.native
  var hotOnly: js.UndefOr[Boolean] = js.native
  var https: js.UndefOr[Boolean | ServerOptions] = js.native
  var open: js.UndefOr[Boolean] = js.native
  var port: js.UndefOr[String | Double] = js.native
  var proxy: js.UndefOr[String | ProxyConfigMap | ProxyConfigArray] = js.native
}

object DevServer {
  @scala.inline
  def apply(): DevServer = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DevServer]
  }
  @scala.inline
  implicit class DevServerOps[Self <: DevServer] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAfter(value: (/* app */ Application_, /* server */ WebpackDevServer, /* compiler */ Compiler_) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("after")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withoutAfter: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("after")(js.undefined)
        ret
    }
    @scala.inline
    def withBefore(value: (/* app */ Application_, /* server */ WebpackDevServer, /* compiler */ Compiler_) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("before")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withoutBefore: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("before")(js.undefined)
        ret
    }
    @scala.inline
    def withHeaders(value: StringDictionary[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("headers")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHeaders: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("headers")(js.undefined)
        ret
    }
    @scala.inline
    def withHistoryApiFallback(value: Boolean | Options): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("historyApiFallback")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHistoryApiFallback: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("historyApiFallback")(js.undefined)
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
    def withHot(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hot")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHot: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hot")(js.undefined)
        ret
    }
    @scala.inline
    def withHotEntries(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hotEntries")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHotEntries: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hotEntries")(js.undefined)
        ret
    }
    @scala.inline
    def withHotOnly(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hotOnly")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHotOnly: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hotOnly")(js.undefined)
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
    def withOpen(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("open")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOpen: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("open")(js.undefined)
        ret
    }
    @scala.inline
    def withPort(value: String | Double): Self = {
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
    def withProxy(value: String | ProxyConfigMap | ProxyConfigArray): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("proxy")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProxy: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("proxy")(js.undefined)
        ret
    }
  }
  
}

