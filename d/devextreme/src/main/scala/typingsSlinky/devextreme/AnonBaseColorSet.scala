package typingsSlinky.devextreme

import typingsSlinky.devextreme.devextremeStrings.alternate
import typingsSlinky.devextreme.devextremeStrings.blend
import typingsSlinky.devextreme.devextremeStrings.extrapolate
import typingsSlinky.devextreme.devextremeStrings.gradientSet
import typingsSlinky.devextreme.devextremeStrings.indicatingSet
import typingsSlinky.devextreme.devextremeStrings.simpleSet
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonBaseColorSet extends js.Object {
  var baseColorSet: js.UndefOr[simpleSet | indicatingSet | gradientSet] = js.undefined
  var paletteExtensionMode: js.UndefOr[alternate | blend | extrapolate] = js.undefined
}

object AnonBaseColorSet {
  @scala.inline
  def apply(
    baseColorSet: simpleSet | indicatingSet | gradientSet = null,
    paletteExtensionMode: alternate | blend | extrapolate = null
  ): AnonBaseColorSet = {
    val __obj = js.Dynamic.literal()
    if (baseColorSet != null) __obj.updateDynamic("baseColorSet")(baseColorSet.asInstanceOf[js.Any])
    if (paletteExtensionMode != null) __obj.updateDynamic("paletteExtensionMode")(paletteExtensionMode.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonBaseColorSet]
  }
}

