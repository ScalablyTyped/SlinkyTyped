package typingsSlinky.formSerializer

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object FormSerializer {
  
  @js.native
  trait FormSerializerPatterns extends StObject {
    
    var fixed: js.RegExp = js.native
    
    var key: js.RegExp = js.native
    
    var named: js.RegExp = js.native
    
    var push: js.RegExp = js.native
    
    var validate: js.RegExp = js.native
  }
  object FormSerializerPatterns {
    
    @scala.inline
    def apply(fixed: js.RegExp, key: js.RegExp, named: js.RegExp, push: js.RegExp, validate: js.RegExp): FormSerializerPatterns = {
      val __obj = js.Dynamic.literal(fixed = fixed.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any], named = named.asInstanceOf[js.Any], push = push.asInstanceOf[js.Any], validate = validate.asInstanceOf[js.Any])
      __obj.asInstanceOf[FormSerializerPatterns]
    }
    
    @scala.inline
    implicit class FormSerializerPatternsMutableBuilder[Self <: FormSerializerPatterns] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFixed(value: js.RegExp): Self = StObject.set(x, "fixed", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKey(value: js.RegExp): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNamed(value: js.RegExp): Self = StObject.set(x, "named", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPush(value: js.RegExp): Self = StObject.set(x, "push", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValidate(value: js.RegExp): Self = StObject.set(x, "validate", value.asInstanceOf[js.Any])
    }
  }
}
