package typingsSlinky.htmlWebpackPlugin

import typingsSlinky.htmlWebpackPlugin.mod.EntryObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonCss extends js.Object {
  var css: js.Array[EntryObject] = js.native
  @JSName("js")
  var js_ : js.Array[EntryObject] = js.native
  var publicPath: String = js.native
}

object AnonCss {
  @scala.inline
  def apply(css: js.Array[EntryObject], js_ : js.Array[EntryObject], publicPath: String): AnonCss = {
    val __obj = js.Dynamic.literal(css = css.asInstanceOf[js.Any], publicPath = publicPath.asInstanceOf[js.Any])
    __obj.updateDynamic("js")(js_.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonCss]
  }
  @scala.inline
  implicit class AnonCssOps[Self <: AnonCss] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCss(value: js.Array[EntryObject]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("css")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withJs_(value: js.Array[EntryObject]): Self = {
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
  }
  
}

