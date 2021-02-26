package typingsSlinky.mongodb.mod

import typingsSlinky.mongodb.anon.`3`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CollectionAggregationOptions extends StObject {
  
  /**
    * Lets the server know if it can use disk to store
    * temporary results for the aggregation (requires mongodb 2.6 >).
    */
  var allowDiskUse: js.UndefOr[Boolean] = js.native
  
  /**
    * Allow driver to bypass schema validation in MongoDB 3.2 or higher.
    */
  var bypassDocumentValidation: js.UndefOr[Boolean] = js.native
  
  var collation: js.UndefOr[CollationDocument] = js.native
  
  var comment: js.UndefOr[String] = js.native
  
  /**
    * Return the query as cursor, on 2.6 > it returns as a real cursor
    * on pre 2.6 it returns as an emulated cursor.
    */
  var cursor: js.UndefOr[`3`] = js.native
  
  /**
    * Explain returns the aggregation execution plan (requires mongodb 2.6 >).
    */
  var explain: js.UndefOr[Boolean] = js.native
  
  var hint: js.UndefOr[String | js.Object] = js.native
  
  /**
    * specifies a cumulative time limit in milliseconds for processing operations
    * on the cursor. MongoDB interrupts the operation at the earliest following interrupt point.
    */
  var maxTimeMS: js.UndefOr[scala.Double] = js.native
  
  var promoteBuffers: js.UndefOr[Boolean] = js.native
  
  var promoteLongs: js.UndefOr[Boolean] = js.native
  
  var promoteValues: js.UndefOr[Boolean] = js.native
  
  var raw: js.UndefOr[Boolean] = js.native
  
  var readPreference: js.UndefOr[ReadPreferenceOrMode] = js.native
  
  var session: js.UndefOr[ClientSession] = js.native
}
object CollectionAggregationOptions {
  
  @scala.inline
  def apply(): CollectionAggregationOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CollectionAggregationOptions]
  }
  
  @scala.inline
  implicit class CollectionAggregationOptionsMutableBuilder[Self <: CollectionAggregationOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAllowDiskUse(value: Boolean): Self = StObject.set(x, "allowDiskUse", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAllowDiskUseUndefined: Self = StObject.set(x, "allowDiskUse", js.undefined)
    
    @scala.inline
    def setBypassDocumentValidation(value: Boolean): Self = StObject.set(x, "bypassDocumentValidation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBypassDocumentValidationUndefined: Self = StObject.set(x, "bypassDocumentValidation", js.undefined)
    
    @scala.inline
    def setCollation(value: CollationDocument): Self = StObject.set(x, "collation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCollationUndefined: Self = StObject.set(x, "collation", js.undefined)
    
    @scala.inline
    def setComment(value: String): Self = StObject.set(x, "comment", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCommentUndefined: Self = StObject.set(x, "comment", js.undefined)
    
    @scala.inline
    def setCursor(value: `3`): Self = StObject.set(x, "cursor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCursorUndefined: Self = StObject.set(x, "cursor", js.undefined)
    
    @scala.inline
    def setExplain(value: Boolean): Self = StObject.set(x, "explain", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExplainUndefined: Self = StObject.set(x, "explain", js.undefined)
    
    @scala.inline
    def setHint(value: String | js.Object): Self = StObject.set(x, "hint", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHintUndefined: Self = StObject.set(x, "hint", js.undefined)
    
    @scala.inline
    def setMaxTimeMS(value: scala.Double): Self = StObject.set(x, "maxTimeMS", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxTimeMSUndefined: Self = StObject.set(x, "maxTimeMS", js.undefined)
    
    @scala.inline
    def setPromoteBuffers(value: Boolean): Self = StObject.set(x, "promoteBuffers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPromoteBuffersUndefined: Self = StObject.set(x, "promoteBuffers", js.undefined)
    
    @scala.inline
    def setPromoteLongs(value: Boolean): Self = StObject.set(x, "promoteLongs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPromoteLongsUndefined: Self = StObject.set(x, "promoteLongs", js.undefined)
    
    @scala.inline
    def setPromoteValues(value: Boolean): Self = StObject.set(x, "promoteValues", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPromoteValuesUndefined: Self = StObject.set(x, "promoteValues", js.undefined)
    
    @scala.inline
    def setRaw(value: Boolean): Self = StObject.set(x, "raw", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRawUndefined: Self = StObject.set(x, "raw", js.undefined)
    
    @scala.inline
    def setReadPreference(value: ReadPreferenceOrMode): Self = StObject.set(x, "readPreference", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReadPreferenceUndefined: Self = StObject.set(x, "readPreference", js.undefined)
    
    @scala.inline
    def setSession(value: ClientSession): Self = StObject.set(x, "session", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSessionUndefined: Self = StObject.set(x, "session", js.undefined)
  }
}
