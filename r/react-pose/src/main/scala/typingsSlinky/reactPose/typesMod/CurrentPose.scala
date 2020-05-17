package typingsSlinky.reactPose.typesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - java.lang.String
  - js.Array[java.lang.String]
*/
trait CurrentPose extends js.Object

object CurrentPose {
  @scala.inline
  implicit def apply(value: js.Array[String]): CurrentPose = value.asInstanceOf[CurrentPose]
  @scala.inline
  implicit def apply(value: String): CurrentPose = value.asInstanceOf[CurrentPose]
}

