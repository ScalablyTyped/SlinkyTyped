package typingsSlinky.di

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("di", "Injector")
  @js.native
  class Injector () extends StObject {
    def this(modules: js.Array[js.Object]) = this()
    def this(modules: js.UndefOr[scala.Nothing], parent: Injector) = this()
    def this(modules: js.Array[js.Object], parent: Injector) = this()
    
    def createChild(modules: js.Array[js.Object]): Injector = js.native
    
    def get(dep: String): js.Object = js.native
    
    def instantiate(hasPrototype: js.Any): js.Object = js.native
    
    def invoke(
      fn: js.Function2[/* context */ js.Object, /* deps */ js.Array[js.Object], js.Object],
      context: js.Object
    ): js.Object = js.native
  }
}
