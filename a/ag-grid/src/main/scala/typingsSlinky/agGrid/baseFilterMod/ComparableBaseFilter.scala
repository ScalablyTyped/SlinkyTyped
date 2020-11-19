package typingsSlinky.agGrid.baseFilterMod

import typingsSlinky.agGrid.iFilterMod.IDoesFilterPassParams
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("ag-grid/dist/lib/filter/baseFilter", "ComparableBaseFilter")
@js.native
abstract class ComparableBaseFilter[T, P /* <: IComparableFilterParams */, M] () extends BaseFilter[T, P, M] {
  
  var eTypeConditionSelector: js.Any = js.native
  
  var eTypeSelector: js.Any = js.native
  
  def filterValues(`type`: FilterConditionType): T | js.Array[T] = js.native
  
  def getApplicableFilterTypes(): js.Array[String] = js.native
  
  def getDefaultType(): String = js.native
  
  def individualFilterPasses(params: IDoesFilterPassParams, `type`: FilterConditionType): Boolean = js.native
  
  @JSName("init")
  def init_MComparableBaseFilter(params: P): Unit = js.native
  
  /* private */ def onFilterTypeChanged(`type`: js.Any): js.Any = js.native
  
  def setFilterType(filterType: String, `type`: FilterConditionType): Unit = js.native
  
  var suppressAndOrCondition: js.Any = js.native
}
