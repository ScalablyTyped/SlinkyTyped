package typingsSlinky.fundamentalReact.anon

import org.scalajs.dom.raw.HTMLButtonElement
import org.scalajs.dom.raw.HTMLDivElement
import org.scalajs.dom.raw.HTMLLIElement
import slinky.web.SyntheticFocusEvent
import slinky.web.SyntheticKeyboardEvent
import slinky.web.SyntheticMouseEvent
import typingsSlinky.fundamentalReact.selectMod.Option
import typingsSlinky.react.mod.Validator
import typingsSlinky.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined react.react.WeakValidationMap<fundamental-react.fundamental-react/lib/Select/Select.SelectProps> */
@js.native
trait WeakValidationMapSelectPr extends StObject {
  
  var className: js.UndefOr[Validator[js.UndefOr[Null | String]]] = js.native
  
  var compact: js.UndefOr[Validator[js.UndefOr[Boolean | Null]]] = js.native
  
  var disableStyles: js.UndefOr[Validator[js.UndefOr[Boolean | Null]]] = js.native
  
  var disabled: js.UndefOr[Validator[js.UndefOr[Boolean | Null]]] = js.native
  
  var emptyAriaLabel: js.UndefOr[Validator[js.UndefOr[Null | String]]] = js.native
  
  var formMessageProps: js.UndefOr[Validator[js.UndefOr[Null | (Record[String, _])]]] = js.native
  
  var id: js.UndefOr[Validator[js.UndefOr[Null | String]]] = js.native
  
  var includeEmptyOption: js.UndefOr[Validator[js.UndefOr[Boolean | Null]]] = js.native
  
  var innerRefClassName: js.UndefOr[Validator[js.UndefOr[Null | String]]] = js.native
  
  var listClassName: js.UndefOr[Validator[js.UndefOr[Null | String]]] = js.native
  
  var listItemClassName: js.UndefOr[Validator[js.UndefOr[Null | String]]] = js.native
  
  var listItemTextClassName: js.UndefOr[Validator[js.UndefOr[Null | String]]] = js.native
  
  var onBlur: js.UndefOr[
    Validator[
      js.UndefOr[(js.Function1[/* event */ SyntheticFocusEvent[HTMLDivElement], Unit]) | Null]
    ]
  ] = js.native
  
  var onClick: js.UndefOr[
    Validator[
      js.UndefOr[(js.Function1[/* event */ SyntheticMouseEvent[HTMLButtonElement], Unit]) | Null]
    ]
  ] = js.native
  
  var onSelect: js.UndefOr[
    Validator[
      js.UndefOr[
        (js.Function2[
          SyntheticKeyboardEvent[HTMLLIElement] | SyntheticMouseEvent[HTMLLIElement], 
          /* selectedOption */ Option, 
          Unit
        ]) | Null
      ]
    ]
  ] = js.native
  
  var options: js.UndefOr[Validator[js.UndefOr[js.Array[Option] | Null]]] = js.native
  
  var placeholder: js.UndefOr[Validator[js.UndefOr[Null | String]]] = js.native
  
  var popperClassName: js.UndefOr[Validator[js.UndefOr[Null | String]]] = js.native
  
  var readOnly: js.UndefOr[Validator[js.UndefOr[Boolean | Null]]] = js.native
  
  var referenceClassName: js.UndefOr[Validator[js.UndefOr[Null | String]]] = js.native
  
  var selectedKey: js.UndefOr[Validator[js.UndefOr[Null | String]]] = js.native
  
  var textContentClassName: js.UndefOr[Validator[js.UndefOr[Null | String]]] = js.native
  
  var triggerClassName: js.UndefOr[Validator[js.UndefOr[Null | String]]] = js.native
  
  var validationState: js.UndefOr[Validator[js.UndefOr[Null | State]]] = js.native
  
  var wrapperProps: js.UndefOr[Validator[js.UndefOr[Null | (Record[String, _])]]] = js.native
}
object WeakValidationMapSelectPr {
  
