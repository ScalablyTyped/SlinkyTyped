package typingsSlinky.ionicCliFramework.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Colors extends js.Object {
  var colors: js.UndefOr[typingsSlinky.ionicCliFramework.colorsMod.Colors] = js.undefined
}

object Colors {
  @scala.inline
  def apply(colors: typingsSlinky.ionicCliFramework.colorsMod.Colors = null): Colors = {
    val __obj = js.Dynamic.literal()
    if (colors != null) __obj.updateDynamic("colors")(colors.asInstanceOf[js.Any])
    __obj.asInstanceOf[Colors]
  }
}

