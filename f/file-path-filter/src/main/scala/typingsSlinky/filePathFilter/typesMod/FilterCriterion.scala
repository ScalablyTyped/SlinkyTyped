package typingsSlinky.filePathFilter.typesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - scala.Boolean
  - java.lang.String
  - typingsSlinky.std.RegExp
  - typingsSlinky.filePathFilter.typesMod.FilterFunction
*/
trait FilterCriterion extends FilterCriteria

object FilterCriterion {
  @scala.inline
  implicit def apply(value: Boolean): FilterCriterion = value.asInstanceOf[FilterCriterion]
  @scala.inline
  implicit def apply(value: FilterFunction): FilterCriterion = value.asInstanceOf[FilterCriterion]
  @scala.inline
  implicit def apply(value: js.RegExp): FilterCriterion = value.asInstanceOf[FilterCriterion]
  @scala.inline
  implicit def apply(value: String): FilterCriterion = value.asInstanceOf[FilterCriterion]
}

