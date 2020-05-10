package typingsSlinky.cesium

import typingsSlinky.cesium.mod.Color
import typingsSlinky.cesium.mod.Property
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonDashLength extends js.Object {
  var color: js.UndefOr[Color] = js.native
  var dashLength: js.UndefOr[Property] = js.native
  var dashPattern: js.UndefOr[Property] = js.native
  var gapColor: js.UndefOr[Color] = js.native
}

object AnonDashLength {
  @scala.inline
  def apply(): AnonDashLength = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnonDashLength]
  }
  @scala.inline
  implicit class AnonDashLengthOps[Self <: AnonDashLength] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withColor(value: Color): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("color")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutColor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("color")(js.undefined)
        ret
    }
    @scala.inline
    def withDashLength(value: Property): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dashLength")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDashLength: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dashLength")(js.undefined)
        ret
    }
    @scala.inline
    def withDashPattern(value: Property): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dashPattern")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDashPattern: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dashPattern")(js.undefined)
        ret
    }
    @scala.inline
    def withGapColor(value: Color): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gapColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGapColor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gapColor")(js.undefined)
        ret
    }
  }
  
}

