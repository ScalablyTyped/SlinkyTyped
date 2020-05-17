package typingsSlinky.i18nJs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - java.lang.String
  - js.Array[java.lang.String]
*/
trait Scope extends js.Object

object Scope {
  @scala.inline
  implicit def apply(value: js.Array[String]): Scope = value.asInstanceOf[Scope]
  @scala.inline
  implicit def apply(value: String): Scope = value.asInstanceOf[Scope]
}

