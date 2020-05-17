package typingsSlinky.cesium.anon

import typingsSlinky.cesium.mod.Property
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EvenColor extends js.Object {
  var evenColor: js.UndefOr[typingsSlinky.cesium.mod.Color] = js.native
  var oddColor: js.UndefOr[typingsSlinky.cesium.mod.Color] = js.native
  var repeat: js.UndefOr[Property] = js.native
}

object EvenColor {
  @scala.inline
  def apply(): EvenColor = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EvenColor]
  }
  @scala.inline
  implicit class EvenColorOps[Self <: EvenColor] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEvenColor(value: typingsSlinky.cesium.mod.Color): Self = {
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
    def withOddColor(value: typingsSlinky.cesium.mod.Color): Self = {
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

