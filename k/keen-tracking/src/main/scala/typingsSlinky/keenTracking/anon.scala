package typingsSlinky.keenTracking

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait Created extends StObject {
    
    var created: Boolean = js.native
  }
  object Created {
    
    @scala.inline
    def apply(created: Boolean): Created = {
      val __obj = js.Dynamic.literal(created = created.asInstanceOf[js.Any])
      __obj.asInstanceOf[Created]
    }
    
    @scala.inline
    implicit class CreatedMutableBuilder[Self <: Created] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCreated(value: Boolean): Self = StObject.set(x, "created", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait ProjectId extends StObject {
    
    var projectId: String = js.native
    
    var requestType: js.UndefOr[String] = js.native
    
    var writeKey: String = js.native
  }
  object ProjectId {
    
    @scala.inline
    def apply(projectId: String, writeKey: String): ProjectId = {
      val __obj = js.Dynamic.literal(projectId = projectId.asInstanceOf[js.Any], writeKey = writeKey.asInstanceOf[js.Any])
      __obj.asInstanceOf[ProjectId]
    }
    
    @scala.inline
    implicit class ProjectIdMutableBuilder[Self <: ProjectId] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setProjectId(value: String): Self = StObject.set(x, "projectId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRequestType(value: String): Self = StObject.set(x, "requestType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRequestTypeUndefined: Self = StObject.set(x, "requestType", js.undefined)
      
      @scala.inline
      def setWriteKey(value: String): Self = StObject.set(x, "writeKey", value.asInstanceOf[js.Any])
    }
  }
}
