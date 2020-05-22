package typingsSlinky.nivoColors.anon

import typingsSlinky.nivoColors.mod.ColorModifier
import typingsSlinky.nivoColors.mod._InheritedColorProp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait From
  extends _InheritedColorProp[js.Any] {
  var from: String
  var modifiers: js.UndefOr[js.Array[ColorModifier]] = js.undefined
}

object From {
  @scala.inline
  def apply(from: String, modifiers: js.Array[ColorModifier] = null): From = {
    val __obj = js.Dynamic.literal(from = from.asInstanceOf[js.Any])
    if (modifiers != null) __obj.updateDynamic("modifiers")(modifiers.asInstanceOf[js.Any])
    __obj.asInstanceOf[From]
  }
}

