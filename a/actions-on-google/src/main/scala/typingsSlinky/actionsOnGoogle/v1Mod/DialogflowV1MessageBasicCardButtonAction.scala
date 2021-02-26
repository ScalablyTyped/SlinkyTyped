package typingsSlinky.actionsOnGoogle.v1Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DialogflowV1MessageBasicCardButtonAction extends StObject {
  
  var url: js.UndefOr[String] = js.native
}
object DialogflowV1MessageBasicCardButtonAction {
  
  @scala.inline
  def apply(): DialogflowV1MessageBasicCardButtonAction = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DialogflowV1MessageBasicCardButtonAction]
  }
  
  @scala.inline
  implicit class DialogflowV1MessageBasicCardButtonActionMutableBuilder[Self <: DialogflowV1MessageBasicCardButtonAction] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
  }
}
