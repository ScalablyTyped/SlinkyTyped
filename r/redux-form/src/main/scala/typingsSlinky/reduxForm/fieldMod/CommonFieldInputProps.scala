package typingsSlinky.reduxForm.fieldMod

import slinky.web.SyntheticFocusEvent
import typingsSlinky.react.mod.DragEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CommonFieldInputProps extends js.Object {
  var name: String = js.native
  var onDragStart: EventHandler[DragEvent[_]] = js.native
  var onDrop: EventHandler[DragEvent[_]] = js.native
  var onFocus: EventHandler[SyntheticFocusEvent[_]] = js.native
}

object CommonFieldInputProps {
  @scala.inline
  def apply(
    name: String,
    onDragStart: (DragEvent[_], /* name */ js.UndefOr[String]) => Unit,
    onDrop: (DragEvent[_], /* name */ js.UndefOr[String]) => Unit,
    onFocus: (SyntheticFocusEvent[_], /* name */ js.UndefOr[String]) => Unit
  ): CommonFieldInputProps = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], onDragStart = js.Any.fromFunction2(onDragStart), onDrop = js.Any.fromFunction2(onDrop), onFocus = js.Any.fromFunction2(onFocus))
    __obj.asInstanceOf[CommonFieldInputProps]
  }
  @scala.inline
  implicit class CommonFieldInputPropsOps[Self <: CommonFieldInputProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOnDragStart(value: (DragEvent[_], /* name */ js.UndefOr[String]) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onDragStart")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withOnDrop(value: (DragEvent[_], /* name */ js.UndefOr[String]) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onDrop")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withOnFocus(value: (SyntheticFocusEvent[_], /* name */ js.UndefOr[String]) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onFocus")(js.Any.fromFunction2(value))
        ret
    }
  }
  
}

