package typingsSlinky.blueprintjsCore

import org.scalajs.dom.raw.Event
import org.scalajs.dom.raw.EventTarget
import org.scalajs.dom.raw.HTMLInputElement
import org.scalajs.dom.raw.HTMLLabelElement
import slinky.core.SyntheticEvent
import slinky.core.facade.ReactElement
import typingsSlinky.blueprintjsCore.commonMod.AbstractPureComponent2
import typingsSlinky.react.mod.FormEventHandler
import typingsSlinky.react.mod.HTMLProps
import typingsSlinky.react.mod.LabelHTMLAttributes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object fileInputMod {
  
  @JSImport("@blueprintjs/core/lib/esm/components/forms/fileInput", "FileInput")
  @js.native
  class FileInput protected ()
    extends AbstractPureComponent2[IFileInputProps, js.Object, js.Object] {
    def this(props: IFileInputProps) = this()
    def this(props: IFileInputProps, context: js.Any) = this()
    
    var handleInputChange: js.Any = js.native
  }
  /* static members */
  object FileInput {
    
    @JSImport("@blueprintjs/core/lib/esm/components/forms/fileInput", "FileInput")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@blueprintjs/core/lib/esm/components/forms/fileInput", "FileInput.defaultProps")
    @js.native
    def defaultProps: IFileInputProps = js.native
    @scala.inline
    def defaultProps_=(x: IFileInputProps): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
    
    @JSImport("@blueprintjs/core/lib/esm/components/forms/fileInput", "FileInput.displayName")
    @js.native
    def displayName: String = js.native
    @scala.inline
    def displayName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("displayName")(x.asInstanceOf[js.Any])
  }
  
  /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
  - typingsSlinky.blueprintjsCore.propsMod.IProps because var conflicts: className. Inlined  */ @js.native
  trait IFileInputProps extends LabelHTMLAttributes[HTMLLabelElement] {
    
    /**
      * The button text.
      * @default "Browse"
      */
    var buttonText: js.UndefOr[String] = js.native
    
    /**
      * Whether the file input is non-interactive.
      * Setting this to `true` will automatically disable the child input too.
      */
    var disabled: js.UndefOr[Boolean] = js.native
    
    /**
      * Whether the file input should take up the full width of its container.
      */
    var fill: js.UndefOr[Boolean] = js.native
    
    /**
      * Whether the user has made a selection in the input. This will affect the component's
      * text styling. Make sure to set a non-empty value for the text prop as well.
      * @default false
      */
    var hasSelection: js.UndefOr[Boolean] = js.native
    
    /**
      * The props to pass to the child input.
      * `disabled` will be ignored in favor of the top-level prop.
      * `type` will be ignored, because the input _must_ be `type="file"`.
      * Pass `onChange` here to be notified when the user selects a file.
      */
    var inputProps: js.UndefOr[HTMLProps[HTMLInputElement]] = js.native
    
    /**
      * Whether the file input should appear with large styling.
      */
    var large: js.UndefOr[Boolean] = js.native
    
    /**
      * Callback invoked on `<input>` `change` events.
      *
      * This callback is offered as a convenience; it is equivalent to passing
      * `onChange` to `inputProps`.
      *
      * __Note:__ The top-level `onChange` prop is passed to the wrapping
      * `<label>` rather than the `<input>`, which may not be what you expect.
      */
    var onInputChange: js.UndefOr[FormEventHandler[HTMLInputElement]] = js.native
    
    /**
      * The text to display.
      * @default "Choose file..."
      */
    var text: js.UndefOr[ReactElement] = js.native
  }
  object IFileInputProps {
    
    @scala.inline
    def apply(): IFileInputProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IFileInputProps]
    }
    
    @scala.inline
    implicit class IFileInputPropsMutableBuilder[Self <: IFileInputProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setButtonText(value: String): Self = StObject.set(x, "buttonText", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setButtonTextUndefined: Self = StObject.set(x, "buttonText", js.undefined)
      
      @scala.inline
      def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
      
      @scala.inline
      def setFill(value: Boolean): Self = StObject.set(x, "fill", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFillUndefined: Self = StObject.set(x, "fill", js.undefined)
      
      @scala.inline
      def setHasSelection(value: Boolean): Self = StObject.set(x, "hasSelection", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHasSelectionUndefined: Self = StObject.set(x, "hasSelection", js.undefined)
      
      @scala.inline
      def setInputProps(value: HTMLProps[HTMLInputElement]): Self = StObject.set(x, "inputProps", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInputPropsUndefined: Self = StObject.set(x, "inputProps", js.undefined)
      
      @scala.inline
      def setLarge(value: Boolean): Self = StObject.set(x, "large", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLargeUndefined: Self = StObject.set(x, "large", js.undefined)
      
      @scala.inline
      def setOnInputChange(value: SyntheticEvent[EventTarget with HTMLInputElement, Event] => Unit): Self = StObject.set(x, "onInputChange", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnInputChangeUndefined: Self = StObject.set(x, "onInputChange", js.undefined)
      
      @scala.inline
      def setText(value: ReactElement): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTextReactElement(value: ReactElement): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
    }
  }
}
