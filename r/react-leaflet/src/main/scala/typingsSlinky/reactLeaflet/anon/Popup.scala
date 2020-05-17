package typingsSlinky.reactLeaflet.anon

import typingsSlinky.leaflet.mod.Popup_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Popup[E /* <: Popup_ */] extends js.Object {
  var popup: E = js.native
}

object Popup {
  @scala.inline
  def apply[E](popup: E): Popup[E] = {
    val __obj = js.Dynamic.literal(popup = popup.asInstanceOf[js.Any])
    __obj.asInstanceOf[Popup[E]]
  }
  @scala.inline
  implicit class PopupOps[Self[e] <: Popup[e], E] (val x: Self[E]) extends AnyVal {
    @scala.inline
    def duplicate: Self[E] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[E]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[E] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[E] with Other]
    @scala.inline
    def withPopup(value: E): Self[E] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("popup")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

