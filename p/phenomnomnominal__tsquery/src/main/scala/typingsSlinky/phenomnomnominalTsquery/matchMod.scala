package typingsSlinky.phenomnomnominalTsquery

import typingsSlinky.phenomnomnominalTsquery.tsqueryTypesMod.TSQueryOptions
import typingsSlinky.phenomnomnominalTsquery.tsqueryTypesMod.TSQuerySelectorNode
import typingsSlinky.typescript.mod.Node
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object matchMod {
  
  @JSImport("@phenomnomnominal/tsquery/dist/src/match", "findMatches")
  @js.native
  def findMatches(node: Node, selector: TSQuerySelectorNode): Boolean = js.native
  @JSImport("@phenomnomnominal/tsquery/dist/src/match", "findMatches")
  @js.native
  def findMatches(
    node: Node,
    selector: TSQuerySelectorNode,
    ancestry: js.UndefOr[scala.Nothing],
    options: TSQueryOptions
  ): Boolean = js.native
  @JSImport("@phenomnomnominal/tsquery/dist/src/match", "findMatches")
  @js.native
  def findMatches(node: Node, selector: TSQuerySelectorNode, ancestry: js.Array[Node]): Boolean = js.native
  @JSImport("@phenomnomnominal/tsquery/dist/src/match", "findMatches")
  @js.native
  def findMatches(node: Node, selector: TSQuerySelectorNode, ancestry: js.Array[Node], options: TSQueryOptions): Boolean = js.native
  
  @JSImport("@phenomnomnominal/tsquery/dist/src/match", "match")
  @js.native
  def `match`[T /* <: Node */](node: Node, selector: TSQuerySelectorNode): js.Array[T] = js.native
  @JSImport("@phenomnomnominal/tsquery/dist/src/match", "match")
  @js.native
  def `match`[T /* <: Node */](node: Node, selector: TSQuerySelectorNode, options: TSQueryOptions): js.Array[T] = js.native
}
