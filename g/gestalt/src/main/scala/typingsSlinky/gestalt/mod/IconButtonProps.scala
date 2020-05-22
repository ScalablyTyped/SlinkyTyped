package typingsSlinky.gestalt.mod

import typingsSlinky.gestalt.anon.Event
import typingsSlinky.gestalt.anon.Path
import typingsSlinky.gestalt.gestaltStrings.blue
import typingsSlinky.gestalt.gestaltStrings.darkGray
import typingsSlinky.gestalt.gestaltStrings.gray
import typingsSlinky.gestalt.gestaltStrings.lg
import typingsSlinky.gestalt.gestaltStrings.lightGray
import typingsSlinky.gestalt.gestaltStrings.md
import typingsSlinky.gestalt.gestaltStrings.orange
import typingsSlinky.gestalt.gestaltStrings.red
import typingsSlinky.gestalt.gestaltStrings.sm
import typingsSlinky.gestalt.gestaltStrings.transparent
import typingsSlinky.gestalt.gestaltStrings.transparentDarkGray
import typingsSlinky.gestalt.gestaltStrings.white
import typingsSlinky.gestalt.gestaltStrings.xl
import typingsSlinky.gestalt.gestaltStrings.xs
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IconButtonProps extends js.Object {
  var accessibilityExpanded: js.UndefOr[Boolean] = js.undefined
  var accessibilityHaspopup: js.UndefOr[Boolean] = js.undefined
  var accessibilityLabel: String
  var bgColor: js.UndefOr[transparent | transparentDarkGray | gray | lightGray | white | blue] = js.undefined
  var dangerouslySetSvgPath: js.UndefOr[Path] = js.undefined
  var disabled: js.UndefOr[Boolean] = js.undefined
  var icon: js.UndefOr[Icons] = js.undefined
  var iconColor: js.UndefOr[blue | darkGray | gray | red | white | orange] = js.undefined
  var onClick: js.UndefOr[js.Function1[/* args */ Event, Unit]] = js.undefined
  var selected: js.UndefOr[Boolean] = js.undefined
  var size: js.UndefOr[xs | sm | md | lg | xl] = js.undefined
}

object IconButtonProps {
  @scala.inline
  def apply(
    accessibilityLabel: String,
    accessibilityExpanded: js.UndefOr[Boolean] = js.undefined,
    accessibilityHaspopup: js.UndefOr[Boolean] = js.undefined,
    bgColor: transparent | transparentDarkGray | gray | lightGray | white | blue = null,
    dangerouslySetSvgPath: Path = null,
    disabled: js.UndefOr[Boolean] = js.undefined,
    icon: Icons = null,
    iconColor: blue | darkGray | gray | red | white | orange = null,
    onClick: /* args */ Event => Unit = null,
    selected: js.UndefOr[Boolean] = js.undefined,
    size: xs | sm | md | lg | xl = null
  ): IconButtonProps = {
    val __obj = js.Dynamic.literal(accessibilityLabel = accessibilityLabel.asInstanceOf[js.Any])
    if (!js.isUndefined(accessibilityExpanded)) __obj.updateDynamic("accessibilityExpanded")(accessibilityExpanded.get.asInstanceOf[js.Any])
    if (!js.isUndefined(accessibilityHaspopup)) __obj.updateDynamic("accessibilityHaspopup")(accessibilityHaspopup.get.asInstanceOf[js.Any])
    if (bgColor != null) __obj.updateDynamic("bgColor")(bgColor.asInstanceOf[js.Any])
    if (dangerouslySetSvgPath != null) __obj.updateDynamic("dangerouslySetSvgPath")(dangerouslySetSvgPath.asInstanceOf[js.Any])
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled.get.asInstanceOf[js.Any])
    if (icon != null) __obj.updateDynamic("icon")(icon.asInstanceOf[js.Any])
    if (iconColor != null) __obj.updateDynamic("iconColor")(iconColor.asInstanceOf[js.Any])
    if (onClick != null) __obj.updateDynamic("onClick")(js.Any.fromFunction1(onClick))
    if (!js.isUndefined(selected)) __obj.updateDynamic("selected")(selected.get.asInstanceOf[js.Any])
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    __obj.asInstanceOf[IconButtonProps]
  }
}

