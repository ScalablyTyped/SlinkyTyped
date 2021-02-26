package typingsSlinky.awsSdk.iotsitewiseMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BatchAssociateProjectAssetsResponse extends StObject {
  
  /**
    * A list of associated error information, if any.
    */
  var errors: js.UndefOr[BatchAssociateProjectAssetsErrors] = js.native
}
object BatchAssociateProjectAssetsResponse {
  
  @scala.inline
  def apply(): BatchAssociateProjectAssetsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BatchAssociateProjectAssetsResponse]
  }
  
  @scala.inline
  implicit class BatchAssociateProjectAssetsResponseMutableBuilder[Self <: BatchAssociateProjectAssetsResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setErrors(value: BatchAssociateProjectAssetsErrors): Self = StObject.set(x, "errors", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setErrorsUndefined: Self = StObject.set(x, "errors", js.undefined)
    
    @scala.inline
    def setErrorsVarargs(value: AssetErrorDetails*): Self = StObject.set(x, "errors", js.Array(value :_*))
  }
}
