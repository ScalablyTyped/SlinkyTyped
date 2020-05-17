package typingsSlinky.moment.mod.unitOfTime

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.moment.mod.unitOfTime.Base
  - typingsSlinky.moment.mod.unitOfTime.quarter
  - typingsSlinky.moment.mod.unitOfTime.isoWeek
  - typingsSlinky.moment.mod.unitOfTime.date
  - scala.Unit
*/
trait StartOf extends js.Object

object StartOf {
  @scala.inline
  implicit def apply(value: Base): StartOf = value.asInstanceOf[StartOf]
  @scala.inline
  implicit def apply(value: Unit): StartOf = value.asInstanceOf[StartOf]
  @scala.inline
  implicit def apply(value: date): StartOf = value.asInstanceOf[StartOf]
  @scala.inline
  implicit def apply(value: isoWeek): StartOf = value.asInstanceOf[StartOf]
  @scala.inline
  implicit def apply(value: quarter): StartOf = value.asInstanceOf[StartOf]
}

