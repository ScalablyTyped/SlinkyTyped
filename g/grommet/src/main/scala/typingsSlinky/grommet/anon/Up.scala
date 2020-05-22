package typingsSlinky.grommet.anon

import slinky.core.TagMod
import typingsSlinky.grommet.utilsMod.ColorType
import typingsSlinky.grommet.utilsMod.MarginType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Up extends js.Object {
  var color: js.UndefOr[ColorType] = js.undefined
  var down: js.UndefOr[TagMod[Any]] = js.undefined
  var margin: js.UndefOr[MarginType] = js.undefined
  var up: js.UndefOr[TagMod[Any]] = js.undefined
}

object Up {
  @scala.inline
  def apply(
    color: ColorType = null,
    down: TagMod[Any] = null,
    margin: MarginType = null,
    up: TagMod[Any] = null
  ): Up = {
    val __obj = js.Dynamic.literal()
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (down != null) __obj.updateDynamic("down")(down.asInstanceOf[js.Any])
    if (margin != null) __obj.updateDynamic("margin")(margin.asInstanceOf[js.Any])
    if (up != null) __obj.updateDynamic("up")(up.asInstanceOf[js.Any])
    __obj.asInstanceOf[Up]
  }
}

