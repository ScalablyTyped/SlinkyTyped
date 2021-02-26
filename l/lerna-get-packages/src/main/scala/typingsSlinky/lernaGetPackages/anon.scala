package typingsSlinky.lernaGetPackages

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait AdditionalTsTypings extends StObject {
    
    var additionalTsTypings: js.UndefOr[js.Array[String]] = js.native
  }
  object AdditionalTsTypings {
    
    @scala.inline
    def apply(): AdditionalTsTypings = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AdditionalTsTypings]
    }
    
    @scala.inline
    implicit class AdditionalTsTypingsMutableBuilder[Self <: AdditionalTsTypings] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAdditionalTsTypings(value: js.Array[String]): Self = StObject.set(x, "additionalTsTypings", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAdditionalTsTypingsUndefined: Self = StObject.set(x, "additionalTsTypings", js.undefined)
      
      @scala.inline
      def setAdditionalTsTypingsVarargs(value: String*): Self = StObject.set(x, "additionalTsTypings", js.Array(value :_*))
    }
  }
  
  @js.native
  trait Config extends StObject {
    
    var config: js.UndefOr[AdditionalTsTypings] = js.native
    
    var main: js.UndefOr[String] = js.native
    
    var name: String = js.native
    
    var `private`: js.UndefOr[Boolean] = js.native
    
    var version: String = js.native
  }
  object Config {
    
    @scala.inline
    def apply(name: String, version: String): Config = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
      __obj.asInstanceOf[Config]
    }
    
    @scala.inline
    implicit class ConfigMutableBuilder[Self <: Config] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setConfig(value: AdditionalTsTypings): Self = StObject.set(x, "config", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setConfigUndefined: Self = StObject.set(x, "config", js.undefined)
      
      @scala.inline
      def setMain(value: String): Self = StObject.set(x, "main", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMainUndefined: Self = StObject.set(x, "main", js.undefined)
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPrivate(value: Boolean): Self = StObject.set(x, "private", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPrivateUndefined: Self = StObject.set(x, "private", js.undefined)
      
      @scala.inline
      def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    }
  }
}
