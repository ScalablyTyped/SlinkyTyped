package typingsSlinky.awsSdk.workspacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Snapshot extends StObject {
  
  /**
    * The time when the snapshot was created.
    */
  var SnapshotTime: js.UndefOr[js.Date] = js.native
}
object Snapshot {
  
  @scala.inline
  def apply(): Snapshot = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Snapshot]
  }
  
  @scala.inline
  implicit class SnapshotMutableBuilder[Self <: Snapshot] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setSnapshotTime(value: js.Date): Self = StObject.set(x, "SnapshotTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSnapshotTimeUndefined: Self = StObject.set(x, "SnapshotTime", js.undefined)
  }
}
