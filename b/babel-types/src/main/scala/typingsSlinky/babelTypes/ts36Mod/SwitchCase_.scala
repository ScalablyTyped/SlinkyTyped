package typingsSlinky.babelTypes.ts36Mod

import typingsSlinky.babelTypes.babelTypesStrings.SwitchCase
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SwitchCase_ extends Node {
  
  var consequent: js.Array[Statement] = js.native
  
  var test: Expression = js.native
  
  @JSName("type")
  var type_SwitchCase_ : SwitchCase = js.native
}
object SwitchCase_ {
  
  @scala.inline
  def apply(
    consequent: js.Array[Statement],
    end: Double,
    loc: SourceLocation,
    start: Double,
    test: Expression,
    `type`: SwitchCase
  ): SwitchCase_ = {
    val __obj = js.Dynamic.literal(consequent = consequent.asInstanceOf[js.Any], end = end.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any], test = test.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[SwitchCase_]
  }
  
  @scala.inline
  implicit class SwitchCase_Ops[Self <: SwitchCase_] (val x: Self) extends AnyVal {
    
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
    def setConsequentVarargs(value: Statement*): Self = this.set("consequent", js.Array(value :_*))
    
    @scala.inline
    def setConsequent(value: js.Array[Statement]): Self = this.set("consequent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTest(value: Expression): Self = this.set("test", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: SwitchCase): Self = this.set("type", value.asInstanceOf[js.Any])
  }
}
