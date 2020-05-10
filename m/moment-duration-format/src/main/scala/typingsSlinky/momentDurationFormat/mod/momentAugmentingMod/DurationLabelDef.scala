package typingsSlinky.momentDurationFormat.mod.momentAugmentingMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined {[ duration in moment-duration-format.moment-duration-format.moment.DurationToken ]: string} */
@js.native
trait DurationLabelDef extends js.Object {
  var M: String = js.native
  var MM: String = js.native
  var MMM: String = js.native
  var S: String = js.native
  var SS: String = js.native
  var SSS: String = js.native
  var d: String = js.native
  var dd: String = js.native
  var ddd: String = js.native
  var h: String = js.native
  var hh: String = js.native
  var hhh: String = js.native
  var m: String = js.native
  var mm: String = js.native
  var mmm: String = js.native
  var s: String = js.native
  var ss: String = js.native
  var sss: String = js.native
  var w: String = js.native
  var ww: String = js.native
  var www: String = js.native
  var y: String = js.native
  var yy: String = js.native
  var yyy: String = js.native
}

object DurationLabelDef {
  @scala.inline
  def apply(
    M: String,
    MM: String,
    MMM: String,
    S: String,
    SS: String,
    SSS: String,
    d: String,
    dd: String,
    ddd: String,
    h: String,
    hh: String,
    hhh: String,
    m: String,
    mm: String,
    mmm: String,
    s: String,
    ss: String,
    sss: String,
    w: String,
    ww: String,
    www: String,
    y: String,
    yy: String,
    yyy: String
  ): DurationLabelDef = {
    val __obj = js.Dynamic.literal(M = M.asInstanceOf[js.Any], MM = MM.asInstanceOf[js.Any], MMM = MMM.asInstanceOf[js.Any], S = S.asInstanceOf[js.Any], SS = SS.asInstanceOf[js.Any], SSS = SSS.asInstanceOf[js.Any], d = d.asInstanceOf[js.Any], dd = dd.asInstanceOf[js.Any], ddd = ddd.asInstanceOf[js.Any], h = h.asInstanceOf[js.Any], hh = hh.asInstanceOf[js.Any], hhh = hhh.asInstanceOf[js.Any], m = m.asInstanceOf[js.Any], mm = mm.asInstanceOf[js.Any], mmm = mmm.asInstanceOf[js.Any], s = s.asInstanceOf[js.Any], ss = ss.asInstanceOf[js.Any], sss = sss.asInstanceOf[js.Any], w = w.asInstanceOf[js.Any], ww = ww.asInstanceOf[js.Any], www = www.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any], yy = yy.asInstanceOf[js.Any], yyy = yyy.asInstanceOf[js.Any])
    __obj.asInstanceOf[DurationLabelDef]
  }
  @scala.inline
  implicit class DurationLabelDefOps[Self <: DurationLabelDef] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withM(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("M")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMM(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MM")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMMM(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MMM")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withS(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("S")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSS(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SS")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSSS(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SSS")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withD(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("d")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDd(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dd")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDdd(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ddd")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withH(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("h")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHh(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hh")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHhh(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hhh")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withW(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("w")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withWw(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ww")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withWww(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("www")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withY(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("y")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withYy(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("yy")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withYyy(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("yyy")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

