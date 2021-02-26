package typingsSlinky.activexInfopath.anon

import typingsSlinky.activexInfopath.InfoPath.Window
import typingsSlinky.activexInfopath.InfoPath._XDocument
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PWindow extends StObject {
  
  val pDocument: _XDocument = js.native
  
  val pWindow: Window = js.native
}
object PWindow {
  
  @scala.inline
  def apply(pDocument: _XDocument, pWindow: Window): PWindow = {
    val __obj = js.Dynamic.literal(pDocument = pDocument.asInstanceOf[js.Any], pWindow = pWindow.asInstanceOf[js.Any])
    __obj.asInstanceOf[PWindow]
  }
  
  @scala.inline
  implicit class PWindowMutableBuilder[Self <: PWindow] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPDocument(value: _XDocument): Self = StObject.set(x, "pDocument", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPWindow(value: Window): Self = StObject.set(x, "pWindow", value.asInstanceOf[js.Any])
  }
}
