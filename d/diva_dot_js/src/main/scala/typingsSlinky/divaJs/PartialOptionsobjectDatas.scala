package typingsSlinky.divaJs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<diva.js.diva.js/interfaces.Options> & {  objectData  :string | object} */
@js.native
trait PartialOptionsobjectDatas extends js.Object {
  var acceptHeader: js.UndefOr[String] = js.native
  var adaptivePadding: js.UndefOr[Double] = js.native
  var arrowScrollAmount: js.UndefOr[Double] = js.native
  var blockMobileMove: js.UndefOr[Boolean] = js.native
  var enableAutoTitle: js.UndefOr[Boolean] = js.native
  var enableFilename: js.UndefOr[Boolean] = js.native
  var enableFullscreen: js.UndefOr[Boolean] = js.native
  var enableGotoPage: js.UndefOr[Boolean] = js.native
  var enableGotoSuggestions: js.UndefOr[Boolean] = js.native
  var enableGridControls: js.UndefOr[String] = js.native
  var enableGridIcon: js.UndefOr[Boolean] = js.native
  var enableImageTitles: js.UndefOr[Boolean] = js.native
  var enableIndexAsLabel: js.UndefOr[Boolean] = js.native
  var enableKeyScroll: js.UndefOr[Boolean] = js.native
  var enableLinkIcon: js.UndefOr[Boolean] = js.native
  var enableNonPagedVisibilityIcon: js.UndefOr[Boolean] = js.native
  var enableSpaceScroll: js.UndefOr[Boolean] = js.native
  var enableToolbar: js.UndefOr[Boolean] = js.native
  var enableZoomControls: js.UndefOr[String] = js.native
  var fillParentHeight: js.UndefOr[Boolean] = js.native
  var fixedHeightGrid: js.UndefOr[Boolean] = js.native
  var fixedPadding: js.UndefOr[Double] = js.native
  var goDirectlyTo: js.UndefOr[Double] = js.native
  var hashParamSuffix: js.UndefOr[String] = js.native
  var inBookLayout: js.UndefOr[Boolean] = js.native
  var inFullscreen: js.UndefOr[Boolean] = js.native
  var inGrid: js.UndefOr[Boolean] = js.native
  var maxPagesPerRow: js.UndefOr[Double] = js.native
  var maxZoomLevel: js.UndefOr[Double] = js.native
  var minPagesPerRow: js.UndefOr[Double] = js.native
  var minZoomLevel: js.UndefOr[Double] = js.native
  var objectData: js.UndefOr[(js.Object | String) with (String | js.Object)] = js.native
  var onGotoSubmit: js.UndefOr[js.Function0[_]] = js.native
  var pageAliasFunction: js.UndefOr[js.Function0[_]] = js.native
  var pageAliases: js.UndefOr[js.Object] = js.native
  var pageLoadTimeout: js.UndefOr[Double] = js.native
  var pagesPerRow: js.UndefOr[Double] = js.native
  var showNonPagedPages: js.UndefOr[Boolean] = js.native
  var throbberTimeout: js.UndefOr[Double] = js.native
  var tileHeight: js.UndefOr[Double] = js.native
  var tileWidth: js.UndefOr[Double] = js.native
  var toolbarParentObject: js.UndefOr[js.Object] = js.native
  var verticallyOriented: js.UndefOr[Boolean] = js.native
  var viewportMargin: js.UndefOr[Double] = js.native
  var zoomLevel: js.UndefOr[Double] = js.native
}

