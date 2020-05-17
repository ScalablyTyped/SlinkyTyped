package typingsSlinky.csstype.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - TLength
  - java.lang.String
  - scala.Double
*/
trait Dasharray[TLength] extends StrokeDasharrayProperty[TLength]

object Dasharray {
  @scala.inline
  implicit def apply[TLength](value: Double): Dasharray[TLength] = value.asInstanceOf[Dasharray[TLength]]
  @scala.inline
  implicit def apply[TLength](value: String): Dasharray[TLength] = value.asInstanceOf[Dasharray[TLength]]
  @scala.inline
  implicit def apply[TLength](value: TLength): Dasharray[TLength] = value.asInstanceOf[Dasharray[TLength]]
}

