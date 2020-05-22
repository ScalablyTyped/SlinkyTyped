package typingsSlinky.reactNativeMaterialKit.mod

import typingsSlinky.reactNativeMaterialKit.reactNativeMaterialKitStrings.`100`
import typingsSlinky.reactNativeMaterialKit.reactNativeMaterialKitStrings.`200`
import typingsSlinky.reactNativeMaterialKit.reactNativeMaterialKitStrings.`300`
import typingsSlinky.reactNativeMaterialKit.reactNativeMaterialKitStrings.`400`
import typingsSlinky.reactNativeMaterialKit.reactNativeMaterialKitStrings.`500`
import typingsSlinky.reactNativeMaterialKit.reactNativeMaterialKitStrings.`600`
import typingsSlinky.reactNativeMaterialKit.reactNativeMaterialKitStrings.`700`
import typingsSlinky.reactNativeMaterialKit.reactNativeMaterialKitStrings.`800`
import typingsSlinky.reactNativeMaterialKit.reactNativeMaterialKitStrings.`900`
import typingsSlinky.reactNativeMaterialKit.reactNativeMaterialKitStrings.absolute
import typingsSlinky.reactNativeMaterialKit.reactNativeMaterialKitStrings.bold
import typingsSlinky.reactNativeMaterialKit.reactNativeMaterialKitStrings.normal
import typingsSlinky.reactNativeMaterialKit.reactNativeMaterialKitStrings.relative
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CardTitleStyle extends js.Object {
  var backgroundColor: js.UndefOr[String] = js.undefined
  var color: js.UndefOr[String] = js.undefined
  var fontSize: js.UndefOr[Double] = js.undefined
  var fontWeight: js.UndefOr[
    normal | bold | `100` | `200` | `300` | `400` | `500` | `600` | `700` | `800` | `900`
  ] = js.undefined
  var left: js.UndefOr[Double] = js.undefined
  var padding: js.UndefOr[Double] = js.undefined
  var position: js.UndefOr[absolute | relative] = js.undefined
  var top: js.UndefOr[Double] = js.undefined
}

object CardTitleStyle {
  @scala.inline
  def apply(
    backgroundColor: String = null,
    color: String = null,
    fontSize: js.UndefOr[Double] = js.undefined,
    fontWeight: normal | bold | `100` | `200` | `300` | `400` | `500` | `600` | `700` | `800` | `900` = null,
    left: js.UndefOr[Double] = js.undefined,
    padding: js.UndefOr[Double] = js.undefined,
    position: absolute | relative = null,
    top: js.UndefOr[Double] = js.undefined
  ): CardTitleStyle = {
    val __obj = js.Dynamic.literal()
    if (backgroundColor != null) __obj.updateDynamic("backgroundColor")(backgroundColor.asInstanceOf[js.Any])
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (!js.isUndefined(fontSize)) __obj.updateDynamic("fontSize")(fontSize.get.asInstanceOf[js.Any])
    if (fontWeight != null) __obj.updateDynamic("fontWeight")(fontWeight.asInstanceOf[js.Any])
    if (!js.isUndefined(left)) __obj.updateDynamic("left")(left.get.asInstanceOf[js.Any])
    if (!js.isUndefined(padding)) __obj.updateDynamic("padding")(padding.get.asInstanceOf[js.Any])
    if (position != null) __obj.updateDynamic("position")(position.asInstanceOf[js.Any])
    if (!js.isUndefined(top)) __obj.updateDynamic("top")(top.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[CardTitleStyle]
  }
}

