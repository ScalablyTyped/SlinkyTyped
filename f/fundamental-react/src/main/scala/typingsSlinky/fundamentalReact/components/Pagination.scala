package typingsSlinky.fundamentalReact.components

import org.scalablytyped.runtime.StringDictionary
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.web.html.`*`.tag
import typingsSlinky.fundamentalReact.AnonNext
import typingsSlinky.fundamentalReact.paginationMod.PaginationProps
import typingsSlinky.fundamentalReact.paginationMod.default
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
    disableStyles: js.UndefOr[Boolean] = js.undefined,
    displayTotal: js.UndefOr[Boolean] = js.undefined,
    initialPage: Int | Double = null,
    itemsPerPage: Int | Double = null,
    localizedText: AnonNext = null,
    totalText: String = null,
    _overrides: StringDictionary[js.Any] = null
  ): BuildingComponent[tag.type, default] = {
    val __obj = js.Dynamic.literal(itemsTotal = itemsTotal.asInstanceOf[js.Any], onClick = js.Any.fromFunction1(onClick))
    if (!js.isUndefined(disableStyles)) __obj.updateDynamic("disableStyles")(disableStyles.asInstanceOf[js.Any])
    if (!js.isUndefined(displayTotal)) __obj.updateDynamic("displayTotal")(displayTotal.asInstanceOf[js.Any])
    if (initialPage != null) __obj.updateDynamic("initialPage")(initialPage.asInstanceOf[js.Any])
    if (itemsPerPage != null) __obj.updateDynamic("itemsPerPage")(itemsPerPage.asInstanceOf[js.Any])
    if (localizedText != null) __obj.updateDynamic("localizedText")(localizedText.asInstanceOf[js.Any])
    if (totalText != null) __obj.updateDynamic("totalText")(totalText.asInstanceOf[js.Any])
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  type Props = PaginationProps
}

