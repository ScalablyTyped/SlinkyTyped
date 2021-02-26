package typingsSlinky.awsSdk.glacierMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait InventoryRetrievalJobDescription extends StObject {
  
  /**
    * The end of the date range in UTC for vault inventory retrieval that includes archives created before this date. This value should be a string in the ISO 8601 date format, for example 2013-03-20T17:03:43Z.
    */
  var EndDate: js.UndefOr[DateTime] = js.native
  
  /**
    * The output format for the vault inventory list, which is set by the InitiateJob request when initiating a job to retrieve a vault inventory. Valid values are CSV and JSON.
    */
  var Format: js.UndefOr[String] = js.native
  
  /**
    * The maximum number of inventory items returned per vault inventory retrieval request. This limit is set when initiating the job with the a InitiateJob request. 
    */
  var Limit: js.UndefOr[String] = js.native
  
  /**
    * An opaque string that represents where to continue pagination of the vault inventory retrieval results. You use the marker in a new InitiateJob request to obtain additional inventory items. If there are no more inventory items, this value is null. For more information, see  Range Inventory Retrieval.
    */
  var Marker: js.UndefOr[String] = js.native
  
  /**
    * The start of the date range in Universal Coordinated Time (UTC) for vault inventory retrieval that includes archives created on or after this date. This value should be a string in the ISO 8601 date format, for example 2013-03-20T17:03:43Z.
    */
  var StartDate: js.UndefOr[DateTime] = js.native
}
object InventoryRetrievalJobDescription {
  
  @scala.inline
  def apply(): InventoryRetrievalJobDescription = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InventoryRetrievalJobDescription]
  }
  
  @scala.inline
  implicit class InventoryRetrievalJobDescriptionMutableBuilder[Self <: InventoryRetrievalJobDescription] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEndDate(value: DateTime): Self = StObject.set(x, "EndDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEndDateUndefined: Self = StObject.set(x, "EndDate", js.undefined)
    
    @scala.inline
    def setFormat(value: String): Self = StObject.set(x, "Format", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFormatUndefined: Self = StObject.set(x, "Format", js.undefined)
    
    @scala.inline
    def setLimit(value: String): Self = StObject.set(x, "Limit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLimitUndefined: Self = StObject.set(x, "Limit", js.undefined)
    
    @scala.inline
    def setMarker(value: String): Self = StObject.set(x, "Marker", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMarkerUndefined: Self = StObject.set(x, "Marker", js.undefined)
    
    @scala.inline
    def setStartDate(value: DateTime): Self = StObject.set(x, "StartDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStartDateUndefined: Self = StObject.set(x, "StartDate", js.undefined)
  }
}
