package typingsSlinky.hapi.mod

import typingsSlinky.podium.mod.Podium
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - java.lang.String
  - typingsSlinky.hapi.mod.ServerEventsApplicationObject
  - typingsSlinky.podium.mod.Podium
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

