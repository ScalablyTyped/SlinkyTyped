package typingsSlinky.reactInputMask

import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.raw.HTMLInputElement
import slinky.core.facade.ReactRef
import typingsSlinky.react.mod.Component
import typingsSlinky.react.mod.InputHTMLAttributes
import typingsSlinky.react.mod.Ref
import typingsSlinky.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("react-input-mask", JSImport.Default)
  @js.native
  class default protected () extends ReactInputMask {
    def this(props: Props) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: Props, context: js.Any) = this()
  }
  
  @JSImport("react-input-mask", "ReactInputMask")
  @js.native
  class ReactInputMask protected ()
    extends Component[Props, js.Object, js.Any] {
    def this(props: Props) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: Props, context: js.Any) = this()
  }
  
  @js.native
  trait InputState extends StObject {
    
    var selection: Selection | Null = js.native
    
    var value: String = js.native
  }
  object InputState {
    
    @scala.inline
    def apply(value: String): InputState = {
      val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[InputState]
    }
    
    @scala.inline
    implicit class InputStateMutableBuilder[Self <: InputState] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setSelection(value: Selection): Self = StObject.set(x, "selection", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSelectionNull: Self = StObject.set(x, "selection", null)
      
      @scala.inline
      def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait MaskOptions extends StObject {
    
    var alwaysShowMask: Boolean = js.native
    
    var formatChars: Record[String, String] = js.native
    
    var mask: String | (js.Array[String | js.RegExp]) = js.native
    
    var maskChar: String = js.native
    
    var permanents: js.Array[Double] = js.native
  }
  object MaskOptions {
    
    @scala.inline
    def apply(
      alwaysShowMask: Boolean,
      formatChars: Record[String, String],
      mask: String | (js.Array[String | js.RegExp]),
      maskChar: String,
      permanents: js.Array[Double]
    ): MaskOptions = {
      val __obj = js.Dynamic.literal(alwaysShowMask = alwaysShowMask.asInstanceOf[js.Any], formatChars = formatChars.asInstanceOf[js.Any], mask = mask.asInstanceOf[js.Any], maskChar = maskChar.asInstanceOf[js.Any], permanents = permanents.asInstanceOf[js.Any])
      __obj.asInstanceOf[MaskOptions]
    }
    
    @scala.inline
    implicit class MaskOptionsMutableBuilder[Self <: MaskOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAlwaysShowMask(value: Boolean): Self = StObject.set(x, "alwaysShowMask", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFormatChars(value: Record[String, String]): Self = StObject.set(x, "formatChars", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMask(value: String | (js.Array[String | js.RegExp])): Self = StObject.set(x, "mask", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaskChar(value: String): Self = StObject.set(x, "maskChar", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaskVarargs(value: (String | js.RegExp)*): Self = StObject.set(x, "mask", js.Array(value :_*))
      
      @scala.inline
      def setPermanents(value: js.Array[Double]): Self = StObject.set(x, "permanents", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPermanentsVarargs(value: Double*): Self = StObject.set(x, "permanents", js.Array(value :_*))
    }
  }
  
  @js.native
  trait Props extends InputHTMLAttributes[HTMLInputElement] {
    
    /**
      * Show mask even in empty input without focus.
      */
    var alwaysShowMask: js.UndefOr[Boolean] = js.native
    
    /**
      * In case you need to implement more complex masking behavior, you can provide
      * beforeMaskedValueChange function to change masked value and cursor position
      * before it will be applied to the input.
      */
    var beforeMaskedValueChange: js.UndefOr[
        js.Function4[
          /* newState */ InputState, 
          /* oldState */ InputState, 
          /* userInput */ String, 
          /* maskOptions */ MaskOptions, 
          InputState
        ]
      ] = js.native
    
    /**
      * Defines format characters with characters as keys and corresponding RegExp string as values. Default ones:
      * ```
      * {
      *   "9": "[0-9]",
      *   "a": "[A-Za-z]",
      *   "*": "[A-Za-z0-9]"
      * }```
      */
    var formatChars: js.UndefOr[StringDictionary[String]] = js.native
    
    /**
      * Use inputRef instead of ref if you need input node to manage focus, selection, etc.
      */
    var inputRef: js.UndefOr[Ref[HTMLInputElement]] = js.native
    
    /**
      * Mask string. Format characters are:
      * * `9`: `0-9`
      * * `a`: `A-Z, a-z`
      * * `\*`: `A-Z, a-z, 0-9`
      *
      * Any character can be escaped with backslash, which usually will appear as double backslash in JS strings.
      * For example, German phone mask with unremoveable prefix +49 will look like `mask="+4\\9 99 999 99"` or `mask={"+4\\\\9 99 999 99"}`
      */
    var mask: String | (js.Array[String | js.RegExp]) = js.native
    
    /**
      * Character to cover unfilled editable parts of mask. Default character is "_". If set to null, unfilled parts will be empty, like in ordinary input.
      */
    var maskChar: js.UndefOr[String | Null] = js.native
  }
  object Props {
    
    @scala.inline
    def apply(mask: String | (js.Array[String | js.RegExp])): Props = {
      val __obj = js.Dynamic.literal(mask = mask.asInstanceOf[js.Any])
      __obj.asInstanceOf[Props]
    }
    
    @scala.inline
    implicit class PropsMutableBuilder[Self <: Props] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAlwaysShowMask(value: Boolean): Self = StObject.set(x, "alwaysShowMask", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAlwaysShowMaskUndefined: Self = StObject.set(x, "alwaysShowMask", js.undefined)
      
      @scala.inline
      def setBeforeMaskedValueChange(
        value: (/* newState */ InputState, /* oldState */ InputState, /* userInput */ String, /* maskOptions */ MaskOptions) => InputState
      ): Self = StObject.set(x, "beforeMaskedValueChange", js.Any.fromFunction4(value))
      
      @scala.inline
      def setBeforeMaskedValueChangeUndefined: Self = StObject.set(x, "beforeMaskedValueChange", js.undefined)
      
      @scala.inline
      def setFormatChars(value: StringDictionary[String]): Self = StObject.set(x, "formatChars", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFormatCharsUndefined: Self = StObject.set(x, "formatChars", js.undefined)
      
      @scala.inline
      def setInputRef(value: Ref[HTMLInputElement]): Self = StObject.set(x, "inputRef", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInputRefFunction1(value: /* instance */ HTMLInputElement | Null => Unit): Self = StObject.set(x, "inputRef", js.Any.fromFunction1(value))
      
      @scala.inline
      def setInputRefNull: Self = StObject.set(x, "inputRef", null)
      
      @scala.inline
      def setInputRefRefObject(value: ReactRef[HTMLInputElement]): Self = StObject.set(x, "inputRef", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInputRefUndefined: Self = StObject.set(x, "inputRef", js.undefined)
      
      @scala.inline
      def setMask(value: String | (js.Array[String | js.RegExp])): Self = StObject.set(x, "mask", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaskChar(value: String): Self = StObject.set(x, "maskChar", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaskCharNull: Self = StObject.set(x, "maskChar", null)
      
      @scala.inline
      def setMaskCharUndefined: Self = StObject.set(x, "maskChar", js.undefined)
      
      @scala.inline
      def setMaskVarargs(value: (String | js.RegExp)*): Self = StObject.set(x, "mask", js.Array(value :_*))
    }
  }
  
  @js.native
  trait Selection extends StObject {
    
    var end: Double = js.native
    
    var start: Double = js.native
  }
  object Selection {
    
    @scala.inline
    def apply(end: Double, start: Double): Selection = {
      val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
      __obj.asInstanceOf[Selection]
    }
    
    @scala.inline
    implicit class SelectionMutableBuilder[Self <: Selection] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setEnd(value: Double): Self = StObject.set(x, "end", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStart(value: Double): Self = StObject.set(x, "start", value.asInstanceOf[js.Any])
    }
  }
}
