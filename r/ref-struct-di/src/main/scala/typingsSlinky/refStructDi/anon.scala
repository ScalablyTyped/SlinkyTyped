package typingsSlinky.refStructDi

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait Type extends StObject {
    
    var `type`: typingsSlinky.refNapi.mod.Type = js.native
  }
  object Type {
    
    @scala.inline
    def apply(`type`: typingsSlinky.refNapi.mod.Type): Type = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[Type]
    }
    
    @scala.inline
    implicit class TypeMutableBuilder[Self <: Type] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setType(value: typingsSlinky.refNapi.mod.Type): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
}
