package typingsSlinky.regexpp.astMod

import typingsSlinky.regexpp.regexppStrings.end
import typingsSlinky.regexpp.regexppStrings.start
import typingsSlinky.regexpp.regexppStrings.word
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.regexpp.astMod.EdgeAssertion
  - typingsSlinky.regexpp.astMod.WordBoundaryAssertion
*/
trait BoundaryAssertion
  extends Assertion
     with LeafNode
object BoundaryAssertion {
  
  @scala.inline
  def EdgeAssertion(
    end: Double,
    kind: start | end,
    parent: Alternative | Quantifier,
    raw: String,
    start: Double,
    `type`: typingsSlinky.regexpp.regexppStrings.Assertion
  ): typingsSlinky.regexpp.astMod.EdgeAssertion = {
    val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], parent = parent.asInstanceOf[js.Any], raw = raw.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.regexpp.astMod.EdgeAssertion]
  }
  
  @scala.inline
  def WordBoundaryAssertion(
    end: Double,
    kind: word,
    negate: Boolean,
    parent: Alternative | Quantifier,
    raw: String,
    start: Double,
    `type`: typingsSlinky.regexpp.regexppStrings.Assertion
  ): typingsSlinky.regexpp.astMod.WordBoundaryAssertion = {
    val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], negate = negate.asInstanceOf[js.Any], parent = parent.asInstanceOf[js.Any], raw = raw.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.regexpp.astMod.WordBoundaryAssertion]
  }
}
