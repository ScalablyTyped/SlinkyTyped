package typingsSlinky.regexpp.astMod

import typingsSlinky.regexpp.regexppStrings.word
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WordBoundaryAssertion
  extends BoundaryAssertion
     with NodeBase {
  var kind: word
  var negate: Boolean
  @JSName("parent")
  var parent_WordBoundaryAssertion: Alternative | Quantifier
  @JSName("type")
  var type_WordBoundaryAssertion: typingsSlinky.regexpp.regexppStrings.Assertion
}

object WordBoundaryAssertion {
  @scala.inline
  def apply(
    end: Double,
    kind: word,
    negate: Boolean,
    parent: Alternative | Quantifier,
    raw: String,
    start: Double,
    `type`: typingsSlinky.regexpp.regexppStrings.Assertion
  ): WordBoundaryAssertion = {
    val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], negate = negate.asInstanceOf[js.Any], parent = parent.asInstanceOf[js.Any], raw = raw.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[WordBoundaryAssertion]
  }
}

