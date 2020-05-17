package typingsSlinky.fundamentalReact.paginationMod

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.fundamentalReact.anon.Next
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PaginationProps
  extends /* x */ StringDictionary[js.Any] {
  var className: js.UndefOr[String] = js.native
  var disableStyles: js.UndefOr[Boolean] = js.native
  var displayTotal: js.UndefOr[Boolean] = js.native
  var displayTotalProps: js.UndefOr[js.Any] = js.native
  var initialPage: js.UndefOr[Double] = js.native
  var itemsPerPage: js.UndefOr[Double] = js.native
  var itemsTotal: Double = js.native
  var linkProps: js.UndefOr[js.Any] = js.native
  var localizedText: js.UndefOr[Next] = js.native
  var nextProps: js.UndefOr[js.Any] = js.native
  var prevProps: js.UndefOr[js.Any] = js.native
  var totalText: js.UndefOr[String] = js.native
  var visiblePageTotal: js.UndefOr[Double] = js.native
  def onClick(args: js.Any*): js.Any = js.native
}

object PaginationProps {
  @scala.inline
  def apply(itemsTotal: Double, onClick: /* repeated */ js.Any => js.Any): PaginationProps = {
    val __obj = js.Dynamic.literal(itemsTotal = itemsTotal.asInstanceOf[js.Any], onClick = js.Any.fromFunction1(onClick))
    __obj.asInstanceOf[PaginationProps]
  }
  @scala.inline
  implicit class PaginationPropsOps[Self <: PaginationProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withItemsTotal(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("itemsTotal")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOnClick(value: /* repeated */ js.Any => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onClick")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withClassName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("className")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClassName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("className")(js.undefined)
        ret
    }
    @scala.inline
    def withDisableStyles(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disableStyles")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDisableStyles: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disableStyles")(js.undefined)
        ret
    }
    @scala.inline
    def withDisplayTotal(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("displayTotal")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDisplayTotal: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("displayTotal")(js.undefined)
        ret
    }
    @scala.inline
    def withDisplayTotalProps(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("displayTotalProps")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDisplayTotalProps: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("displayTotalProps")(js.undefined)
        ret
    }
    @scala.inline
    def withInitialPage(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("initialPage")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInitialPage: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("initialPage")(js.undefined)
        ret
    }
    @scala.inline
    def withItemsPerPage(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("itemsPerPage")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutItemsPerPage: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("itemsPerPage")(js.undefined)
        ret
    }
    @scala.inline
    def withLinkProps(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("linkProps")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLinkProps: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("linkProps")(js.undefined)
        ret
    }
    @scala.inline
    def withLocalizedText(value: Next): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("localizedText")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLocalizedText: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("localizedText")(js.undefined)
        ret
    }
    @scala.inline
    def withNextProps(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nextProps")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNextProps: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nextProps")(js.undefined)
        ret
    }
    @scala.inline
    def withPrevProps(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("prevProps")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPrevProps: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("prevProps")(js.undefined)
        ret
    }
    @scala.inline
    def withTotalText(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("totalText")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTotalText: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("totalText")(js.undefined)
        ret
    }
    @scala.inline
    def withVisiblePageTotal(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("visiblePageTotal")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVisiblePageTotal: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("visiblePageTotal")(js.undefined)
        ret
    }
  }
  
}