  @scala.inline
  def apply(): WeakValidationMapSelectPr = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WeakValidationMapSelectPr]
  }
  
  @scala.inline
  implicit class WeakValidationMapSelectPrMutableBuilder[Self <: WeakValidationMapSelectPr] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setClassName(value: Validator[js.UndefOr[Null | String]]): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
    
    @scala.inline
    def setCompact(value: Validator[js.UndefOr[Boolean | Null]]): Self = StObject.set(x, "compact", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCompactUndefined: Self = StObject.set(x, "compact", js.undefined)
    
    @scala.inline
    def setDisableStyles(value: Validator[js.UndefOr[Boolean | Null]]): Self = StObject.set(x, "disableStyles", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisableStylesUndefined: Self = StObject.set(x, "disableStyles", js.undefined)
    
    @scala.inline
    def setDisabled(value: Validator[js.UndefOr[Boolean | Null]]): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
    
    @scala.inline
    def setEmptyAriaLabel(value: Validator[js.UndefOr[Null | String]]): Self = StObject.set(x, "emptyAriaLabel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEmptyAriaLabelUndefined: Self = StObject.set(x, "emptyAriaLabel", js.undefined)
    
    @scala.inline
    def setFormMessageProps(value: Validator[js.UndefOr[Null | (Record[String, _])]]): Self = StObject.set(x, "formMessageProps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFormMessagePropsUndefined: Self = StObject.set(x, "formMessageProps", js.undefined)
    
    @scala.inline
    def setId(value: Validator[js.UndefOr[Null | String]]): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    @scala.inline
    def setIncludeEmptyOption(value: Validator[js.UndefOr[Boolean | Null]]): Self = StObject.set(x, "includeEmptyOption", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIncludeEmptyOptionUndefined: Self = StObject.set(x, "includeEmptyOption", js.undefined)
    
    @scala.inline
    def setInnerRefClassName(value: Validator[js.UndefOr[Null | String]]): Self = StObject.set(x, "innerRefClassName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInnerRefClassNameUndefined: Self = StObject.set(x, "innerRefClassName", js.undefined)
    
    @scala.inline
    def setListClassName(value: Validator[js.UndefOr[Null | String]]): Self = StObject.set(x, "listClassName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setListClassNameUndefined: Self = StObject.set(x, "listClassName", js.undefined)
    
    @scala.inline
    def setListItemClassName(value: Validator[js.UndefOr[Null | String]]): Self = StObject.set(x, "listItemClassName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setListItemClassNameUndefined: Self = StObject.set(x, "listItemClassName", js.undefined)
    
    @scala.inline
    def setListItemTextClassName(value: Validator[js.UndefOr[Null | String]]): Self = StObject.set(x, "listItemTextClassName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setListItemTextClassNameUndefined: Self = StObject.set(x, "listItemTextClassName", js.undefined)
    
    @scala.inline
    def setOnBlur(
      value: Validator[
          js.UndefOr[(js.Function1[/* event */ SyntheticFocusEvent[HTMLDivElement], Unit]) | Null]
        ]
    ): Self = StObject.set(x, "onBlur", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnBlurUndefined: Self = StObject.set(x, "onBlur", js.undefined)
    
    @scala.inline
    def setOnClick(
      value: Validator[
          js.UndefOr[(js.Function1[/* event */ SyntheticMouseEvent[HTMLButtonElement], Unit]) | Null]
        ]
    ): Self = StObject.set(x, "onClick", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnClickUndefined: Self = StObject.set(x, "onClick", js.undefined)
    
    @scala.inline
    def setOnSelect(
      value: Validator[
          js.UndefOr[
            (js.Function2[
              SyntheticKeyboardEvent[HTMLLIElement] | SyntheticMouseEvent[HTMLLIElement], 
              /* selectedOption */ Option, 
              Unit
            ]) | Null
          ]
        ]
    ): Self = StObject.set(x, "onSelect", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnSelectUndefined: Self = StObject.set(x, "onSelect", js.undefined)
    
    @scala.inline
    def setOptions(value: Validator[js.UndefOr[js.Array[Option] | Null]]): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOptionsUndefined: Self = StObject.set(x, "options", js.undefined)
    
    @scala.inline
    def setPlaceholder(value: Validator[js.UndefOr[Null | String]]): Self = StObject.set(x, "placeholder", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPlaceholderUndefined: Self = StObject.set(x, "placeholder", js.undefined)
    
    @scala.inline
    def setPopperClassName(value: Validator[js.UndefOr[Null | String]]): Self = StObject.set(x, "popperClassName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPopperClassNameUndefined: Self = StObject.set(x, "popperClassName", js.undefined)
    
    @scala.inline
    def setReadOnly(value: Validator[js.UndefOr[Boolean | Null]]): Self = StObject.set(x, "readOnly", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReadOnlyUndefined: Self = StObject.set(x, "readOnly", js.undefined)
    
    @scala.inline
    def setReferenceClassName(value: Validator[js.UndefOr[Null | String]]): Self = StObject.set(x, "referenceClassName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReferenceClassNameUndefined: Self = StObject.set(x, "referenceClassName", js.undefined)
    
    @scala.inline
    def setSelectedKey(value: Validator[js.UndefOr[Null | String]]): Self = StObject.set(x, "selectedKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSelectedKeyUndefined: Self = StObject.set(x, "selectedKey", js.undefined)
    
    @scala.inline
    def setTextContentClassName(value: Validator[js.UndefOr[Null | String]]): Self = StObject.set(x, "textContentClassName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTextContentClassNameUndefined: Self = StObject.set(x, "textContentClassName", js.undefined)
    
    @scala.inline
    def setTriggerClassName(value: Validator[js.UndefOr[Null | String]]): Self = StObject.set(x, "triggerClassName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTriggerClassNameUndefined: Self = StObject.set(x, "triggerClassName", js.undefined)
    
    @scala.inline
    def setValidationState(value: Validator[js.UndefOr[Null | State]]): Self = StObject.set(x, "validationState", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValidationStateUndefined: Self = StObject.set(x, "validationState", js.undefined)
    
    @scala.inline
    def setWrapperProps(value: Validator[js.UndefOr[Null | (Record[String, _])]]): Self = StObject.set(x, "wrapperProps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWrapperPropsUndefined: Self = StObject.set(x, "wrapperProps", js.undefined)
  }
}
