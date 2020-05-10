package typingsSlinky.mapboxGl.mod

import org.scalajs.dom.raw.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IControl extends js.Object {
  var getDefaultPosition: js.UndefOr[js.Function0[String]] = js.native
  def onAdd(map: Map): HTMLElement = js.native
  def onRemove(map: Map): js.Any = js.native
}

object IControl {
  @scala.inline
  def apply(onAdd: Map => HTMLElement, onRemove: Map => js.Any): IControl = {
    val __obj = js.Dynamic.literal(onAdd = js.Any.fromFunction1(onAdd), onRemove = js.Any.fromFunction1(onRemove))
    __obj.asInstanceOf[IControl]
  }
  @scala.inline
  implicit class IControlOps[Self <: IControl] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withOnAdd(value: Map => HTMLElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onAdd")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withOnRemove(value: Map => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onRemove")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGetDefaultPosition(value: () => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getDefaultPosition")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutGetDefaultPosition: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getDefaultPosition")(js.undefined)
        ret
    }
  }
  
}

