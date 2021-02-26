package typingsSlinky.angularCompiler

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.angularCompiler.compileReflectorMod.CompileReflector
import typingsSlinky.angularCompiler.outputAstMod.Statement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object outputInterpreterMod {
  
  @JSImport("@angular/compiler/src/output/output_interpreter", "interpretStatements")
  @js.native
  def interpretStatements(statements: js.Array[Statement], reflector: CompileReflector): StringDictionary[js.Any] = js.native
}
