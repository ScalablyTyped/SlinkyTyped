package typingsSlinky.babelTypes.ts36Mod

import typingsSlinky.babelTypes.babelTypesStrings.SwitchStatement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SwitchStatement_
  extends Node
     with BlockParent
     with Scopable
     with Statement {
  
  var cases: js.Array[SwitchCase_] = js.native
  
  var discriminant: Expression = js.native
  
  @JSName("type")
  var type_SwitchStatement_ : SwitchStatement = js.native
}
object SwitchStatement_ {
  
  @scala.inline
  def apply(
    cases: js.Array[SwitchCase_],
    discriminant: Expression,
    end: Double,
    loc: SourceLocation,
    start: Double,
    `type`: SwitchStatement
  ): SwitchStatement_ = {
    val __obj = js.Dynamic.literal(cases = cases.asInstanceOf[js.Any], discriminant = discriminant.asInstanceOf[js.Any], end = end.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[SwitchStatement_]
  }
  
  @scala.inline
  implicit class SwitchStatement_Ops[Self <: SwitchStatement_] (val x: Self) extends AnyVal {
    
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
    def setCasesVarargs(value: SwitchCase_ *): Self = this.set("cases", js.Array(value :_*))
    
    @scala.inline
    def setCases(value: js.Array[SwitchCase_]): Self = this.set("cases", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDiscriminant(value: Expression): Self = this.set("discriminant", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: SwitchStatement): Self = this.set("type", value.asInstanceOf[js.Any])
  }
}
