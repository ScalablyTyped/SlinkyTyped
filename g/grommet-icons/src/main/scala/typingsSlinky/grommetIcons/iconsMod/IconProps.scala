package typingsSlinky.grommetIcons.iconsMod

import typingsSlinky.grommetIcons.grommetIconsStrings.large
import typingsSlinky.grommetIcons.grommetIconsStrings.medium
import typingsSlinky.grommetIcons.grommetIconsStrings.small
import typingsSlinky.grommetIcons.grommetIconsStrings.xlarge
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IconProps extends js.Object {
  var a11yTitle: js.UndefOr[String] = js.undefined
  var color: js.UndefOr[String] = js.undefined
  var size: js.UndefOr[small | medium | large | xlarge | String] = js.undefined
}

object IconProps {
  @scala.inline
  def apply(
    a11yTitle: String = null,
    color: String = null,
    size: small | medium | large | xlarge | String = null
  ): IconProps = {
    val __obj = js.Dynamic.literal()
    if (a11yTitle != null) __obj.updateDynamic("a11yTitle")(a11yTitle.asInstanceOf[js.Any])
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    __obj.asInstanceOf[IconProps]
  }
}

