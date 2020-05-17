package typingsSlinky.cesium.anon

import typingsSlinky.cesium.mod.Property
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OddColor extends js.Object {
  var evenColor: js.UndefOr[Property] = js.native
  var oddColor: js.UndefOr[Property] = js.native
  var offset: js.UndefOr[Property] = js.native
  var orientation: js.UndefOr[Property] = js.native
  var repeat: js.UndefOr[Property] = js.native
}

object OddColor {
  @scala.inline
  def apply(): OddColor = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OddColor]
  }
  @scala.inline
  implicit class OddColorOps[Self <: OddColor] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEvenColor(value: Property): Self = {
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
    def withOddColor(value: Property): Self = {
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
    def withOffset(value: Property): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("offset")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOffset: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("offset")(js.undefined)
        ret
    }
    @scala.inline
    def withOrientation(value: Property): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("orientation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOrientation: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("orientation")(js.undefined)
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

