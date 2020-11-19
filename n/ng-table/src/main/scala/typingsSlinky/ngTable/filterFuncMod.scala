package typingsSlinky.ngTable

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.ngTable.filterComparatorMod.FilterComparator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("ng-table/src/core/filtering/filterFunc", JSImport.Namespace)
@js.native
object filterFuncMod extends js.Object {
  
  type IFilterFunc[T] = js.Function3[
    /* data */ js.Array[T], 
    /* filter */ IFilterValues, 
    /* filterComparator */ FilterComparator[T], 
    js.Array[T]
  ]
  
  type IFilterValues = StringDictionary[js.Any]
}
