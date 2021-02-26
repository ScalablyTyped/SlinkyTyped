package typingsSlinky.activexFaxcomexlib.anon

import typingsSlinky.activexFaxcomexlib.FAXCOMEXLib.FaxServer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BstrJobIdPFaxServer extends StObject {
  
  val bstrJobId: String = js.native
  
  val pFaxServer: FaxServer = js.native
}
object BstrJobIdPFaxServer {
  
  @scala.inline
  def apply(bstrJobId: String, pFaxServer: FaxServer): BstrJobIdPFaxServer = {
    val __obj = js.Dynamic.literal(bstrJobId = bstrJobId.asInstanceOf[js.Any], pFaxServer = pFaxServer.asInstanceOf[js.Any])
    __obj.asInstanceOf[BstrJobIdPFaxServer]
  }
  
  @scala.inline
  implicit class BstrJobIdPFaxServerMutableBuilder[Self <: BstrJobIdPFaxServer] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBstrJobId(value: String): Self = StObject.set(x, "bstrJobId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPFaxServer(value: FaxServer): Self = StObject.set(x, "pFaxServer", value.asInstanceOf[js.Any])
  }
}
