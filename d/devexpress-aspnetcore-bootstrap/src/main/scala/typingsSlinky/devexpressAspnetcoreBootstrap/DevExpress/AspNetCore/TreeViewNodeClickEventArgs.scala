package typingsSlinky.devexpressAspnetcoreBootstrap.DevExpress.AspNetCore

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TreeViewNodeClickEventArgs extends TreeViewNodeProcessingModeEventArgs {
  
  val htmlElement: js.Any = js.native
  
  val htmlEvent: js.Any = js.native
}
object TreeViewNodeClickEventArgs {
  
  @scala.inline
  def apply(
    htmlElement: js.Any,
    htmlEvent: js.Any,
    node: BootstrapTreeViewNode,
    processOnServer: Boolean,
    sender: Control
  ): TreeViewNodeClickEventArgs = {
    val __obj = js.Dynamic.literal(htmlElement = htmlElement.asInstanceOf[js.Any], htmlEvent = htmlEvent.asInstanceOf[js.Any], node = node.asInstanceOf[js.Any], processOnServer = processOnServer.asInstanceOf[js.Any], sender = sender.asInstanceOf[js.Any])
    __obj.asInstanceOf[TreeViewNodeClickEventArgs]
  }
  
  @scala.inline
  implicit class TreeViewNodeClickEventArgsMutableBuilder[Self <: TreeViewNodeClickEventArgs] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setHtmlElement(value: js.Any): Self = StObject.set(x, "htmlElement", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHtmlEvent(value: js.Any): Self = StObject.set(x, "htmlEvent", value.asInstanceOf[js.Any])
  }
}
