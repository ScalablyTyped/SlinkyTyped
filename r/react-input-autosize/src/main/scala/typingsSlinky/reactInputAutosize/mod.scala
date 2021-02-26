package typingsSlinky.reactInputAutosize

import org.scalajs.dom.raw.HTMLInputElement
import typingsSlinky.react.mod.CSSProperties
import typingsSlinky.react.mod.ClassAttributes
import typingsSlinky.react.mod.Component
import typingsSlinky.react.mod.InputHTMLAttributes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("react-input-autosize", JSImport.Default)
  @js.native
  class default () extends AutosizeInput
  
  @js.native
  trait AutosizeInput
    extends Component[AutosizeInputProps, js.Object, js.Any] {
    
    def copyInputStyles(): Unit = js.native
    
    def getInput(): HTMLInputElement = js.native
  }
  
  @js.native
  trait AutosizeInputProps
    extends InputHTMLAttributes[HTMLInputElement]
       with ClassAttributes[HTMLInputElement] {
    
    var extraWidth: js.UndefOr[String | Double] = js.native
    
    var injectStyles: js.UndefOr[Boolean] = js.native
    
    var inputClassName: js.UndefOr[String] = js.native
    
    var inputRef: js.UndefOr[js.Function1[/* instance */ HTMLInputElement | Null, Unit]] = js.native
    
    var inputStyle: js.UndefOr[CSSProperties] = js.native
    
    var minWidth: js.UndefOr[String | Double] = js.native
    
    var onAutosize: js.UndefOr[js.Function1[/* inputWidth */ String | Double, Unit]] = js.native
    
    var placeholderIsMinWidth: js.UndefOr[Boolean] = js.native
  }
  object AutosizeInputProps {
    
    @scala.inline
    def apply(): AutosizeInputProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AutosizeInputProps]
    }
    
    @scala.inline
    implicit class AutosizeInputPropsMutableBuilder[Self <: AutosizeInputProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setExtraWidth(value: String | Double): Self = StObject.set(x, "extraWidth", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExtraWidthUndefined: Self = StObject.set(x, "extraWidth", js.undefined)
      
      @scala.inline
      def setInjectStyles(value: Boolean): Self = StObject.set(x, "injectStyles", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInjectStylesUndefined: Self = StObject.set(x, "injectStyles", js.undefined)
      
      @scala.inline
      def setInputClassName(value: String): Self = StObject.set(x, "inputClassName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInputClassNameUndefined: Self = StObject.set(x, "inputClassName", js.undefined)
      
      @scala.inline
      def setInputRef(value: /* instance */ HTMLInputElement | Null => Unit): Self = StObject.set(x, "inputRef", js.Any.fromFunction1(value))
      
      @scala.inline
      def setInputRefUndefined: Self = StObject.set(x, "inputRef", js.undefined)
      
      @scala.inline
      def setInputStyle(value: CSSProperties): Self = StObject.set(x, "inputStyle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInputStyleUndefined: Self = StObject.set(x, "inputStyle", js.undefined)
      
      @scala.inline
      def setMinWidth(value: String | Double): Self = StObject.set(x, "minWidth", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMinWidthUndefined: Self = StObject.set(x, "minWidth", js.undefined)
      
      @scala.inline
      def setOnAutosize(value: /* inputWidth */ String | Double => Unit): Self = StObject.set(x, "onAutosize", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnAutosizeUndefined: Self = StObject.set(x, "onAutosize", js.undefined)
      
      @scala.inline
      def setPlaceholderIsMinWidth(value: Boolean): Self = StObject.set(x, "placeholderIsMinWidth", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPlaceholderIsMinWidthUndefined: Self = StObject.set(x, "placeholderIsMinWidth", js.undefined)
    }
  }
}
