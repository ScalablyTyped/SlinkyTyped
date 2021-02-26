package typingsSlinky.awsSdk.costexplorerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SavingsPlansUtilization extends StObject {
  
  /**
    * The total amount of Savings Plans commitment that's been purchased in an account (or set of accounts).
    */
  var TotalCommitment: js.UndefOr[GenericString] = js.native
  
  /**
    * The amount of your Savings Plans commitment that was not consumed from Savings Plans eligible usage in a specific period.
    */
  var UnusedCommitment: js.UndefOr[GenericString] = js.native
  
  /**
    * The amount of your Savings Plans commitment that was consumed from Savings Plans eligible usage in a specific period.
    */
  var UsedCommitment: js.UndefOr[GenericString] = js.native
  
  /**
    * The amount of UsedCommitment divided by the TotalCommitment for your Savings Plans.
    */
  var UtilizationPercentage: js.UndefOr[GenericString] = js.native
}
object SavingsPlansUtilization {
  
  @scala.inline
  def apply(): SavingsPlansUtilization = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SavingsPlansUtilization]
  }
  
  @scala.inline
  implicit class SavingsPlansUtilizationMutableBuilder[Self <: SavingsPlansUtilization] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setTotalCommitment(value: GenericString): Self = StObject.set(x, "TotalCommitment", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTotalCommitmentUndefined: Self = StObject.set(x, "TotalCommitment", js.undefined)
    
    @scala.inline
    def setUnusedCommitment(value: GenericString): Self = StObject.set(x, "UnusedCommitment", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUnusedCommitmentUndefined: Self = StObject.set(x, "UnusedCommitment", js.undefined)
    
    @scala.inline
    def setUsedCommitment(value: GenericString): Self = StObject.set(x, "UsedCommitment", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUsedCommitmentUndefined: Self = StObject.set(x, "UsedCommitment", js.undefined)
    
    @scala.inline
    def setUtilizationPercentage(value: GenericString): Self = StObject.set(x, "UtilizationPercentage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUtilizationPercentageUndefined: Self = StObject.set(x, "UtilizationPercentage", js.undefined)
  }
}
