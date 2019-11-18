package typingsSlinky.atMaterialDashUiCore

import slinky.core.facade.ReactRef
import typingsSlinky.react.reactMod.CSSProperties
import typingsSlinky.react.reactMod.Ref
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<@material-ui/core.@material-ui/core/ListItemSecondaryAction.ListItemSecondaryActionProps> */
trait PartialListItemSecondaryActionProps extends js.Object {
  var className: js.UndefOr[String] = js.undefined
  var classes: js.UndefOr[PartialClassNameMapListItemSecondaryActionClassKey] = js.undefined
  var innerRef: js.UndefOr[Ref[_] | ReactRef[_]] = js.undefined
  var style: js.UndefOr[CSSProperties] = js.undefined
}

object PartialListItemSecondaryActionProps {
  @scala.inline
  def apply(
    className: String = null,
    classes: PartialClassNameMapListItemSecondaryActionClassKey = null,
    innerRef: Ref[_] | ReactRef[_] = null,
    style: CSSProperties = null
  ): PartialListItemSecondaryActionProps = {
    val __obj = js.Dynamic.literal()
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (classes != null) __obj.updateDynamic("classes")(classes.asInstanceOf[js.Any])
    if (innerRef != null) __obj.updateDynamic("innerRef")(innerRef.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    __obj.asInstanceOf[PartialListItemSecondaryActionProps]
  }
}

