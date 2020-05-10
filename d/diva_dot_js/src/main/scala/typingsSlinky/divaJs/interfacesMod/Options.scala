package typingsSlinky.divaJs.interfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Options extends js.Object {
  var acceptHeader: String = js.native
  var adaptivePadding: Double = js.native
  var arrowScrollAmount: Double = js.native
  var blockMobileMove: Boolean = js.native
  var enableAutoTitle: Boolean = js.native
  var enableFilename: Boolean = js.native
  var enableFullscreen: Boolean = js.native
  var enableGotoPage: Boolean = js.native
  var enableGotoSuggestions: Boolean = js.native
  var enableGridControls: String = js.native
  var enableGridIcon: Boolean = js.native
  var enableImageTitles: Boolean = js.native
  var enableIndexAsLabel: Boolean = js.native
  var enableKeyScroll: Boolean = js.native
  var enableLinkIcon: Boolean = js.native
  var enableNonPagedVisibilityIcon: Boolean = js.native
  var enableSpaceScroll: Boolean = js.native
  var enableToolbar: Boolean = js.native
  var enableZoomControls: String = js.native
  var fillParentHeight: Boolean = js.native
  var fixedHeightGrid: Boolean = js.native
  var fixedPadding: Double = js.native
  var goDirectlyTo: Double = js.native
  var hashParamSuffix: String = js.native
  var inBookLayout: Boolean = js.native
  var inFullscreen: Boolean = js.native
  var inGrid: Boolean = js.native
  var maxPagesPerRow: Double = js.native
  var maxZoomLevel: Double = js.native
  var minPagesPerRow: Double = js.native
  var minZoomLevel: Double = js.native
  var objectData: js.Object | String = js.native
  var pageAliases: js.Object = js.native
  var pageLoadTimeout: Double = js.native
  var pagesPerRow: Double = js.native
  var showNonPagedPages: Boolean = js.native
  var throbberTimeout: Double = js.native
  var tileHeight: Double = js.native
  var tileWidth: Double = js.native
  var toolbarParentObject: js.Object = js.native
  var verticallyOriented: Boolean = js.native
  var viewportMargin: Double = js.native
  var zoomLevel: Double = js.native
  def onGotoSubmit(): js.Any = js.native
  def pageAliasFunction(): js.Any = js.native
}

