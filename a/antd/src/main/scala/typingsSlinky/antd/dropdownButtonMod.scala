package typingsSlinky.antd

import org.scalablytyped.runtime.Shortcut
import org.scalajs.dom.raw.HTMLButtonElement
import org.scalajs.dom.raw.HTMLElement
import slinky.core.facade.ReactElement
import slinky.web.SyntheticMouseEvent
import typingsSlinky.antd.antdStrings.click
import typingsSlinky.antd.antdStrings.contextMenu
import typingsSlinky.antd.antdStrings.hover
import typingsSlinky.antd.buttonButtonMod.ButtonHTMLType
import typingsSlinky.antd.buttonGroupMod.ButtonGroupProps
import typingsSlinky.antd.dropdownDropdownMod.Align
import typingsSlinky.antd.dropdownDropdownMod.OverlayFunc
import typingsSlinky.antd.dropdownDropdownMod.Placement
import typingsSlinky.react.mod.CSSProperties
import typingsSlinky.react.mod.FunctionComponent
import typingsSlinky.react.mod.MouseEventHandler
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object dropdownButtonMod extends Shortcut {
  
  @JSImport("antd/lib/dropdown/dropdown-button", JSImport.Default)
  @js.native
  val default: DropdownButtonInterface = js.native
  
  @js.native
  trait DropdownButtonInterface extends FunctionComponent[DropdownButtonProps] {
    
    var __ANT_BUTTON: Boolean = js.native
  }
  
  /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
  - typingsSlinky.antd.dropdownDropdownMod.DropDownProps because var conflicts: className, prefixCls. Inlined arrow, trigger, overlay, onVisibleChange, visible, disabled, align, getPopupContainer, transitionName, placement, overlayClassName, overlayStyle, forceRender, mouseEnterDelay, mouseLeaveDelay, openClassName */ @js.native
  trait DropdownButtonProps extends ButtonGroupProps {
    
    var align: js.UndefOr[Align] = js.native
    
    var arrow: js.UndefOr[Boolean] = js.native
    
    var buttonsRender: js.UndefOr[js.Function1[/* buttons */ js.Array[ReactElement], js.Array[ReactElement]]] = js.native
    
    var children: js.UndefOr[ReactElement] = js.native
    
    var disabled: js.UndefOr[Boolean] = js.native
    
    var forceRender: js.UndefOr[Boolean] = js.native
    
    var getPopupContainer: js.UndefOr[js.Function1[/* triggerNode */ HTMLElement, HTMLElement]] = js.native
    
    var href: js.UndefOr[String] = js.native
    
    var htmlType: js.UndefOr[ButtonHTMLType] = js.native
    
    var icon: js.UndefOr[ReactElement] = js.native
    
    var mouseEnterDelay: js.UndefOr[Double] = js.native
    
    var mouseLeaveDelay: js.UndefOr[Double] = js.native
    
    var onClick: js.UndefOr[MouseEventHandler[HTMLButtonElement]] = js.native
    
    var onVisibleChange: js.UndefOr[js.Function1[/* visible */ Boolean, Unit]] = js.native
    
    var openClassName: js.UndefOr[String] = js.native
    
    var overlay: ReactElement | OverlayFunc = js.native
    
    var overlayClassName: js.UndefOr[String] = js.native
    
    var overlayStyle: js.UndefOr[CSSProperties] = js.native
    
    var placement: js.UndefOr[Placement] = js.native
    
    var title: js.UndefOr[String] = js.native
    
    var transitionName: js.UndefOr[String] = js.native
    
    var trigger: js.UndefOr[js.Array[click | hover | contextMenu]] = js.native
    
    var `type`: js.UndefOr[DropdownButtonType] = js.native
    
    var visible: js.UndefOr[Boolean] = js.native
  }
  object DropdownButtonProps {
    
    @scala.inline
    def apply(overlay: ReactElement | OverlayFunc): DropdownButtonProps = {
      val __obj = js.Dynamic.literal(overlay = overlay.asInstanceOf[js.Any])
      __obj.asInstanceOf[DropdownButtonProps]
    }
    
    @scala.inline
    implicit class DropdownButtonPropsMutableBuilder[Self <: DropdownButtonProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAlign(value: Align): Self = StObject.set(x, "align", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAlignUndefined: Self = StObject.set(x, "align", js.undefined)
      
      @scala.inline
      def setArrow(value: Boolean): Self = StObject.set(x, "arrow", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setArrowUndefined: Self = StObject.set(x, "arrow", js.undefined)
      
      @scala.inline
      def setButtonsRender(value: /* buttons */ js.Array[ReactElement] => js.Array[ReactElement]): Self = StObject.set(x, "buttonsRender", js.Any.fromFunction1(value))
      
      @scala.inline
      def setButtonsRenderUndefined: Self = StObject.set(x, "buttonsRender", js.undefined)
      
      @scala.inline
      def setChildren(value: ReactElement): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChildrenReactElement(value: ReactElement): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      @scala.inline
      def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
      
      @scala.inline
      def setForceRender(value: Boolean): Self = StObject.set(x, "forceRender", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setForceRenderUndefined: Self = StObject.set(x, "forceRender", js.undefined)
      
      @scala.inline
      def setGetPopupContainer(value: /* triggerNode */ HTMLElement => HTMLElement): Self = StObject.set(x, "getPopupContainer", js.Any.fromFunction1(value))
      
      @scala.inline
      def setGetPopupContainerUndefined: Self = StObject.set(x, "getPopupContainer", js.undefined)
      
      @scala.inline
      def setHref(value: String): Self = StObject.set(x, "href", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHrefUndefined: Self = StObject.set(x, "href", js.undefined)
      
      @scala.inline
      def setHtmlType(value: ButtonHTMLType): Self = StObject.set(x, "htmlType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHtmlTypeUndefined: Self = StObject.set(x, "htmlType", js.undefined)
      
      @scala.inline
      def setIcon(value: ReactElement): Self = StObject.set(x, "icon", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIconReactElement(value: ReactElement): Self = StObject.set(x, "icon", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIconUndefined: Self = StObject.set(x, "icon", js.undefined)
      
      @scala.inline
      def setMouseEnterDelay(value: Double): Self = StObject.set(x, "mouseEnterDelay", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMouseEnterDelayUndefined: Self = StObject.set(x, "mouseEnterDelay", js.undefined)
      
      @scala.inline
      def setMouseLeaveDelay(value: Double): Self = StObject.set(x, "mouseLeaveDelay", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMouseLeaveDelayUndefined: Self = StObject.set(x, "mouseLeaveDelay", js.undefined)
      
      @scala.inline
      def setOnClick(value: SyntheticMouseEvent[HTMLButtonElement] => Unit): Self = StObject.set(x, "onClick", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnClickUndefined: Self = StObject.set(x, "onClick", js.undefined)
      
      @scala.inline
      def setOnVisibleChange(value: /* visible */ Boolean => Unit): Self = StObject.set(x, "onVisibleChange", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnVisibleChangeUndefined: Self = StObject.set(x, "onVisibleChange", js.undefined)
      
      @scala.inline
      def setOpenClassName(value: String): Self = StObject.set(x, "openClassName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOpenClassNameUndefined: Self = StObject.set(x, "openClassName", js.undefined)
      
      @scala.inline
      def setOverlay(value: ReactElement | OverlayFunc): Self = StObject.set(x, "overlay", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOverlayClassName(value: String): Self = StObject.set(x, "overlayClassName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOverlayClassNameUndefined: Self = StObject.set(x, "overlayClassName", js.undefined)
      
      @scala.inline
      def setOverlayFunction0(value: () => ReactElement): Self = StObject.set(x, "overlay", js.Any.fromFunction0(value))
      
      @scala.inline
      def setOverlayReactElement(value: ReactElement): Self = StObject.set(x, "overlay", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOverlayStyle(value: CSSProperties): Self = StObject.set(x, "overlayStyle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOverlayStyleUndefined: Self = StObject.set(x, "overlayStyle", js.undefined)
      
      @scala.inline
      def setPlacement(value: Placement): Self = StObject.set(x, "placement", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPlacementUndefined: Self = StObject.set(x, "placement", js.undefined)
      
      @scala.inline
      def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
      
      @scala.inline
      def setTransitionName(value: String): Self = StObject.set(x, "transitionName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTransitionNameUndefined: Self = StObject.set(x, "transitionName", js.undefined)
      
      @scala.inline
      def setTrigger(value: js.Array[click | hover | contextMenu]): Self = StObject.set(x, "trigger", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTriggerUndefined: Self = StObject.set(x, "trigger", js.undefined)
      
      @scala.inline
      def setTriggerVarargs(value: (click | hover | contextMenu)*): Self = StObject.set(x, "trigger", js.Array(value :_*))
      
      @scala.inline
      def setType(value: DropdownButtonType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
      
      @scala.inline
      def setVisible(value: Boolean): Self = StObject.set(x, "visible", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVisibleUndefined: Self = StObject.set(x, "visible", js.undefined)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.antd.antdStrings.primary
    - typingsSlinky.antd.antdStrings.ghost
    - typingsSlinky.antd.antdStrings.dashed
  */
  trait DropdownButtonType extends StObject
  object DropdownButtonType {
    
    @scala.inline
    def dashed: typingsSlinky.antd.antdStrings.dashed = "dashed".asInstanceOf[typingsSlinky.antd.antdStrings.dashed]
    
    @scala.inline
    def ghost: typingsSlinky.antd.antdStrings.ghost = "ghost".asInstanceOf[typingsSlinky.antd.antdStrings.ghost]
    
    @scala.inline
    def primary: typingsSlinky.antd.antdStrings.primary = "primary".asInstanceOf[typingsSlinky.antd.antdStrings.primary]
  }
  
  type _To = DropdownButtonInterface
  
  /* This means you don't have to write `default`, but can instead just say `dropdownButtonMod.foo` */
  override def _to: DropdownButtonInterface = default
}
