package typingsSlinky.hapiHapi.mod.Json

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * @see {@link https://developer.mozilla.org/en/docs/Web/JavaScript/Reference/Global_Objects/JSON/stringify#The_replacer_parameter}
  */
/* Rewritten from type alias, can be one of: 
  - js.Function2[/ * key * / java.lang.String, / * value * / js.Any, js.Any]
  - js.Array[java.lang.String | scala.Double]
  - js.UndefOr[scala.Nothing]
*/
trait StringifyReplacer extends js.Object

object StringifyReplacer {
  @scala.inline
  implicit def apply(value: js.Array[String | Double]): StringifyReplacer = value.asInstanceOf[StringifyReplacer]
  @scala.inline
  implicit def apply(value: js.Function2[/* key */ String, /* value */ js.Any, js.Any]): StringifyReplacer = value.asInstanceOf[StringifyReplacer]
  @scala.inline
  implicit def fromUndef[T](value: js.UndefOr[T])(implicit ev: T => StringifyReplacer): StringifyReplacer = value.asInstanceOf[StringifyReplacer]
}

