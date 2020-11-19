package typingsSlinky.regexpp.astMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait NodeBase extends js.Object {
  
  var end: Double = js.native
  
  var parent: Null | RegExpLiteral | Pattern | Group | CapturingGroup | LookaroundAssertion | Alternative | Quantifier | CharacterClass | CharacterClassRange = js.native
  
  var raw: String = js.native
  
  var start: Double = js.native
  
  var `type`: typingsSlinky.regexpp.regexppStrings.RegExpLiteral | typingsSlinky.regexpp.regexppStrings.Pattern | typingsSlinky.regexpp.regexppStrings.Alternative | typingsSlinky.regexpp.regexppStrings.Group | typingsSlinky.regexpp.regexppStrings.CapturingGroup | typingsSlinky.regexpp.regexppStrings.Quantifier | typingsSlinky.regexpp.regexppStrings.CharacterClass | typingsSlinky.regexpp.regexppStrings.Assertion | typingsSlinky.regexpp.regexppStrings.CharacterClassRange | typingsSlinky.regexpp.regexppStrings.CharacterSet | typingsSlinky.regexpp.regexppStrings.Character | typingsSlinky.regexpp.regexppStrings.Backreference | typingsSlinky.regexpp.regexppStrings.Flags = js.native
}
object NodeBase {
  
  @scala.inline
  def apply(
    end: Double,
    raw: String,
    start: Double,
    `type`: typingsSlinky.regexpp.regexppStrings.RegExpLiteral | typingsSlinky.regexpp.regexppStrings.Pattern | typingsSlinky.regexpp.regexppStrings.Alternative | typingsSlinky.regexpp.regexppStrings.Group | typingsSlinky.regexpp.regexppStrings.CapturingGroup | typingsSlinky.regexpp.regexppStrings.Quantifier | typingsSlinky.regexpp.regexppStrings.CharacterClass | typingsSlinky.regexpp.regexppStrings.Assertion | typingsSlinky.regexpp.regexppStrings.CharacterClassRange | typingsSlinky.regexpp.regexppStrings.CharacterSet | typingsSlinky.regexpp.regexppStrings.Character | typingsSlinky.regexpp.regexppStrings.Backreference | typingsSlinky.regexpp.regexppStrings.Flags
  ): NodeBase = {
    val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], raw = raw.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[NodeBase]
  }
  
  @scala.inline
  implicit class NodeBaseOps[Self <: NodeBase] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setEnd(value: Double): Self = this.set("end", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRaw(value: String): Self = this.set("raw", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStart(value: Double): Self = this.set("start", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(
      value: typingsSlinky.regexpp.regexppStrings.RegExpLiteral | typingsSlinky.regexpp.regexppStrings.Pattern | typingsSlinky.regexpp.regexppStrings.Alternative | typingsSlinky.regexpp.regexppStrings.Group | typingsSlinky.regexpp.regexppStrings.CapturingGroup | typingsSlinky.regexpp.regexppStrings.Quantifier | typingsSlinky.regexpp.regexppStrings.CharacterClass | typingsSlinky.regexpp.regexppStrings.Assertion | typingsSlinky.regexpp.regexppStrings.CharacterClassRange | typingsSlinky.regexpp.regexppStrings.CharacterSet | typingsSlinky.regexpp.regexppStrings.Character | typingsSlinky.regexpp.regexppStrings.Backreference | typingsSlinky.regexpp.regexppStrings.Flags
    ): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParent(
      value: RegExpLiteral | Pattern | Group | CapturingGroup | LookaroundAssertion | Alternative | Quantifier | CharacterClass | CharacterClassRange
    ): Self = this.set("parent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParentNull: Self = this.set("parent", null)
  }
}
