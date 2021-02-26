package typingsSlinky.maximMazurokGapiClientContent.gapi.client.content

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ReturnpolicyCustomBatchResponseEntry extends StObject {
  
  /** The ID of the request entry to which this entry responds. */
  var batchId: js.UndefOr[Double] = js.native
  
  /** A list of errors defined if, and only if, the request failed. */
  var errors: js.UndefOr[Errors] = js.native
  
  /** Identifies what kind of resource this is. Value: the fixed string "`content#returnpolicyCustomBatchResponseEntry`" */
  var kind: js.UndefOr[String] = js.native
  
  /** The retrieved return policy. */
  var returnPolicy: js.UndefOr[ReturnPolicy] = js.native
}
object ReturnpolicyCustomBatchResponseEntry {
  
  @scala.inline
  def apply(): ReturnpolicyCustomBatchResponseEntry = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ReturnpolicyCustomBatchResponseEntry]
  }
  
  @scala.inline
  implicit class ReturnpolicyCustomBatchResponseEntryMutableBuilder[Self <: ReturnpolicyCustomBatchResponseEntry] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBatchId(value: Double): Self = StObject.set(x, "batchId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBatchIdUndefined: Self = StObject.set(x, "batchId", js.undefined)
    
    @scala.inline
    def setErrors(value: Errors): Self = StObject.set(x, "errors", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setErrorsUndefined: Self = StObject.set(x, "errors", js.undefined)
    
    @scala.inline
    def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    @scala.inline
    def setReturnPolicy(value: ReturnPolicy): Self = StObject.set(x, "returnPolicy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReturnPolicyUndefined: Self = StObject.set(x, "returnPolicy", js.undefined)
  }
}
