package typingsSlinky.googleapis.doubleclickbidmanagerV1Mod.doubleclickbidmanagerV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Request to upload line items.
  */
@js.native
trait SchemaUploadLineItemsRequest extends StObject {
  
  /**
    * Set to true to get upload status without actually persisting the line
    * items.
    */
  var dryRun: js.UndefOr[Boolean] = js.native
  
  /**
    * Format the line items are in. Default to CSV.
    */
  var format: js.UndefOr[String] = js.native
  
  /**
    * Line items in CSV to upload. Refer to  Entity Write File Format for more
    * information on file format.
    */
  var lineItems: js.UndefOr[String] = js.native
}
object SchemaUploadLineItemsRequest {
  
  @scala.inline
  def apply(): SchemaUploadLineItemsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaUploadLineItemsRequest]
  }
  
  @scala.inline
  implicit class SchemaUploadLineItemsRequestMutableBuilder[Self <: SchemaUploadLineItemsRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDryRun(value: Boolean): Self = StObject.set(x, "dryRun", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDryRunUndefined: Self = StObject.set(x, "dryRun", js.undefined)
    
    @scala.inline
    def setFormat(value: String): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFormatUndefined: Self = StObject.set(x, "format", js.undefined)
    
    @scala.inline
    def setLineItems(value: String): Self = StObject.set(x, "lineItems", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLineItemsUndefined: Self = StObject.set(x, "lineItems", js.undefined)
  }
}
