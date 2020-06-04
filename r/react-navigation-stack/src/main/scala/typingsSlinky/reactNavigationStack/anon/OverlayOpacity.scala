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
  @scala.inline
  implicit class OverlayOpacityOps[Self <: OverlayOpacity] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setOpacity(value: Double): Self = this.set("opacity", value.asInstanceOf[js.Any])
  }
  
}

