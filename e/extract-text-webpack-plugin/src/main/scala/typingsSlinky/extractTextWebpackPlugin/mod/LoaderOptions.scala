package typingsSlinky.extractTextWebpackPlugin.mod

import typingsSlinky.webpack.mod.Loader_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LoaderOptions extends js.Object {
  /** the loader(s) that should be used when the css is not extracted (i.e. in an additional chunk when `allChunks: false`) */
  var fallback: js.UndefOr[Loader_ | js.Array[Loader_]] = js.native
  /** override the `publicPath` setting for this loader */
  var publicPath: js.UndefOr[String] = js.native
  /** the loader(s) that should be used for converting the resource to a css exporting module */
  var use: Loader_ | js.Array[Loader_] = js.native
}

object LoaderOptions {
  @scala.inline
  def apply(use: Loader_ | js.Array[Loader_]): LoaderOptions = {
    val __obj = js.Dynamic.literal(use = use.asInstanceOf[js.Any])
    __obj.asInstanceOf[LoaderOptions]
  }
  @scala.inline
  implicit class LoaderOptionsOps[Self <: LoaderOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withUse(value: Loader_ | js.Array[Loader_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("use")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFallback(value: Loader_ | js.Array[Loader_]): Self = {
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
    def withPublicPath(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("publicPath")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPublicPath: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("publicPath")(js.undefined)
        ret
    }
  }
  
}

