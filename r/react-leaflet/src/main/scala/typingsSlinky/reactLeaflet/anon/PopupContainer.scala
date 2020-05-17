package typingsSlinky.reactLeaflet.anon

import typingsSlinky.leaflet.mod.Path
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PopupContainer[E /* <: Path */] extends js.Object {
  var popupContainer: E = js.native
}

object PopupContainer {
  @scala.inline
  def apply[E](popupContainer: E): PopupContainer[E] = {
    val __obj = js.Dynamic.literal(popupContainer = popupContainer.asInstanceOf[js.Any])
    __obj.asInstanceOf[PopupContainer[E]]
  }
  @scala.inline
  implicit class PopupContainerOps[Self[e] <: PopupContainer[e], E] (val x: Self[E]) extends AnyVal {
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

