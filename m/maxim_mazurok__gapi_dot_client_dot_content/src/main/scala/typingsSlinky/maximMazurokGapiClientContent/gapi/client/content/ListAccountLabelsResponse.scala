package typingsSlinky.maximMazurokGapiClientContent.gapi.client.content

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListAccountLabelsResponse extends StObject {
  
  /** The labels from the specified account. */
  var accountLabels: js.UndefOr[js.Array[AccountLabel]] = js.native
  
  /** A token, which can be sent as `page_token` to retrieve the next page. If this field is omitted, there are no subsequent pages. */
  var nextPageToken: js.UndefOr[String] = js.native
}
object ListAccountLabelsResponse {
  
  @scala.inline
  def apply(): ListAccountLabelsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListAccountLabelsResponse]
  }
  
  @scala.inline
  implicit class ListAccountLabelsResponseMutableBuilder[Self <: ListAccountLabelsResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAccountLabels(value: js.Array[AccountLabel]): Self = StObject.set(x, "accountLabels", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAccountLabelsUndefined: Self = StObject.set(x, "accountLabels", js.undefined)
    
    @scala.inline
    def setAccountLabelsVarargs(value: AccountLabel*): Self = StObject.set(x, "accountLabels", js.Array(value :_*))
    
    @scala.inline
    def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
  }
}
