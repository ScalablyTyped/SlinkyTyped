package typingsSlinky.regexpp.astMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NodeBase extends js.Object {
  var end: Double
  var parent: Null | RegExpLiteral | Pattern | Group | CapturingGroup | LookaroundAssertion | Alternative | Quantifier | CharacterClass | CharacterClassRange
  var raw: String
  var start: Double
  var `type`: typingsSlinky.regexpp.regexppStrings.RegExpLiteral | typingsSlinky.regexpp.regexppStrings.Pattern | typingsSlinky.regexpp.regexppStrings.Alternative | typingsSlinky.regexpp.regexppStrings.Group | typingsSlinky.regexpp.regexppStrings.CapturingGroup | typingsSlinky.regexpp.regexppStrings.Quantifier | typingsSlinky.regexpp.regexppStrings.CharacterClass | typingsSlinky.regexpp.regexppStrings.Assertion | typingsSlinky.regexpp.regexppStrings.CharacterClassRange | typingsSlinky.regexpp.regexppStrings.CharacterSet | typingsSlinky.regexpp.regexppStrings.Character | typingsSlinky.regexpp.regexppStrings.Backreference | typingsSlinky.regexpp.regexppStrings.Flags
}

object NodeBase {
  @scala.inline
  def apply(
    end: Double,
    raw: String,
    start: Double,
    `type`: typingsSlinky.regexpp.regexppStrings.RegExpLiteral | typingsSlinky.regexpp.regexppStrings.Pattern | typingsSlinky.regexpp.regexppStrings.Alternative | typingsSlinky.regexpp.regexppStrings.Group | typingsSlinky.regexpp.regexppStrings.CapturingGroup | typingsSlinky.regexpp.regexppStrings.Quantifier | typingsSlinky.regexpp.regexppStrings.CharacterClass | typingsSlinky.regexpp.regexppStrings.Assertion | typingsSlinky.regexpp.regexppStrings.CharacterClassRange | typingsSlinky.regexpp.regexppStrings.CharacterSet | typingsSlinky.regexpp.regexppStrings.Character | typingsSlinky.regexpp.regexppStrings.Backreference | typingsSlinky.regexpp.regexppStrings.Flags,
    parent: RegExpLiteral | Pattern | Group | CapturingGroup | LookaroundAssertion | Alternative | Quantifier | CharacterClass | CharacterClassRange = null
  ): NodeBase = {
    val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], raw = raw.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any], parent = parent.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[NodeBase]
  }
}

