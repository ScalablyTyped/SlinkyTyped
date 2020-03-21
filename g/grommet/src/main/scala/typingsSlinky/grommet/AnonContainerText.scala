package typingsSlinky.grommet

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonContainerText extends js.Object {
  var container: js.UndefOr[AnonAlignPad] = js.undefined
  var text: js.UndefOr[AnonMarginMarginType] = js.undefined
}

object AnonContainerText {
  @scala.inline
  def apply(container: AnonAlignPad = null, text: AnonMarginMarginType = null): AnonContainerText = {
    val __obj = js.Dynamic.literal()
    if (container != null) __obj.updateDynamic("container")(container.asInstanceOf[js.Any])
    if (text != null) __obj.updateDynamic("text")(text.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonContainerText]
  }
}

