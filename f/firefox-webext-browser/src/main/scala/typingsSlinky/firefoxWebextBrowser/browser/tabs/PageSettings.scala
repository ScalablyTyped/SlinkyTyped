package typingsSlinky.firefoxWebextBrowser.browser.tabs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** The page settings including: orientation, scale, background, margins, headers, footers. */
@js.native
trait PageSettings extends js.Object {
  /** The spacing between the bottom of the footers and the bottom edge of the paper (inches). Default: 0. */
  var edgeBottom: js.UndefOr[Double] = js.native
  /** The spacing between the left header/footer and the left edge of the paper (inches). Default: 0. */
  var edgeLeft: js.UndefOr[Double] = js.native
  /** The spacing between the right header/footer and the right edge of the paper (inches). Default: 0. */
  var edgeRight: js.UndefOr[Double] = js.native
  /** The spacing between the top of the headers and the top edge of the paper (inches). Default: 0 */
  var edgeTop: js.UndefOr[Double] = js.native
  /** The text for the page's center footer. Default: ''. */
  var footerCenter: js.UndefOr[String] = js.native
  /** The text for the page's left footer. Default: '&PT'. */
  var footerLeft: js.UndefOr[String] = js.native
  /** The text for the page's right footer. Default: '&D'. */
  var footerRight: js.UndefOr[String] = js.native
  /** The text for the page's center header. Default: ''. */
  var headerCenter: js.UndefOr[String] = js.native
  /** The text for the page's left header. Default: '&T'. */
  var headerLeft: js.UndefOr[String] = js.native
  /** The text for the page's right header. Default: '&U'. */
  var headerRight: js.UndefOr[String] = js.native
  /** The margin between the page content and the bottom edge of the paper (inches). Default: 0.5. */
  var marginBottom: js.UndefOr[Double] = js.native
  /** The margin between the page content and the left edge of the paper (inches). Default: 0.5. */
  var marginLeft: js.UndefOr[Double] = js.native
  /** The margin between the page content and the right edge of the paper (inches). Default: 0.5. */
  var marginRight: js.UndefOr[Double] = js.native
  /** The margin between the page content and the top edge of the paper (inches). Default: 0.5. */
  var marginTop: js.UndefOr[Double] = js.native
  /** The page content orientation: 0 = portrait, 1 = landscape. Default: 0. */
  var orientation: js.UndefOr[Double] = js.native
  /** The paper height in paper size units. Default: 11.0. */
  var paperHeight: js.UndefOr[Double] = js.native
  /** The page size unit: 0 = inches, 1 = millimeters. Default: 0. */
  var paperSizeUnit: js.UndefOr[Double] = js.native
  /** The paper width in paper size units. Default: 8.5. */
  var paperWidth: js.UndefOr[Double] = js.native
  /** The page content scaling factor: 1.0 = 100% = normal size. Default: 1.0. */
  var scaling: js.UndefOr[Double] = js.native
  /** Whether the page background colors should be shown. Default: false. */
  var showBackgroundColors: js.UndefOr[Boolean] = js.native
  /** Whether the page background images should be shown. Default: false. */
  var showBackgroundImages: js.UndefOr[Boolean] = js.native
  /** Whether the page content should shrink to fit the page width (overrides scaling). Default: true. */
  var shrinkToFit: js.UndefOr[Boolean] = js.native
}

object PageSettings {
  @scala.inline
  def apply(): PageSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PageSettings]
  }
  @scala.inline
  implicit class PageSettingsOps[Self <: PageSettings] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEdgeBottom(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("edgeBottom")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEdgeBottom: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("edgeBottom")(js.undefined)
        ret
    }
    @scala.inline
    def withEdgeLeft(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("edgeLeft")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEdgeLeft: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("edgeLeft")(js.undefined)
        ret
    }
    @scala.inline
    def withEdgeRight(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("edgeRight")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEdgeRight: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("edgeRight")(js.undefined)
        ret
    }
    @scala.inline
    def withEdgeTop(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("edgeTop")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEdgeTop: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("edgeTop")(js.undefined)
        ret
    }
    @scala.inline
    def withFooterCenter(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("footerCenter")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFooterCenter: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("footerCenter")(js.undefined)
        ret
    }
    @scala.inline
    def withFooterLeft(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("footerLeft")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFooterLeft: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("footerLeft")(js.undefined)
        ret
    }
    @scala.inline
    def withFooterRight(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("footerRight")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFooterRight: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("footerRight")(js.undefined)
        ret
    }
    @scala.inline
    def withHeaderCenter(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("headerCenter")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHeaderCenter: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("headerCenter")(js.undefined)
        ret
    }
    @scala.inline
    def withHeaderLeft(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("headerLeft")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHeaderLeft: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("headerLeft")(js.undefined)
        ret
    }
    @scala.inline
    def withHeaderRight(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("headerRight")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHeaderRight: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("headerRight")(js.undefined)
        ret
    }
    @scala.inline
    def withMarginBottom(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("marginBottom")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMarginBottom: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("marginBottom")(js.undefined)
        ret
    }
    @scala.inline
    def withMarginLeft(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("marginLeft")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMarginLeft: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("marginLeft")(js.undefined)
        ret
    }
    @scala.inline
    def withMarginRight(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("marginRight")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMarginRight: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("marginRight")(js.undefined)
        ret
    }
    @scala.inline
    def withMarginTop(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("marginTop")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMarginTop: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("marginTop")(js.undefined)
        ret
    }
    @scala.inline
    def withOrientation(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("orientation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOrientation: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("orientation")(js.undefined)
        ret
    }
    @scala.inline
    def withPaperHeight(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("paperHeight")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPaperHeight: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("paperHeight")(js.undefined)
        ret
    }
    @scala.inline
    def withPaperSizeUnit(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("paperSizeUnit")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPaperSizeUnit: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("paperSizeUnit")(js.undefined)
        ret
    }
    @scala.inline
    def withPaperWidth(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("paperWidth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPaperWidth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("paperWidth")(js.undefined)
        ret
    }
    @scala.inline
    def withScaling(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scaling")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutScaling: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scaling")(js.undefined)
        ret
    }
    @scala.inline
    def withShowBackgroundColors(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showBackgroundColors")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShowBackgroundColors: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showBackgroundColors")(js.undefined)
        ret
    }
    @scala.inline
    def withShowBackgroundImages(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showBackgroundImages")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShowBackgroundImages: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showBackgroundImages")(js.undefined)
        ret
    }
    @scala.inline
    def withShrinkToFit(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shrinkToFit")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShrinkToFit: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shrinkToFit")(js.undefined)
        ret
    }
  }
  
}

