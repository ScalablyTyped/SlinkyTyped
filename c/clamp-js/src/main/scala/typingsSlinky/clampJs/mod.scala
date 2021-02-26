package typingsSlinky.clampJs

import org.scalajs.dom.raw.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("clamp-js", JSImport.Namespace)
  @js.native
  def apply(element: HTMLElement): ClampResponse = js.native
  @JSImport("clamp-js", JSImport.Namespace)
  @js.native
  def apply(element: HTMLElement, options: ClampOptions): ClampResponse = js.native
  
  @js.native
  trait ClampOptions extends StObject {
    
    var animate: js.UndefOr[Boolean] = js.native
    
    var clamp: js.UndefOr[Double | String] = js.native
    
    var splitOnChars: js.UndefOr[js.Array[String]] = js.native
    
    var truncationChar: js.UndefOr[String] = js.native
    
    var truncationHTML: js.UndefOr[String | Null] = js.native
    
    var useNativeClamp: js.UndefOr[Boolean] = js.native
  }
  object ClampOptions {
    
    @scala.inline
    def apply(): ClampOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ClampOptions]
    }
    
    @scala.inline
    implicit class ClampOptionsMutableBuilder[Self <: ClampOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAnimate(value: Boolean): Self = StObject.set(x, "animate", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAnimateUndefined: Self = StObject.set(x, "animate", js.undefined)
      
      @scala.inline
      def setClamp(value: Double | String): Self = StObject.set(x, "clamp", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClampUndefined: Self = StObject.set(x, "clamp", js.undefined)
      
      @scala.inline
      def setSplitOnChars(value: js.Array[String]): Self = StObject.set(x, "splitOnChars", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSplitOnCharsUndefined: Self = StObject.set(x, "splitOnChars", js.undefined)
      
      @scala.inline
      def setSplitOnCharsVarargs(value: String*): Self = StObject.set(x, "splitOnChars", js.Array(value :_*))
      
      @scala.inline
      def setTruncationChar(value: String): Self = StObject.set(x, "truncationChar", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTruncationCharUndefined: Self = StObject.set(x, "truncationChar", js.undefined)
      
      @scala.inline
      def setTruncationHTML(value: String): Self = StObject.set(x, "truncationHTML", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTruncationHTMLNull: Self = StObject.set(x, "truncationHTML", null)
      
      @scala.inline
      def setTruncationHTMLUndefined: Self = StObject.set(x, "truncationHTML", js.undefined)
      
      @scala.inline
      def setUseNativeClamp(value: Boolean): Self = StObject.set(x, "useNativeClamp", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUseNativeClampUndefined: Self = StObject.set(x, "useNativeClamp", js.undefined)
    }
  }
  
  @js.native
  trait ClampResponse extends StObject {
    
    var clamped: String = js.native
    
    var original: String = js.native
  }
  object ClampResponse {
    
    @scala.inline
    def apply(clamped: String, original: String): ClampResponse = {
      val __obj = js.Dynamic.literal(clamped = clamped.asInstanceOf[js.Any], original = original.asInstanceOf[js.Any])
      __obj.asInstanceOf[ClampResponse]
    }
    
    @scala.inline
    implicit class ClampResponseMutableBuilder[Self <: ClampResponse] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setClamped(value: String): Self = StObject.set(x, "clamped", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOriginal(value: String): Self = StObject.set(x, "original", value.asInstanceOf[js.Any])
    }
  }
}
