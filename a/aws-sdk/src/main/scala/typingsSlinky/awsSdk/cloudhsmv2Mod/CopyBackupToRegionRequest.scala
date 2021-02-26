package typingsSlinky.awsSdk.cloudhsmv2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CopyBackupToRegionRequest extends StObject {
  
  /**
    * The ID of the backup that will be copied to the destination region. 
    */
  var BackupId: typingsSlinky.awsSdk.cloudhsmv2Mod.BackupId = js.native
  
  /**
    * The AWS region that will contain your copied CloudHSM cluster backup.
    */
  var DestinationRegion: Region = js.native
  
  /**
    * Tags to apply to the destination backup during creation. If you specify tags, only these tags will be applied to the destination backup. If you do not specify tags, the service copies tags from the source backup to the destination backup.
    */
  var TagList: js.UndefOr[typingsSlinky.awsSdk.cloudhsmv2Mod.TagList] = js.native
}
object CopyBackupToRegionRequest {
  
  @scala.inline
  def apply(BackupId: BackupId, DestinationRegion: Region): CopyBackupToRegionRequest = {
    val __obj = js.Dynamic.literal(BackupId = BackupId.asInstanceOf[js.Any], DestinationRegion = DestinationRegion.asInstanceOf[js.Any])
    __obj.asInstanceOf[CopyBackupToRegionRequest]
  }
  
  @scala.inline
  implicit class CopyBackupToRegionRequestMutableBuilder[Self <: CopyBackupToRegionRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBackupId(value: BackupId): Self = StObject.set(x, "BackupId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDestinationRegion(value: Region): Self = StObject.set(x, "DestinationRegion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTagList(value: TagList): Self = StObject.set(x, "TagList", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTagListUndefined: Self = StObject.set(x, "TagList", js.undefined)
    
    @scala.inline
    def setTagListVarargs(value: Tag*): Self = StObject.set(x, "TagList", js.Array(value :_*))
  }
}
