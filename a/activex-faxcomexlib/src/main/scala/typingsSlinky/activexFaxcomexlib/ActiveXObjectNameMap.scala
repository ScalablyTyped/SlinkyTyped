package typingsSlinky.activexFaxcomexlib

import typingsSlinky.activexFaxcomexlib.FAXCOMEXLib.FaxDocument
import typingsSlinky.activexFaxcomexlib.FAXCOMEXLib.FaxServer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ActiveXObjectNameMap extends StObject {
  
  @JSName("FaxComEx.FaxDocument")
  var FaxComExDotFaxDocument: FaxDocument = js.native
  
  @JSName("FaxComEx.FaxServer")
  var FaxComExDotFaxServer: FaxServer = js.native
}
object ActiveXObjectNameMap {
  
  @scala.inline
  def apply(FaxComExDotFaxDocument: FaxDocument, FaxComExDotFaxServer: FaxServer): ActiveXObjectNameMap = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("FaxComEx.FaxDocument")(FaxComExDotFaxDocument.asInstanceOf[js.Any])
    __obj.updateDynamic("FaxComEx.FaxServer")(FaxComExDotFaxServer.asInstanceOf[js.Any])
    __obj.asInstanceOf[ActiveXObjectNameMap]
  }
  
  @scala.inline
  implicit class ActiveXObjectNameMapMutableBuilder[Self <: ActiveXObjectNameMap] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFaxComExDotFaxDocument(value: FaxDocument): Self = StObject.set(x, "FaxComEx.FaxDocument", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFaxComExDotFaxServer(value: FaxServer): Self = StObject.set(x, "FaxComEx.FaxServer", value.asInstanceOf[js.Any])
  }
}
