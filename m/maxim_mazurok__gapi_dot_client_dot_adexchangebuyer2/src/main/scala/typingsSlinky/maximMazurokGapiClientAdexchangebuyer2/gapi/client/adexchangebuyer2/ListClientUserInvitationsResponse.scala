package typingsSlinky.maximMazurokGapiClientAdexchangebuyer2.gapi.client.adexchangebuyer2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListClientUserInvitationsResponse extends StObject {
  
  /** The returned list of client users. */
  var invitations: js.UndefOr[js.Array[ClientUserInvitation]] = js.native
  
  /**
    * A token to retrieve the next page of results. Pass this value in the ListClientUserInvitationsRequest.pageToken field in the subsequent call to the clients.invitations.list method
    * to retrieve the next page of results.
    */
  var nextPageToken: js.UndefOr[String] = js.native
}
object ListClientUserInvitationsResponse {
  
  @scala.inline
  def apply(): ListClientUserInvitationsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListClientUserInvitationsResponse]
  }
  
  @scala.inline
  implicit class ListClientUserInvitationsResponseMutableBuilder[Self <: ListClientUserInvitationsResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setInvitations(value: js.Array[ClientUserInvitation]): Self = StObject.set(x, "invitations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInvitationsUndefined: Self = StObject.set(x, "invitations", js.undefined)
    
    @scala.inline
    def setInvitationsVarargs(value: ClientUserInvitation*): Self = StObject.set(x, "invitations", js.Array(value :_*))
    
    @scala.inline
    def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
  }
}
