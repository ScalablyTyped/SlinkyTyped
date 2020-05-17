package typingsSlinky.ethers.typesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - java.lang.String
  - js.Array[java.lang.String]
  - typingsSlinky.ethers.typesMod.Filter
*/
trait EventType extends js.Object

object EventType {
  @scala.inline
  implicit def apply(value: js.Array[String]): EventType = value.asInstanceOf[EventType]
  @scala.inline
  implicit def apply(value: Filter): EventType = value.asInstanceOf[EventType]
  @scala.inline
  implicit def apply(value: String): EventType = value.asInstanceOf[EventType]
}

