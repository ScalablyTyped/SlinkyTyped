package typingsSlinky.awsSdk.pinpointMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BaseKpiResult extends StObject {
  
  /**
    * An array of objects that provides the results of a query that retrieved the data for a standard metric that applies to an application, campaign, or journey.
    */
  var Rows: ListOfResultRow = js.native
}
object BaseKpiResult {
  
  @scala.inline
  def apply(Rows: ListOfResultRow): BaseKpiResult = {
    val __obj = js.Dynamic.literal(Rows = Rows.asInstanceOf[js.Any])
    __obj.asInstanceOf[BaseKpiResult]
  }
  
  @scala.inline
  implicit class BaseKpiResultMutableBuilder[Self <: BaseKpiResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setRows(value: ListOfResultRow): Self = StObject.set(x, "Rows", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRowsVarargs(value: ResultRow*): Self = StObject.set(x, "Rows", js.Array(value :_*))
  }
}
