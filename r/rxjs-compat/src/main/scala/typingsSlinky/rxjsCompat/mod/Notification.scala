package typingsSlinky.rxjsCompat.mod

import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable2
import org.scalajs.dom.experimental.NotificationOptions
import typingsSlinky.std.NotificationPermission
import typingsSlinky.std.NotificationPermissionCallback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rxjs-compat", "Notification")
@js.native
object Notification
  extends Instantiable1[/* title */ String, org.scalajs.dom.experimental.Notification]
     with Instantiable2[
      /* title */ String, 
      /* options */ NotificationOptions, 
      org.scalajs.dom.experimental.Notification
    ] {
  val maxActions: Double = js.native
  val permission: NotificationPermission = js.native
  def requestPermission(): js.Promise[NotificationPermission] = js.native
  def requestPermission(deprecatedCallback: NotificationPermissionCallback): js.Promise[NotificationPermission] = js.native
}

