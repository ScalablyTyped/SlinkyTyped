package typingsSlinky.pleasejs.PleaseJS

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MakeColorOption extends js.Object {
  var base_color: js.UndefOr[String] = js.native
  var colors_returned: js.UndefOr[Double] = js.native
  var format: js.UndefOr[String] = js.native
  var full_random: js.UndefOr[Boolean] = js.native
  var golden: js.UndefOr[Boolean] = js.native
  var grayscale: js.UndefOr[Boolean] = js.native
  var greyscale: js.UndefOr[Boolean] = js.native
  var hue: js.UndefOr[Double] = js.native
  var saturation: js.UndefOr[Double] = js.native
  var value: js.UndefOr[Double] = js.native
}

object MakeColorOption {
  @scala.inline
  def apply(): MakeColorOption = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MakeColorOption]
  }
  @scala.inline
  implicit class MakeColorOptionOps[Self <: MakeColorOption] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBase_color(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("base_color")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBase_color: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("base_color")(js.undefined)
        ret
    }
    @scala.inline
    def withColors_returned(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("colors_returned")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutColors_returned: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("colors_returned")(js.undefined)
        ret
    }
    @scala.inline
    def withFormat(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("format")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFormat: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("format")(js.undefined)
        ret
    }
    @scala.inline
    def withFull_random(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("full_random")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFull_random: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("full_random")(js.undefined)
        ret
    }
    @scala.inline
    def withGolden(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("golden")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGolden: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("golden")(js.undefined)
        ret
    }
    @scala.inline
    def withGrayscale(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("grayscale")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGrayscale: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("grayscale")(js.undefined)
        ret
    }
    @scala.inline
    def withGreyscale(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("greyscale")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGreyscale: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("greyscale")(js.undefined)
        ret
    }
    @scala.inline
    def withHue(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hue")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHue: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hue")(js.undefined)
        ret
    }
    @scala.inline
    def withSaturation(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("saturation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSaturation: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("saturation")(js.undefined)
        ret
    }
    @scala.inline
    def withValue(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("value")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutValue: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("value")(js.undefined)
        ret
    }
  }
  
}

