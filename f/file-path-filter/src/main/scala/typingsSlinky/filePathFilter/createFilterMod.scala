package typingsSlinky.filePathFilter

import typingsSlinky.filePathFilter.typesMod.AnyFilter
import typingsSlinky.filePathFilter.typesMod.FilterCriteria
import typingsSlinky.filePathFilter.typesMod.FilterCriterion
import typingsSlinky.filePathFilter.typesMod.FilterFunction
import typingsSlinky.filePathFilter.typesMod.Filters
import typingsSlinky.filePathFilter.typesMod.Options
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("file-path-filter/lib/create-filter", JSImport.Namespace)
@js.native
object createFilterMod extends js.Object {
  def createFilter(options: Options, criteria: FilterCriterion*): FilterFunction = js.native
  def createFilter(options: Options, criteria: AnyFilter): FilterFunction = js.native
  def createFilter(options: Options, filters: Filters[FilterCriteria]): FilterFunction = js.native
}

