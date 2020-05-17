package typingsSlinky.rrule.typesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.std.Date
  - scala.Null
  - js.Array[typingsSlinky.std.Date]
*/
trait IterResultType[M /* <: QueryMethodTypes */] extends js.Object

object IterResultType {
  @scala.inline
  implicit def apply[M](value: js.Array[js.Date]): IterResultType[M] = value.asInstanceOf[IterResultType[M]]
  @scala.inline
  implicit def apply[M](value: js.Date): IterResultType[M] = value.asInstanceOf[IterResultType[M]]
  @scala.inline
  implicit def apply[M](value: Null): IterResultType[M] = value.asInstanceOf[IterResultType[M]]
}

