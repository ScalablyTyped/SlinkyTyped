package typingsSlinky.carbonComponents.componentsMod

import typingsSlinky.carbonComponents.anon.EventAfterDeleteNotification
import typingsSlinky.carbonComponents.notificationMod.default
import typingsSlinky.std.WeakMap
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("carbon-components/globals/js/components", "Notification")
@js.native
class Notification protected () extends default {
  def this(element: js.Any, options: js.Any) = this()
}

/* static members */
@JSImport("carbon-components/globals/js/components", "Notification")
@js.native
object Notification extends js.Object {
  var components: WeakMap[js.Object, _] = js.native
  var options: EventAfterDeleteNotification = js.native
}

