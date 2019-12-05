package typingsSlinky.reactDashNativeDashSvg.reactDashNativeDashSvgMod

import typingsSlinky.reactDashNativeDashSvg.reactDashNativeDashSvgStrings.`non-scaling-stroke`
import typingsSlinky.reactDashNativeDashSvg.reactDashNativeDashSvgStrings.inherit
import typingsSlinky.reactDashNativeDashSvg.reactDashNativeDashSvgStrings.nonScalingStroke
import typingsSlinky.reactDashNativeDashSvg.reactDashNativeDashSvgStrings.none
import typingsSlinky.reactDashNativeDashSvg.reactDashNativeDashSvgStrings.uri
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait VectorEffectProps extends js.Object {
  var vectorEffect: js.UndefOr[
    none | `non-scaling-stroke` | nonScalingStroke | typingsSlinky.reactDashNativeDashSvg.reactDashNativeDashSvgStrings.default | inherit | uri
  ] = js.undefined
}

object VectorEffectProps {
  @scala.inline
  def apply(
    vectorEffect: none | `non-scaling-stroke` | nonScalingStroke | typingsSlinky.reactDashNativeDashSvg.reactDashNativeDashSvgStrings.default | inherit | uri = null
  ): VectorEffectProps = {
    val __obj = js.Dynamic.literal()
    if (vectorEffect != null) __obj.updateDynamic("vectorEffect")(vectorEffect.asInstanceOf[js.Any])
    __obj.asInstanceOf[VectorEffectProps]
  }
}

