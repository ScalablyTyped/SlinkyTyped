package typingsSlinky.rxjs

import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable2
import org.scalajs.dom.experimental.NotificationOptions
import typingsSlinky.std.NotificationPermission
import typingsSlinky.std.NotificationPermissionCallback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rxjs/Notification", JSImport.Namespace)
@js.native
object notificationMod extends js.Object {
  @js.native
  class NotificationCls protected ()
    extends typingsSlinky.rxjsDashCompat.notificationMod.NotificationCls {
    def this(title: String) = this()
    def this(title: String, options: NotificationOptions) = this()
  }
  
  @js.native
  object Notification
    extends Instantiable1[/* title */ String, typingsSlinky.std.Notification]
       with Instantiable2[
          /* title */ String, 
          /* options */ typingsSlinky.std.NotificationOptions, 
          typingsSlinky.std.Notification
        ] {
    val maxActions: Double = js.native
    val permission: NotificationPermission = js.native
    def requestPermission(): js.Promise[NotificationPermission] = js.native
    def requestPermission(deprecatedCallback: NotificationPermissionCallback): js.Promise[NotificationPermission] = js.native
  }
  
}

