package typingsSlinky.angularCompiler

import typingsSlinky.angularCompiler.abstractEmitterMod.AbstractEmitterVisitor
import typingsSlinky.angularCompiler.abstractEmitterMod.EmitterVisitorContext
import typingsSlinky.angularCompiler.outputAstMod.CastExpr
import typingsSlinky.angularCompiler.outputAstMod.DeclareFunctionStmt
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object abstractJsEmitterMod {
  
  @JSImport("@angular/compiler/src/output/abstract_js_emitter", "AbstractJsEmitterVisitor")
  @js.native
  abstract class AbstractJsEmitterVisitor () extends AbstractEmitterVisitor {
    
    var _visitClassConstructor: js.Any = js.native
    
    var _visitClassGetter: js.Any = js.native
    
    var _visitClassMethod: js.Any = js.native
    
    var _visitParams: js.Any = js.native
    
    def visitCastExpr(ast: CastExpr, ctx: EmitterVisitorContext): js.Any = js.native
    
    def visitDeclareFunctionStmt(stmt: DeclareFunctionStmt, ctx: EmitterVisitorContext): js.Any = js.native
  }
}
