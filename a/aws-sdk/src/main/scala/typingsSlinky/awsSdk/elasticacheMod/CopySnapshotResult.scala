package typingsSlinky.awsSdk.elasticacheMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CopySnapshotResult extends StObject {
  
  var Snapshot: js.UndefOr[typingsSlinky.awsSdk.elasticacheMod.Snapshot] = js.native
}
object CopySnapshotResult {
  
  @scala.inline
  def apply(): CopySnapshotResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CopySnapshotResult]
  }
  
  @scala.inline
  implicit class CopySnapshotResultMutableBuilder[Self <: CopySnapshotResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setSnapshot(value: Snapshot): Self = StObject.set(x, "Snapshot", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSnapshotUndefined: Self = StObject.set(x, "Snapshot", js.undefined)
  }
}
