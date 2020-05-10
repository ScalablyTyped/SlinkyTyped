package typingsSlinky.openfin.applicationOptionMod

import typingsSlinky.openfin.downloadPreloadMod.DownloadPreloadOption
import typingsSlinky.openfin.windowOptionMod.Accelerator
import typingsSlinky.openfin.windowOptionMod.Api
import typingsSlinky.openfin.windowOptionMod.ContentNavigation
import typingsSlinky.openfin.windowOptionMod.CornerRounding
import typingsSlinky.openfin.windowOptionMod.CustomRequestHeaders
import typingsSlinky.openfin.windowOptionMod.ResizeRegion
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Pick<openfin.openfin/_v2/api/window/windowOption.WindowOption, 'accelerator' | 'alwaysOnTop' | 'api' | 'aspectRatio' | 'autoShow' | 'backgroundColor' | 'contentNavigation' | 'contextMenu' | 'cornerRounding' | 'customData' | 'customRequestHeaders' | 'defaultCentered' | 'defaultHeight' | 'defaultLeft' | 'defaultTop' | 'defaultWidth' | 'frame' | 'hideOnClose' | 'icon' | 'maxHeight' | 'maximizable' | 'maxWidth' | 'minHeight' | 'minimizable' | 'minWidth' | 'opacity' | 'preloadScripts' | 'resizable' | 'resizeRegion' | 'saveWindowState' | 'shadow' | 'showTaskbarIcon' | 'smallWindow' | 'state' | 'taskbarIconGroup' | 'waitForPageLoad'> */
@js.native
trait LegacyWinOptionsInAppOptions extends js.Object {
  var accelerator: js.UndefOr[Accelerator] = js.native
  var alwaysOnTop: js.UndefOr[Boolean] = js.native
  var api: js.UndefOr[Api] = js.native
  var aspectRatio: js.UndefOr[Double] = js.native
  var autoShow: js.UndefOr[Boolean] = js.native
  var backgroundColor: js.UndefOr[String] = js.native
  var contentNavigation: js.UndefOr[ContentNavigation] = js.native
  var contextMenu: js.UndefOr[Boolean] = js.native
  var cornerRounding: js.UndefOr[CornerRounding] = js.native
  var customData: js.UndefOr[js.Any] = js.native
  var customRequestHeaders: js.UndefOr[js.Array[CustomRequestHeaders]] = js.native
  var defaultCentered: js.UndefOr[Boolean] = js.native
  var defaultHeight: js.UndefOr[Double] = js.native
  var defaultLeft: js.UndefOr[Double] = js.native
  var defaultTop: js.UndefOr[Double] = js.native
  var defaultWidth: js.UndefOr[Double] = js.native
  var frame: js.UndefOr[Boolean] = js.native
  var hideOnClose: js.UndefOr[Boolean] = js.native
  var icon: js.UndefOr[String] = js.native
  var maxHeight: js.UndefOr[Double] = js.native
  var maxWidth: js.UndefOr[Double] = js.native
  var maximizable: js.UndefOr[Boolean] = js.native
  var minHeight: js.UndefOr[Double] = js.native
  var minWidth: js.UndefOr[Double] = js.native
  var minimizable: js.UndefOr[Boolean] = js.native
  var opacity: js.UndefOr[Double] = js.native
  var preloadScripts: js.UndefOr[js.Array[DownloadPreloadOption]] = js.native
  var resizable: js.UndefOr[Boolean] = js.native
  var resizeRegion: js.UndefOr[ResizeRegion] = js.native
  var saveWindowState: js.UndefOr[Boolean] = js.native
  var shadow: js.UndefOr[Boolean] = js.native
  var showTaskbarIcon: js.UndefOr[Boolean] = js.native
  var smallWindow: js.UndefOr[Boolean] = js.native
  var state: js.UndefOr[String] = js.native
  var taskbarIconGroup: js.UndefOr[String] = js.native
  var waitForPageLoad: js.UndefOr[Boolean] = js.native
}

