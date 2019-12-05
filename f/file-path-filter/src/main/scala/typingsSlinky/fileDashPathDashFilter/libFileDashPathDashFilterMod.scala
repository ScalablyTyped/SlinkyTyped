package typingsSlinky.fileDashPathDashFilter

import typingsSlinky.fileDashPathDashFilter.libTypesMod.AnyFilter
import typingsSlinky.fileDashPathDashFilter.libTypesMod.FilterCriteria
import typingsSlinky.fileDashPathDashFilter.libTypesMod.FilterCriterion
import typingsSlinky.fileDashPathDashFilter.libTypesMod.FilterFunction
import typingsSlinky.fileDashPathDashFilter.libTypesMod.Filters
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("file-path-filter/lib/file-path-filter", JSImport.Namespace)
@js.native
object libFileDashPathDashFilterMod extends js.Object {
  def filePathFilter(criteria: FilterCriterion*): FilterFunction = js.native
  def filePathFilter(criteria: AnyFilter): FilterFunction = js.native
  def filePathFilter(filters: Filters[FilterCriteria]): FilterFunction = js.native
}

