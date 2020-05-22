package typingsSlinky.gestalt.mod

import typingsSlinky.gestalt.anon.PathString
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

trait PogProps extends js.Object {
  var active: js.UndefOr[Boolean] = js.undefined
  var bgColor: js.UndefOr[transparent | lightGray | white | gray | blue | transparentDarkGray] = js.undefined
  var dangerouslySetSvgPath: js.UndefOr[PathString] = js.undefined
  var focused: js.UndefOr[Boolean] = js.undefined
  var hovered: js.UndefOr[Boolean] = js.undefined
  var icon: js.UndefOr[Icons] = js.undefined
  var iconColor: js.UndefOr[blue | darkGray | gray | red | white | orange] = js.undefined
  var selected: js.UndefOr[Boolean] = js.undefined
  var size: js.UndefOr[xs | sm | md | lg | xl] = js.undefined
}

object PogProps {
  @scala.inline
  def apply(
    active: js.UndefOr[Boolean] = js.undefined,
    bgColor: transparent | lightGray | white | gray | blue | transparentDarkGray = null,
    dangerouslySetSvgPath: PathString = null,
    focused: js.UndefOr[Boolean] = js.undefined,
    hovered: js.UndefOr[Boolean] = js.undefined,
    icon: Icons = null,
    iconColor: blue | darkGray | gray | red | white | orange = null,
    selected: js.UndefOr[Boolean] = js.undefined,
    size: xs | sm | md | lg | xl = null
  ): PogProps = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(active)) __obj.updateDynamic("active")(active.get.asInstanceOf[js.Any])
    if (bgColor != null) __obj.updateDynamic("bgColor")(bgColor.asInstanceOf[js.Any])
    if (dangerouslySetSvgPath != null) __obj.updateDynamic("dangerouslySetSvgPath")(dangerouslySetSvgPath.asInstanceOf[js.Any])
    if (!js.isUndefined(focused)) __obj.updateDynamic("focused")(focused.get.asInstanceOf[js.Any])
    if (!js.isUndefined(hovered)) __obj.updateDynamic("hovered")(hovered.get.asInstanceOf[js.Any])
    if (icon != null) __obj.updateDynamic("icon")(icon.asInstanceOf[js.Any])
    if (iconColor != null) __obj.updateDynamic("iconColor")(iconColor.asInstanceOf[js.Any])
    if (!js.isUndefined(selected)) __obj.updateDynamic("selected")(selected.get.asInstanceOf[js.Any])
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    __obj.asInstanceOf[PogProps]
  }
}

