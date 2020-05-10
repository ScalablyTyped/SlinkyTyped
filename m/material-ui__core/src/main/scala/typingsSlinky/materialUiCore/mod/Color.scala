package typingsSlinky.materialUiCore.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Color extends js.Object {
  var `100`: String = js.native
  var `200`: String = js.native
  var `300`: String = js.native
  var `400`: String = js.native
  var `50`: String = js.native
  var `500`: String = js.native
  var `600`: String = js.native
  var `700`: String = js.native
  var `800`: String = js.native
  var `900`: String = js.native
  var A100: String = js.native
  var A200: String = js.native
  var A400: String = js.native
  var A700: String = js.native
}

object Color {
  @scala.inline
  def apply(
    `100`: String,
    `200`: String,
    `300`: String,
    `400`: String,
    `50`: String,
    `500`: String,
    `600`: String,
    `700`: String,
    `800`: String,
    `900`: String,
    A100: String,
    A200: String,
    A400: String,
    A700: String
  ): Color = {
    val __obj = js.Dynamic.literal(A100 = A100.asInstanceOf[js.Any], A200 = A200.asInstanceOf[js.Any], A400 = A400.asInstanceOf[js.Any], A700 = A700.asInstanceOf[js.Any])
    __obj.updateDynamic("100")(`100`.asInstanceOf[js.Any])
    __obj.updateDynamic("200")(`200`.asInstanceOf[js.Any])
    __obj.updateDynamic("300")(`300`.asInstanceOf[js.Any])
    __obj.updateDynamic("400")(`400`.asInstanceOf[js.Any])
    __obj.updateDynamic("50")(`50`.asInstanceOf[js.Any])
    __obj.updateDynamic("500")(`500`.asInstanceOf[js.Any])
    __obj.updateDynamic("600")(`600`.asInstanceOf[js.Any])
    __obj.updateDynamic("700")(`700`.asInstanceOf[js.Any])
    __obj.updateDynamic("800")(`800`.asInstanceOf[js.Any])
    __obj.updateDynamic("900")(`900`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Color]
  }
  @scala.inline
  implicit class ColorOps[Self <: Color] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def with100(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("100")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def with200(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("200")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def with300(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("300")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def with400(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("400")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def with50(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("50")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def with500(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("500")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def with600(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("600")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def with700(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("700")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def with800(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("800")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def with900(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("900")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withA100(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("A100")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withA200(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("A200")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withA400(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("A400")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withA700(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("A700")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

