package typingsSlinky.d3pie

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonCanvasPadding extends js.Object {
  var canvasPadding: js.UndefOr[AnonBottom] = js.native
  var colors: js.UndefOr[AnonBackground] = js.native
  var cssPrefix: js.UndefOr[String] = js.native
  var gradient: js.UndefOr[AnonColorEnabled] = js.native
  var pieCenterOffset: js.UndefOr[AnonX] = js.native
}

object AnonCanvasPadding {
  @scala.inline
  def apply(): AnonCanvasPadding = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnonCanvasPadding]
  }
  @scala.inline
  implicit class AnonCanvasPaddingOps[Self <: AnonCanvasPadding] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCanvasPadding(value: AnonBottom): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("canvasPadding")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCanvasPadding: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("canvasPadding")(js.undefined)
        ret
    }
    @scala.inline
    def withColors(value: AnonBackground): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("colors")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutColors: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("colors")(js.undefined)
        ret
    }
    @scala.inline
    def withCssPrefix(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cssPrefix")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCssPrefix: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cssPrefix")(js.undefined)
        ret
    }
    @scala.inline
    def withGradient(value: AnonColorEnabled): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gradient")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGradient: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gradient")(js.undefined)
        ret
    }
    @scala.inline
    def withPieCenterOffset(value: AnonX): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pieCenterOffset")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPieCenterOffset: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pieCenterOffset")(js.undefined)
        ret
    }
  }
  
}

