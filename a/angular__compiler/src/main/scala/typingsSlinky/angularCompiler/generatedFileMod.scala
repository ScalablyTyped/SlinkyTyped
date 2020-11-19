package typingsSlinky.angularCompiler

import typingsSlinky.angularCompiler.outputAstMod.Statement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@angular/compiler/src/aot/generated_file", JSImport.Namespace)
@js.native
object generatedFileMod extends js.Object {
  
  def toTypeScript(file: GeneratedFile): String = js.native
  def toTypeScript(file: GeneratedFile, preamble: String): String = js.native
  
  @js.native
  class GeneratedFile protected () extends js.Object {
    def this(srcFileUrl: String, genFileUrl: String, sourceOrStmts: String) = this()
    def this(srcFileUrl: String, genFileUrl: String, sourceOrStmts: js.Array[Statement]) = this()
    
    var genFileUrl: String = js.native
    
    def isEquivalent(other: GeneratedFile): Boolean = js.native
    
    var source: String | Null = js.native
    
    var srcFileUrl: String = js.native
    
    var stmts: js.Array[Statement] | Null = js.native
  }
}
