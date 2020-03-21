package typingsSlinky.grommet

import typingsSlinky.grommet.grommetStrings.auto
import typingsSlinky.grommet.grommetStrings.hidden
import typingsSlinky.grommet.grommetStrings.scroll
import typingsSlinky.grommet.grommetStrings.visible
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonHorizontal extends js.Object {
  var horizontal: js.UndefOr[auto | hidden | scroll | visible] = js.undefined
  var vertical: js.UndefOr[auto | hidden | scroll | visible] = js.undefined
}

object AnonHorizontal {
  @scala.inline
  def apply(
    horizontal: auto | hidden | scroll | visible = null,
    vertical: auto | hidden | scroll | visible = null
  ): AnonHorizontal = {
    val __obj = js.Dynamic.literal()
    if (horizontal != null) __obj.updateDynamic("horizontal")(horizontal.asInstanceOf[js.Any])
    if (vertical != null) __obj.updateDynamic("vertical")(vertical.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonHorizontal]
  }
}

