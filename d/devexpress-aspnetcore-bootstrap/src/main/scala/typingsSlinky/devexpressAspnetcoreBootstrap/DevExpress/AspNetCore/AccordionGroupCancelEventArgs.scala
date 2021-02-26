package typingsSlinky.devexpressAspnetcoreBootstrap.DevExpress.AspNetCore

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AccordionGroupCancelEventArgs extends ProcessingModeCancelEventArgs {
  
  val group: BootstrapAccordionGroup = js.native
}
object AccordionGroupCancelEventArgs {
  
  @scala.inline
  def apply(cancel: Boolean, group: BootstrapAccordionGroup, processOnServer: Boolean, sender: Control): AccordionGroupCancelEventArgs = {
    val __obj = js.Dynamic.literal(cancel = cancel.asInstanceOf[js.Any], group = group.asInstanceOf[js.Any], processOnServer = processOnServer.asInstanceOf[js.Any], sender = sender.asInstanceOf[js.Any])
    __obj.asInstanceOf[AccordionGroupCancelEventArgs]
  }
  
  @scala.inline
  implicit class AccordionGroupCancelEventArgsMutableBuilder[Self <: AccordionGroupCancelEventArgs] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGroup(value: BootstrapAccordionGroup): Self = StObject.set(x, "group", value.asInstanceOf[js.Any])
  }
}
