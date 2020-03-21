package typingsSlinky.phenomnomnominalTsquery

import typingsSlinky.phenomnomnominalTsquery.tsqueryTypesMod.TSQueryOptions
import typingsSlinky.phenomnomnominalTsquery.tsqueryTypesMod.TSQuerySelectorNode
import typingsSlinky.typescript.mod.Node
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@phenomnomnominal/tsquery/dist/src/match", JSImport.Namespace)
@js.native
object matchMod extends js.Object {
  def findMatches(node: Node, selector: TSQuerySelectorNode): Boolean = js.native
  def findMatches(node: Node, selector: TSQuerySelectorNode, ancestry: js.Array[Node]): Boolean = js.native
  def findMatches(node: Node, selector: TSQuerySelectorNode, ancestry: js.Array[Node], options: TSQueryOptions): Boolean = js.native
  def `match`[T /* <: Node */](node: Node, selector: TSQuerySelectorNode): js.Array[T] = js.native
  def `match`[T /* <: Node */](node: Node, selector: TSQuerySelectorNode, options: TSQueryOptions): js.Array[T] = js.native
}

