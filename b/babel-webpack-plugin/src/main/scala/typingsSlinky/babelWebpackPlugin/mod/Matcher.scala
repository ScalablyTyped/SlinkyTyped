package typingsSlinky.babelWebpackPlugin.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.std.RegExp
  - java.lang.String
  - js.Array[typingsSlinky.std.RegExp | java.lang.String]
*/
trait Matcher extends js.Object

object Matcher {
  @scala.inline
  implicit def apply(value: js.Array[js.RegExp | String]): Matcher = value.asInstanceOf[Matcher]
  @scala.inline
  implicit def apply(value: js.RegExp): Matcher = value.asInstanceOf[Matcher]
  @scala.inline
  implicit def apply(value: String): Matcher = value.asInstanceOf[Matcher]
}

