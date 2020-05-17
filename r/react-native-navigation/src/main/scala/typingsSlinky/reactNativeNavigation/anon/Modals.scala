package typingsSlinky.reactNativeNavigation.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Modals extends js.Object {
  var modals: js.Array[_] = js.native
  var overlays: js.Array[_] = js.native
  var root: js.Any = js.native
}

object Modals {
  @scala.inline
  def apply(modals: js.Array[_], overlays: js.Array[_], root: js.Any): Modals = {
    val __obj = js.Dynamic.literal(modals = modals.asInstanceOf[js.Any], overlays = overlays.asInstanceOf[js.Any], root = root.asInstanceOf[js.Any])
    __obj.asInstanceOf[Modals]
  }
  @scala.inline
  implicit class ModalsOps[Self <: Modals] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withModals(value: js.Array[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("modals")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOverlays(value: js.Array[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("overlays")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRoot(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("root")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

