package typingsSlinky.reactBootstrapTable.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.reactBootstrapTable.mod.TextFilterData
  - typingsSlinky.reactBootstrapTable.mod.SelectFilterData
  - typingsSlinky.reactBootstrapTable.mod.RegexFilterData
  - typingsSlinky.reactBootstrapTable.mod.NumberFilterData
  - typingsSlinky.reactBootstrapTable.mod.DateFilterData
  - typingsSlinky.reactBootstrapTable.mod.ArrayFilterData
*/
trait FilterValue extends js.Object

object FilterValue {
  @scala.inline
  implicit def apply(value: ArrayFilterData): FilterValue = value.asInstanceOf[FilterValue]
  @scala.inline
  implicit def apply(value: DateFilterData): FilterValue = value.asInstanceOf[FilterValue]
  @scala.inline
  implicit def apply(value: NumberFilterData): FilterValue = value.asInstanceOf[FilterValue]
  @scala.inline
  implicit def apply(value: RegexFilterData): FilterValue = value.asInstanceOf[FilterValue]
  @scala.inline
  implicit def apply(value: SelectFilterData): FilterValue = value.asInstanceOf[FilterValue]
  @scala.inline
  implicit def apply(value: TextFilterData): FilterValue = value.asInstanceOf[FilterValue]
}

