package typingsSlinky.gulpSequence.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - java.lang.String
  - js.Array[java.lang.String]
*/
trait Step extends js.Object

object Step {
  @scala.inline
  implicit def apply(value: js.Array[String]): Step = value.asInstanceOf[Step]
  @scala.inline
  implicit def apply(value: String): Step = value.asInstanceOf[Step]
}