object Options {
  @scala.inline
  def apply(
    acceptHeader: String,
    adaptivePadding: Double,
    arrowScrollAmount: Double,
    blockMobileMove: Boolean,
    enableAutoTitle: Boolean,
    enableFilename: Boolean,
    enableFullscreen: Boolean,
    enableGotoPage: Boolean,
    enableGotoSuggestions: Boolean,
    enableGridControls: String,
    enableGridIcon: Boolean,
    enableImageTitles: Boolean,
    enableIndexAsLabel: Boolean,
    enableKeyScroll: Boolean,
    enableLinkIcon: Boolean,
    enableNonPagedVisibilityIcon: Boolean,
    enableSpaceScroll: Boolean,
    enableToolbar: Boolean,
    enableZoomControls: String,
    fillParentHeight: Boolean,
    fixedHeightGrid: Boolean,
    fixedPadding: Double,
    goDirectlyTo: Double,
    hashParamSuffix: String,
    inBookLayout: Boolean,
    inFullscreen: Boolean,
    inGrid: Boolean,
    maxPagesPerRow: Double,
    maxZoomLevel: Double,
    minPagesPerRow: Double,
    minZoomLevel: Double,
    objectData: js.Object | String,
    onGotoSubmit: () => js.Any,
    pageAliasFunction: () => js.Any,
    pageAliases: js.Object,
    pageLoadTimeout: Double,
    pagesPerRow: Double,
    showNonPagedPages: Boolean,
    throbberTimeout: Double,
    tileHeight: Double,
    tileWidth: Double,
    toolbarParentObject: js.Object,
    verticallyOriented: Boolean,
    viewportMargin: Double,
    zoomLevel: Double
  ): Options = {
    val __obj = js.Dynamic.literal(acceptHeader = acceptHeader.asInstanceOf[js.Any], adaptivePadding = adaptivePadding.asInstanceOf[js.Any], arrowScrollAmount = arrowScrollAmount.asInstanceOf[js.Any], blockMobileMove = blockMobileMove.asInstanceOf[js.Any], enableAutoTitle = enableAutoTitle.asInstanceOf[js.Any], enableFilename = enableFilename.asInstanceOf[js.Any], enableFullscreen = enableFullscreen.asInstanceOf[js.Any], enableGotoPage = enableGotoPage.asInstanceOf[js.Any], enableGotoSuggestions = enableGotoSuggestions.asInstanceOf[js.Any], enableGridControls = enableGridControls.asInstanceOf[js.Any], enableGridIcon = enableGridIcon.asInstanceOf[js.Any], enableImageTitles = enableImageTitles.asInstanceOf[js.Any], enableIndexAsLabel = enableIndexAsLabel.asInstanceOf[js.Any], enableKeyScroll = enableKeyScroll.asInstanceOf[js.Any], enableLinkIcon = enableLinkIcon.asInstanceOf[js.Any], enableNonPagedVisibilityIcon = enableNonPagedVisibilityIcon.asInstanceOf[js.Any], enableSpaceScroll = enableSpaceScroll.asInstanceOf[js.Any], enableToolbar = enableToolbar.asInstanceOf[js.Any], enableZoomControls = enableZoomControls.asInstanceOf[js.Any], fillParentHeight = fillParentHeight.asInstanceOf[js.Any], fixedHeightGrid = fixedHeightGrid.asInstanceOf[js.Any], fixedPadding = fixedPadding.asInstanceOf[js.Any], goDirectlyTo = goDirectlyTo.asInstanceOf[js.Any], hashParamSuffix = hashParamSuffix.asInstanceOf[js.Any], inBookLayout = inBookLayout.asInstanceOf[js.Any], inFullscreen = inFullscreen.asInstanceOf[js.Any], inGrid = inGrid.asInstanceOf[js.Any], maxPagesPerRow = maxPagesPerRow.asInstanceOf[js.Any], maxZoomLevel = maxZoomLevel.asInstanceOf[js.Any], minPagesPerRow = minPagesPerRow.asInstanceOf[js.Any], minZoomLevel = minZoomLevel.asInstanceOf[js.Any], objectData = objectData.asInstanceOf[js.Any], onGotoSubmit = js.Any.fromFunction0(onGotoSubmit), pageAliasFunction = js.Any.fromFunction0(pageAliasFunction), pageAliases = pageAliases.asInstanceOf[js.Any], pageLoadTimeout = pageLoadTimeout.asInstanceOf[js.Any], pagesPerRow = pagesPerRow.asInstanceOf[js.Any], showNonPagedPages = showNonPagedPages.asInstanceOf[js.Any], throbberTimeout = throbberTimeout.asInstanceOf[js.Any], tileHeight = tileHeight.asInstanceOf[js.Any], tileWidth = tileWidth.asInstanceOf[js.Any], toolbarParentObject = toolbarParentObject.asInstanceOf[js.Any], verticallyOriented = verticallyOriented.asInstanceOf[js.Any], viewportMargin = viewportMargin.asInstanceOf[js.Any], zoomLevel = zoomLevel.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
  @scala.inline
  implicit class OptionsOps[Self <: Options] (val x: Self) extends AnyVal {
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
    def withAdaptivePadding(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("adaptivePadding")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withArrowScrollAmount(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("arrowScrollAmount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBlockMobileMove(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("blockMobileMove")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEnableAutoTitle(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableAutoTitle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEnableFilename(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableFilename")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEnableFullscreen(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableFullscreen")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEnableGotoPage(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableGotoPage")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEnableGotoSuggestions(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableGotoSuggestions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEnableGridControls(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableGridControls")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEnableGridIcon(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableGridIcon")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEnableImageTitles(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableImageTitles")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEnableIndexAsLabel(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableIndexAsLabel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEnableKeyScroll(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableKeyScroll")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEnableLinkIcon(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableLinkIcon")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEnableNonPagedVisibilityIcon(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableNonPagedVisibilityIcon")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEnableSpaceScroll(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableSpaceScroll")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEnableToolbar(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableToolbar")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEnableZoomControls(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableZoomControls")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFillParentHeight(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fillParentHeight")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFixedHeightGrid(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fixedHeightGrid")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFixedPadding(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fixedPadding")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGoDirectlyTo(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("goDirectlyTo")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHashParamSuffix(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hashParamSuffix")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withInBookLayout(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inBookLayout")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withInFullscreen(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inFullscreen")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withInGrid(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inGrid")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMaxPagesPerRow(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxPagesPerRow")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMaxZoomLevel(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxZoomLevel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMinPagesPerRow(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minPagesPerRow")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMinZoomLevel(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minZoomLevel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withObjectData(value: js.Object | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("objectData")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOnGotoSubmit(value: () => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onGotoSubmit")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withPageAliasFunction(value: () => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pageAliasFunction")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withPageAliases(value: js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pageAliases")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPageLoadTimeout(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pageLoadTimeout")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPagesPerRow(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pagesPerRow")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withShowNonPagedPages(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showNonPagedPages")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withThrobberTimeout(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("throbberTimeout")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTileHeight(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tileHeight")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTileWidth(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tileWidth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withToolbarParentObject(value: js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("toolbarParentObject")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withVerticallyOriented(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("verticallyOriented")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withViewportMargin(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("viewportMargin")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withZoomLevel(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("zoomLevel")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

