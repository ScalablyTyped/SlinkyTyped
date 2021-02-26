package typingsSlinky.awsSdk.lightsailMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CopySnapshotRequest extends StObject {
  
  /**
    * The date of the source automatic snapshot to copy. Use the get auto snapshots operation to identify the dates of the available automatic snapshots. Constraints:   Must be specified in YYYY-MM-DD format.   This parameter cannot be defined together with the use latest restorable auto snapshot parameter. The restore date and use latest restorable auto snapshot parameters are mutually exclusive.   Define this parameter only when copying an automatic snapshot as a manual snapshot. For more information, see the Lightsail Dev Guide.  
    */
  var restoreDate: js.UndefOr[String] = js.native
  
  /**
    * The AWS Region where the source manual or automatic snapshot is located.
    */
  var sourceRegion: RegionName = js.native
  
  /**
    * The name of the source instance or disk from which the source automatic snapshot was created. Constraint:   Define this parameter only when copying an automatic snapshot as a manual snapshot. For more information, see the Lightsail Dev Guide.  
    */
  var sourceResourceName: js.UndefOr[String] = js.native
  
  /**
    * The name of the source manual snapshot to copy. Constraint:   Define this parameter only when copying a manual snapshot as another manual snapshot.  
    */
  var sourceSnapshotName: js.UndefOr[ResourceName] = js.native
  
  /**
    * The name of the new manual snapshot to be created as a copy.
    */
  var targetSnapshotName: ResourceName = js.native
  
  /**
    * A Boolean value to indicate whether to use the latest available automatic snapshot of the specified source instance or disk. Constraints:   This parameter cannot be defined together with the restore date parameter. The use latest restorable auto snapshot and restore date parameters are mutually exclusive.   Define this parameter only when copying an automatic snapshot as a manual snapshot. For more information, see the Lightsail Dev Guide.  
    */
  var useLatestRestorableAutoSnapshot: js.UndefOr[Boolean] = js.native
}
object CopySnapshotRequest {
  
  @scala.inline
  def apply(sourceRegion: RegionName, targetSnapshotName: ResourceName): CopySnapshotRequest = {
    val __obj = js.Dynamic.literal(sourceRegion = sourceRegion.asInstanceOf[js.Any], targetSnapshotName = targetSnapshotName.asInstanceOf[js.Any])
    __obj.asInstanceOf[CopySnapshotRequest]
  }
  
  @scala.inline
  implicit class CopySnapshotRequestMutableBuilder[Self <: CopySnapshotRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setRestoreDate(value: String): Self = StObject.set(x, "restoreDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRestoreDateUndefined: Self = StObject.set(x, "restoreDate", js.undefined)
    
    @scala.inline
    def setSourceRegion(value: RegionName): Self = StObject.set(x, "sourceRegion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSourceResourceName(value: String): Self = StObject.set(x, "sourceResourceName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSourceResourceNameUndefined: Self = StObject.set(x, "sourceResourceName", js.undefined)
    
    @scala.inline
    def setSourceSnapshotName(value: ResourceName): Self = StObject.set(x, "sourceSnapshotName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSourceSnapshotNameUndefined: Self = StObject.set(x, "sourceSnapshotName", js.undefined)
    
    @scala.inline
    def setTargetSnapshotName(value: ResourceName): Self = StObject.set(x, "targetSnapshotName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUseLatestRestorableAutoSnapshot(value: Boolean): Self = StObject.set(x, "useLatestRestorableAutoSnapshot", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUseLatestRestorableAutoSnapshotUndefined: Self = StObject.set(x, "useLatestRestorableAutoSnapshot", js.undefined)
  }
}
