package typingsSlinky.reactDashPaginate.components

import org.scalablytyped.runtime.StringDictionary
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.core.TagMod
import slinky.web.html.`*`.tag
import typingsSlinky.reactDashPaginate.Anon_Selected
import typingsSlinky.reactDashPaginate.reactDashPaginateMod.ReactPaginateProps
import typingsSlinky.reactDashPaginate.reactDashPaginateMod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object ReactDashPaginate
  extends ExternalComponentWithAttributesWithRefType[tag.type, default] {
  @JSImport("react-paginate", JSImport.Default)
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  def apply(
    marginPagesDisplayed: Double,
    pageCount: Double,
    pageRangeDisplayed: Double,
    activeClassName: String = null,
    activeLinkClassName: String = null,
    breakClassName: String = null,
    breakLabel: String | TagMod[Any] = null,
    breakLinkClassName: String = null,
    containerClassName: String = null,
    disableInitialCallback: js.UndefOr[Boolean] = js.undefined,
    disabledClassName: String = null,
    extraAriaContext: String = null,
    forcePage: Int | Double = null,
    hrefBuilder: /* pageIndex */ Double => Unit = null,
    initialPage: Int | Double = null,
    nextClassName: String = null,
    nextLabel: TagMod[Any] = null,
    nextLinkClassName: String = null,
    onPageChange: /* selectedItem */ Anon_Selected => Unit = null,
    pageClassName: String = null,
    pageLinkClassName: String = null,
    previousClassName: String = null,
    previousLabel: TagMod[Any] = null,
    previousLinkClassName: String = null,
    _overrides: StringDictionary[js.Any] = null
  ): BuildingComponent[tag.type, default] = {
    val __obj = js.Dynamic.literal(marginPagesDisplayed = marginPagesDisplayed.asInstanceOf[js.Any], pageCount = pageCount.asInstanceOf[js.Any], pageRangeDisplayed = pageRangeDisplayed.asInstanceOf[js.Any])
    if (activeClassName != null) __obj.updateDynamic("activeClassName")(activeClassName.asInstanceOf[js.Any])
    if (activeLinkClassName != null) __obj.updateDynamic("activeLinkClassName")(activeLinkClassName.asInstanceOf[js.Any])
    if (breakClassName != null) __obj.updateDynamic("breakClassName")(breakClassName.asInstanceOf[js.Any])
    if (breakLabel != null) __obj.updateDynamic("breakLabel")(breakLabel.asInstanceOf[js.Any])
    if (breakLinkClassName != null) __obj.updateDynamic("breakLinkClassName")(breakLinkClassName.asInstanceOf[js.Any])
    if (containerClassName != null) __obj.updateDynamic("containerClassName")(containerClassName.asInstanceOf[js.Any])
    if (!js.isUndefined(disableInitialCallback)) __obj.updateDynamic("disableInitialCallback")(disableInitialCallback.asInstanceOf[js.Any])
    if (disabledClassName != null) __obj.updateDynamic("disabledClassName")(disabledClassName.asInstanceOf[js.Any])
    if (extraAriaContext != null) __obj.updateDynamic("extraAriaContext")(extraAriaContext.asInstanceOf[js.Any])
    if (forcePage != null) __obj.updateDynamic("forcePage")(forcePage.asInstanceOf[js.Any])
    if (hrefBuilder != null) __obj.updateDynamic("hrefBuilder")(js.Any.fromFunction1(hrefBuilder))
    if (initialPage != null) __obj.updateDynamic("initialPage")(initialPage.asInstanceOf[js.Any])
    if (nextClassName != null) __obj.updateDynamic("nextClassName")(nextClassName.asInstanceOf[js.Any])
    if (nextLabel != null) __obj.updateDynamic("nextLabel")(nextLabel.asInstanceOf[js.Any])
    if (nextLinkClassName != null) __obj.updateDynamic("nextLinkClassName")(nextLinkClassName.asInstanceOf[js.Any])
    if (onPageChange != null) __obj.updateDynamic("onPageChange")(js.Any.fromFunction1(onPageChange))
    if (pageClassName != null) __obj.updateDynamic("pageClassName")(pageClassName.asInstanceOf[js.Any])
    if (pageLinkClassName != null) __obj.updateDynamic("pageLinkClassName")(pageLinkClassName.asInstanceOf[js.Any])
    if (previousClassName != null) __obj.updateDynamic("previousClassName")(previousClassName.asInstanceOf[js.Any])
    if (previousLabel != null) __obj.updateDynamic("previousLabel")(previousLabel.asInstanceOf[js.Any])
    if (previousLinkClassName != null) __obj.updateDynamic("previousLinkClassName")(previousLinkClassName.asInstanceOf[js.Any])
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  type Props = ReactPaginateProps
}

