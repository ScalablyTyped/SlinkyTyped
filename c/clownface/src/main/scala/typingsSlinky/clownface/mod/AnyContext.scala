package typingsSlinky.clownface.mod

import typingsSlinky.rdfJs.mod.Term
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.rdfJs.mod.Term
  - js.Array[typingsSlinky.rdfJs.mod.Term]
  - js.UndefOr[scala.Nothing]
*/
trait AnyContext extends js.Object

object AnyContext {
  @scala.inline
  implicit def apply(value: js.Array[Term]): AnyContext = value.asInstanceOf[AnyContext]
  @scala.inline
  implicit def apply(value: Term): AnyContext = value.asInstanceOf[AnyContext]
  @scala.inline
  implicit def fromUndef[T](value: js.UndefOr[T])(implicit ev: T => AnyContext): AnyContext = value.asInstanceOf[AnyContext]
}

