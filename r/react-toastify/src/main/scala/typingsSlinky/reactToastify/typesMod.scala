package typingsSlinky.reactToastify

import org.scalablytyped.runtime.TopLevel
import org.scalajs.dom.raw.Element
import org.scalajs.dom.raw.HTMLElement
import slinky.core.ReactComponentClass
import slinky.core.facade.ReactElement
import slinky.core.facade.ReactRef
import slinky.web.SyntheticMouseEvent
import typingsSlinky.react.mod.CSSProperties
import typingsSlinky.reactToastify.anon.DefaultClassName
import typingsSlinky.reactToastify.anon.Position
import typingsSlinky.reactToastify.reactToastifyBooleans.`false`
import typingsSlinky.reactToastify.reactToastifyStrings.dark_
import typingsSlinky.reactToastify.reactToastifyStrings.default_
import typingsSlinky.reactToastify.reactToastifyStrings.error_
import typingsSlinky.reactToastify.reactToastifyStrings.info_
import typingsSlinky.reactToastify.reactToastifyStrings.success_
import typingsSlinky.reactToastify.reactToastifyStrings.warning_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesMod {
  
  type ClassName = (js.Function1[/* context */ js.UndefOr[DefaultClassName], String]) | String
  
  @js.native
  trait ClearWaitingQueueParams extends StObject {
    
    var containerId: js.UndefOr[Id] = js.native
  }
  object ClearWaitingQueueParams {
    
    @scala.inline
    def apply(): ClearWaitingQueueParams = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ClearWaitingQueueParams]
    }
    
    @scala.inline
    implicit class ClearWaitingQueueParamsMutableBuilder[Self <: ClearWaitingQueueParams] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setContainerId(value: Id): Self = StObject.set(x, "containerId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContainerIdUndefined: Self = StObject.set(x, "containerId", js.undefined)
    }
  }
  
  @js.native
  trait CommonOptions extends StObject {
    
    /**
      * Set the delay in ms to close the toast automatically.
      * Use `false` to prevent the toast from closing.
      * `Default: 5000`
      */
    var autoClose: js.UndefOr[Double | `false`] = js.native
    
    /**
      * An optional css class to set for the toast content.
      */
    var bodyClassName: js.UndefOr[ToastClassName] = js.native
    
    /**
      * An optional inline style to apply for the toast content.
      */
    var bodyStyle: js.UndefOr[CSSProperties] = js.native
    
    /**
      * Pass a custom close button.
      * To remove the close button pass `false`
      */
    var closeButton: js.UndefOr[ReactElement | (js.Function1[/* props */ js.Any, ReactElement]) | Boolean] = js.native
    
    /**
      * Remove the toast when clicked.
      * `Default: true`
      */
    var closeOnClick: js.UndefOr[Boolean] = js.native
    
    /**
      * Set id to handle multiple container
      */
    var containerId: js.UndefOr[Id] = js.native
    
    /**
      * Allow toast to be draggable
      * `Default: true`
      */
    var draggable: js.UndefOr[Boolean] = js.native
    
    /**
      * The percentage of the toast's width it takes for a drag to dismiss a toast
      * `Default: 80`
      */
    var draggablePercent: js.UndefOr[Double] = js.native
    
    /**
      * Hide or show the progress bar.
      * `Default: false`
      */
    var hideProgressBar: js.UndefOr[Boolean] = js.native
    
    /**
      * Fired when clicking inside toaster
      */
    var onClick: js.UndefOr[js.Function1[/* event */ SyntheticMouseEvent[Element], Unit]] = js.native
    
    /**
      * Pause the toast when the window loose focus.
      * `Default: true`
      */
    var pauseOnFocusLoss: js.UndefOr[Boolean] = js.native
    
    /**
      * Pause the timer when the mouse hover the toast.
      * `Default: true`
      */
    var pauseOnHover: js.UndefOr[Boolean] = js.native
    
    /**
      * Set the default position to use.
      * `One of: 'top-right', 'top-center', 'top-left', 'bottom-right', 'bottom-center', 'bottom-left'`
      * `Default: 'top-right'`
      */
    var position: js.UndefOr[ToastPosition] = js.native
    
    /**
      * An optional css class to set for the progress bar.
      */
    var progressClassName: js.UndefOr[ToastClassName] = js.native
    
    /**
      * An optional style to set for the progress bar.
      */
    var progressStyle: js.UndefOr[CSSProperties] = js.native
    
    /**
      * Define the ARIA role for the toast
      * `Default: alert`
      *  https://www.w3.org/WAI/PF/aria/roles
      */
    var role: js.UndefOr[String] = js.native
    
    /**
      * Support right to left display.
      * `Default: false`
      */
    var rtl: js.UndefOr[Boolean] = js.native
    
    /**
      * Pass a custom transition built with react-transition-group.
      */
    var transition: js.UndefOr[ToastTransition] = js.native
  }
  object CommonOptions {
    
    @scala.inline
    def apply(): CommonOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CommonOptions]
    }
    
    @scala.inline
    implicit class CommonOptionsMutableBuilder[Self <: CommonOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAutoClose(value: Double | `false`): Self = StObject.set(x, "autoClose", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAutoCloseUndefined: Self = StObject.set(x, "autoClose", js.undefined)
      
      @scala.inline
      def setBodyClassName(value: ToastClassName): Self = StObject.set(x, "bodyClassName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBodyClassNameFunction1(value: /* context */ js.UndefOr[Position] => String): Self = StObject.set(x, "bodyClassName", js.Any.fromFunction1(value))
      
      @scala.inline
      def setBodyClassNameUndefined: Self = StObject.set(x, "bodyClassName", js.undefined)
      
      @scala.inline
      def setBodyStyle(value: CSSProperties): Self = StObject.set(x, "bodyStyle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBodyStyleUndefined: Self = StObject.set(x, "bodyStyle", js.undefined)
      
      @scala.inline
      def setCloseButton(value: ReactElement | (js.Function1[/* props */ js.Any, ReactElement]) | Boolean): Self = StObject.set(x, "closeButton", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCloseButtonFunction1(value: /* props */ js.Any => ReactElement): Self = StObject.set(x, "closeButton", js.Any.fromFunction1(value))
      
      @scala.inline
      def setCloseButtonReactElement(value: ReactElement): Self = StObject.set(x, "closeButton", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCloseButtonUndefined: Self = StObject.set(x, "closeButton", js.undefined)
      
      @scala.inline
      def setCloseOnClick(value: Boolean): Self = StObject.set(x, "closeOnClick", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCloseOnClickUndefined: Self = StObject.set(x, "closeOnClick", js.undefined)
      
      @scala.inline
      def setContainerId(value: Id): Self = StObject.set(x, "containerId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContainerIdUndefined: Self = StObject.set(x, "containerId", js.undefined)
      
      @scala.inline
      def setDraggable(value: Boolean): Self = StObject.set(x, "draggable", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDraggablePercent(value: Double): Self = StObject.set(x, "draggablePercent", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDraggablePercentUndefined: Self = StObject.set(x, "draggablePercent", js.undefined)
      
      @scala.inline
      def setDraggableUndefined: Self = StObject.set(x, "draggable", js.undefined)
      
      @scala.inline
      def setHideProgressBar(value: Boolean): Self = StObject.set(x, "hideProgressBar", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHideProgressBarUndefined: Self = StObject.set(x, "hideProgressBar", js.undefined)
      
      @scala.inline
      def setOnClick(value: /* event */ SyntheticMouseEvent[Element] => Unit): Self = StObject.set(x, "onClick", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnClickUndefined: Self = StObject.set(x, "onClick", js.undefined)
      
      @scala.inline
      def setPauseOnFocusLoss(value: Boolean): Self = StObject.set(x, "pauseOnFocusLoss", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPauseOnFocusLossUndefined: Self = StObject.set(x, "pauseOnFocusLoss", js.undefined)
      
      @scala.inline
      def setPauseOnHover(value: Boolean): Self = StObject.set(x, "pauseOnHover", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPauseOnHoverUndefined: Self = StObject.set(x, "pauseOnHover", js.undefined)
      
      @scala.inline
      def setPosition(value: ToastPosition): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPositionUndefined: Self = StObject.set(x, "position", js.undefined)
      
      @scala.inline
      def setProgressClassName(value: ToastClassName): Self = StObject.set(x, "progressClassName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setProgressClassNameFunction1(value: /* context */ js.UndefOr[Position] => String): Self = StObject.set(x, "progressClassName", js.Any.fromFunction1(value))
      
      @scala.inline
      def setProgressClassNameUndefined: Self = StObject.set(x, "progressClassName", js.undefined)
      
      @scala.inline
      def setProgressStyle(value: CSSProperties): Self = StObject.set(x, "progressStyle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setProgressStyleUndefined: Self = StObject.set(x, "progressStyle", js.undefined)
      
      @scala.inline
      def setRole(value: String): Self = StObject.set(x, "role", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRoleUndefined: Self = StObject.set(x, "role", js.undefined)
      
      @scala.inline
      def setRtl(value: Boolean): Self = StObject.set(x, "rtl", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRtlUndefined: Self = StObject.set(x, "rtl", js.undefined)
      
      @scala.inline
      def setTransition(value: ToastTransition): Self = StObject.set(x, "transition", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTransitionComponentClass(value: ReactComponentClass[ToastTransitionProps]): Self = StObject.set(x, "transition", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTransitionFunctionComponent(value: ReactComponentClass[ToastTransitionProps]): Self = StObject.set(x, "transition", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTransitionUndefined: Self = StObject.set(x, "transition", js.undefined)
    }
  }
  
  type Id = Double | String
  
  /* Inlined parent std.Partial<react-toastify.react-toastify/dist/types.ToastProps> */
  @js.native
  trait NotValidatedToastProps extends StObject {
    
    var autoClose: js.UndefOr[Double | `false`] = js.native
    
    var bodyClassName: js.UndefOr[ToastClassName] = js.native
    
    var bodyStyle: js.UndefOr[CSSProperties] = js.native
    
    var children: js.UndefOr[ToastContent] = js.native
    
    var className: js.UndefOr[ToastClassName] = js.native
    
    var closeButton: js.UndefOr[ReactElement | (js.Function1[/* props */ js.Any, ReactElement]) | Boolean] = js.native
    
    var closeOnClick: js.UndefOr[Boolean] = js.native
    
    var closeToast: js.UndefOr[js.Function0[Unit]] = js.native
    
    var containerId: js.UndefOr[Id] = js.native
    
    var delay: js.UndefOr[Double] = js.native
    
    var deleteToast: js.UndefOr[js.Function0[Unit]] = js.native
    
    var draggable: js.UndefOr[Boolean] = js.native
    
    var draggablePercent: js.UndefOr[Double] = js.native
    
    var hideProgressBar: js.UndefOr[Boolean] = js.native
    
    var in: js.UndefOr[Boolean] = js.native
    
    var key: js.UndefOr[Id] = js.native
    
    var onClick: js.UndefOr[js.Function1[/* event */ SyntheticMouseEvent[Element], Unit]] = js.native
    
    var onClose: js.UndefOr[js.Function1[/* props */ js.Object, Unit]] = js.native
    
    var onOpen: js.UndefOr[js.Function1[/* props */ js.Object, Unit]] = js.native
    
    var pauseOnFocusLoss: js.UndefOr[Boolean] = js.native
    
    var pauseOnHover: js.UndefOr[Boolean] = js.native
    
    var position: js.UndefOr[ToastPosition] = js.native
    
    var progress: js.UndefOr[Double | String] = js.native
    
    var progressClassName: js.UndefOr[ToastClassName] = js.native
    
    var progressStyle: js.UndefOr[CSSProperties] = js.native
    
    var role: js.UndefOr[String] = js.native
    
    var rtl: js.UndefOr[Boolean] = js.native
    
    var staleId: js.UndefOr[Id] = js.native
    
    var style: js.UndefOr[CSSProperties] = js.native
    
    var toastId: Id = js.native
    
    var transition: js.UndefOr[ToastTransition] = js.native
    
    var `type`: js.UndefOr[TypeOptions] = js.native
    
    var updateId: js.UndefOr[Id] = js.native
  }
  object NotValidatedToastProps {
    
    @scala.inline
    def apply(toastId: Id): NotValidatedToastProps = {
      val __obj = js.Dynamic.literal(toastId = toastId.asInstanceOf[js.Any])
      __obj.asInstanceOf[NotValidatedToastProps]
    }
    
    @scala.inline
    implicit class NotValidatedToastPropsMutableBuilder[Self <: NotValidatedToastProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAutoClose(value: Double | `false`): Self = StObject.set(x, "autoClose", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAutoCloseUndefined: Self = StObject.set(x, "autoClose", js.undefined)
      
      @scala.inline
      def setBodyClassName(value: ToastClassName): Self = StObject.set(x, "bodyClassName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBodyClassNameFunction1(value: /* context */ js.UndefOr[Position] => String): Self = StObject.set(x, "bodyClassName", js.Any.fromFunction1(value))
      
      @scala.inline
      def setBodyClassNameUndefined: Self = StObject.set(x, "bodyClassName", js.undefined)
      
      @scala.inline
      def setBodyStyle(value: CSSProperties): Self = StObject.set(x, "bodyStyle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBodyStyleUndefined: Self = StObject.set(x, "bodyStyle", js.undefined)
      
      @scala.inline
      def setChildren(value: ToastContent): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChildrenFunction1(value: /* props */ ToastContentProps => ReactElement): Self = StObject.set(x, "children", js.Any.fromFunction1(value))
      
      @scala.inline
      def setChildrenReactElement(value: ReactElement): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      @scala.inline
      def setClassName(value: ToastClassName): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClassNameFunction1(value: /* context */ js.UndefOr[Position] => String): Self = StObject.set(x, "className", js.Any.fromFunction1(value))
      
      @scala.inline
      def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      @scala.inline
      def setCloseButton(value: ReactElement | (js.Function1[/* props */ js.Any, ReactElement]) | Boolean): Self = StObject.set(x, "closeButton", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCloseButtonFunction1(value: /* props */ js.Any => ReactElement): Self = StObject.set(x, "closeButton", js.Any.fromFunction1(value))
      
      @scala.inline
      def setCloseButtonReactElement(value: ReactElement): Self = StObject.set(x, "closeButton", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCloseButtonUndefined: Self = StObject.set(x, "closeButton", js.undefined)
      
      @scala.inline
      def setCloseOnClick(value: Boolean): Self = StObject.set(x, "closeOnClick", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCloseOnClickUndefined: Self = StObject.set(x, "closeOnClick", js.undefined)
      
      @scala.inline
      def setCloseToast(value: () => Unit): Self = StObject.set(x, "closeToast", js.Any.fromFunction0(value))
      
      @scala.inline
      def setCloseToastUndefined: Self = StObject.set(x, "closeToast", js.undefined)
      
      @scala.inline
      def setContainerId(value: Id): Self = StObject.set(x, "containerId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContainerIdUndefined: Self = StObject.set(x, "containerId", js.undefined)
      
      @scala.inline
      def setDelay(value: Double): Self = StObject.set(x, "delay", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDelayUndefined: Self = StObject.set(x, "delay", js.undefined)
      
      @scala.inline
      def setDeleteToast(value: () => Unit): Self = StObject.set(x, "deleteToast", js.Any.fromFunction0(value))
      
      @scala.inline
      def setDeleteToastUndefined: Self = StObject.set(x, "deleteToast", js.undefined)
      
      @scala.inline
      def setDraggable(value: Boolean): Self = StObject.set(x, "draggable", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDraggablePercent(value: Double): Self = StObject.set(x, "draggablePercent", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDraggablePercentUndefined: Self = StObject.set(x, "draggablePercent", js.undefined)
      
      @scala.inline
      def setDraggableUndefined: Self = StObject.set(x, "draggable", js.undefined)
      
      @scala.inline
      def setHideProgressBar(value: Boolean): Self = StObject.set(x, "hideProgressBar", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHideProgressBarUndefined: Self = StObject.set(x, "hideProgressBar", js.undefined)
      
      @scala.inline
      def setIn(value: Boolean): Self = StObject.set(x, "in", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInUndefined: Self = StObject.set(x, "in", js.undefined)
      
      @scala.inline
      def setKey(value: Id): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
      
      @scala.inline
      def setOnClick(value: /* event */ SyntheticMouseEvent[Element] => Unit): Self = StObject.set(x, "onClick", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnClickUndefined: Self = StObject.set(x, "onClick", js.undefined)
      
      @scala.inline
      def setOnClose(value: /* props */ js.Object => Unit): Self = StObject.set(x, "onClose", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnCloseUndefined: Self = StObject.set(x, "onClose", js.undefined)
      
      @scala.inline
      def setOnOpen(value: /* props */ js.Object => Unit): Self = StObject.set(x, "onOpen", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnOpenUndefined: Self = StObject.set(x, "onOpen", js.undefined)
      
      @scala.inline
      def setPauseOnFocusLoss(value: Boolean): Self = StObject.set(x, "pauseOnFocusLoss", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPauseOnFocusLossUndefined: Self = StObject.set(x, "pauseOnFocusLoss", js.undefined)
      
      @scala.inline
      def setPauseOnHover(value: Boolean): Self = StObject.set(x, "pauseOnHover", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPauseOnHoverUndefined: Self = StObject.set(x, "pauseOnHover", js.undefined)
      
      @scala.inline
      def setPosition(value: ToastPosition): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPositionUndefined: Self = StObject.set(x, "position", js.undefined)
      
      @scala.inline
      def setProgress(value: Double | String): Self = StObject.set(x, "progress", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setProgressClassName(value: ToastClassName): Self = StObject.set(x, "progressClassName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setProgressClassNameFunction1(value: /* context */ js.UndefOr[Position] => String): Self = StObject.set(x, "progressClassName", js.Any.fromFunction1(value))
      
      @scala.inline
      def setProgressClassNameUndefined: Self = StObject.set(x, "progressClassName", js.undefined)
      
      @scala.inline
      def setProgressStyle(value: CSSProperties): Self = StObject.set(x, "progressStyle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setProgressStyleUndefined: Self = StObject.set(x, "progressStyle", js.undefined)
      
      @scala.inline
      def setProgressUndefined: Self = StObject.set(x, "progress", js.undefined)
      
      @scala.inline
      def setRole(value: String): Self = StObject.set(x, "role", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRoleUndefined: Self = StObject.set(x, "role", js.undefined)
      
      @scala.inline
      def setRtl(value: Boolean): Self = StObject.set(x, "rtl", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRtlUndefined: Self = StObject.set(x, "rtl", js.undefined)
      
      @scala.inline
      def setStaleId(value: Id): Self = StObject.set(x, "staleId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStaleIdUndefined: Self = StObject.set(x, "staleId", js.undefined)
      
      @scala.inline
      def setStyle(value: CSSProperties): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
      
      @scala.inline
      def setToastId(value: Id): Self = StObject.set(x, "toastId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTransition(value: ToastTransition): Self = StObject.set(x, "transition", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTransitionComponentClass(value: ReactComponentClass[ToastTransitionProps]): Self = StObject.set(x, "transition", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTransitionFunctionComponent(value: ReactComponentClass[ToastTransitionProps]): Self = StObject.set(x, "transition", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTransitionUndefined: Self = StObject.set(x, "transition", js.undefined)
      
      @scala.inline
      def setType(value: TypeOptions): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
      
      @scala.inline
      def setUpdateId(value: Id): Self = StObject.set(x, "updateId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUpdateIdUndefined: Self = StObject.set(x, "updateId", js.undefined)
    }
  }
  
  type Nullable[T] = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in keyof T ]: T[P] | null}
    */ typingsSlinky.reactToastify.reactToastifyStrings.Nullable with TopLevel[T]
  
  @js.native
  trait Toast extends StObject {
    
    var content: ToastContent = js.native
    
    var props: ToastProps = js.native
  }
  object Toast {
    
    @scala.inline
    def apply(props: ToastProps): Toast = {
      val __obj = js.Dynamic.literal(props = props.asInstanceOf[js.Any])
      __obj.asInstanceOf[Toast]
    }
    
    @scala.inline
    implicit class ToastMutableBuilder[Self <: Toast] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setContent(value: ToastContent): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContentFunction1(value: /* props */ ToastContentProps => ReactElement): Self = StObject.set(x, "content", js.Any.fromFunction1(value))
      
      @scala.inline
      def setContentReactElement(value: ReactElement): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContentUndefined: Self = StObject.set(x, "content", js.undefined)
      
      @scala.inline
      def setProps(value: ToastProps): Self = StObject.set(x, "props", value.asInstanceOf[js.Any])
    }
  }
  
  type ToastClassName = (js.Function1[/* context */ js.UndefOr[Position], String]) | String
  
  @js.native
  trait ToastContainerProps extends CommonOptions {
    
    /**
      * An optional css class to set.
      */
    var className: js.UndefOr[ClassName] = js.native
    
    /**
      * Show the toast only if it includes containerId and it's the same as containerId
      * `Default: false`
      */
    var enableMultiContainer: js.UndefOr[Boolean] = js.native
    
    /**
      * Limit the number of toast displayed at the same time
      */
    var limit: js.UndefOr[Double] = js.native
    
    /**
      * Whether or not to display the newest toast on top.
      * `Default: false`
      */
    var newestOnTop: js.UndefOr[Boolean] = js.native
    
    /**
      * An optional inline style to apply.
      */
    var style: js.UndefOr[CSSProperties] = js.native
    
    /**
      * An optional css class for the toast.
      */
    var toastClassName: js.UndefOr[ToastClassName] = js.native
    
    /**
      * An optional inline style to apply for the toast.
      */
    var toastStyle: js.UndefOr[CSSProperties] = js.native
  }
  object ToastContainerProps {
    
    @scala.inline
    def apply(): ToastContainerProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ToastContainerProps]
    }
    
    @scala.inline
    implicit class ToastContainerPropsMutableBuilder[Self <: ToastContainerProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setClassName(value: ClassName): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClassNameFunction1(value: /* context */ js.UndefOr[DefaultClassName] => String): Self = StObject.set(x, "className", js.Any.fromFunction1(value))
      
      @scala.inline
      def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      @scala.inline
      def setEnableMultiContainer(value: Boolean): Self = StObject.set(x, "enableMultiContainer", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEnableMultiContainerUndefined: Self = StObject.set(x, "enableMultiContainer", js.undefined)
      
      @scala.inline
      def setLimit(value: Double): Self = StObject.set(x, "limit", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLimitUndefined: Self = StObject.set(x, "limit", js.undefined)
      
      @scala.inline
      def setNewestOnTop(value: Boolean): Self = StObject.set(x, "newestOnTop", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNewestOnTopUndefined: Self = StObject.set(x, "newestOnTop", js.undefined)
      
      @scala.inline
      def setStyle(value: CSSProperties): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
      
      @scala.inline
      def setToastClassName(value: ToastClassName): Self = StObject.set(x, "toastClassName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setToastClassNameFunction1(value: /* context */ js.UndefOr[Position] => String): Self = StObject.set(x, "toastClassName", js.Any.fromFunction1(value))
      
      @scala.inline
      def setToastClassNameUndefined: Self = StObject.set(x, "toastClassName", js.undefined)
      
      @scala.inline
      def setToastStyle(value: CSSProperties): Self = StObject.set(x, "toastStyle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setToastStyleUndefined: Self = StObject.set(x, "toastStyle", js.undefined)
    }
  }
  
  type ToastContent = ReactElement | (js.Function1[/* props */ ToastContentProps, ReactElement])
  
  @js.native
  trait ToastContentProps extends StObject {
    
    var closeToast: js.UndefOr[js.Function0[Unit]] = js.native
  }
  object ToastContentProps {
    
    @scala.inline
    def apply(): ToastContentProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ToastContentProps]
    }
    
    @scala.inline
    implicit class ToastContentPropsMutableBuilder[Self <: ToastContentProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCloseToast(value: () => Unit): Self = StObject.set(x, "closeToast", js.Any.fromFunction0(value))
      
      @scala.inline
      def setCloseToastUndefined: Self = StObject.set(x, "closeToast", js.undefined)
    }
  }
  
  @js.native
  trait ToastOptions extends CommonOptions {
    
    /**
      * An optional css class to set.
      */
    var className: js.UndefOr[ToastClassName] = js.native
    
    /**
      * Add a delay in ms before the toast appear.
      */
    var delay: js.UndefOr[Double] = js.native
    
    /**
      * Called when toast is unmounted.
      */
    var onClose: js.UndefOr[js.Function1[/* props */ js.Object, Unit]] = js.native
    
    /**
      * Called when toast is mounted.
      */
    var onOpen: js.UndefOr[js.Function1[/* props */ js.Object, Unit]] = js.native
    
    /**
      * Set the percentage for the controlled progress bar. `Value must be between 0 and 1.`
      */
    var progress: js.UndefOr[Double | String] = js.native
    
    /**
      * An optional inline style to apply.
      */
    var style: js.UndefOr[CSSProperties] = js.native
    
    /**
      * Set a custom `toastId`
      */
    var toastId: js.UndefOr[Id] = js.native
    
    /**
      * Set the toast type.
      * `One of: 'info', 'success', 'warning', 'error', 'default'`
      */
    var `type`: js.UndefOr[TypeOptions] = js.native
    
    /**
      * Used during update
      */
    var updateId: js.UndefOr[Id] = js.native
  }
  object ToastOptions {
    
    @scala.inline
    def apply(): ToastOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ToastOptions]
    }
    
    @scala.inline
    implicit class ToastOptionsMutableBuilder[Self <: ToastOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setClassName(value: ToastClassName): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClassNameFunction1(value: /* context */ js.UndefOr[Position] => String): Self = StObject.set(x, "className", js.Any.fromFunction1(value))
      
      @scala.inline
      def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      @scala.inline
      def setDelay(value: Double): Self = StObject.set(x, "delay", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDelayUndefined: Self = StObject.set(x, "delay", js.undefined)
      
      @scala.inline
      def setOnClose(value: /* props */ js.Object => Unit): Self = StObject.set(x, "onClose", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnCloseUndefined: Self = StObject.set(x, "onClose", js.undefined)
      
      @scala.inline
      def setOnOpen(value: /* props */ js.Object => Unit): Self = StObject.set(x, "onOpen", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnOpenUndefined: Self = StObject.set(x, "onOpen", js.undefined)
      
      @scala.inline
      def setProgress(value: Double | String): Self = StObject.set(x, "progress", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setProgressUndefined: Self = StObject.set(x, "progress", js.undefined)
      
      @scala.inline
      def setStyle(value: CSSProperties): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
      
      @scala.inline
      def setToastId(value: Id): Self = StObject.set(x, "toastId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setToastIdUndefined: Self = StObject.set(x, "toastId", js.undefined)
      
      @scala.inline
      def setType(value: TypeOptions): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
      
      @scala.inline
      def setUpdateId(value: Id): Self = StObject.set(x, "updateId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUpdateIdUndefined: Self = StObject.set(x, "updateId", js.undefined)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.reactToastify.reactToastifyStrings.`top-right`
    - typingsSlinky.reactToastify.reactToastifyStrings.`top-center`
    - typingsSlinky.reactToastify.reactToastifyStrings.`top-left`
    - typingsSlinky.reactToastify.reactToastifyStrings.`bottom-right`
    - typingsSlinky.reactToastify.reactToastifyStrings.`bottom-center`
    - typingsSlinky.reactToastify.reactToastifyStrings.`bottom-left`
  */
  trait ToastPosition extends StObject
  object ToastPosition {
    
    @scala.inline
    def `bottom-center`: typingsSlinky.reactToastify.reactToastifyStrings.`bottom-center` = "bottom-center".asInstanceOf[typingsSlinky.reactToastify.reactToastifyStrings.`bottom-center`]
    
    @scala.inline
    def `bottom-left`: typingsSlinky.reactToastify.reactToastifyStrings.`bottom-left` = "bottom-left".asInstanceOf[typingsSlinky.reactToastify.reactToastifyStrings.`bottom-left`]
    
    @scala.inline
    def `bottom-right`: typingsSlinky.reactToastify.reactToastifyStrings.`bottom-right` = "bottom-right".asInstanceOf[typingsSlinky.reactToastify.reactToastifyStrings.`bottom-right`]
    
    @scala.inline
    def `top-center`: typingsSlinky.reactToastify.reactToastifyStrings.`top-center` = "top-center".asInstanceOf[typingsSlinky.reactToastify.reactToastifyStrings.`top-center`]
    
    @scala.inline
    def `top-left`: typingsSlinky.reactToastify.reactToastifyStrings.`top-left` = "top-left".asInstanceOf[typingsSlinky.reactToastify.reactToastifyStrings.`top-left`]
    
    @scala.inline
    def `top-right`: typingsSlinky.reactToastify.reactToastifyStrings.`top-right` = "top-right".asInstanceOf[typingsSlinky.reactToastify.reactToastifyStrings.`top-right`]
  }
  
  @js.native
  trait ToastProps extends ToastOptions {
    
    var children: js.UndefOr[ToastContent] = js.native
    
    def closeToast(): Unit = js.native
    
    def deleteToast(): Unit = js.native
    
    @JSName("draggablePercent")
    var draggablePercent_ToastProps: Double = js.native
    
    var in: js.UndefOr[Boolean] = js.native
    
    var key: Id = js.native
    
    @JSName("position")
    var position_ToastProps: ToastPosition = js.native
    
    var staleId: js.UndefOr[Id] = js.native
    
    @JSName("toastId")
    var toastId_ToastProps: Id = js.native
    
    @JSName("transition")
    var transition_ToastProps: ToastTransition = js.native
  }
  object ToastProps {
    
    @scala.inline
    def apply(
      closeToast: () => Unit,
      deleteToast: () => Unit,
      draggablePercent: Double,
      key: Id,
      position: ToastPosition,
      toastId: Id,
      transition: ToastTransition
    ): ToastProps = {
      val __obj = js.Dynamic.literal(closeToast = js.Any.fromFunction0(closeToast), deleteToast = js.Any.fromFunction0(deleteToast), draggablePercent = draggablePercent.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any], position = position.asInstanceOf[js.Any], toastId = toastId.asInstanceOf[js.Any], transition = transition.asInstanceOf[js.Any])
      __obj.asInstanceOf[ToastProps]
    }
    
    @scala.inline
    implicit class ToastPropsMutableBuilder[Self <: ToastProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setChildren(value: ToastContent): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChildrenFunction1(value: /* props */ ToastContentProps => ReactElement): Self = StObject.set(x, "children", js.Any.fromFunction1(value))
      
      @scala.inline
      def setChildrenReactElement(value: ReactElement): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      @scala.inline
      def setCloseToast(value: () => Unit): Self = StObject.set(x, "closeToast", js.Any.fromFunction0(value))
      
      @scala.inline
      def setDeleteToast(value: () => Unit): Self = StObject.set(x, "deleteToast", js.Any.fromFunction0(value))
      
      @scala.inline
      def setDraggablePercent(value: Double): Self = StObject.set(x, "draggablePercent", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIn(value: Boolean): Self = StObject.set(x, "in", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInUndefined: Self = StObject.set(x, "in", js.undefined)
      
      @scala.inline
      def setKey(value: Id): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPosition(value: ToastPosition): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStaleId(value: Id): Self = StObject.set(x, "staleId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStaleIdUndefined: Self = StObject.set(x, "staleId", js.undefined)
      
      @scala.inline
      def setToastId(value: Id): Self = StObject.set(x, "toastId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTransition(value: ToastTransition): Self = StObject.set(x, "transition", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTransitionComponentClass(value: ReactComponentClass[ToastTransitionProps]): Self = StObject.set(x, "transition", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTransitionFunctionComponent(value: ReactComponentClass[ToastTransitionProps]): Self = StObject.set(x, "transition", value.asInstanceOf[js.Any])
    }
  }
  
  type ToastTransition = ReactComponentClass[ToastTransitionProps]
  
  @js.native
  trait ToastTransitionProps extends StObject {
    
    var appear: Boolean = js.native
    
    var children: js.UndefOr[ReactElement] = js.native
    
    def done(): Unit = js.native
    
    var in: Boolean = js.native
    
    var nodeRef: ReactRef[HTMLElement] = js.native
    
    var position: ToastPosition | String = js.native
    
    var preventExitTransition: Boolean = js.native
  }
  object ToastTransitionProps {
    
    @scala.inline
    def apply(
      appear: Boolean,
      done: () => Unit,
      in: Boolean,
      nodeRef: ReactRef[HTMLElement],
      position: ToastPosition | String,
      preventExitTransition: Boolean
    ): ToastTransitionProps = {
      val __obj = js.Dynamic.literal(appear = appear.asInstanceOf[js.Any], done = js.Any.fromFunction0(done), in = in.asInstanceOf[js.Any], nodeRef = nodeRef.asInstanceOf[js.Any], position = position.asInstanceOf[js.Any], preventExitTransition = preventExitTransition.asInstanceOf[js.Any])
      __obj.asInstanceOf[ToastTransitionProps]
    }
    
    @scala.inline
    implicit class ToastTransitionPropsMutableBuilder[Self <: ToastTransitionProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAppear(value: Boolean): Self = StObject.set(x, "appear", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChildren(value: ReactElement): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChildrenReactElement(value: ReactElement): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      @scala.inline
      def setDone(value: () => Unit): Self = StObject.set(x, "done", js.Any.fromFunction0(value))
      
      @scala.inline
      def setIn(value: Boolean): Self = StObject.set(x, "in", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNodeRef(value: ReactRef[HTMLElement]): Self = StObject.set(x, "nodeRef", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPosition(value: ToastPosition | String): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPreventExitTransition(value: Boolean): Self = StObject.set(x, "preventExitTransition", value.asInstanceOf[js.Any])
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.reactToastify.reactToastifyStrings.info_
    - typingsSlinky.reactToastify.reactToastifyStrings.success_
    - typingsSlinky.reactToastify.reactToastifyStrings.warning_
    - typingsSlinky.reactToastify.reactToastifyStrings.error_
    - typingsSlinky.reactToastify.reactToastifyStrings.default_
    - typingsSlinky.reactToastify.reactToastifyStrings.dark_
  */
  trait TypeOptions extends StObject
  object TypeOptions {
    
    @scala.inline
    def default: default_ = "default".asInstanceOf[default_]
    
    @scala.inline
    def dark: dark_ = "dark".asInstanceOf[dark_]
    
    @scala.inline
    def error: error_ = "error".asInstanceOf[error_]
    
    @scala.inline
    def info: info_ = "info".asInstanceOf[info_]
    
    @scala.inline
    def success: success_ = "success".asInstanceOf[success_]
    
    @scala.inline
    def warning: warning_ = "warning".asInstanceOf[warning_]
  }
  
  /* Inlined parent react-toastify.react-toastify/dist/types.Nullable<react-toastify.react-toastify/dist/types.ToastOptions> */
  @js.native
  trait UpdateOptions extends StObject {
    
    var autoClose: js.UndefOr[Double | `false` | Null] = js.native
    
    var bodyClassName: js.UndefOr[ToastClassName | Null] = js.native
    
    var bodyStyle: js.UndefOr[CSSProperties | Null] = js.native
    
    var className: js.UndefOr[ToastClassName | Null] = js.native
    
    var closeButton: js.UndefOr[ReactElement | (js.Function1[/* props */ js.Any, ReactElement]) | Boolean | Null] = js.native
    
    var closeOnClick: js.UndefOr[Boolean | Null] = js.native
    
    var containerId: js.UndefOr[Id | Null] = js.native
    
    var delay: js.UndefOr[Double | Null] = js.native
    
    var draggable: js.UndefOr[Boolean | Null] = js.native
    
    var draggablePercent: js.UndefOr[Double | Null] = js.native
    
    var hideProgressBar: js.UndefOr[Boolean | Null] = js.native
    
    var onClick: js.UndefOr[(js.Function1[/* event */ SyntheticMouseEvent[Element], Unit]) | Null] = js.native
    
    var onClose: js.UndefOr[(js.Function1[/* props */ js.Object, Unit]) | Null] = js.native
    
    var onOpen: js.UndefOr[(js.Function1[/* props */ js.Object, Unit]) | Null] = js.native
    
    var pauseOnFocusLoss: js.UndefOr[Boolean | Null] = js.native
    
    var pauseOnHover: js.UndefOr[Boolean | Null] = js.native
    
    var position: js.UndefOr[ToastPosition | Null] = js.native
    
    var progress: js.UndefOr[Double | String | Null] = js.native
    
    var progressClassName: js.UndefOr[ToastClassName | Null] = js.native
    
    var progressStyle: js.UndefOr[CSSProperties | Null] = js.native
    
    /**
      * Used to update a toast.
      * Pass any valid ReactNode(string, number, component)
      */
    var render: js.UndefOr[ToastContent] = js.native
    
    var role: js.UndefOr[String | Null] = js.native
    
    var rtl: js.UndefOr[Boolean | Null] = js.native
    
    var style: js.UndefOr[CSSProperties | Null] = js.native
    
    var toastId: js.UndefOr[Id | Null] = js.native
    
    var transition: js.UndefOr[ToastTransition | Null] = js.native
    
    var `type`: js.UndefOr[TypeOptions | Null] = js.native
    
    var updateId: js.UndefOr[Id | Null] = js.native
  }
  object UpdateOptions {
    
    @scala.inline
    def apply(): UpdateOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[UpdateOptions]
    }
    
    @scala.inline
    implicit class UpdateOptionsMutableBuilder[Self <: UpdateOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAutoClose(value: Double | `false`): Self = StObject.set(x, "autoClose", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAutoCloseNull: Self = StObject.set(x, "autoClose", null)
      
      @scala.inline
      def setAutoCloseUndefined: Self = StObject.set(x, "autoClose", js.undefined)
      
      @scala.inline
      def setBodyClassName(value: ToastClassName): Self = StObject.set(x, "bodyClassName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBodyClassNameFunction1(value: /* context */ js.UndefOr[Position] => String): Self = StObject.set(x, "bodyClassName", js.Any.fromFunction1(value))
      
      @scala.inline
      def setBodyClassNameNull: Self = StObject.set(x, "bodyClassName", null)
      
      @scala.inline
      def setBodyClassNameUndefined: Self = StObject.set(x, "bodyClassName", js.undefined)
      
      @scala.inline
      def setBodyStyle(value: CSSProperties): Self = StObject.set(x, "bodyStyle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBodyStyleNull: Self = StObject.set(x, "bodyStyle", null)
      
      @scala.inline
      def setBodyStyleUndefined: Self = StObject.set(x, "bodyStyle", js.undefined)
      
      @scala.inline
      def setClassName(value: ToastClassName): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClassNameFunction1(value: /* context */ js.UndefOr[Position] => String): Self = StObject.set(x, "className", js.Any.fromFunction1(value))
      
      @scala.inline
      def setClassNameNull: Self = StObject.set(x, "className", null)
      
      @scala.inline
      def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      @scala.inline
      def setCloseButton(value: ReactElement | (js.Function1[/* props */ js.Any, ReactElement]) | Boolean): Self = StObject.set(x, "closeButton", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCloseButtonFunction1(value: /* props */ js.Any => ReactElement): Self = StObject.set(x, "closeButton", js.Any.fromFunction1(value))
      
      @scala.inline
      def setCloseButtonNull: Self = StObject.set(x, "closeButton", null)
      
      @scala.inline
      def setCloseButtonReactElement(value: ReactElement): Self = StObject.set(x, "closeButton", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCloseButtonUndefined: Self = StObject.set(x, "closeButton", js.undefined)
      
      @scala.inline
      def setCloseOnClick(value: Boolean): Self = StObject.set(x, "closeOnClick", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCloseOnClickNull: Self = StObject.set(x, "closeOnClick", null)
      
      @scala.inline
      def setCloseOnClickUndefined: Self = StObject.set(x, "closeOnClick", js.undefined)
      
      @scala.inline
      def setContainerId(value: Id): Self = StObject.set(x, "containerId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContainerIdNull: Self = StObject.set(x, "containerId", null)
      
      @scala.inline
      def setContainerIdUndefined: Self = StObject.set(x, "containerId", js.undefined)
      
      @scala.inline
      def setDelay(value: Double): Self = StObject.set(x, "delay", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDelayNull: Self = StObject.set(x, "delay", null)
      
      @scala.inline
      def setDelayUndefined: Self = StObject.set(x, "delay", js.undefined)
      
      @scala.inline
      def setDraggable(value: Boolean): Self = StObject.set(x, "draggable", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDraggableNull: Self = StObject.set(x, "draggable", null)
      
      @scala.inline
      def setDraggablePercent(value: Double): Self = StObject.set(x, "draggablePercent", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDraggablePercentNull: Self = StObject.set(x, "draggablePercent", null)
      
      @scala.inline
      def setDraggablePercentUndefined: Self = StObject.set(x, "draggablePercent", js.undefined)
      
      @scala.inline
      def setDraggableUndefined: Self = StObject.set(x, "draggable", js.undefined)
      
      @scala.inline
      def setHideProgressBar(value: Boolean): Self = StObject.set(x, "hideProgressBar", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHideProgressBarNull: Self = StObject.set(x, "hideProgressBar", null)
      
      @scala.inline
      def setHideProgressBarUndefined: Self = StObject.set(x, "hideProgressBar", js.undefined)
      
      @scala.inline
      def setOnClick(value: /* event */ SyntheticMouseEvent[Element] => Unit): Self = StObject.set(x, "onClick", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnClickNull: Self = StObject.set(x, "onClick", null)
      
      @scala.inline
      def setOnClickUndefined: Self = StObject.set(x, "onClick", js.undefined)
      
      @scala.inline
      def setOnClose(value: /* props */ js.Object => Unit): Self = StObject.set(x, "onClose", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnCloseNull: Self = StObject.set(x, "onClose", null)
      
      @scala.inline
      def setOnCloseUndefined: Self = StObject.set(x, "onClose", js.undefined)
      
      @scala.inline
      def setOnOpen(value: /* props */ js.Object => Unit): Self = StObject.set(x, "onOpen", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnOpenNull: Self = StObject.set(x, "onOpen", null)
      
      @scala.inline
      def setOnOpenUndefined: Self = StObject.set(x, "onOpen", js.undefined)
      
      @scala.inline
      def setPauseOnFocusLoss(value: Boolean): Self = StObject.set(x, "pauseOnFocusLoss", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPauseOnFocusLossNull: Self = StObject.set(x, "pauseOnFocusLoss", null)
      
      @scala.inline
      def setPauseOnFocusLossUndefined: Self = StObject.set(x, "pauseOnFocusLoss", js.undefined)
      
      @scala.inline
      def setPauseOnHover(value: Boolean): Self = StObject.set(x, "pauseOnHover", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPauseOnHoverNull: Self = StObject.set(x, "pauseOnHover", null)
      
      @scala.inline
      def setPauseOnHoverUndefined: Self = StObject.set(x, "pauseOnHover", js.undefined)
      
      @scala.inline
      def setPosition(value: ToastPosition): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPositionNull: Self = StObject.set(x, "position", null)
      
      @scala.inline
      def setPositionUndefined: Self = StObject.set(x, "position", js.undefined)
      
      @scala.inline
      def setProgress(value: Double | String): Self = StObject.set(x, "progress", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setProgressClassName(value: ToastClassName): Self = StObject.set(x, "progressClassName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setProgressClassNameFunction1(value: /* context */ js.UndefOr[Position] => String): Self = StObject.set(x, "progressClassName", js.Any.fromFunction1(value))
      
      @scala.inline
      def setProgressClassNameNull: Self = StObject.set(x, "progressClassName", null)
      
      @scala.inline
      def setProgressClassNameUndefined: Self = StObject.set(x, "progressClassName", js.undefined)
      
      @scala.inline
      def setProgressNull: Self = StObject.set(x, "progress", null)
      
      @scala.inline
      def setProgressStyle(value: CSSProperties): Self = StObject.set(x, "progressStyle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setProgressStyleNull: Self = StObject.set(x, "progressStyle", null)
      
      @scala.inline
      def setProgressStyleUndefined: Self = StObject.set(x, "progressStyle", js.undefined)
      
      @scala.inline
      def setProgressUndefined: Self = StObject.set(x, "progress", js.undefined)
      
      @scala.inline
      def setRender(value: ToastContent): Self = StObject.set(x, "render", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRenderFunction1(value: /* props */ ToastContentProps => ReactElement): Self = StObject.set(x, "render", js.Any.fromFunction1(value))
      
      @scala.inline
      def setRenderReactElement(value: ReactElement): Self = StObject.set(x, "render", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRenderUndefined: Self = StObject.set(x, "render", js.undefined)
      
      @scala.inline
      def setRole(value: String): Self = StObject.set(x, "role", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRoleNull: Self = StObject.set(x, "role", null)
      
      @scala.inline
      def setRoleUndefined: Self = StObject.set(x, "role", js.undefined)
      
      @scala.inline
      def setRtl(value: Boolean): Self = StObject.set(x, "rtl", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRtlNull: Self = StObject.set(x, "rtl", null)
      
      @scala.inline
      def setRtlUndefined: Self = StObject.set(x, "rtl", js.undefined)
      
      @scala.inline
      def setStyle(value: CSSProperties): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStyleNull: Self = StObject.set(x, "style", null)
      
      @scala.inline
      def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
      
      @scala.inline
      def setToastId(value: Id): Self = StObject.set(x, "toastId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setToastIdNull: Self = StObject.set(x, "toastId", null)
      
      @scala.inline
      def setToastIdUndefined: Self = StObject.set(x, "toastId", js.undefined)
      
      @scala.inline
      def setTransition(value: ToastTransition): Self = StObject.set(x, "transition", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTransitionComponentClass(value: ReactComponentClass[ToastTransitionProps]): Self = StObject.set(x, "transition", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTransitionFunctionComponent(value: ReactComponentClass[ToastTransitionProps]): Self = StObject.set(x, "transition", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTransitionNull: Self = StObject.set(x, "transition", null)
      
      @scala.inline
      def setTransitionUndefined: Self = StObject.set(x, "transition", js.undefined)
      
      @scala.inline
      def setType(value: TypeOptions): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTypeNull: Self = StObject.set(x, "type", null)
      
      @scala.inline
      def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
      
      @scala.inline
      def setUpdateId(value: Id): Self = StObject.set(x, "updateId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUpdateIdNull: Self = StObject.set(x, "updateId", null)
      
      @scala.inline
      def setUpdateIdUndefined: Self = StObject.set(x, "updateId", js.undefined)
    }
  }
}
