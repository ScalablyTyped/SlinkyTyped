package typingsSlinky.reactColor.mod

import slinky.core.TagMod
import typingsSlinky.react.mod.ClassAttributes
import typingsSlinky.react.mod.Key
import typingsSlinky.react.mod.LegacyRef
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CustomPickerProps[A] extends ClassAttributes[A] {
  var color: js.UndefOr[Color] = js.undefined
  var onChange: ColorChangeHandler
  var pointer: js.UndefOr[TagMod[Any]] = js.undefined
}

object CustomPickerProps {
  @scala.inline
  def apply[A](
    onChange: /* color */ ColorResult => Unit,
    color: Color = null,
    key: Key = null,
    pointer: TagMod[Any] = null,
    ref: LegacyRef[A] = null
  ): CustomPickerProps[A] = {
    val __obj = js.Dynamic.literal(onChange = js.Any.fromFunction1(onChange))
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (key != null) __obj.updateDynamic("key")(key.asInstanceOf[js.Any])
    if (pointer != null) __obj.updateDynamic("pointer")(pointer.asInstanceOf[js.Any])
    if (ref != null) __obj.updateDynamic("ref")(ref.asInstanceOf[js.Any])
    __obj.asInstanceOf[CustomPickerProps[A]]
  }
}

