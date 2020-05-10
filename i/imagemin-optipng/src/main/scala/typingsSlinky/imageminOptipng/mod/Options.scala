package typingsSlinky.imageminOptipng.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Options extends js.Object {
  var bitDepthReduction: js.UndefOr[Boolean] = js.native
  var colorTypeReduction: js.UndefOr[Boolean] = js.native
  var optimizationLevel: js.UndefOr[Double] = js.native
  var paletteReduction: js.UndefOr[Boolean] = js.native
}

object Options {
  @scala.inline
  def apply(): Options = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Options]
  }
  @scala.inline
  implicit class OptionsOps[Self <: Options] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBitDepthReduction(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bitDepthReduction")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBitDepthReduction: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bitDepthReduction")(js.undefined)
        ret
    }
    @scala.inline
    def withColorTypeReduction(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("colorTypeReduction")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutColorTypeReduction: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("colorTypeReduction")(js.undefined)
        ret
    }
    @scala.inline
    def withOptimizationLevel(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("optimizationLevel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOptimizationLevel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("optimizationLevel")(js.undefined)
        ret
    }
    @scala.inline
    def withPaletteReduction(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("paletteReduction")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPaletteReduction: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("paletteReduction")(js.undefined)
        ret
    }
  }
  
}

