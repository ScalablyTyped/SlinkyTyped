package typingsSlinky.googleMaps.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CellTower extends js.Object {
  /** The number of milliseconds since this cell was primary. If age is 0, the `cellId` represents a current measurement. */
  var age: js.UndefOr[Double] = js.native
  /**
    * Unique identifier of the cell.
    * On GSM, this is the Cell ID (CID);
    * CDMA networks use the Base Station ID (BID).
    * WCDMA networks use the UTRAN/GERAN Cell Identity (UC-Id), which is a 32-bit value concatenating the Radio Network Controller (RNC)
    * and Cell ID. Specifying only the 16-bit Cell ID value in WCDMA networks may return inaccurate results.
    */
  var cellId: Double = js.native
  /** The Location Area Code (LAC) for GSM and WCDMA networks. The Network ID (NID) for CDMA networks. */
  var locationAreaCode: Double = js.native
  /** The cell tower's Mobile Country Code (MCC). */
  var mobileCountryCode: Double = js.native
  /** The cell tower's Mobile Network Code. This is the MNC for GSM and WCDMA; CDMA uses the System ID (SID). */
  var mobileNetworkCode: Double = js.native
  /** Radio signal strength measured in dBm. */
  var signalStrength: js.UndefOr[Double] = js.native
  /** The [timing advance](https://en.wikipedia.org/wiki/Timing_advance) value. */
  var timingAdvance: js.UndefOr[Double] = js.native
}

object CellTower {
  @scala.inline
  def apply(cellId: Double, locationAreaCode: Double, mobileCountryCode: Double, mobileNetworkCode: Double): CellTower = {
    val __obj = js.Dynamic.literal(cellId = cellId.asInstanceOf[js.Any], locationAreaCode = locationAreaCode.asInstanceOf[js.Any], mobileCountryCode = mobileCountryCode.asInstanceOf[js.Any], mobileNetworkCode = mobileNetworkCode.asInstanceOf[js.Any])
    __obj.asInstanceOf[CellTower]
  }
  @scala.inline
  implicit class CellTowerOps[Self <: CellTower] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCellId(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cellId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLocationAreaCode(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("locationAreaCode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMobileCountryCode(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mobileCountryCode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMobileNetworkCode(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mobileNetworkCode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAge(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("age")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAge: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("age")(js.undefined)
        ret
    }
    @scala.inline
    def withSignalStrength(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("signalStrength")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSignalStrength: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("signalStrength")(js.undefined)
        ret
    }
    @scala.inline
    def withTimingAdvance(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timingAdvance")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTimingAdvance: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timingAdvance")(js.undefined)
        ret
    }
  }
  
}

