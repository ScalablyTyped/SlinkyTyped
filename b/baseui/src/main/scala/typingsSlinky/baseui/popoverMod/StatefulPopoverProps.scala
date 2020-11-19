package typingsSlinky.baseui.popoverMod

import org.scalajs.dom.raw.HTMLElement
import slinky.core.facade.ReactElement
import typingsSlinky.baseui.anon.Close
import typingsSlinky.baseui.baseuiStrings.auto
import typingsSlinky.baseui.baseuiStrings.bottom
import typingsSlinky.baseui.baseuiStrings.bottomLeft
import typingsSlinky.baseui.baseuiStrings.bottomRight
import typingsSlinky.baseui.baseuiStrings.click
import typingsSlinky.baseui.baseuiStrings.close
import typingsSlinky.baseui.baseuiStrings.hover
import typingsSlinky.baseui.baseuiStrings.left
import typingsSlinky.baseui.baseuiStrings.leftBottom
import typingsSlinky.baseui.baseuiStrings.leftTop
import typingsSlinky.baseui.baseuiStrings.menu
import typingsSlinky.baseui.baseuiStrings.none
import typingsSlinky.baseui.baseuiStrings.open
import typingsSlinky.baseui.baseuiStrings.right
import typingsSlinky.baseui.baseuiStrings.rightBottom
import typingsSlinky.baseui.baseuiStrings.rightTop
import typingsSlinky.baseui.baseuiStrings.tooltip
import typingsSlinky.baseui.baseuiStrings.top
import typingsSlinky.baseui.baseuiStrings.topLeft
import typingsSlinky.baseui.baseuiStrings.topRight
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined baseui.baseui/popover.BasePopoverProps & {  children :react.react.ReactNode | undefined,   content :react.react.ReactNode | (args : {close (): void}): react.react.ReactNode | undefined,   dismissOnClickOutside :boolean | undefined,   dismissOnEsc :boolean | undefined,   initialState :baseui.baseui/popover.State | undefined,   onClose :(): any | undefined,   onOpen :(): any | undefined,   stateReducer :baseui.baseui/popover.StateReducer | undefined} */
@js.native
trait StatefulPopoverProps extends js.Object {
  
  var accessibilityType: js.UndefOr[none | menu | tooltip] = js.native
  
  var animateOutTime: js.UndefOr[Double] = js.native
  
  var autoFocus: js.UndefOr[Boolean] = js.native
  
  var children: js.UndefOr[ReactElement] = js.native
  
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
  
  var overrides: js.UndefOr[Overrides] = js.native
  
  var placement: js.UndefOr[
    topLeft | leftBottom | topRight | rightBottom | bottomLeft | right | auto | bottomRight | leftTop | left | bottom | rightTop | top
  ] = js.native
  
  var popperOptions: js.UndefOr[js.Any] = js.native
  
  var renderAll: js.UndefOr[Boolean] = js.native
  
  var returnFocus: js.UndefOr[Boolean] = js.native
  
  var showArrow: js.UndefOr[Boolean] = js.native
  
  var stateReducer: js.UndefOr[StateReducer] = js.native
  
  var triggerType: js.UndefOr[click | hover] = js.native
}
object StatefulPopoverProps {
  
