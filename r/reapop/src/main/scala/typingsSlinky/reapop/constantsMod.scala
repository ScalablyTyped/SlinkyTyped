package typingsSlinky.reapop

import typingsSlinky.reapop.anon.PartialNotification
import typingsSlinky.reapop.reapopStrings.`bottom-center`
import typingsSlinky.reapop.reapopStrings.`bottom-left`
import typingsSlinky.reapop.reapopStrings.`bottom-right`
import typingsSlinky.reapop.reapopStrings.`top-center`
import typingsSlinky.reapop.reapopStrings.`top-left`
import typingsSlinky.reapop.reapopStrings.`top-right`
import typingsSlinky.reapop.reapopStrings.error
import typingsSlinky.reapop.reapopStrings.info
import typingsSlinky.reapop.reapopStrings.loading
import typingsSlinky.reapop.reapopStrings.none
import typingsSlinky.reapop.reapopStrings.success
import typingsSlinky.reapop.reapopStrings.warning
import typingsSlinky.reapop.typesMod.NewNotification
import typingsSlinky.reapop.typesMod.Notification
import typingsSlinky.reapop.typesMod.Position
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object constantsMod {
  
  @JSImport("reapop/dist/constants", "CONFIG")
  @js.native
  val CONFIG: NotificationConfig = js.native
  
  object POSITIONS {
    
    @JSImport("reapop/dist/constants", "POSITIONS")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("reapop/dist/constants", "POSITIONS.bottomCenter")
    @js.native
    def bottomCenter: `bottom-center` = js.native
    @scala.inline
    def bottomCenter_=(x: `bottom-center`): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("bottomCenter")(x.asInstanceOf[js.Any])
    
    @JSImport("reapop/dist/constants", "POSITIONS.bottomLeft")
    @js.native
    def bottomLeft: `bottom-left` = js.native
    @scala.inline
    def bottomLeft_=(x: `bottom-left`): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("bottomLeft")(x.asInstanceOf[js.Any])
    
    @JSImport("reapop/dist/constants", "POSITIONS.bottomRight")
    @js.native
    def bottomRight: `bottom-right` = js.native
    @scala.inline
    def bottomRight_=(x: `bottom-right`): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("bottomRight")(x.asInstanceOf[js.Any])
    
    @JSImport("reapop/dist/constants", "POSITIONS.topCenter")
    @js.native
    def topCenter: `top-center` = js.native
    @scala.inline
    def topCenter_=(x: `top-center`): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("topCenter")(x.asInstanceOf[js.Any])
    
    @JSImport("reapop/dist/constants", "POSITIONS.topLeft")
    @js.native
    def topLeft: `top-left` = js.native
    @scala.inline
    def topLeft_=(x: `top-left`): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("topLeft")(x.asInstanceOf[js.Any])
    
    @JSImport("reapop/dist/constants", "POSITIONS.topRight")
    @js.native
    def topRight: `top-right` = js.native
    @scala.inline
    def topRight_=(x: `top-right`): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("topRight")(x.asInstanceOf[js.Any])
  }
  
  object STATUSES {
    
    @JSImport("reapop/dist/constants", "STATUSES")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("reapop/dist/constants", "STATUSES.error")
    @js.native
    def error: typingsSlinky.reapop.reapopStrings.error = js.native
    @scala.inline
    def error_=(x: error): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("error")(x.asInstanceOf[js.Any])
    
    @JSImport("reapop/dist/constants", "STATUSES.info")
    @js.native
    def info: typingsSlinky.reapop.reapopStrings.info = js.native
    @scala.inline
    def info_=(x: info): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("info")(x.asInstanceOf[js.Any])
    
    @JSImport("reapop/dist/constants", "STATUSES.loading")
    @js.native
    def loading: typingsSlinky.reapop.reapopStrings.loading = js.native
    @scala.inline
    def loading_=(x: loading): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("loading")(x.asInstanceOf[js.Any])
    
    @JSImport("reapop/dist/constants", "STATUSES.none")
    @js.native
    def none: typingsSlinky.reapop.reapopStrings.none = js.native
    @scala.inline
    def none_=(x: none): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("none")(x.asInstanceOf[js.Any])
    
    @JSImport("reapop/dist/constants", "STATUSES.success")
    @js.native
    def success: typingsSlinky.reapop.reapopStrings.success = js.native
    @scala.inline
    def success_=(x: success): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("success")(x.asInstanceOf[js.Any])
    
    @JSImport("reapop/dist/constants", "STATUSES.warning")
    @js.native
    def warning: typingsSlinky.reapop.reapopStrings.warning = js.native
    @scala.inline
    def warning_=(x: warning): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("warning")(x.asInstanceOf[js.Any])
  }
  
  object classnames {
    
    @JSImport("reapop/dist/constants", "classnames")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("reapop/dist/constants", "classnames.container")
    @js.native
    def container(position: Position, singleContainer: Boolean): js.Array[String] = js.native
    
    @JSImport("reapop/dist/constants", "classnames.notification")
    @js.native
    def notification(notification: Notification): js.Array[String] = js.native
    
    @JSImport("reapop/dist/constants", "classnames.notificationButton")
    @js.native
    def notificationButton: String = js.native
    
    @JSImport("reapop/dist/constants", "classnames.notificationButtonText")
    @js.native
    def notificationButtonText: String = js.native
    @scala.inline
    def notificationButtonText_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("notificationButtonText")(x.asInstanceOf[js.Any])
    
    @scala.inline
    def notificationButton_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("notificationButton")(x.asInstanceOf[js.Any])
    
    @JSImport("reapop/dist/constants", "classnames.notificationButtons")
    @js.native
    def notificationButtons: String = js.native
    @scala.inline
    def notificationButtons_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("notificationButtons")(x.asInstanceOf[js.Any])
    
    @JSImport("reapop/dist/constants", "classnames.notificationDismissIcon")
    @js.native
    def notificationDismissIcon: String = js.native
    @scala.inline
    def notificationDismissIcon_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("notificationDismissIcon")(x.asInstanceOf[js.Any])
    
    @JSImport("reapop/dist/constants", "classnames.notificationIcon")
    @js.native
    def notificationIcon: String = js.native
    @scala.inline
    def notificationIcon_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("notificationIcon")(x.asInstanceOf[js.Any])
    
    @JSImport("reapop/dist/constants", "classnames.notificationImage")
    @js.native
    def notificationImage: String = js.native
    
    @JSImport("reapop/dist/constants", "classnames.notificationImageContainer")
    @js.native
    def notificationImageContainer: String = js.native
    @scala.inline
    def notificationImageContainer_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("notificationImageContainer")(x.asInstanceOf[js.Any])
    
    @scala.inline
    def notificationImage_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("notificationImage")(x.asInstanceOf[js.Any])
    
    @JSImport("reapop/dist/constants", "classnames.notificationMessage")
    @js.native
    def notificationMessage: String = js.native
    @scala.inline
    def notificationMessage_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("notificationMessage")(x.asInstanceOf[js.Any])
    
    @JSImport("reapop/dist/constants", "classnames.notificationMeta")
    @js.native
    def notificationMeta: String = js.native
    @scala.inline
    def notificationMeta_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("notificationMeta")(x.asInstanceOf[js.Any])
    
    @JSImport("reapop/dist/constants", "classnames.notificationTitle")
    @js.native
    def notificationTitle: String = js.native
    @scala.inline
    def notificationTitle_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("notificationTitle")(x.asInstanceOf[js.Any])
  }
  
  @js.native
  trait NotificationConfig extends StObject {
    
    var customizeNotification: (js.Function1[/* notification */ NewNotification, Unit]) | Null = js.native
    
    var defaultProps: PartialNotification = js.native
    
    var generateId: (js.Function1[/* notification */ NewNotification, String]) | Null = js.native
  }
  object NotificationConfig {
    
    @scala.inline
    def apply(defaultProps: PartialNotification): NotificationConfig = {
      val __obj = js.Dynamic.literal(defaultProps = defaultProps.asInstanceOf[js.Any])
      __obj.asInstanceOf[NotificationConfig]
    }
    
    @scala.inline
    implicit class NotificationConfigMutableBuilder[Self <: NotificationConfig] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCustomizeNotification(value: /* notification */ NewNotification => Unit): Self = StObject.set(x, "customizeNotification", js.Any.fromFunction1(value))
      
      @scala.inline
      def setCustomizeNotificationNull: Self = StObject.set(x, "customizeNotification", null)
      
      @scala.inline
      def setDefaultProps(value: PartialNotification): Self = StObject.set(x, "defaultProps", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGenerateId(value: /* notification */ NewNotification => String): Self = StObject.set(x, "generateId", js.Any.fromFunction1(value))
      
      @scala.inline
      def setGenerateIdNull: Self = StObject.set(x, "generateId", null)
    }
  }
}
