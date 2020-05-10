package typingsSlinky.gatsby.mod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WebpackRules
  extends /* key */ StringDictionary[js.Function] {
  var css: js.Function = js.native
  var cssModules: js.Function = js.native
  var eslint: js.Function = js.native
  var fonts: js.Function = js.native
  var images: js.Function = js.native
  @JSName("js")
  var js_ : js.Function = js.native
  var media: js.Function = js.native
  var miscAssets: js.Function = js.native
  var mjs: js.Function = js.native
  var postcss: js.Function = js.native
  var yaml: js.Function = js.native
}

object WebpackRules {
  @scala.inline
  def apply(
    css: js.Function,
    cssModules: js.Function,
    eslint: js.Function,
    fonts: js.Function,
    images: js.Function,
    js_ : js.Function,
    media: js.Function,
    miscAssets: js.Function,
    mjs: js.Function,
    postcss: js.Function,
    yaml: js.Function
  ): WebpackRules = {
    val __obj = js.Dynamic.literal(css = css.asInstanceOf[js.Any], cssModules = cssModules.asInstanceOf[js.Any], eslint = eslint.asInstanceOf[js.Any], fonts = fonts.asInstanceOf[js.Any], images = images.asInstanceOf[js.Any], media = media.asInstanceOf[js.Any], miscAssets = miscAssets.asInstanceOf[js.Any], mjs = mjs.asInstanceOf[js.Any], postcss = postcss.asInstanceOf[js.Any], yaml = yaml.asInstanceOf[js.Any])
    __obj.updateDynamic("js")(js_.asInstanceOf[js.Any])
    __obj.asInstanceOf[WebpackRules]
  }
  @scala.inline
  implicit class WebpackRulesOps[Self <: WebpackRules] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCss(value: js.Function): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("css")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCssModules(value: js.Function): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cssModules")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEslint(value: js.Function): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("eslint")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFonts(value: js.Function): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fonts")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withImages(value: js.Function): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("images")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withJs_(value: js.Function): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("js")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMedia(value: js.Function): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("media")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMiscAssets(value: js.Function): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("miscAssets")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMjs(value: js.Function): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mjs")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPostcss(value: js.Function): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("postcss")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withYaml(value: js.Function): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("yaml")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

