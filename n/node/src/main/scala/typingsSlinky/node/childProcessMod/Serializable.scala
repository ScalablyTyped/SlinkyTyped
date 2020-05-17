package typingsSlinky.node.childProcessMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - java.lang.String
  - js.Object
  - scala.Double
  - scala.Boolean
*/
trait Serializable extends js.Object

object Serializable {
  @scala.inline
  implicit def apply(value: Boolean): Serializable = value.asInstanceOf[Serializable]
  @scala.inline
  implicit def apply(value: Double): Serializable = value.asInstanceOf[Serializable]
  @scala.inline
  implicit def apply(value: js.Object): Serializable = value.asInstanceOf[Serializable]
  @scala.inline
  implicit def apply(value: String): Serializable = value.asInstanceOf[Serializable]
}

