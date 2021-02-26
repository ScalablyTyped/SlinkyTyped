package typingsSlinky.awsSdk.xrayMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetInsightResult extends StObject {
  
  /**
    * The summary information of an insight.
    */
  var Insight: js.UndefOr[typingsSlinky.awsSdk.xrayMod.Insight] = js.native
}
object GetInsightResult {
  
  @scala.inline
  def apply(): GetInsightResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetInsightResult]
  }
  
  @scala.inline
  implicit class GetInsightResultMutableBuilder[Self <: GetInsightResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setInsight(value: Insight): Self = StObject.set(x, "Insight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInsightUndefined: Self = StObject.set(x, "Insight", js.undefined)
  }
}
