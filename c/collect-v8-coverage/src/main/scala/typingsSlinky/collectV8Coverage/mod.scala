package typingsSlinky.collectV8Coverage

import typingsSlinky.node.inspectorMod.Profiler.ScriptCoverage
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("collect-v8-coverage", JSImport.Namespace)
@js.native
object mod extends js.Object {
  
  @js.native
  class CoverageInstrumenter () extends js.Object {
    
    def startInstrumenting(): js.Promise[Unit] = js.native
    
    def stopInstrumenting(): js.Promise[V8Coverage] = js.native
  }
  
  type V8Coverage = js.Array[ScriptCoverage]
}
