package typingsSlinky.googleapis.healthcareV1alphaMod.healthcareV1alpha

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Lists the messages in the specified HL7v2 store.
  */
@js.native
trait SchemaListMessagesResponse extends StObject {
  
  /**
    * The returned message names. Won&#39;t be more values than the value of
    * page_size in the request.
    */
  var messages: js.UndefOr[js.Array[String]] = js.native
  
  /**
    * Token to retrieve the next page of results or empty if there are no more
    * results in the list.
    */
  var nextPageToken: js.UndefOr[String] = js.native
}
object SchemaListMessagesResponse {
  
  @scala.inline
  def apply(): SchemaListMessagesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaListMessagesResponse]
  }
  
  @scala.inline
  implicit class SchemaListMessagesResponseMutableBuilder[Self <: SchemaListMessagesResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMessages(value: js.Array[String]): Self = StObject.set(x, "messages", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMessagesUndefined: Self = StObject.set(x, "messages", js.undefined)
    
    @scala.inline
    def setMessagesVarargs(value: String*): Self = StObject.set(x, "messages", js.Array(value :_*))
    
    @scala.inline
    def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
  }
}
