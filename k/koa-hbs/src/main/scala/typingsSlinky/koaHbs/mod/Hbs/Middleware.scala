package typingsSlinky.koaHbs.mod.Hbs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Middleware extends js.Object {
  var blockHelperName: js.UndefOr[String] = js.native
  var contentHelperName: js.UndefOr[String] = js.native
  var defaultLayout: js.UndefOr[String] = js.native
  var disableCache: js.UndefOr[Boolean] = js.native
  var extname: js.UndefOr[String] = js.native
  var handlebars: js.UndefOr[js.Function] = js.native
  var layoutsPath: js.UndefOr[String] = js.native
  var partialsPath: js.UndefOr[js.Array[String] | String] = js.native
  var templateOptions: js.UndefOr[js.Object] = js.native
  var viewPath: js.Array[String] | String = js.native
}

object Middleware {
  @scala.inline
  def apply(viewPath: js.Array[String] | String): Middleware = {
    val __obj = js.Dynamic.literal(viewPath = viewPath.asInstanceOf[js.Any])
    __obj.asInstanceOf[Middleware]
  }
  @scala.inline
  implicit class MiddlewareOps[Self <: Middleware] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withViewPath(value: js.Array[String] | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("viewPath")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBlockHelperName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("blockHelperName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBlockHelperName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("blockHelperName")(js.undefined)
        ret
    }
    @scala.inline
    def withContentHelperName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contentHelperName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutContentHelperName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contentHelperName")(js.undefined)
        ret
    }
    @scala.inline
    def withDefaultLayout(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultLayout")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDefaultLayout: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultLayout")(js.undefined)
        ret
    }
    @scala.inline
    def withDisableCache(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disableCache")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDisableCache: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disableCache")(js.undefined)
        ret
    }
    @scala.inline
    def withExtname(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("extname")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExtname: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("extname")(js.undefined)
        ret
    }
    @scala.inline
    def withHandlebars(value: js.Function): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("handlebars")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHandlebars: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("handlebars")(js.undefined)
        ret
    }
    @scala.inline
    def withLayoutsPath(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("layoutsPath")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLayoutsPath: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("layoutsPath")(js.undefined)
        ret
    }
    @scala.inline
    def withPartialsPath(value: js.Array[String] | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("partialsPath")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPartialsPath: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("partialsPath")(js.undefined)
        ret
    }
    @scala.inline
    def withTemplateOptions(value: js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("templateOptions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTemplateOptions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("templateOptions")(js.undefined)
        ret
    }
  }
  
}

