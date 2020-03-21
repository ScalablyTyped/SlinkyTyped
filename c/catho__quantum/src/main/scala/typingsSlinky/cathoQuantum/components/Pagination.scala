package typingsSlinky.cathoQuantum.components

import org.scalablytyped.runtime.StringDictionary
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.web.html.`*`.tag
import typingsSlinky.cathoQuantum.paginationMod.PaginationProps
import typingsSlinky.cathoQuantum.paginationMod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Pagination
  extends ExternalComponentWithAttributesWithRefType[tag.type, default] {
  @JSImport("@catho/quantum/Pagination", JSImport.Default)
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  /* The following DOM/SVG props were specified: tabIndex */
  def apply(
    totalPages: Double,
    activePage: Int | Double = null,
    activePageAriaLabel: String = null,
    ariaLabel: String = null,
    followOnlyFirstPage: js.UndefOr[Boolean] = js.undefined,
    infoFormatter: (/* activePage */ js.UndefOr[Double], /* lastPage */ js.UndefOr[Double]) => Unit = null,
    nextButtonText: String = null,
    onPageClick: /* page */ js.UndefOr[Double] => Unit = null,
    pageAriaLabel: String = null,
    pageHref: /* page */ js.UndefOr[Double] => Unit = null,
    prevButtonText: String = null,
    _overrides: StringDictionary[js.Any] = null
  ): BuildingComponent[tag.type, default] = {
    val __obj = js.Dynamic.literal(totalPages = totalPages.asInstanceOf[js.Any])
    if (activePage != null) __obj.updateDynamic("activePage")(activePage.asInstanceOf[js.Any])
    if (activePageAriaLabel != null) __obj.updateDynamic("activePageAriaLabel")(activePageAriaLabel.asInstanceOf[js.Any])
    if (ariaLabel != null) __obj.updateDynamic("ariaLabel")(ariaLabel.asInstanceOf[js.Any])
    if (!js.isUndefined(followOnlyFirstPage)) __obj.updateDynamic("followOnlyFirstPage")(followOnlyFirstPage.asInstanceOf[js.Any])
    if (infoFormatter != null) __obj.updateDynamic("infoFormatter")(js.Any.fromFunction2(infoFormatter))
    if (nextButtonText != null) __obj.updateDynamic("nextButtonText")(nextButtonText.asInstanceOf[js.Any])
    if (onPageClick != null) __obj.updateDynamic("onPageClick")(js.Any.fromFunction1(onPageClick))
    if (pageAriaLabel != null) __obj.updateDynamic("pageAriaLabel")(pageAriaLabel.asInstanceOf[js.Any])
    if (pageHref != null) __obj.updateDynamic("pageHref")(js.Any.fromFunction1(pageHref))
    if (prevButtonText != null) __obj.updateDynamic("prevButtonText")(prevButtonText.asInstanceOf[js.Any])
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  type Props = PaginationProps
}

