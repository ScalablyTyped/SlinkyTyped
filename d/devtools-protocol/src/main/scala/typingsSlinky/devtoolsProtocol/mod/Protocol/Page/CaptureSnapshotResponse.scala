package typingsSlinky.devtoolsProtocol.mod.Protocol.Page

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CaptureSnapshotResponse extends StObject {
  
  /**
    * Serialized page data.
    */
  var data: String = js.native
}
object CaptureSnapshotResponse {
  
  @scala.inline
  def apply(data: String): CaptureSnapshotResponse = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any])
    __obj.asInstanceOf[CaptureSnapshotResponse]
  }
  
  @scala.inline
  implicit class CaptureSnapshotResponseMutableBuilder[Self <: CaptureSnapshotResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setData(value: String): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
  }
}
