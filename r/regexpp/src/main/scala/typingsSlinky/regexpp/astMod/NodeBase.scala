package typingsSlinky.regexpp.astMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait NodeBase extends StObject {
  
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
  implicit class NodeBaseMutableBuilder[Self <: NodeBase] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEnd(value: Double): Self = StObject.set(x, "end", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParent(
      value: RegExpLiteral | Pattern | Group | CapturingGroup | LookaroundAssertion | Alternative | Quantifier | CharacterClass | CharacterClassRange
    ): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParentNull: Self = StObject.set(x, "parent", null)
    
    @scala.inline
    def setRaw(value: String): Self = StObject.set(x, "raw", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStart(value: Double): Self = StObject.set(x, "start", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(
      value: typingsSlinky.regexpp.regexppStrings.RegExpLiteral | typingsSlinky.regexpp.regexppStrings.Pattern | typingsSlinky.regexpp.regexppStrings.Alternative | typingsSlinky.regexpp.regexppStrings.Group | typingsSlinky.regexpp.regexppStrings.CapturingGroup | typingsSlinky.regexpp.regexppStrings.Quantifier | typingsSlinky.regexpp.regexppStrings.CharacterClass | typingsSlinky.regexpp.regexppStrings.Assertion | typingsSlinky.regexpp.regexppStrings.CharacterClassRange | typingsSlinky.regexpp.regexppStrings.CharacterSet | typingsSlinky.regexpp.regexppStrings.Character | typingsSlinky.regexpp.regexppStrings.Backreference | typingsSlinky.regexpp.regexppStrings.Flags
    ): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
