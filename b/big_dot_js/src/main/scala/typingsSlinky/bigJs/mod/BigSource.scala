package typingsSlinky.bigJs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - scala.Double
  - java.lang.String
  - typingsSlinky.bigJs.mod.Big
*/
trait BigSource extends js.Object

object BigSource {
  @scala.inline
  implicit def apply(value: Big): BigSource = value.asInstanceOf[BigSource]
  @scala.inline
  implicit def apply(value: Double): BigSource = value.asInstanceOf[BigSource]
  @scala.inline
  implicit def apply(value: String): BigSource = value.asInstanceOf[BigSource]
}

