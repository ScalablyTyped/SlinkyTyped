package typingsSlinky.plotlyJs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - java.lang.String
  - scala.Double
  - typingsSlinky.std.Date
  - scala.Null
*/
trait Datum extends js.Object

object Datum {
  @scala.inline
  implicit def apply(value: js.Date): Datum = value.asInstanceOf[Datum]
  @scala.inline
  implicit def apply(value: Double): Datum = value.asInstanceOf[Datum]
  @scala.inline
  implicit def apply(value: Null): Datum = value.asInstanceOf[Datum]
  @scala.inline
  implicit def apply(value: String): Datum = value.asInstanceOf[Datum]
}