object LegacyWinOptionsInAppOptions {
  @scala.inline
  def apply(): LegacyWinOptionsInAppOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LegacyWinOptionsInAppOptions]
  }
  @scala.inline
  implicit class LegacyWinOptionsInAppOptionsOps[Self <: LegacyWinOptionsInAppOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAccelerator(value: Accelerator): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("accelerator")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAccelerator: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("accelerator")(js.undefined)
        ret
    }
    @scala.inline
    def withAlwaysOnTop(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("alwaysOnTop")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAlwaysOnTop: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("alwaysOnTop")(js.undefined)
        ret
    }
    @scala.inline
    def withApi(value: Api): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("api")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutApi: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("api")(js.undefined)
        ret
    }
    @scala.inline
    def withAspectRatio(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("aspectRatio")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAspectRatio: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("aspectRatio")(js.undefined)
        ret
    }
    @scala.inline
    def withAutoShow(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoShow")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAutoShow: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoShow")(js.undefined)
        ret
    }
    @scala.inline
    def withBackgroundColor(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("backgroundColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBackgroundColor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("backgroundColor")(js.undefined)
        ret
    }
    @scala.inline
    def withContentNavigation(value: ContentNavigation): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contentNavigation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutContentNavigation: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contentNavigation")(js.undefined)
        ret
    }
    @scala.inline
    def withContextMenu(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contextMenu")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutContextMenu: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contextMenu")(js.undefined)
        ret
    }
    @scala.inline
    def withCornerRounding(value: CornerRounding): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cornerRounding")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCornerRounding: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cornerRounding")(js.undefined)
        ret
    }
    @scala.inline
    def withCustomData(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("customData")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCustomData: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("customData")(js.undefined)
        ret
    }
    @scala.inline
    def withCustomRequestHeaders(value: js.Array[CustomRequestHeaders]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("customRequestHeaders")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCustomRequestHeaders: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("customRequestHeaders")(js.undefined)
        ret
    }
    @scala.inline
    def withDefaultCentered(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultCentered")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDefaultCentered: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultCentered")(js.undefined)
        ret
    }
    @scala.inline
    def withDefaultHeight(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultHeight")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDefaultHeight: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultHeight")(js.undefined)
        ret
    }
    @scala.inline
    def withDefaultLeft(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultLeft")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDefaultLeft: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultLeft")(js.undefined)
        ret
    }
    @scala.inline
    def withDefaultTop(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultTop")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDefaultTop: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultTop")(js.undefined)
        ret
    }
    @scala.inline
    def withDefaultWidth(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultWidth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDefaultWidth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultWidth")(js.undefined)
        ret
    }
    @scala.inline
    def withFrame(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("frame")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFrame: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("frame")(js.undefined)
        ret
    }
    @scala.inline
    def withHideOnClose(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hideOnClose")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHideOnClose: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hideOnClose")(js.undefined)
        ret
    }
    @scala.inline
    def withIcon(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("icon")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIcon: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("icon")(js.undefined)
        ret
    }
    @scala.inline
    def withMaxHeight(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxHeight")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxHeight: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxHeight")(js.undefined)
        ret
    }
    @scala.inline
    def withMaxWidth(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxWidth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxWidth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxWidth")(js.undefined)
        ret
    }
    @scala.inline
    def withMaximizable(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maximizable")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaximizable: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maximizable")(js.undefined)
        ret
    }
    @scala.inline
    def withMinHeight(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minHeight")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMinHeight: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minHeight")(js.undefined)
        ret
    }
    @scala.inline
    def withMinWidth(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minWidth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMinWidth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minWidth")(js.undefined)
        ret
    }
    @scala.inline
    def withMinimizable(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minimizable")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMinimizable: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minimizable")(js.undefined)
        ret
    }
    @scala.inline
    def withOpacity(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("opacity")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOpacity: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("opacity")(js.undefined)
        ret
    }
    @scala.inline
    def withPreloadScripts(value: js.Array[DownloadPreloadOption]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("preloadScripts")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPreloadScripts: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("preloadScripts")(js.undefined)
        ret
    }
    @scala.inline
    def withResizable(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resizable")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutResizable: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resizable")(js.undefined)
        ret
    }
    @scala.inline
    def withResizeRegion(value: ResizeRegion): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resizeRegion")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutResizeRegion: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resizeRegion")(js.undefined)
        ret
    }
    @scala.inline
    def withSaveWindowState(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("saveWindowState")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSaveWindowState: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("saveWindowState")(js.undefined)
        ret
    }
    @scala.inline
    def withShadow(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shadow")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShadow: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shadow")(js.undefined)
        ret
    }
    @scala.inline
    def withShowTaskbarIcon(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showTaskbarIcon")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShowTaskbarIcon: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showTaskbarIcon")(js.undefined)
        ret
    }
    @scala.inline
    def withSmallWindow(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("smallWindow")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSmallWindow: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("smallWindow")(js.undefined)
        ret
    }
    @scala.inline
    def withState(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("state")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutState: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("state")(js.undefined)
        ret
    }
    @scala.inline
    def withTaskbarIconGroup(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("taskbarIconGroup")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTaskbarIconGroup: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("taskbarIconGroup")(js.undefined)
        ret
    }
    @scala.inline
    def withWaitForPageLoad(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("waitForPageLoad")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWaitForPageLoad: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("waitForPageLoad")(js.undefined)
        ret
    }
  }
  
}

