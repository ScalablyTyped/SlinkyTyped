package typingsSlinky.awsSdk.medialiveMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FecOutputSettings extends js.Object {
  /**
    * Parameter D from SMPTE 2022-1. The height of the FEC protection matrix.  The number of transport stream packets per column error correction packet. Must be between 4 and 20, inclusive.
    */
  var ColumnDepth: js.UndefOr[integerMin4Max20] = js.native
  /**
    * Enables column only or column and row based FEC
    */
  var IncludeFec: js.UndefOr[FecOutputIncludeFec] = js.native
  /**
    * Parameter L from SMPTE 2022-1. The width of the FEC protection matrix.  Must be between 1 and 20, inclusive. If only Column FEC is used, then larger values increase robustness.  If Row FEC is used, then this is the number of transport stream packets per row error correction packet, and the value must be between 4 and 20, inclusive, if includeFec is columnAndRow. If includeFec is column, this value must be 1 to 20, inclusive.
    */
  var RowLength: js.UndefOr[integerMin1Max20] = js.native
}

object FecOutputSettings {
  @scala.inline
  def apply(): FecOutputSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FecOutputSettings]
  }
  @scala.inline
  implicit class FecOutputSettingsOps[Self <: FecOutputSettings] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withColumnDepth(value: integerMin4Max20): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ColumnDepth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutColumnDepth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ColumnDepth")(js.undefined)
        ret
    }
    @scala.inline
    def withIncludeFec(value: FecOutputIncludeFec): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("IncludeFec")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIncludeFec: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("IncludeFec")(js.undefined)
        ret
    }
    @scala.inline
    def withRowLength(value: integerMin1Max20): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RowLength")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRowLength: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RowLength")(js.undefined)
        ret
    }
  }
  
}

