package typingsSlinky.googleapis.contentV2Mod.contentV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A batch entry encoding a single non-batch accounts response.
  */
@js.native
trait SchemaAccountsCustomBatchResponseEntry extends StObject {
  
  /**
    * The retrieved, created, or updated account. Not defined if the method was
    * delete, claimwebsite or link.
    */
  var account: js.UndefOr[SchemaAccount] = js.native
  
  /**
    * The ID of the request entry this entry responds to.
    */
  var batchId: js.UndefOr[Double] = js.native
  
  /**
    * A list of errors defined if and only if the request failed.
    */
  var errors: js.UndefOr[SchemaErrors] = js.native
  
  /**
    * Identifies what kind of resource this is. Value: the fixed string
    * &quot;content#accountsCustomBatchResponseEntry&quot;.
    */
  var kind: js.UndefOr[String] = js.native
  
  /**
    * Deprecated. This field is never set.
    */
  var linkStatus: js.UndefOr[String] = js.native
}
object SchemaAccountsCustomBatchResponseEntry {
  
  @scala.inline
  def apply(): SchemaAccountsCustomBatchResponseEntry = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaAccountsCustomBatchResponseEntry]
  }
  
  @scala.inline
  implicit class SchemaAccountsCustomBatchResponseEntryMutableBuilder[Self <: SchemaAccountsCustomBatchResponseEntry] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAccount(value: SchemaAccount): Self = StObject.set(x, "account", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAccountUndefined: Self = StObject.set(x, "account", js.undefined)
    
    @scala.inline
    def setBatchId(value: Double): Self = StObject.set(x, "batchId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBatchIdUndefined: Self = StObject.set(x, "batchId", js.undefined)
    
    @scala.inline
    def setErrors(value: SchemaErrors): Self = StObject.set(x, "errors", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setErrorsUndefined: Self = StObject.set(x, "errors", js.undefined)
    
    @scala.inline
    def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    @scala.inline
    def setLinkStatus(value: String): Self = StObject.set(x, "linkStatus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLinkStatusUndefined: Self = StObject.set(x, "linkStatus", js.undefined)
  }
}
