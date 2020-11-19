package typingsSlinky.jsdevtoolsFilePathFilter

import typingsSlinky.jsdevtoolsFilePathFilter.typesMod.FilterFunction
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@jsdevtools/file-path-filter/lib/util", JSImport.Namespace)
@js.native
object utilMod extends js.Object {
  
  @JSName("_filters")
  val filters: js.Symbol = js.native
  
  def isFilterCriterion(value: js.Any): /* is @jsdevtools/file-path-filter.@jsdevtools/file-path-filter/lib/types.FilterCriterion */ Boolean = js.native
  
  def isPathFilter(value: js.Any): /* is @jsdevtools/file-path-filter.@jsdevtools/file-path-filter/lib/util.PathFilter */ Boolean = js.native
  
  @js.native
  trait PathFilter extends FilterFunction
}
