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
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Readonly<@blueprintjs/core.@blueprintjs/core/lib/esm/components/tag-input/tagInput.ITagInputProps> */
@js.native
trait ReadonlyITagInputProps extends js.Object {
  
  val addOnBlur: js.UndefOr[Boolean] = js.native
  
  val addOnPaste: js.UndefOr[Boolean] = js.native
  
  val className: js.UndefOr[String] = js.native
  
  val disabled: js.UndefOr[Boolean] = js.native
  
  val fill: js.UndefOr[Boolean] = js.native
  
  val inputProps: js.UndefOr[HTMLInputProps] = js.native
  
  val inputRef: js.UndefOr[js.Function1[/* input */ HTMLInputElement | Null, Unit]] = js.native
  
  val inputValue: js.UndefOr[String] = js.native
  
  val intent: js.UndefOr[Intent] = js.native
  
  val large: js.UndefOr[Boolean] = js.native
  
  val leftIcon: js.UndefOr[IconName | MaybeElement] = js.native
  
  val onAdd: js.UndefOr[
    js.Function2[/* values */ js.Array[String], /* method */ TagInputAddMethod, Boolean | Unit]
  ] = js.native
  
  val onChange: js.UndefOr[js.Function1[/* values */ js.Array[ReactElement], Boolean | Unit]] = js.native
  
  val onInputChange: js.UndefOr[FormEventHandler[HTMLInputElement]] = js.native
  
  val onKeyDown: js.UndefOr[
    js.Function2[
      /* event */ SyntheticKeyboardEvent[HTMLElement], 
      /* index */ js.UndefOr[Double], 
      Unit
    ]
  ] = js.native
  
  val onKeyUp: js.UndefOr[
    js.Function2[
      /* event */ SyntheticKeyboardEvent[HTMLElement], 
      /* index */ js.UndefOr[Double], 
      Unit
    ]
  ] = js.native
  
  val onRemove: js.UndefOr[js.Function2[/* value */ ReactElement, /* index */ Double, Unit]] = js.native
  
  val placeholder: js.UndefOr[String] = js.native
  
  val rightElement: js.UndefOr[ReactElement] = js.native
  
  val separator: js.UndefOr[String | js.RegExp | `false`] = js.native
  
  val tagProps: js.UndefOr[
    ITagProps | (js.Function2[/* value */ ReactElement, /* index */ Double, ITagProps])
  ] = js.native
  
  val values: js.Array[ReactElement] = js.native
}
object ReadonlyITagInputProps {
  
  @scala.inline
  def apply(values: js.Array[ReactElement]): ReadonlyITagInputProps = {
    val __obj = js.Dynamic.literal(values = values.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReadonlyITagInputProps]
  }
  
  @scala.inline
  implicit class ReadonlyITagInputPropsOps[Self <: ReadonlyITagInputProps] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setValuesVarargs(value: ReactElement*): Self = this.set("values", js.Array(value :_*))
    
    @scala.inline
    def setValues(value: js.Array[ReactElement]): Self = this.set("values", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAddOnBlur(value: Boolean): Self = this.set("addOnBlur", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAddOnBlur: Self = this.set("addOnBlur", js.undefined)
    
    @scala.inline
    def setAddOnPaste(value: Boolean): Self = this.set("addOnPaste", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAddOnPaste: Self = this.set("addOnPaste", js.undefined)
    
    @scala.inline
    def setClassName(value: String): Self = this.set("className", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClassName: Self = this.set("className", js.undefined)
    
    @scala.inline
    def setDisabled(value: Boolean): Self = this.set("disabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDisabled: Self = this.set("disabled", js.undefined)
    
    @scala.inline
    def setFill(value: Boolean): Self = this.set("fill", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFill: Self = this.set("fill", js.undefined)
    
    @scala.inline
    def setInputProps(value: HTMLInputProps): Self = this.set("inputProps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInputProps: Self = this.set("inputProps", js.undefined)
    
    @scala.inline
    def setInputRef(value: /* input */ HTMLInputElement | Null => Unit): Self = this.set("inputRef", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteInputRef: Self = this.set("inputRef", js.undefined)
    
    @scala.inline
    def setInputValue(value: String): Self = this.set("inputValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInputValue: Self = this.set("inputValue", js.undefined)
    
    @scala.inline
    def setIntent(value: Intent): Self = this.set("intent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIntent: Self = this.set("intent", js.undefined)
    
    @scala.inline
    def setLarge(value: Boolean): Self = this.set("large", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLarge: Self = this.set("large", js.undefined)
    
    @scala.inline
    def setLeftIconReactElement(value: ReactElement): Self = this.set("leftIcon", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLeftIcon(value: IconName | MaybeElement): Self = this.set("leftIcon", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLeftIcon: Self = this.set("leftIcon", js.undefined)
    
    @scala.inline
    def setLeftIconNull: Self = this.set("leftIcon", null)
    
    @scala.inline
    def setOnAdd(value: (/* values */ js.Array[String], /* method */ TagInputAddMethod) => Boolean | Unit): Self = this.set("onAdd", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteOnAdd: Self = this.set("onAdd", js.undefined)
    
    @scala.inline
    def setOnChange(value: /* values */ js.Array[ReactElement] => Boolean | Unit): Self = this.set("onChange", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnChange: Self = this.set("onChange", js.undefined)
    
    @scala.inline
    def setOnInputChange(value: SyntheticEvent[EventTarget with HTMLInputElement, Event] => Unit): Self = this.set("onInputChange", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnInputChange: Self = this.set("onInputChange", js.undefined)
    
    @scala.inline
    def setOnKeyDown(value: (/* event */ SyntheticKeyboardEvent[HTMLElement], /* index */ js.UndefOr[Double]) => Unit): Self = this.set("onKeyDown", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteOnKeyDown: Self = this.set("onKeyDown", js.undefined)
    
    @scala.inline
    def setOnKeyUp(value: (/* event */ SyntheticKeyboardEvent[HTMLElement], /* index */ js.UndefOr[Double]) => Unit): Self = this.set("onKeyUp", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteOnKeyUp: Self = this.set("onKeyUp", js.undefined)
    
    @scala.inline
    def setOnRemove(value: (/* value */ ReactElement, /* index */ Double) => Unit): Self = this.set("onRemove", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteOnRemove: Self = this.set("onRemove", js.undefined)
    
    @scala.inline
    def setPlaceholder(value: String): Self = this.set("placeholder", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePlaceholder: Self = this.set("placeholder", js.undefined)
    
    @scala.inline
    def setRightElement(value: ReactElement): Self = this.set("rightElement", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRightElement: Self = this.set("rightElement", js.undefined)
    
    @scala.inline
    def setSeparatorRegExp(value: js.RegExp): Self = this.set("separator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSeparator(value: String | js.RegExp | `false`): Self = this.set("separator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSeparator: Self = this.set("separator", js.undefined)
    
    @scala.inline
    def setTagPropsFunction2(value: (/* value */ ReactElement, /* index */ Double) => ITagProps): Self = this.set("tagProps", js.Any.fromFunction2(value))
    
    @scala.inline
    def setTagProps(value: ITagProps | (js.Function2[/* value */ ReactElement, /* index */ Double, ITagProps])): Self = this.set("tagProps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTagProps: Self = this.set("tagProps", js.undefined)
  }
}
