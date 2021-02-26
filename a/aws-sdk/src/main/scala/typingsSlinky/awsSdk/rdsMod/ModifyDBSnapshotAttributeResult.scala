package typingsSlinky.awsSdk.rdsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ModifyDBSnapshotAttributeResult extends StObject {
  
  var DBSnapshotAttributesResult: js.UndefOr[typingsSlinky.awsSdk.rdsMod.DBSnapshotAttributesResult] = js.native
}
object ModifyDBSnapshotAttributeResult {
  
  @scala.inline
  def apply(): ModifyDBSnapshotAttributeResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ModifyDBSnapshotAttributeResult]
  }
  
  @scala.inline
  implicit class ModifyDBSnapshotAttributeResultMutableBuilder[Self <: ModifyDBSnapshotAttributeResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDBSnapshotAttributesResult(value: DBSnapshotAttributesResult): Self = StObject.set(x, "DBSnapshotAttributesResult", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDBSnapshotAttributesResultUndefined: Self = StObject.set(x, "DBSnapshotAttributesResult", js.undefined)
  }
}
