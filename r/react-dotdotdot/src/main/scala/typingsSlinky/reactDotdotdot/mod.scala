package typingsSlinky.reactDotdotdot

import typingsSlinky.react.mod.Component
import typingsSlinky.react.mod.HTMLProps
import typingsSlinky.reactDotdotdot.reactDotdotdotStrings.auto
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("react-dotdotdot", JSImport.Default)
  @js.native
  class default ()
    extends Component[DotdotdotProps, js.Object, js.Any]
  
  @js.native
  trait Dotdotdot
    extends Component[DotdotdotProps, js.Object, js.Any]
  
  @js.native
  trait DotdotdotProps extends HTMLProps[Dotdotdot] {
    
    /** Animate clamp */
    var animate: js.UndefOr[Boolean] = js.native
    
    /**
      * The number of lines that should be displayed, a css pixel value for height
      * as a string (i.e. "100px"), or "auto" to try and fill the available space
      */
    var clamp: String | Double | auto = js.native
    
    /** Split on sentences (periods), hypens, en-dashes, em-dashes, and words */
    var splitOnChars: js.UndefOr[js.Array[String]] = js.native
    
    /** The type of HTML tag which will wrap the component's content */
    var tagName: js.UndefOr[String] = js.native
    
    /**
      * The character to insert at the end of the HTML element after trunation is
      * performed.
      */
    var truncationChar: js.UndefOr[String] = js.native
    
    /** String of HTML to use instead of truncationChar */
    var truncationHTML: js.UndefOr[String] = js.native
    
    /** Use -webkit-line-clamp available in WebKit (Chrome, Safari) only */
    var useNativeClamp: js.UndefOr[Boolean] = js.native
  }
  object DotdotdotProps {
    
    @scala.inline
    def apply(clamp: String | Double | auto): DotdotdotProps = {
      val __obj = js.Dynamic.literal(clamp = clamp.asInstanceOf[js.Any])
      __obj.asInstanceOf[DotdotdotProps]
    }
    
    @scala.inline
    implicit class DotdotdotPropsMutableBuilder[Self <: DotdotdotProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAnimate(value: Boolean): Self = StObject.set(x, "animate", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAnimateUndefined: Self = StObject.set(x, "animate", js.undefined)
      
      @scala.inline
      def setClamp(value: String | Double | auto): Self = StObject.set(x, "clamp", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSplitOnChars(value: js.Array[String]): Self = StObject.set(x, "splitOnChars", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSplitOnCharsUndefined: Self = StObject.set(x, "splitOnChars", js.undefined)
      
      @scala.inline
      def setSplitOnCharsVarargs(value: String*): Self = StObject.set(x, "splitOnChars", js.Array(value :_*))
      
      @scala.inline
      def setTagName(value: String): Self = StObject.set(x, "tagName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTagNameUndefined: Self = StObject.set(x, "tagName", js.undefined)
      
      @scala.inline
      def setTruncationChar(value: String): Self = StObject.set(x, "truncationChar", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTruncationCharUndefined: Self = StObject.set(x, "truncationChar", js.undefined)
      
      @scala.inline
      def setTruncationHTML(value: String): Self = StObject.set(x, "truncationHTML", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTruncationHTMLUndefined: Self = StObject.set(x, "truncationHTML", js.undefined)
      
      @scala.inline
      def setUseNativeClamp(value: Boolean): Self = StObject.set(x, "useNativeClamp", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUseNativeClampUndefined: Self = StObject.set(x, "useNativeClamp", js.undefined)
    }
  }
}
