package typingsSlinky.materialUiCore

import org.scalablytyped.runtime.Shortcut
import org.scalajs.dom.raw.Element
import org.scalajs.dom.raw.HTMLDivElement
import org.scalajs.dom.raw.HTMLElement
import slinky.core.ReactComponentClass
import slinky.core.facade.ReactElement
import typingsSlinky.materialUiCore.anon.Placement
import typingsSlinky.popperJs.mod.ReferenceObject
import typingsSlinky.react.mod.HTMLAttributes
import typingsSlinky.react.mod.ReactInstance
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object popperPopperMod extends Shortcut {
  
  @JSImport("@material-ui/core/Popper/Popper", JSImport.Default)
  @js.native
  val default: ReactComponentClass[PopperProps] = js.native
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.materialUiCore.materialUiCoreStrings.`bottom-end`
    - typingsSlinky.materialUiCore.materialUiCoreStrings.`bottom-start`
    - typingsSlinky.materialUiCore.materialUiCoreStrings.bottom
    - typingsSlinky.materialUiCore.materialUiCoreStrings.`left-end`
    - typingsSlinky.materialUiCore.materialUiCoreStrings.`left-start`
    - typingsSlinky.materialUiCore.materialUiCoreStrings.left
    - typingsSlinky.materialUiCore.materialUiCoreStrings.`right-end`
    - typingsSlinky.materialUiCore.materialUiCoreStrings.`right-start`
    - typingsSlinky.materialUiCore.materialUiCoreStrings.right
    - typingsSlinky.materialUiCore.materialUiCoreStrings.`top-end`
    - typingsSlinky.materialUiCore.materialUiCoreStrings.`top-start`
    - typingsSlinky.materialUiCore.materialUiCoreStrings.top
  */
  trait PopperPlacementType extends StObject
  object PopperPlacementType {
    
    @scala.inline
    def bottom: typingsSlinky.materialUiCore.materialUiCoreStrings.bottom = "bottom".asInstanceOf[typingsSlinky.materialUiCore.materialUiCoreStrings.bottom]
    
    @scala.inline
    def `bottom-end`: typingsSlinky.materialUiCore.materialUiCoreStrings.`bottom-end` = "bottom-end".asInstanceOf[typingsSlinky.materialUiCore.materialUiCoreStrings.`bottom-end`]
    
    @scala.inline
    def `bottom-start`: typingsSlinky.materialUiCore.materialUiCoreStrings.`bottom-start` = "bottom-start".asInstanceOf[typingsSlinky.materialUiCore.materialUiCoreStrings.`bottom-start`]
    
    @scala.inline
    def left: typingsSlinky.materialUiCore.materialUiCoreStrings.left = "left".asInstanceOf[typingsSlinky.materialUiCore.materialUiCoreStrings.left]
    
    @scala.inline
    def `left-end`: typingsSlinky.materialUiCore.materialUiCoreStrings.`left-end` = "left-end".asInstanceOf[typingsSlinky.materialUiCore.materialUiCoreStrings.`left-end`]
    
    @scala.inline
    def `left-start`: typingsSlinky.materialUiCore.materialUiCoreStrings.`left-start` = "left-start".asInstanceOf[typingsSlinky.materialUiCore.materialUiCoreStrings.`left-start`]
    
    @scala.inline
    def right: typingsSlinky.materialUiCore.materialUiCoreStrings.right = "right".asInstanceOf[typingsSlinky.materialUiCore.materialUiCoreStrings.right]
    
    @scala.inline
    def `right-end`: typingsSlinky.materialUiCore.materialUiCoreStrings.`right-end` = "right-end".asInstanceOf[typingsSlinky.materialUiCore.materialUiCoreStrings.`right-end`]
    
    @scala.inline
    def `right-start`: typingsSlinky.materialUiCore.materialUiCoreStrings.`right-start` = "right-start".asInstanceOf[typingsSlinky.materialUiCore.materialUiCoreStrings.`right-start`]
    
    @scala.inline
    def top: typingsSlinky.materialUiCore.materialUiCoreStrings.top = "top".asInstanceOf[typingsSlinky.materialUiCore.materialUiCoreStrings.top]
    
    @scala.inline
    def `top-end`: typingsSlinky.materialUiCore.materialUiCoreStrings.`top-end` = "top-end".asInstanceOf[typingsSlinky.materialUiCore.materialUiCoreStrings.`top-end`]
    
    @scala.inline
    def `top-start`: typingsSlinky.materialUiCore.materialUiCoreStrings.`top-start` = "top-start".asInstanceOf[typingsSlinky.materialUiCore.materialUiCoreStrings.`top-start`]
  }
  
  @js.native
  trait PopperProps extends HTMLAttributes[HTMLDivElement] {
    
    var anchorEl: js.UndefOr[
        Null | HTMLElement | ReferenceObject | (js.Function1[/* element */ HTMLElement, HTMLElement])
      ] = js.native
    
    @JSName("children")
    var children_PopperProps: ReactElement | (js.Function1[/* props */ Placement, ReactElement]) = js.native
    
    var container: js.UndefOr[ReactInstance | js.Function0[ReactInstance] | Null] = js.native
    
    var disablePortal: js.UndefOr[Boolean] = js.native
    
    var keepMounted: js.UndefOr[Boolean] = js.native
    
    var modifiers: js.UndefOr[js.Object] = js.native
    
    var open: Boolean = js.native
    
    var placement: js.UndefOr[PopperPlacementType] = js.native
    
    var popperOptions: js.UndefOr[js.Object] = js.native
    
    var transition: js.UndefOr[Boolean] = js.native
  }
  object PopperProps {
    
    @scala.inline
    def apply(open: Boolean): PopperProps = {
      val __obj = js.Dynamic.literal(open = open.asInstanceOf[js.Any])
      __obj.asInstanceOf[PopperProps]
    }
    
    @scala.inline
    implicit class PopperPropsMutableBuilder[Self <: PopperProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAnchorEl(value: HTMLElement | ReferenceObject | (js.Function1[/* element */ HTMLElement, HTMLElement])): Self = StObject.set(x, "anchorEl", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAnchorElFunction1(value: /* element */ HTMLElement => HTMLElement): Self = StObject.set(x, "anchorEl", js.Any.fromFunction1(value))
      
      @scala.inline
      def setAnchorElHTMLElement(value: HTMLElement): Self = StObject.set(x, "anchorEl", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAnchorElNull: Self = StObject.set(x, "anchorEl", null)
      
      @scala.inline
      def setAnchorElUndefined: Self = StObject.set(x, "anchorEl", js.undefined)
      
      @scala.inline
      def setChildren(value: ReactElement | (js.Function1[/* props */ Placement, ReactElement])): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChildrenFunction1(value: /* props */ Placement => ReactElement): Self = StObject.set(x, "children", js.Any.fromFunction1(value))
      
      @scala.inline
      def setChildrenReactElement(value: ReactElement): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      @scala.inline
      def setContainer(value: ReactInstance | js.Function0[ReactInstance]): Self = StObject.set(x, "container", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContainerComponent(value: ReactComponentClass[js.Any]): Self = StObject.set(x, "container", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContainerElement(value: Element): Self = StObject.set(x, "container", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContainerFunction0(value: () => ReactInstance): Self = StObject.set(x, "container", js.Any.fromFunction0(value))
      
      @scala.inline
      def setContainerNull: Self = StObject.set(x, "container", null)
      
      @scala.inline
      def setContainerUndefined: Self = StObject.set(x, "container", js.undefined)
      
      @scala.inline
      def setDisablePortal(value: Boolean): Self = StObject.set(x, "disablePortal", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisablePortalUndefined: Self = StObject.set(x, "disablePortal", js.undefined)
      
      @scala.inline
      def setKeepMounted(value: Boolean): Self = StObject.set(x, "keepMounted", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKeepMountedUndefined: Self = StObject.set(x, "keepMounted", js.undefined)
      
      @scala.inline
      def setModifiers(value: js.Object): Self = StObject.set(x, "modifiers", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setModifiersUndefined: Self = StObject.set(x, "modifiers", js.undefined)
      
      @scala.inline
      def setOpen(value: Boolean): Self = StObject.set(x, "open", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPlacement(value: PopperPlacementType): Self = StObject.set(x, "placement", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPlacementUndefined: Self = StObject.set(x, "placement", js.undefined)
      
      @scala.inline
      def setPopperOptions(value: js.Object): Self = StObject.set(x, "popperOptions", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPopperOptionsUndefined: Self = StObject.set(x, "popperOptions", js.undefined)
      
      @scala.inline
      def setTransition(value: Boolean): Self = StObject.set(x, "transition", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTransitionUndefined: Self = StObject.set(x, "transition", js.undefined)
    }
  }
  
  type _To = ReactComponentClass[PopperProps]
  
  /* This means you don't have to write `default`, but can instead just say `popperPopperMod.foo` */
  override def _to: ReactComponentClass[PopperProps] = default
}
