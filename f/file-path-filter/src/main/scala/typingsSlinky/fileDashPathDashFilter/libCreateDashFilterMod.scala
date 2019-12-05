package typingsSlinky.fileDashPathDashFilter

import typingsSlinky.fileDashPathDashFilter.libTypesMod.AnyFilter
import typingsSlinky.fileDashPathDashFilter.libTypesMod.FilterCriteria
import typingsSlinky.fileDashPathDashFilter.libTypesMod.FilterCriterion
import typingsSlinky.fileDashPathDashFilter.libTypesMod.FilterFunction
import typingsSlinky.fileDashPathDashFilter.libTypesMod.Filters
import typingsSlinky.fileDashPathDashFilter.libTypesMod.Options
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("file-path-filter/lib/create-filter", JSImport.Namespace)
@js.native
object libCreateDashFilterMod extends js.Object {
  def createFilter(options: Options, criteria: FilterCriterion*): FilterFunction = js.native
  def createFilter(options: Options, criteria: AnyFilter): FilterFunction = js.native
  def createFilter(options: Options, filters: Filters[FilterCriteria]): FilterFunction = js.native
}

