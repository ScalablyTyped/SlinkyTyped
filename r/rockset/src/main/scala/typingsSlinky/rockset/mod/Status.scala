package typingsSlinky.rockset.mod

import typingsSlinky.rockset.rocksetStrings.COMPLETED
import typingsSlinky.rockset.rocksetStrings.ERROR
import typingsSlinky.rockset.rocksetStrings.INITIALIZING
import typingsSlinky.rockset.rocksetStrings.PROCESSING
import typingsSlinky.rockset.rocksetStrings.WATCHING
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Status extends StObject {
  
  // ISO-8601 date when last error occurred
  var last_error_at: js.UndefOr[String] = js.native
  
  // last source item that errored
  var last_error_item: js.UndefOr[String] = js.native
  
  // reason for the last error
  var last_error_reason: js.UndefOr[String] = js.native
  
  // ISO-8601 date when source was last processed
  var last_processed_at: js.UndefOr[String] = js.native
  
  // last source item processed by ingester
  var last_processed_item: js.UndefOr[String] = js.native
  
  // state message
  var message: js.UndefOr[String] = js.native
  
  // ISO-8601 date when state was triggered
  var since: js.UndefOr[String] = js.native
  
  // Status of the Source's ingestion, one of: INITIALIZING, WATCHING, PROCESSING, COMPLETED, ERROR
  var state: js.UndefOr[INITIALIZING | WATCHING | PROCESSING | COMPLETED | ERROR] = js.native
  
  // Total items that errored
  var total_error_items: js.UndefOr[Double] = js.native
  
  // Total items processed of source
  var total_processed_items: js.UndefOr[Double] = js.native
}
object Status {
  
  @scala.inline
  def apply(): Status = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Status]
  }
  
  @scala.inline
  implicit class StatusMutableBuilder[Self <: Status] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLast_error_at(value: String): Self = StObject.set(x, "last_error_at", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLast_error_atUndefined: Self = StObject.set(x, "last_error_at", js.undefined)
    
    @scala.inline
    def setLast_error_item(value: String): Self = StObject.set(x, "last_error_item", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLast_error_itemUndefined: Self = StObject.set(x, "last_error_item", js.undefined)
    
    @scala.inline
    def setLast_error_reason(value: String): Self = StObject.set(x, "last_error_reason", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLast_error_reasonUndefined: Self = StObject.set(x, "last_error_reason", js.undefined)
    
    @scala.inline
    def setLast_processed_at(value: String): Self = StObject.set(x, "last_processed_at", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLast_processed_atUndefined: Self = StObject.set(x, "last_processed_at", js.undefined)
    
    @scala.inline
    def setLast_processed_item(value: String): Self = StObject.set(x, "last_processed_item", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLast_processed_itemUndefined: Self = StObject.set(x, "last_processed_item", js.undefined)
    
    @scala.inline
    def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMessageUndefined: Self = StObject.set(x, "message", js.undefined)
    
    @scala.inline
    def setSince(value: String): Self = StObject.set(x, "since", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSinceUndefined: Self = StObject.set(x, "since", js.undefined)
    
    @scala.inline
    def setState(value: INITIALIZING | WATCHING | PROCESSING | COMPLETED | ERROR): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStateUndefined: Self = StObject.set(x, "state", js.undefined)
    
    @scala.inline
    def setTotal_error_items(value: Double): Self = StObject.set(x, "total_error_items", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTotal_error_itemsUndefined: Self = StObject.set(x, "total_error_items", js.undefined)
    
    @scala.inline
    def setTotal_processed_items(value: Double): Self = StObject.set(x, "total_processed_items", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTotal_processed_itemsUndefined: Self = StObject.set(x, "total_processed_items", js.undefined)
  }
}
