package typingsSlinky.phenomnomnominalTsquery

import typingsSlinky.phenomnomnominalTsquery.phenomnomnominalTsqueryStrings.every
import typingsSlinky.phenomnomnominalTsquery.phenomnomnominalTsqueryStrings.some
import typingsSlinky.phenomnomnominalTsquery.tsqueryTypesMod.TSQuerySelectorNode
import typingsSlinky.typescript.mod.Node
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@phenomnomnominal/tsquery/dist/src/matchers/matches", JSImport.Namespace)
@js.native
object matchesMod extends js.Object {
  
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
