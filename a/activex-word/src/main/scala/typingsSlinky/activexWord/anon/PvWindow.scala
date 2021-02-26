package typingsSlinky.activexWord.anon

import typingsSlinky.activexWord.Word.ProtectedViewWindow
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PvWindow extends StObject {
  
  val PvWindow: ProtectedViewWindow = js.native
}
object PvWindow {
  
  @scala.inline
  def apply(PvWindow: ProtectedViewWindow): PvWindow = {
    val __obj = js.Dynamic.literal(PvWindow = PvWindow.asInstanceOf[js.Any])
    __obj.asInstanceOf[PvWindow]
  }
  
  @scala.inline
  implicit class PvWindowMutableBuilder[Self <: PvWindow] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPvWindow(value: ProtectedViewWindow): Self = StObject.set(x, "PvWindow", value.asInstanceOf[js.Any])
  }
}
