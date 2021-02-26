package typingsSlinky.blueprintjsCore.anon

import org.scalajs.dom.raw.Event
import org.scalajs.dom.raw.EventTarget
import org.scalajs.dom.raw.HTMLElement
import org.scalajs.dom.raw.HTMLInputElement
import slinky.core.SyntheticEvent
import slinky.core.facade.ReactElement
import slinky.web.SyntheticKeyboardEvent
import typingsSlinky.blueprintjsCore.blueprintjsCoreBooleans.`false`
import typingsSlinky.blueprintjsCore.intentMod.Intent
import typingsSlinky.blueprintjsCore.propsMod.HTMLInputProps
import typingsSlinky.blueprintjsCore.propsMod.MaybeElement
import typingsSlinky.blueprintjsCore.tagInputMod.TagInputAddMethod
import typingsSlinky.blueprintjsCore.tagMod.ITagProps
import typingsSlinky.blueprintjsIcons.iconNameMod.IconName
import typingsSlinky.react.mod.FormEventHandler
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<@blueprintjs/core.@blueprintjs/core/lib/esm/components/tag-input/tagInput.ITagInputProps> */
@js.native
trait PartialITagInputProps extends StObject {
  
  var addOnBlur: js.UndefOr[Boolean] = js.native
  
  var addOnPaste: js.UndefOr[Boolean] = js.native
  
  var className: js.UndefOr[String] = js.native
  
  var disabled: js.UndefOr[Boolean] = js.native
  
  var fill: js.UndefOr[Boolean] = js.native
  
  var inputProps: js.UndefOr[HTMLInputProps] = js.native
  
  var inputRef: js.UndefOr[js.Function1[/* input */ HTMLInputElement | Null, Unit]] = js.native
  
  var inputValue: js.UndefOr[String] = js.native
  
  var intent: js.UndefOr[Intent] = js.native
  
  var large: js.UndefOr[Boolean] = js.native
  
  var leftIcon: js.UndefOr[IconName | MaybeElement] = js.native
  
  var onAdd: js.UndefOr[
    js.Function2[/* values */ js.Array[String], /* method */ TagInputAddMethod, Boolean | Unit]
  ] = js.native
  
  var onChange: js.UndefOr[js.Function1[/* values */ js.Array[ReactElement], Boolean | Unit]] = js.native
  
  var onInputChange: js.UndefOr[FormEventHandler[HTMLInputElement]] = js.native
  
  var onKeyDown: js.UndefOr[
    js.Function2[
      /* event */ SyntheticKeyboardEvent[HTMLElement], 
      /* index */ js.UndefOr[Double], 
      Unit
    ]
  ] = js.native
  
  var onKeyUp: js.UndefOr[
    js.Function2[
      /* event */ SyntheticKeyboardEvent[HTMLElement], 
      /* index */ js.UndefOr[Double], 
      Unit
    ]
  ] = js.native
  
  var onRemove: js.UndefOr[js.Function2[/* value */ ReactElement, /* index */ Double, Unit]] = js.native
  
  var placeholder: js.UndefOr[String] = js.native
  
  var rightElement: js.UndefOr[ReactElement] = js.native
  
  var separator: js.UndefOr[String | js.RegExp | `false`] = js.native
  
  var tagProps: js.UndefOr[
    ITagProps | (js.Function2[/* value */ ReactElement, /* index */ Double, ITagProps])
  ] = js.native
  
  var values: js.UndefOr[js.Array[ReactElement]] = js.native
}
object PartialITagInputProps {
  
