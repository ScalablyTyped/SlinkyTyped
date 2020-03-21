package typingsSlinky.grommet

import typingsSlinky.grommet.grommetStrings.medium
import typingsSlinky.grommet.grommetStrings.strong
import typingsSlinky.grommet.grommetStrings.weak
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonOpacity extends js.Object {
  var color: js.UndefOr[String] = js.undefined
  var opacity: js.UndefOr[weak | medium | strong | Boolean | Double] = js.undefined
}

object AnonOpacity {
  @scala.inline
  def apply(color: String = null, opacity: weak | medium | strong | Boolean | Double = null): AnonOpacity = {
    val __obj = js.Dynamic.literal()
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (opacity != null) __obj.updateDynamic("opacity")(opacity.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonOpacity]
  }
}

