package typingsSlinky.awsSdk.docdbMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ModifyDBClusterSnapshotAttributeResult extends StObject {
  
  var DBClusterSnapshotAttributesResult: js.UndefOr[typingsSlinky.awsSdk.docdbMod.DBClusterSnapshotAttributesResult] = js.native
}
object ModifyDBClusterSnapshotAttributeResult {
  
  @scala.inline
  def apply(): ModifyDBClusterSnapshotAttributeResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ModifyDBClusterSnapshotAttributeResult]
  }
  
  @scala.inline
  implicit class ModifyDBClusterSnapshotAttributeResultMutableBuilder[Self <: ModifyDBClusterSnapshotAttributeResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDBClusterSnapshotAttributesResult(value: DBClusterSnapshotAttributesResult): Self = StObject.set(x, "DBClusterSnapshotAttributesResult", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDBClusterSnapshotAttributesResultUndefined: Self = StObject.set(x, "DBClusterSnapshotAttributesResult", js.undefined)
  }
}
