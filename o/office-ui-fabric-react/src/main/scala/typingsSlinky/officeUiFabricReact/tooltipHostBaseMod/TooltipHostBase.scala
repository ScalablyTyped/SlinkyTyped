package typingsSlinky.officeUiFabricReact.tooltipHostBaseMod

import typingsSlinky.officeUiFabricReact.anon.Delay
import typingsSlinky.officeUiFabricReact.tooltipHostTypesMod.ITooltipHost
import typingsSlinky.officeUiFabricReact.tooltipHostTypesMod.ITooltipHostProps
import typingsSlinky.react.mod.Component
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("office-ui-fabric-react/lib/components/Tooltip/TooltipHost.base", "TooltipHostBase")
@js.native
class TooltipHostBase protected ()
  extends Component[ITooltipHostProps, ITooltipHostState, js.Any]
     with ITooltipHost {
  def this(props: ITooltipHostProps) = this()
  
  var _async: js.Any = js.native
  
  var _classNames: js.Any = js.native
  
  var _clearDismissTimer: js.Any = js.native
  
  var _clearOpenTimer: js.Any = js.native
  
  var _defaultTooltipId: js.Any = js.native
  
  var _dismissTimerId: js.Any = js.native
  
  var _getDelayTime: js.Any = js.native
  
  var _getTargetElement: js.Any = js.native
  
  var _hideTooltip: js.Any = js.native
  
  var _onTooltipKeyDown: js.Any = js.native
  
  var _onTooltipMouseEnter: js.Any = js.native
  
  var _onTooltipMouseLeave: js.Any = js.native
  
  var _openTimerId: js.Any = js.native
  
  var _toggleTooltip: js.Any = js.native
  
  var _tooltipHost: js.Any = js.native
  
  @JSName("componentWillUnmount")
  def componentWillUnmount_MTooltipHostBase(): Unit = js.native
}
/* static members */
@JSImport("office-ui-fabric-react/lib/components/Tooltip/TooltipHost.base", "TooltipHostBase")
@js.native
object TooltipHostBase extends js.Object {
  
  var _currentVisibleTooltip: js.Any = js.native
  
  var defaultProps: Delay = js.native
}
