package typingsSlinky.awsSdk.configserviceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PutConformancePackResponse extends StObject {
  
  /**
    * ARN of the conformance pack.
    */
  var ConformancePackArn: js.UndefOr[typingsSlinky.awsSdk.configserviceMod.ConformancePackArn] = js.native
}
object PutConformancePackResponse {
  
  @scala.inline
  def apply(): PutConformancePackResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PutConformancePackResponse]
  }
  
  @scala.inline
  implicit class PutConformancePackResponseMutableBuilder[Self <: PutConformancePackResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setConformancePackArn(value: ConformancePackArn): Self = StObject.set(x, "ConformancePackArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConformancePackArnUndefined: Self = StObject.set(x, "ConformancePackArn", js.undefined)
  }
}
