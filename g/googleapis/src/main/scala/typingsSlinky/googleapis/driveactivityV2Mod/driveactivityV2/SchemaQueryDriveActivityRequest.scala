package typingsSlinky.googleapis.driveactivityV2Mod.driveactivityV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The request message for querying Drive activity.
  */
@js.native
trait SchemaQueryDriveActivityRequest extends StObject {
  
  /**
    * Return activities for this Drive folder and all children and descendants.
    * The format is &quot;items/ITEM_ID&quot;.
    */
  var ancestorName: js.UndefOr[String] = js.native
  
  /**
    * Details on how to consolidate related actions that make up the activity.
    * If not set, then related actions will not be consolidated.
    */
  var consolidationStrategy: js.UndefOr[SchemaConsolidationStrategy] = js.native
  
  /**
    * The filtering for items returned from this query request. The format of
    * the filter string is a sequence of expressions, joined by an optional
    * &quot;AND&quot;, where each expression is of the form &quot;field
    * operator value&quot;.  Supported fields:    - &lt;tt&gt;time&lt;/tt&gt;:
    * Uses numerical operators on date values either in     terms of
    * milliseconds since Jan 1, 1970 or in RFC 3339 format.     Examples: -
    * &lt;tt&gt;time &gt; 1452409200000 AND time &lt;= 1492812924310&lt;/tt&gt;
    * - &lt;tt&gt;time &gt;= &quot;2016-01-10T01:02:03-05:00&quot;&lt;/tt&gt;
    * - &lt;tt&gt;detail.action_detail_case&lt;/tt&gt;: Uses the
    * &quot;has&quot; operator (:) and     either a singular value or a list of
    * allowed action types enclosed in     parentheses.     Examples:       -
    * &lt;tt&gt;detail.action_detail_case: RENAME&lt;/tt&gt;       -
    * &lt;tt&gt;detail.action_detail_case:(CREATE UPLOAD)&lt;/tt&gt;       -
    * &lt;tt&gt;-detail.action_detail_case:MOVE&lt;/tt&gt;
    */
  var filter: js.UndefOr[String] = js.native
  
  /**
    * Return activities for this Drive item. The format is
    * &quot;items/ITEM_ID&quot;.
    */
  var itemName: js.UndefOr[String] = js.native
  
  /**
    * The requested number of activity to return. If not set, a default value
    * will be used.
    */
  var pageSize: js.UndefOr[Double] = js.native
  
  /**
    * The next_page_token value returned from a previous QueryDriveActivity
    * request, if any.
    */
  var pageToken: js.UndefOr[String] = js.native
}
object SchemaQueryDriveActivityRequest {
  
  @scala.inline
  def apply(): SchemaQueryDriveActivityRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaQueryDriveActivityRequest]
  }
  
  @scala.inline
  implicit class SchemaQueryDriveActivityRequestMutableBuilder[Self <: SchemaQueryDriveActivityRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAncestorName(value: String): Self = StObject.set(x, "ancestorName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAncestorNameUndefined: Self = StObject.set(x, "ancestorName", js.undefined)
    
    @scala.inline
    def setConsolidationStrategy(value: SchemaConsolidationStrategy): Self = StObject.set(x, "consolidationStrategy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConsolidationStrategyUndefined: Self = StObject.set(x, "consolidationStrategy", js.undefined)
    
    @scala.inline
    def setFilter(value: String): Self = StObject.set(x, "filter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFilterUndefined: Self = StObject.set(x, "filter", js.undefined)
    
    @scala.inline
    def setItemName(value: String): Self = StObject.set(x, "itemName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItemNameUndefined: Self = StObject.set(x, "itemName", js.undefined)
    
    @scala.inline
    def setPageSize(value: Double): Self = StObject.set(x, "pageSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPageSizeUndefined: Self = StObject.set(x, "pageSize", js.undefined)
    
    @scala.inline
    def setPageToken(value: String): Self = StObject.set(x, "pageToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPageTokenUndefined: Self = StObject.set(x, "pageToken", js.undefined)
  }
}
