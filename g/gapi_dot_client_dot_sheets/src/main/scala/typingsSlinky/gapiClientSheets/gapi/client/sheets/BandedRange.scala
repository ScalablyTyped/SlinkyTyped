package typingsSlinky.gapiClientSheets.gapi.client.sheets

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BandedRange extends js.Object {
  /** The id of the banded range. */
  var bandedRangeId: js.UndefOr[Double] = js.native
  /**
    * Properties for column bands. These properties are applied on a column-
    * by-column basis throughout all the columns in the range. At least one of
    * row_properties or column_properties must be specified.
    */
  var columnProperties: js.UndefOr[BandingProperties] = js.native
  /** The range over which these properties are applied. */
  var range: js.UndefOr[GridRange] = js.native
  /**
    * Properties for row bands. These properties are applied on a row-by-row
    * basis throughout all the rows in the range. At least one of
    * row_properties or column_properties must be specified.
    */
  var rowProperties: js.UndefOr[BandingProperties] = js.native
}

object BandedRange {
  @scala.inline
  def apply(): BandedRange = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BandedRange]
  }
  @scala.inline
  implicit class BandedRangeOps[Self <: BandedRange] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBandedRangeId(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bandedRangeId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBandedRangeId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bandedRangeId")(js.undefined)
        ret
    }
    @scala.inline
    def withColumnProperties(value: BandingProperties): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("columnProperties")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutColumnProperties: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("columnProperties")(js.undefined)
        ret
    }
    @scala.inline
    def withRange(value: GridRange): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("range")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRange: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("range")(js.undefined)
        ret
    }
    @scala.inline
    def withRowProperties(value: BandingProperties): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rowProperties")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRowProperties: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rowProperties")(js.undefined)
        ret
    }
  }
  
}

