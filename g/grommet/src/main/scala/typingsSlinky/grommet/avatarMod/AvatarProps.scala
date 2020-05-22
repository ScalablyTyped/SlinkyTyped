package typingsSlinky.grommet.avatarMod

import typingsSlinky.grommet.grommetStrings.large
import typingsSlinky.grommet.grommetStrings.medium
import typingsSlinky.grommet.grommetStrings.small
import typingsSlinky.grommet.grommetStrings.xlarge
import typingsSlinky.grommet.grommetStrings.xsmall
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AvatarProps extends js.Object {
  var size: js.UndefOr[xsmall | small | medium | large | xlarge | String] = js.undefined
  var src: js.UndefOr[String] = js.undefined
}

object AvatarProps {
  @scala.inline
  def apply(size: xsmall | small | medium | large | xlarge | String = null, src: String = null): AvatarProps = {
    val __obj = js.Dynamic.literal()
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    if (src != null) __obj.updateDynamic("src")(src.asInstanceOf[js.Any])
    __obj.asInstanceOf[AvatarProps]
  }
}

