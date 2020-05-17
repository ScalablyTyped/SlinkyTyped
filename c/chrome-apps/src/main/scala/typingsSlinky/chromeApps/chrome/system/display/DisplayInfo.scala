package typingsSlinky.chromeApps.chrome.system.display

import typingsSlinky.chromeApps.anon.ManufacturerId
import typingsSlinky.chromeApps.chrome.double
import typingsSlinky.chromeApps.chrome.integer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Information about display properties. */
@js.native
trait DisplayInfo extends js.Object {
  /** A list of zoom factor values that can be set for the display. */
  var availableDisplayZoomFactors: js.Array[double] = js.native
  /** The display's logical bounds. */
  var bounds: Bounds = js.native
  /**
    * The ratio between the display's current and default zoom.
    * For example, value 1 is equivalent to 100% zoom, and value 1.5 is equivalent to 150% zoom.
    * */
  var displayZoomFactor: double = js.native
  /** The number of pixels per inch along the x-axis. */
  var dpiX: integer = js.native
  /** The number of pixels per inch along the y-axis. */
  var dpiY: integer = js.native
  /**
    * @requires(CrOS Kiosk app) Only available in Chrome OS Kiosk apps
    */
  var edid: js.UndefOr[ManufacturerId] = js.native
  /** True if this display has a touch input device associated with it. */
  var hasTouchSupport: Boolean = js.native
  /** The unique identifier of the display. */
  var id: String = js.native
  /** True if this display is enabled. */
  var isEnabled: Boolean = js.native
  /** True if this is an internal display. */
  var isInternal: Boolean = js.native
  /** True if this is the primary display. */
  var isPrimary: Boolean = js.native
  /**
    * @requires(CrOS) Only available on Chrome OS.
    * Identifiers of the displays to which the source display is being mirrored.
    * Empty if no displays are being mirrored. This will be set to the same value
    * for all displays.
    * ❗ This must not include *mirroringSourceId*. ❗
    */
  var mirroringDestinationIds: js.Array[String] = js.native
  /**
    * @requires(CrOS) Only working properly on Chrome OS.
    * Identifier of the display that is being mirrored on the display unit.
    * If mirroring is not in progress, set to an empty string
    * Currently exposed only on ChromeOS.
    * Will be empty string on other platforms.
    */
  var mirroringSourceId: String = js.native
  /**
    * @requires(CrOS) Only available on Chrome OS.
    * The list of available display modes.
    * The current mode will have isSelected=true.
    * Only available on Chrome OS.
    * Will be set to an empty array on other platforms.
    */
  var modes: js.Array[DisplayMode] = js.native
  /** The user-friendly name (e.g. 'HP LCD monitor'). */
  var name: String = js.native
  /** The display's insets within its screen's bounds. Currently exposed only on ChromeOS. Will be set to empty insets on other platforms. */
  var overscan: Insets = js.native
  /** The display's clockwise rotation in degrees relative to the vertical position. Currently exposed only on ChromeOS. Will be set to 0 on other platforms. */
  var rotation: integer = js.native
  /** The usable work area of the display within the display bounds. The work area excludes areas of the display reserved for OS, for example taskbar and launcher. */
  var workArea: Bounds = js.native
}

object DisplayInfo {
  @scala.inline
  def apply(
    availableDisplayZoomFactors: js.Array[double],
    bounds: Bounds,
    displayZoomFactor: double,
    dpiX: integer,
    dpiY: integer,
    hasTouchSupport: Boolean,
    id: String,
    isEnabled: Boolean,
    isInternal: Boolean,
    isPrimary: Boolean,
    mirroringDestinationIds: js.Array[String],
    mirroringSourceId: String,
    modes: js.Array[DisplayMode],
    name: String,
    overscan: Insets,
    rotation: integer,
    workArea: Bounds
  ): DisplayInfo = {
    val __obj = js.Dynamic.literal(availableDisplayZoomFactors = availableDisplayZoomFactors.asInstanceOf[js.Any], bounds = bounds.asInstanceOf[js.Any], displayZoomFactor = displayZoomFactor.asInstanceOf[js.Any], dpiX = dpiX.asInstanceOf[js.Any], dpiY = dpiY.asInstanceOf[js.Any], hasTouchSupport = hasTouchSupport.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], isEnabled = isEnabled.asInstanceOf[js.Any], isInternal = isInternal.asInstanceOf[js.Any], isPrimary = isPrimary.asInstanceOf[js.Any], mirroringDestinationIds = mirroringDestinationIds.asInstanceOf[js.Any], mirroringSourceId = mirroringSourceId.asInstanceOf[js.Any], modes = modes.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], overscan = overscan.asInstanceOf[js.Any], rotation = rotation.asInstanceOf[js.Any], workArea = workArea.asInstanceOf[js.Any])
    __obj.asInstanceOf[DisplayInfo]
  }
  @scala.inline
  implicit class DisplayInfoOps[Self <: DisplayInfo] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAvailableDisplayZoomFactors(value: js.Array[double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("availableDisplayZoomFactors")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBounds(value: Bounds): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bounds")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDisplayZoomFactor(value: double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("displayZoomFactor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDpiX(value: integer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dpiX")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDpiY(value: integer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dpiY")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHasTouchSupport(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hasTouchSupport")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsEnabled(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isEnabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsInternal(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isInternal")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsPrimary(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isPrimary")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMirroringDestinationIds(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mirroringDestinationIds")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMirroringSourceId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mirroringSourceId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withModes(value: js.Array[DisplayMode]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("modes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOverscan(value: Insets): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("overscan")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRotation(value: integer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rotation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withWorkArea(value: Bounds): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("workArea")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEdid(value: ManufacturerId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("edid")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEdid: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("edid")(js.undefined)
        ret
    }
  }
  
}

