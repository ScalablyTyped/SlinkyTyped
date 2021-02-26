package typingsSlinky.reactMdUtils

import org.scalajs.dom.raw.HTMLDivElement
import org.scalajs.dom.raw.HTMLElement
import slinky.core.ReactComponentClass
import slinky.core.facade.ReactElement
import typingsSlinky.react.mod.ForwardRefExoticComponent
import typingsSlinky.react.mod.HTMLAttributes
import typingsSlinky.react.mod.RefAttributes
import typingsSlinky.reactMdUtils.reactMdUtilsStrings.first
import typingsSlinky.reactMdUtils.reactMdUtilsStrings.last
import typingsSlinky.reactMdUtils.usePreviousFocusMod.FocusFallback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object focusContainerMod {
  
  @JSImport("@react-md/utils/types/wia-aria/FocusContainer", "FocusContainer")
  @js.native
  val FocusContainer: ForwardRefExoticComponent[FocusContainerProps with RefAttributes[HTMLDivElement]] = js.native
  
  @js.native
  trait FocusContainerOptionsProps extends StObject {
    
    /**
      * This is the element that should be focused by default when the component is
      * mounted.  This can either be the first or last focusable item or a query
      * selector string that is run against this component to focus.
      */
    var defaultFocus: js.UndefOr[first | last | String] = js.native
    
    /**
      * By default, the focus container will try to maintain a cache of the
      * focusable elements that is updated only when this component re-renders. If
      * the children are extremely dynamic and focusable elements can be
      * removed/added without this component updating, you should disable the cache
      * so that the focusable elements are updated each time the tab key is
      * pressed. Disabling the cache will be slightly slower for larger focusable
      * areas, but it might not be too bad.
      *
      * NOTE: The only important elements are the *first* and *last* elements in
      * this list.  So if your children aren't changing the first and last
      * elements, there's no need to disable the cache.
      */
    var disableFocusCache: js.UndefOr[Boolean] = js.native
    
    /**
      * The default behavior for the focus container is to focus an element once it
      * is mounted and the `disabled` prop is not enabled. This behavior can be
      * disabled if this is not wanted for some reason.
      */
    var disableFocusOnMount: js.UndefOr[Boolean] = js.native
    
    /**
      * Boolean if the element that gets focused on mount should try to not scroll
      * the focused element into view which is the default behavior. This should
      * normally remain `false`, but it is useful to set to `true` if the
      * `FocusContainer` is within a transition that appears offscreen.
      */
    var disableFocusOnMountScroll: js.UndefOr[Boolean] = js.native
    
    /**
      * The default behavior for the focus container is to attempt to focus the
      * element that was focused before the focus container was mounted since it is
      * generally used for temporary material. If there are cases where this
      * behavior is not wanted, you can enable this prop.
      */
    var disableFocusOnUnmount: js.UndefOr[Boolean] = js.native
    
    /**
      * Boolean if the focus behavior should be disabled. This should really be
      * used if you are using nested focus containers for temporary material (such
      * as dialogs or menus).
      */
    var disableTabFocusWrap: js.UndefOr[Boolean] = js.native
    
    /**
      * When the focus container unmounts, it will attempt to re-focus the element
      * that was focused before the focus container was mounted unless the
      * `disableFocusOnUnmount` prop is enabled. There might be cases where
      * unmounting the focus container causes the page to re-render and the
      * previous element no longer exists. When this happens keyboard users _might_
      * have a problem navigating through the page again depending on how the
      * browser implemented the native tab behavior so this prop allows you to
      * ensure that a specific element is focused in these cases.
      *
      * This can either be a query selector string, a specific HTMLElement, or a
      * function that finds a specific HTMLElement to focus.
      */
    var unmountFocusFallback: js.UndefOr[FocusFallback] = js.native
  }
  object FocusContainerOptionsProps {
    
    @scala.inline
    def apply(): FocusContainerOptionsProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[FocusContainerOptionsProps]
    }
    
    @scala.inline
    implicit class FocusContainerOptionsPropsMutableBuilder[Self <: FocusContainerOptionsProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDefaultFocus(value: first | last | String): Self = StObject.set(x, "defaultFocus", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDefaultFocusUndefined: Self = StObject.set(x, "defaultFocus", js.undefined)
      
      @scala.inline
      def setDisableFocusCache(value: Boolean): Self = StObject.set(x, "disableFocusCache", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisableFocusCacheUndefined: Self = StObject.set(x, "disableFocusCache", js.undefined)
      
      @scala.inline
      def setDisableFocusOnMount(value: Boolean): Self = StObject.set(x, "disableFocusOnMount", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisableFocusOnMountScroll(value: Boolean): Self = StObject.set(x, "disableFocusOnMountScroll", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisableFocusOnMountScrollUndefined: Self = StObject.set(x, "disableFocusOnMountScroll", js.undefined)
      
      @scala.inline
      def setDisableFocusOnMountUndefined: Self = StObject.set(x, "disableFocusOnMount", js.undefined)
      
      @scala.inline
      def setDisableFocusOnUnmount(value: Boolean): Self = StObject.set(x, "disableFocusOnUnmount", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisableFocusOnUnmountUndefined: Self = StObject.set(x, "disableFocusOnUnmount", js.undefined)
      
      @scala.inline
      def setDisableTabFocusWrap(value: Boolean): Self = StObject.set(x, "disableTabFocusWrap", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisableTabFocusWrapUndefined: Self = StObject.set(x, "disableTabFocusWrap", js.undefined)
      
      @scala.inline
      def setUnmountFocusFallback(value: FocusFallback): Self = StObject.set(x, "unmountFocusFallback", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUnmountFocusFallbackFunction0(value: () => HTMLElement | Null): Self = StObject.set(x, "unmountFocusFallback", js.Any.fromFunction0(value))
      
      @scala.inline
      def setUnmountFocusFallbackHTMLElement(value: HTMLElement): Self = StObject.set(x, "unmountFocusFallback", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUnmountFocusFallbackNull: Self = StObject.set(x, "unmountFocusFallback", null)
      
      @scala.inline
      def setUnmountFocusFallbackUndefined: Self = StObject.set(x, "unmountFocusFallback", js.undefined)
    }
  }
  
  @js.native
  trait FocusContainerProps
    extends HTMLAttributes[HTMLElement]
       with FocusContainerOptionsProps {
    
    /**
      * The component to render the focus container as. This should really not be
      * used as it is more for internal usage. The only base requirements for this
      * prop is that it must either be a element string (`"div"`, `"span"`, etc) or
      * a custom component that has forwarded the ref to the DOM node.
      */
    var component: js.UndefOr[ReactElement] = js.native
  }
  object FocusContainerProps {
    
    @scala.inline
    def apply(): FocusContainerProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[FocusContainerProps]
    }
    
    @scala.inline
    implicit class FocusContainerPropsMutableBuilder[Self <: FocusContainerProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setComponent(value: ReactElement): Self = StObject.set(x, "component", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setComponentComponentClass(value: ReactComponentClass[_]): Self = StObject.set(x, "component", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setComponentFunctionComponent(value: ReactComponentClass[_]): Self = StObject.set(x, "component", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setComponentUndefined: Self = StObject.set(x, "component", js.undefined)
    }
  }
}
