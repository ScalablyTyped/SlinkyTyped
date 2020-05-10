package typingsSlinky.angularMaterial.mod.angularAugmentingMod.material

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IThemeHues extends js.Object {
  var default: js.UndefOr[String] = js.native
  var `hue-1`: js.UndefOr[String] = js.native
  var `hue-2`: js.UndefOr[String] = js.native
  var `hue-3`: js.UndefOr[String] = js.native
}

object IThemeHues {
  @scala.inline
  def apply(): IThemeHues = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IThemeHues]
  }
  @scala.inline
  implicit class IThemeHuesOps[Self <: IThemeHues] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDefault(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("default")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDefault: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("default")(js.undefined)
        ret
    }
    @scala.inline
    def `withHue-1`(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hue-1")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutHue-1`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hue-1")(js.undefined)
        ret
    }
    @scala.inline
    def `withHue-2`(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hue-2")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutHue-2`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hue-2")(js.undefined)
        ret
    }
    @scala.inline
    def `withHue-3`(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hue-3")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutHue-3`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hue-3")(js.undefined)
        ret
    }
  }
  
}