object PartialOptionsobjectDatas {
  @scala.inline
  def apply(): PartialOptionsobjectDatas = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialOptionsobjectDatas]
  }
  @scala.inline
  implicit class PartialOptionsobjectDatasOps[Self <: PartialOptionsobjectDatas] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAcceptHeader(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("acceptHeader")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAcceptHeader: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("acceptHeader")(js.undefined)
        ret
    }
    @scala.inline
    def withAdaptivePadding(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("adaptivePadding")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAdaptivePadding: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("adaptivePadding")(js.undefined)
        ret
    }
    @scala.inline
    def withArrowScrollAmount(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("arrowScrollAmount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutArrowScrollAmount: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("arrowScrollAmount")(js.undefined)
        ret
    }
    @scala.inline
    def withBlockMobileMove(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("blockMobileMove")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBlockMobileMove: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("blockMobileMove")(js.undefined)
        ret
    }
    @scala.inline
    def withEnableAutoTitle(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableAutoTitle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnableAutoTitle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableAutoTitle")(js.undefined)
        ret
    }
    @scala.inline
    def withEnableFilename(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableFilename")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnableFilename: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableFilename")(js.undefined)
        ret
    }
    @scala.inline
    def withEnableFullscreen(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableFullscreen")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnableFullscreen: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableFullscreen")(js.undefined)
        ret
    }
    @scala.inline
    def withEnableGotoPage(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableGotoPage")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnableGotoPage: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableGotoPage")(js.undefined)
        ret
    }
    @scala.inline
    def withEnableGotoSuggestions(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableGotoSuggestions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnableGotoSuggestions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableGotoSuggestions")(js.undefined)
        ret
    }
    @scala.inline
    def withEnableGridControls(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableGridControls")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnableGridControls: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableGridControls")(js.undefined)
        ret
    }
    @scala.inline
    def withEnableGridIcon(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableGridIcon")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnableGridIcon: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableGridIcon")(js.undefined)
        ret
    }
    @scala.inline
    def withEnableImageTitles(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableImageTitles")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnableImageTitles: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableImageTitles")(js.undefined)
        ret
    }
    @scala.inline
    def withEnableIndexAsLabel(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableIndexAsLabel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnableIndexAsLabel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableIndexAsLabel")(js.undefined)
        ret
    }
    @scala.inline
    def withEnableKeyScroll(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableKeyScroll")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnableKeyScroll: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableKeyScroll")(js.undefined)
        ret
    }
    @scala.inline
    def withEnableLinkIcon(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableLinkIcon")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnableLinkIcon: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableLinkIcon")(js.undefined)
        ret
    }
    @scala.inline
    def withEnableNonPagedVisibilityIcon(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableNonPagedVisibilityIcon")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnableNonPagedVisibilityIcon: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableNonPagedVisibilityIcon")(js.undefined)
        ret
    }
    @scala.inline
    def withEnableSpaceScroll(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableSpaceScroll")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnableSpaceScroll: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableSpaceScroll")(js.undefined)
        ret
    }
    @scala.inline
    def withEnableToolbar(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableToolbar")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnableToolbar: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableToolbar")(js.undefined)
        ret
    }
    @scala.inline
    def withEnableZoomControls(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableZoomControls")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnableZoomControls: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableZoomControls")(js.undefined)
        ret
    }
    @scala.inline
    def withFillParentHeight(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fillParentHeight")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFillParentHeight: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fillParentHeight")(js.undefined)
        ret
    }
    @scala.inline
    def withFixedHeightGrid(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fixedHeightGrid")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFixedHeightGrid: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fixedHeightGrid")(js.undefined)
        ret
    }
    @scala.inline
    def withFixedPadding(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fixedPadding")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFixedPadding: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fixedPadding")(js.undefined)
        ret
    }
    @scala.inline
    def withGoDirectlyTo(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("goDirectlyTo")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGoDirectlyTo: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("goDirectlyTo")(js.undefined)
        ret
    }
    @scala.inline
    def withHashParamSuffix(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hashParamSuffix")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHashParamSuffix: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hashParamSuffix")(js.undefined)
        ret
    }
    @scala.inline
    def withInBookLayout(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inBookLayout")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInBookLayout: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inBookLayout")(js.undefined)
        ret
    }
    @scala.inline
    def withInFullscreen(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inFullscreen")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInFullscreen: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inFullscreen")(js.undefined)
        ret
    }
    @scala.inline
    def withInGrid(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inGrid")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInGrid: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inGrid")(js.undefined)
        ret
    }
    @scala.inline
    def withMaxPagesPerRow(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxPagesPerRow")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxPagesPerRow: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxPagesPerRow")(js.undefined)
        ret
    }
    @scala.inline
    def withMaxZoomLevel(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxZoomLevel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxZoomLevel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxZoomLevel")(js.undefined)
        ret
    }
    @scala.inline
    def withMinPagesPerRow(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minPagesPerRow")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMinPagesPerRow: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minPagesPerRow")(js.undefined)
        ret
    }
    @scala.inline
    def withMinZoomLevel(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minZoomLevel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMinZoomLevel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minZoomLevel")(js.undefined)
        ret
    }
    @scala.inline
    def withObjectData(value: (js.Object | String) with (String | js.Object)): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("objectData")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutObjectData: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("objectData")(js.undefined)
        ret
    }
    @scala.inline
    def withOnGotoSubmit(value: () => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onGotoSubmit")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutOnGotoSubmit: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onGotoSubmit")(js.undefined)
        ret
    }
    @scala.inline
    def withPageAliasFunction(value: () => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pageAliasFunction")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutPageAliasFunction: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pageAliasFunction")(js.undefined)
        ret
    }
    @scala.inline
    def withPageAliases(value: js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pageAliases")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPageAliases: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pageAliases")(js.undefined)
        ret
    }
    @scala.inline
    def withPageLoadTimeout(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pageLoadTimeout")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPageLoadTimeout: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pageLoadTimeout")(js.undefined)
        ret
    }
    @scala.inline
    def withPagesPerRow(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pagesPerRow")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPagesPerRow: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pagesPerRow")(js.undefined)
        ret
    }
    @scala.inline
    def withShowNonPagedPages(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showNonPagedPages")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShowNonPagedPages: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showNonPagedPages")(js.undefined)
        ret
    }
    @scala.inline
    def withThrobberTimeout(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("throbberTimeout")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutThrobberTimeout: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("throbberTimeout")(js.undefined)
        ret
    }
    @scala.inline
    def withTileHeight(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tileHeight")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTileHeight: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tileHeight")(js.undefined)
        ret
    }
    @scala.inline
    def withTileWidth(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tileWidth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTileWidth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tileWidth")(js.undefined)
        ret
    }
    @scala.inline
    def withToolbarParentObject(value: js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("toolbarParentObject")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutToolbarParentObject: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("toolbarParentObject")(js.undefined)
        ret
    }
    @scala.inline
    def withVerticallyOriented(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("verticallyOriented")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVerticallyOriented: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("verticallyOriented")(js.undefined)
        ret
    }
    @scala.inline
    def withViewportMargin(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("viewportMargin")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutViewportMargin: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("viewportMargin")(js.undefined)
        ret
    }
    @scala.inline
    def withZoomLevel(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("zoomLevel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutZoomLevel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("zoomLevel")(js.undefined)
        ret
    }
  }
  
}

