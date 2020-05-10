package typingsSlinky.htmlWebpackPlugin.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TemplateParametersAssets extends js.Object {
  /** Will contain all css files */
  var css: js.Array[String] = js.native
  /** Will contain a favicon if it exists */
  var favicon: js.UndefOr[String] = js.native
  /** Will contain all js files */
  @JSName("js")
  var js_ : js.Array[String] = js.native
  /** Will contain amn appcache manifest file if it exists */
  var manifest: js.UndefOr[String] = js.native
  /** The public path */
  var publicPath: String = js.native
}

object TemplateParametersAssets {
  @scala.inline
  def apply(css: js.Array[String], js_ : js.Array[String], publicPath: String): TemplateParametersAssets = {
    val __obj = js.Dynamic.literal(css = css.asInstanceOf[js.Any], publicPath = publicPath.asInstanceOf[js.Any])
    __obj.updateDynamic("js")(js_.asInstanceOf[js.Any])
    __obj.asInstanceOf[TemplateParametersAssets]
  }
  @scala.inline
  implicit class TemplateParametersAssetsOps[Self <: TemplateParametersAssets] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCss(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("css")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withJs_(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("js")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPublicPath(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("publicPath")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFavicon(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("favicon")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFavicon: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("favicon")(js.undefined)
        ret
    }
    @scala.inline
    def withManifest(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("manifest")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutManifest: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("manifest")(js.undefined)
        ret
    }
  }
  
}

