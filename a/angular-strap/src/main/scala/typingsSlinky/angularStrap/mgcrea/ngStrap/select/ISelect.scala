package typingsSlinky.angularStrap.mgcrea.ngStrap.select

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ISelect extends js.Object {
  def active(index: Double): Double = js.native
  def hide(): Unit = js.native
  def select(index: Double): Unit = js.native
  def show(): Unit = js.native
  def update(matches: js.Any): Unit = js.native
}

object ISelect {
  @scala.inline
  def apply(
    active: Double => Double,
    hide: () => Unit,
    select: Double => Unit,
    show: () => Unit,
    update: js.Any => Unit
  ): ISelect = {
    val __obj = js.Dynamic.literal(active = js.Any.fromFunction1(active), hide = js.Any.fromFunction0(hide), select = js.Any.fromFunction1(select), show = js.Any.fromFunction0(show), update = js.Any.fromFunction1(update))
    __obj.asInstanceOf[ISelect]
  }
  @scala.inline
  implicit class ISelectOps[Self <: ISelect] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withActive(value: Double => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("active")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withHide(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hide")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withSelect(value: Double => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("select")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withShow(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("show")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withUpdate(value: js.Any => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("update")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

