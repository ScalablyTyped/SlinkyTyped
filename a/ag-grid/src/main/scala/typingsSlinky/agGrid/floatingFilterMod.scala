package typingsSlinky.agGrid

import org.scalajs.dom.raw.HTMLInputElement
import org.scalajs.dom.raw.KeyboardEvent
import typingsSlinky.agGrid.baseFilterMod.CombinedFilter
import typingsSlinky.agGrid.columnMod.Column
import typingsSlinky.agGrid.componentMod.Component
import typingsSlinky.agGrid.dateFilterMod.SerializedDateFilter
import typingsSlinky.agGrid.gridApiMod.GridApi
import typingsSlinky.agGrid.iComponentMod.IComponent
import typingsSlinky.agGrid.iSerializedSetFilterMod.SerializedSetFilter
import typingsSlinky.agGrid.numberFilterMod.SerializedNumberFilter
import typingsSlinky.agGrid.textFilterMod.SerializedTextFilter
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object floatingFilterMod {
  
  @JSImport("ag-grid/dist/lib/filter/floatingFilter", "DateFloatingFilterComp")
  @js.native
  class DateFloatingFilterComp ()
    extends Component
       with IFloatingFilter[
          SerializedDateFilter, 
          BaseFloatingFilterChange[SerializedDateFilter], 
          IFloatingFilterParams[SerializedDateFilter, BaseFloatingFilterChange[SerializedDateFilter]]
        ] {
    def this(template: String) = this()
    
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
  
  @JSImport("ag-grid/dist/lib/filter/floatingFilter", "InputTextFloatingFilterComp")
  @js.native
  abstract class InputTextFloatingFilterComp[M, P /* <: IFloatingFilterParams[M, BaseFloatingFilterChange[M]] */] ()
    extends Component
       with IFloatingFilter[M, BaseFloatingFilterChange[M], P] {
    
    def asFloatingFilterText(parentModel: M): String = js.native
    
    def asParentModel(): M = js.native
    
    def currentParentModel(): M = js.native
    
    var eColumnFloatingFilter: HTMLInputElement = js.native
    
    def equalModels(left: js.Any, right: js.Any): Boolean = js.native
    
    @JSName("init")
    def init_MInputTextFloatingFilterComp(params: P): Unit = js.native
    
    var lastKnownModel: M = js.native
    
    def onFloatingFilterChanged(change: BaseFloatingFilterChange[M]): Boolean = js.native
    
    def parseAsText(model: M): String = js.native
    
    def syncUpWithParentFilter(e: KeyboardEvent): Unit = js.native
  }
  
  @JSImport("ag-grid/dist/lib/filter/floatingFilter", "NumberFloatingFilterComp")
  @js.native
  class NumberFloatingFilterComp () extends InputTextFloatingFilterComp[
          SerializedNumberFilter, 
          IFloatingFilterParams[SerializedNumberFilter, BaseFloatingFilterChange[SerializedNumberFilter]]
        ] {
    
    /* private */ def asNumber(value: js.Any): js.Any = js.native
  }
  
  @JSImport("ag-grid/dist/lib/filter/floatingFilter", "ReadModelAsStringFloatingFilterComp")
  @js.native
  class ReadModelAsStringFloatingFilterComp () extends InputTextFloatingFilterComp[String, IFloatingFilterParams[String, BaseFloatingFilterChange[String]]] {
    
    @JSName("init")
    def init_MReadModelAsStringFloatingFilterComp(params: IFloatingFilterParams[String, BaseFloatingFilterChange[String]]): Unit = js.native
    
    def onParentModelChanged(parentModel: js.Any): Unit = js.native
  }
  
  @JSImport("ag-grid/dist/lib/filter/floatingFilter", "SetFloatingFilterComp")
  @js.native
  class SetFloatingFilterComp () extends InputTextFloatingFilterComp[
          SerializedSetFilter, 
          IFloatingFilterParams[SerializedSetFilter, BaseFloatingFilterChange[SerializedSetFilter]]
        ] {
    
    def asFloatingFilterText(parentModel: js.Array[String]): String = js.native
    
    def equalModels(left: SerializedSetFilter, right: SerializedSetFilter): Boolean = js.native
    
    @JSName("init")
    def init_MSetFloatingFilterComp(params: IFloatingFilterParams[SerializedSetFilter, BaseFloatingFilterChange[SerializedSetFilter]]): Unit = js.native
  }
  
  @JSImport("ag-grid/dist/lib/filter/floatingFilter", "TextFloatingFilterComp")
  @js.native
  class TextFloatingFilterComp () extends InputTextFloatingFilterComp[
          SerializedTextFilter, 
          IFloatingFilterParams[SerializedTextFilter, BaseFloatingFilterChange[SerializedTextFilter]]
        ]
  
  @js.native
  trait BaseFloatingFilterChange[M] extends FloatingFilterChange {
    
    @JSName("apply")
    var apply: Boolean = js.native
    
    var model: M = js.native
  }
  object BaseFloatingFilterChange {
    
    @scala.inline
    def apply[M](apply: Boolean, model: M): BaseFloatingFilterChange[M] = {
      val __obj = js.Dynamic.literal(apply = apply.asInstanceOf[js.Any], model = model.asInstanceOf[js.Any])
      __obj.asInstanceOf[BaseFloatingFilterChange[M]]
    }
    
    @scala.inline
    implicit class BaseFloatingFilterChangeMutableBuilder[Self <: BaseFloatingFilterChange[_], M] (val x: Self with BaseFloatingFilterChange[M]) extends AnyVal {
      
      @scala.inline
      def setApply(value: Boolean): Self = StObject.set(x, "apply", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setModel(value: M): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait FloatingFilterChange extends StObject
  
  @js.native
  trait IFloatingFilter[M, F /* <: FloatingFilterChange */, P /* <: IFloatingFilterParams[M, F] */] extends StObject {
    
    def onParentModelChanged(parentModel: M): Unit = js.native
    def onParentModelChanged(parentModel: M, combinedModel: CombinedFilter[M]): Unit = js.native
  }
  
  @js.native
  trait IFloatingFilterComp[M, F /* <: FloatingFilterChange */, P /* <: IFloatingFilterParams[M, F] */]
    extends IFloatingFilter[M, F, P]
       with IComponent[P]
  
  @js.native
  trait IFloatingFilterParams[M, F /* <: FloatingFilterChange */] extends StObject {
    
    var api: GridApi = js.native
    
    var column: Column = js.native
    
    def currentParentModel(): M = js.native
    
    var debounceMs: js.UndefOr[Double] = js.native
    
    def onFloatingFilterChanged(change: F | M): Boolean = js.native
    
    var suppressFilterButton: Boolean = js.native
  }
}
