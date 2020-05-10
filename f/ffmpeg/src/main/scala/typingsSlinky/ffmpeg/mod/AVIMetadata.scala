package typingsSlinky.ffmpeg.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<{  IARL  :string,   IART  :string,   ICMS  :string,   ICMT  :string,   ICOP  :string,   ICRD  :string | std.Date,   ICRP  :string,   IDIM  :string,   IDPI  :string,   IENG  :string,   IGNR  :string,   IKEY  :string,   ILGT  :string,   ILNG  :string,   IMED  :string,   INAM  :string,   IPLT  :string,   IPRD  :string,   ISBJ  :string,   ISFT  :string,   ISHP  :string,   ISRC  :string,   ISRF  :string,   ITCH  :string}> */
@js.native
trait AVIMetadata extends js.Object {
  var IARL: js.UndefOr[String] = js.native
  var IART: js.UndefOr[String] = js.native
  var ICMS: js.UndefOr[String] = js.native
  var ICMT: js.UndefOr[String] = js.native
  var ICOP: js.UndefOr[String] = js.native
  var ICRD: js.UndefOr[String | js.Date] = js.native
  var ICRP: js.UndefOr[String] = js.native
  var IDIM: js.UndefOr[String] = js.native
  var IDPI: js.UndefOr[String] = js.native
  var IENG: js.UndefOr[String] = js.native
  var IGNR: js.UndefOr[String] = js.native
  var IKEY: js.UndefOr[String] = js.native
  var ILGT: js.UndefOr[String] = js.native
  var ILNG: js.UndefOr[String] = js.native
  var IMED: js.UndefOr[String] = js.native
  var INAM: js.UndefOr[String] = js.native
  var IPLT: js.UndefOr[String] = js.native
  var IPRD: js.UndefOr[String] = js.native
  var ISBJ: js.UndefOr[String] = js.native
  var ISFT: js.UndefOr[String] = js.native
  var ISHP: js.UndefOr[String] = js.native
  var ISRC: js.UndefOr[String] = js.native
  var ISRF: js.UndefOr[String] = js.native
  var ITCH: js.UndefOr[String] = js.native
}

object AVIMetadata {
  @scala.inline
  def apply(): AVIMetadata = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AVIMetadata]
  }
  @scala.inline
  implicit class AVIMetadataOps[Self <: AVIMetadata] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withIARL(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("IARL")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIARL: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("IARL")(js.undefined)
        ret
    }
    @scala.inline
    def withIART(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("IART")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIART: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("IART")(js.undefined)
        ret
    }
    @scala.inline
    def withICMS(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ICMS")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutICMS: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ICMS")(js.undefined)
        ret
    }
    @scala.inline
    def withICMT(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ICMT")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutICMT: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ICMT")(js.undefined)
        ret
    }
    @scala.inline
    def withICOP(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ICOP")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutICOP: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ICOP")(js.undefined)
        ret
    }
    @scala.inline
    def withICRDDate(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ICRD")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withICRD(value: String | js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ICRD")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutICRD: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ICRD")(js.undefined)
        ret
    }
    @scala.inline
    def withICRP(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ICRP")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutICRP: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ICRP")(js.undefined)
        ret
    }
    @scala.inline
    def withIDIM(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("IDIM")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIDIM: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("IDIM")(js.undefined)
        ret
    }
    @scala.inline
    def withIDPI(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("IDPI")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIDPI: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("IDPI")(js.undefined)
        ret
    }
    @scala.inline
    def withIENG(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("IENG")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIENG: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("IENG")(js.undefined)
        ret
    }
    @scala.inline
    def withIGNR(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("IGNR")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIGNR: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("IGNR")(js.undefined)
        ret
    }
    @scala.inline
    def withIKEY(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("IKEY")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIKEY: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("IKEY")(js.undefined)
        ret
    }
    @scala.inline
    def withILGT(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ILGT")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutILGT: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ILGT")(js.undefined)
        ret
    }
    @scala.inline
    def withILNG(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ILNG")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutILNG: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ILNG")(js.undefined)
        ret
    }
    @scala.inline
    def withIMED(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("IMED")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIMED: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("IMED")(js.undefined)
        ret
    }
    @scala.inline
    def withINAM(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("INAM")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutINAM: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("INAM")(js.undefined)
        ret
    }
    @scala.inline
    def withIPLT(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("IPLT")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIPLT: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("IPLT")(js.undefined)
        ret
    }
    @scala.inline
    def withIPRD(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("IPRD")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIPRD: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("IPRD")(js.undefined)
        ret
    }
    @scala.inline
    def withISBJ(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ISBJ")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutISBJ: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ISBJ")(js.undefined)
        ret
    }
    @scala.inline
    def withISFT(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ISFT")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutISFT: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ISFT")(js.undefined)
        ret
    }
    @scala.inline
    def withISHP(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ISHP")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutISHP: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ISHP")(js.undefined)
        ret
    }
    @scala.inline
    def withISRC(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ISRC")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutISRC: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ISRC")(js.undefined)
        ret
    }
    @scala.inline
    def withISRF(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ISRF")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutISRF: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ISRF")(js.undefined)
        ret
    }
    @scala.inline
    def withITCH(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ITCH")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutITCH: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ITCH")(js.undefined)
        ret
    }
  }
  
}

