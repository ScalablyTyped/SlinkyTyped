package typingsSlinky.facebookJsSdk

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait Name extends StObject {
    
    var name: String = js.native
    
    var user_ids: js.Array[String] = js.native
  }
  object Name {
    
    @scala.inline
    def apply(name: String, user_ids: js.Array[String]): Name = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], user_ids = user_ids.asInstanceOf[js.Any])
      __obj.asInstanceOf[Name]
    }
    
    @scala.inline
    implicit class NameMutableBuilder[Self <: Name] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUser_ids(value: js.Array[String]): Self = StObject.set(x, "user_ids", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUser_idsVarargs(value: String*): Self = StObject.set(x, "user_ids", js.Array(value :_*))
    }
  }
}
