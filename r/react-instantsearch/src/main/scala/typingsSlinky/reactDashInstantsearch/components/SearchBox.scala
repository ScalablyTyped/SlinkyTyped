package typingsSlinky.reactDashInstantsearch.components

import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.raw.Event
import org.scalajs.dom.raw.HTMLFormElement
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.core.SyntheticEvent
import slinky.web.html.`*`.tag
import typingsSlinky.reactDashInstantsearchDashDom.reactDashInstantsearchDashDomMod.SearchBoxProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object SearchBox
  extends ExternalComponentWithAttributesWithRefType[tag.type, typingsSlinky.reactDashInstantsearch.domMod.SearchBox] {
  @JSImport("react-instantsearch/dom", "SearchBox")
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  /* The following DOM/SVG props were specified: autoFocus, onChange, onSubmit */
  def apply(
    defaultRefinement: String = null,
    focusShortcuts: js.Array[String] = null,
    loadingIndicator: typingsSlinky.react.reactMod._Global_.JSX.Element = null,
    onReset: /* event */ SyntheticEvent[Event, HTMLFormElement] => _ = null,
    reset: typingsSlinky.react.reactMod._Global_.JSX.Element = null,
    searchAsYouType: js.UndefOr[Boolean] = js.undefined,
    showLoadingIndicator: js.UndefOr[Boolean] = js.undefined,
    submit: typingsSlinky.react.reactMod._Global_.JSX.Element = null,
    translations: StringDictionary[String | (js.Function1[/* repeated */ js.Any, _])] = null,
    _overrides: StringDictionary[js.Any] = null
  ): BuildingComponent[tag.type, typingsSlinky.reactDashInstantsearch.domMod.SearchBox] = {
    val __obj = js.Dynamic.literal()
    if (defaultRefinement != null) __obj.updateDynamic("defaultRefinement")(defaultRefinement.asInstanceOf[js.Any])
    if (focusShortcuts != null) __obj.updateDynamic("focusShortcuts")(focusShortcuts.asInstanceOf[js.Any])
    if (loadingIndicator != null) __obj.updateDynamic("loadingIndicator")(loadingIndicator.asInstanceOf[js.Any])
    if (onReset != null) __obj.updateDynamic("onReset")(js.Any.fromFunction1(onReset))
    if (reset != null) __obj.updateDynamic("reset")(reset.asInstanceOf[js.Any])
    if (!js.isUndefined(searchAsYouType)) __obj.updateDynamic("searchAsYouType")(searchAsYouType.asInstanceOf[js.Any])
    if (!js.isUndefined(showLoadingIndicator)) __obj.updateDynamic("showLoadingIndicator")(showLoadingIndicator.asInstanceOf[js.Any])
    if (submit != null) __obj.updateDynamic("submit")(submit.asInstanceOf[js.Any])
    if (translations != null) __obj.updateDynamic("translations")(translations.asInstanceOf[js.Any])
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  type Props = SearchBoxProps
}

