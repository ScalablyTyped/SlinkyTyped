package typingsSlinky.activexFaxcomexlib.anon

import typingsSlinky.activexFaxcomexlib.FAXCOMEXLib.FaxServer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PFaxServer extends StObject {
  
  val pFaxServer: FaxServer = js.native
}
object PFaxServer {
  
  @scala.inline
  def apply(pFaxServer: FaxServer): PFaxServer = {
    val __obj = js.Dynamic.literal(pFaxServer = pFaxServer.asInstanceOf[js.Any])
    __obj.asInstanceOf[PFaxServer]
  }
  
  @scala.inline
  implicit class PFaxServerMutableBuilder[Self <: PFaxServer] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPFaxServer(value: FaxServer): Self = StObject.set(x, "pFaxServer", value.asInstanceOf[js.Any])
  }
}
