package typingsSlinky.atMaterialDashUiCore.withWidthWithWidthMod

import slinky.core.facade.ReactRef
import typingsSlinky.atMaterialDashUiCore.stylesCreateBreakpointsMod.Breakpoint
import typingsSlinky.react.reactMod.Ref
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined parent std.Partial<@material-ui/core.@material-ui/core/withWidth/withWidth.WithWidth> */
@js.native
trait WithWidthProps extends js.Object {
  var innerRef: js.UndefOr[Ref[_] | ReactRef[_]] = js.native
  var width: js.UndefOr[Breakpoint] = js.native
}

object WithWidthProps {
  @scala.inline
  def apply(innerRef: Ref[_] | ReactRef[_] = null, width: Breakpoint = null): WithWidthProps = {
    val __obj = js.Dynamic.literal()
    if (innerRef != null) __obj.updateDynamic("innerRef")(innerRef.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[WithWidthProps]
  }
}

