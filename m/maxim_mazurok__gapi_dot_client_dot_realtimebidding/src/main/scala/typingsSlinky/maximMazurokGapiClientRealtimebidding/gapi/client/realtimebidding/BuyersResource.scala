package typingsSlinky.maximMazurokGapiClientRealtimebidding.gapi.client.realtimebidding

import typingsSlinky.gapiClient.gapi.client.Request
import typingsSlinky.maximMazurokGapiClientRealtimebidding.anon.QuotaUser
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BuyersResource extends js.Object {
  
  var creatives: CreativesResource = js.native
  
  /**
    * Gets remarketing tag for a buyer. A remarketing tag is a piece of JavaScript code that can be placed on a web page. When a user visits a page containing a remarketing tag, Google
    * adds the user to a user list.
    */
  def getRemarketingTag(): Request[GetRemarketingTagResponse] = js.native
  def getRemarketingTag(request: QuotaUser): Request[GetRemarketingTagResponse] = js.native
  
  var userLists: UserListsResource = js.native
}
