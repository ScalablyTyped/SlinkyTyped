package typingsSlinky.devexpressWeb.global

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Provides data for the ASPxClientTreeView.ExpandedChanging event.
  */
@JSGlobal("ASPxClientTreeViewNodeCancelEventArgs")
@js.native
class ASPxClientTreeViewNodeCancelEventArgs protected ()
  extends typingsSlinky.devexpressWeb.ASPxClientTreeViewNodeCancelEventArgs {
  /**
    * Initializes a new object of the ASPxClientTreeViewNodeCancelEventArgs type with the specified settings.
    * @param processOnServer true to process the event on the server side; false to completely handle it on the client side.
    * @param node An ASPxClientTreeViewNode object that represents a node related to the event.
    */
  def this(processOnServer: Boolean, node: typingsSlinky.devexpressWeb.ASPxClientTreeViewNode) = this()
}
