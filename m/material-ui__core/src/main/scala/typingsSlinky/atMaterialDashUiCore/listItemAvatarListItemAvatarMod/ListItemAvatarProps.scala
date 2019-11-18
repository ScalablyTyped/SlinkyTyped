package typingsSlinky.atMaterialDashUiCore.listItemAvatarListItemAvatarMod

import slinky.core.facade.ReactRef
import typingsSlinky.atMaterialDashUiCore.PartialClassNameMapListItemAvatarClassKey
import typingsSlinky.react.reactMod.CSSProperties
import typingsSlinky.react.reactMod.Ref
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined parent @material-ui/core.@material-ui/core.StandardProps<{}, @material-ui/core.@material-ui/core/ListItemAvatar/ListItemAvatar.ListItemAvatarClassKey, never> */
trait ListItemAvatarProps extends js.Object {
  var className: js.UndefOr[String] = js.undefined
  var classes: js.UndefOr[PartialClassNameMapListItemAvatarClassKey] = js.undefined
  var innerRef: js.UndefOr[Ref[_] | ReactRef[_]] = js.undefined
  var style: js.UndefOr[CSSProperties] = js.undefined
}

object ListItemAvatarProps {
  @scala.inline
  def apply(
    className: String = null,
    classes: PartialClassNameMapListItemAvatarClassKey = null,
    innerRef: Ref[_] | ReactRef[_] = null,
    style: CSSProperties = null
  ): ListItemAvatarProps = {
    val __obj = js.Dynamic.literal()
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (classes != null) __obj.updateDynamic("classes")(classes.asInstanceOf[js.Any])
    if (innerRef != null) __obj.updateDynamic("innerRef")(innerRef.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListItemAvatarProps]
  }
}

