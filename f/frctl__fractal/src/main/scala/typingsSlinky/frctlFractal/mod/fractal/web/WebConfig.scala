package typingsSlinky.frctlFractal.mod.fractal.web

import typingsSlinky.frctlFractal.mod.WebTheme
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WebConfig extends js.Object {
  var builder: js.UndefOr[WebBuilderConfig] = js.native
  @JSName("builder.concurrency")
  var builderDotconcurrency: js.UndefOr[Double] = js.native
  @JSName("builder.dest")
  var builderDotdest: js.UndefOr[String] = js.native
  @JSName("builder.ext")
  var builderDotext: js.UndefOr[String] = js.native
  @JSName("builder.theme")
  var builderDottheme: js.UndefOr[WebTheme | String] = js.native
  @JSName("builder.urls")
  var builderDoturls: js.UndefOr[WebBuilderUrls] = js.native
  @JSName("builder.urls.ext")
  var builderDoturlsDotext: js.UndefOr[String] = js.native
  var server: js.UndefOr[WebServerConfig] = js.native
  @JSName("server.port")
  var serverDotport: js.UndefOr[Double] = js.native
  @JSName("server.sync")
  var serverDotsync: js.UndefOr[Boolean] = js.native
  @JSName("server.syncOptions")
  var serverDotsyncOptions: js.UndefOr[WebServerSyncOptions] = js.native
  @JSName("server.syncOptions.browser")
  var serverDotsyncOptionsDotbrowser: js.UndefOr[js.Array[String]] = js.native
  @JSName("server.syncOptions.notify")
  var serverDotsyncOptionsDotnotify: js.UndefOr[Boolean] = js.native
  @JSName("server.syncOptions.open")
  var serverDotsyncOptionsDotopen: js.UndefOr[Boolean] = js.native
  @JSName("server.theme")
  var serverDottheme: js.UndefOr[WebTheme | String] = js.native
  @JSName("server.watch")
  var serverDotwatch: js.UndefOr[Boolean] = js.native
  var static: js.UndefOr[WebStaticConfig] = js.native
  @JSName("static.mount")
  var staticDotmount: js.UndefOr[String] = js.native
  @JSName("static.path")
  var staticDotpath: js.UndefOr[String] = js.native
}

object WebConfig {
  @scala.inline
  def apply(): WebConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WebConfig]
  }
  @scala.inline
  implicit class WebConfigOps[Self <: WebConfig] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBuilder(value: WebBuilderConfig): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("builder")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBuilder: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("builder")(js.undefined)
        ret
    }
    @scala.inline
    def withBuilderDotconcurrency(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("builder.concurrency")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBuilderDotconcurrency: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("builder.concurrency")(js.undefined)
        ret
    }
    @scala.inline
    def withBuilderDotdest(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("builder.dest")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBuilderDotdest: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("builder.dest")(js.undefined)
        ret
    }
    @scala.inline
    def withBuilderDotext(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("builder.ext")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBuilderDotext: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("builder.ext")(js.undefined)
        ret
    }
    @scala.inline
    def withBuilderDottheme(value: WebTheme | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("builder.theme")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBuilderDottheme: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("builder.theme")(js.undefined)
        ret
    }
    @scala.inline
    def withBuilderDoturls(value: WebBuilderUrls): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("builder.urls")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBuilderDoturls: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("builder.urls")(js.undefined)
        ret
    }
    @scala.inline
    def withBuilderDoturlsDotext(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("builder.urls.ext")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBuilderDoturlsDotext: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("builder.urls.ext")(js.undefined)
        ret
    }
    @scala.inline
    def withServer(value: WebServerConfig): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("server")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutServer: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("server")(js.undefined)
        ret
    }
    @scala.inline
    def withServerDotport(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("server.port")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutServerDotport: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("server.port")(js.undefined)
        ret
    }
    @scala.inline
    def withServerDotsync(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("server.sync")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutServerDotsync: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("server.sync")(js.undefined)
        ret
    }
    @scala.inline
    def withServerDotsyncOptions(value: WebServerSyncOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("server.syncOptions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutServerDotsyncOptions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("server.syncOptions")(js.undefined)
        ret
    }
    @scala.inline
    def withServerDotsyncOptionsDotbrowser(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("server.syncOptions.browser")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutServerDotsyncOptionsDotbrowser: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("server.syncOptions.browser")(js.undefined)
        ret
    }
    @scala.inline
    def withServerDotsyncOptionsDotnotify(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("server.syncOptions.notify")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutServerDotsyncOptionsDotnotify: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("server.syncOptions.notify")(js.undefined)
        ret
    }
    @scala.inline
    def withServerDotsyncOptionsDotopen(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("server.syncOptions.open")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutServerDotsyncOptionsDotopen: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("server.syncOptions.open")(js.undefined)
        ret
    }
    @scala.inline
    def withServerDottheme(value: WebTheme | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("server.theme")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutServerDottheme: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("server.theme")(js.undefined)
        ret
    }
    @scala.inline
    def withServerDotwatch(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("server.watch")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutServerDotwatch: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("server.watch")(js.undefined)
        ret
    }
    @scala.inline
    def withStatic(value: WebStaticConfig): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("static")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStatic: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("static")(js.undefined)
        ret
    }
    @scala.inline
    def withStaticDotmount(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("static.mount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStaticDotmount: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("static.mount")(js.undefined)
        ret
    }
    @scala.inline
    def withStaticDotpath(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("static.path")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStaticDotpath: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("static.path")(js.undefined)
        ret
    }
  }
  
}

