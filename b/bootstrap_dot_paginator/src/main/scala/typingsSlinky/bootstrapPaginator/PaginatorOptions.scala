package typingsSlinky.bootstrapPaginator

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PaginatorOptions extends js.Object {
  var alignment: js.UndefOr[String] = js.native
  var bootstrapMajorVersion: js.UndefOr[Double] = js.native
  var bootstrapTooltipOptions: js.UndefOr[js.Object] = js.native
  var currentPage: js.UndefOr[Double] = js.native
  var itemContainerClass: js.UndefOr[js.Function3[/* type */ String, /* page */ Double, /* current */ Double, String]] = js.native
  var itemTexts: js.UndefOr[js.Function3[/* type */ String, /* page */ Double, /* current */ Double, String]] = js.native
  var numberOfPages: js.UndefOr[Double] = js.native
  var onPageChanged: js.UndefOr[
    js.Function4[
      /* event */ js.Any, 
      /* originalEvent */ js.Any, 
      /* type */ String, 
      /* page */ Double, 
      Unit
    ]
  ] = js.native
  var onPageClicked: js.UndefOr[
    js.Function4[
      /* event */ js.Any, 
      /* originalEvent */ js.Any, 
      /* type */ String, 
      /* page */ Double, 
      Unit
    ]
  ] = js.native
  var pageUrl: js.UndefOr[js.Function3[/* type */ String, /* page */ Double, /* current */ Double, String]] = js.native
  var shouldShowPage: js.UndefOr[Boolean] = js.native
  var size: js.UndefOr[String] = js.native
  var tooltipTitles: js.UndefOr[js.Function3[/* type */ String, /* page */ Double, /* current */ Double, String]] = js.native
  var totalPages: js.UndefOr[Double] = js.native
  var useBootstrapTooltip: js.UndefOr[Boolean] = js.native
}

object PaginatorOptions {
  @scala.inline
  def apply(): PaginatorOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PaginatorOptions]
  }
  @scala.inline
  implicit class PaginatorOptionsOps[Self <: PaginatorOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAlignment(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("alignment")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAlignment: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("alignment")(js.undefined)
        ret
    }
    @scala.inline
    def withBootstrapMajorVersion(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bootstrapMajorVersion")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBootstrapMajorVersion: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bootstrapMajorVersion")(js.undefined)
        ret
    }
    @scala.inline
    def withBootstrapTooltipOptions(value: js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bootstrapTooltipOptions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBootstrapTooltipOptions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bootstrapTooltipOptions")(js.undefined)
        ret
    }
    @scala.inline
    def withCurrentPage(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("currentPage")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCurrentPage: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("currentPage")(js.undefined)
        ret
    }
    @scala.inline
    def withItemContainerClass(value: (/* type */ String, /* page */ Double, /* current */ Double) => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("itemContainerClass")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withoutItemContainerClass: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("itemContainerClass")(js.undefined)
        ret
    }
    @scala.inline
    def withItemTexts(value: (/* type */ String, /* page */ Double, /* current */ Double) => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("itemTexts")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withoutItemTexts: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("itemTexts")(js.undefined)
        ret
    }
    @scala.inline
    def withNumberOfPages(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("numberOfPages")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNumberOfPages: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("numberOfPages")(js.undefined)
        ret
    }
    @scala.inline
    def withOnPageChanged(
      value: (/* event */ js.Any, /* originalEvent */ js.Any, /* type */ String, /* page */ Double) => Unit
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onPageChanged")(js.Any.fromFunction4(value))
        ret
    }
    @scala.inline
    def withoutOnPageChanged: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onPageChanged")(js.undefined)
        ret
    }
    @scala.inline
    def withOnPageClicked(
      value: (/* event */ js.Any, /* originalEvent */ js.Any, /* type */ String, /* page */ Double) => Unit
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onPageClicked")(js.Any.fromFunction4(value))
        ret
    }
    @scala.inline
    def withoutOnPageClicked: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onPageClicked")(js.undefined)
        ret
    }
    @scala.inline
    def withPageUrl(value: (/* type */ String, /* page */ Double, /* current */ Double) => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pageUrl")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withoutPageUrl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pageUrl")(js.undefined)
        ret
    }
    @scala.inline
    def withShouldShowPage(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shouldShowPage")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShouldShowPage: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shouldShowPage")(js.undefined)
        ret
    }
    @scala.inline
    def withSize(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("size")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("size")(js.undefined)
        ret
    }
    @scala.inline
    def withTooltipTitles(value: (/* type */ String, /* page */ Double, /* current */ Double) => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tooltipTitles")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withoutTooltipTitles: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tooltipTitles")(js.undefined)
        ret
    }
    @scala.inline
    def withTotalPages(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("totalPages")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTotalPages: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("totalPages")(js.undefined)
        ret
    }
    @scala.inline
    def withUseBootstrapTooltip(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("useBootstrapTooltip")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUseBootstrapTooltip: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("useBootstrapTooltip")(js.undefined)
        ret
    }
  }
  
}

