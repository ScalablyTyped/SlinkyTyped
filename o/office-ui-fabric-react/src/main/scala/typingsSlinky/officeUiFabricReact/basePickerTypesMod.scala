package typingsSlinky.officeUiFabricReact

import org.scalajs.dom.raw.HTMLInputElement
import slinky.core.facade.ReactElement
import typingsSlinky.fluentuiTheme.ithemeMod.ITheme
import typingsSlinky.officeUiFabricReact.anon.Input
import typingsSlinky.officeUiFabricReact.calloutTypesMod.ICalloutProps
import typingsSlinky.officeUiFabricReact.libAutofillMod.Autofill
import typingsSlinky.officeUiFabricReact.pickerItemTypesMod.IPickerItemProps
import typingsSlinky.officeUiFabricReact.suggestionsItemTypesMod.ISuggestionItemProps
import typingsSlinky.officeUiFabricReact.suggestionsTypesMod.ISuggestionModel
import typingsSlinky.officeUiFabricReact.suggestionsTypesMod.ISuggestionsProps
import typingsSlinky.react.mod.FocusEventHandler
import typingsSlinky.react.mod.InputHTMLAttributes
import typingsSlinky.react.mod.Props
import typingsSlinky.uifabricMergeStyles.istyleMod.IStyle
import typingsSlinky.uifabricMergeStyles.istylefunctionMod.IStyleFunctionOrObject
import typingsSlinky.uifabricUtilities.createRefMod.IRefObject
import typingsSlinky.uifabricUtilities.irenderfunctionMod.IRenderFunction
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object basePickerTypesMod {
  
  @js.native
  sealed trait ValidationState extends StObject
  @JSImport("office-ui-fabric-react/lib/components/pickers/BasePicker.types", "ValidationState")
  @js.native
  object ValidationState extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[ValidationState with Double] = js.native
    
    /** User input is invalid. */
    @js.native
    sealed trait invalid extends ValidationState
    /* 2 */ val invalid: typingsSlinky.officeUiFabricReact.basePickerTypesMod.ValidationState.invalid with Double = js.native
    
    /** User input is valid. */
    @js.native
    sealed trait valid extends ValidationState
    /* 0 */ val valid: typingsSlinky.officeUiFabricReact.basePickerTypesMod.ValidationState.valid with Double = js.native
    
    /** User input could be valid or invalid, its state is not known yet. */
    @js.native
    sealed trait warning extends ValidationState
    /* 1 */ val warning: typingsSlinky.officeUiFabricReact.basePickerTypesMod.ValidationState.warning with Double = js.native
  }
  
  @js.native
  trait IBasePicker[T] extends StObject {
    
    /**
      * When called, will take the currently selected suggestion and complete it.
      * If called with forceComplete true, it will attempt to force the current suggestion
      * to complete, must provide both createGenericSuggestion, so the text can be turned into
      * an object in the right shape, and onValidateInput, so the object knows if it's correct or not.
      */
    def completeSuggestion(): Unit = js.native
    def completeSuggestion(forceComplete: Boolean): Unit = js.native
    
    /** Sets focus to the focus zone. */
    def focus(): Unit = js.native
    
    /** Set focus to the input */
    def focusInput(): Unit = js.native
    
    /** Gets the current value of the input. */
    var items: js.UndefOr[js.Array[T]] = js.native
  }
  
  @js.native
  trait IBasePickerProps[T]
    extends Props[js.Any] {
    
    /**
      * ClassName for the picker.
      */
    var className: js.UndefOr[String] = js.native
    
    /**
      * Optional callback to access the IBasePicker interface. Use this instead of ref for accessing
      * the public methods and properties of the component.
      */
    var componentRef: js.UndefOr[IRefObject[IBasePicker[T]]] = js.native
    
    /**
      * Function that specifies how arbitrary text entered into the well is handled.
      */
    var createGenericItem: js.UndefOr[
        js.Function2[/* input */ String, /* ValidationState */ ValidationState, ISuggestionModel[T] | T]
      ] = js.native
    
    /**
      * Initial items that have already been selected and should appear in the people picker.
      */
    var defaultSelectedItems: js.UndefOr[js.Array[T]] = js.native
    
    /**
      * Flag for disabling the picker.
      * @defaultvalue false
      */
    var disabled: js.UndefOr[Boolean] = js.native
    
    /**
      * Adds an additional alert for the currently selected suggestion. This prop should be set to true for IE11 and below,
      * as it enables proper screen reader behavior for each suggestion (since aria-activedescendant does not work
      * with IE11). It should not be set for modern browsers (Edge, Chrome).
      * @defaultvalue false
      */
    var enableSelectedSuggestionAlert: js.UndefOr[Boolean] = js.native
    
    /**
      * A callback to get text from an item. Used to autofill text in the pickers.
      */
    var getTextFromItem: js.UndefOr[js.Function2[/* item */ T, /* currentValue */ js.UndefOr[String], String]] = js.native
    
    /**
      * AutoFill input native props
      * @defaultvalue undefined
      */
    var inputProps: js.UndefOr[IInputProps] = js.native
    
    /**
      * Restrict the amount of selectable items.
      * @defaultvalue undefined
      */
    var itemLimit: js.UndefOr[Double] = js.native
    
    /**
      * A callback for when the user moves the focus away from the picker
      */
    var onBlur: js.UndefOr[FocusEventHandler[HTMLInputElement | Autofill]] = js.native
    
    /**
      * A callback for when the selected list of items changes.
      */
    var onChange: js.UndefOr[js.Function1[/* items */ js.UndefOr[js.Array[T]], Unit]] = js.native
    
    /**
      * A callback to override the default behavior of adding the selected suggestion on dismiss. If it returns true or
      * nothing, the selected item will be added on dismiss. If false, the selected item will not be added on dismiss.
      *
      */
    var onDismiss: js.UndefOr[
        js.Function2[/* ev */ js.UndefOr[js.Any], /* selectedItem */ js.UndefOr[T], Boolean | Unit]
      ] = js.native
    
    /**
      * A callback for what should happen when a user clicks within the input area.
      * @deprecated Please use onEmptyResolveSuggestions instead, as the suggestions aren't about
      * setting focus as they are about resolving suggestions when there is no input.
      */
    var onEmptyInputFocus: js.UndefOr[
        js.Function1[
          /* selectedItems */ js.UndefOr[js.Array[T]], 
          js.Array[T] | js.Thenable[js.Array[T]]
        ]
      ] = js.native
    
    /**
      * A callback for what should happen when suggestions are shown without
      * input provided.
      * Returns the already selected items so the resolver can filter them out.
      * If used in conjunction with resolveDelay this will only kick off after the delay throttle.
      */
    var onEmptyResolveSuggestions: js.UndefOr[
        js.Function1[
          /* selectedItems */ js.UndefOr[js.Array[T]], 
          js.Array[T] | js.Thenable[js.Array[T]]
        ]
      ] = js.native
    
    /**
      * A callback for when the user put focus on the picker
      * @deprecated Use `inputProps.onFocus` instead
      */
    var onFocus: js.UndefOr[FocusEventHandler[HTMLInputElement | Autofill]] = js.native
    
    /**
      * A callback that gets the rest of the results when a user clicks get more results.
      */
    var onGetMoreResults: js.UndefOr[
        js.Function2[
          /* filter */ String, 
          /* selectedItems */ js.UndefOr[js.Array[T]], 
          js.Array[T] | js.Thenable[js.Array[T]]
        ]
      ] = js.native
    
    /**
      * A callback used to modify the input string.
      */
    var onInputChange: js.UndefOr[js.Function1[/* input */ String, String]] = js.native
    
    /**
      * A callback to process a selection after the user selects something from the picker. If the callback returns null,
      * the item will not be added to the picker.
      */
    var onItemSelected: js.UndefOr[js.Function1[/* selectedItem */ js.UndefOr[T], T | js.Thenable[T] | Null]] = js.native
    
    /**
      * A callback for when an item is removed from the suggestion list
      */
    var onRemoveSuggestion: js.UndefOr[js.Function1[/* item */ T, Unit]] = js.native
    
    /**
      * Function that specifies how the selected item will appear.
      */
    var onRenderItem: js.UndefOr[js.Function1[/* props */ IPickerItemProps[T], ReactElement]] = js.native
    
    /**
      * Function that specifies how an individual suggestion item will appear.
      */
    var onRenderSuggestionsItem: js.UndefOr[
        js.Function2[/* props */ T, /* itemProps */ ISuggestionItemProps[T], ReactElement]
      ] = js.native
    
    /**
      * A callback for what should happen when a person types text into the input.
      * Returns the already selected items so the resolver can filter them out.
      * If used in conjunction with resolveDelay this will only kick off after the delay throttle.
      */
    def onResolveSuggestions(filter: String): js.Array[T] | js.Thenable[js.Array[T]] = js.native
    def onResolveSuggestions(filter: String, selectedItems: js.Array[T]): js.Array[T] | js.Thenable[js.Array[T]] = js.native
    
    /**
      * A function used to validate if raw text entered into the well can be added into the selected items list
      */
    var onValidateInput: js.UndefOr[js.Function1[/* input */ String, ValidationState]] = js.native
    
    /**
      * The properties that will get passed to the Callout component.
      */
    var pickerCalloutProps: js.UndefOr[ICalloutProps] = js.native
    
    /**
      * The properties that will get passed to the Suggestions component.
      */
    var pickerSuggestionsProps: js.UndefOr[IBasePickerSuggestionsProps[_]] = js.native
    
    /**
      * Aria label for the "X" button in the selected item component.
      * @defaultvalue ''
      */
    var removeButtonAriaLabel: js.UndefOr[String] = js.native
    
    /**
      * The delay time in ms before resolving suggestions, which is kicked off when input has been changed.
      * e.g. If a second input change happens within the resolveDelay time, the timer will start over.
      * Only until after the timer completes will onResolveSuggestions be called.
      */
    var resolveDelay: js.UndefOr[Double] = js.native
    
    /**
      * The text to display while searching for more results in a limited suggestions list
      */
    var searchingText: js.UndefOr[(js.Function1[/* props */ Input, String]) | String] = js.native
    
    /**
      * The items that the base picker should currently display as selected.
      * If this is provided then the picker will act as a controlled component.
      */
    var selectedItems: js.UndefOr[js.Array[T]] = js.native
    
    /**
      * Call to provide customized styling that will layer on top of the variant rules.
      */
    var styles: js.UndefOr[IStyleFunctionOrObject[IBasePickerStyleProps, IBasePickerStyles]] = js.native
    
    /**
      * Theme provided by styled() function.
      */
    var theme: js.UndefOr[ITheme] = js.native
  }
  
  /* Inlined std.Pick<office-ui-fabric-react.office-ui-fabric-react/lib/components/pickers/BasePicker.types.IBasePickerProps<any>, 'theme' | 'className' | 'disabled'> & {  isFocused :boolean | undefined,   inputClassName :string | undefined} */
  @js.native
  trait IBasePickerStyleProps extends StObject {
    
    var className: js.UndefOr[String] = js.native
    
    var disabled: js.UndefOr[Boolean] = js.native
    
    /** Optional pickerInput className */
    var inputClassName: js.UndefOr[String] = js.native
    
    /** Whether text style area is focused */
    var isFocused: js.UndefOr[Boolean] = js.native
    
    var theme: js.UndefOr[ITheme] = js.native
  }
  object IBasePickerStyleProps {
    
    @scala.inline
    def apply(): IBasePickerStyleProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IBasePickerStyleProps]
    }
    
    @scala.inline
    implicit class IBasePickerStylePropsMutableBuilder[Self <: IBasePickerStyleProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      @scala.inline
      def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
      
      @scala.inline
      def setInputClassName(value: String): Self = StObject.set(x, "inputClassName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInputClassNameUndefined: Self = StObject.set(x, "inputClassName", js.undefined)
      
      @scala.inline
      def setIsFocused(value: Boolean): Self = StObject.set(x, "isFocused", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsFocusedUndefined: Self = StObject.set(x, "isFocused", js.undefined)
      
      @scala.inline
      def setTheme(value: ITheme): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setThemeUndefined: Self = StObject.set(x, "theme", js.undefined)
    }
  }
  
  @js.native
  trait IBasePickerStyles extends StObject {
    
    /** Refers to the input were to type new selections (picks). */
    var input: IStyle = js.native
    
    /** Refers to the items already selected (picked). */
    var itemsWrapper: IStyle = js.native
    
    /** Root element of any picker extending from BasePicker (wraps all the elements). */
    var root: IStyle = js.native
    
    /** Refers to helper element used for accessibility tools (hidden from view on screen). */
    var screenReaderText: IStyle = js.native
    
    /**
      * Refers to the elements already selected (picked) wrapped by `itemsWrapper` along with the input to type
      * a new selection.
      */
    var text: IStyle = js.native
  }
  object IBasePickerStyles {
    
    @scala.inline
    def apply(): IBasePickerStyles = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IBasePickerStyles]
    }
    
    @scala.inline
    implicit class IBasePickerStylesMutableBuilder[Self <: IBasePickerStyles] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setInput(value: IStyle): Self = StObject.set(x, "input", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInputNull: Self = StObject.set(x, "input", null)
      
      @scala.inline
      def setInputUndefined: Self = StObject.set(x, "input", js.undefined)
      
      @scala.inline
      def setItemsWrapper(value: IStyle): Self = StObject.set(x, "itemsWrapper", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setItemsWrapperNull: Self = StObject.set(x, "itemsWrapper", null)
      
      @scala.inline
      def setItemsWrapperUndefined: Self = StObject.set(x, "itemsWrapper", js.undefined)
      
      @scala.inline
      def setRoot(value: IStyle): Self = StObject.set(x, "root", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRootNull: Self = StObject.set(x, "root", null)
      
      @scala.inline
      def setRootUndefined: Self = StObject.set(x, "root", js.undefined)
      
      @scala.inline
      def setScreenReaderText(value: IStyle): Self = StObject.set(x, "screenReaderText", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setScreenReaderTextNull: Self = StObject.set(x, "screenReaderText", null)
      
      @scala.inline
      def setScreenReaderTextUndefined: Self = StObject.set(x, "screenReaderText", js.undefined)
      
      @scala.inline
      def setText(value: IStyle): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTextNull: Self = StObject.set(x, "text", null)
      
      @scala.inline
      def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
    }
  }
  
  /* Inlined parent std.Pick<office-ui-fabric-react.office-ui-fabric-react/lib/components/pickers/Suggestions/Suggestions.types.ISuggestionsProps<T>, 'onRenderNoResultFound' | 'suggestionsHeaderText' | 'mostRecentlyUsedHeaderText' | 'noResultsFoundText' | 'className' | 'suggestionsClassName' | 'suggestionsItemClassName' | 'searchForMoreText' | 'forceResolveText' | 'loadingText' | 'searchingText' | 'resultsFooterFull' | 'resultsFooter' | 'resultsMaximumNumber' | 'showRemoveButtons' | 'suggestionsAvailableAlertText' | 'suggestionsContainerAriaLabel' | 'showForceResolve'> */
  @js.native
  trait IBasePickerSuggestionsProps[T] extends StObject {
    
    var className: js.UndefOr[String] = js.native
    
    var forceResolveText: js.UndefOr[String] = js.native
    
    var loadingText: js.UndefOr[String] = js.native
    
    var mostRecentlyUsedHeaderText: js.UndefOr[String] = js.native
    
    var noResultsFoundText: js.UndefOr[String] = js.native
    
    var onRenderNoResultFound: js.UndefOr[IRenderFunction[Unit]] = js.native
    
    var resultsFooter: js.UndefOr[js.Function1[/* props */ ISuggestionsProps[T], ReactElement]] = js.native
    
    var resultsFooterFull: js.UndefOr[js.Function1[/* props */ ISuggestionsProps[T], ReactElement]] = js.native
    
    var resultsMaximumNumber: js.UndefOr[Double] = js.native
    
    var searchForMoreText: js.UndefOr[String] = js.native
    
    var searchingText: js.UndefOr[String] = js.native
    
    var showForceResolve: js.UndefOr[js.Function0[Boolean]] = js.native
    
    var showRemoveButtons: js.UndefOr[Boolean] = js.native
    
    var suggestionsAvailableAlertText: js.UndefOr[String] = js.native
    
    var suggestionsClassName: js.UndefOr[String] = js.native
    
    var suggestionsContainerAriaLabel: js.UndefOr[String] = js.native
    
    var suggestionsHeaderText: js.UndefOr[String] = js.native
    
    var suggestionsItemClassName: js.UndefOr[String] = js.native
  }
  object IBasePickerSuggestionsProps {
    
    @scala.inline
    def apply[T](): IBasePickerSuggestionsProps[T] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IBasePickerSuggestionsProps[T]]
    }
    
    @scala.inline
    implicit class IBasePickerSuggestionsPropsMutableBuilder[Self <: IBasePickerSuggestionsProps[_], T] (val x: Self with IBasePickerSuggestionsProps[T]) extends AnyVal {
      
      @scala.inline
      def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      @scala.inline
      def setForceResolveText(value: String): Self = StObject.set(x, "forceResolveText", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setForceResolveTextUndefined: Self = StObject.set(x, "forceResolveText", js.undefined)
      
      @scala.inline
      def setLoadingText(value: String): Self = StObject.set(x, "loadingText", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLoadingTextUndefined: Self = StObject.set(x, "loadingText", js.undefined)
      
      @scala.inline
      def setMostRecentlyUsedHeaderText(value: String): Self = StObject.set(x, "mostRecentlyUsedHeaderText", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMostRecentlyUsedHeaderTextUndefined: Self = StObject.set(x, "mostRecentlyUsedHeaderText", js.undefined)
      
      @scala.inline
      def setNoResultsFoundText(value: String): Self = StObject.set(x, "noResultsFoundText", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNoResultsFoundTextUndefined: Self = StObject.set(x, "noResultsFoundText", js.undefined)
      
      @scala.inline
      def setOnRenderNoResultFound(
        value: (/* props */ js.UndefOr[Unit], /* defaultRender */ js.UndefOr[js.Function1[/* props */ js.UndefOr[Unit], ReactElement | Null]]) => ReactElement | Null
      ): Self = StObject.set(x, "onRenderNoResultFound", js.Any.fromFunction2(value))
      
      @scala.inline
      def setOnRenderNoResultFoundUndefined: Self = StObject.set(x, "onRenderNoResultFound", js.undefined)
      
      @scala.inline
      def setResultsFooter(value: /* props */ ISuggestionsProps[T] => ReactElement): Self = StObject.set(x, "resultsFooter", js.Any.fromFunction1(value))
      
      @scala.inline
      def setResultsFooterFull(value: /* props */ ISuggestionsProps[T] => ReactElement): Self = StObject.set(x, "resultsFooterFull", js.Any.fromFunction1(value))
      
      @scala.inline
      def setResultsFooterFullUndefined: Self = StObject.set(x, "resultsFooterFull", js.undefined)
      
      @scala.inline
      def setResultsFooterUndefined: Self = StObject.set(x, "resultsFooter", js.undefined)
      
      @scala.inline
      def setResultsMaximumNumber(value: Double): Self = StObject.set(x, "resultsMaximumNumber", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setResultsMaximumNumberUndefined: Self = StObject.set(x, "resultsMaximumNumber", js.undefined)
      
      @scala.inline
      def setSearchForMoreText(value: String): Self = StObject.set(x, "searchForMoreText", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSearchForMoreTextUndefined: Self = StObject.set(x, "searchForMoreText", js.undefined)
      
      @scala.inline
      def setSearchingText(value: String): Self = StObject.set(x, "searchingText", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSearchingTextUndefined: Self = StObject.set(x, "searchingText", js.undefined)
      
      @scala.inline
      def setShowForceResolve(value: () => Boolean): Self = StObject.set(x, "showForceResolve", js.Any.fromFunction0(value))
      
      @scala.inline
      def setShowForceResolveUndefined: Self = StObject.set(x, "showForceResolve", js.undefined)
      
      @scala.inline
      def setShowRemoveButtons(value: Boolean): Self = StObject.set(x, "showRemoveButtons", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShowRemoveButtonsUndefined: Self = StObject.set(x, "showRemoveButtons", js.undefined)
      
      @scala.inline
      def setSuggestionsAvailableAlertText(value: String): Self = StObject.set(x, "suggestionsAvailableAlertText", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSuggestionsAvailableAlertTextUndefined: Self = StObject.set(x, "suggestionsAvailableAlertText", js.undefined)
      
      @scala.inline
      def setSuggestionsClassName(value: String): Self = StObject.set(x, "suggestionsClassName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSuggestionsClassNameUndefined: Self = StObject.set(x, "suggestionsClassName", js.undefined)
      
      @scala.inline
      def setSuggestionsContainerAriaLabel(value: String): Self = StObject.set(x, "suggestionsContainerAriaLabel", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSuggestionsContainerAriaLabelUndefined: Self = StObject.set(x, "suggestionsContainerAriaLabel", js.undefined)
      
      @scala.inline
      def setSuggestionsHeaderText(value: String): Self = StObject.set(x, "suggestionsHeaderText", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSuggestionsHeaderTextUndefined: Self = StObject.set(x, "suggestionsHeaderText", js.undefined)
      
      @scala.inline
      def setSuggestionsItemClassName(value: String): Self = StObject.set(x, "suggestionsItemClassName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSuggestionsItemClassNameUndefined: Self = StObject.set(x, "suggestionsItemClassName", js.undefined)
    }
  }
  
  @js.native
  trait IInputProps extends InputHTMLAttributes[HTMLInputElement] {
    
    /**
      * The default value to be visible when the autofill first created.
      * This is different than placeholder text because the placeholder text will disappear and re-appear. This
      * text persists until deleted or changed.
      */
    var defaultVisibleValue: js.UndefOr[String] = js.native
  }
  object IInputProps {
    
    @scala.inline
    def apply(): IInputProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IInputProps]
    }
    
    @scala.inline
    implicit class IInputPropsMutableBuilder[Self <: IInputProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDefaultVisibleValue(value: String): Self = StObject.set(x, "defaultVisibleValue", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDefaultVisibleValueUndefined: Self = StObject.set(x, "defaultVisibleValue", js.undefined)
    }
  }
}
