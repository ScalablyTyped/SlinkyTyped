package typingsSlinky.hapiHapi.mod

import typingsSlinky.hapiPodium.mod.Podium
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - java.lang.String
  - typingsSlinky.hapiHapi.mod.ServerEventsApplicationObject
  - typingsSlinky.hapiPodium.mod.Podium
*/
trait ServerEventsApplication extends js.Object

object ServerEventsApplication {
  @scala.inline
  implicit def apply(value: Podium): ServerEventsApplication = value.asInstanceOf[ServerEventsApplication]
  @scala.inline
  implicit def apply(value: ServerEventsApplicationObject): ServerEventsApplication = value.asInstanceOf[ServerEventsApplication]
  @scala.inline
  implicit def apply(value: String): ServerEventsApplication = value.asInstanceOf[ServerEventsApplication]
}

