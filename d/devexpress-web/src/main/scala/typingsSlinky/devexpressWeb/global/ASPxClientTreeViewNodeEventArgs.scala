package typingsSlinky.devexpressWeb.global

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides data for the ASPxClientTreeView.ExpandedChanged events.
  */
@JSGlobal("ASPxClientTreeViewNodeEventArgs")
@js.native
class ASPxClientTreeViewNodeEventArgs protected ()
  extends typingsSlinky.devexpressWeb.ASPxClientTreeViewNodeEventArgs {
  /**
    * Initializes a new object of the ASPxClientTreeViewNodeEventArgs type with the specified value.
    * @param node An ASPxClientTreeViewNode object representing the node related to the event.
    */
  def this(node: typingsSlinky.devexpressWeb.ASPxClientTreeViewNode) = this()
  /**
    * Gets a node object related to the event.
    */
  /* CompleteClass */
  override var node: typingsSlinky.devexpressWeb.ASPxClientTreeViewNode = js.native
}

