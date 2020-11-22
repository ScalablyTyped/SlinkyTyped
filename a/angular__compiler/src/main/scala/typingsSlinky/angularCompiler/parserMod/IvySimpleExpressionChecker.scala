package typingsSlinky.angularCompiler.parserMod

import typingsSlinky.angularCompiler.astMod.RecursiveAstVisitor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * This class implements SimpleExpressionChecker used in View Engine and performs more strict checks
  * to make sure host bindings do not contain pipes. In View Engine, having pipes in host bindings is
  * not supported as well, but in some cases (like `!(value | async)`) the error is not triggered at
  * compile time. In order to preserve View Engine behavior, more strict checks are introduced for
  * Ivy mode only.
  */
/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typingsSlinky.angularCompiler.astMod.AstVisitor because Already inherited
- typingsSlinky.angularCompiler.parserMod.SimpleExpressionChecker because var conflicts: visit, visitASTWithSource, visitThisReceiver, visitUnary. Inlined errors */ @js.native
trait IvySimpleExpressionChecker extends RecursiveAstVisitor {
  
  var errors: js.Array[String] = js.native
  
  def visitPipe(): Unit = js.native
}
