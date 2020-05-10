package typingsSlinky.regexpp.astMod

import typingsSlinky.regexpp.regexppStrings.any
import typingsSlinky.regexpp.regexppStrings.digit
import typingsSlinky.regexpp.regexppStrings.end
import typingsSlinky.regexpp.regexppStrings.lookahead
import typingsSlinky.regexpp.regexppStrings.lookbehind
import typingsSlinky.regexpp.regexppStrings.property
import typingsSlinky.regexpp.regexppStrings.space
import typingsSlinky.regexpp.regexppStrings.start
import typingsSlinky.regexpp.regexppStrings.word
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.regexpp.astMod.Assertion
  - typingsSlinky.regexpp.astMod.Quantifier
  - typingsSlinky.regexpp.astMod.QuantifiableElement
*/
trait Element extends js.Object

object Element {
  @scala.inline
  def EdgeAssertion(
    end: Double,
    kind: start | end,
    parent: Alternative | Quantifier,
    raw: String,
    start: Double,
    `type`: typingsSlinky.regexpp.regexppStrings.Assertion
  ): Element = {
    val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], parent = parent.asInstanceOf[js.Any], raw = raw.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Element]
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
  ): Element = {
    val __obj = js.Dynamic.literal(alternatives = alternatives.asInstanceOf[js.Any], end = end.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], negate = negate.asInstanceOf[js.Any], parent = parent.asInstanceOf[js.Any], raw = raw.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Element]
  }
  @scala.inline
  def AnyCharacterSet(
    end: Double,
    kind: any,
    parent: Alternative | Quantifier,
    raw: String,
    start: Double,
    `type`: typingsSlinky.regexpp.regexppStrings.CharacterSet
  ): Element = {
    val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], parent = parent.asInstanceOf[js.Any], raw = raw.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Element]
  }
  @scala.inline
  def Character(
    end: Double,
    parent: Alternative | Quantifier | CharacterClass | CharacterClassRange,
    raw: String,
    start: Double,
    `type`: typingsSlinky.regexpp.regexppStrings.Character,
    value: Double
  ): Element = {
    val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], parent = parent.asInstanceOf[js.Any], raw = raw.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Element]
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
  ): Element = {
    val __obj = js.Dynamic.literal(alternatives = alternatives.asInstanceOf[js.Any], end = end.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], negate = negate.asInstanceOf[js.Any], parent = parent.asInstanceOf[js.Any], raw = raw.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Element]
  }
  @scala.inline
  def Group(
    alternatives: js.Array[Alternative],
    end: Double,
    parent: Alternative | Quantifier,
    raw: String,
    start: Double,
    `type`: typingsSlinky.regexpp.regexppStrings.Group
  ): Element = {
    val __obj = js.Dynamic.literal(alternatives = alternatives.asInstanceOf[js.Any], end = end.asInstanceOf[js.Any], parent = parent.asInstanceOf[js.Any], raw = raw.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Element]
  }
  @scala.inline
  def EscapeCharacterSet(
    end: Double,
    kind: digit | space | word,
    negate: Boolean,
    parent: Alternative | Quantifier | CharacterClass,
    raw: String,
    start: Double,
    `type`: typingsSlinky.regexpp.regexppStrings.CharacterSet
  ): Element = {
    val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], negate = negate.asInstanceOf[js.Any], parent = parent.asInstanceOf[js.Any], raw = raw.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Element]
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
  ): Element = {
    val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], negate = negate.asInstanceOf[js.Any], parent = parent.asInstanceOf[js.Any], raw = raw.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Element]
  }
  @scala.inline
  def Backreference(
    end: Double,
    parent: Alternative | Quantifier,
    raw: String,
    ref: Double | String,
    resolved: CapturingGroup,
    start: Double,
    `type`: typingsSlinky.regexpp.regexppStrings.Backreference
  ): Element = {
    val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], parent = parent.asInstanceOf[js.Any], raw = raw.asInstanceOf[js.Any], ref = ref.asInstanceOf[js.Any], resolved = resolved.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Element]
  }
  @scala.inline
  def CapturingGroup(
    alternatives: js.Array[Alternative],
    end: Double,
    parent: Alternative | Quantifier,
    raw: String,
    references: js.Array[Backreference],
    start: Double,
    `type`: typingsSlinky.regexpp.regexppStrings.CapturingGroup
  ): Element = {
    val __obj = js.Dynamic.literal(alternatives = alternatives.asInstanceOf[js.Any], end = end.asInstanceOf[js.Any], parent = parent.asInstanceOf[js.Any], raw = raw.asInstanceOf[js.Any], references = references.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Element]
  }
  @scala.inline
  def UnicodePropertyCharacterSet(
    end: Double,
    key: String,
    kind: property,
    negate: Boolean,
    parent: Alternative | Quantifier | CharacterClass,
    raw: String,
    start: Double,
    `type`: typingsSlinky.regexpp.regexppStrings.CharacterSet
  ): Element = {
    val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], negate = negate.asInstanceOf[js.Any], parent = parent.asInstanceOf[js.Any], raw = raw.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Element]
  }
  @scala.inline
  def CharacterClass(
    elements: js.Array[CharacterClassElement],
    end: Double,
    negate: Boolean,
    parent: Alternative | Quantifier,
    raw: String,
    start: Double,
    `type`: typingsSlinky.regexpp.regexppStrings.CharacterClass
  ): Element = {
    val __obj = js.Dynamic.literal(elements = elements.asInstanceOf[js.Any], end = end.asInstanceOf[js.Any], negate = negate.asInstanceOf[js.Any], parent = parent.asInstanceOf[js.Any], raw = raw.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Element]
  }
  @scala.inline
  def Quantifier(
    element: QuantifiableElement,
    end: Double,
    greedy: Boolean,
    max: Double,
    min: Double,
    parent: Alternative,
    raw: String,
    start: Double,
    `type`: typingsSlinky.regexpp.regexppStrings.Quantifier
  ): Element = {
    val __obj = js.Dynamic.literal(element = element.asInstanceOf[js.Any], end = end.asInstanceOf[js.Any], greedy = greedy.asInstanceOf[js.Any], max = max.asInstanceOf[js.Any], min = min.asInstanceOf[js.Any], parent = parent.asInstanceOf[js.Any], raw = raw.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Element]
  }
}

