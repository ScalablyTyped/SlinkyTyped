package typingsSlinky.reactMdForm

import org.scalajs.dom.raw.HTMLDivElement
import slinky.core.facade.ReactElement
import typingsSlinky.react.mod.ForwardRefExoticComponent
import typingsSlinky.react.mod.HTMLAttributes
import typingsSlinky.react.mod.RefAttributes
import typingsSlinky.reactMdForm.formThemeProviderMod.FormThemeOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object textFieldContainerMod {
  
  @JSImport("@react-md/form/types/text-field/TextFieldContainer", "TextFieldContainer")
  @js.native
  val TextFieldContainer: ForwardRefExoticComponent[TextFieldContainerProps with RefAttributes[HTMLDivElement]] = js.native
  
  @js.native
  trait TextFieldContainerOptions extends FormThemeOptions {
    
    /**
      * Boolean if the form components should be using the `dense` spec to reduce
      * the sizing slightly.
      */
    var dense: js.UndefOr[Boolean] = js.native
    
    /**
      * Boolean if the text field should gain the error state and update the
      * colors.
      */
    var error: js.UndefOr[Boolean] = js.native
    
    /**
      * Boolean if the component should be rendered inline with
      * `display: inline-flex` instead of `display: flex`.
      */
    var `inline`: js.UndefOr[Boolean] = js.native
    
    /**
      * Boolean if the left children should be wrapped in the `TextFieldAddon`
      * component. This is enabled by default since this is _normally_ the behavior
      * that is desired so that icons can be positioned correctly.
      */
    var isLeftAddon: js.UndefOr[Boolean] = js.native
    
    /**
      * Boolean if the right children should be wrapped in the `TextFieldAddon`
      * component. This is enabled by default since this is _normally_ the behavior
      * that is desired so that icons can be positioned correctly.
      */
    var isRightAddon: js.UndefOr[Boolean] = js.native
    
    /**
      * An optional addon to apply to the left of the text field. This should
      * normally be an icon. This element will not have pointer events so it can be
      * "clicked through" to focus the text field instead.
      */
    var leftChildren: js.UndefOr[ReactElement] = js.native
    
    /**
      * An optional addon to apply to the right of the text field. This should be a
      * clickable button such as a password field toggle or a reset button for the
      * field.
      */
    var rightChildren: js.UndefOr[ReactElement] = js.native
  }
  object TextFieldContainerOptions {
    
    @scala.inline
    def apply(): TextFieldContainerOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TextFieldContainerOptions]
    }
    
    @scala.inline
    implicit class TextFieldContainerOptionsMutableBuilder[Self <: TextFieldContainerOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDense(value: Boolean): Self = StObject.set(x, "dense", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDenseUndefined: Self = StObject.set(x, "dense", js.undefined)
      
      @scala.inline
      def setError(value: Boolean): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setErrorUndefined: Self = StObject.set(x, "error", js.undefined)
      
      @scala.inline
      def setInline(value: Boolean): Self = StObject.set(x, "inline", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInlineUndefined: Self = StObject.set(x, "inline", js.undefined)
      
      @scala.inline
      def setIsLeftAddon(value: Boolean): Self = StObject.set(x, "isLeftAddon", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsLeftAddonUndefined: Self = StObject.set(x, "isLeftAddon", js.undefined)
      
      @scala.inline
      def setIsRightAddon(value: Boolean): Self = StObject.set(x, "isRightAddon", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsRightAddonUndefined: Self = StObject.set(x, "isRightAddon", js.undefined)
      
      @scala.inline
      def setLeftChildren(value: ReactElement): Self = StObject.set(x, "leftChildren", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLeftChildrenReactElement(value: ReactElement): Self = StObject.set(x, "leftChildren", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLeftChildrenUndefined: Self = StObject.set(x, "leftChildren", js.undefined)
      
      @scala.inline
      def setRightChildren(value: ReactElement): Self = StObject.set(x, "rightChildren", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRightChildrenReactElement(value: ReactElement): Self = StObject.set(x, "rightChildren", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRightChildrenUndefined: Self = StObject.set(x, "rightChildren", js.undefined)
    }
  }
  
  @js.native
  trait TextFieldContainerProps
    extends HTMLAttributes[HTMLDivElement]
       with TextFieldContainerOptions {
    
    /**
      * Boolean if the text field is currently active (focused) to applied the
      * active color to the current theme.
      */
    var active: js.UndefOr[Boolean] = js.native
    
    /**
      * Boolean if the text field is currently disabled.
      */
    var disabled: js.UndefOr[Boolean] = js.native
    
    /**
      * Boolean if there is a floating label with the text field.
      */
    var label: js.UndefOr[Boolean] = js.native
  }
  object TextFieldContainerProps {
    
    @scala.inline
    def apply(): TextFieldContainerProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TextFieldContainerProps]
    }
    
    @scala.inline
    implicit class TextFieldContainerPropsMutableBuilder[Self <: TextFieldContainerProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setActive(value: Boolean): Self = StObject.set(x, "active", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setActiveUndefined: Self = StObject.set(x, "active", js.undefined)
      
      @scala.inline
      def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
      
      @scala.inline
      def setLabel(value: Boolean): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
    }
  }
}
