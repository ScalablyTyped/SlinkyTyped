package typingsSlinky.rcFieldForm.valueUtilMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - java.lang.String
  - scala.Double
  - js.Object
*/
trait SimilarObject extends js.Object

object SimilarObject {
  @scala.inline
  implicit def apply(value: Double): SimilarObject = value.asInstanceOf[SimilarObject]
  @scala.inline
  implicit def apply(value: js.Object): SimilarObject = value.asInstanceOf[SimilarObject]
  @scala.inline
  implicit def apply(value: String): SimilarObject = value.asInstanceOf[SimilarObject]
}

