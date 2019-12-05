package typingsSlinky.reactDashColor.libComponentsCommonHueMod

import slinky.core.TagMod
import typingsSlinky.react.reactMod.Key
import typingsSlinky.react.reactMod.LegacyRef
import typingsSlinky.reactDashColor.reactDashColorMod.Color
import typingsSlinky.reactDashColor.reactDashColorMod.ColorResult
import typingsSlinky.reactDashColor.reactDashColorMod.CustomPickerProps
import typingsSlinky.reactDashColor.reactDashColorStrings.horizontal
import typingsSlinky.reactDashColor.reactDashColorStrings.vertical
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HueProps extends CustomPickerProps[Hue] {
  var direction: js.UndefOr[horizontal | vertical] = js.undefined
}

object HueProps {
  @scala.inline
  def apply(
    onChange: /* color */ ColorResult => Unit,
    color: Color = null,
    direction: horizontal | vertical = null,
    key: Key = null,
    pointer: TagMod[Any] = null,
    ref: LegacyRef[Hue] = null
  ): HueProps = {
    val __obj = js.Dynamic.literal(onChange = js.Any.fromFunction1(onChange))
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (direction != null) __obj.updateDynamic("direction")(direction.asInstanceOf[js.Any])
    if (key != null) __obj.updateDynamic("key")(key.asInstanceOf[js.Any])
    if (pointer != null) __obj.updateDynamic("pointer")(pointer.asInstanceOf[js.Any])
    if (ref != null) __obj.updateDynamic("ref")(ref.asInstanceOf[js.Any])
    __obj.asInstanceOf[HueProps]
  }
}

