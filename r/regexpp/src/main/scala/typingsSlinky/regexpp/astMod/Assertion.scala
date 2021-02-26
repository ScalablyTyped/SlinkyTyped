package typingsSlinky.regexpp.astMod

import typingsSlinky.regexpp.regexppStrings.end
import typingsSlinky.regexpp.regexppStrings.lookahead
import typingsSlinky.regexpp.regexppStrings.lookbehind
import typingsSlinky.regexpp.regexppStrings.start
import typingsSlinky.regexpp.regexppStrings.word
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.regexpp.astMod.BoundaryAssertion
  - typingsSlinky.regexpp.astMod.LookaroundAssertion
*/
trait Assertion extends Element
object Assertion {
  
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
  def LookaheadAssertion(
    alternatives: js.Array[Alternative],
    end: Double,
    kind: lookahead,
    negate: Boolean,
    parent: Alternative | Quantifier,
    raw: String,
    start: Double,
    `type`: typingsSlinky.regexpp.regexppStrings.Assertion
  ): typingsSlinky.regexpp.astMod.LookaheadAssertion = {
    val __obj = js.Dynamic.literal(alternatives = alternatives.asInstanceOf[js.Any], end = end.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], negate = negate.asInstanceOf[js.Any], parent = parent.asInstanceOf[js.Any], raw = raw.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.regexpp.astMod.LookaheadAssertion]
  }
  
  @scala.inline
  def LookbehindAssertion(
    alternatives: js.Array[Alternative],
    end: Double,
    kind: lookbehind,
    negate: Boolean,
    parent: Alternative,
    raw: String,
    start: Double,
    `type`: typingsSlinky.regexpp.regexppStrings.Assertion
  ): typingsSlinky.regexpp.astMod.LookbehindAssertion = {
    val __obj = js.Dynamic.literal(alternatives = alternatives.asInstanceOf[js.Any], end = end.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], negate = negate.asInstanceOf[js.Any], parent = parent.asInstanceOf[js.Any], raw = raw.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.regexpp.astMod.LookbehindAssertion]
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
