package typingsSlinky.devextreme.anon

import typingsSlinky.devextreme.devextremeStrings.alternate
import typingsSlinky.devextreme.devextremeStrings.blend
import typingsSlinky.devextreme.devextremeStrings.extrapolate
import typingsSlinky.devextreme.devextremeStrings.gradientSet
import typingsSlinky.devextreme.devextremeStrings.indicatingSet
import typingsSlinky.devextreme.devextremeStrings.simpleSet
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BaseColorSet extends js.Object {
  var baseColorSet: js.UndefOr[simpleSet | indicatingSet | gradientSet] = js.native
  var paletteExtensionMode: js.UndefOr[alternate | blend | extrapolate] = js.native
}

object BaseColorSet {
  @scala.inline
  def apply(): BaseColorSet = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BaseColorSet]
  }
  @scala.inline
  implicit class BaseColorSetOps[Self <: BaseColorSet] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBaseColorSet(value: simpleSet | indicatingSet | gradientSet): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("baseColorSet")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBaseColorSet: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("baseColorSet")(js.undefined)
        ret
    }
    @scala.inline
    def withPaletteExtensionMode(value: alternate | blend | extrapolate): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("paletteExtensionMode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPaletteExtensionMode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("paletteExtensionMode")(js.undefined)
        ret
    }
  }
  
}

