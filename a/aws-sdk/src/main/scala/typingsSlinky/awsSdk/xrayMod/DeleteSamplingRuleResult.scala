package typingsSlinky.awsSdk.xrayMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DeleteSamplingRuleResult extends StObject {
  
  /**
    * The deleted rule definition and metadata.
    */
  var SamplingRuleRecord: js.UndefOr[typingsSlinky.awsSdk.xrayMod.SamplingRuleRecord] = js.native
}
object DeleteSamplingRuleResult {
  
  @scala.inline
  def apply(): DeleteSamplingRuleResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeleteSamplingRuleResult]
  }
  
  @scala.inline
  implicit class DeleteSamplingRuleResultMutableBuilder[Self <: DeleteSamplingRuleResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setSamplingRuleRecord(value: SamplingRuleRecord): Self = StObject.set(x, "SamplingRuleRecord", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSamplingRuleRecordUndefined: Self = StObject.set(x, "SamplingRuleRecord", js.undefined)
  }
}
