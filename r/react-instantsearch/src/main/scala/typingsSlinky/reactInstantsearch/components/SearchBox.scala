package typingsSlinky.reactInstantsearch.components

import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.raw.HTMLFormElement
import org.scalajs.dom.raw.HTMLInputElement
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.core.SyntheticEvent
import slinky.core.TagMod
import slinky.core.facade.ReactElement
import slinky.web.html.form.tag
import typingsSlinky.reactInstantsearchDom.mod.SearchBoxProps
import typingsSlinky.std.Event_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object SearchBox
  extends ExternalComponentWithAttributesWithRefType[tag.type, typingsSlinky.reactInstantsearch.domMod.SearchBox] {
  @JSImport("react-instantsearch/dom", "SearchBox")
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  def apply(
    autoFocus: js.UndefOr[Boolean] = js.undefined,
    defaultRefinement: String = null,
    focusShortcuts: js.Array[String] = null,
    loadingIndicator: ReactElement = null,
    onChange: /* event */ SyntheticEvent[Event_, HTMLInputElement] => _ = null,
    onReset: /* event */ SyntheticEvent[Event_, HTMLFormElement] => _ = null,
    onSubmit: /* event */ SyntheticEvent[Event_, HTMLFormElement] => _ = null,
    reset: ReactElement = null,
    searchAsYouType: js.UndefOr[Boolean] = js.undefined,
    showLoadingIndicator: js.UndefOr[Boolean] = js.undefined,
    submit: ReactElement = null,
    _overrides: StringDictionary[js.Any] = null
  ): BuildingComponent[tag.type, typingsSlinky.reactInstantsearch.domMod.SearchBox] = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(autoFocus)) __obj.updateDynamic("autoFocus")(autoFocus.asInstanceOf[js.Any])
    if (defaultRefinement != null) __obj.updateDynamic("defaultRefinement")(defaultRefinement.asInstanceOf[js.Any])
    if (focusShortcuts != null) __obj.updateDynamic("focusShortcuts")(focusShortcuts.asInstanceOf[js.Any])
    if (loadingIndicator != null) __obj.updateDynamic("loadingIndicator")(loadingIndicator.asInstanceOf[js.Any])
    if (onChange != null) __obj.updateDynamic("onChange")(js.Any.fromFunction1(onChange))
    if (onReset != null) __obj.updateDynamic("onReset")(js.Any.fromFunction1(onReset))
    if (onSubmit != null) __obj.updateDynamic("onSubmit")(js.Any.fromFunction1(onSubmit))
    if (reset != null) __obj.updateDynamic("reset")(reset.asInstanceOf[js.Any])
    if (!js.isUndefined(searchAsYouType)) __obj.updateDynamic("searchAsYouType")(searchAsYouType.asInstanceOf[js.Any])
    if (!js.isUndefined(showLoadingIndicator)) __obj.updateDynamic("showLoadingIndicator")(showLoadingIndicator.asInstanceOf[js.Any])
    if (submit != null) __obj.updateDynamic("submit")(submit.asInstanceOf[js.Any])
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  def apply(mods: TagMod[tag.type]*): BuildingComponent[tag.type, typingsSlinky.reactInstantsearch.domMod.SearchBox] = new slinky.core.BuildingComponent[slinky.web.html.form.tag.type, typingsSlinky.reactInstantsearch.domMod.SearchBox](js.Array(component.asInstanceOf[js.Any], js.Dictionary.empty)).apply(mods: _*)
  type Props = SearchBoxProps
}

