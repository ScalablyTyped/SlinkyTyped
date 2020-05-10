package typingsSlinky.kiwicomOrbitDesignTokens.mod

import typingsSlinky.kiwicomOrbitDesignTokens.PartialCloudColor
import typingsSlinky.kiwicomOrbitDesignTokens.PartialInkColor
import typingsSlinky.kiwicomOrbitDesignTokens.PartialProductColor
import typingsSlinky.kiwicomOrbitDesignTokens.PartialSocialColor
import typingsSlinky.kiwicomOrbitDesignTokens.PartialStatusColor
import typingsSlinky.kiwicomOrbitDesignTokens.PartialWhiteColor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CustomPalette extends js.Object {
  var blue: js.UndefOr[PartialStatusColor] = js.native
  var cloud: js.UndefOr[PartialCloudColor] = js.native
  var green: js.UndefOr[PartialStatusColor] = js.native
  var ink: js.UndefOr[PartialInkColor] = js.native
  var orange: js.UndefOr[PartialStatusColor] = js.native
  var product: js.UndefOr[PartialProductColor] = js.native
  var red: js.UndefOr[PartialStatusColor] = js.native
  var social: js.UndefOr[PartialSocialColor] = js.native
  var white: js.UndefOr[PartialWhiteColor] = js.native
}

object CustomPalette {
  @scala.inline
  def apply(): CustomPalette = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CustomPalette]
  }
  @scala.inline
  implicit class CustomPaletteOps[Self <: CustomPalette] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBlue(value: PartialStatusColor): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("blue")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBlue: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("blue")(js.undefined)
        ret
    }
    @scala.inline
    def withCloud(value: PartialCloudColor): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cloud")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCloud: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cloud")(js.undefined)
        ret
    }
    @scala.inline
    def withGreen(value: PartialStatusColor): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("green")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGreen: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("green")(js.undefined)
        ret
    }
    @scala.inline
    def withInk(value: PartialInkColor): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ink")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInk: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ink")(js.undefined)
        ret
    }
    @scala.inline
    def withOrange(value: PartialStatusColor): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("orange")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOrange: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("orange")(js.undefined)
        ret
    }
    @scala.inline
    def withProduct(value: PartialProductColor): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("product")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProduct: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("product")(js.undefined)
        ret
    }
    @scala.inline
    def withRed(value: PartialStatusColor): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("red")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRed: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("red")(js.undefined)
        ret
    }
    @scala.inline
    def withSocial(value: PartialSocialColor): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("social")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSocial: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("social")(js.undefined)
        ret
    }
    @scala.inline
    def withWhite(value: PartialWhiteColor): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("white")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWhite: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("white")(js.undefined)
        ret
    }
  }
  
}

