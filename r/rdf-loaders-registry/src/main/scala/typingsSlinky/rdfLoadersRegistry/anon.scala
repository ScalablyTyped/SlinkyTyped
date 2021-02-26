package typingsSlinky.rdfLoadersRegistry

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait LoaderRegistry extends StObject {
    
    var loaderRegistry: typingsSlinky.rdfLoadersRegistry.mod.LoaderRegistry = js.native
  }
  object LoaderRegistry {
    
    @scala.inline
    def apply(loaderRegistry: typingsSlinky.rdfLoadersRegistry.mod.LoaderRegistry): LoaderRegistry = {
      val __obj = js.Dynamic.literal(loaderRegistry = loaderRegistry.asInstanceOf[js.Any])
      __obj.asInstanceOf[LoaderRegistry]
    }
    
    @scala.inline
    implicit class LoaderRegistryMutableBuilder[Self <: LoaderRegistry] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setLoaderRegistry(value: typingsSlinky.rdfLoadersRegistry.mod.LoaderRegistry): Self = StObject.set(x, "loaderRegistry", value.asInstanceOf[js.Any])
    }
  }
}
