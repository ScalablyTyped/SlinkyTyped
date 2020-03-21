package typingsSlinky.reactSwf.mod.rswf

import org.scalajs.dom.raw.Node
import typingsSlinky.react.mod.Component
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ReactSWF
  extends Component[Props, State, js.Any] {
  /**
    * Returns the Flash Player object DOM node.
    * Should be prefered over `React.findDOMNode`.
    * @return {?DOMNode} Flash Player object DOM node.
    */
  def getFPDOMNode(): Node = js.native
}

