package typingsSlinky.baseui.popoverMod

import org.scalajs.dom.raw.Event
import org.scalajs.dom.raw.KeyboardEvent
import org.scalajs.dom.raw.MouseEvent
import slinky.core.facade.ReactElement
import typingsSlinky.baseui.anon.ArrowOffset
import typingsSlinky.baseui.anon.SharedStylePropsArgchildrArrowOffset
import typingsSlinky.baseui.layerMod.NormalizedOffsets
import typingsSlinky.baseui.layerMod.PopperDataObject
import typingsSlinky.react.mod.Component
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("baseui/popover", "Popover")
@js.native
class Popover ()
  extends Component[PopoverProps, PopoverPrivateState, js.Any] {
  
  def addDomEvents(): Unit = js.native
  
  def animateIn(): Unit = js.native
  
  def animateOut(): Unit = js.native
  
  def clearTimers(): Unit = js.native
  
  def getAnchorFromChildren(): ReactElement = js.native
  
  def getAnchorIdAttr(): String | Null = js.native
  
  def getAnchorProps(): js.Object = js.native
  
  def getDefaultState(props: PopoverProps): ArrowOffset = js.native
  
  def getPopoverBodyProps(): js.Object = js.native
  
  def getPopoverIdAttr(): String | Null = js.native
  
  def getSharedProps(): SharedStylePropsArgchildrArrowOffset = js.native
  
  def init(prevProps: PopoverProps, prevState: PopoverPrivateState): Unit = js.native
  
  def isAccessibilityTypeMenu(): Boolean = js.native
  
  def isAccessibilityTypeTooltip(): Boolean = js.native
  
  def isClickTrigger(): Boolean = js.native
  
  def isHoverTrigger(): Boolean = js.native
  
  def onAnchorClick(e: Event): Unit = js.native
  
  def onAnchorMouseEnter(): Unit = js.native
  
  def onAnchorMouseLeave(): Unit = js.native
  
  def onDocumentClick(evt: MouseEvent): Unit = js.native
  
  def onKeyPress(evt: KeyboardEvent): Unit = js.native
  
  def onPopoverMouseEnter(): Unit = js.native
  
  def onPopoverMouseLeave(): Unit = js.native
  
  def onPopperUpdate(normalizedOffsets: NormalizedOffsets, data: PopperDataObject): Unit = js.native
  
  def removeDomEvents(): Unit = js.native
  
  def renderAnchor(): ReactElement = js.native
  
  def renderPopover(): ReactElement = js.native
  
  def triggerOnMouseEnter(): Unit = js.native
  
  def triggerOnMouseEnterWithDelay(): Unit = js.native
  
  def triggerOnMouseLeave(): Unit = js.native
  
  def triggerOnMouseLeaveWithDelay(): Unit = js.native
}
