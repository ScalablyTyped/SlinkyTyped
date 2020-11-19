package typingsSlinky.jupyterlabRendermimeInterfaces.mod.IRenderMime

import org.scalajs.dom.raw.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * An object that handles links on a node.
  */
@js.native
trait ILinkHandler extends js.Object {
  
  /**
    * Add the link handler to the node.
    *
    * @param node: the anchor node for which to handle the link.
    *
    * @param path: the path to open when the link is clicked.
    *
    * @param id: an optional element id to scroll to when the path is opened.
    */
  def handleLink(node: HTMLElement, path: String): Unit = js.native
  def handleLink(node: HTMLElement, path: String, id: String): Unit = js.native
}
