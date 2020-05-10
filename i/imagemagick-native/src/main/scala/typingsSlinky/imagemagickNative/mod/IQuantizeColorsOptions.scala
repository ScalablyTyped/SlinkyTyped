package typingsSlinky.imagemagickNative.mod

import typingsSlinky.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IQuantizeColorsOptions extends js.Object {
  var colors: Double = js.native
  var debug: js.UndefOr[Boolean] = js.native
  var ignoreWarnings: js.UndefOr[Boolean] = js.native
  var srcData: Buffer = js.native
}

object IQuantizeColorsOptions {
  @scala.inline
  def apply(colors: Double, srcData: Buffer): IQuantizeColorsOptions = {
    val __obj = js.Dynamic.literal(colors = colors.asInstanceOf[js.Any], srcData = srcData.asInstanceOf[js.Any])
    __obj.asInstanceOf[IQuantizeColorsOptions]
  }
  @scala.inline
  implicit class IQuantizeColorsOptionsOps[Self <: IQuantizeColorsOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withColors(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("colors")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSrcData(value: Buffer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("srcData")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDebug(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("debug")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDebug: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("debug")(js.undefined)
        ret
    }
    @scala.inline
    def withIgnoreWarnings(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ignoreWarnings")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIgnoreWarnings: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ignoreWarnings")(js.undefined)
        ret
    }
  }
  
}

