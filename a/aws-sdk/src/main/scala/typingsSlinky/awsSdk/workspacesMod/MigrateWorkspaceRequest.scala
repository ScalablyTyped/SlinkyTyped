package typingsSlinky.awsSdk.workspacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MigrateWorkspaceRequest extends StObject {
  
  /**
    * The identifier of the target bundle type to migrate the WorkSpace to.
    */
  var BundleId: typingsSlinky.awsSdk.workspacesMod.BundleId = js.native
  
  /**
    * The identifier of the WorkSpace to migrate from.
    */
  var SourceWorkspaceId: WorkspaceId = js.native
}
object MigrateWorkspaceRequest {
  
  @scala.inline
  def apply(BundleId: BundleId, SourceWorkspaceId: WorkspaceId): MigrateWorkspaceRequest = {
    val __obj = js.Dynamic.literal(BundleId = BundleId.asInstanceOf[js.Any], SourceWorkspaceId = SourceWorkspaceId.asInstanceOf[js.Any])
    __obj.asInstanceOf[MigrateWorkspaceRequest]
  }
  
  @scala.inline
  implicit class MigrateWorkspaceRequestMutableBuilder[Self <: MigrateWorkspaceRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBundleId(value: BundleId): Self = StObject.set(x, "BundleId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSourceWorkspaceId(value: WorkspaceId): Self = StObject.set(x, "SourceWorkspaceId", value.asInstanceOf[js.Any])
  }
}
