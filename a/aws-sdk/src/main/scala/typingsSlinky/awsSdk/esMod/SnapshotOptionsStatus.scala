package typingsSlinky.awsSdk.esMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SnapshotOptionsStatus extends StObject {
  
  /**
    * Specifies the daily snapshot options specified for the Elasticsearch domain.
    */
  var Options: SnapshotOptions = js.native
  
  /**
    * Specifies the status of a daily automated snapshot.
    */
  var Status: OptionStatus = js.native
}
object SnapshotOptionsStatus {
  
  @scala.inline
  def apply(Options: SnapshotOptions, Status: OptionStatus): SnapshotOptionsStatus = {
    val __obj = js.Dynamic.literal(Options = Options.asInstanceOf[js.Any], Status = Status.asInstanceOf[js.Any])
    __obj.asInstanceOf[SnapshotOptionsStatus]
  }
  
  @scala.inline
  implicit class SnapshotOptionsStatusMutableBuilder[Self <: SnapshotOptionsStatus] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setOptions(value: SnapshotOptions): Self = StObject.set(x, "Options", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatus(value: OptionStatus): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
  }
}
