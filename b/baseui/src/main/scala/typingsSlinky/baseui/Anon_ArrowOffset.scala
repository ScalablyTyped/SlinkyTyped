package typingsSlinky.baseui

import typingsSlinky.baseui.baseuiNumbers.`false`
import typingsSlinky.baseui.baseuiStrings.auto
import typingsSlinky.baseui.baseuiStrings.bottom
import typingsSlinky.baseui.baseuiStrings.bottomLeft
import typingsSlinky.baseui.baseuiStrings.bottomRight
import typingsSlinky.baseui.baseuiStrings.left
import typingsSlinky.baseui.baseuiStrings.leftBottom
import typingsSlinky.baseui.baseuiStrings.leftTop
import typingsSlinky.baseui.baseuiStrings.right
import typingsSlinky.baseui.baseuiStrings.rightBottom
import typingsSlinky.baseui.baseuiStrings.rightTop
import typingsSlinky.baseui.baseuiStrings.top
import typingsSlinky.baseui.baseuiStrings.topLeft
import typingsSlinky.baseui.baseuiStrings.topRight
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ArrowOffset extends js.Object {
  var arrowOffset: Anon_0
  var isAnimating: `false`
  var isLayerMounted: `false`
  var isMounted: `false`
  var placement: rightTop | auto | leftBottom | bottomRight | leftTop | bottom | left | topRight | bottomLeft | rightBottom | topLeft | top | right
  var popoverOffset: Anon_0
}

object Anon_ArrowOffset {
  @scala.inline
  def apply(
    arrowOffset: Anon_0,
    isAnimating: `false`,
    isLayerMounted: `false`,
    isMounted: `false`,
    placement: rightTop | auto | leftBottom | bottomRight | leftTop | bottom | left | topRight | bottomLeft | rightBottom | topLeft | top | right,
    popoverOffset: Anon_0
  ): Anon_ArrowOffset = {
    val __obj = js.Dynamic.literal(arrowOffset = arrowOffset.asInstanceOf[js.Any], isAnimating = isAnimating.asInstanceOf[js.Any], isLayerMounted = isLayerMounted.asInstanceOf[js.Any], isMounted = isMounted.asInstanceOf[js.Any], placement = placement.asInstanceOf[js.Any], popoverOffset = popoverOffset.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_ArrowOffset]
  }
}

