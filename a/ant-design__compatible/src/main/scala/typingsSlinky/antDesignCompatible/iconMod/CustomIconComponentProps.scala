package typingsSlinky.antDesignCompatible.iconMod

import typingsSlinky.react.mod.CSSProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CustomIconComponentProps extends js.Object {
  var `aria-hidden`: js.UndefOr[Boolean] = js.undefined
  var className: js.UndefOr[String] = js.undefined
  var fill: String
  var height: String | Double
  var rotate: js.UndefOr[Double] = js.undefined
  var spin: js.UndefOr[Boolean] = js.undefined
  var style: js.UndefOr[CSSProperties] = js.undefined
  var viewBox: js.UndefOr[String] = js.undefined
  var width: String | Double
}

object CustomIconComponentProps {
  @scala.inline
  def apply(
    fill: String,
    height: String | Double,
    width: String | Double,
    `aria-hidden`: js.UndefOr[Boolean] = js.undefined,
    className: String = null,
    rotate: js.UndefOr[Double] = js.undefined,
    spin: js.UndefOr[Boolean] = js.undefined,
    style: CSSProperties = null,
    viewBox: String = null
  ): CustomIconComponentProps = {
    val __obj = js.Dynamic.literal(fill = fill.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    if (!js.isUndefined(`aria-hidden`)) __obj.updateDynamic("aria-hidden")(`aria-hidden`.get.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (!js.isUndefined(rotate)) __obj.updateDynamic("rotate")(rotate.get.asInstanceOf[js.Any])
    if (!js.isUndefined(spin)) __obj.updateDynamic("spin")(spin.get.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (viewBox != null) __obj.updateDynamic("viewBox")(viewBox.asInstanceOf[js.Any])
    __obj.asInstanceOf[CustomIconComponentProps]
  }
}

