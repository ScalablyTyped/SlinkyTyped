package typingsSlinky.reactNativeSvg.mod

import typingsSlinky.reactNativeSvg.reactNativeSvgStrings.`non-scaling-stroke`
import typingsSlinky.reactNativeSvg.reactNativeSvgStrings.inherit
import typingsSlinky.reactNativeSvg.reactNativeSvgStrings.nonScalingStroke
import typingsSlinky.reactNativeSvg.reactNativeSvgStrings.none
import typingsSlinky.reactNativeSvg.reactNativeSvgStrings.uri
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait VectorEffectProps extends js.Object {
  var vectorEffect: js.UndefOr[
    none | `non-scaling-stroke` | nonScalingStroke | typingsSlinky.reactNativeSvg.reactNativeSvgStrings.default | inherit | uri
  ] = js.undefined
}

object VectorEffectProps {
  @scala.inline
  def apply(
    vectorEffect: none | `non-scaling-stroke` | nonScalingStroke | typingsSlinky.reactNativeSvg.reactNativeSvgStrings.default | inherit | uri = null
  ): VectorEffectProps = {
    val __obj = js.Dynamic.literal()
    if (vectorEffect != null) __obj.updateDynamic("vectorEffect")(vectorEffect.asInstanceOf[js.Any])
    __obj.asInstanceOf[VectorEffectProps]
  }
}

