package typingsSlinky.mjml.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MJMLMinifyOptions extends js.Object {
  var collapseWhitespace: js.UndefOr[Boolean] = js.native
  var minifyCSS: js.UndefOr[Boolean] = js.native
  var removeEmptyAttributes: js.UndefOr[Boolean] = js.native
}

object MJMLMinifyOptions {
  @scala.inline
  def apply(): MJMLMinifyOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MJMLMinifyOptions]
  }
  @scala.inline
  implicit class MJMLMinifyOptionsOps[Self <: MJMLMinifyOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCollapseWhitespace(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("collapseWhitespace")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCollapseWhitespace: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("collapseWhitespace")(js.undefined)
        ret
    }
    @scala.inline
    def withMinifyCSS(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minifyCSS")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMinifyCSS: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minifyCSS")(js.undefined)
        ret
    }
    @scala.inline
    def withRemoveEmptyAttributes(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("removeEmptyAttributes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRemoveEmptyAttributes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("removeEmptyAttributes")(js.undefined)
        ret
    }
  }
  
}

