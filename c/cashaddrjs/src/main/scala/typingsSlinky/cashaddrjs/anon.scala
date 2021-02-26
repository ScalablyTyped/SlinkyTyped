package typingsSlinky.cashaddrjs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait Hash extends StObject {
    
    var hash: js.typedarray.Uint8Array = js.native
    
    var prefix: String = js.native
    
    var `type`: String = js.native
  }
  object Hash {
    
    @scala.inline
    def apply(hash: js.typedarray.Uint8Array, prefix: String, `type`: String): Hash = {
      val __obj = js.Dynamic.literal(hash = hash.asInstanceOf[js.Any], prefix = prefix.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[Hash]
    }
    
    @scala.inline
    implicit class HashMutableBuilder[Self <: Hash] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setHash(value: js.typedarray.Uint8Array): Self = StObject.set(x, "hash", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPrefix(value: String): Self = StObject.set(x, "prefix", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
}
