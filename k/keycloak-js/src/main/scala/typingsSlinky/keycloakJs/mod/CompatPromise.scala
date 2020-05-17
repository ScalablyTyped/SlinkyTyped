package typingsSlinky.keycloakJs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.keycloakJs.mod.KeycloakPromise[TSuccess, TError]
  - js.Promise[TSuccess]
*/
trait CompatPromise[TPromiseType /* <: PromiseType */, TSuccess, TError] extends js.Object

object CompatPromise {
  @scala.inline
  implicit def apply[TPromiseType, TSuccess, TError](value: KeycloakPromise[TSuccess, TError]): CompatPromise[TPromiseType, TSuccess, TError] = value.asInstanceOf[CompatPromise[TPromiseType, TSuccess, TError]]
  @scala.inline
  implicit def apply[TPromiseType, TSuccess, TError](value: js.Promise[TSuccess]): CompatPromise[TPromiseType, TSuccess, TError] = value.asInstanceOf[CompatPromise[TPromiseType, TSuccess, TError]]
}

