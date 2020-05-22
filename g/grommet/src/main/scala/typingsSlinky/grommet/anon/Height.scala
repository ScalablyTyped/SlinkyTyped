package typingsSlinky.grommet.anon

import typingsSlinky.grommet.grommetStrings.full
import typingsSlinky.grommet.grommetStrings.large
import typingsSlinky.grommet.grommetStrings.medium
import typingsSlinky.grommet.grommetStrings.small
import typingsSlinky.grommet.grommetStrings.xlarge
import typingsSlinky.grommet.grommetStrings.xsmall
import typingsSlinky.grommet.grommetStrings.xxsmall
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Height extends js.Object {
  var height: js.UndefOr[xxsmall | xsmall | small | medium | large | xlarge | full | String] = js.undefined
  var width: js.UndefOr[xxsmall | xsmall | small | medium | large | xlarge | full | String] = js.undefined
}

object Height {
  @scala.inline
  def apply(
    height: xxsmall | xsmall | small | medium | large | xlarge | full | String = null,
    width: xxsmall | xsmall | small | medium | large | xlarge | full | String = null
  ): Height = {
    val __obj = js.Dynamic.literal()
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[Height]
  }
}

