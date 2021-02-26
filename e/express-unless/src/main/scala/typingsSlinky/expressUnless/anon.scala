package typingsSlinky.expressUnless

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait Method extends StObject {
    
    var method: js.UndefOr[String | js.Array[String]] = js.native
    
    var methods: js.UndefOr[js.Array[String]] = js.native
    
    var url: String | js.RegExp = js.native
  }
  object Method {
    
    @scala.inline
    def apply(url: String | js.RegExp): Method = {
      val __obj = js.Dynamic.literal(url = url.asInstanceOf[js.Any])
      __obj.asInstanceOf[Method]
    }
    
    @scala.inline
    implicit class MethodMutableBuilder[Self <: Method] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setMethod(value: String | js.Array[String]): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMethodUndefined: Self = StObject.set(x, "method", js.undefined)
      
      @scala.inline
      def setMethodVarargs(value: String*): Self = StObject.set(x, "method", js.Array(value :_*))
      
      @scala.inline
      def setMethods(value: js.Array[String]): Self = StObject.set(x, "methods", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMethodsUndefined: Self = StObject.set(x, "methods", js.undefined)
      
      @scala.inline
      def setMethodsVarargs(value: String*): Self = StObject.set(x, "methods", js.Array(value :_*))
      
      @scala.inline
      def setUrl(value: String | js.RegExp): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUrlRegExp(value: js.RegExp): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    }
  }
}
