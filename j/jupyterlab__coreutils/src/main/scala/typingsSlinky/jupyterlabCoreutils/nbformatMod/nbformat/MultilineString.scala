package typingsSlinky.jupyterlabCoreutils.nbformatMod.nbformat

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A multiline string.
  */
/* Rewritten from type alias, can be one of: 
  - java.lang.String
  - js.Array[java.lang.String]
*/
trait MultilineString extends js.Object

object MultilineString {
  @scala.inline
  implicit def apply(value: js.Array[String]): MultilineString = value.asInstanceOf[MultilineString]
  @scala.inline
  implicit def apply(value: String): MultilineString = value.asInstanceOf[MultilineString]
}

