package typingsSlinky.htmlCodesniffer.mod.Util

import org.scalajs.dom.raw.Node
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("html_codesniffer", "Util.eachParentNode")
@js.native
object eachParentNode extends js.Object {
  
  /**
    * Iterate parent nodes of an element.
    *
    * @param node Node to search from.
    * @param cb Callback function providing each parent node.
    */
  def apply(node: Node, cb: js.Function1[/* parent */ Node, Unit]): Unit = js.native
}
