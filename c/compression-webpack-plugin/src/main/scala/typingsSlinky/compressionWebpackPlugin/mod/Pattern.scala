package typingsSlinky.compressionWebpackPlugin.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - java.lang.String
  - typingsSlinky.std.RegExp
  - js.Array[typingsSlinky.std.RegExp | java.lang.String]
*/
trait Pattern extends js.Object

object Pattern {
  @scala.inline
  implicit def apply(value: js.Array[js.RegExp | String]): Pattern = value.asInstanceOf[Pattern]
  @scala.inline
  implicit def apply(value: js.RegExp): Pattern = value.asInstanceOf[Pattern]
  @scala.inline
  implicit def apply(value: String): Pattern = value.asInstanceOf[Pattern]
}

