package typingsSlinky.rxjsDashCompat.rxjsDashCompatMod

import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable2
import typingsSlinky.std.NotificationOptions
import typingsSlinky.std.NotificationPermission
import typingsSlinky.std.NotificationPermissionCallback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rxjs-compat", "Notification")
@js.native
object Notification
  extends Instantiable1[/* title */ String, typingsSlinky.std.Notification]
     with Instantiable2[
      /* title */ String, 
      /* options */ NotificationOptions, 
      typingsSlinky.std.Notification
    ] {
  val maxActions: Double = js.native
  val permission: NotificationPermission = js.native
  def requestPermission(): js.Promise[NotificationPermission] = js.native
  def requestPermission(deprecatedCallback: NotificationPermissionCallback): js.Promise[NotificationPermission] = js.native
}

