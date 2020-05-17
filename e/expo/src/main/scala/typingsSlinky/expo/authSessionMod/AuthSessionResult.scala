package typingsSlinky.expo.authSessionMod

import typingsSlinky.expo.anon.ErrorCode
import typingsSlinky.expo.anon.Type
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.expo.anon.Type
  - typingsSlinky.expo.anon.ErrorCode
*/
trait AuthSessionResult extends js.Object

object AuthSessionResult {
  @scala.inline
  implicit def apply(value: ErrorCode): AuthSessionResult = value.asInstanceOf[AuthSessionResult]
  @scala.inline
  implicit def apply(value: Type): AuthSessionResult = value.asInstanceOf[AuthSessionResult]
}

