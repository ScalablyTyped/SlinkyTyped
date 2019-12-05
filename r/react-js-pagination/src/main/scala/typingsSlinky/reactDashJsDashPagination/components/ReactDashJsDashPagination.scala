package typingsSlinky.reactDashJsDashPagination.components

import org.scalablytyped.runtime.StringDictionary
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.core.facade.ReactElement
import slinky.web.html.`*`.tag
import typingsSlinky.reactDashJsDashPagination.reactDashJsDashPaginationMod.ReactJsPaginationProps
import typingsSlinky.reactDashJsDashPagination.reactDashJsDashPaginationMod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object ReactDashJsDashPagination
  extends ExternalComponentWithAttributesWithRefType[tag.type, default] {
  @JSImport("react-js-pagination", JSImport.Default)
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  def apply(
    activePage: Double,
    onChange: Double => Unit,
    totalItemsCount: Double,
    activeClass: String = null,
    activeLinkClass: String = null,
    disabledClass: String = null,
    firstPageText: String | ReactElement = null,
    getPageUrl: /* pageNumber */ Double => String = null,
    hideDisabled: js.UndefOr[Boolean] = js.undefined,
    hideFirstLastPages: js.UndefOr[Boolean] = js.undefined,
    hideNavigation: js.UndefOr[Boolean] = js.undefined,
    innerClass: String = null,
    itemClass: String = null,
    itemClassFirst: String = null,
    itemClassLast: String = null,
    itemClassNext: String = null,
    itemClassPrev: String = null,
    itemsCountPerPage: Int | Double = null,
    lastPageText: String | ReactElement = null,
    linkClass: String = null,
    linkClassFirst: String = null,
    linkClassLast: String = null,
    linkClassNext: String = null,
    linkClassPrev: String = null,
    nextPageText: String | ReactElement = null,
    pageRangeDisplayed: Int | Double = null,
    prevPageText: String | ReactElement = null,
    _overrides: StringDictionary[js.Any] = null
  ): BuildingComponent[tag.type, default] = {
    val __obj = js.Dynamic.literal(activePage = activePage.asInstanceOf[js.Any], onChange = js.Any.fromFunction1(onChange), totalItemsCount = totalItemsCount.asInstanceOf[js.Any])
    if (activeClass != null) __obj.updateDynamic("activeClass")(activeClass.asInstanceOf[js.Any])
    if (activeLinkClass != null) __obj.updateDynamic("activeLinkClass")(activeLinkClass.asInstanceOf[js.Any])
    if (disabledClass != null) __obj.updateDynamic("disabledClass")(disabledClass.asInstanceOf[js.Any])
    if (firstPageText != null) __obj.updateDynamic("firstPageText")(firstPageText.asInstanceOf[js.Any])
    if (getPageUrl != null) __obj.updateDynamic("getPageUrl")(js.Any.fromFunction1(getPageUrl))
    if (!js.isUndefined(hideDisabled)) __obj.updateDynamic("hideDisabled")(hideDisabled.asInstanceOf[js.Any])
    if (!js.isUndefined(hideFirstLastPages)) __obj.updateDynamic("hideFirstLastPages")(hideFirstLastPages.asInstanceOf[js.Any])
    if (!js.isUndefined(hideNavigation)) __obj.updateDynamic("hideNavigation")(hideNavigation.asInstanceOf[js.Any])
    if (innerClass != null) __obj.updateDynamic("innerClass")(innerClass.asInstanceOf[js.Any])
    if (itemClass != null) __obj.updateDynamic("itemClass")(itemClass.asInstanceOf[js.Any])
    if (itemClassFirst != null) __obj.updateDynamic("itemClassFirst")(itemClassFirst.asInstanceOf[js.Any])
    if (itemClassLast != null) __obj.updateDynamic("itemClassLast")(itemClassLast.asInstanceOf[js.Any])
    if (itemClassNext != null) __obj.updateDynamic("itemClassNext")(itemClassNext.asInstanceOf[js.Any])
    if (itemClassPrev != null) __obj.updateDynamic("itemClassPrev")(itemClassPrev.asInstanceOf[js.Any])
    if (itemsCountPerPage != null) __obj.updateDynamic("itemsCountPerPage")(itemsCountPerPage.asInstanceOf[js.Any])
    if (lastPageText != null) __obj.updateDynamic("lastPageText")(lastPageText.asInstanceOf[js.Any])
    if (linkClass != null) __obj.updateDynamic("linkClass")(linkClass.asInstanceOf[js.Any])
    if (linkClassFirst != null) __obj.updateDynamic("linkClassFirst")(linkClassFirst.asInstanceOf[js.Any])
    if (linkClassLast != null) __obj.updateDynamic("linkClassLast")(linkClassLast.asInstanceOf[js.Any])
    if (linkClassNext != null) __obj.updateDynamic("linkClassNext")(linkClassNext.asInstanceOf[js.Any])
    if (linkClassPrev != null) __obj.updateDynamic("linkClassPrev")(linkClassPrev.asInstanceOf[js.Any])
    if (nextPageText != null) __obj.updateDynamic("nextPageText")(nextPageText.asInstanceOf[js.Any])
    if (pageRangeDisplayed != null) __obj.updateDynamic("pageRangeDisplayed")(pageRangeDisplayed.asInstanceOf[js.Any])
    if (prevPageText != null) __obj.updateDynamic("prevPageText")(prevPageText.asInstanceOf[js.Any])
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  type Props = ReactJsPaginationProps
}

