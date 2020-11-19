package typingsSlinky.jsdevtoolsFilePathFilter

import typingsSlinky.jsdevtoolsFilePathFilter.typesMod.AnyFilter
import typingsSlinky.jsdevtoolsFilePathFilter.typesMod.FilterCriteria
import typingsSlinky.jsdevtoolsFilePathFilter.typesMod.FilterCriterion
import typingsSlinky.jsdevtoolsFilePathFilter.typesMod.FilterFunction
import typingsSlinky.jsdevtoolsFilePathFilter.typesMod.Filters
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@jsdevtools/file-path-filter/lib/file-path-filter", JSImport.Namespace)
@js.native
object filePathFilterMod extends js.Object {
  
  def filePathFilter(criteria: FilterCriterion*): FilterFunction = js.native
  def filePathFilter(criteria: AnyFilter): FilterFunction = js.native
  def filePathFilter(filters: Filters[FilterCriteria]): FilterFunction = js.native
}
