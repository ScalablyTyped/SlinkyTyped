package typingsSlinky.fundamentalReact

import org.scalablytyped.runtime.Shortcut
import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.raw.HTMLDivElement
import slinky.core.ReactComponentClass
import slinky.core.facade.ReactElement
import slinky.web.SyntheticMouseEvent
import typingsSlinky.fundamentalReact.anon.State
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object comboboxInputMod extends Shortcut {
  
  @JSImport("fundamental-react/lib/ComboboxInput/ComboboxInput", JSImport.Default)
  @js.native
  val default: ReactComponentClass[ComboboxInputProps] = js.native
  
  @js.native
  trait ComboboxInputProps
    extends /* x */ StringDictionary[js.Any] {
    
    var buttonProps: js.UndefOr[js.Object] = js.native
    
    var className: js.UndefOr[String] = js.native
    
    var compact: js.UndefOr[Boolean] = js.native
    
    var disableStyles: js.UndefOr[Boolean] = js.native
    
    var inputProps: js.UndefOr[js.Object] = js.native
    
    var list: ReactElement = js.native
    
    /* An object containing a `Menu` component. */
    var menu: ReactElement = js.native
    
    var onClick: js.UndefOr[js.Function1[/* event */ SyntheticMouseEvent[HTMLDivElement], Unit]] = js.native
    
    var placeholder: js.UndefOr[String] = js.native
    
    var popoverProps: js.UndefOr[js.Object] = js.native
    
    var validationState: js.UndefOr[State] = js.native
  }
  object ComboboxInputProps {
    
    @scala.inline
    def apply(menu: ReactElement): ComboboxInputProps = {
      val __obj = js.Dynamic.literal(menu = menu.asInstanceOf[js.Any])
      __obj.asInstanceOf[ComboboxInputProps]
    }
    
    @scala.inline
    implicit class ComboboxInputPropsMutableBuilder[Self <: ComboboxInputProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setButtonProps(value: js.Object): Self = StObject.set(x, "buttonProps", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setButtonPropsUndefined: Self = StObject.set(x, "buttonProps", js.undefined)
      
      @scala.inline
      def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      @scala.inline
      def setCompact(value: Boolean): Self = StObject.set(x, "compact", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCompactUndefined: Self = StObject.set(x, "compact", js.undefined)
      
      @scala.inline
      def setDisableStyles(value: Boolean): Self = StObject.set(x, "disableStyles", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisableStylesUndefined: Self = StObject.set(x, "disableStyles", js.undefined)
      
      @scala.inline
      def setInputProps(value: js.Object): Self = StObject.set(x, "inputProps", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInputPropsUndefined: Self = StObject.set(x, "inputProps", js.undefined)
      
      @scala.inline
      def setList(value: ReactElement): Self = StObject.set(x, "list", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setListUndefined: Self = StObject.set(x, "list", js.undefined)
      
      @scala.inline
      def setMenu(value: ReactElement): Self = StObject.set(x, "menu", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnClick(value: /* event */ SyntheticMouseEvent[HTMLDivElement] => Unit): Self = StObject.set(x, "onClick", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnClickUndefined: Self = StObject.set(x, "onClick", js.undefined)
      
      @scala.inline
      def setPlaceholder(value: String): Self = StObject.set(x, "placeholder", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPlaceholderUndefined: Self = StObject.set(x, "placeholder", js.undefined)
      
      @scala.inline
      def setPopoverProps(value: js.Object): Self = StObject.set(x, "popoverProps", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPopoverPropsUndefined: Self = StObject.set(x, "popoverProps", js.undefined)
      
      @scala.inline
      def setValidationState(value: State): Self = StObject.set(x, "validationState", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValidationStateUndefined: Self = StObject.set(x, "validationState", js.undefined)
    }
  }
  
  type _To = ReactComponentClass[ComboboxInputProps]
  
  /* This means you don't have to write `default`, but can instead just say `comboboxInputMod.foo` */
  override def _to: ReactComponentClass[ComboboxInputProps] = default
}
