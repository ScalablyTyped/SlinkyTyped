package typingsSlinky.reactNotificationSystemRedux

import slinky.core.ReactComponentClass
import typingsSlinky.react.mod.Component
import typingsSlinky.reactNotificationSystem.mod.Attributes
import typingsSlinky.reactNotificationSystem.mod.Notification
import typingsSlinky.redux.mod.Action
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("react-notification-system-redux", JSImport.Namespace)
  @js.native
  class ^ ()
    extends Component[NotificationsProps, js.Object, js.Any]
  
  @JSImport("react-notification-system-redux", "error")
  @js.native
  val error: NotificationShow = js.native
  
  @JSImport("react-notification-system-redux", "hide")
  @js.native
  def hide(): Action[_] = js.native
  @JSImport("react-notification-system-redux", "hide")
  @js.native
  def hide(opts: String): Action[_] = js.native
  @JSImport("react-notification-system-redux", "hide")
  @js.native
  def hide(opts: Double): Action[_] = js.native
  @JSImport("react-notification-system-redux", "hide")
  @js.native
  def hide(opts: Notification): Action[_] = js.native
  
  @JSImport("react-notification-system-redux", "info")
  @js.native
  val info: NotificationShow = js.native
  
  @JSImport("react-notification-system-redux", "reducer")
  @js.native
  val reducer: NotificationsReducer[js.Any] = js.native
  
  @JSImport("react-notification-system-redux", "removeAll")
  @js.native
  def removeAll(): Action[_] = js.native
  
  @JSImport("react-notification-system-redux", "show")
  @js.native
  def show(): Action[_] = js.native
  @JSImport("react-notification-system-redux", "show")
  @js.native
  def show(opts: js.UndefOr[scala.Nothing], level: NotificationLevel): Action[_] = js.native
  @JSImport("react-notification-system-redux", "show")
  @js.native
  def show(opts: Notification): Action[_] = js.native
  @JSImport("react-notification-system-redux", "show")
  @js.native
  def show(opts: Notification, level: NotificationLevel): Action[_] = js.native
  
  @JSImport("react-notification-system-redux", "success")
  @js.native
  val success: NotificationShow = js.native
  
  @JSImport("react-notification-system-redux", "warning")
  @js.native
  val warning: NotificationShow = js.native
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.reactNotificationSystemRedux.reactNotificationSystemReduxStrings.error
    - typingsSlinky.reactNotificationSystemRedux.reactNotificationSystemReduxStrings.warning
    - typingsSlinky.reactNotificationSystemRedux.reactNotificationSystemReduxStrings.info
    - typingsSlinky.reactNotificationSystemRedux.reactNotificationSystemReduxStrings.success
  */
  trait NotificationLevel extends StObject
  object NotificationLevel {
    
    @scala.inline
    def error: typingsSlinky.reactNotificationSystemRedux.reactNotificationSystemReduxStrings.error = "error".asInstanceOf[typingsSlinky.reactNotificationSystemRedux.reactNotificationSystemReduxStrings.error]
    
    @scala.inline
    def info: typingsSlinky.reactNotificationSystemRedux.reactNotificationSystemReduxStrings.info = "info".asInstanceOf[typingsSlinky.reactNotificationSystemRedux.reactNotificationSystemReduxStrings.info]
    
    @scala.inline
    def success: typingsSlinky.reactNotificationSystemRedux.reactNotificationSystemReduxStrings.success = "success".asInstanceOf[typingsSlinky.reactNotificationSystemRedux.reactNotificationSystemReduxStrings.success]
    
    @scala.inline
    def warning: typingsSlinky.reactNotificationSystemRedux.reactNotificationSystemReduxStrings.warning = "warning".asInstanceOf[typingsSlinky.reactNotificationSystemRedux.reactNotificationSystemReduxStrings.warning]
  }
  
  type NotificationShow = js.Function1[/* opts */ js.UndefOr[Notification], Action[js.Any]]
  
  type Notifications = ReactComponentClass[NotificationsProps]
  
  @js.native
  trait NotificationsProps extends Attributes {
    
    var notifications: js.UndefOr[js.Array[Notification]] = js.native
  }
  object NotificationsProps {
    
    @scala.inline
    def apply(): NotificationsProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[NotificationsProps]
    }
    
    @scala.inline
    implicit class NotificationsPropsMutableBuilder[Self <: NotificationsProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setNotifications(value: js.Array[Notification]): Self = StObject.set(x, "notifications", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNotificationsUndefined: Self = StObject.set(x, "notifications", js.undefined)
      
      @scala.inline
      def setNotificationsVarargs(value: Notification*): Self = StObject.set(x, "notifications", js.Array(value :_*))
    }
  }
  
  type NotificationsReducer[A /* <: Action[_] */] = js.Function2[/* state */ NotificationsState, /* action */ A, NotificationsState]
  
  type NotificationsState = js.Array[Notification]
}
