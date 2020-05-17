package typingsSlinky.oauth2Server.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * For returning falsey parameters in cases of failure
  */
/* Rewritten from type alias, can be one of: 
  - typingsSlinky.oauth2Server.oauth2ServerStrings._empty
  - typingsSlinky.oauth2Server.oauth2ServerNumbers.`0`
  - typingsSlinky.oauth2Server.oauth2ServerBooleans.`false`
  - scala.Null
  - js.UndefOr[scala.Nothing]
*/
trait Falsey extends js.Object

object Falsey {
  @scala.inline
  def _empty: typingsSlinky.oauth2Server.oauth2ServerStrings._empty = "".asInstanceOf[typingsSlinky.oauth2Server.oauth2ServerStrings._empty]
  @scala.inline
  def `0`: typingsSlinky.oauth2Server.oauth2ServerNumbers.`0` = 0.asInstanceOf[typingsSlinky.oauth2Server.oauth2ServerNumbers.`0`]
  @scala.inline
  def `false`: typingsSlinky.oauth2Server.oauth2ServerBooleans.`false` = false.asInstanceOf[typingsSlinky.oauth2Server.oauth2ServerBooleans.`false`]
  @scala.inline
  implicit def apply(value: Null): Falsey = value.asInstanceOf[Falsey]
  @scala.inline
  implicit def fromUndef[T](value: js.UndefOr[T])(implicit ev: T => Falsey): Falsey = value.asInstanceOf[Falsey]
}

