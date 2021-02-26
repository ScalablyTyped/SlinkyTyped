package typingsSlinky.maximMazurokGapiClientDisplayvideo.gapi.client.displayvideo

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IdFilter extends StObject {
  
  /** YouTube Ads to download by ID. All IDs must belong to the same Advertiser or Partner specified in CreateSdfDownloadTaskRequest. */
  var adGroupAdIds: js.UndefOr[js.Array[String]] = js.native
  
  /** YouTube Ad Groups to download by ID. All IDs must belong to the same Advertiser or Partner specified in CreateSdfDownloadTaskRequest. */
  var adGroupIds: js.UndefOr[js.Array[String]] = js.native
  
  /** Campaigns to download by ID. All IDs must belong to the same Advertiser or Partner specified in CreateSdfDownloadTaskRequest. */
  var campaignIds: js.UndefOr[js.Array[String]] = js.native
  
  /** Insertion Orders to download by ID. All IDs must belong to the same Advertiser or Partner specified in CreateSdfDownloadTaskRequest. */
  var insertionOrderIds: js.UndefOr[js.Array[String]] = js.native
  
  /** Line Items to download by ID. All IDs must belong to the same Advertiser or Partner specified in CreateSdfDownloadTaskRequest. */
  var lineItemIds: js.UndefOr[js.Array[String]] = js.native
  
  /** Media Products to download by ID. All IDs must belong to the same Advertiser or Partner specified in CreateSdfDownloadTaskRequest. */
  var mediaProductIds: js.UndefOr[js.Array[String]] = js.native
}
object IdFilter {
  
  @scala.inline
  def apply(): IdFilter = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IdFilter]
  }
  
  @scala.inline
  implicit class IdFilterMutableBuilder[Self <: IdFilter] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAdGroupAdIds(value: js.Array[String]): Self = StObject.set(x, "adGroupAdIds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAdGroupAdIdsUndefined: Self = StObject.set(x, "adGroupAdIds", js.undefined)
    
    @scala.inline
    def setAdGroupAdIdsVarargs(value: String*): Self = StObject.set(x, "adGroupAdIds", js.Array(value :_*))
    
    @scala.inline
    def setAdGroupIds(value: js.Array[String]): Self = StObject.set(x, "adGroupIds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAdGroupIdsUndefined: Self = StObject.set(x, "adGroupIds", js.undefined)
    
    @scala.inline
    def setAdGroupIdsVarargs(value: String*): Self = StObject.set(x, "adGroupIds", js.Array(value :_*))
    
    @scala.inline
    def setCampaignIds(value: js.Array[String]): Self = StObject.set(x, "campaignIds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCampaignIdsUndefined: Self = StObject.set(x, "campaignIds", js.undefined)
    
    @scala.inline
    def setCampaignIdsVarargs(value: String*): Self = StObject.set(x, "campaignIds", js.Array(value :_*))
    
    @scala.inline
    def setInsertionOrderIds(value: js.Array[String]): Self = StObject.set(x, "insertionOrderIds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInsertionOrderIdsUndefined: Self = StObject.set(x, "insertionOrderIds", js.undefined)
    
    @scala.inline
    def setInsertionOrderIdsVarargs(value: String*): Self = StObject.set(x, "insertionOrderIds", js.Array(value :_*))
    
    @scala.inline
    def setLineItemIds(value: js.Array[String]): Self = StObject.set(x, "lineItemIds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLineItemIdsUndefined: Self = StObject.set(x, "lineItemIds", js.undefined)
    
    @scala.inline
    def setLineItemIdsVarargs(value: String*): Self = StObject.set(x, "lineItemIds", js.Array(value :_*))
    
    @scala.inline
    def setMediaProductIds(value: js.Array[String]): Self = StObject.set(x, "mediaProductIds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMediaProductIdsUndefined: Self = StObject.set(x, "mediaProductIds", js.undefined)
    
    @scala.inline
    def setMediaProductIdsVarargs(value: String*): Self = StObject.set(x, "mediaProductIds", js.Array(value :_*))
  }
}
