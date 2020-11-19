package typingsSlinky.ngTable

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("ng-table/src/core/filtering/filterComparator", JSImport.Namespace)
@js.native
object filterComparatorMod extends js.Object {
  
  type FilterComparator[T] = Boolean | IFilterComparatorFunc[T]
  
  type IFilterComparatorFunc[T] = js.Function2[/* actual */ T, /* expected */ T, Boolean]
}
