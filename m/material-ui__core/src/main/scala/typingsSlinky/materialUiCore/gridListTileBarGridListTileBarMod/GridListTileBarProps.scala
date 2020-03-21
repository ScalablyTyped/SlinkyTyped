package typingsSlinky.materialUiCore.gridListTileBarGridListTileBarMod

import slinky.core.TagMod
import slinky.core.facade.ReactRef
import typingsSlinky.materialUiCore.PartialClassNameMapGridLiActionIcon
import typingsSlinky.materialUiCore.materialUiCoreStrings.bottom
import typingsSlinky.materialUiCore.materialUiCoreStrings.left
import typingsSlinky.materialUiCore.materialUiCoreStrings.right
import typingsSlinky.materialUiCore.materialUiCoreStrings.top
import typingsSlinky.react.mod.CSSProperties
import typingsSlinky.react.mod.Ref
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined parent @material-ui/core.@material-ui/core.StandardProps<{}, @material-ui/core.@material-ui/core/GridListTileBar/GridListTileBar.GridListTileBarClassKey, never> */
@js.native
trait GridListTileBarProps extends js.Object {
  var actionIcon: js.UndefOr[TagMod[Any]] = js.native
  var actionPosition: js.UndefOr[left | right] = js.native
  var className: js.UndefOr[String] = js.native
  var classes: js.UndefOr[PartialClassNameMapGridLiActionIcon] = js.native
  var innerRef: js.UndefOr[Ref[_] | ReactRef[_]] = js.native
  var style: js.UndefOr[CSSProperties] = js.native
  var subtitle: js.UndefOr[TagMod[Any]] = js.native
  var title: js.UndefOr[TagMod[Any]] = js.native
  var titlePosition: js.UndefOr[top | bottom] = js.native
}

object GridListTileBarProps {
  @scala.inline
  def apply(
    actionIcon: TagMod[Any] = null,
    actionPosition: left | right = null,
    className: String = null,
    classes: PartialClassNameMapGridLiActionIcon = null,
    innerRef: Ref[_] | ReactRef[_] = null,
    style: CSSProperties = null,
    subtitle: TagMod[Any] = null,
    title: TagMod[Any] = null,
    titlePosition: top | bottom = null
  ): GridListTileBarProps = {
    val __obj = js.Dynamic.literal()
    if (actionIcon != null) __obj.updateDynamic("actionIcon")(actionIcon.asInstanceOf[js.Any])
    if (actionPosition != null) __obj.updateDynamic("actionPosition")(actionPosition.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (classes != null) __obj.updateDynamic("classes")(classes.asInstanceOf[js.Any])
    if (innerRef != null) __obj.updateDynamic("innerRef")(innerRef.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (subtitle != null) __obj.updateDynamic("subtitle")(subtitle.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    if (titlePosition != null) __obj.updateDynamic("titlePosition")(titlePosition.asInstanceOf[js.Any])
    __obj.asInstanceOf[GridListTileBarProps]
  }
}

