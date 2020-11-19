package typingsSlinky.domutils.legacyMod

import org.scalajs.dom.raw.Element
import org.scalajs.dom.raw.Node
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("domutils/lib/legacy", "getElementsByTagName")
@js.native
object getElementsByTagName extends js.Object {
  
  def apply(name: String, element: js.Array[Node], recurse: Boolean): js.Array[Element] = js.native
  def apply(name: String, element: js.Array[Node], recurse: Boolean, limit: Double): js.Array[Element] = js.native
  def apply(name: String, element: Node, recurse: Boolean): js.Array[Element] = js.native
  def apply(name: String, element: Node, recurse: Boolean, limit: Double): js.Array[Element] = js.native
  def apply(name: js.Function1[/* name */ String, Boolean], element: js.Array[Node], recurse: Boolean): js.Array[Element] = js.native
  def apply(
    name: js.Function1[/* name */ String, Boolean],
    element: js.Array[Node],
    recurse: Boolean,
    limit: Double
  ): js.Array[Element] = js.native
  def apply(name: js.Function1[/* name */ String, Boolean], element: Node, recurse: Boolean): js.Array[Element] = js.native
  def apply(name: js.Function1[/* name */ String, Boolean], element: Node, recurse: Boolean, limit: Double): js.Array[Element] = js.native
}
