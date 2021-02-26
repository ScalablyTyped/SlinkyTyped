package typingsSlinky.nodeZendesk.mod.Users

import typingsSlinky.nodeZendesk.mod.AuditableModel
import typingsSlinky.nodeZendesk.mod.PaginablePayload
import typingsSlinky.nodeZendesk.mod.ZendeskCallback
import typingsSlinky.nodeZendesk.mod.ZendeskID
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * @see {@link https://developer.zendesk.com/rest_api/docs/support/user_identities|Zendesk User Identities}
  */
object Identities {
  
  @js.native
  trait CreateModel extends StObject {
    
    var primary: js.UndefOr[Boolean] = js.native
    
    var `type`: IdentityType = js.native
    
    var value: String = js.native
    
    var verified: js.UndefOr[Boolean] = js.native
  }
  object CreateModel {
    
    @scala.inline
    def apply(`type`: IdentityType, value: String): typingsSlinky.nodeZendesk.mod.Users.Identities.CreateModel = {
      val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsSlinky.nodeZendesk.mod.Users.Identities.CreateModel]
    }
    
    @scala.inline
    implicit class CreateModelMutableBuilder[Self <: typingsSlinky.nodeZendesk.mod.Users.Identities.CreateModel] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setPrimary(value: Boolean): Self = StObject.set(x, "primary", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPrimaryUndefined: Self = StObject.set(x, "primary", js.undefined)
      
      @scala.inline
      def setType(value: IdentityType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVerified(value: Boolean): Self = StObject.set(x, "verified", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVerifiedUndefined: Self = StObject.set(x, "verified", js.undefined)
    }
  }
  
  @js.native
  trait CreatePayload extends StObject {
    
    val identity: typingsSlinky.nodeZendesk.mod.Users.Identities.CreateModel = js.native
  }
  object CreatePayload {
    
    @scala.inline
    def apply(identity: typingsSlinky.nodeZendesk.mod.Users.Identities.CreateModel): typingsSlinky.nodeZendesk.mod.Users.Identities.CreatePayload = {
      val __obj = js.Dynamic.literal(identity = identity.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsSlinky.nodeZendesk.mod.Users.Identities.CreatePayload]
    }
    
    @scala.inline
    implicit class CreatePayloadMutableBuilder[Self <: typingsSlinky.nodeZendesk.mod.Users.Identities.CreatePayload] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setIdentity(value: typingsSlinky.nodeZendesk.mod.Users.Identities.CreateModel): Self = StObject.set(x, "identity", value.asInstanceOf[js.Any])
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.nodeZendesk.nodeZendeskStrings.deliverable
    - typingsSlinky.nodeZendesk.nodeZendeskStrings.undeliverable
  */
  trait DeliverableState extends StObject
  object DeliverableState {
    
    @scala.inline
    def deliverable: typingsSlinky.nodeZendesk.nodeZendeskStrings.deliverable = "deliverable".asInstanceOf[typingsSlinky.nodeZendesk.nodeZendeskStrings.deliverable]
    
    @scala.inline
    def undeliverable: typingsSlinky.nodeZendesk.nodeZendeskStrings.undeliverable = "undeliverable".asInstanceOf[typingsSlinky.nodeZendesk.nodeZendeskStrings.undeliverable]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.nodeZendesk.nodeZendeskStrings.agent_forwarding
    - typingsSlinky.nodeZendesk.nodeZendeskStrings.email
    - typingsSlinky.nodeZendesk.nodeZendeskStrings.facebook
    - typingsSlinky.nodeZendesk.nodeZendeskStrings.google
    - typingsSlinky.nodeZendesk.nodeZendeskStrings.phone_number
    - typingsSlinky.nodeZendesk.nodeZendeskStrings.sdk
  */
  trait IdentityType extends StObject
  object IdentityType {
    
    @scala.inline
    def agent_forwarding: typingsSlinky.nodeZendesk.nodeZendeskStrings.agent_forwarding = "agent_forwarding".asInstanceOf[typingsSlinky.nodeZendesk.nodeZendeskStrings.agent_forwarding]
    
    @scala.inline
    def email: typingsSlinky.nodeZendesk.nodeZendeskStrings.email = "email".asInstanceOf[typingsSlinky.nodeZendesk.nodeZendeskStrings.email]
    
    @scala.inline
    def facebook: typingsSlinky.nodeZendesk.nodeZendeskStrings.facebook = "facebook".asInstanceOf[typingsSlinky.nodeZendesk.nodeZendeskStrings.facebook]
    
    @scala.inline
    def google: typingsSlinky.nodeZendesk.nodeZendeskStrings.google = "google".asInstanceOf[typingsSlinky.nodeZendesk.nodeZendeskStrings.google]
    
    @scala.inline
    def phone_number: typingsSlinky.nodeZendesk.nodeZendeskStrings.phone_number = "phone_number".asInstanceOf[typingsSlinky.nodeZendesk.nodeZendeskStrings.phone_number]
    
    @scala.inline
    def sdk: typingsSlinky.nodeZendesk.nodeZendeskStrings.sdk = "sdk".asInstanceOf[typingsSlinky.nodeZendesk.nodeZendeskStrings.sdk]
  }
  
  @js.native
  trait ListPayload extends PaginablePayload {
    
    val identities: js.Array[typingsSlinky.nodeZendesk.mod.Users.Identities.ResponseModel] = js.native
  }
  object ListPayload {
    
    @scala.inline
    def apply(count: Double, identities: js.Array[typingsSlinky.nodeZendesk.mod.Users.Identities.ResponseModel]): typingsSlinky.nodeZendesk.mod.Users.Identities.ListPayload = {
      val __obj = js.Dynamic.literal(count = count.asInstanceOf[js.Any], identities = identities.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsSlinky.nodeZendesk.mod.Users.Identities.ListPayload]
    }
    
    @scala.inline
    implicit class ListPayloadMutableBuilder[Self <: typingsSlinky.nodeZendesk.mod.Users.Identities.ListPayload] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setIdentities(value: js.Array[typingsSlinky.nodeZendesk.mod.Users.Identities.ResponseModel]): Self = StObject.set(x, "identities", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIdentitiesVarargs(value: typingsSlinky.nodeZendesk.mod.Users.Identities.ResponseModel*): Self = StObject.set(x, "identities", js.Array(value :_*))
    }
  }
  
  @js.native
  trait Methods extends StObject {
    
    def create(userId: ZendeskID, identity: typingsSlinky.nodeZendesk.mod.Users.Identities.CreatePayload): js.Promise[typingsSlinky.nodeZendesk.mod.Users.Identities.ResponseModel] = js.native
    /** Creating Identities */
    def create(
      userId: ZendeskID,
      identity: typingsSlinky.nodeZendesk.mod.Users.Identities.CreatePayload,
      cb: ZendeskCallback[_, _]
    ): typingsSlinky.nodeZendesk.mod.Users.Identities.ResponseModel = js.native
    
    def delete(userId: ZendeskID, identityId: ZendeskID): js.Promise[_] = js.native
    /** Deleting Identities */
    def delete(userId: ZendeskID, identityId: ZendeskID, cb: ZendeskCallback[_, _]): js.Any = js.native
    
    def list(userId: ZendeskID): js.Promise[typingsSlinky.nodeZendesk.mod.Users.Identities.ListPayload] = js.native
    /** Listing Identities */
    def list(userId: ZendeskID, cb: ZendeskCallback[_, _]): typingsSlinky.nodeZendesk.mod.Users.Identities.ListPayload = js.native
    
    def makePrimary(userId: ZendeskID, identityId: ZendeskID): js.Promise[typingsSlinky.nodeZendesk.mod.Users.Identities.ListPayload] = js.native
    def makePrimary(userId: ZendeskID, identityId: ZendeskID, cb: ZendeskCallback[_, _]): typingsSlinky.nodeZendesk.mod.Users.Identities.ListPayload = js.native
    
    def requestVerification(userId: ZendeskID, identityId: ZendeskID): js.Promise[_] = js.native
    def requestVerification(userId: ZendeskID, identityId: ZendeskID, cb: ZendeskCallback[_, _]): js.Any = js.native
    
    def show(userId: ZendeskID, identityId: ZendeskID): js.Promise[typingsSlinky.nodeZendesk.mod.Users.Identities.ResponsePayload] = js.native
    /** Viewing Identities */
    def show(userId: ZendeskID, identityId: ZendeskID, cb: ZendeskCallback[_, _]): typingsSlinky.nodeZendesk.mod.Users.Identities.ResponsePayload = js.native
    
    def update(
      userId: ZendeskID,
      identityId: ZendeskID,
      identity: typingsSlinky.nodeZendesk.mod.Users.Identities.UpdatePayload
    ): js.Promise[typingsSlinky.nodeZendesk.mod.Users.Identities.ResponsePayload] = js.native
    /** Updating Identities */
    def update(
      userId: ZendeskID,
      identityId: ZendeskID,
      identity: typingsSlinky.nodeZendesk.mod.Users.Identities.UpdatePayload,
      cb: ZendeskCallback[_, _]
    ): typingsSlinky.nodeZendesk.mod.Users.Identities.ResponsePayload = js.native
    
    def verify(userId: ZendeskID, identityId: ZendeskID): js.Promise[typingsSlinky.nodeZendesk.mod.Users.Identities.ResponsePayload] = js.native
    def verify(userId: ZendeskID, identityId: ZendeskID, cb: ZendeskCallback[_, _]): typingsSlinky.nodeZendesk.mod.Users.Identities.ResponsePayload = js.native
  }
  
  @js.native
  trait ResponseModel extends AuditableModel {
    
    val deliverable_state: DeliverableState = js.native
    
    val primary: Boolean = js.native
    
    val `type`: IdentityType = js.native
    
    val undeliverable_count: Double = js.native
    
    val url: String = js.native
    
    val user_id: ZendeskID = js.native
    
    val value: String = js.native
    
    val verified: Boolean = js.native
  }
  object ResponseModel {
    
    @scala.inline
    def apply(
      created_at: String,
      deliverable_state: DeliverableState,
      id: ZendeskID,
      primary: Boolean,
      `type`: IdentityType,
      undeliverable_count: Double,
      url: String,
      user_id: ZendeskID,
      value: String,
      verified: Boolean
    ): typingsSlinky.nodeZendesk.mod.Users.Identities.ResponseModel = {
      val __obj = js.Dynamic.literal(created_at = created_at.asInstanceOf[js.Any], deliverable_state = deliverable_state.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], primary = primary.asInstanceOf[js.Any], undeliverable_count = undeliverable_count.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any], user_id = user_id.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any], verified = verified.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsSlinky.nodeZendesk.mod.Users.Identities.ResponseModel]
    }
    
    @scala.inline
    implicit class ResponseModelMutableBuilder[Self <: typingsSlinky.nodeZendesk.mod.Users.Identities.ResponseModel] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDeliverable_state(value: DeliverableState): Self = StObject.set(x, "deliverable_state", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPrimary(value: Boolean): Self = StObject.set(x, "primary", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setType(value: IdentityType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUndeliverable_count(value: Double): Self = StObject.set(x, "undeliverable_count", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUser_id(value: ZendeskID): Self = StObject.set(x, "user_id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVerified(value: Boolean): Self = StObject.set(x, "verified", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait ResponsePayload extends StObject {
    
    val identity: typingsSlinky.nodeZendesk.mod.Users.Identities.ResponseModel = js.native
  }
  object ResponsePayload {
    
    @scala.inline
    def apply(identity: typingsSlinky.nodeZendesk.mod.Users.Identities.ResponseModel): typingsSlinky.nodeZendesk.mod.Users.Identities.ResponsePayload = {
      val __obj = js.Dynamic.literal(identity = identity.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsSlinky.nodeZendesk.mod.Users.Identities.ResponsePayload]
    }
    
    @scala.inline
    implicit class ResponsePayloadMutableBuilder[Self <: typingsSlinky.nodeZendesk.mod.Users.Identities.ResponsePayload] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setIdentity(value: typingsSlinky.nodeZendesk.mod.Users.Identities.ResponseModel): Self = StObject.set(x, "identity", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait UpdateModel extends StObject {
    
    var value: js.UndefOr[String] = js.native
    
    var verified: js.UndefOr[Boolean] = js.native
  }
  object UpdateModel {
    
    @scala.inline
    def apply(): typingsSlinky.nodeZendesk.mod.Users.Identities.UpdateModel = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[typingsSlinky.nodeZendesk.mod.Users.Identities.UpdateModel]
    }
    
    @scala.inline
    implicit class UpdateModelMutableBuilder[Self <: typingsSlinky.nodeZendesk.mod.Users.Identities.UpdateModel] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
      
      @scala.inline
      def setVerified(value: Boolean): Self = StObject.set(x, "verified", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVerifiedUndefined: Self = StObject.set(x, "verified", js.undefined)
    }
  }
  
  @js.native
  trait UpdatePayload extends StObject {
    
    val identity: typingsSlinky.nodeZendesk.mod.Users.Identities.UpdateModel = js.native
  }
  object UpdatePayload {
    
    @scala.inline
    def apply(identity: typingsSlinky.nodeZendesk.mod.Users.Identities.UpdateModel): typingsSlinky.nodeZendesk.mod.Users.Identities.UpdatePayload = {
      val __obj = js.Dynamic.literal(identity = identity.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsSlinky.nodeZendesk.mod.Users.Identities.UpdatePayload]
    }
    
    @scala.inline
    implicit class UpdatePayloadMutableBuilder[Self <: typingsSlinky.nodeZendesk.mod.Users.Identities.UpdatePayload] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setIdentity(value: typingsSlinky.nodeZendesk.mod.Users.Identities.UpdateModel): Self = StObject.set(x, "identity", value.asInstanceOf[js.Any])
    }
  }
}
