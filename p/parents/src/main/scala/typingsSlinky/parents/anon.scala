package typingsSlinky.parents

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait Platform extends StObject {
    
    var platform: js.UndefOr[String] = js.native
  }
  object Platform {
    
    @scala.inline
    def apply(): Platform = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Platform]
    }
    
    @scala.inline
    implicit class PlatformMutableBuilder[Self <: Platform] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setPlatform(value: String): Self = StObject.set(x, "platform", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPlatformUndefined: Self = StObject.set(x, "platform", js.undefined)
    }
  }
}
