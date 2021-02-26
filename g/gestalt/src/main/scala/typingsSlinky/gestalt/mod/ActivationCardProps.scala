package typingsSlinky.gestalt.mod

import typingsSlinky.gestalt.anon.AccessibilityLabel
import typingsSlinky.gestalt.anon.Href
import typingsSlinky.gestalt.gestaltStrings.complete
import typingsSlinky.gestalt.gestaltStrings.needsAttention
import typingsSlinky.gestalt.gestaltStrings.notStarted
import typingsSlinky.gestalt.gestaltStrings.pending
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ActivationCardProps extends StObject {
  
  var dismissButton: js.UndefOr[AccessibilityLabel] = js.native
  
  var link: js.UndefOr[Href] = js.native
  
  var message: String = js.native
  
  var status: notStarted | pending | needsAttention | complete = js.native
  
  var statusMessage: String = js.native
  
  var title: String = js.native
}
object ActivationCardProps {
  
  @scala.inline
  def apply(
    message: String,
    status: notStarted | pending | needsAttention | complete,
    statusMessage: String,
    title: String
  ): ActivationCardProps = {
    val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], statusMessage = statusMessage.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
    __obj.asInstanceOf[ActivationCardProps]
  }
  
  @scala.inline
  implicit class ActivationCardPropsMutableBuilder[Self <: ActivationCardProps] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDismissButton(value: AccessibilityLabel): Self = StObject.set(x, "dismissButton", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDismissButtonUndefined: Self = StObject.set(x, "dismissButton", js.undefined)
    
    @scala.inline
    def setLink(value: Href): Self = StObject.set(x, "link", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLinkUndefined: Self = StObject.set(x, "link", js.undefined)
    
    @scala.inline
    def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatus(value: notStarted | pending | needsAttention | complete): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatusMessage(value: String): Self = StObject.set(x, "statusMessage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
  }
}
