package typingsSlinky.cesium

import typingsSlinky.cesium.mod.Color
import typingsSlinky.cesium.mod.Property
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonEvenColor extends js.Object {
  var evenColor: js.UndefOr[Color] = js.native
  var oddColor: js.UndefOr[Color] = js.native
  var repeat: js.UndefOr[Property] = js.native
}

object AnonEvenColor {
  @scala.inline
  def apply(): AnonEvenColor = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnonEvenColor]
  }
  @scala.inline
  implicit class AnonEvenColorOps[Self <: AnonEvenColor] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEvenColor(value: Color): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("evenColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEvenColor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("evenColor")(js.undefined)
        ret
    }
    @scala.inline
    def withOddColor(value: Color): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("oddColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOddColor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("oddColor")(js.undefined)
        ret
    }
    @scala.inline
    def withRepeat(value: Property): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("repeat")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRepeat: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("repeat")(js.undefined)
        ret
    }
  }
  
}

