package typingsSlinky.activexFaxcomexlib.anon

import typingsSlinky.activexFaxcomexlib.FAXCOMEXLib.FaxJobStatus
import typingsSlinky.activexFaxcomexlib.FAXCOMEXLib.FaxServer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PJobStatus extends StObject {
  
  val bstrJobId: String = js.native
  
  val pFaxServer: FaxServer = js.native
  
  val pJobStatus: FaxJobStatus = js.native
}
object PJobStatus {
  
  @scala.inline
  def apply(bstrJobId: String, pFaxServer: FaxServer, pJobStatus: FaxJobStatus): PJobStatus = {
    val __obj = js.Dynamic.literal(bstrJobId = bstrJobId.asInstanceOf[js.Any], pFaxServer = pFaxServer.asInstanceOf[js.Any], pJobStatus = pJobStatus.asInstanceOf[js.Any])
    __obj.asInstanceOf[PJobStatus]
  }
  
  @scala.inline
  implicit class PJobStatusMutableBuilder[Self <: PJobStatus] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBstrJobId(value: String): Self = StObject.set(x, "bstrJobId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPFaxServer(value: FaxServer): Self = StObject.set(x, "pFaxServer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPJobStatus(value: FaxJobStatus): Self = StObject.set(x, "pJobStatus", value.asInstanceOf[js.Any])
  }
}
