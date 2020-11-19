package typingsSlinky.lasso

import typingsSlinky.lasso.dependenciesMod.DependencyRegistry
import typingsSlinky.lasso.writerMod.Writer
import typingsSlinky.node.eventsMod.EventEmitter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("lasso/lib/LassoContext", JSImport.Namespace)
@js.native
object lassoContextMod extends js.Object {
  
  @js.native
  trait LassoContext extends EventEmitter {
    
    var LassoContext: Boolean = js.native
    
    var basePath: js.UndefOr[String] = js.native
    
    var cache: js.Any = js.native
    
    var config: js.Any = js.native
    
    var contentType: js.UndefOr[String] = js.native
    
    var data: js.UndefOr[js.Any] = js.native
    
    var dependencyRegistry: DependencyRegistry = js.native
    
    var flags: js.Array[_] = js.native
    
    var lasso: typingsSlinky.lasso.lassoMod.default = js.native
    
    var options: js.Any = js.native
    
    def writer(impl: js.Any): Writer = js.native
    @JSName("writer")
    var writer_Original: typingsSlinky.lasso.writersMod.Writer = js.native
  }
  
  @js.native
  class default () extends LassoContext
}
