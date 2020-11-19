package typingsSlinky.officeUiFabricReact.baseFloatingPickerTypesMod

import org.scalajs.dom.raw.HTMLInputElement
import slinky.core.facade.ReactElement
import typingsSlinky.officeUiFabricReact.anon.Input
import typingsSlinky.officeUiFabricReact.calloutTypesMod.ICalloutProps
import typingsSlinky.officeUiFabricReact.suggestionsItemTypesMod.ISuggestionItemProps
import typingsSlinky.officeUiFabricReact.suggestionsStoreMod.SuggestionsStore
import typingsSlinky.officeUiFabricReact.suggestionsTypesMod.ISuggestionModel
import typingsSlinky.react.mod.ClassAttributes
import typingsSlinky.uifabricUtilities.createRefMod.IRefObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IBaseFloatingPickerProps[T]
  extends ClassAttributes[js.Any] {
  
  /**
    * Width for the suggestions callout
    */
  var calloutWidth: js.UndefOr[Double] = js.native
  
  /**
    * ClassName for the picker.
    */
  var className: js.UndefOr[String] = js.native
  
  var componentRef: js.UndefOr[IRefObject[IBaseFloatingPicker]] = js.native
  
  /**
    * Function that specifies how arbitrary text entered into the well is handled.
    */
  var createGenericItem: js.UndefOr[js.Function2[/* input */ String, /* isValid */ Boolean, ISuggestionModel[T]]] = js.native
  
  /**
    * A callback to get text from an item. Used to autofill text in the pickers.
    */
  var getTextFromItem: js.UndefOr[js.Function2[/* item */ T, /* currentValue */ js.UndefOr[String], String]] = js.native
  
  /**
    * The input element to listen on events
    */
  var inputElement: js.UndefOr[HTMLInputElement | Null] = js.native
  
  /**
    * A callback for when a suggestion is clicked
    */
  var onChange: js.UndefOr[js.Function1[/* item */ T, Unit]] = js.native
  
  /**
    * A callback for when the input has been changed
    */
  var onInputChanged: js.UndefOr[js.Function1[/* filter */ String, Unit]] = js.native
  
  /**
    * A callback for when an item is removed from the suggestion list
    */
  var onRemoveSuggestion: js.UndefOr[js.Function1[/* item */ T, Unit]] = js.native
  
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
    * Return null if using as a controlled component
    */
  def onResolveSuggestions(filter: String): js.Array[T] | js.Thenable[js.Array[T]] | Null = js.native
  def onResolveSuggestions(filter: String, selectedItems: js.Array[T]): js.Array[T] | js.Thenable[js.Array[T]] | Null = js.native
  
  /**
    * The callback that should be called when the suggestions are hiden
    */
  var onSuggestionsHidden: js.UndefOr[js.Function0[Unit]] = js.native
  
  /**
    * The callback that should be called when the suggestions are shown
    */
  var onSuggestionsShown: js.UndefOr[js.Function0[Unit]] = js.native
  
  /**
    * A function used to validate if raw text entered into the well can be added
    */
  var onValidateInput: js.UndefOr[js.Function1[/* input */ String, Boolean]] = js.native
  
  /**
    * The suggestions to show on zero query, return null if using as a controlled component
    */
  var onZeroQuerySuggestion: js.UndefOr[
    js.Function1[
      /* selectedItems */ js.UndefOr[js.Array[T]], 
      js.Array[T] | js.Thenable[js.Array[T]] | Null
    ]
  ] = js.native
  
  /**
    * The properties that will get passed to the Callout component.
    */
  var pickerCalloutProps: js.UndefOr[ICalloutProps] = js.native
  
  /**
    * The properties that will get passed to the Suggestions component.
    */
  var pickerSuggestionsProps: js.UndefOr[IBaseFloatingPickerSuggestionProps] = js.native
  
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
    * The callback that should be called to see if the force resolve command should be shown
    */
  var showForceResolve: js.UndefOr[js.Function0[Boolean]] = js.native
  
  /**
    * If using as a controlled component, the items to show in the suggestion list
    */
  var suggestionItems: js.UndefOr[js.Array[T]] = js.native
  
  /**
    * The suggestions store
    */
  var suggestionsStore: SuggestionsStore[T] = js.native
}
