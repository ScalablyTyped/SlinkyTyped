package typingsSlinky.reactOverlays

import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.raw.Element
import org.scalajs.dom.raw.Event
import org.scalajs.dom.raw.HTMLElement
import org.scalajs.dom.raw.KeyboardEvent
import slinky.core.ReactComponentClass
import slinky.core.SyntheticEvent
import slinky.core.facade.ReactElement
import slinky.core.facade.ReactRef
import typingsSlinky.react.mod.CSSProperties
import typingsSlinky.react.mod.RefAttributes
import typingsSlinky.react.mod.RefCallback
import typingsSlinky.reactOverlays.anon.HandleContainerOverflow
import typingsSlinky.reactOverlays.anon.PartialModalPropsRefAttriAutoFocus
import typingsSlinky.reactOverlays.anon.PreventScroll
import typingsSlinky.reactOverlays.anon.WeakValidationMapModalProAutoFocus
import typingsSlinky.reactOverlays.anon.inbooleanappearbooleanund
import typingsSlinky.reactOverlays.esmModalManagerMod.default
import typingsSlinky.reactOverlays.esmTypesMod.TransitionCallbacks
import typingsSlinky.reactOverlays.esmUseWaitForDOMRefMod.DOMContainer
import typingsSlinky.reactOverlays.reactOverlaysBooleans.`false`
import typingsSlinky.reactOverlays.reactOverlaysBooleans.`true`
import typingsSlinky.reactOverlays.reactOverlaysStrings.static
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esmModalMod {
  
  /* Inlined react.react.ForwardRefExoticComponent<react-overlays.react-overlays/esm/Modal.ModalProps & react.react.RefAttributes<react-overlays.react-overlays/esm/Modal.ModalHandle>> & {  Manager :new (hasHideSiblingNodesHandleContainerOverflow : {  hideSiblingNodes :boolean | undefined,   handleContainerOverflow :boolean | undefined} | undefined): react-overlays.react-overlays/esm/ModalManager.default} */
  object default {
    
    /**
      * **NOTE**: Exotic components are not callable.
      */
    @JSImport("react-overlays/esm/Modal", JSImport.Default)
    @js.native
    def apply(props: ModalProps with RefAttributes[ModalHandle]): ReactElement | Null = js.native
    @JSImport("react-overlays/esm/Modal", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("react-overlays/esm/Modal", "default.Manager")
    @js.native
    class Manager ()
      extends typingsSlinky.reactOverlays.esmModalManagerMod.default {
      def this(hasHideSiblingNodesHandleContainerOverflow: HandleContainerOverflow) = this()
    }
    @JSImport("react-overlays/esm/Modal", "default.Manager")
    @js.native
    def Manager: Instantiable1[
        /* hasHideSiblingNodesHandleContainerOverflow */ js.UndefOr[HandleContainerOverflow], 
        typingsSlinky.reactOverlays.esmModalManagerMod.default
      ] = js.native
    @scala.inline
    def Manager_=(
      x: Instantiable1[
          /* hasHideSiblingNodesHandleContainerOverflow */ js.UndefOr[HandleContainerOverflow], 
          typingsSlinky.reactOverlays.esmModalManagerMod.default
        ]
    ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Manager")(x.asInstanceOf[js.Any])
    
    @JSImport("react-overlays/esm/Modal", "default.defaultProps")
    @js.native
    def defaultProps: js.UndefOr[PartialModalPropsRefAttriAutoFocus] = js.native
    @scala.inline
    def defaultProps_=(x: js.UndefOr[PartialModalPropsRefAttriAutoFocus]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
    
    @JSImport("react-overlays/esm/Modal", "default.displayName")
    @js.native
    def displayName: js.UndefOr[String] = js.native
    @scala.inline
    def displayName_=(x: js.UndefOr[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("displayName")(x.asInstanceOf[js.Any])
    
    @JSImport("react-overlays/esm/Modal", "default.propTypes")
    @js.native
    def propTypes: js.UndefOr[WeakValidationMapModalProAutoFocus] = js.native
    @scala.inline
    def propTypes_=(x: js.UndefOr[WeakValidationMapModalProAutoFocus]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("propTypes")(x.asInstanceOf[js.Any])
    
    @JSImport("react-overlays/esm/Modal", "default.$$typeof")
    @js.native
    val typeof: js.Symbol = js.native
  }
  
  @js.native
  trait ModalHandle extends StObject {
    
    var backdrop: HTMLElement | Null = js.native
    
    var dialog: HTMLElement | Null = js.native
  }
  object ModalHandle {
    
    @scala.inline
    def apply(): ModalHandle = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ModalHandle]
    }
    
    @scala.inline
    implicit class ModalHandleMutableBuilder[Self <: ModalHandle] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBackdrop(value: HTMLElement): Self = StObject.set(x, "backdrop", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBackdropNull: Self = StObject.set(x, "backdrop", null)
      
      @scala.inline
      def setDialog(value: HTMLElement): Self = StObject.set(x, "dialog", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDialogNull: Self = StObject.set(x, "dialog", null)
    }
  }
  
  @js.native
  trait ModalProps
    extends TransitionCallbacks
       with /* other */ StringDictionary[js.Any] {
    
    var autoFocus: js.UndefOr[Boolean] = js.native
    
    var backdrop: js.UndefOr[`true` | `false` | static] = js.native
    
    var backdropTransition: js.UndefOr[ModalTransitionComponent] = js.native
    
    var children: js.UndefOr[ReactElement] = js.native
    
    var className: js.UndefOr[String] = js.native
    
    var container: js.UndefOr[DOMContainer[HTMLElement]] = js.native
    
    var containerClassName: js.UndefOr[String] = js.native
    
    var enforceFocus: js.UndefOr[Boolean] = js.native
    
    var keyboard: js.UndefOr[Boolean] = js.native
    
    var manager: js.UndefOr[default] = js.native
    
    var onBackdropClick: js.UndefOr[js.Function1[/* e */ SyntheticEvent[Event, Element], Unit]] = js.native
    
    var onEscapeKeyDown: js.UndefOr[js.Function1[/* e */ KeyboardEvent, Unit]] = js.native
    
    var onHide: js.UndefOr[js.Function0[Unit]] = js.native
    
    var onShow: js.UndefOr[js.Function0[Unit]] = js.native
    
    var renderBackdrop: js.UndefOr[js.Function1[/* props */ RenderModalBackdropProps, ReactElement]] = js.native
    
    var renderDialog: js.UndefOr[js.Function1[/* props */ RenderModalDialogProps, ReactElement]] = js.native
    
    var restoreFocus: js.UndefOr[Boolean] = js.native
    
    var restoreFocusOptions: js.UndefOr[PreventScroll] = js.native
    
    var role: js.UndefOr[String] = js.native
    
    var show: js.UndefOr[Boolean] = js.native
    
    var style: js.UndefOr[CSSProperties] = js.native
    
    var transition: js.UndefOr[ModalTransitionComponent] = js.native
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
      def setBackdrop(value: `true` | `false` | static): Self = StObject.set(x, "backdrop", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBackdropTransition(value: ModalTransitionComponent): Self = StObject.set(x, "backdropTransition", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBackdropTransitionComponentClass(value: ReactComponentClass[inbooleanappearbooleanund]): Self = StObject.set(x, "backdropTransition", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBackdropTransitionFunctionComponent(value: ReactComponentClass[inbooleanappearbooleanund]): Self = StObject.set(x, "backdropTransition", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBackdropTransitionUndefined: Self = StObject.set(x, "backdropTransition", js.undefined)
      
      @scala.inline
      def setBackdropUndefined: Self = StObject.set(x, "backdrop", js.undefined)
      
      @scala.inline
      def setChildren(value: ReactElement): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      @scala.inline
      def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      @scala.inline
      def setContainer(value: DOMContainer[HTMLElement]): Self = StObject.set(x, "container", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContainerClassName(value: String): Self = StObject.set(x, "containerClassName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContainerClassNameUndefined: Self = StObject.set(x, "containerClassName", js.undefined)
      
      @scala.inline
      def setContainerFunction0(value: () => HTMLElement | ReactRef[HTMLElement] | Null): Self = StObject.set(x, "container", js.Any.fromFunction0(value))
      
      @scala.inline
      def setContainerHTMLElement(value: HTMLElement): Self = StObject.set(x, "container", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContainerNull: Self = StObject.set(x, "container", null)
      
      @scala.inline
      def setContainerRefObject(value: ReactRef[HTMLElement]): Self = StObject.set(x, "container", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContainerUndefined: Self = StObject.set(x, "container", js.undefined)
      
      @scala.inline
      def setEnforceFocus(value: Boolean): Self = StObject.set(x, "enforceFocus", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEnforceFocusUndefined: Self = StObject.set(x, "enforceFocus", js.undefined)
      
      @scala.inline
      def setKeyboard(value: Boolean): Self = StObject.set(x, "keyboard", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKeyboardUndefined: Self = StObject.set(x, "keyboard", js.undefined)
      
      @scala.inline
      def setManager(value: default): Self = StObject.set(x, "manager", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setManagerUndefined: Self = StObject.set(x, "manager", js.undefined)
      
      @scala.inline
      def setOnBackdropClick(value: /* e */ SyntheticEvent[Event, Element] => Unit): Self = StObject.set(x, "onBackdropClick", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnBackdropClickUndefined: Self = StObject.set(x, "onBackdropClick", js.undefined)
      
      @scala.inline
      def setOnEscapeKeyDown(value: /* e */ KeyboardEvent => Unit): Self = StObject.set(x, "onEscapeKeyDown", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnEscapeKeyDownUndefined: Self = StObject.set(x, "onEscapeKeyDown", js.undefined)
      
      @scala.inline
      def setOnHide(value: () => Unit): Self = StObject.set(x, "onHide", js.Any.fromFunction0(value))
      
      @scala.inline
      def setOnHideUndefined: Self = StObject.set(x, "onHide", js.undefined)
      
      @scala.inline
      def setOnShow(value: () => Unit): Self = StObject.set(x, "onShow", js.Any.fromFunction0(value))
      
      @scala.inline
      def setOnShowUndefined: Self = StObject.set(x, "onShow", js.undefined)
      
      @scala.inline
      def setRenderBackdrop(value: /* props */ RenderModalBackdropProps => ReactElement): Self = StObject.set(x, "renderBackdrop", js.Any.fromFunction1(value))
      
      @scala.inline
      def setRenderBackdropUndefined: Self = StObject.set(x, "renderBackdrop", js.undefined)
      
      @scala.inline
      def setRenderDialog(value: /* props */ RenderModalDialogProps => ReactElement): Self = StObject.set(x, "renderDialog", js.Any.fromFunction1(value))
      
      @scala.inline
      def setRenderDialogUndefined: Self = StObject.set(x, "renderDialog", js.undefined)
      
      @scala.inline
      def setRestoreFocus(value: Boolean): Self = StObject.set(x, "restoreFocus", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRestoreFocusOptions(value: PreventScroll): Self = StObject.set(x, "restoreFocusOptions", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRestoreFocusOptionsUndefined: Self = StObject.set(x, "restoreFocusOptions", js.undefined)
      
      @scala.inline
      def setRestoreFocusUndefined: Self = StObject.set(x, "restoreFocus", js.undefined)
      
      @scala.inline
      def setRole(value: String): Self = StObject.set(x, "role", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRoleUndefined: Self = StObject.set(x, "role", js.undefined)
      
      @scala.inline
      def setShow(value: Boolean): Self = StObject.set(x, "show", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShowUndefined: Self = StObject.set(x, "show", js.undefined)
      
      @scala.inline
      def setStyle(value: CSSProperties): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
      
      @scala.inline
      def setTransition(value: ModalTransitionComponent): Self = StObject.set(x, "transition", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTransitionComponentClass(value: ReactComponentClass[inbooleanappearbooleanund]): Self = StObject.set(x, "transition", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTransitionFunctionComponent(value: ReactComponentClass[inbooleanappearbooleanund]): Self = StObject.set(x, "transition", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTransitionUndefined: Self = StObject.set(x, "transition", js.undefined)
    }
  }
  
  type ModalTransitionComponent = ReactComponentClass[inbooleanappearbooleanund]
  
  @js.native
  trait RenderModalBackdropProps extends StObject {
    
    def onClick(event: SyntheticEvent[Event, Element]): Unit = js.native
    
    var ref: RefCallback[Element] = js.native
  }
  object RenderModalBackdropProps {
    
    @scala.inline
    def apply(onClick: SyntheticEvent[Event, Element] => Unit, ref: /* instance */ Element | Null => Unit): RenderModalBackdropProps = {
      val __obj = js.Dynamic.literal(onClick = js.Any.fromFunction1(onClick), ref = js.Any.fromFunction1(ref))
      __obj.asInstanceOf[RenderModalBackdropProps]
    }
    
    @scala.inline
    implicit class RenderModalBackdropPropsMutableBuilder[Self <: RenderModalBackdropProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setOnClick(value: SyntheticEvent[Event, Element] => Unit): Self = StObject.set(x, "onClick", js.Any.fromFunction1(value))
      
      @scala.inline
      def setRef(value: /* instance */ Element | Null => Unit): Self = StObject.set(x, "ref", js.Any.fromFunction1(value))
    }
  }
  
  @js.native
  trait RenderModalDialogProps extends StObject {
    
    var `aria-modal`: js.UndefOr[Boolean] = js.native
    
    var className: js.UndefOr[String] = js.native
    
    var ref: RefCallback[Element] = js.native
    
    var role: String = js.native
    
    var style: js.UndefOr[CSSProperties] = js.native
    
    var tabIndex: Double = js.native
  }
  object RenderModalDialogProps {
    
    @scala.inline
    def apply(ref: /* instance */ Element | Null => Unit, role: String, tabIndex: Double): RenderModalDialogProps = {
      val __obj = js.Dynamic.literal(ref = js.Any.fromFunction1(ref), role = role.asInstanceOf[js.Any], tabIndex = tabIndex.asInstanceOf[js.Any])
      __obj.asInstanceOf[RenderModalDialogProps]
    }
    
    @scala.inline
    implicit class RenderModalDialogPropsMutableBuilder[Self <: RenderModalDialogProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def `setAria-modal`(value: Boolean): Self = StObject.set(x, "aria-modal", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setAria-modalUndefined`: Self = StObject.set(x, "aria-modal", js.undefined)
      
      @scala.inline
      def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      @scala.inline
      def setRef(value: /* instance */ Element | Null => Unit): Self = StObject.set(x, "ref", js.Any.fromFunction1(value))
      
      @scala.inline
      def setRole(value: String): Self = StObject.set(x, "role", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStyle(value: CSSProperties): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
      
      @scala.inline
      def setTabIndex(value: Double): Self = StObject.set(x, "tabIndex", value.asInstanceOf[js.Any])
    }
  }
}
