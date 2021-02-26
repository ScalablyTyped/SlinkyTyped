package typingsSlinky.awsSdk.cloudwatcheventsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DeleteArchiveRequest extends StObject {
  
  /**
    * The name of the archive to delete.
    */
  var ArchiveName: typingsSlinky.awsSdk.cloudwatcheventsMod.ArchiveName = js.native
}
object DeleteArchiveRequest {
  
  @scala.inline
  def apply(ArchiveName: ArchiveName): DeleteArchiveRequest = {
    val __obj = js.Dynamic.literal(ArchiveName = ArchiveName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteArchiveRequest]
  }
  
  @scala.inline
  implicit class DeleteArchiveRequestMutableBuilder[Self <: DeleteArchiveRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setArchiveName(value: ArchiveName): Self = StObject.set(x, "ArchiveName", value.asInstanceOf[js.Any])
  }
}
