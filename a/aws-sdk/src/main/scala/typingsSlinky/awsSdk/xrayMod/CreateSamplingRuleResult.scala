package typingsSlinky.awsSdk.xrayMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreateSamplingRuleResult extends StObject {
  
  /**
    * The saved rule definition and metadata.
    */
  var SamplingRuleRecord: js.UndefOr[typingsSlinky.awsSdk.xrayMod.SamplingRuleRecord] = js.native
}
object CreateSamplingRuleResult {
  
  @scala.inline
  def apply(): CreateSamplingRuleResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateSamplingRuleResult]
  }
  
  @scala.inline
  implicit class CreateSamplingRuleResultMutableBuilder[Self <: CreateSamplingRuleResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setSamplingRuleRecord(value: SamplingRuleRecord): Self = StObject.set(x, "SamplingRuleRecord", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSamplingRuleRecordUndefined: Self = StObject.set(x, "SamplingRuleRecord", js.undefined)
  }
}
