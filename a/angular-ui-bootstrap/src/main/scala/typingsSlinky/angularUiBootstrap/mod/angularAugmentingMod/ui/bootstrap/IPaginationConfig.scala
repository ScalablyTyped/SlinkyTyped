package typingsSlinky.angularUiBootstrap.mod.angularAugmentingMod.ui.bootstrap

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IPaginationConfig extends js.Object {
  /**
    * Whether to always display the first and last page numbers. If max-size is smaller than the number of pages, then the first and last page numbers are still shown with ellipses in-between as necessary. NOTE: max-size refers to the center of the range. This option may add up to 2 more numbers on each side of the displayed range for the end value and what would be an ellipsis but is replaced by a number because it is sequential.
    *
    * @default false
    */
  var boundaryLinkNumbers: js.UndefOr[Boolean] = js.native
  /**
    * Whether to display First / Last buttons.
    *
    * @default false
    */
  var boundaryLinks: js.UndefOr[Boolean] = js.native
  /**
    * Whether to display Previous / Next buttons.
    *
    * @default true
    */
  var directionLinks: js.UndefOr[Boolean] = js.native
  /**
    * Text for First button.
    *
    * @default 'First'
    */
  var firstText: js.UndefOr[String] = js.native
  /**
    * Also displays ellipses when rotate is true and max-size is smaller than the number of pages.
    *
    * @default  false
    */
  var forceEllipses: js.UndefOr[Boolean] = js.native
  /**
    * Maximum number of items per page. A value less than one indicates all items on one page.
    *
    * @default 10
    */
  var itemsPerPage: js.UndefOr[Double] = js.native
  /**
    * Text for Last button.
    *
    * @default 'Last'
    */
  var lastText: js.UndefOr[String] = js.native
  /**
    * Limit number for pagination size.
    *
    * @default: null
    */
  var maxSize: js.UndefOr[Double] = js.native
  /**
    * Text for Next button.
    *
    * @default 'Next'
    */
  var nextText: js.UndefOr[String] = js.native
  /**
    * An optional expression assigned the total number of pages to display.
    *
    * @default angular.noop
    */
  var numPages: js.UndefOr[Double] = js.native
  /**
    * Text for Previous button.
    *
    * @default 'Previous'
    */
  var previousText: js.UndefOr[String] = js.native
  /**
    * Whether to keep current page in the middle of the visible ones.
    *
    * @default true
    */
  var rotate: js.UndefOr[Boolean] = js.native
  /**
    * Override the template for the component with a custom provided template.
    *
    * @default  'template/pagination/pagination.html'
    */
  var templateUrl: js.UndefOr[String] = js.native
  /**
    * Total number of items in all pages.
    */
  var totalItems: js.UndefOr[Double] = js.native
}

object IPaginationConfig {
  @scala.inline
  def apply(): IPaginationConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IPaginationConfig]
  }
  @scala.inline
  implicit class IPaginationConfigOps[Self <: IPaginationConfig] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBoundaryLinkNumbers(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("boundaryLinkNumbers")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBoundaryLinkNumbers: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("boundaryLinkNumbers")(js.undefined)
        ret
    }
    @scala.inline
    def withBoundaryLinks(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("boundaryLinks")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBoundaryLinks: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("boundaryLinks")(js.undefined)
        ret
    }
    @scala.inline
    def withDirectionLinks(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("directionLinks")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDirectionLinks: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("directionLinks")(js.undefined)
        ret
    }
    @scala.inline
    def withFirstText(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("firstText")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFirstText: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("firstText")(js.undefined)
        ret
    }
    @scala.inline
    def withForceEllipses(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("forceEllipses")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutForceEllipses: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("forceEllipses")(js.undefined)
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
    def withLastText(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lastText")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLastText: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lastText")(js.undefined)
        ret
    }
    @scala.inline
    def withMaxSize(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxSize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxSize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxSize")(js.undefined)
        ret
    }
    @scala.inline
    def withNextText(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nextText")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNextText: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nextText")(js.undefined)
        ret
    }
    @scala.inline
    def withNumPages(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("numPages")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNumPages: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("numPages")(js.undefined)
        ret
    }
    @scala.inline
    def withPreviousText(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("previousText")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPreviousText: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("previousText")(js.undefined)
        ret
    }
    @scala.inline
    def withRotate(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rotate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRotate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rotate")(js.undefined)
        ret
    }
    @scala.inline
    def withTemplateUrl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("templateUrl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTemplateUrl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("templateUrl")(js.undefined)
        ret
    }
    @scala.inline
    def withTotalItems(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("totalItems")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTotalItems: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("totalItems")(js.undefined)
        ret
    }
  }
  
}

