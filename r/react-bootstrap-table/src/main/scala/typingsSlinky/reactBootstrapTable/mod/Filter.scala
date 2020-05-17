package typingsSlinky.reactBootstrapTable.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.reactBootstrapTable.mod.TextFilter
  - typingsSlinky.reactBootstrapTable.mod.SelectFilter
  - typingsSlinky.reactBootstrapTable.mod.RegexFilter
  - typingsSlinky.reactBootstrapTable.mod.NumberFilter
  - typingsSlinky.reactBootstrapTable.mod.DateFilter
  - typingsSlinky.reactBootstrapTable.mod.CustomFilter[js.Any, js.Any]
*/
trait Filter extends js.Object

object Filter {
  @scala.inline
  implicit def apply(value: CustomFilter[js.Any, js.Any]): Filter = value.asInstanceOf[Filter]
  @scala.inline
  implicit def apply(value: DateFilter): Filter = value.asInstanceOf[Filter]
  @scala.inline
  implicit def apply(value: NumberFilter): Filter = value.asInstanceOf[Filter]
  @scala.inline
  implicit def apply(value: RegexFilter): Filter = value.asInstanceOf[Filter]
  @scala.inline
  implicit def apply(value: SelectFilter): Filter = value.asInstanceOf[Filter]
  @scala.inline
  implicit def apply(value: TextFilter): Filter = value.asInstanceOf[Filter]
}

