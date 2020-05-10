package typingsSlinky.gatsby.mod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WebpackLoaders
  extends /* key */ StringDictionary[js.Function] {
  var css: js.Function = js.native
  var eslint: js.Function = js.native
  var exports: js.Function = js.native
  var file: js.Function = js.native
  var imports: js.Function = js.native
  @JSName("js")
  var js_ : js.Function = js.native
  var json: js.Function = js.native
  var miniCssExtract: js.Function = js.native
  var `null`: js.Function = js.native
  var postcss: js.Function = js.native
  var raw: js.Function = js.native
  var style: js.Function = js.native
  var url: js.Function = js.native
  var yaml: js.Function = js.native
}

object WebpackLoaders {
  @scala.inline
  def apply(
    css: js.Function,
    eslint: js.Function,
    exports: js.Function,
    file: js.Function,
    imports: js.Function,
    js_ : js.Function,
    json: js.Function,
    miniCssExtract: js.Function,
    `null`: js.Function,
    postcss: js.Function,
    raw: js.Function,
    style: js.Function,
    url: js.Function,
    yaml: js.Function
  ): WebpackLoaders = {
    val __obj = js.Dynamic.literal(css = css.asInstanceOf[js.Any], eslint = eslint.asInstanceOf[js.Any], exports = exports.asInstanceOf[js.Any], file = file.asInstanceOf[js.Any], imports = imports.asInstanceOf[js.Any], json = json.asInstanceOf[js.Any], miniCssExtract = miniCssExtract.asInstanceOf[js.Any], postcss = postcss.asInstanceOf[js.Any], raw = raw.asInstanceOf[js.Any], style = style.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any], yaml = yaml.asInstanceOf[js.Any])
    __obj.updateDynamic("js")(js_.asInstanceOf[js.Any])
    __obj.updateDynamic("null")(`null`.asInstanceOf[js.Any])
    __obj.asInstanceOf[WebpackLoaders]
  }
  @scala.inline
  implicit class WebpackLoadersOps[Self <: WebpackLoaders] (val x: Self) extends AnyVal {
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
    def withEslint(value: js.Function): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("eslint")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withExports(value: js.Function): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("exports")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFile(value: js.Function): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("file")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withImports(value: js.Function): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("imports")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withJs_(value: js.Function): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("js")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withJson(value: js.Function): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("json")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMiniCssExtract(value: js.Function): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("miniCssExtract")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNull(value: js.Function): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("null")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPostcss(value: js.Function): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("postcss")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRaw(value: js.Function): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("raw")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStyle(value: js.Function): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("style")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUrl(value: js.Function): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("url")(value.asInstanceOf[js.Any])
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

