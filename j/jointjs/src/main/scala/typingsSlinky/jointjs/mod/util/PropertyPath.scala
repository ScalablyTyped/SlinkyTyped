package typingsSlinky.jointjs.mod.util

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - java.lang.String
  - js.Array[java.lang.String]
*/
trait PropertyPath extends js.Object

object PropertyPath {
  @scala.inline
  implicit def apply(value: js.Array[String]): PropertyPath = value.asInstanceOf[PropertyPath]
  @scala.inline
  implicit def apply(value: String): PropertyPath = value.asInstanceOf[PropertyPath]
}

