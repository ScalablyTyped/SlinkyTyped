package typingsSlinky.gulpHtmlPrettify.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GulpHtmlPrettifyOptions extends js.Object {
  var indent_char: js.UndefOr[String] = js.native
  var indent_size: js.UndefOr[Double] = js.native
}

object GulpHtmlPrettifyOptions {
  @scala.inline
  def apply(): GulpHtmlPrettifyOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GulpHtmlPrettifyOptions]
  }
  @scala.inline
  implicit class GulpHtmlPrettifyOptionsOps[Self <: GulpHtmlPrettifyOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withIndent_char(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("indent_char")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIndent_char: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("indent_char")(js.undefined)
        ret
    }
    @scala.inline
    def withIndent_size(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("indent_size")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIndent_size: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("indent_size")(js.undefined)
        ret
    }
  }
  
}

