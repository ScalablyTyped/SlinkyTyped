package typingsSlinky.ionicCore.interfaceMod

import org.scalajs.dom.raw.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RouteWrite extends js.Object {
  var changed: Boolean = js.native
  var element: js.UndefOr[HTMLElement] = js.native
  var markVisible: js.UndefOr[js.Function0[Unit | js.Promise[Unit]]] = js.native
}

object RouteWrite {
  @scala.inline
  def apply(changed: Boolean): RouteWrite = {
    val __obj = js.Dynamic.literal(changed = changed.asInstanceOf[js.Any])
    __obj.asInstanceOf[RouteWrite]
  }
  @scala.inline
  implicit class RouteWriteOps[Self <: RouteWrite] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withChanged(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("changed")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withElement(value: HTMLElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("element")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutElement: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("element")(js.undefined)
        ret
    }
    @scala.inline
    def withMarkVisible(value: () => Unit | js.Promise[Unit]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("markVisible")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutMarkVisible: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("markVisible")(js.undefined)
        ret
    }
  }
  
}

