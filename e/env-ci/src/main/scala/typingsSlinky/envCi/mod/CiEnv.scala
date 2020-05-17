package typingsSlinky.envCi.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.envCi.mod.NonCiEnv
  - typingsSlinky.envCi.mod.KnownCiEnv
*/
trait CiEnv extends js.Object

object CiEnv {
  @scala.inline
  implicit def apply(value: KnownCiEnv): CiEnv = value.asInstanceOf[CiEnv]
  @scala.inline
  implicit def apply(value: NonCiEnv): CiEnv = value.asInstanceOf[CiEnv]
}

