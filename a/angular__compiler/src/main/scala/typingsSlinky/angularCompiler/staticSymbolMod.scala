package typingsSlinky.angularCompiler

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@angular/compiler/src/aot/static_symbol", JSImport.Namespace)
@js.native
object staticSymbolMod extends js.Object {
  
  @js.native
  class StaticSymbol protected () extends js.Object {
    def this(filePath: String, name: String, members: js.Array[String]) = this()
    
    def assertNoMembers(): Unit = js.native
    
    var filePath: String = js.native
    
    var members: js.Array[String] = js.native
    
    var name: String = js.native
  }
  
  @js.native
  class StaticSymbolCache () extends js.Object {
    
    var cache: js.Any = js.native
    
    def get(declarationFile: String, name: String): StaticSymbol = js.native
    def get(declarationFile: String, name: String, members: js.Array[String]): StaticSymbol = js.native
  }
}
