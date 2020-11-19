package typingsSlinky.angularCompiler

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.angularCompiler.compileReflectorMod.CompileReflector
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@angular/compiler/src/render3/r3_jit", JSImport.Namespace)
@js.native
object r3JitMod extends js.Object {
  
  @js.native
  class R3JitReflector protected () extends CompileReflector {
    def this(context: StringDictionary[js.Any]) = this()
    
    def componentModuleUrl(`type`: js.Any, cmpMetadata: js.Any): String = js.native
    
    var context: js.Any = js.native
  }
}
