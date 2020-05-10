package typingsSlinky.reactLeaflet

import typingsSlinky.leaflet.mod.Path
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonPopupContainer[E /* <: Path */] extends js.Object {
  var popupContainer: E = js.native
}

object AnonPopupContainer {
  @scala.inline
  def apply[E](popupContainer: E): AnonPopupContainer[E] = {
    val __obj = js.Dynamic.literal(popupContainer = popupContainer.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonPopupContainer[E]]
  }
  @scala.inline
  implicit class AnonPopupContainerOps[Self[e] <: AnonPopupContainer[e], E] (val x: Self[E]) extends AnyVal {
    @scala.inline
    def duplicate: Self[E] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[E]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[E] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[E] with Other]
    @scala.inline
    def withPopupContainer(value: E): Self[E] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("popupContainer")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

