package typingsSlinky.grommet

import typingsSlinky.grommet.grommetStrings.large
import typingsSlinky.grommet.grommetStrings.medium
import typingsSlinky.grommet.grommetStrings.small
import typingsSlinky.grommet.grommetStrings.xlarge
import typingsSlinky.grommet.grommetStrings.xsmall
import typingsSlinky.grommet.grommetStrings.xxlarge
import typingsSlinky.grommet.grommetStrings.xxsmall
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonMax extends js.Object {
  var max: js.UndefOr[xxsmall | xsmall | small | medium | large | xlarge | xxlarge | String] = js.undefined
  var min: js.UndefOr[xxsmall | xsmall | small | medium | large | xlarge | xxlarge | String] = js.undefined
}

object AnonMax {
  @scala.inline
  def apply(
    max: xxsmall | xsmall | small | medium | large | xlarge | xxlarge | String = null,
    min: xxsmall | xsmall | small | medium | large | xlarge | xxlarge | String = null
  ): AnonMax = {
    val __obj = js.Dynamic.literal()
    if (max != null) __obj.updateDynamic("max")(max.asInstanceOf[js.Any])
    if (min != null) __obj.updateDynamic("min")(min.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonMax]
  }
}

