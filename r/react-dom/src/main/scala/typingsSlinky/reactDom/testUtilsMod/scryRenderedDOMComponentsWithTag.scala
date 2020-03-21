package typingsSlinky.reactDom.testUtilsMod

import org.scalajs.dom.raw.Element
import slinky.core.ReactComponentClass
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-dom/test-utils", "scryRenderedDOMComponentsWithTag")
@js.native
object scryRenderedDOMComponentsWithTag extends js.Object {
  def apply(root: ReactComponentClass[_], tagName: String): js.Array[Element] = js.native
}

