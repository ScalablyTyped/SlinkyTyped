package typingsSlinky.filePathFilter

import typingsSlinky.filePathFilter.typesMod.AnyFilter
import typingsSlinky.filePathFilter.typesMod.FilterCriteria
import typingsSlinky.filePathFilter.typesMod.FilterCriterion
import typingsSlinky.filePathFilter.typesMod.FilterFunction
import typingsSlinky.filePathFilter.typesMod.Filters
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("file-path-filter/lib/file-path-filter", JSImport.Namespace)
@js.native
object filePathFilterMod extends js.Object {
  def filePathFilter(criteria: FilterCriterion*): FilterFunction = js.native
  def filePathFilter(criteria: AnyFilter): FilterFunction = js.native
  def filePathFilter(filters: Filters[FilterCriteria]): FilterFunction = js.native
}

