package typingsSlinky.forgeApis.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.forgeApis.mod.AuthClientTwoLegged
  - typingsSlinky.forgeApis.mod.AuthClientThreeLegged
*/
trait AuthClient extends js.Object

object AuthClient {
  @scala.inline
  implicit def apply(value: AuthClientThreeLegged): AuthClient = value.asInstanceOf[AuthClient]
  @scala.inline
  implicit def apply(value: AuthClientTwoLegged): AuthClient = value.asInstanceOf[AuthClient]
}

