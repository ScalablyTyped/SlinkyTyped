package typingsSlinky.domutils

import org.scalajs.dom.raw.Element
import org.scalajs.dom.raw.Node
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("domutils/lib/querying", JSImport.Namespace)
@js.native
object queryingMod extends js.Object {
  
  def existsOne(test: js.Function1[/* elem */ Element, Boolean], nodes: js.Array[Node]): Boolean = js.native
  
  def filter(test: js.Function1[/* elem */ Node, Boolean], node: js.Array[Node]): js.Array[Node] = js.native
  def filter(
    test: js.Function1[/* elem */ Node, Boolean],
    node: js.Array[Node],
    recurse: js.UndefOr[scala.Nothing],
    limit: Double
  ): js.Array[Node] = js.native
  def filter(test: js.Function1[/* elem */ Node, Boolean], node: js.Array[Node], recurse: Boolean): js.Array[Node] = js.native
  def filter(
    test: js.Function1[/* elem */ Node, Boolean],
    node: js.Array[Node],
    recurse: Boolean,
    limit: Double
  ): js.Array[Node] = js.native
  def filter(test: js.Function1[/* elem */ Node, Boolean], node: Node): js.Array[Node] = js.native
  def filter(
    test: js.Function1[/* elem */ Node, Boolean],
    node: Node,
    recurse: js.UndefOr[scala.Nothing],
    limit: Double
  ): js.Array[Node] = js.native
  def filter(test: js.Function1[/* elem */ Node, Boolean], node: Node, recurse: Boolean): js.Array[Node] = js.native
  def filter(test: js.Function1[/* elem */ Node, Boolean], node: Node, recurse: Boolean, limit: Double): js.Array[Node] = js.native
  
  def find(
    test: js.Function1[/* elem */ Node, Boolean],
    nodes: js.Array[Node],
    recurse: Boolean,
    limit: Double
  ): js.Array[Node] = js.native
  
  def findAll(test: js.Function1[/* elem */ Element, Boolean], nodes: js.Array[Node]): js.Array[Element] = js.native
  
  def findOne(test: js.Function1[/* elem */ Element, Boolean], nodes: js.Array[Node]): Element | Null = js.native
  def findOne(test: js.Function1[/* elem */ Element, Boolean], nodes: js.Array[Node], recurse: Boolean): Element | Null = js.native
  
  def findOneChild(test: js.Function1[/* elem */ Node, Boolean], nodes: js.Array[Node]): js.UndefOr[Node] = js.native
}
