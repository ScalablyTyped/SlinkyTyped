package typingsSlinky.jsdevtoolsFilePathFilter

import typingsSlinky.jsdevtoolsFilePathFilter.typesMod.AnyFilter
import typingsSlinky.jsdevtoolsFilePathFilter.typesMod.FilterCriteria
import typingsSlinky.jsdevtoolsFilePathFilter.typesMod.FilterCriterion
import typingsSlinky.jsdevtoolsFilePathFilter.typesMod.FilterFunction
import typingsSlinky.jsdevtoolsFilePathFilter.typesMod.Filters
import typingsSlinky.jsdevtoolsFilePathFilter.typesMod.Options
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object createFilterMod {
  
  @JSImport("@jsdevtools/file-path-filter/lib/create-filter", "createFilter")
  @js.native
  def createFilter(options: Options, criteria: FilterCriterion*): FilterFunction = js.native
  @JSImport("@jsdevtools/file-path-filter/lib/create-filter", "createFilter")
  @js.native
  def createFilter(options: Options, criteria: AnyFilter): FilterFunction = js.native
  @JSImport("@jsdevtools/file-path-filter/lib/create-filter", "createFilter")
  @js.native
  def createFilter(options: Options, filters: Filters[FilterCriteria]): FilterFunction = js.native
}
