package typingsSlinky.openfin.windowMod

import typingsSlinky.openfin.eventsBaseMod.WindowEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait WindowEndLoadEvent[Topic, Type] extends WindowEvent[Topic, Type] {
  
  var documentName: String = js.native
  
  var isMain: Boolean = js.native
}
object WindowEndLoadEvent {
  
  @scala.inline
  def apply[Topic, Type](documentName: String, isMain: Boolean, name: String, topic: Topic, `type`: Type, uuid: String): WindowEndLoadEvent[Topic, Type] = {
    val __obj = js.Dynamic.literal(documentName = documentName.asInstanceOf[js.Any], isMain = isMain.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], topic = topic.asInstanceOf[js.Any], uuid = uuid.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[WindowEndLoadEvent[Topic, Type]]
  }
  
  @scala.inline
  implicit class WindowEndLoadEventMutableBuilder[Self <: WindowEndLoadEvent[_, _], Topic, Type] (val x: Self with (WindowEndLoadEvent[Topic, Type])) extends AnyVal {
    
    @scala.inline
    def setDocumentName(value: String): Self = StObject.set(x, "documentName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsMain(value: Boolean): Self = StObject.set(x, "isMain", value.asInstanceOf[js.Any])
  }
}
