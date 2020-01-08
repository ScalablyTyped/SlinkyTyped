package typingsSlinky.baseui

import slinky.core.ReactComponentClass
import typingsSlinky.baseui.popoverMod.PopoverProps
import typingsSlinky.baseui.popoverMod.StatefulPopoverContainerProps
import typingsSlinky.baseui.popoverMod.StatefulPopoverProps
import typingsSlinky.react.reactMod.Component
import typingsSlinky.styletronDashReact.styletronDashReactMod.StyletronComponent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("baseui/tooltip", JSImport.Namespace)
@js.native
object tooltipMod extends js.Object {
  @js.native
  class StatefulContainer ()
    extends Component[StatefulTooltipContainerProps, js.Object, js.Any]
  
  @js.native
  class Tooltip ()
    extends Component[TooltipProps, js.Object, js.Any]
  
  val ACCESSIBILITY_TYPE: typingsSlinky.baseui.popoverMod.ACCESSIBILITY_TYPE = js.native
  val PLACEMENT: typingsSlinky.baseui.popoverMod.PLACEMENT = js.native
  val StatefulTooltip: ReactComponentClass[StatefulTooltipProps] = js.native
  val StyledArrow: StyletronComponent[js.Any] = js.native
  val StyledBody: StyletronComponent[js.Any] = js.native
  val StyledInner: StyletronComponent[js.Any] = js.native
  val TRIGGER_TYPE: typingsSlinky.baseui.popoverMod.TRIGGER_TYPE = js.native
  type StatefulTooltipContainerProps = StatefulPopoverContainerProps
  type StatefulTooltipProps = StatefulPopoverProps
  type TooltipProps = PopoverProps
}

