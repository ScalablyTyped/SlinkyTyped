package typingsSlinky.reactBootstrapTypeahead.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.reactBootstrapTypeahead.mod.StringPropertyNames[T]
  - js.Function1[/ * option * / T, java.lang.String]
*/
trait TypeaheadLabelKey[T /* <: TypeaheadModel */] extends js.Object

object TypeaheadLabelKey {
  @scala.inline
  implicit def apply[T](value: js.Function1[/* option */ T, String]): TypeaheadLabelKey[T] = value.asInstanceOf[TypeaheadLabelKey[T]]
  @scala.inline
  implicit def apply[T](value: StringPropertyNames[T]): TypeaheadLabelKey[T] = value.asInstanceOf[TypeaheadLabelKey[T]]
}

