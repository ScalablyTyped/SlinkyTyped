package typingsSlinky.reactToastNotifications

import slinky.core.ReactComponentClass
import slinky.core.facade.ReactElement
import typingsSlinky.reactToastNotifications.anon.Appearance
import typingsSlinky.reactToastNotifications.anon.Toast
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("react-toast-notifications", "DefaultToast")
  @js.native
  val DefaultToast: ReactComponentClass[ToastProps] = js.native
  
  @JSImport("react-toast-notifications", "DefaultToastContainer")
  @js.native
  val DefaultToastContainer: ReactComponentClass[ToastContainerProps] = js.native
  
  @JSImport("react-toast-notifications", "ToastConsumer")
  @js.native
  val ToastConsumer: ReactComponentClass[ToastConsumerProps] = js.native
  
  @JSImport("react-toast-notifications", "ToastProvider")
  @js.native
  val ToastProvider: ReactComponentClass[ToastProviderProps] = js.native
  
  @JSImport("react-toast-notifications", "useToasts")
  @js.native
  def useToasts(): typingsSlinky.reactToastNotifications.anon.AddToast = js.native
  
  @JSImport("react-toast-notifications", "withToastManager")
  @js.native
  def withToastManager(args: js.Any*): js.Any = js.native
  
  type AddToast = js.Function3[
    /* content */ ReactElement, 
    /* options */ js.UndefOr[Options], 
    /* callback */ js.UndefOr[js.Function1[/* id */ String, Unit]], 
    Unit
  ]
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.reactToastNotifications.reactToastNotificationsStrings.error
    - typingsSlinky.reactToastNotifications.reactToastNotificationsStrings.info
    - typingsSlinky.reactToastNotifications.reactToastNotificationsStrings.success
    - typingsSlinky.reactToastNotifications.reactToastNotificationsStrings.warning
  */
  trait AppearanceTypes extends StObject
  object AppearanceTypes {
    
    @scala.inline
    def error: typingsSlinky.reactToastNotifications.reactToastNotificationsStrings.error = "error".asInstanceOf[typingsSlinky.reactToastNotifications.reactToastNotificationsStrings.error]
    
    @scala.inline
    def info: typingsSlinky.reactToastNotifications.reactToastNotificationsStrings.info = "info".asInstanceOf[typingsSlinky.reactToastNotifications.reactToastNotificationsStrings.info]
    
    @scala.inline
    def success: typingsSlinky.reactToastNotifications.reactToastNotificationsStrings.success = "success".asInstanceOf[typingsSlinky.reactToastNotifications.reactToastNotificationsStrings.success]
    
    @scala.inline
    def warning: typingsSlinky.reactToastNotifications.reactToastNotificationsStrings.warning = "warning".asInstanceOf[typingsSlinky.reactToastNotifications.reactToastNotificationsStrings.warning]
  }
  
  @js.native
  trait Options extends StObject {
    
    var appearance: AppearanceTypes = js.native
    
    var autoDismiss: js.UndefOr[Boolean] = js.native
    
    var onDismiss: js.UndefOr[js.Function1[/* id */ String, Unit]] = js.native
  }
  object Options {
    
    @scala.inline
    def apply(appearance: AppearanceTypes): Options = {
      val __obj = js.Dynamic.literal(appearance = appearance.asInstanceOf[js.Any])
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit class OptionsMutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAppearance(value: AppearanceTypes): Self = StObject.set(x, "appearance", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAutoDismiss(value: Boolean): Self = StObject.set(x, "autoDismiss", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAutoDismissUndefined: Self = StObject.set(x, "autoDismiss", js.undefined)
      
      @scala.inline
      def setOnDismiss(value: /* id */ String => Unit): Self = StObject.set(x, "onDismiss", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnDismissUndefined: Self = StObject.set(x, "onDismiss", js.undefined)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.reactToastNotifications.reactToastNotificationsStrings.`bottom-left`
    - typingsSlinky.reactToastNotifications.reactToastNotificationsStrings.`bottom-center`
    - typingsSlinky.reactToastNotifications.reactToastNotificationsStrings.`bottom-right`
    - typingsSlinky.reactToastNotifications.reactToastNotificationsStrings.`top-left`
    - typingsSlinky.reactToastNotifications.reactToastNotificationsStrings.`top-center`
    - typingsSlinky.reactToastNotifications.reactToastNotificationsStrings.`top-right`
  */
  trait Placement extends StObject
  object Placement {
    
    @scala.inline
    def `bottom-center`: typingsSlinky.reactToastNotifications.reactToastNotificationsStrings.`bottom-center` = "bottom-center".asInstanceOf[typingsSlinky.reactToastNotifications.reactToastNotificationsStrings.`bottom-center`]
    
    @scala.inline
    def `bottom-left`: typingsSlinky.reactToastNotifications.reactToastNotificationsStrings.`bottom-left` = "bottom-left".asInstanceOf[typingsSlinky.reactToastNotifications.reactToastNotificationsStrings.`bottom-left`]
    
    @scala.inline
    def `bottom-right`: typingsSlinky.reactToastNotifications.reactToastNotificationsStrings.`bottom-right` = "bottom-right".asInstanceOf[typingsSlinky.reactToastNotifications.reactToastNotificationsStrings.`bottom-right`]
    
    @scala.inline
    def `top-center`: typingsSlinky.reactToastNotifications.reactToastNotificationsStrings.`top-center` = "top-center".asInstanceOf[typingsSlinky.reactToastNotifications.reactToastNotificationsStrings.`top-center`]
    
    @scala.inline
    def `top-left`: typingsSlinky.reactToastNotifications.reactToastNotificationsStrings.`top-left` = "top-left".asInstanceOf[typingsSlinky.reactToastNotifications.reactToastNotificationsStrings.`top-left`]
    
    @scala.inline
    def `top-right`: typingsSlinky.reactToastNotifications.reactToastNotificationsStrings.`top-right` = "top-right".asInstanceOf[typingsSlinky.reactToastNotifications.reactToastNotificationsStrings.`top-right`]
  }
  
  type RemoveAllToasts = js.Function0[Unit]
  
  type RemoveToast = js.Function2[/* id */ String, /* callback */ js.UndefOr[js.Function0[Unit]], Unit]
  
  @js.native
  trait ToastConsumerContext extends StObject {
    
    var add: AddToast = js.native
    
    var remove: RemoveToast = js.native
    
    var toasts: js.Array[Appearance] = js.native
  }
  object ToastConsumerContext {
    
    @scala.inline
    def apply(
      add: (/* content */ ReactElement, /* options */ js.UndefOr[Options], /* callback */ js.UndefOr[js.Function1[/* id */ String, Unit]]) => Unit,
      remove: (/* id */ String, /* callback */ js.UndefOr[js.Function0[Unit]]) => Unit,
      toasts: js.Array[Appearance]
    ): ToastConsumerContext = {
      val __obj = js.Dynamic.literal(add = js.Any.fromFunction3(add), remove = js.Any.fromFunction2(remove), toasts = toasts.asInstanceOf[js.Any])
      __obj.asInstanceOf[ToastConsumerContext]
    }
    
    @scala.inline
    implicit class ToastConsumerContextMutableBuilder[Self <: ToastConsumerContext] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAdd(
        value: (/* content */ ReactElement, /* options */ js.UndefOr[Options], /* callback */ js.UndefOr[js.Function1[/* id */ String, Unit]]) => Unit
      ): Self = StObject.set(x, "add", js.Any.fromFunction3(value))
      
      @scala.inline
      def setRemove(value: (/* id */ String, /* callback */ js.UndefOr[js.Function0[Unit]]) => Unit): Self = StObject.set(x, "remove", js.Any.fromFunction2(value))
      
      @scala.inline
      def setToasts(value: js.Array[Appearance]): Self = StObject.set(x, "toasts", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setToastsVarargs(value: Appearance*): Self = StObject.set(x, "toasts", js.Array(value :_*))
    }
  }
  
  @js.native
  trait ToastConsumerProps extends StObject {
    
    def children(context: ToastConsumerContext): ReactElement = js.native
  }
  object ToastConsumerProps {
    
    @scala.inline
    def apply(children: ToastConsumerContext => ReactElement): ToastConsumerProps = {
      val __obj = js.Dynamic.literal(children = js.Any.fromFunction1(children))
      __obj.asInstanceOf[ToastConsumerProps]
    }
    
    @scala.inline
    implicit class ToastConsumerPropsMutableBuilder[Self <: ToastConsumerProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setChildren(value: ToastConsumerContext => ReactElement): Self = StObject.set(x, "children", js.Any.fromFunction1(value))
    }
  }
  
  @js.native
  trait ToastContainerProps extends StObject {
    
    var children: ReactElement = js.native
    
    var hasToasts: Boolean = js.native
    
    var placement: Placement = js.native
  }
  object ToastContainerProps {
    
    @scala.inline
    def apply(hasToasts: Boolean, placement: Placement): ToastContainerProps = {
      val __obj = js.Dynamic.literal(hasToasts = hasToasts.asInstanceOf[js.Any], placement = placement.asInstanceOf[js.Any])
      __obj.asInstanceOf[ToastContainerProps]
    }
    
    @scala.inline
    implicit class ToastContainerPropsMutableBuilder[Self <: ToastContainerProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setChildren(value: ReactElement): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      @scala.inline
      def setHasToasts(value: Boolean): Self = StObject.set(x, "hasToasts", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPlacement(value: Placement): Self = StObject.set(x, "placement", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait ToastProps extends StObject {
    
    var appearance: AppearanceTypes = js.native
    
    var autoDismiss: Boolean | Double = js.native
    
    // inherited from ToastProvider
    var autoDismissTimeout: Double = js.native
    
    // inherited from ToastProvider
    var children: ReactElement = js.native
    
    var isRunning: Boolean = js.native
    
    def onDismiss(): Unit = js.native
    def onDismiss(id: String): Unit = js.native
    
    def onMouseEnter(): Unit = js.native
    
    def onMouseLeave(): Unit = js.native
    
    var placement: Placement = js.native
    
    var transitionDuration: Double = js.native
    
    // inherited from ToastProvider
    var transitionState: TransitionState = js.native
  }
  
  @js.native
  trait ToastProviderProps extends StObject {
    
    var autoDismiss: js.UndefOr[Boolean | Double] = js.native
    
    var autoDismissTimeout: js.UndefOr[Double] = js.native
    
    var children: ReactElement = js.native
    
    var components: js.UndefOr[Toast] = js.native
    
    var placement: js.UndefOr[Placement] = js.native
    
    var transitionDuration: js.UndefOr[Double] = js.native
  }
  object ToastProviderProps {
    
    @scala.inline
    def apply(): ToastProviderProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ToastProviderProps]
    }
    
    @scala.inline
    implicit class ToastProviderPropsMutableBuilder[Self <: ToastProviderProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAutoDismiss(value: Boolean | Double): Self = StObject.set(x, "autoDismiss", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAutoDismissTimeout(value: Double): Self = StObject.set(x, "autoDismissTimeout", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAutoDismissTimeoutUndefined: Self = StObject.set(x, "autoDismissTimeout", js.undefined)
      
      @scala.inline
      def setAutoDismissUndefined: Self = StObject.set(x, "autoDismiss", js.undefined)
      
      @scala.inline
      def setChildren(value: ReactElement): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      @scala.inline
      def setComponents(value: Toast): Self = StObject.set(x, "components", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setComponentsUndefined: Self = StObject.set(x, "components", js.undefined)
      
      @scala.inline
      def setPlacement(value: Placement): Self = StObject.set(x, "placement", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPlacementUndefined: Self = StObject.set(x, "placement", js.undefined)
      
      @scala.inline
      def setTransitionDuration(value: Double): Self = StObject.set(x, "transitionDuration", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTransitionDurationUndefined: Self = StObject.set(x, "transitionDuration", js.undefined)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.reactToastNotifications.reactToastNotificationsStrings.entering
    - typingsSlinky.reactToastNotifications.reactToastNotificationsStrings.entered
    - typingsSlinky.reactToastNotifications.reactToastNotificationsStrings.exiting
    - typingsSlinky.reactToastNotifications.reactToastNotificationsStrings.exited
  */
  trait TransitionState extends StObject
  object TransitionState {
    
    @scala.inline
    def entered: typingsSlinky.reactToastNotifications.reactToastNotificationsStrings.entered = "entered".asInstanceOf[typingsSlinky.reactToastNotifications.reactToastNotificationsStrings.entered]
    
    @scala.inline
    def entering: typingsSlinky.reactToastNotifications.reactToastNotificationsStrings.entering = "entering".asInstanceOf[typingsSlinky.reactToastNotifications.reactToastNotificationsStrings.entering]
    
    @scala.inline
    def exited: typingsSlinky.reactToastNotifications.reactToastNotificationsStrings.exited = "exited".asInstanceOf[typingsSlinky.reactToastNotifications.reactToastNotificationsStrings.exited]
    
    @scala.inline
    def exiting: typingsSlinky.reactToastNotifications.reactToastNotificationsStrings.exiting = "exiting".asInstanceOf[typingsSlinky.reactToastNotifications.reactToastNotificationsStrings.exiting]
  }
  
  @js.native
  trait UpdateOptions extends Options {
    
    var content: js.UndefOr[String] = js.native
  }
  object UpdateOptions {
    
    @scala.inline
    def apply(appearance: AppearanceTypes): UpdateOptions = {
      val __obj = js.Dynamic.literal(appearance = appearance.asInstanceOf[js.Any])
      __obj.asInstanceOf[UpdateOptions]
    }
    
    @scala.inline
    implicit class UpdateOptionsMutableBuilder[Self <: UpdateOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setContent(value: String): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContentUndefined: Self = StObject.set(x, "content", js.undefined)
    }
  }
  
  type UpdateToast = js.Function3[
    /* id */ String, 
    /* options */ js.UndefOr[Options], 
    /* callback */ js.UndefOr[js.Function1[/* id */ String, Unit]], 
    Unit
  ]
}
