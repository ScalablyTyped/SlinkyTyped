package typingsSlinky.objectPath.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - js.Array[scala.Double | java.lang.String]
  - scala.Double
  - java.lang.String
*/
trait Path extends js.Object

object Path {
  @scala.inline
  implicit def apply(value: js.Array[Double | String]): Path = value.asInstanceOf[Path]
  @scala.inline
  implicit def apply(value: Double): Path = value.asInstanceOf[Path]
  @scala.inline
  implicit def apply(value: String): Path = value.asInstanceOf[Path]
}

