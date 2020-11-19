package typingsSlinky.gapiClientAdexchangebuyer2.gapi.client.adexchangebuyer2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Client extends js.Object {
  
  /**
    * The globally-unique numerical ID of the client.
    * The value of this field is ignored in create and update operations.
    */
  var clientAccountId: js.UndefOr[String] = js.native
  
  /**
    * Name used to represent this client to publishers.
    * You may have multiple clients that map to the same entity,
    * but for each client the combination of `clientName` and entity
    * must be unique.
    * You can specify this field as empty.
    */
  var clientName: js.UndefOr[String] = js.native
  
  /**
    * Numerical identifier of the client entity.
    * The entity can be an advertiser, a brand, or an agency.
    * This identifier is unique among all the entities with the same type.
    *
    * A list of all known advertisers with their identifiers is available in the
    * [advertisers.txt](https://storage.googleapis.com/adx-rtb-dictionaries/advertisers.txt)
    * file.
    *
    * A list of all known brands with their identifiers is available in the
    * [brands.txt](https://storage.googleapis.com/adx-rtb-dictionaries/brands.txt)
    * file.
    *
    * A list of all known agencies with their identifiers is available in the
    * [agencies.txt](https://storage.googleapis.com/adx-rtb-dictionaries/agencies.txt)
    * file.
    */
  var entityId: js.UndefOr[String] = js.native
  
  /**
    * The name of the entity. This field is automatically fetched based on
    * the type and ID.
    * The value of this field is ignored in create and update operations.
    */
  var entityName: js.UndefOr[String] = js.native
  
  /** The type of the client entity: `ADVERTISER`, `BRAND`, or `AGENCY`. */
  var entityType: js.UndefOr[String] = js.native
  
  /**
    * The role which is assigned to the client buyer. Each role implies a set of
    * permissions granted to the client. Must be one of `CLIENT_DEAL_VIEWER`,
    * `CLIENT_DEAL_NEGOTIATOR` or `CLIENT_DEAL_APPROVER`.
    */
  var role: js.UndefOr[String] = js.native
  
  /** The status of the client buyer. */
  var status: js.UndefOr[String] = js.native
  
  /** Whether the client buyer will be visible to sellers. */
  var visibleToSeller: js.UndefOr[Boolean] = js.native
}
object Client {
  
  @scala.inline
  def apply(): Client = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Client]
  }
  
  @scala.inline
  implicit class ClientOps[Self <: Client] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setClientAccountId(value: String): Self = this.set("clientAccountId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClientAccountId: Self = this.set("clientAccountId", js.undefined)
    
    @scala.inline
    def setClientName(value: String): Self = this.set("clientName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClientName: Self = this.set("clientName", js.undefined)
    
    @scala.inline
    def setEntityId(value: String): Self = this.set("entityId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEntityId: Self = this.set("entityId", js.undefined)
    
    @scala.inline
    def setEntityName(value: String): Self = this.set("entityName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEntityName: Self = this.set("entityName", js.undefined)
    
    @scala.inline
    def setEntityType(value: String): Self = this.set("entityType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEntityType: Self = this.set("entityType", js.undefined)
    
    @scala.inline
    def setRole(value: String): Self = this.set("role", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRole: Self = this.set("role", js.undefined)
    
    @scala.inline
    def setStatus(value: String): Self = this.set("status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStatus: Self = this.set("status", js.undefined)
    
    @scala.inline
    def setVisibleToSeller(value: Boolean): Self = this.set("visibleToSeller", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVisibleToSeller: Self = this.set("visibleToSeller", js.undefined)
  }
}
