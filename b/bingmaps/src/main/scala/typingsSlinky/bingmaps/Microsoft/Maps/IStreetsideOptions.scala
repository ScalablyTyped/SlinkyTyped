package typingsSlinky.bingmaps.Microsoft.Maps

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IStreetsideOptions extends js.Object {
  /** A boolean indicating if the ability to navigate between image bubbles should be disabled in streetside map mode. Default: false */
  var disablePanoramaNavigation: js.UndefOr[Boolean] = js.native
  /** The location that the streetside panorama should be looking towards. This can be used instead of a heading. */
  var locationToLookAt: js.UndefOr[Location] = js.native
  /** A callback function that is triggered after the streetside view has not loaded successfully. */
  var onErrorLoading: js.UndefOr[js.Function0[Unit]] = js.native
  /** A callback function that is triggered after the streetside view has loaded successfully. */
  var onSuccessLoading: js.UndefOr[js.Function0[Unit]] = js.native
  /**
    * Specifies how to render the overview map when in streetside mode.
    * Default: Microsoft.Maps.OverviewMapMode.expanded
    */
  var overviewMapMode: js.UndefOr[OverviewMapMode] = js.native
  /**
    * Information for a streetside panorama scene to load.
    */
  var panoramaInfo: js.UndefOr[IPanoramaInfo] = js.native
  /** The radius to search in for available streetside panoramas. */
  var panoramaLookupRadius: js.UndefOr[Double] = js.native
  /** A boolean indicating if the current address being viewed should be hidden when in streetside map mode. Default: true */
  var showCurrentAddress: js.UndefOr[Boolean] = js.native
  /** A boolean indicating if the exit button should be hidden when in streetside map mode. Default: true */
  var showExitButton: js.UndefOr[Boolean] = js.native
  /** A boolean indicating if the heading compass button is hidden when in streetside map mode. Default: true */
  var showHeadingCompass: js.UndefOr[Boolean] = js.native
  /** A boolean indicating if the link to report a problem with a streetside image is hidden when in streetside map mode. Default: true */
  var showProblemReporting: js.UndefOr[Boolean] = js.native
  /** A boolean indicating if the zoom buttons should be displayed when in streetside map mode. Default: true */
  var showZoomButtons: js.UndefOr[Boolean] = js.native
}

object IStreetsideOptions {
  @scala.inline
  def apply(): IStreetsideOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IStreetsideOptions]
  }
  @scala.inline
  implicit class IStreetsideOptionsOps[Self <: IStreetsideOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDisablePanoramaNavigation(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disablePanoramaNavigation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDisablePanoramaNavigation: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disablePanoramaNavigation")(js.undefined)
        ret
    }
    @scala.inline
    def withLocationToLookAt(value: Location): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("locationToLookAt")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLocationToLookAt: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("locationToLookAt")(js.undefined)
        ret
    }
    @scala.inline
    def withOnErrorLoading(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onErrorLoading")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutOnErrorLoading: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onErrorLoading")(js.undefined)
        ret
    }
    @scala.inline
    def withOnSuccessLoading(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onSuccessLoading")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutOnSuccessLoading: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onSuccessLoading")(js.undefined)
        ret
    }
    @scala.inline
    def withOverviewMapMode(value: OverviewMapMode): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("overviewMapMode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOverviewMapMode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("overviewMapMode")(js.undefined)
        ret
    }
    @scala.inline
    def withPanoramaInfo(value: IPanoramaInfo): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("panoramaInfo")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPanoramaInfo: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("panoramaInfo")(js.undefined)
        ret
    }
    @scala.inline
    def withPanoramaLookupRadius(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("panoramaLookupRadius")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPanoramaLookupRadius: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("panoramaLookupRadius")(js.undefined)
        ret
    }
    @scala.inline
    def withShowCurrentAddress(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showCurrentAddress")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShowCurrentAddress: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showCurrentAddress")(js.undefined)
        ret
    }
    @scala.inline
    def withShowExitButton(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showExitButton")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShowExitButton: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showExitButton")(js.undefined)
        ret
    }
    @scala.inline
    def withShowHeadingCompass(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showHeadingCompass")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShowHeadingCompass: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showHeadingCompass")(js.undefined)
        ret
    }
    @scala.inline
    def withShowProblemReporting(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showProblemReporting")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShowProblemReporting: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showProblemReporting")(js.undefined)
        ret
    }
    @scala.inline
    def withShowZoomButtons(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showZoomButtons")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShowZoomButtons: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showZoomButtons")(js.undefined)
        ret
    }
  }
  
}

