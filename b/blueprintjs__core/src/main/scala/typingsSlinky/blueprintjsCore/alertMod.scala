package typingsSlinky.blueprintjsCore

import org.scalajs.dom.raw.Event
import org.scalajs.dom.raw.HTMLElement
import slinky.core.SyntheticEvent
import slinky.core.facade.ReactElement
import typingsSlinky.blueprintjsCore.commonMod.AbstractPureComponent2
import typingsSlinky.blueprintjsCore.intentMod.Intent
import typingsSlinky.blueprintjsCore.overlayMod.IOverlayLifecycleProps
import typingsSlinky.blueprintjsCore.propsMod.IProps
import typingsSlinky.blueprintjsCore.propsMod.MaybeElement
import typingsSlinky.blueprintjsIcons.iconNameMod.IconName
import typingsSlinky.react.mod.CSSProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object alertMod {
  
  @JSImport("@blueprintjs/core/lib/esm/components/alert/alert", "Alert")
  @js.native
  class Alert protected ()
    extends AbstractPureComponent2[IAlertProps, js.Object, js.Object] {
    def this(props: IAlertProps) = this()
    def this(props: IAlertProps, context: js.Any) = this()
    
    var handleCancel: js.Any = js.native
    
    var handleConfirm: js.Any = js.native
    
    var internalHandleCallbacks: js.Any = js.native
  }
  /* static members */
  object Alert {
    
    @JSImport("@blueprintjs/core/lib/esm/components/alert/alert", "Alert")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@blueprintjs/core/lib/esm/components/alert/alert", "Alert.defaultProps")
    @js.native
    def defaultProps: IAlertProps = js.native
    @scala.inline
    def defaultProps_=(x: IAlertProps): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
    
    @JSImport("@blueprintjs/core/lib/esm/components/alert/alert", "Alert.displayName")
    @js.native
    def displayName: String = js.native
    @scala.inline
    def displayName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("displayName")(x.asInstanceOf[js.Any])
  }
  
  @js.native
  trait IAlertProps
    extends IOverlayLifecycleProps
       with IProps {
    
    /**
      * Whether pressing <kbd>escape</kbd> when focused on the Alert should cancel the alert.
      * If this prop is enabled, then either `onCancel` or `onClose` must also be defined.
      * @default false
      */
    var canEscapeKeyCancel: js.UndefOr[Boolean] = js.native
    
    /**
      * Whether clicking outside the Alert should cancel the alert.
      * If this prop is enabled, then either `onCancel` or `onClose` must also be defined.
      * @default false
      */
    var canOutsideClickCancel: js.UndefOr[Boolean] = js.native
    
    /**
      * The text for the cancel button.
      * If this prop is defined, then either `onCancel` or `onClose` must also be defined.
      */
    var cancelButtonText: js.UndefOr[String] = js.native
    
    /**
      * The text for the confirm (right-most) button.
      * This button will always appear, and uses the value of the `intent` prop below.
      * @default "OK"
      */
    var confirmButtonText: js.UndefOr[String] = js.native
    
    /** Name of a Blueprint UI icon (or an icon element) to display on the left side. */
    var icon: js.UndefOr[IconName | MaybeElement] = js.native
    
    /**
      * The intent to be applied to the confirm (right-most) button and the icon (if provided).
      */
    var intent: js.UndefOr[Intent] = js.native
    
    /**
      * Toggles the visibility of the alert.
      * This prop is required because the component is controlled.
      */
    var isOpen: Boolean = js.native
    
    /**
      * Handler invoked when the alert is canceled. Alerts can be **canceled** in the following ways:
      * - clicking the cancel button (if `cancelButtonText` is defined)
      * - pressing the escape key (if `canEscapeKeyCancel` is enabled)
      * - clicking on the overlay backdrop (if `canOutsideClickCancel` is enabled)
      *
      * If any of the `cancel` props are defined, then either `onCancel` or `onClose` must be defined.
      */
    var onCancel: js.UndefOr[js.Function1[/* evt */ js.UndefOr[SyntheticEvent[Event, HTMLElement]], Unit]] = js.native
    
    /**
      * Handler invoked when the Alert is confirmed or canceled; see `onConfirm` and `onCancel` for more details.
      * First argument is `true` if confirmed, `false` otherwise.
      * This is an alternative to defining separate `onConfirm` and `onCancel` handlers.
      */
    var onClose: js.UndefOr[
        js.Function2[
          /* confirmed */ Boolean, 
          /* evt */ js.UndefOr[SyntheticEvent[Event, HTMLElement]], 
          Unit
        ]
      ] = js.native
    
    /**
      * Handler invoked when the confirm button is clicked. Alerts can be **confirmed** in the following ways:
      * - clicking the confirm button
      * - focusing on the confirm button and pressing `enter` or `space`
      */
    var onConfirm: js.UndefOr[js.Function1[/* evt */ js.UndefOr[SyntheticEvent[Event, HTMLElement]], Unit]] = js.native
    
    /**
      * The container element into which the overlay renders its contents, when `usePortal` is `true`.
      * This prop is ignored if `usePortal` is `false`.
      * @default document.body
      */
    var portalContainer: js.UndefOr[HTMLElement] = js.native
    
    /**
      * CSS styles to apply to the alert.
      */
    var style: js.UndefOr[CSSProperties] = js.native
    
    /**
      * Indicates how long (in milliseconds) the overlay's enter/leave transition takes.
      * This is used by React `CSSTransition` to know when a transition completes and must match
      * the duration of the animation in CSS. Only set this prop if you override Blueprint's default
      * transitions with new transitions of a different length.
      * @default 300
      */
    var transitionDuration: js.UndefOr[Double] = js.native
  }
  object IAlertProps {
    
    @scala.inline
    def apply(isOpen: Boolean): IAlertProps = {
      val __obj = js.Dynamic.literal(isOpen = isOpen.asInstanceOf[js.Any])
      __obj.asInstanceOf[IAlertProps]
    }
    
    @scala.inline
    implicit class IAlertPropsMutableBuilder[Self <: IAlertProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCanEscapeKeyCancel(value: Boolean): Self = StObject.set(x, "canEscapeKeyCancel", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCanEscapeKeyCancelUndefined: Self = StObject.set(x, "canEscapeKeyCancel", js.undefined)
      
      @scala.inline
      def setCanOutsideClickCancel(value: Boolean): Self = StObject.set(x, "canOutsideClickCancel", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCanOutsideClickCancelUndefined: Self = StObject.set(x, "canOutsideClickCancel", js.undefined)
      
      @scala.inline
      def setCancelButtonText(value: String): Self = StObject.set(x, "cancelButtonText", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCancelButtonTextUndefined: Self = StObject.set(x, "cancelButtonText", js.undefined)
      
      @scala.inline
      def setConfirmButtonText(value: String): Self = StObject.set(x, "confirmButtonText", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setConfirmButtonTextUndefined: Self = StObject.set(x, "confirmButtonText", js.undefined)
      
      @scala.inline
      def setIcon(value: IconName | MaybeElement): Self = StObject.set(x, "icon", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIconNull: Self = StObject.set(x, "icon", null)
      
      @scala.inline
      def setIconReactElement(value: ReactElement): Self = StObject.set(x, "icon", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIconUndefined: Self = StObject.set(x, "icon", js.undefined)
      
      @scala.inline
      def setIntent(value: Intent): Self = StObject.set(x, "intent", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIntentUndefined: Self = StObject.set(x, "intent", js.undefined)
      
      @scala.inline
      def setIsOpen(value: Boolean): Self = StObject.set(x, "isOpen", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnCancel(value: /* evt */ js.UndefOr[SyntheticEvent[Event, HTMLElement]] => Unit): Self = StObject.set(x, "onCancel", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnCancelUndefined: Self = StObject.set(x, "onCancel", js.undefined)
      
      @scala.inline
      def setOnClose(value: (/* confirmed */ Boolean, /* evt */ js.UndefOr[SyntheticEvent[Event, HTMLElement]]) => Unit): Self = StObject.set(x, "onClose", js.Any.fromFunction2(value))
      
      @scala.inline
      def setOnCloseUndefined: Self = StObject.set(x, "onClose", js.undefined)
      
      @scala.inline
      def setOnConfirm(value: /* evt */ js.UndefOr[SyntheticEvent[Event, HTMLElement]] => Unit): Self = StObject.set(x, "onConfirm", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnConfirmUndefined: Self = StObject.set(x, "onConfirm", js.undefined)
      
      @scala.inline
      def setPortalContainer(value: HTMLElement): Self = StObject.set(x, "portalContainer", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPortalContainerUndefined: Self = StObject.set(x, "portalContainer", js.undefined)
      
      @scala.inline
      def setStyle(value: CSSProperties): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
      
      @scala.inline
      def setTransitionDuration(value: Double): Self = StObject.set(x, "transitionDuration", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTransitionDurationUndefined: Self = StObject.set(x, "transitionDuration", js.undefined)
    }
  }
}
