package typingsSlinky.keycloakJs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// export interface KeycloakUserInfo {}
/**
	 * Conditional CompatPromise type in order to support
	 * both legacy promises and native promises as return types.
	 */
/* Rewritten from type alias, can be one of: 
  - typingsSlinky.keycloakJs.mod.KeycloakPromiseType
  - js.UndefOr[scala.Nothing]
*/
trait PromiseType extends js.Object

object PromiseType {
  @scala.inline
  implicit def apply(value: KeycloakPromiseType): PromiseType = value.asInstanceOf[PromiseType]
  @scala.inline
  implicit def fromUndef[T](value: js.UndefOr[T])(implicit ev: T => PromiseType): PromiseType = value.asInstanceOf[PromiseType]
}

