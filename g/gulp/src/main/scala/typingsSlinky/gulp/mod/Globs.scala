package typingsSlinky.gulp.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - java.lang.String
  - js.Array[java.lang.String]
*/
trait Globs extends js.Object

object Globs {
  @scala.inline
  implicit def apply(value: js.Array[String]): Globs = value.asInstanceOf[Globs]
  @scala.inline
  implicit def apply(value: String): Globs = value.asInstanceOf[Globs]
}

