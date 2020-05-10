package typingsSlinky.haversine.mod

import typingsSlinky.haversine.haversineStrings.LeftcurlybracketlatCommalngRightcurlybracket
import typingsSlinky.haversine.haversineStrings.LeftcurlybracketlonCommalatRightcurlybracket
import typingsSlinky.haversine.haversineStrings.`[latCommalon]`
import typingsSlinky.haversine.haversineStrings.`[lonCommalat]`
import typingsSlinky.haversine.haversineStrings.geojson
import typingsSlinky.haversine.haversineStrings.km
import typingsSlinky.haversine.haversineStrings.meter
import typingsSlinky.haversine.haversineStrings.mile
import typingsSlinky.haversine.haversineStrings.nmi
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Options extends js.Object {
  /** Format of coordinate arguments. */
  var format: js.UndefOr[
    `[latCommalon]` | `[lonCommalat]` | LeftcurlybracketlonCommalatRightcurlybracket | LeftcurlybracketlatCommalngRightcurlybracket | geojson
  ] = js.native
  /**
    * If passed, will result in library returning boolean value of whether or not the start and end points are within that supplied threshold.
    */
  var threshold: js.UndefOr[Double | Null] = js.native
  /** Unit of measurement applied to result. Default: "km". */
  var unit: js.UndefOr[km | mile | meter | nmi] = js.native
}

object Options {
  @scala.inline
  def apply(): Options = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Options]
  }
  @scala.inline
  implicit class OptionsOps[Self <: Options] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFormat(
      value: `[latCommalon]` | `[lonCommalat]` | LeftcurlybracketlonCommalatRightcurlybracket | LeftcurlybracketlatCommalngRightcurlybracket | geojson
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("format")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFormat: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("format")(js.undefined)
        ret
    }
    @scala.inline
    def withThreshold(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("threshold")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutThreshold: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("threshold")(js.undefined)
        ret
    }
    @scala.inline
    def withThresholdNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("threshold")(null)
        ret
    }
    @scala.inline
    def withUnit(value: km | mile | meter | nmi): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("unit")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUnit: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("unit")(js.undefined)
        ret
    }
  }
  
}

