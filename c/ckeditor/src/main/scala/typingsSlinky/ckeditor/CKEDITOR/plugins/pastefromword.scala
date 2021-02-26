package typingsSlinky.ckeditor.CKEDITOR.plugins

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.ckeditor.CKEDITOR.htmlParser.element
import typingsSlinky.ckeditor.CKEDITOR.plugins.pastefromword.lists.numbering
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object pastefromword {
  
  @js.native
  trait lists extends StObject {
    
    var numbering: numbering = js.native
  }
  object lists {
    
    @scala.inline
    def apply(numbering: numbering): lists = {
      val __obj = js.Dynamic.literal(numbering = numbering.asInstanceOf[js.Any])
      __obj.asInstanceOf[lists]
    }
    
    @scala.inline
    implicit class listsMutableBuilder[Self <: lists] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setNumbering(value: numbering): Self = StObject.set(x, "numbering", value.asInstanceOf[js.Any])
    }
    
    @js.native
    trait numbering extends StObject {
      
      def getStyle(marker: String): String = js.native
      
      def toNumber(marker: String, markerType: String): Double = js.native
    }
    object numbering {
      
      @scala.inline
      def apply(getStyle: String => String, toNumber: (String, String) => Double): numbering = {
        val __obj = js.Dynamic.literal(getStyle = js.Any.fromFunction1(getStyle), toNumber = js.Any.fromFunction2(toNumber))
        __obj.asInstanceOf[numbering]
      }
      
      @scala.inline
      implicit class numberingMutableBuilder[Self <: numbering] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setGetStyle(value: String => String): Self = StObject.set(x, "getStyle", js.Any.fromFunction1(value))
        
        @scala.inline
        def setToNumber(value: (String, String) => Double): Self = StObject.set(x, "toNumber", js.Any.fromFunction2(value))
      }
    }
  }
  
  @js.native
  trait styles extends StObject {
    
    def pushStylesLower(element: element, exceptions: StringDictionary[Boolean]): Boolean = js.native
    def pushStylesLower(element: element, exceptions: StringDictionary[Boolean], wrapText: Boolean): Boolean = js.native
  }
}
