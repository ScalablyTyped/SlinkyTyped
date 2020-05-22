package typingsSlinky.reactNavigationStack.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OverlayOpacity extends js.Object {
  var opacity: Double
  var overlayOpacity: js.UndefOr[scala.Nothing] = js.undefined
  var shadowOpacity: js.UndefOr[scala.Nothing] = js.undefined
  var transform: js.UndefOr[scala.Nothing] = js.undefined
}

object OverlayOpacity {
  @scala.inline
  def apply(opacity: Double): OverlayOpacity = {
    val __obj = js.Dynamic.literal(opacity = opacity.asInstanceOf[js.Any])
    __obj.asInstanceOf[OverlayOpacity]
  }
}

