package typingsSlinky.devextreme.anon

import typingsSlinky.devextreme.devextremeStrings.close
import typingsSlinky.devextreme.devextremeStrings.high
import typingsSlinky.devextreme.devextremeStrings.low
import typingsSlinky.devextreme.devextremeStrings.open
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ColorLevel extends js.Object {
  var color: js.UndefOr[String] = js.undefined
  var level: js.UndefOr[close | high | low | open] = js.undefined
}

object ColorLevel {
  @scala.inline
  def apply(color: String = null, level: close | high | low | open = null): ColorLevel = {
    val __obj = js.Dynamic.literal()
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (level != null) __obj.updateDynamic("level")(level.asInstanceOf[js.Any])
    __obj.asInstanceOf[ColorLevel]
  }
}

