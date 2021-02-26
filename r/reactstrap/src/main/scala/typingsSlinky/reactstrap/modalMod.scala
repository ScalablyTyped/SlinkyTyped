package typingsSlinky.reactstrap

import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.raw.HTMLElement
import slinky.core.ReactComponentClass
import slinky.core.facade.ReactElement
import slinky.core.facade.ReactRef
import slinky.web.SyntheticKeyboardEvent
import slinky.web.SyntheticMouseEvent
import typingsSlinky.react.mod.Component
import typingsSlinky.react.mod.HTMLAttributes
import typingsSlinky.react.mod.KeyboardEventHandler
import typingsSlinky.react.mod.MouseEventHandler
import typingsSlinky.react.mod.Ref
import typingsSlinky.reactstrap.fadeMod.FadeProps
import typingsSlinky.reactstrap.mod.CSSModule
import typingsSlinky.reactstrap.reactstrapStrings.static
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object modalMod {
  
  @JSImport("reactstrap/lib/Modal", JSImport.Default)
  @js.native
  class default ()
    extends Component[ModalProps, js.Object, js.Any]
  
  type Modal = ReactComponentClass[ModalProps]
  
  @js.native
  trait ModalProps
    extends HTMLAttributes[HTMLElement]
       with /* key */ StringDictionary[js.Any] {
    
    var autoFocus: js.UndefOr[Boolean] = js.native
    
    var backdrop: js.UndefOr[Boolean | static] = js.native
    
    var backdropClassName: js.UndefOr[String] = js.native
    
    var backdropTransition: js.UndefOr[FadeProps] = js.native
    
    var centered: js.UndefOr[Boolean] = js.native
    
    var container: js.UndefOr[String | HTMLElement | ReactRef[HTMLElement]] = js.native
    
    var contentClassName: js.UndefOr[String] = js.native
    
    var cssModule: js.UndefOr[CSSModule] = js.native
    
    var external: js.UndefOr[ReactElement] = js.native
    
    var fade: js.UndefOr[Boolean] = js.native
    
    var innerRef: js.UndefOr[Ref[HTMLElement]] = js.native
    
    var isOpen: js.UndefOr[Boolean] = js.native
    
    var keyboard: js.UndefOr[Boolean] = js.native
    
    var labelledBy: js.UndefOr[String] = js.native
    
    var modalClassName: js.UndefOr[String] = js.native
    
    var modalTransition: js.UndefOr[FadeProps] = js.native
    
    var onClosed: js.UndefOr[js.Function0[Unit]] = js.native
    
    var onEnter: js.UndefOr[js.Function0[Unit]] = js.native
    
    var onExit: js.UndefOr[js.Function0[Unit]] = js.native
    
    var onOpened: js.UndefOr[js.Function0[Unit]] = js.native
    
    var returnFocusAfterClose: js.UndefOr[Boolean] = js.native
    
    var scrollable: js.UndefOr[Boolean] = js.native
    
    var size: js.UndefOr[String] = js.native
    
    var toggle: js.UndefOr[KeyboardEventHandler[_] | MouseEventHandler[_]] = js.native
    
    var unmountOnClose: js.UndefOr[Boolean] = js.native
    
    var wrapClassName: js.UndefOr[String] = js.native
    
    var zIndex: js.UndefOr[Double | String] = js.native
  }
  object ModalProps {
    
    @scala.inline
    def apply(): ModalProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ModalProps]
    }
    
    @scala.inline
    implicit class ModalPropsMutableBuilder[Self <: ModalProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAutoFocus(value: Boolean): Self = StObject.set(x, "autoFocus", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAutoFocusUndefined: Self = StObject.set(x, "autoFocus", js.undefined)
      
      @scala.inline
      def setBackdrop(value: Boolean | static): Self = StObject.set(x, "backdrop", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBackdropClassName(value: String): Self = StObject.set(x, "backdropClassName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBackdropClassNameUndefined: Self = StObject.set(x, "backdropClassName", js.undefined)
      
      @scala.inline
      def setBackdropTransition(value: FadeProps): Self = StObject.set(x, "backdropTransition", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBackdropTransitionUndefined: Self = StObject.set(x, "backdropTransition", js.undefined)
      
      @scala.inline
      def setBackdropUndefined: Self = StObject.set(x, "backdrop", js.undefined)
      
      @scala.inline
      def setCentered(value: Boolean): Self = StObject.set(x, "centered", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCenteredUndefined: Self = StObject.set(x, "centered", js.undefined)
      
      @scala.inline
      def setContainer(value: String | HTMLElement | ReactRef[HTMLElement]): Self = StObject.set(x, "container", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContainerHTMLElement(value: HTMLElement): Self = StObject.set(x, "container", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContainerRefObject(value: ReactRef[HTMLElement]): Self = StObject.set(x, "container", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContainerUndefined: Self = StObject.set(x, "container", js.undefined)
      
      @scala.inline
      def setContentClassName(value: String): Self = StObject.set(x, "contentClassName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContentClassNameUndefined: Self = StObject.set(x, "contentClassName", js.undefined)
      
      @scala.inline
      def setCssModule(value: CSSModule): Self = StObject.set(x, "cssModule", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCssModuleUndefined: Self = StObject.set(x, "cssModule", js.undefined)
      
      @scala.inline
      def setExternal(value: ReactElement): Self = StObject.set(x, "external", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExternalReactElement(value: ReactElement): Self = StObject.set(x, "external", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExternalUndefined: Self = StObject.set(x, "external", js.undefined)
      
      @scala.inline
      def setFade(value: Boolean): Self = StObject.set(x, "fade", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFadeUndefined: Self = StObject.set(x, "fade", js.undefined)
      
      @scala.inline
      def setInnerRef(value: Ref[HTMLElement]): Self = StObject.set(x, "innerRef", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInnerRefFunction1(value: /* instance */ HTMLElement | Null => Unit): Self = StObject.set(x, "innerRef", js.Any.fromFunction1(value))
      
      @scala.inline
      def setInnerRefNull: Self = StObject.set(x, "innerRef", null)
      
      @scala.inline
      def setInnerRefRefObject(value: ReactRef[HTMLElement]): Self = StObject.set(x, "innerRef", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInnerRefUndefined: Self = StObject.set(x, "innerRef", js.undefined)
      
      @scala.inline
      def setIsOpen(value: Boolean): Self = StObject.set(x, "isOpen", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsOpenUndefined: Self = StObject.set(x, "isOpen", js.undefined)
      
      @scala.inline
      def setKeyboard(value: Boolean): Self = StObject.set(x, "keyboard", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKeyboardUndefined: Self = StObject.set(x, "keyboard", js.undefined)
      
      @scala.inline
      def setLabelledBy(value: String): Self = StObject.set(x, "labelledBy", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLabelledByUndefined: Self = StObject.set(x, "labelledBy", js.undefined)
      
      @scala.inline
      def setModalClassName(value: String): Self = StObject.set(x, "modalClassName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setModalClassNameUndefined: Self = StObject.set(x, "modalClassName", js.undefined)
      
      @scala.inline
      def setModalTransition(value: FadeProps): Self = StObject.set(x, "modalTransition", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setModalTransitionUndefined: Self = StObject.set(x, "modalTransition", js.undefined)
      
      @scala.inline
      def setOnClosed(value: () => Unit): Self = StObject.set(x, "onClosed", js.Any.fromFunction0(value))
      
      @scala.inline
      def setOnClosedUndefined: Self = StObject.set(x, "onClosed", js.undefined)
      
      @scala.inline
      def setOnEnter(value: () => Unit): Self = StObject.set(x, "onEnter", js.Any.fromFunction0(value))
      
      @scala.inline
      def setOnEnterUndefined: Self = StObject.set(x, "onEnter", js.undefined)
      
      @scala.inline
      def setOnExit(value: () => Unit): Self = StObject.set(x, "onExit", js.Any.fromFunction0(value))
      
      @scala.inline
      def setOnExitUndefined: Self = StObject.set(x, "onExit", js.undefined)
      
      @scala.inline
      def setOnOpened(value: () => Unit): Self = StObject.set(x, "onOpened", js.Any.fromFunction0(value))
      
      @scala.inline
      def setOnOpenedUndefined: Self = StObject.set(x, "onOpened", js.undefined)
      
      @scala.inline
      def setReturnFocusAfterClose(value: Boolean): Self = StObject.set(x, "returnFocusAfterClose", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setReturnFocusAfterCloseUndefined: Self = StObject.set(x, "returnFocusAfterClose", js.undefined)
      
      @scala.inline
      def setScrollable(value: Boolean): Self = StObject.set(x, "scrollable", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setScrollableUndefined: Self = StObject.set(x, "scrollable", js.undefined)
      
      @scala.inline
      def setSize(value: String): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
      
      @scala.inline
      def setToggle(value: SyntheticKeyboardEvent[_] | SyntheticMouseEvent[_] => Unit): Self = StObject.set(x, "toggle", js.Any.fromFunction1(value))
      
      @scala.inline
      def setToggleUndefined: Self = StObject.set(x, "toggle", js.undefined)
      
      @scala.inline
      def setUnmountOnClose(value: Boolean): Self = StObject.set(x, "unmountOnClose", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUnmountOnCloseUndefined: Self = StObject.set(x, "unmountOnClose", js.undefined)
      
      @scala.inline
      def setWrapClassName(value: String): Self = StObject.set(x, "wrapClassName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWrapClassNameUndefined: Self = StObject.set(x, "wrapClassName", js.undefined)
      
      @scala.inline
      def setZIndex(value: Double | String): Self = StObject.set(x, "zIndex", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setZIndexUndefined: Self = StObject.set(x, "zIndex", js.undefined)
    }
  }
}
