package typingsSlinky.reactRelay.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ComponentRef extends js.Object {
  var componentRef: js.UndefOr[js.Function1[/* ref */ js.Any, Unit]] = js.native
}

object ComponentRef {
  @scala.inline
  def apply(): ComponentRef = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ComponentRef]
  }
  @scala.inline
  implicit class ComponentRefOps[Self <: ComponentRef] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withComponentRef(value: /* ref */ js.Any => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("componentRef")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutComponentRef: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("componentRef")(js.undefined)
        ret
    }
  }
  
}

