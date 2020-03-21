package typingsSlinky.grommet

import typingsSlinky.grommet.grommetStrings.all
import typingsSlinky.grommet.grommetStrings.bottom
import typingsSlinky.grommet.grommetStrings.horizontal
import typingsSlinky.grommet.grommetStrings.large
import typingsSlinky.grommet.grommetStrings.left
import typingsSlinky.grommet.grommetStrings.medium
import typingsSlinky.grommet.grommetStrings.right
import typingsSlinky.grommet.grommetStrings.small
import typingsSlinky.grommet.grommetStrings.top
import typingsSlinky.grommet.grommetStrings.vertical
import typingsSlinky.grommet.grommetStrings.xlarge
import typingsSlinky.grommet.grommetStrings.xsmall
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonFooter extends js.Object {
  var body: js.UndefOr[Boolean | top | left | bottom | right | horizontal | vertical | all | AnonSide] = js.undefined
  var color: js.UndefOr[String | AnonLight] = js.undefined
  var footer: js.UndefOr[Boolean | top | left | bottom | right | horizontal | vertical | all | AnonSide] = js.undefined
  var header: js.UndefOr[Boolean | top | left | bottom | right | horizontal | vertical | all | AnonSide] = js.undefined
  var side: js.UndefOr[top | left | bottom | right | horizontal | vertical | all] = js.undefined
  var size: js.UndefOr[xsmall | small | medium | large | xlarge | String] = js.undefined
}

object AnonFooter {
  @scala.inline
  def apply(
    body: Boolean | top | left | bottom | right | horizontal | vertical | all | AnonSide = null,
    color: String | AnonLight = null,
    footer: Boolean | top | left | bottom | right | horizontal | vertical | all | AnonSide = null,
    header: Boolean | top | left | bottom | right | horizontal | vertical | all | AnonSide = null,
    side: top | left | bottom | right | horizontal | vertical | all = null,
    size: xsmall | small | medium | large | xlarge | String = null
  ): AnonFooter = {
    val __obj = js.Dynamic.literal()
    if (body != null) __obj.updateDynamic("body")(body.asInstanceOf[js.Any])
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (footer != null) __obj.updateDynamic("footer")(footer.asInstanceOf[js.Any])
    if (header != null) __obj.updateDynamic("header")(header.asInstanceOf[js.Any])
    if (side != null) __obj.updateDynamic("side")(side.asInstanceOf[js.Any])
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonFooter]
  }
}

