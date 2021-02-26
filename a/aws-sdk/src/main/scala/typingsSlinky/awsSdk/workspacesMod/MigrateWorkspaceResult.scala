package typingsSlinky.awsSdk.workspacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MigrateWorkspaceResult extends StObject {
  
  /**
    * The original identifier of the WorkSpace that is being migrated.
    */
  var SourceWorkspaceId: js.UndefOr[WorkspaceId] = js.native
  
  /**
    * The new identifier of the WorkSpace that is being migrated. If the migration does not succeed, the target WorkSpace ID will not be used, and the WorkSpace will still have the original WorkSpace ID.
    */
  var TargetWorkspaceId: js.UndefOr[WorkspaceId] = js.native
}
object MigrateWorkspaceResult {
  
  @scala.inline
  def apply(): MigrateWorkspaceResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MigrateWorkspaceResult]
  }
  
  @scala.inline
  implicit class MigrateWorkspaceResultMutableBuilder[Self <: MigrateWorkspaceResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setSourceWorkspaceId(value: WorkspaceId): Self = StObject.set(x, "SourceWorkspaceId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSourceWorkspaceIdUndefined: Self = StObject.set(x, "SourceWorkspaceId", js.undefined)
    
    @scala.inline
    def setTargetWorkspaceId(value: WorkspaceId): Self = StObject.set(x, "TargetWorkspaceId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTargetWorkspaceIdUndefined: Self = StObject.set(x, "TargetWorkspaceId", js.undefined)
  }
}
