package typingsSlinky.devexpressWeb

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Provides data for the ASPxClientTreeView.ExpandedChanging event.
  */
@js.native
trait BootstrapClientTreeViewNodeCancelEventArgs extends ASPxClientProcessingModeCancelEventArgs {
  
  /**
    * Gets a node object related to the event.
    */
  var node: BootstrapClientTreeViewNode = js.native
}
object BootstrapClientTreeViewNodeCancelEventArgs {
  
  @scala.inline
  def apply(cancel: Boolean, node: BootstrapClientTreeViewNode, processOnServer: Boolean): BootstrapClientTreeViewNodeCancelEventArgs = {
    val __obj = js.Dynamic.literal(cancel = cancel.asInstanceOf[js.Any], node = node.asInstanceOf[js.Any], processOnServer = processOnServer.asInstanceOf[js.Any])
    __obj.asInstanceOf[BootstrapClientTreeViewNodeCancelEventArgs]
  }
  
  @scala.inline
  implicit class BootstrapClientTreeViewNodeCancelEventArgsMutableBuilder[Self <: BootstrapClientTreeViewNodeCancelEventArgs] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNode(value: BootstrapClientTreeViewNode): Self = StObject.set(x, "node", value.asInstanceOf[js.Any])
  }
}
