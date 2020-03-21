package typingsSlinky.reactNavigationStack

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonOpacityUndefinedTransformArray extends js.Object {
  var opacity: js.UndefOr[scala.Nothing] = js.undefined
  var transform: js.Array[AnonTranslateYAnimatedInterpolation]
}

object AnonOpacityUndefinedTransformArray {
  @scala.inline
  def apply(
    transform: js.Array[AnonTranslateYAnimatedInterpolation],
    opacity: js.UndefOr[scala.Nothing] = js.undefined
  ): AnonOpacityUndefinedTransformArray = {
    val __obj = js.Dynamic.literal(transform = transform.asInstanceOf[js.Any])
    if (!js.isUndefined(opacity)) __obj.updateDynamic("opacity")(opacity.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonOpacityUndefinedTransformArray]
  }
}

