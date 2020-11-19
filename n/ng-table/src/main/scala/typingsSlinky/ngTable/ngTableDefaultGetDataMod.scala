package typingsSlinky.ngTable

import typingsSlinky.angular.mod.IFilterOrderBy
import typingsSlinky.angular.mod.IFilterService
import typingsSlinky.angular.mod.IServiceProvider
import typingsSlinky.ngTable.filterFuncMod.IFilterFunc
import typingsSlinky.ngTable.ngTableEventsChannelMod.NgTableEventsChannel
import typingsSlinky.ngTable.ngTableParamsMod.NgTableParams
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("ng-table/src/core/data/ngTableDefaultGetData", JSImport.Namespace)
@js.native
object ngTableDefaultGetDataMod extends js.Object {
  
  @js.native
  trait IDefaultGetData[T] extends js.Object {
    
    def apply(data: js.Array[T], params: NgTableParams[T]): js.Array[T] = js.native
    
    /**
      * Convenience function that this service will use to apply paging to the data rows.
      *
      * Returns a slice of rows from the `data` array supplied and sets the `NgTableParams.total()`
      * on the `params` instance supplied to `data.length`
      */
    def applyPaging(data: js.Array[T], params: NgTableParams[_]): js.Array[T] = js.native
    
    /**
      * Returns a reference to the function that this service will use to filter data rows
      */
    def getFilterFn(params: NgTableParams[T]): IFilterFunc[T] = js.native
    
    /**
      * Returns a reference to the function that this service will use to sort data rows
      */
    def getOrderByFn(): IFilterOrderBy = js.native
    def getOrderByFn(params: NgTableParams[T]): IFilterOrderBy = js.native
  }
  
  @js.native
  class NgTableDefaultGetDataProvider () extends IServiceProvider {
    
    @JSName("$get")
    def $get_MNgTableDefaultGetDataProvider($filter: IFilterService, ngTableEventsChannel: NgTableEventsChannel): IDefaultGetData[_] = js.native
    
    /**
      * The name of a angular filter that knows how to apply the values returned by
      * `NgTableParams.filter()` to restrict an array of data.
      * (defaults to the angular `filter` filter service)
      */
    var filterFilterName: String = js.native
    
    /**
      * The name of a angular filter that knows how to apply the values returned by
      * `NgTableParams.orderBy()` to sort an array of data.
      * (defaults to the angular `orderBy` filter service)
      */
    var sortingFilterName: String = js.native
  }
}
