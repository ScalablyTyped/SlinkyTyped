package typingsSlinky.gestalt.mod

import typingsSlinky.gestalt.AnonPath
import typingsSlinky.gestalt.gestaltStrings.blue
import typingsSlinky.gestalt.gestaltStrings.darkGray
import typingsSlinky.gestalt.gestaltStrings.eggplant
import typingsSlinky.gestalt.gestaltStrings.gray
import typingsSlinky.gestalt.gestaltStrings.green
import typingsSlinky.gestalt.gestaltStrings.lightGray
import typingsSlinky.gestalt.gestaltStrings.maroon
import typingsSlinky.gestalt.gestaltStrings.midnight
import typingsSlinky.gestalt.gestaltStrings.navy
import typingsSlinky.gestalt.gestaltStrings.olive
import typingsSlinky.gestalt.gestaltStrings.orange
import typingsSlinky.gestalt.gestaltStrings.orchid
import typingsSlinky.gestalt.gestaltStrings.pine
import typingsSlinky.gestalt.gestaltStrings.purple
import typingsSlinky.gestalt.gestaltStrings.red
import typingsSlinky.gestalt.gestaltStrings.watermelon
import typingsSlinky.gestalt.gestaltStrings.white
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IconProps extends js.Object {
  var accessibilityLabel: String
  var color: js.UndefOr[
    blue | darkGray | eggplant | gray | green | lightGray | maroon | midnight | navy | olive | orange | orchid | pine | purple | red | watermelon | white
  ] = js.undefined
  var dangerouslySetSvgPath: js.UndefOr[AnonPath] = js.undefined
  var icon: Icons
  var `inline`: js.UndefOr[Boolean] = js.undefined
  var size: js.UndefOr[Double | String] = js.undefined
}

object IconProps {
  @scala.inline
  def apply(
    accessibilityLabel: String,
    icon: Icons,
    color: blue | darkGray | eggplant | gray | green | lightGray | maroon | midnight | navy | olive | orange | orchid | pine | purple | red | watermelon | white = null,
    dangerouslySetSvgPath: AnonPath = null,
    `inline`: js.UndefOr[Boolean] = js.undefined,
    size: Double | String = null
  ): IconProps = {
    val __obj = js.Dynamic.literal(accessibilityLabel = accessibilityLabel.asInstanceOf[js.Any], icon = icon.asInstanceOf[js.Any])
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (dangerouslySetSvgPath != null) __obj.updateDynamic("dangerouslySetSvgPath")(dangerouslySetSvgPath.asInstanceOf[js.Any])
    if (!js.isUndefined(`inline`)) __obj.updateDynamic("inline")(`inline`.asInstanceOf[js.Any])
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    __obj.asInstanceOf[IconProps]
  }
}

