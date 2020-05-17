package typingsSlinky.jestHasteMap.typesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.std.RegExp
  - js.Function1[/ * str * / java.lang.String, scala.Boolean]
*/
trait HasteRegExp extends js.Object

object HasteRegExp {
  @scala.inline
  implicit def apply(value: js.Function1[/* str */ String, Boolean]): HasteRegExp = value.asInstanceOf[HasteRegExp]
  @scala.inline
  implicit def apply(value: js.RegExp): HasteRegExp = value.asInstanceOf[HasteRegExp]
}

