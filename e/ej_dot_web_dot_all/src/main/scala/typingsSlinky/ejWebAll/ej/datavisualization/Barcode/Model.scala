package typingsSlinky.ejWebAll.ej.datavisualization.Barcode

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Model extends js.Object {
  /** Specifies the height of bars in the Barcode. By modifying the barHeight, the entire barcode height can be customized. Please refer to xDimension for two dimensional barcode height
    * customization.
    */
  var barHeight: js.UndefOr[Double] = js.native
  /** Specifies the distance between the barcode and text below it.
    */
  var barcodeToTextGapHeight: js.UndefOr[Double] = js.native
  /** Specifies the dark bar color of the Barcode. One dimensional barcode contains a series of dark and light bars which are usually colored as black and white respectively.
    */
  var darkBarColor: js.UndefOr[js.Any] = js.native
  /** Specifies whether the text below the barcode is visible or hidden.
    */
  var displayText: js.UndefOr[Boolean] = js.native
  /** Specifies whether the control is enabled.
    */
  var enabled: js.UndefOr[Boolean] = js.native
  /** Specifies the start and stop encode symbol in the Barcode. In one dimensional barcodes, an additional character is added as start and stop delimiters. These symbols are optional
    * and the unique of the symbol allows the reader to determine the direction of the barcode being scanned.
    */
  var encodeStartStopSymbol: js.UndefOr[Double] = js.native
  /** Specifies the light bar color of the Barcode. One dimensional barcode contains a series of dark and light bars which are usually colored as black and white respectively.
    */
  var lightBarColor: js.UndefOr[js.Any] = js.native
  /** Fires after Barcode control is loaded.
    */
  var load: js.UndefOr[js.Function1[/* e */ LoadEventArgs, Unit]] = js.native
  /** Specifies the width of the narrow bars in the barcode. The dark bars in the one dimensional barcode contains random narrow and wide bars based on the provided input which can be
    * specified during initialization.
    */
  var narrowBarWidth: js.UndefOr[Double] = js.native
  /** Specifies the width of the quiet zone. In barcode, a quiet zone is the blank margin on either side of a barcode which informs the reader where a barcode's symbology starts and
    * stops. The purpose of a quiet zone is to prevent the reader from picking up unrelated information.
    */
  var quietZone: js.UndefOr[QuietZone] = js.native
  /** Specifies the type of the Barcode. See SymbologyType
    */
  var symbologyType: js.UndefOr[SymbologyType | String] = js.native
  /** Specifies the text to be encoded in the barcode.
    */
  var text: js.UndefOr[String] = js.native
  /** Specifies the color of the text/data at the bottom of the barcode.
    */
  var textColor: js.UndefOr[js.Any] = js.native
  /** Specifies the width of the wide bars in the barcode. One dimensional barcode usually contains random narrow and wide bars based on the provided which can be customized during
    * initialization.
    */
  var wideBarWidth: js.UndefOr[Double] = js.native
  /** Specifies the width of the narrowest element(bar or space) in a barcode. The greater the x dimension, the more easily a barcode reader will scan.
    */
  var xDimension: js.UndefOr[Double] = js.native
}

object Model {
  @scala.inline
  def apply(): Model = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Model]
  }
  @scala.inline
  implicit class ModelOps[Self <: Model] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBarHeight(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("barHeight")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBarHeight: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("barHeight")(js.undefined)
        ret
    }
    @scala.inline
    def withBarcodeToTextGapHeight(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("barcodeToTextGapHeight")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBarcodeToTextGapHeight: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("barcodeToTextGapHeight")(js.undefined)
        ret
    }
    @scala.inline
    def withDarkBarColor(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("darkBarColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDarkBarColor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("darkBarColor")(js.undefined)
        ret
    }
    @scala.inline
    def withDisplayText(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("displayText")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDisplayText: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("displayText")(js.undefined)
        ret
    }
    @scala.inline
    def withEnabled(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnabled: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enabled")(js.undefined)
        ret
    }
    @scala.inline
    def withEncodeStartStopSymbol(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("encodeStartStopSymbol")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEncodeStartStopSymbol: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("encodeStartStopSymbol")(js.undefined)
        ret
    }
    @scala.inline
    def withLightBarColor(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lightBarColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLightBarColor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lightBarColor")(js.undefined)
        ret
    }
    @scala.inline
    def withLoad(value: /* e */ LoadEventArgs => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("load")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutLoad: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("load")(js.undefined)
        ret
    }
    @scala.inline
    def withNarrowBarWidth(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("narrowBarWidth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNarrowBarWidth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("narrowBarWidth")(js.undefined)
        ret
    }
    @scala.inline
    def withQuietZone(value: QuietZone): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("quietZone")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutQuietZone: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("quietZone")(js.undefined)
        ret
    }
    @scala.inline
    def withSymbologyType(value: SymbologyType | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("symbologyType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSymbologyType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("symbologyType")(js.undefined)
        ret
    }
    @scala.inline
    def withText(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("text")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutText: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("text")(js.undefined)
        ret
    }
    @scala.inline
    def withTextColor(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("textColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTextColor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("textColor")(js.undefined)
        ret
    }
    @scala.inline
    def withWideBarWidth(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("wideBarWidth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWideBarWidth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("wideBarWidth")(js.undefined)
        ret
    }
    @scala.inline
    def withXDimension(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("xDimension")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutXDimension: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("xDimension")(js.undefined)
        ret
    }
  }
  
}

