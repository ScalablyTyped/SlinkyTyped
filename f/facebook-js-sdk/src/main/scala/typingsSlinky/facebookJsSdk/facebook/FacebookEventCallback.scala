package typingsSlinky.facebookJsSdk.facebook

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - js.Function1[/ * response * / typingsSlinky.facebookJsSdk.facebook.StatusResponse, scala.Unit]
  - js.Function0[scala.Unit]
*/
trait FacebookEventCallback[TEvent /* <: FacebookEventType */] extends js.Object

object FacebookEventCallback {
  @scala.inline
  implicit def apply[TEvent](value: js.Function0[Unit]): FacebookEventCallback[TEvent] = value.asInstanceOf[FacebookEventCallback[TEvent]]
  @scala.inline
  implicit def apply[TEvent](value: js.Function1[/* response */ StatusResponse, Unit]): FacebookEventCallback[TEvent] = value.asInstanceOf[FacebookEventCallback[TEvent]]
}

