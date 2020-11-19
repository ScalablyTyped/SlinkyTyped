package typingsSlinky.nodeZendesk.mod.Users

import typingsSlinky.nodeZendesk.mod.ZendeskID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait _UpdateIdPayload extends js.Object
object _UpdateIdPayload {
  
  @scala.inline
  def Ids(ids: js.Array[ZendeskID]): _UpdateIdPayload = {
    val __obj = js.Dynamic.literal(ids = ids.asInstanceOf[js.Any])
    __obj.asInstanceOf[_UpdateIdPayload]
  }
  
  @scala.inline
  def Externalids(external_ids: js.Array[ZendeskID]): _UpdateIdPayload = {
    val __obj = js.Dynamic.literal(external_ids = external_ids.asInstanceOf[js.Any])
    __obj.asInstanceOf[_UpdateIdPayload]
  }
}
