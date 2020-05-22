package typingsSlinky.cesium.anon

import typingsSlinky.cesium.mod.Property
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DashLength extends js.Object {
  var color: js.UndefOr[typingsSlinky.cesium.mod.Color] = js.undefined
  var dashLength: js.UndefOr[Property] = js.undefined
  var dashPattern: js.UndefOr[Property] = js.undefined
  var gapColor: js.UndefOr[typingsSlinky.cesium.mod.Color] = js.undefined
}

object DashLength {
  @scala.inline
  def apply(
    color: typingsSlinky.cesium.mod.Color = null,
    dashLength: Property = null,
    dashPattern: Property = null,
    gapColor: typingsSlinky.cesium.mod.Color = null
  ): DashLength = {
    val __obj = js.Dynamic.literal()
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (dashLength != null) __obj.updateDynamic("dashLength")(dashLength.asInstanceOf[js.Any])
    if (dashPattern != null) __obj.updateDynamic("dashPattern")(dashPattern.asInstanceOf[js.Any])
    if (gapColor != null) __obj.updateDynamic("gapColor")(gapColor.asInstanceOf[js.Any])
    __obj.asInstanceOf[DashLength]
  }
}

