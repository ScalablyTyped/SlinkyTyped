package typingsSlinky.fundamentalDashReact.components

import org.scalablytyped.runtime.StringDictionary
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.web.html.`*`.tag
import typingsSlinky.fundamentalDashReact.Anon_Next
import typingsSlinky.fundamentalDashReact.libPaginationPaginationMod.PaginationProps
import typingsSlinky.fundamentalDashReact.libPaginationPaginationMod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Pagination
  extends ExternalComponentWithAttributesWithRefType[tag.type, default] {
  @JSImport("fundamental-react/lib/Pagination/Pagination", JSImport.Default)
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  /* The following DOM/SVG props were specified: className */
  def apply(
    itemsTotal: Double,
    onClick: Double => Unit,
    customStyles: StringDictionary[js.Any] = null,
    disableStyles: js.UndefOr[Boolean] = js.undefined,
    displayTotal: js.UndefOr[Boolean] = js.undefined,
    displayTotalProps: StringDictionary[js.Any] = null,
    initialPage: Int | Double = null,
    itemsPerPage: Int | Double = null,
    linkProps: StringDictionary[js.Any] = null,
    localizedText: Anon_Next = null,
    nextProps: StringDictionary[js.Any] = null,
    prevProps: StringDictionary[js.Any] = null,
    totalText: String = null,
    _overrides: StringDictionary[js.Any] = null
  ): BuildingComponent[tag.type, default] = {
    val __obj = js.Dynamic.literal(itemsTotal = itemsTotal.asInstanceOf[js.Any], onClick = js.Any.fromFunction1(onClick))
    if (customStyles != null) __obj.updateDynamic("customStyles")(customStyles.asInstanceOf[js.Any])
    if (!js.isUndefined(disableStyles)) __obj.updateDynamic("disableStyles")(disableStyles.asInstanceOf[js.Any])
    if (!js.isUndefined(displayTotal)) __obj.updateDynamic("displayTotal")(displayTotal.asInstanceOf[js.Any])
    if (displayTotalProps != null) __obj.updateDynamic("displayTotalProps")(displayTotalProps.asInstanceOf[js.Any])
    if (initialPage != null) __obj.updateDynamic("initialPage")(initialPage.asInstanceOf[js.Any])
    if (itemsPerPage != null) __obj.updateDynamic("itemsPerPage")(itemsPerPage.asInstanceOf[js.Any])
    if (linkProps != null) __obj.updateDynamic("linkProps")(linkProps.asInstanceOf[js.Any])
    if (localizedText != null) __obj.updateDynamic("localizedText")(localizedText.asInstanceOf[js.Any])
    if (nextProps != null) __obj.updateDynamic("nextProps")(nextProps.asInstanceOf[js.Any])
    if (prevProps != null) __obj.updateDynamic("prevProps")(prevProps.asInstanceOf[js.Any])
    if (totalText != null) __obj.updateDynamic("totalText")(totalText.asInstanceOf[js.Any])
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  type Props = PaginationProps
}

