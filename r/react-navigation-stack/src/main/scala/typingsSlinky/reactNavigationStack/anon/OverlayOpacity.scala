package typingsSlinky.reactNavigationStack.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OverlayOpacity extends js.Object {
  var opacity: Double = js.native
  var overlayOpacity: js.UndefOr[scala.Nothing] = js.native
  var shadowOpacity: js.UndefOr[scala.Nothing] = js.native
  var transform: js.UndefOr[scala.Nothing] = js.native
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
    def withOpacity(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("opacity")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

