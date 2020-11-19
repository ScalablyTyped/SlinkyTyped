package typingsSlinky.officeUiFabricReact.panelBaseMod

import org.scalajs.dom.raw.Event
import org.scalajs.dom.raw.HTMLElement
import slinky.core.SyntheticEvent
import typingsSlinky.officeUiFabricReact.anon.PartialIPanelState
import typingsSlinky.officeUiFabricReact.anon.ReadonlyIPanelProps
import typingsSlinky.officeUiFabricReact.anon.ReadonlyIPanelState
import typingsSlinky.officeUiFabricReact.panelTypesMod.IPanel
import typingsSlinky.officeUiFabricReact.panelTypesMod.IPanelProps
import typingsSlinky.react.mod.Component
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("office-ui-fabric-react/lib/components/Panel/Panel.base", "PanelBase")
@js.native
class PanelBase protected ()
  extends Component[IPanelProps, IPanelState, js.Any]
     with IPanel {
  def this(props: IPanelProps) = this()
  
  var _allowScrollOnPanel: js.Any = js.native
  
  var _allowTouchBodyScroll: js.Any = js.native
  
  var _animateTo: js.Any = js.native
  
  var _animationCallback: js.Any = js.native
  
  var _async: js.Any = js.native
  
  var _classNames: js.Any = js.native
  
  var _clearExistingAnimationTimer: js.Any = js.native
  
  var _dismissOnOuterClick: js.Any = js.native
  
  var _events: js.Any = js.native
  
  var _hasCustomNavigation: js.Any = js.native
  
  var _headerTextId: js.Any = js.native
  
  var _onPanelClick: js.Any = js.native
  
  var _onRenderBody: js.Any = js.native
  
  var _onRenderFooter: js.Any = js.native
  
  var _onRenderHeader: js.Any = js.native
  
  var _onRenderNavigation: js.Any = js.native
  
  var _onRenderNavigationContent: js.Any = js.native
  
  var _onTransitionComplete: js.Any = js.native
  
  var _panel: js.Any = js.native
  
  var _scrollableContent: js.Any = js.native
  
  var _shouldListenForOuterClick: js.Any = js.native
  
  var _updateFooterPosition: js.Any = js.native
  
  def close(): Unit = js.native
  
  @JSName("componentDidMount")
  def componentDidMount_MPanelBase(): Unit = js.native
  
  @JSName("componentDidUpdate")
  def componentDidUpdate_MPanelBase(previousProps: IPanelProps, previousState: IPanelState): Unit = js.native
  
  @JSName("componentWillUnmount")
  def componentWillUnmount_MPanelBase(): Unit = js.native
  
  def dismiss(ev: SyntheticEvent[Event, HTMLElement]): Unit = js.native
  
  /** isActive is true when panel is open or opening. */
  val isActive: Boolean = js.native
}
/* static members */
@JSImport("office-ui-fabric-react/lib/components/Panel/Panel.base", "PanelBase")
@js.native
object PanelBase extends js.Object {
  
  var defaultProps: IPanelProps = js.native
  
  def getDerivedStateFromProps(nextProps: ReadonlyIPanelProps, prevState: ReadonlyIPanelState): PartialIPanelState | Null = js.native
}
