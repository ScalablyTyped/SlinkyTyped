package typingsSlinky.googleapis.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Issue extends StObject {
  
  var issue: js.UndefOr[js.Array[IssueDisplayNumber]] = js.native
  
  var orderNumber: js.UndefOr[Double] = js.native
  
  var seriesBookType: js.UndefOr[String] = js.native
  
  var seriesId: js.UndefOr[String] = js.native
}
object Issue {
  
  @scala.inline
  def apply(): Issue = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Issue]
  }
  
  @scala.inline
  implicit class IssueMutableBuilder[Self <: Issue] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setIssue(value: js.Array[IssueDisplayNumber]): Self = StObject.set(x, "issue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIssueUndefined: Self = StObject.set(x, "issue", js.undefined)
    
    @scala.inline
    def setIssueVarargs(value: IssueDisplayNumber*): Self = StObject.set(x, "issue", js.Array(value :_*))
    
    @scala.inline
    def setOrderNumber(value: Double): Self = StObject.set(x, "orderNumber", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOrderNumberUndefined: Self = StObject.set(x, "orderNumber", js.undefined)
    
    @scala.inline
    def setSeriesBookType(value: String): Self = StObject.set(x, "seriesBookType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSeriesBookTypeUndefined: Self = StObject.set(x, "seriesBookType", js.undefined)
    
    @scala.inline
    def setSeriesId(value: String): Self = StObject.set(x, "seriesId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSeriesIdUndefined: Self = StObject.set(x, "seriesId", js.undefined)
  }
}
