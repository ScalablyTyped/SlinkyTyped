package typingsSlinky.openapiFramework

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.openapiFramework.anon.Enum
import typingsSlinky.openapiTypes.mod.OpenAPIV3.ServerObject
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object basePathMod {
  
  @JSImport("openapi-framework/dist/src/BasePath", JSImport.Default)
  @js.native
  class default protected () extends BasePath {
    def this(server: ServerObject) = this()
  }
  
  @js.native
  trait BasePath extends StObject {
    
    def hasVariables(): Boolean = js.native
    
    val path: String = js.native
    
    val variables: StringDictionary[Enum] = js.native
  }
  object BasePath {
    
    @scala.inline
    def apply(hasVariables: () => Boolean, path: String, variables: StringDictionary[Enum]): BasePath = {
      val __obj = js.Dynamic.literal(hasVariables = js.Any.fromFunction0(hasVariables), path = path.asInstanceOf[js.Any], variables = variables.asInstanceOf[js.Any])
      __obj.asInstanceOf[BasePath]
    }
    
    @scala.inline
    implicit class BasePathMutableBuilder[Self <: BasePath] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setHasVariables(value: () => Boolean): Self = StObject.set(x, "hasVariables", js.Any.fromFunction0(value))
      
      @scala.inline
      def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVariables(value: StringDictionary[Enum]): Self = StObject.set(x, "variables", value.asInstanceOf[js.Any])
    }
  }
}
