package typingsSlinky.jsdevtoolsFilePathFilter

import typingsSlinky.jsdevtoolsFilePathFilter.typesMod.AnyFilter
import typingsSlinky.jsdevtoolsFilePathFilter.typesMod.FilterCriteria
import typingsSlinky.jsdevtoolsFilePathFilter.typesMod.FilterCriterion
import typingsSlinky.jsdevtoolsFilePathFilter.typesMod.FilterFunction
import typingsSlinky.jsdevtoolsFilePathFilter.typesMod.Filters
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object filePathFilterMod {
  
  @JSImport("@jsdevtools/file-path-filter/lib/file-path-filter", "filePathFilter")
  @js.native
  def filePathFilter(criteria: FilterCriterion*): FilterFunction = js.native
  @JSImport("@jsdevtools/file-path-filter/lib/file-path-filter", "filePathFilter")
  @js.native
  def filePathFilter(criteria: AnyFilter): FilterFunction = js.native
  @JSImport("@jsdevtools/file-path-filter/lib/file-path-filter", "filePathFilter")
  @js.native
  def filePathFilter(filters: Filters[FilterCriteria]): FilterFunction = js.native
}
