package typingsSlinky.awsSdk.securityhubMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SeverityUpdate extends StObject {
  
  /**
    * The severity value of the finding. The allowed values are the following.    INFORMATIONAL - No issue was found.    LOW - The issue does not require action on its own.    MEDIUM - The issue must be addressed but not urgently.    HIGH - The issue must be addressed as a priority.    CRITICAL - The issue must be remediated immediately to avoid it escalating.  
    */
  var Label: js.UndefOr[SeverityLabel] = js.native
  
  /**
    * The normalized severity for the finding. This attribute is to be deprecated in favor of Label. If you provide Normalized and do not provide Label, Label is set automatically as follows.   0 - INFORMATIONAL    1–39 - LOW    40–69 - MEDIUM    70–89 - HIGH    90–100 - CRITICAL   
    */
  var Normalized: js.UndefOr[RatioScale] = js.native
  
  /**
    * The native severity as defined by the AWS service or integrated partner product that generated the finding.
    */
  var Product: js.UndefOr[Double] = js.native
}
object SeverityUpdate {
  
  @scala.inline
  def apply(): SeverityUpdate = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SeverityUpdate]
  }
  
  @scala.inline
  implicit class SeverityUpdateMutableBuilder[Self <: SeverityUpdate] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLabel(value: SeverityLabel): Self = StObject.set(x, "Label", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabelUndefined: Self = StObject.set(x, "Label", js.undefined)
    
    @scala.inline
    def setNormalized(value: RatioScale): Self = StObject.set(x, "Normalized", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNormalizedUndefined: Self = StObject.set(x, "Normalized", js.undefined)
    
    @scala.inline
    def setProduct(value: Double): Self = StObject.set(x, "Product", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProductUndefined: Self = StObject.set(x, "Product", js.undefined)
  }
}
