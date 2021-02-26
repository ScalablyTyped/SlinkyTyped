package typingsSlinky.awsSdk.s3Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait S3KeyFilter extends StObject {
  
  var FilterRules: js.UndefOr[FilterRuleList] = js.native
}
object S3KeyFilter {
  
  @scala.inline
  def apply(): S3KeyFilter = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[S3KeyFilter]
  }
  
  @scala.inline
  implicit class S3KeyFilterMutableBuilder[Self <: S3KeyFilter] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFilterRules(value: FilterRuleList): Self = StObject.set(x, "FilterRules", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFilterRulesUndefined: Self = StObject.set(x, "FilterRules", js.undefined)
    
    @scala.inline
    def setFilterRulesVarargs(value: FilterRule*): Self = StObject.set(x, "FilterRules", js.Array(value :_*))
  }
}
