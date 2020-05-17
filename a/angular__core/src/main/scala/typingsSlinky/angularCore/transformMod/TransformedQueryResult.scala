package typingsSlinky.angularCore.transformMod

import typingsSlinky.angularCore.anon.FailureMessage
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - scala.Null
  - typingsSlinky.angularCore.anon.FailureMessage
*/
trait TransformedQueryResult extends js.Object

object TransformedQueryResult {
  @scala.inline
  implicit def apply(value: FailureMessage): TransformedQueryResult = value.asInstanceOf[TransformedQueryResult]
  @scala.inline
  implicit def apply(value: Null): TransformedQueryResult = value.asInstanceOf[TransformedQueryResult]
}

