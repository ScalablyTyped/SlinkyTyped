package typingsSlinky.reactColor

import org.scalajs.dom.raw.HTMLInputElement
import typingsSlinky.react.mod.CSSProperties
import typingsSlinky.react.mod.ChangeEvent
import typingsSlinky.react.mod.ClassAttributes
import typingsSlinky.react.mod.Component
import typingsSlinky.reactColor.mod.Color
import typingsSlinky.reactColor.mod.ColorChangeHandler
import typingsSlinky.reactColor.mod.ColorResult
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object editableInputMod {
  
  @JSImport("react-color/lib/components/common/EditableInput", JSImport.Default)
  @js.native
  class default ()
    extends Component[EditableInputProps, js.Object, js.Any]
  
  @js.native
  trait EditableInput
    extends Component[EditableInputProps, js.Object, js.Any]
  
  @js.native
  trait EditableInputProps extends ClassAttributes[EditableInput] {
    
    var color: js.UndefOr[Color] = js.native
    
    var dragLabel: js.UndefOr[String] = js.native
    
    var dragMax: js.UndefOr[String] = js.native
    
    var label: js.UndefOr[String] = js.native
    
    var onChange: js.UndefOr[ColorChangeHandler] = js.native
    
    var style: js.UndefOr[EditableInputStyles] = js.native
    
    var value: js.UndefOr[js.Any] = js.native
  }
  object EditableInputProps {
    
    @scala.inline
    def apply(): EditableInputProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[EditableInputProps]
    }
    
    @scala.inline
    implicit class EditableInputPropsMutableBuilder[Self <: EditableInputProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setColor(value: Color): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
      
      @scala.inline
      def setDragLabel(value: String): Self = StObject.set(x, "dragLabel", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDragLabelUndefined: Self = StObject.set(x, "dragLabel", js.undefined)
      
      @scala.inline
      def setDragMax(value: String): Self = StObject.set(x, "dragMax", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDragMaxUndefined: Self = StObject.set(x, "dragMax", js.undefined)
      
      @scala.inline
      def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
      
      @scala.inline
      def setOnChange(value: (/* color */ ColorResult, /* event */ ChangeEvent[HTMLInputElement]) => Unit): Self = StObject.set(x, "onChange", js.Any.fromFunction2(value))
      
      @scala.inline
      def setOnChangeUndefined: Self = StObject.set(x, "onChange", js.undefined)
      
      @scala.inline
      def setStyle(value: EditableInputStyles): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
      
      @scala.inline
      def setValue(value: js.Any): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    }
  }
  
  @js.native
  trait EditableInputStyles extends StObject {
    
    var input: js.UndefOr[CSSProperties] = js.native
    
    var label: js.UndefOr[CSSProperties] = js.native
    
    var wrap: js.UndefOr[CSSProperties] = js.native
  }
  object EditableInputStyles {
    
    @scala.inline
    def apply(): EditableInputStyles = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[EditableInputStyles]
    }
    
    @scala.inline
    implicit class EditableInputStylesMutableBuilder[Self <: EditableInputStyles] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setInput(value: CSSProperties): Self = StObject.set(x, "input", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInputUndefined: Self = StObject.set(x, "input", js.undefined)
      
      @scala.inline
      def setLabel(value: CSSProperties): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
      
      @scala.inline
      def setWrap(value: CSSProperties): Self = StObject.set(x, "wrap", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWrapUndefined: Self = StObject.set(x, "wrap", js.undefined)
    }
  }
}
