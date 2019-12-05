package typingsSlinky.reduxDashForm.libFieldMod

import slinky.web.SyntheticFocusEvent
import typingsSlinky.react.reactMod.DragEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CommonFieldInputProps extends js.Object {
  var name: String
  var onDragStart: EventHandler[DragEvent[_]]
  var onDrop: EventHandler[DragEvent[_]]
  var onFocus: EventHandler[SyntheticFocusEvent[_]]
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
}

