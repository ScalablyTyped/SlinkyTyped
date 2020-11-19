package typingsSlinky.angularCompiler

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@angular/compiler/src/resource_loader", JSImport.Namespace)
@js.native
object resourceLoaderMod extends js.Object {
  
  @js.native
  class ResourceLoader () extends js.Object {
    
    def get(url: String): js.Promise[String] | String = js.native
  }
}
