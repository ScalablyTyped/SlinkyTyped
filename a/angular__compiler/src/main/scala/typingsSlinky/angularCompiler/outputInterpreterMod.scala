package typingsSlinky.angularCompiler

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.angularCompiler.compileReflectorMod.CompileReflector
import typingsSlinky.angularCompiler.outputAstMod.Statement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@angular/compiler/src/output/output_interpreter", JSImport.Namespace)
@js.native
object outputInterpreterMod extends js.Object {
  
  def interpretStatements(statements: js.Array[Statement], reflector: CompileReflector): StringDictionary[js.Any] = js.native
}
