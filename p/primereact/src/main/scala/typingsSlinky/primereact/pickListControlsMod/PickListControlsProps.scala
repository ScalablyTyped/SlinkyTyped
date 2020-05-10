package typingsSlinky.primereact.pickListControlsMod

import typingsSlinky.primereact.AnonDirection
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PickListControlsProps extends js.Object {
  var className: js.UndefOr[String] = js.native
  var list: js.UndefOr[js.Array[_]] = js.native
  var onReorder: js.UndefOr[js.Function1[/* e */ AnonDirection, Unit]] = js.native
  var selection: js.UndefOr[js.Array[_]] = js.native
}

object PickListControlsProps {
  @scala.inline
  def apply(): PickListControlsProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PickListControlsProps]
  }
  @scala.inline
  implicit class PickListControlsPropsOps[Self <: PickListControlsProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withClassName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("className")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClassName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("className")(js.undefined)
        ret
    }
    @scala.inline
    def withList(value: js.Array[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("list")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutList: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("list")(js.undefined)
        ret
    }
    @scala.inline
    def withOnReorder(value: /* e */ AnonDirection => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onReorder")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnReorder: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onReorder")(js.undefined)
        ret
    }
    @scala.inline
    def withSelection(value: js.Array[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selection")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSelection: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selection")(js.undefined)
        ret
    }
  }
  
}

