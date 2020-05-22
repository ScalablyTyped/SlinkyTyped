package typingsSlinky.cesium.anon

import typingsSlinky.cesium.mod.Property
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EvenColor extends js.Object {
  var evenColor: js.UndefOr[typingsSlinky.cesium.mod.Color] = js.undefined
  var oddColor: js.UndefOr[typingsSlinky.cesium.mod.Color] = js.undefined
  var repeat: js.UndefOr[Property] = js.undefined
}

object EvenColor {
  @scala.inline
  def apply(
    evenColor: typingsSlinky.cesium.mod.Color = null,
    oddColor: typingsSlinky.cesium.mod.Color = null,
    repeat: Property = null
  ): EvenColor = {
    val __obj = js.Dynamic.literal()
    if (evenColor != null) __obj.updateDynamic("evenColor")(evenColor.asInstanceOf[js.Any])
    if (oddColor != null) __obj.updateDynamic("oddColor")(oddColor.asInstanceOf[js.Any])
    if (repeat != null) __obj.updateDynamic("repeat")(repeat.asInstanceOf[js.Any])
    __obj.asInstanceOf[EvenColor]
  }
}

