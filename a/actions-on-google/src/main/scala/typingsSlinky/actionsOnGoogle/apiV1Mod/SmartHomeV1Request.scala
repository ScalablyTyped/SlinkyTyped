package typingsSlinky.actionsOnGoogle.apiV1Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.actionsOnGoogle.apiV1Mod.SmartHomeV1SyncRequest
  - typingsSlinky.actionsOnGoogle.apiV1Mod.SmartHomeV1QueryRequest
  - typingsSlinky.actionsOnGoogle.apiV1Mod.SmartHomeV1ExecuteRequest
  - typingsSlinky.actionsOnGoogle.apiV1Mod.SmartHomeV1DisconnectRequest
*/
trait SmartHomeV1Request extends js.Object

object SmartHomeV1Request {
  @scala.inline
  implicit def apply(value: SmartHomeV1DisconnectRequest): SmartHomeV1Request = value.asInstanceOf[SmartHomeV1Request]
  @scala.inline
  implicit def apply(value: SmartHomeV1ExecuteRequest): SmartHomeV1Request = value.asInstanceOf[SmartHomeV1Request]
  @scala.inline
  implicit def apply(value: SmartHomeV1QueryRequest): SmartHomeV1Request = value.asInstanceOf[SmartHomeV1Request]
  @scala.inline
  implicit def apply(value: SmartHomeV1SyncRequest): SmartHomeV1Request = value.asInstanceOf[SmartHomeV1Request]
}

