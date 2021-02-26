package typingsSlinky.inboxsdk.mod.Lists

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ThreadRowAttachmentIconDescriptorBase extends StObject {
  
  var tooltip: js.UndefOr[String] = js.native
}
object ThreadRowAttachmentIconDescriptorBase {
  
  @scala.inline
  def apply(): ThreadRowAttachmentIconDescriptorBase = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ThreadRowAttachmentIconDescriptorBase]
  }
  
  @scala.inline
  implicit class ThreadRowAttachmentIconDescriptorBaseMutableBuilder[Self <: ThreadRowAttachmentIconDescriptorBase] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setTooltip(value: String): Self = StObject.set(x, "tooltip", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTooltipUndefined: Self = StObject.set(x, "tooltip", js.undefined)
  }
}
