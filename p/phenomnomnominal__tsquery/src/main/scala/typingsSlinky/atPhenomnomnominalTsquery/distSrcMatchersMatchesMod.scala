package typingsSlinky.atPhenomnomnominalTsquery

import typingsSlinky.atPhenomnomnominalTsquery.atPhenomnomnominalTsqueryStrings.every
import typingsSlinky.atPhenomnomnominalTsquery.atPhenomnomnominalTsqueryStrings.some
import typingsSlinky.atPhenomnomnominalTsquery.distSrcTsqueryDashTypesMod.TSQuerySelectorNode
import typingsSlinky.typescript.typescriptMod.Node
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@phenomnomnominal/tsquery/dist/src/matchers/matches", JSImport.Namespace)
@js.native
object distSrcMatchersMatchesMod extends js.Object {
  @JSName("matches")
  def matches_every(modifier: every): js.Function3[
    /* node */ Node, 
    /* selector */ TSQuerySelectorNode, 
    /* ancestry */ js.Array[Node], 
    Boolean
  ] = js.native
  @JSName("matches")
  def matches_some(modifier: some): js.Function3[
    /* node */ Node, 
    /* selector */ TSQuerySelectorNode, 
    /* ancestry */ js.Array[Node], 
    Boolean
  ] = js.native
}

