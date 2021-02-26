package typingsSlinky.reactTable.mod

import typingsSlinky.reactTable.anon.PartialTableCommonProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UseSortByHooks[D /* <: js.Object */] extends StObject {
  
  var getSortByToggleProps: js.Array[PropGetter[D, TableCommonProps, scala.Nothing, PartialTableCommonProps]] = js.native
}
object UseSortByHooks {
  
  @scala.inline
  def apply[D /* <: js.Object */](
    getSortByToggleProps: js.Array[PropGetter[D, TableCommonProps, scala.Nothing, PartialTableCommonProps]]
  ): UseSortByHooks[D] = {
    val __obj = js.Dynamic.literal(getSortByToggleProps = getSortByToggleProps.asInstanceOf[js.Any])
    __obj.asInstanceOf[UseSortByHooks[D]]
  }
  
  @scala.inline
  implicit class UseSortByHooksMutableBuilder[Self <: UseSortByHooks[_], D /* <: js.Object */] (val x: Self with UseSortByHooks[D]) extends AnyVal {
    
    @scala.inline
    def setGetSortByToggleProps(value: js.Array[PropGetter[D, TableCommonProps, scala.Nothing, PartialTableCommonProps]]): Self = StObject.set(x, "getSortByToggleProps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGetSortByTogglePropsVarargs(value: (PropGetter[D, TableCommonProps, scala.Nothing, PartialTableCommonProps])*): Self = StObject.set(x, "getSortByToggleProps", js.Array(value :_*))
  }
}
