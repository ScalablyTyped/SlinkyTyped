package typingsSlinky.relayCompiler.iRMod

import typingsSlinky.relayCompiler.irvisitorMod.VisitNode
import typingsSlinky.relayCompiler.schemaMod.TypeID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Variable
  extends ArgumentValue
     with IR
     with VisitNode {
  
  var kind: typingsSlinky.relayCompiler.relayCompilerStrings.Variable = js.native
  
  var loc: Location = js.native
  
  var `type`: js.UndefOr[TypeID] = js.native
  
  var variableName: String = js.native
}
object Variable {
  
  @scala.inline
  def apply(
    kind: typingsSlinky.relayCompiler.relayCompilerStrings.Variable,
    loc: Location,
    variableName: String
  ): Variable = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], variableName = variableName.asInstanceOf[js.Any])
    __obj.asInstanceOf[Variable]
  }
  
  @scala.inline
  implicit class VariableOps[Self <: Variable] (val x: Self) extends AnyVal {
    
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
    def setKind(value: typingsSlinky.relayCompiler.relayCompilerStrings.Variable): Self = this.set("kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLoc(value: Location): Self = this.set("loc", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVariableName(value: String): Self = this.set("variableName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: TypeID): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
  }
}
