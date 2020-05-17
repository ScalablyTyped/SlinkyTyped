package typingsSlinky.n3.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.rdfJs.mod.Term
  - java.lang.String
  - scala.Null
*/
trait OTerm extends js.Object

object OTerm {
  @scala.inline
  implicit def apply(value: Null): OTerm = value.asInstanceOf[OTerm]
  @scala.inline
  implicit def apply(value: String): OTerm = value.asInstanceOf[OTerm]
  @scala.inline
  implicit def apply(value: typingsSlinky.rdfJs.mod.Term): OTerm = value.asInstanceOf[OTerm]
}

