package typingsSlinky.reactLazylog.components

import org.scalablytyped.runtime.StringDictionary
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.core.TagMod
import slinky.web.html.`*`.tag
import typingsSlinky.reactLazylog.searchBarMod.SearchBarProps
import typingsSlinky.reactLazylog.searchBarMod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object SearchBar
  extends ExternalComponentWithAttributesWithRefType[tag.type, default] {
  @JSImport("react-lazylog/build/SearchBar", JSImport.Default)
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  /* The following DOM/SVG props were specified: disabled */
  def apply(
    filterActive: js.UndefOr[Boolean] = js.undefined,
    onClearSearch: () => Unit = null,
    onFilterLinesWithMatches: /* isFiltered */ Boolean => Unit = null,
    onSearch: /* keyword */ String => Unit = null,
    resultsCount: Int | Double = null,
    _overrides: StringDictionary[js.Any] = null
  ): BuildingComponent[tag.type, default] = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(filterActive)) __obj.updateDynamic("filterActive")(filterActive.asInstanceOf[js.Any])
    if (onClearSearch != null) __obj.updateDynamic("onClearSearch")(js.Any.fromFunction0(onClearSearch))
    if (onFilterLinesWithMatches != null) __obj.updateDynamic("onFilterLinesWithMatches")(js.Any.fromFunction1(onFilterLinesWithMatches))
    if (onSearch != null) __obj.updateDynamic("onSearch")(js.Any.fromFunction1(onSearch))
    if (resultsCount != null) __obj.updateDynamic("resultsCount")(resultsCount.asInstanceOf[js.Any])
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  def apply(mods: TagMod[tag.type]*): BuildingComponent[tag.type, default] = new slinky.core.BuildingComponent[slinky.web.html.`*`.tag.type, typingsSlinky.reactLazylog.searchBarMod.default](js.Array(component.asInstanceOf[js.Any], js.Dictionary.empty)).apply(mods: _*)
  type Props = SearchBarProps
}

