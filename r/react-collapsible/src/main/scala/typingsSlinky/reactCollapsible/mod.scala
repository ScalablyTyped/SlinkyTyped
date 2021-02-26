package typingsSlinky.reactCollapsible

import slinky.core.facade.ReactElement
import typingsSlinky.react.mod.CSSProperties
import typingsSlinky.react.mod.Component
import typingsSlinky.react.mod.HTMLProps
import typingsSlinky.reactCollapsible.reactCollapsibleStrings.auto
import typingsSlinky.reactCollapsible.reactCollapsibleStrings.hidden
import typingsSlinky.reactCollapsible.reactCollapsibleStrings.inherit
import typingsSlinky.reactCollapsible.reactCollapsibleStrings.initial
import typingsSlinky.reactCollapsible.reactCollapsibleStrings.scroll
import typingsSlinky.reactCollapsible.reactCollapsibleStrings.unset
import typingsSlinky.reactCollapsible.reactCollapsibleStrings.visible
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("react-collapsible", JSImport.Default)
  @js.native
  class default ()
    extends Component[CollapsibleProps, js.Object, js.Any]
  
  @js.native
  trait Collapsible
    extends Component[CollapsibleProps, js.Object, js.Any]
  
  @js.native
  trait CollapsibleProps extends HTMLProps[Collapsible] {
    
    var accordionPosition: js.UndefOr[String | Double] = js.native
    
    var classParentString: js.UndefOr[String] = js.native
    
    var containerElementProps: js.UndefOr[js.Object] = js.native
    
    var contentContainerTagName: js.UndefOr[String] = js.native
    
    var contentHiddenWhenClosed: js.UndefOr[Boolean] = js.native
    
    var contentInnerClassName: js.UndefOr[String] = js.native
    
    var contentOuterClassName: js.UndefOr[String] = js.native
    
    var easing: js.UndefOr[String] = js.native
    
    var handleTriggerClick: js.UndefOr[js.Function1[/* accordionPosition */ js.UndefOr[String | Double], Unit]] = js.native
    
    var lazyRender: js.UndefOr[Boolean] = js.native
    
    var onClose: js.UndefOr[js.Function0[Unit]] = js.native
    
    var onClosing: js.UndefOr[js.Function0[Unit]] = js.native
    
    var onOpen: js.UndefOr[js.Function0[Unit]] = js.native
    
    var onOpening: js.UndefOr[js.Function0[Unit]] = js.native
    
    var onTriggerClosing: js.UndefOr[js.Function0[Unit]] = js.native
    
    var onTriggerOpening: js.UndefOr[js.Function0[Unit]] = js.native
    
    var openedClassName: js.UndefOr[String] = js.native
    
    var overflowWhenOpen: js.UndefOr[hidden | visible | auto | scroll | inherit | initial | unset] = js.native
    
    var transitionCloseTime: js.UndefOr[Double | Null] = js.native
    
    var transitionTime: js.UndefOr[Double] = js.native
    
    var trigger: String | ReactElement = js.native
    
    var triggerClassName: js.UndefOr[String] = js.native
    
    var triggerDisabled: js.UndefOr[Boolean] = js.native
    
    var triggerElementProps: js.UndefOr[js.Object] = js.native
    
    var triggerOpenedClassName: js.UndefOr[String] = js.native
    
    var triggerSibling: js.UndefOr[ReactElement] = js.native
    
    var triggerStyle: js.UndefOr[Null | CSSProperties] = js.native
    
    var triggerTagName: js.UndefOr[String] = js.native
    
    var triggerWhenOpen: js.UndefOr[String | ReactElement] = js.native
  }
  object CollapsibleProps {
    
    @scala.inline
    def apply(trigger: String | ReactElement): CollapsibleProps = {
      val __obj = js.Dynamic.literal(trigger = trigger.asInstanceOf[js.Any])
      __obj.asInstanceOf[CollapsibleProps]
    }
    
    @scala.inline
    implicit class CollapsiblePropsMutableBuilder[Self <: CollapsibleProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAccordionPosition(value: String | Double): Self = StObject.set(x, "accordionPosition", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAccordionPositionUndefined: Self = StObject.set(x, "accordionPosition", js.undefined)
      
      @scala.inline
      def setClassParentString(value: String): Self = StObject.set(x, "classParentString", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClassParentStringUndefined: Self = StObject.set(x, "classParentString", js.undefined)
      
      @scala.inline
      def setContainerElementProps(value: js.Object): Self = StObject.set(x, "containerElementProps", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContainerElementPropsUndefined: Self = StObject.set(x, "containerElementProps", js.undefined)
      
      @scala.inline
      def setContentContainerTagName(value: String): Self = StObject.set(x, "contentContainerTagName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContentContainerTagNameUndefined: Self = StObject.set(x, "contentContainerTagName", js.undefined)
      
      @scala.inline
      def setContentHiddenWhenClosed(value: Boolean): Self = StObject.set(x, "contentHiddenWhenClosed", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContentHiddenWhenClosedUndefined: Self = StObject.set(x, "contentHiddenWhenClosed", js.undefined)
      
      @scala.inline
      def setContentInnerClassName(value: String): Self = StObject.set(x, "contentInnerClassName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContentInnerClassNameUndefined: Self = StObject.set(x, "contentInnerClassName", js.undefined)
      
      @scala.inline
      def setContentOuterClassName(value: String): Self = StObject.set(x, "contentOuterClassName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContentOuterClassNameUndefined: Self = StObject.set(x, "contentOuterClassName", js.undefined)
      
      @scala.inline
      def setEasing(value: String): Self = StObject.set(x, "easing", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEasingUndefined: Self = StObject.set(x, "easing", js.undefined)
      
      @scala.inline
      def setHandleTriggerClick(value: /* accordionPosition */ js.UndefOr[String | Double] => Unit): Self = StObject.set(x, "handleTriggerClick", js.Any.fromFunction1(value))
      
      @scala.inline
      def setHandleTriggerClickUndefined: Self = StObject.set(x, "handleTriggerClick", js.undefined)
      
      @scala.inline
      def setLazyRender(value: Boolean): Self = StObject.set(x, "lazyRender", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLazyRenderUndefined: Self = StObject.set(x, "lazyRender", js.undefined)
      
      @scala.inline
      def setOnClose(value: () => Unit): Self = StObject.set(x, "onClose", js.Any.fromFunction0(value))
      
      @scala.inline
      def setOnCloseUndefined: Self = StObject.set(x, "onClose", js.undefined)
      
      @scala.inline
      def setOnClosing(value: () => Unit): Self = StObject.set(x, "onClosing", js.Any.fromFunction0(value))
      
      @scala.inline
      def setOnClosingUndefined: Self = StObject.set(x, "onClosing", js.undefined)
      
      @scala.inline
      def setOnOpen(value: () => Unit): Self = StObject.set(x, "onOpen", js.Any.fromFunction0(value))
      
      @scala.inline
      def setOnOpenUndefined: Self = StObject.set(x, "onOpen", js.undefined)
      
      @scala.inline
      def setOnOpening(value: () => Unit): Self = StObject.set(x, "onOpening", js.Any.fromFunction0(value))
      
      @scala.inline
      def setOnOpeningUndefined: Self = StObject.set(x, "onOpening", js.undefined)
      
      @scala.inline
      def setOnTriggerClosing(value: () => Unit): Self = StObject.set(x, "onTriggerClosing", js.Any.fromFunction0(value))
      
      @scala.inline
      def setOnTriggerClosingUndefined: Self = StObject.set(x, "onTriggerClosing", js.undefined)
      
      @scala.inline
      def setOnTriggerOpening(value: () => Unit): Self = StObject.set(x, "onTriggerOpening", js.Any.fromFunction0(value))
      
      @scala.inline
      def setOnTriggerOpeningUndefined: Self = StObject.set(x, "onTriggerOpening", js.undefined)
      
      @scala.inline
      def setOpenedClassName(value: String): Self = StObject.set(x, "openedClassName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOpenedClassNameUndefined: Self = StObject.set(x, "openedClassName", js.undefined)
      
      @scala.inline
      def setOverflowWhenOpen(value: hidden | visible | auto | scroll | inherit | initial | unset): Self = StObject.set(x, "overflowWhenOpen", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOverflowWhenOpenUndefined: Self = StObject.set(x, "overflowWhenOpen", js.undefined)
      
      @scala.inline
      def setTransitionCloseTime(value: Double): Self = StObject.set(x, "transitionCloseTime", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTransitionCloseTimeNull: Self = StObject.set(x, "transitionCloseTime", null)
      
      @scala.inline
      def setTransitionCloseTimeUndefined: Self = StObject.set(x, "transitionCloseTime", js.undefined)
      
      @scala.inline
      def setTransitionTime(value: Double): Self = StObject.set(x, "transitionTime", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTransitionTimeUndefined: Self = StObject.set(x, "transitionTime", js.undefined)
      
      @scala.inline
      def setTrigger(value: String | ReactElement): Self = StObject.set(x, "trigger", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTriggerClassName(value: String): Self = StObject.set(x, "triggerClassName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTriggerClassNameUndefined: Self = StObject.set(x, "triggerClassName", js.undefined)
      
      @scala.inline
      def setTriggerDisabled(value: Boolean): Self = StObject.set(x, "triggerDisabled", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTriggerDisabledUndefined: Self = StObject.set(x, "triggerDisabled", js.undefined)
      
      @scala.inline
      def setTriggerElementProps(value: js.Object): Self = StObject.set(x, "triggerElementProps", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTriggerElementPropsUndefined: Self = StObject.set(x, "triggerElementProps", js.undefined)
      
      @scala.inline
      def setTriggerOpenedClassName(value: String): Self = StObject.set(x, "triggerOpenedClassName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTriggerOpenedClassNameUndefined: Self = StObject.set(x, "triggerOpenedClassName", js.undefined)
      
      @scala.inline
      def setTriggerReactElement(value: ReactElement): Self = StObject.set(x, "trigger", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTriggerSibling(value: ReactElement): Self = StObject.set(x, "triggerSibling", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTriggerSiblingUndefined: Self = StObject.set(x, "triggerSibling", js.undefined)
      
      @scala.inline
      def setTriggerStyle(value: CSSProperties): Self = StObject.set(x, "triggerStyle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTriggerStyleNull: Self = StObject.set(x, "triggerStyle", null)
      
      @scala.inline
      def setTriggerStyleUndefined: Self = StObject.set(x, "triggerStyle", js.undefined)
      
      @scala.inline
      def setTriggerTagName(value: String): Self = StObject.set(x, "triggerTagName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTriggerTagNameUndefined: Self = StObject.set(x, "triggerTagName", js.undefined)
      
      @scala.inline
      def setTriggerWhenOpen(value: String | ReactElement): Self = StObject.set(x, "triggerWhenOpen", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTriggerWhenOpenReactElement(value: ReactElement): Self = StObject.set(x, "triggerWhenOpen", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTriggerWhenOpenUndefined: Self = StObject.set(x, "triggerWhenOpen", js.undefined)
    }
  }
}
