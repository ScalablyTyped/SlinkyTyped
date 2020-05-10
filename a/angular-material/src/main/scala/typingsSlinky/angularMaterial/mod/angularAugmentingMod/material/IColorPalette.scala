package typingsSlinky.angularMaterial.mod.angularAugmentingMod.material

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IColorPalette extends js.Object {
  var amber: IPalette = js.native
  var blue: IPalette = js.native
  var `blue-grey`: IPalette = js.native
  var brown: IPalette = js.native
  var cyan: IPalette = js.native
  var `deep-orange`: IPalette = js.native
  var `deep-purple`: IPalette = js.native
  var green: IPalette = js.native
  var grey: IPalette = js.native
  var indigo: IPalette = js.native
  var `light-blue`: IPalette = js.native
  var `light-green`: IPalette = js.native
  var lime: IPalette = js.native
  var orange: IPalette = js.native
  var pink: IPalette = js.native
  var red: IPalette = js.native
  var teal: IPalette = js.native
  var yellow: IPalette = js.native
}

object IColorPalette {
  @scala.inline
  def apply(
    amber: IPalette,
    blue: IPalette,
    `blue-grey`: IPalette,
    brown: IPalette,
    cyan: IPalette,
    `deep-orange`: IPalette,
    `deep-purple`: IPalette,
    green: IPalette,
    grey: IPalette,
    indigo: IPalette,
    `light-blue`: IPalette,
    `light-green`: IPalette,
    lime: IPalette,
    orange: IPalette,
    pink: IPalette,
    red: IPalette,
    teal: IPalette,
    yellow: IPalette
  ): IColorPalette = {
    val __obj = js.Dynamic.literal(amber = amber.asInstanceOf[js.Any], blue = blue.asInstanceOf[js.Any], brown = brown.asInstanceOf[js.Any], cyan = cyan.asInstanceOf[js.Any], green = green.asInstanceOf[js.Any], grey = grey.asInstanceOf[js.Any], indigo = indigo.asInstanceOf[js.Any], lime = lime.asInstanceOf[js.Any], orange = orange.asInstanceOf[js.Any], pink = pink.asInstanceOf[js.Any], red = red.asInstanceOf[js.Any], teal = teal.asInstanceOf[js.Any], yellow = yellow.asInstanceOf[js.Any])
    __obj.updateDynamic("blue-grey")(`blue-grey`.asInstanceOf[js.Any])
    __obj.updateDynamic("deep-orange")(`deep-orange`.asInstanceOf[js.Any])
    __obj.updateDynamic("deep-purple")(`deep-purple`.asInstanceOf[js.Any])
    __obj.updateDynamic("light-blue")(`light-blue`.asInstanceOf[js.Any])
    __obj.updateDynamic("light-green")(`light-green`.asInstanceOf[js.Any])
    __obj.asInstanceOf[IColorPalette]
  }
  @scala.inline
  implicit class IColorPaletteOps[Self <: IColorPalette] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAmber(value: IPalette): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("amber")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBlue(value: IPalette): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("blue")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withBlue-grey`(value: IPalette): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("blue-grey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBrown(value: IPalette): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("brown")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCyan(value: IPalette): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cyan")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withDeep-orange`(value: IPalette): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deep-orange")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withDeep-purple`(value: IPalette): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deep-purple")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGreen(value: IPalette): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("green")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGrey(value: IPalette): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("grey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIndigo(value: IPalette): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("indigo")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withLight-blue`(value: IPalette): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("light-blue")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withLight-green`(value: IPalette): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("light-green")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLime(value: IPalette): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOrange(value: IPalette): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("orange")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPink(value: IPalette): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pink")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRed(value: IPalette): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("red")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTeal(value: IPalette): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("teal")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withYellow(value: IPalette): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("yellow")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

