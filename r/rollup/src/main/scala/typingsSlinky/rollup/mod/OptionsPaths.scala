package typingsSlinky.rollup.mod

import typingsSlinky.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.std.Record[java.lang.String, java.lang.String]
  - js.Function1[/ * id * / java.lang.String, java.lang.String]
*/
trait OptionsPaths extends js.Object

object OptionsPaths {
  @scala.inline
  implicit def apply(value: js.Function1[/* id */ String, String]): OptionsPaths = value.asInstanceOf[OptionsPaths]
  @scala.inline
  implicit def apply(value: Record[String, String]): OptionsPaths = value.asInstanceOf[OptionsPaths]
}

