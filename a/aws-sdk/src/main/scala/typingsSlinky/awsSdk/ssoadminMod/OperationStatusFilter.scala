package typingsSlinky.awsSdk.ssoadminMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OperationStatusFilter extends StObject {
  
  /**
    * Filters the list operations result based on the status attribute.
    */
  var Status: js.UndefOr[StatusValues] = js.native
}
object OperationStatusFilter {
  
  @scala.inline
  def apply(): OperationStatusFilter = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OperationStatusFilter]
  }
  
  @scala.inline
  implicit class OperationStatusFilterMutableBuilder[Self <: OperationStatusFilter] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setStatus(value: StatusValues): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatusUndefined: Self = StObject.set(x, "Status", js.undefined)
  }
}
