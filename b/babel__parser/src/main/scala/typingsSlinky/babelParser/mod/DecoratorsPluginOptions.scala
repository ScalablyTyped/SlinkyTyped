package typingsSlinky.babelParser.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DecoratorsPluginOptions extends js.Object {
  var decoratorsBeforeExport: js.UndefOr[Boolean] = js.native
}

object DecoratorsPluginOptions {
  @scala.inline
  def apply(): DecoratorsPluginOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DecoratorsPluginOptions]
  }
  @scala.inline
  implicit class DecoratorsPluginOptionsOps[Self <: DecoratorsPluginOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDecoratorsBeforeExport(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("decoratorsBeforeExport")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDecoratorsBeforeExport: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("decoratorsBeforeExport")(js.undefined)
        ret
    }
  }
  
}

