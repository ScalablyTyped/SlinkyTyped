package typingsSlinky.nodeZendesk.mod.Requests

import typingsSlinky.nodeZendesk.mod.Attachments.Model
import typingsSlinky.nodeZendesk.mod.PaginablePayload
import typingsSlinky.nodeZendesk.mod.PersistableModel
import typingsSlinky.nodeZendesk.mod.TemporalModel
import typingsSlinky.nodeZendesk.mod.Tickets.Comments.Metadata
import typingsSlinky.nodeZendesk.mod.Tickets.Via
import typingsSlinky.nodeZendesk.mod.ZendeskID
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Comments {
  
  object CommentsUsers {
    
    @js.native
    trait ResponseModel extends PersistableModel {
      
      val agent: Boolean = js.native
      
      val name: String = js.native
      
      val organization_id: Double | Null = js.native
      
      val photo: Model | Null = js.native
    }
    object ResponseModel {
      
      @scala.inline
      def apply(agent: Boolean, id: ZendeskID, name: String): typingsSlinky.nodeZendesk.mod.Requests.Comments.CommentsUsers.ResponseModel = {
        val __obj = js.Dynamic.literal(agent = agent.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
        __obj.asInstanceOf[typingsSlinky.nodeZendesk.mod.Requests.Comments.CommentsUsers.ResponseModel]
      }
      
      @scala.inline
      implicit class ResponseModelMutableBuilder[Self <: typingsSlinky.nodeZendesk.mod.Requests.Comments.CommentsUsers.ResponseModel] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setAgent(value: Boolean): Self = StObject.set(x, "agent", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setOrganization_id(value: Double): Self = StObject.set(x, "organization_id", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setOrganization_idNull: Self = StObject.set(x, "organization_id", null)
        
        @scala.inline
        def setPhoto(value: Model): Self = StObject.set(x, "photo", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setPhotoNull: Self = StObject.set(x, "photo", null)
      }
    }
  }
  
  @js.native
  trait CreateModel extends StObject {
    
    var author_id: js.UndefOr[ZendeskID] = js.native
    
    var body: js.UndefOr[String] = js.native
    
    var html_body: js.UndefOr[String] = js.native
    
    var public: js.UndefOr[Boolean] = js.native
    
    var request_id: js.UndefOr[Double] = js.native
    
    var uploads: js.UndefOr[js.Array[String]] = js.native
    
    var url: js.UndefOr[String] = js.native
  }
  object CreateModel {
    
    @scala.inline
    def apply(): typingsSlinky.nodeZendesk.mod.Requests.Comments.CreateModel = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[typingsSlinky.nodeZendesk.mod.Requests.Comments.CreateModel]
    }
    
    @scala.inline
    implicit class CreateModelMutableBuilder[Self <: typingsSlinky.nodeZendesk.mod.Requests.Comments.CreateModel] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAuthor_id(value: ZendeskID): Self = StObject.set(x, "author_id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAuthor_idUndefined: Self = StObject.set(x, "author_id", js.undefined)
      
      @scala.inline
      def setBody(value: String): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBodyUndefined: Self = StObject.set(x, "body", js.undefined)
      
      @scala.inline
      def setHtml_body(value: String): Self = StObject.set(x, "html_body", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHtml_bodyUndefined: Self = StObject.set(x, "html_body", js.undefined)
      
      @scala.inline
      def setPublic(value: Boolean): Self = StObject.set(x, "public", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPublicUndefined: Self = StObject.set(x, "public", js.undefined)
      
      @scala.inline
      def setRequest_id(value: Double): Self = StObject.set(x, "request_id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRequest_idUndefined: Self = StObject.set(x, "request_id", js.undefined)
      
      @scala.inline
      def setUploads(value: js.Array[String]): Self = StObject.set(x, "uploads", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUploadsUndefined: Self = StObject.set(x, "uploads", js.undefined)
      
      @scala.inline
      def setUploadsVarargs(value: String*): Self = StObject.set(x, "uploads", js.Array(value :_*))
      
      @scala.inline
      def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
    }
  }
  
  @js.native
  trait ListPayload extends PaginablePayload {
    
    var comments: js.Array[typingsSlinky.nodeZendesk.mod.Requests.Comments.ResponseModel] = js.native
    
    var organizations: js.Array[typingsSlinky.nodeZendesk.mod.Tickets.Comments.Organizations.ResponseModel] = js.native
    
    var users: js.Array[typingsSlinky.nodeZendesk.mod.Requests.Comments.CommentsUsers.ResponseModel] = js.native
  }
  object ListPayload {
    
    @scala.inline
    def apply(
      comments: js.Array[typingsSlinky.nodeZendesk.mod.Requests.Comments.ResponseModel],
      count: Double,
      organizations: js.Array[typingsSlinky.nodeZendesk.mod.Tickets.Comments.Organizations.ResponseModel],
      users: js.Array[typingsSlinky.nodeZendesk.mod.Requests.Comments.CommentsUsers.ResponseModel]
    ): typingsSlinky.nodeZendesk.mod.Requests.Comments.ListPayload = {
      val __obj = js.Dynamic.literal(comments = comments.asInstanceOf[js.Any], count = count.asInstanceOf[js.Any], organizations = organizations.asInstanceOf[js.Any], users = users.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsSlinky.nodeZendesk.mod.Requests.Comments.ListPayload]
    }
    
    @scala.inline
    implicit class ListPayloadMutableBuilder[Self <: typingsSlinky.nodeZendesk.mod.Requests.Comments.ListPayload] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setComments(value: js.Array[typingsSlinky.nodeZendesk.mod.Requests.Comments.ResponseModel]): Self = StObject.set(x, "comments", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCommentsVarargs(value: typingsSlinky.nodeZendesk.mod.Requests.Comments.ResponseModel*): Self = StObject.set(x, "comments", js.Array(value :_*))
      
      @scala.inline
      def setOrganizations(value: js.Array[typingsSlinky.nodeZendesk.mod.Tickets.Comments.Organizations.ResponseModel]): Self = StObject.set(x, "organizations", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOrganizationsVarargs(value: typingsSlinky.nodeZendesk.mod.Tickets.Comments.Organizations.ResponseModel*): Self = StObject.set(x, "organizations", js.Array(value :_*))
      
      @scala.inline
      def setUsers(value: js.Array[typingsSlinky.nodeZendesk.mod.Requests.Comments.CommentsUsers.ResponseModel]): Self = StObject.set(x, "users", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUsersVarargs(value: typingsSlinky.nodeZendesk.mod.Requests.Comments.CommentsUsers.ResponseModel*): Self = StObject.set(x, "users", js.Array(value :_*))
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.nodeZendesk.nodeZendeskStrings.Comment
    - typingsSlinky.nodeZendesk.nodeZendeskStrings.VoiceComment
  */
  trait RequestType extends StObject
  object RequestType {
    
    @scala.inline
    def Comment: typingsSlinky.nodeZendesk.nodeZendeskStrings.Comment = "Comment".asInstanceOf[typingsSlinky.nodeZendesk.nodeZendeskStrings.Comment]
    
    @scala.inline
    def VoiceComment: typingsSlinky.nodeZendesk.nodeZendeskStrings.VoiceComment = "VoiceComment".asInstanceOf[typingsSlinky.nodeZendesk.nodeZendeskStrings.VoiceComment]
  }
  
  @js.native
  trait ResponseModel extends TemporalModel {
    
    val attachments: js.Array[Model] = js.native
    
    val author_id: ZendeskID = js.native
    
    val body: String = js.native
    
    val html_body: String = js.native
    
    val metadata: js.UndefOr[Metadata] = js.native
    
    val plain_body: String = js.native
    
    val public: Boolean = js.native
    
    val request_id: Double = js.native
    
    val `type`: RequestType = js.native
    
    val url: String = js.native
    
    val via: js.UndefOr[Via] = js.native
  }
  object ResponseModel {
    
    @scala.inline
    def apply(
      attachments: js.Array[Model],
      author_id: ZendeskID,
      body: String,
      created_at: String,
      html_body: String,
      id: ZendeskID,
      plain_body: String,
      public: Boolean,
      request_id: Double,
      `type`: RequestType,
      url: String
    ): typingsSlinky.nodeZendesk.mod.Requests.Comments.ResponseModel = {
      val __obj = js.Dynamic.literal(attachments = attachments.asInstanceOf[js.Any], author_id = author_id.asInstanceOf[js.Any], body = body.asInstanceOf[js.Any], created_at = created_at.asInstanceOf[js.Any], html_body = html_body.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], plain_body = plain_body.asInstanceOf[js.Any], public = public.asInstanceOf[js.Any], request_id = request_id.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsSlinky.nodeZendesk.mod.Requests.Comments.ResponseModel]
    }
    
    @scala.inline
    implicit class ResponseModelMutableBuilder[Self <: typingsSlinky.nodeZendesk.mod.Requests.Comments.ResponseModel] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAttachments(value: js.Array[Model]): Self = StObject.set(x, "attachments", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAttachmentsVarargs(value: Model*): Self = StObject.set(x, "attachments", js.Array(value :_*))
      
      @scala.inline
      def setAuthor_id(value: ZendeskID): Self = StObject.set(x, "author_id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBody(value: String): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHtml_body(value: String): Self = StObject.set(x, "html_body", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMetadata(value: Metadata): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMetadataUndefined: Self = StObject.set(x, "metadata", js.undefined)
      
      @scala.inline
      def setPlain_body(value: String): Self = StObject.set(x, "plain_body", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPublic(value: Boolean): Self = StObject.set(x, "public", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRequest_id(value: Double): Self = StObject.set(x, "request_id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setType(value: RequestType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVia(value: Via): Self = StObject.set(x, "via", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setViaUndefined: Self = StObject.set(x, "via", js.undefined)
    }
  }
  
  @js.native
  trait ResponsePayload extends StObject {
    
    val comment: typingsSlinky.nodeZendesk.mod.Requests.Comments.ResponseModel = js.native
  }
  object ResponsePayload {
    
    @scala.inline
    def apply(comment: typingsSlinky.nodeZendesk.mod.Requests.Comments.ResponseModel): typingsSlinky.nodeZendesk.mod.Requests.Comments.ResponsePayload = {
      val __obj = js.Dynamic.literal(comment = comment.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsSlinky.nodeZendesk.mod.Requests.Comments.ResponsePayload]
    }
    
    @scala.inline
    implicit class ResponsePayloadMutableBuilder[Self <: typingsSlinky.nodeZendesk.mod.Requests.Comments.ResponsePayload] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setComment(value: typingsSlinky.nodeZendesk.mod.Requests.Comments.ResponseModel): Self = StObject.set(x, "comment", value.asInstanceOf[js.Any])
    }
  }
}
