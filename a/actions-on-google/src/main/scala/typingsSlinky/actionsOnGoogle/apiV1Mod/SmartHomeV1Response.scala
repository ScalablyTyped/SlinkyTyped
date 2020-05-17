package typingsSlinky.actionsOnGoogle.apiV1Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.actionsOnGoogle.apiV1Mod.SmartHomeV1SyncResponse
  - typingsSlinky.actionsOnGoogle.apiV1Mod.SmartHomeV1QueryResponse
  - typingsSlinky.actionsOnGoogle.apiV1Mod.SmartHomeV1ExecuteResponse
  - typingsSlinky.actionsOnGoogle.apiV1Mod.SmartHomeV1DisconnectResponse
*/
trait SmartHomeV1Response extends js.Object

object SmartHomeV1Response {
  @scala.inline
  implicit def apply(value: SmartHomeV1DisconnectResponse): SmartHomeV1Response = value.asInstanceOf[SmartHomeV1Response]
  @scala.inline
  implicit def apply(value: SmartHomeV1ExecuteResponse): SmartHomeV1Response = value.asInstanceOf[SmartHomeV1Response]
  @scala.inline
  implicit def apply(value: SmartHomeV1QueryResponse): SmartHomeV1Response = value.asInstanceOf[SmartHomeV1Response]
  @scala.inline
  implicit def apply(value: SmartHomeV1SyncResponse): SmartHomeV1Response = value.asInstanceOf[SmartHomeV1Response]
}

