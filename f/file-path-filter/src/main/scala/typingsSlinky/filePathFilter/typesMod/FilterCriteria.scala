package typingsSlinky.filePathFilter.typesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.filePathFilter.typesMod.FilterCriterion
  - js.Array[typingsSlinky.filePathFilter.typesMod.FilterCriterion]
*/
trait FilterCriteria extends AnyFilter

object FilterCriteria {
  @scala.inline
  implicit def apply(value: js.Array[FilterCriterion]): FilterCriteria = value.asInstanceOf[FilterCriteria]
  @scala.inline
  implicit def apply(value: FilterCriterion): FilterCriteria = value.asInstanceOf[FilterCriteria]
}

