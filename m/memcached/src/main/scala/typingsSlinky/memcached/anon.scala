package typingsSlinky.memcached

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait Dictkey
    extends /* key */ StringDictionary[js.Any] {
    
    var cas: String = js.native
  }
  object Dictkey {
    
    @scala.inline
    def apply(cas: String): Dictkey = {
      val __obj = js.Dynamic.literal(cas = cas.asInstanceOf[js.Any])
      __obj.asInstanceOf[Dictkey]
    }
    
    @scala.inline
    implicit class DictkeyMutableBuilder[Self <: Dictkey] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCas(value: String): Self = StObject.set(x, "cas", value.asInstanceOf[js.Any])
    }
  }
}
