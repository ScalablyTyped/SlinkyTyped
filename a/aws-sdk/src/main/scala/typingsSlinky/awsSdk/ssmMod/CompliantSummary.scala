package typingsSlinky.awsSdk.ssmMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CompliantSummary extends StObject {
  
  /**
    * The total number of resources that are compliant.
    */
  var CompliantCount: js.UndefOr[ComplianceSummaryCount] = js.native
  
  /**
    * A summary of the compliance severity by compliance type.
    */
  var SeveritySummary: js.UndefOr[typingsSlinky.awsSdk.ssmMod.SeveritySummary] = js.native
}
object CompliantSummary {
  
  @scala.inline
  def apply(): CompliantSummary = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CompliantSummary]
  }
  
  @scala.inline
  implicit class CompliantSummaryMutableBuilder[Self <: CompliantSummary] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCompliantCount(value: ComplianceSummaryCount): Self = StObject.set(x, "CompliantCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCompliantCountUndefined: Self = StObject.set(x, "CompliantCount", js.undefined)
    
    @scala.inline
    def setSeveritySummary(value: SeveritySummary): Self = StObject.set(x, "SeveritySummary", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSeveritySummaryUndefined: Self = StObject.set(x, "SeveritySummary", js.undefined)
  }
}
