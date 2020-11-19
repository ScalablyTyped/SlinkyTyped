package typingsSlinky.agGrid.floatingFilterMod

import typingsSlinky.agGrid.componentMod.Component
import typingsSlinky.agGrid.dateFilterMod.SerializedDateFilter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("ag-grid/dist/lib/filter/floatingFilter", "DateFloatingFilterComp")
@js.native
class DateFloatingFilterComp ()
  extends Component
     with IFloatingFilter[
      SerializedDateFilter, 
      BaseFloatingFilterChange[SerializedDateFilter], 
      IFloatingFilterParams[SerializedDateFilter, BaseFloatingFilterChange[SerializedDateFilter]]
    ] {
  
  def asParentModel(): SerializedDateFilter = js.native
  
  var componentRecipes: js.Any = js.native
  
  def currentParentModel(): SerializedDateFilter = js.native
  
  var dateComponentPromise: js.Any = js.native
  
  /* private */ def enrichDateInput(`type`: js.Any, dateFrom: js.Any, dateTo: js.Any, dateComponent: js.Any): js.Any = js.native
  
  def equalModels(left: SerializedDateFilter, right: SerializedDateFilter): Boolean = js.native
  
  @JSName("init")
  def init_MDateFloatingFilterComp(
    params: IFloatingFilterParams[SerializedDateFilter, BaseFloatingFilterChange[SerializedDateFilter]]
  ): Unit = js.native
  
  var lastKnownModel: SerializedDateFilter = js.native
  
  /* private */ def onDateChanged(): js.Any = js.native
  
  def onFloatingFilterChanged(change: BaseFloatingFilterChange[SerializedDateFilter]): Unit = js.native
}
