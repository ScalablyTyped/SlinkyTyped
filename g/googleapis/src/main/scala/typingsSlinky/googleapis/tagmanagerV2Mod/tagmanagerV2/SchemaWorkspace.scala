package typingsSlinky.googleapis.tagmanagerV2Mod.tagmanagerV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents a Google Tag Manager Container Workspace.
  */
@js.native
trait SchemaWorkspace extends StObject {
  
  /**
    * GTM Account ID.
    */
  var accountId: js.UndefOr[String] = js.native
  
  /**
    * GTM Container ID.
    */
  var containerId: js.UndefOr[String] = js.native
  
  /**
    * Workspace description.
    */
  var description: js.UndefOr[String] = js.native
  
  /**
    * The fingerprint of the GTM Workspace as computed at storage time. This
    * value is recomputed whenever the workspace is modified.
    */
  var fingerprint: js.UndefOr[String] = js.native
  
  /**
    * Workspace display name.
    */
  var name: js.UndefOr[String] = js.native
  
  /**
    * GTM Workspace&#39;s API relative path.
    */
  var path: js.UndefOr[String] = js.native
  
  /**
    * Auto generated link to the tag manager UI
    */
  var tagManagerUrl: js.UndefOr[String] = js.native
  
  /**
    * The Workspace ID uniquely identifies the GTM Workspace.
    */
  var workspaceId: js.UndefOr[String] = js.native
}
object SchemaWorkspace {
  
  @scala.inline
  def apply(): SchemaWorkspace = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaWorkspace]
  }
  
  @scala.inline
  implicit class SchemaWorkspaceMutableBuilder[Self <: SchemaWorkspace] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAccountId(value: String): Self = StObject.set(x, "accountId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAccountIdUndefined: Self = StObject.set(x, "accountId", js.undefined)
    
    @scala.inline
    def setContainerId(value: String): Self = StObject.set(x, "containerId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContainerIdUndefined: Self = StObject.set(x, "containerId", js.undefined)
    
    @scala.inline
    def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    @scala.inline
    def setFingerprint(value: String): Self = StObject.set(x, "fingerprint", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFingerprintUndefined: Self = StObject.set(x, "fingerprint", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPathUndefined: Self = StObject.set(x, "path", js.undefined)
    
    @scala.inline
    def setTagManagerUrl(value: String): Self = StObject.set(x, "tagManagerUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTagManagerUrlUndefined: Self = StObject.set(x, "tagManagerUrl", js.undefined)
    
    @scala.inline
    def setWorkspaceId(value: String): Self = StObject.set(x, "workspaceId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWorkspaceIdUndefined: Self = StObject.set(x, "workspaceId", js.undefined)
  }
}
