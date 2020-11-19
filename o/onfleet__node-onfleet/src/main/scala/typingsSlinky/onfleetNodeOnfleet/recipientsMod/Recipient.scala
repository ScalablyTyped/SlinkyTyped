package typingsSlinky.onfleetNodeOnfleet.recipientsMod

import typingsSlinky.onfleetNodeOnfleet.anon.PartialCreateRecipientPro
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Recipient extends js.Object {
  
  def create(recipient: CreateRecipientProps): js.Promise[OnfleetRecipient] = js.native
  
  def get(queryOrId: String): js.Promise[OnfleetRecipient] = js.native
  def get(queryOrId: String, queryKey: RecipientQueryKey): js.Promise[OnfleetRecipient] = js.native
  
  def update(id: String, recipient: PartialCreateRecipientPro): js.Promise[OnfleetRecipient] = js.native
}