  @scala.inline
  def apply(): PartialITagInputProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialITagInputProps]
  }
  
  @scala.inline
  implicit class PartialITagInputPropsMutableBuilder[Self <: PartialITagInputProps] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAddOnBlur(value: Boolean): Self = StObject.set(x, "addOnBlur", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAddOnBlurUndefined: Self = StObject.set(x, "addOnBlur", js.undefined)
    
    @scala.inline
    def setAddOnPaste(value: Boolean): Self = StObject.set(x, "addOnPaste", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAddOnPasteUndefined: Self = StObject.set(x, "addOnPaste", js.undefined)
    
    @scala.inline
    def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
    
    @scala.inline
    def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
    
    @scala.inline
    def setFill(value: Boolean): Self = StObject.set(x, "fill", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFillUndefined: Self = StObject.set(x, "fill", js.undefined)
    
    @scala.inline
    def setInputProps(value: HTMLInputProps): Self = StObject.set(x, "inputProps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInputPropsUndefined: Self = StObject.set(x, "inputProps", js.undefined)
    
    @scala.inline
    def setInputRef(value: /* input */ HTMLInputElement | Null => Unit): Self = StObject.set(x, "inputRef", js.Any.fromFunction1(value))
    
    @scala.inline
    def setInputRefUndefined: Self = StObject.set(x, "inputRef", js.undefined)
    
    @scala.inline
    def setInputValue(value: String): Self = StObject.set(x, "inputValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInputValueUndefined: Self = StObject.set(x, "inputValue", js.undefined)
    
    @scala.inline
    def setIntent(value: Intent): Self = StObject.set(x, "intent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIntentUndefined: Self = StObject.set(x, "intent", js.undefined)
    
    @scala.inline
    def setLarge(value: Boolean): Self = StObject.set(x, "large", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLargeUndefined: Self = StObject.set(x, "large", js.undefined)
    
    @scala.inline
    def setLeftIcon(value: IconName | MaybeElement): Self = StObject.set(x, "leftIcon", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLeftIconNull: Self = StObject.set(x, "leftIcon", null)
    
    @scala.inline
    def setLeftIconReactElement(value: ReactElement): Self = StObject.set(x, "leftIcon", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLeftIconUndefined: Self = StObject.set(x, "leftIcon", js.undefined)
    
    @scala.inline
    def setOnAdd(value: (/* values */ js.Array[String], /* method */ TagInputAddMethod) => Boolean | Unit): Self = StObject.set(x, "onAdd", js.Any.fromFunction2(value))
    
    @scala.inline
    def setOnAddUndefined: Self = StObject.set(x, "onAdd", js.undefined)
    
    @scala.inline
    def setOnChange(value: /* values */ js.Array[ReactElement] => Boolean | Unit): Self = StObject.set(x, "onChange", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnChangeUndefined: Self = StObject.set(x, "onChange", js.undefined)
    
    @scala.inline
    def setOnInputChange(value: SyntheticEvent[EventTarget with HTMLInputElement, Event] => Unit): Self = StObject.set(x, "onInputChange", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnInputChangeUndefined: Self = StObject.set(x, "onInputChange", js.undefined)
    
    @scala.inline
    def setOnKeyDown(value: (/* event */ SyntheticKeyboardEvent[HTMLElement], /* index */ js.UndefOr[Double]) => Unit): Self = StObject.set(x, "onKeyDown", js.Any.fromFunction2(value))
    
    @scala.inline
    def setOnKeyDownUndefined: Self = StObject.set(x, "onKeyDown", js.undefined)
    
    @scala.inline
    def setOnKeyUp(value: (/* event */ SyntheticKeyboardEvent[HTMLElement], /* index */ js.UndefOr[Double]) => Unit): Self = StObject.set(x, "onKeyUp", js.Any.fromFunction2(value))
    
    @scala.inline
    def setOnKeyUpUndefined: Self = StObject.set(x, "onKeyUp", js.undefined)
    
    @scala.inline
    def setOnRemove(value: (/* value */ ReactElement, /* index */ Double) => Unit): Self = StObject.set(x, "onRemove", js.Any.fromFunction2(value))
    
    @scala.inline
    def setOnRemoveUndefined: Self = StObject.set(x, "onRemove", js.undefined)
    
    @scala.inline
    def setPlaceholder(value: String): Self = StObject.set(x, "placeholder", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPlaceholderUndefined: Self = StObject.set(x, "placeholder", js.undefined)
    
    @scala.inline
    def setRightElement(value: ReactElement): Self = StObject.set(x, "rightElement", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRightElementUndefined: Self = StObject.set(x, "rightElement", js.undefined)
    
    @scala.inline
    def setSeparator(value: String | js.RegExp | `false`): Self = StObject.set(x, "separator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSeparatorRegExp(value: js.RegExp): Self = StObject.set(x, "separator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSeparatorUndefined: Self = StObject.set(x, "separator", js.undefined)
    
    @scala.inline
    def setTagProps(value: ITagProps | (js.Function2[/* value */ ReactElement, /* index */ Double, ITagProps])): Self = StObject.set(x, "tagProps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTagPropsFunction2(value: (/* value */ ReactElement, /* index */ Double) => ITagProps): Self = StObject.set(x, "tagProps", js.Any.fromFunction2(value))
    
    @scala.inline
    def setTagPropsUndefined: Self = StObject.set(x, "tagProps", js.undefined)
    
    @scala.inline
    def setValues(value: js.Array[ReactElement]): Self = StObject.set(x, "values", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValuesUndefined: Self = StObject.set(x, "values", js.undefined)
    
    @scala.inline
    def setValuesVarargs(value: ReactElement*): Self = StObject.set(x, "values", js.Array(value :_*))
  }
}
