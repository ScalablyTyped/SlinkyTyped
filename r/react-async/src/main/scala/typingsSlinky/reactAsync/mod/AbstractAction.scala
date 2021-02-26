package typingsSlinky.reactAsync.mod

import typingsSlinky.reactAsync.anon.Dictmeta
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AbstractAction extends StObject {
  
  var meta: Dictmeta = js.native
  
  var `type`: String = js.native
}
object AbstractAction {
  
  @scala.inline
  def apply(meta: Dictmeta, `type`: String): AbstractAction = {
    val __obj = js.Dynamic.literal(meta = meta.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AbstractAction]
  }
  
  @scala.inline
  implicit class AbstractActionMutableBuilder[Self <: AbstractAction] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMeta(value: Dictmeta): Self = StObject.set(x, "meta", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
