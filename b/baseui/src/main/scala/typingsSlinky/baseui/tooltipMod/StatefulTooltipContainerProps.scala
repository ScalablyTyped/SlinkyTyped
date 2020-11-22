package typingsSlinky.baseui.tooltipMod

import org.scalajs.dom.raw.HTMLElement
import slinky.core.facade.ReactElement
import typingsSlinky.baseui.anon.Close
import typingsSlinky.baseui.anon.PopoverPropschildrennever
import typingsSlinky.baseui.baseuiStrings.auto
import typingsSlinky.baseui.baseuiStrings.bottom
import typingsSlinky.baseui.baseuiStrings.bottomLeft
import typingsSlinky.baseui.baseuiStrings.bottomRight
import typingsSlinky.baseui.baseuiStrings.click
import typingsSlinky.baseui.baseuiStrings.hover
import typingsSlinky.baseui.baseuiStrings.left
import typingsSlinky.baseui.baseuiStrings.leftBottom
import typingsSlinky.baseui.baseuiStrings.leftTop
import typingsSlinky.baseui.baseuiStrings.menu
import typingsSlinky.baseui.baseuiStrings.none
import typingsSlinky.baseui.baseuiStrings.right
import typingsSlinky.baseui.baseuiStrings.rightBottom
import typingsSlinky.baseui.baseuiStrings.rightTop
import typingsSlinky.baseui.baseuiStrings.tooltip
import typingsSlinky.baseui.baseuiStrings.top
import typingsSlinky.baseui.baseuiStrings.topLeft
import typingsSlinky.baseui.baseuiStrings.topRight
import typingsSlinky.baseui.popoverMod.PopoverOverrides
import typingsSlinky.baseui.popoverMod.State
import typingsSlinky.baseui.popoverMod.StateReducer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined baseui.baseui/popover.StatefulPopoverContainerProps */
@js.native
trait StatefulTooltipContainerProps extends js.Object {
  
  var accessibilityType: js.UndefOr[none | menu | tooltip] = js.native
  
  var animateOutTime: js.UndefOr[Double] = js.native
  
  var autoFocus: js.UndefOr[Boolean] = js.native
  
  var children: js.UndefOr[ReactElement] = js.native
  def children(props: PopoverPropschildrennever): ReactElement = js.native
  
  var content: js.UndefOr[ReactElement | (js.Function1[/* args */ Close, ReactElement])] = js.native
  
  var `data-baseweb`: js.UndefOr[String] = js.native
  
  var dismissOnClickOutside: js.UndefOr[Boolean] = js.native
  
  var dismissOnEsc: js.UndefOr[Boolean] = js.native
  
  var focusLock: js.UndefOr[Boolean] = js.native
  
  var id: js.UndefOr[String] = js.native
  
  var ignoreBoundary: js.UndefOr[Boolean] = js.native
  
  var initialState: js.UndefOr[State] = js.native
  
  var mountNode: js.UndefOr[HTMLElement] = js.native
  
  var onClose: js.UndefOr[js.Function0[_]] = js.native
  
  var onMouseEnterDelay: js.UndefOr[Double] = js.native
  
  var onMouseLeaveDelay: js.UndefOr[Double] = js.native
  
  var onOpen: js.UndefOr[js.Function0[_]] = js.native
  
  var overrides: js.UndefOr[PopoverOverrides] = js.native
  
  var placement: js.UndefOr[
    topLeft | leftBottom | topRight | rightBottom | bottomLeft | right | auto | bottomRight | leftTop | left | bottom | rightTop | top
  ] = js.native
  
  var popoverMargin: js.UndefOr[Double] = js.native
  
  var popperOptions: js.UndefOr[js.Any] = js.native
  
  var renderAll: js.UndefOr[Boolean] = js.native
  
  var returnFocus: js.UndefOr[Boolean] = js.native
  
  var showArrow: js.UndefOr[Boolean] = js.native
  
  var stateReducer: js.UndefOr[StateReducer] = js.native
  
  var triggerType: js.UndefOr[click | hover] = js.native
}
