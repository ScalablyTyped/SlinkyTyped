package typingsSlinky.fastCsv.tokenMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.fastCsv.tokenMod.Token
  - scala.Null
*/
trait MaybeToken extends js.Object

object MaybeToken {
  @scala.inline
  implicit def apply(value: Null): MaybeToken = value.asInstanceOf[MaybeToken]
  @scala.inline
  implicit def apply(value: Token): MaybeToken = value.asInstanceOf[MaybeToken]
}

