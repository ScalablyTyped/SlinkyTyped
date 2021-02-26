package typingsSlinky.fontoxml

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object com_ {
  
  object fontoxml {
    
    @js.native
    trait IFontoMessageEventData extends StObject {
      
      var command: String = js.native
      
      var metadata: js.Any = js.native
      
      var scope: IInvocator = js.native
      
      var `type`: String = js.native
    }
    object IFontoMessageEventData {
      
      @scala.inline
      def apply(command: String, metadata: js.Any, scope: IInvocator, `type`: String): IFontoMessageEventData = {
        val __obj = js.Dynamic.literal(command = command.asInstanceOf[js.Any], metadata = metadata.asInstanceOf[js.Any], scope = scope.asInstanceOf[js.Any])
        __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
        __obj.asInstanceOf[IFontoMessageEventData]
      }
      
      @scala.inline
      implicit class IFontoMessageEventDataMutableBuilder[Self <: IFontoMessageEventData] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setCommand(value: String): Self = StObject.set(x, "command", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setMetadata(value: js.Any): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setScope(value: IInvocator): Self = StObject.set(x, "scope", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      }
    }
    
    @js.native
    trait IInvocator extends StObject {
      
      //Allow/disallow auto-save functionality.
      var autosave: js.UndefOr[Boolean] = js.native
      
      //The base URL where the CMS endpoints are exposed.
      var cmsBaseUrl: String = js.native
      
      //The document id's of the documents to load from the CMS.
      var documentIds: js.Array[String] = js.native
      
      //The edit session token to use for accessing the CMS endpoints.
      var editSessionToken: String = js.native
      
      //If set to a positive integer, enable the Heartbeat API to send every x seconds.
      var heartbeat: js.UndefOr[Double] = js.native
      
      //User information.
      var user: js.UndefOr[IUserInfo] = js.native
      
      //Workflow information.
      var workflow: js.UndefOr[IWorkflowInfo] = js.native
    }
    object IInvocator {
      
      @scala.inline
      def apply(cmsBaseUrl: String, documentIds: js.Array[String], editSessionToken: String): IInvocator = {
        val __obj = js.Dynamic.literal(cmsBaseUrl = cmsBaseUrl.asInstanceOf[js.Any], documentIds = documentIds.asInstanceOf[js.Any], editSessionToken = editSessionToken.asInstanceOf[js.Any])
        __obj.asInstanceOf[IInvocator]
      }
      
      @scala.inline
      implicit class IInvocatorMutableBuilder[Self <: IInvocator] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setAutosave(value: Boolean): Self = StObject.set(x, "autosave", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setAutosaveUndefined: Self = StObject.set(x, "autosave", js.undefined)
        
        @scala.inline
        def setCmsBaseUrl(value: String): Self = StObject.set(x, "cmsBaseUrl", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setDocumentIds(value: js.Array[String]): Self = StObject.set(x, "documentIds", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setDocumentIdsVarargs(value: String*): Self = StObject.set(x, "documentIds", js.Array(value :_*))
        
        @scala.inline
        def setEditSessionToken(value: String): Self = StObject.set(x, "editSessionToken", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setHeartbeat(value: Double): Self = StObject.set(x, "heartbeat", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setHeartbeatUndefined: Self = StObject.set(x, "heartbeat", js.undefined)
        
        @scala.inline
        def setUser(value: IUserInfo): Self = StObject.set(x, "user", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setUserUndefined: Self = StObject.set(x, "user", js.undefined)
        
        @scala.inline
        def setWorkflow(value: IWorkflowInfo): Self = StObject.set(x, "workflow", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setWorkflowUndefined: Self = StObject.set(x, "workflow", js.undefined)
      }
    }
    
    @js.native
    trait IUserInfo extends IWorkflowInfo {
      
      var roleId: String = js.native
    }
    object IUserInfo {
      
      @scala.inline
      def apply(displayName: String, id: String, roleId: String): IUserInfo = {
        val __obj = js.Dynamic.literal(displayName = displayName.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], roleId = roleId.asInstanceOf[js.Any])
        __obj.asInstanceOf[IUserInfo]
      }
      
      @scala.inline
      implicit class IUserInfoMutableBuilder[Self <: IUserInfo] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setRoleId(value: String): Self = StObject.set(x, "roleId", value.asInstanceOf[js.Any])
      }
    }
    
    @js.native
    trait IWorkflowInfo extends StObject {
      
      var displayName: String = js.native
      
      var id: String = js.native
    }
    object IWorkflowInfo {
      
      @scala.inline
      def apply(displayName: String, id: String): IWorkflowInfo = {
        val __obj = js.Dynamic.literal(displayName = displayName.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any])
        __obj.asInstanceOf[IWorkflowInfo]
      }
      
      @scala.inline
      implicit class IWorkflowInfoMutableBuilder[Self <: IWorkflowInfo] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setDisplayName(value: String): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      }
    }
  }
}
