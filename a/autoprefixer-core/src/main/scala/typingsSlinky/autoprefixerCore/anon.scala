package typingsSlinky.autoprefixerCore

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait Inline extends StObject {
    
    var `inline`: js.UndefOr[Boolean] = js.native
    
    var prev: js.UndefOr[String | js.Object] = js.native
  }
  object Inline {
    
    @scala.inline
    def apply(): Inline = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Inline]
    }
    
    @scala.inline
    implicit class InlineMutableBuilder[Self <: Inline] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setInline(value: Boolean): Self = StObject.set(x, "inline", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInlineUndefined: Self = StObject.set(x, "inline", js.undefined)
      
      @scala.inline
      def setPrev(value: String | js.Object): Self = StObject.set(x, "prev", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPrevUndefined: Self = StObject.set(x, "prev", js.undefined)
    }
  }
}