  @scala.inline
  def apply(): StatefulPopoverProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StatefulPopoverProps]
  }
  
  @scala.inline
  implicit class StatefulPopoverPropsOps[Self <: StatefulPopoverProps] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAccessibilityType(value: none | menu | tooltip): Self = this.set("accessibilityType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAccessibilityType: Self = this.set("accessibilityType", js.undefined)
    
    @scala.inline
    def setAnimateOutTime(value: Double): Self = this.set("animateOutTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAnimateOutTime: Self = this.set("animateOutTime", js.undefined)
    
    @scala.inline
    def setAutoFocus(value: Boolean): Self = this.set("autoFocus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAutoFocus: Self = this.set("autoFocus", js.undefined)
    
    @scala.inline
    def setChildrenReactElement(value: ReactElement): Self = this.set("children", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChildren(value: ReactElement): Self = this.set("children", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteChildren: Self = this.set("children", js.undefined)
    
    @scala.inline
    def setContentReactElement(value: ReactElement): Self = this.set("content", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContentFunction1(value: /* args */ Close => ReactElement): Self = this.set("content", js.Any.fromFunction1(value))
    
    @scala.inline
    def setContent(value: ReactElement | (js.Function1[/* args */ Close, ReactElement])): Self = this.set("content", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteContent: Self = this.set("content", js.undefined)
    
    @scala.inline
    def `setData-baseweb`(value: String): Self = this.set("data-baseweb", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deleteData-baseweb`: Self = this.set("data-baseweb", js.undefined)
    
    @scala.inline
    def setDismissOnClickOutside(value: Boolean): Self = this.set("dismissOnClickOutside", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDismissOnClickOutside: Self = this.set("dismissOnClickOutside", js.undefined)
    
    @scala.inline
    def setDismissOnEsc(value: Boolean): Self = this.set("dismissOnEsc", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDismissOnEsc: Self = this.set("dismissOnEsc", js.undefined)
    
    @scala.inline
    def setFocusLock(value: Boolean): Self = this.set("focusLock", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFocusLock: Self = this.set("focusLock", js.undefined)
    
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteId: Self = this.set("id", js.undefined)
    
    @scala.inline
    def setIgnoreBoundary(value: Boolean): Self = this.set("ignoreBoundary", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIgnoreBoundary: Self = this.set("ignoreBoundary", js.undefined)
    
    @scala.inline
    def setInitialState(value: State): Self = this.set("initialState", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInitialState: Self = this.set("initialState", js.undefined)
    
    @scala.inline
    def setMountNode(value: HTMLElement): Self = this.set("mountNode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMountNode: Self = this.set("mountNode", js.undefined)
    
    @scala.inline
    def setOnClose(value: () => _): Self = this.set("onClose", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteOnClose: Self = this.set("onClose", js.undefined)
    
    @scala.inline
    def setOnMouseEnterDelay(value: Double): Self = this.set("onMouseEnterDelay", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnMouseEnterDelay: Self = this.set("onMouseEnterDelay", js.undefined)
    
    @scala.inline
    def setOnMouseLeaveDelay(value: Double): Self = this.set("onMouseLeaveDelay", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnMouseLeaveDelay: Self = this.set("onMouseLeaveDelay", js.undefined)
    
    @scala.inline
    def setOnOpen(value: () => _): Self = this.set("onOpen", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteOnOpen: Self = this.set("onOpen", js.undefined)
    
    @scala.inline
    def setOverrides(value: Overrides): Self = this.set("overrides", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOverrides: Self = this.set("overrides", js.undefined)
    
    @scala.inline
    def setPlacement(
      value: topLeft | leftBottom | topRight | rightBottom | bottomLeft | right | auto | bottomRight | leftTop | left | bottom | rightTop | top
    ): Self = this.set("placement", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePlacement: Self = this.set("placement", js.undefined)
    
    @scala.inline
    def setPopperOptions(value: js.Any): Self = this.set("popperOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePopperOptions: Self = this.set("popperOptions", js.undefined)
    
    @scala.inline
    def setRenderAll(value: Boolean): Self = this.set("renderAll", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRenderAll: Self = this.set("renderAll", js.undefined)
    
    @scala.inline
    def setReturnFocus(value: Boolean): Self = this.set("returnFocus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReturnFocus: Self = this.set("returnFocus", js.undefined)
    
    @scala.inline
    def setShowArrow(value: Boolean): Self = this.set("showArrow", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShowArrow: Self = this.set("showArrow", js.undefined)
    
    @scala.inline
    def setStateReducer(
      value: (/* stateChangeType */ open | close, /* nextState */ State, /* currentState */ State) => State
    ): Self = this.set("stateReducer", js.Any.fromFunction3(value))
    
    @scala.inline
    def deleteStateReducer: Self = this.set("stateReducer", js.undefined)
    
    @scala.inline
    def setTriggerType(value: click | hover): Self = this.set("triggerType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTriggerType: Self = this.set("triggerType", js.undefined)
  }
}
