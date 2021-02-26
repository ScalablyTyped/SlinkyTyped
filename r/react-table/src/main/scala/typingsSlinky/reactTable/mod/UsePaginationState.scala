package typingsSlinky.reactTable.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UsePaginationState[D /* <: js.Object */] extends StObject {
  
  var pageIndex: Double = js.native
  
  var pageSize: Double = js.native
}
object UsePaginationState {
  
  @scala.inline
  def apply[D /* <: js.Object */](pageIndex: Double, pageSize: Double): UsePaginationState[D] = {
    val __obj = js.Dynamic.literal(pageIndex = pageIndex.asInstanceOf[js.Any], pageSize = pageSize.asInstanceOf[js.Any])
    __obj.asInstanceOf[UsePaginationState[D]]
  }
  
  @scala.inline
  implicit class UsePaginationStateMutableBuilder[Self <: UsePaginationState[_], D /* <: js.Object */] (val x: Self with UsePaginationState[D]) extends AnyVal {
    
    @scala.inline
    def setPageIndex(value: Double): Self = StObject.set(x, "pageIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPageSize(value: Double): Self = StObject.set(x, "pageSize", value.asInstanceOf[js.Any])
  }
}
