package typingsSlinky.mmdbLib

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesMod {
  
  @js.native
  trait Cache extends StObject {
    
    def get(key: String): js.Any = js.native
    def get(key: Double): js.Any = js.native
    
    def set(key: String, value: js.Any): js.Any = js.native
    def set(key: Double, value: js.Any): js.Any = js.native
  }
  
  @js.native
  trait ReaderOptions extends StObject {
    
    var cache: js.UndefOr[Cache] = js.native
  }
  object ReaderOptions {
    
    @scala.inline
    def apply(): ReaderOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ReaderOptions]
    }
    
    @scala.inline
    implicit class ReaderOptionsMutableBuilder[Self <: ReaderOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCache(value: Cache): Self = StObject.set(x, "cache", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCacheUndefined: Self = StObject.set(x, "cache", js.undefined)
    }
  }
}
