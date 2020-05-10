package typingsSlinky.chromaJs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonAccent extends js.Object {
  var Accent: js.Array[String] = js.native
  var Blues: js.Array[String] = js.native
  var BrBG: js.Array[String] = js.native
  var BuGn: js.Array[String] = js.native
  var BuPu: js.Array[String] = js.native
  var Dark2: js.Array[String] = js.native
  var GnBu: js.Array[String] = js.native
  var Greens: js.Array[String] = js.native
  var Greys: js.Array[String] = js.native
  var OrRd: js.Array[String] = js.native
  var Oranges: js.Array[String] = js.native
  var PRGn: js.Array[String] = js.native
  var Paired: js.Array[String] = js.native
  var Pastel1: js.Array[String] = js.native
  var Pastel2: js.Array[String] = js.native
  var PiYG: js.Array[String] = js.native
  var PuBu: js.Array[String] = js.native
  var PuBuGn: js.Array[String] = js.native
  var PuOr: js.Array[String] = js.native
  var PuRd: js.Array[String] = js.native
  var Purples: js.Array[String] = js.native
  var RdBu: js.Array[String] = js.native
  var RdGy: js.Array[String] = js.native
  var RdPu: js.Array[String] = js.native
  var RdYlBu: js.Array[String] = js.native
  var RdYlGn: js.Array[String] = js.native
  var Reds: js.Array[String] = js.native
  var Set1: js.Array[String] = js.native
  var Set2: js.Array[String] = js.native
  var Set3: js.Array[String] = js.native
  var Spectral: js.Array[String] = js.native
  var YlGn: js.Array[String] = js.native
  var YlGnBu: js.Array[String] = js.native
  var YlOrBr: js.Array[String] = js.native
  var YlOrRd: js.Array[String] = js.native
}

object AnonAccent {
  @scala.inline
  def apply(
    Accent: js.Array[String],
    Blues: js.Array[String],
    BrBG: js.Array[String],
    BuGn: js.Array[String],
    BuPu: js.Array[String],
    Dark2: js.Array[String],
    GnBu: js.Array[String],
    Greens: js.Array[String],
    Greys: js.Array[String],
    OrRd: js.Array[String],
    Oranges: js.Array[String],
    PRGn: js.Array[String],
    Paired: js.Array[String],
    Pastel1: js.Array[String],
    Pastel2: js.Array[String],
    PiYG: js.Array[String],
    PuBu: js.Array[String],
    PuBuGn: js.Array[String],
    PuOr: js.Array[String],
    PuRd: js.Array[String],
    Purples: js.Array[String],
    RdBu: js.Array[String],
    RdGy: js.Array[String],
    RdPu: js.Array[String],
    RdYlBu: js.Array[String],
    RdYlGn: js.Array[String],
    Reds: js.Array[String],
    Set1: js.Array[String],
    Set2: js.Array[String],
    Set3: js.Array[String],
    Spectral: js.Array[String],
    YlGn: js.Array[String],
    YlGnBu: js.Array[String],
    YlOrBr: js.Array[String],
    YlOrRd: js.Array[String]
  ): AnonAccent = {
    val __obj = js.Dynamic.literal(Accent = Accent.asInstanceOf[js.Any], Blues = Blues.asInstanceOf[js.Any], BrBG = BrBG.asInstanceOf[js.Any], BuGn = BuGn.asInstanceOf[js.Any], BuPu = BuPu.asInstanceOf[js.Any], Dark2 = Dark2.asInstanceOf[js.Any], GnBu = GnBu.asInstanceOf[js.Any], Greens = Greens.asInstanceOf[js.Any], Greys = Greys.asInstanceOf[js.Any], OrRd = OrRd.asInstanceOf[js.Any], Oranges = Oranges.asInstanceOf[js.Any], PRGn = PRGn.asInstanceOf[js.Any], Paired = Paired.asInstanceOf[js.Any], Pastel1 = Pastel1.asInstanceOf[js.Any], Pastel2 = Pastel2.asInstanceOf[js.Any], PiYG = PiYG.asInstanceOf[js.Any], PuBu = PuBu.asInstanceOf[js.Any], PuBuGn = PuBuGn.asInstanceOf[js.Any], PuOr = PuOr.asInstanceOf[js.Any], PuRd = PuRd.asInstanceOf[js.Any], Purples = Purples.asInstanceOf[js.Any], RdBu = RdBu.asInstanceOf[js.Any], RdGy = RdGy.asInstanceOf[js.Any], RdPu = RdPu.asInstanceOf[js.Any], RdYlBu = RdYlBu.asInstanceOf[js.Any], RdYlGn = RdYlGn.asInstanceOf[js.Any], Reds = Reds.asInstanceOf[js.Any], Set1 = Set1.asInstanceOf[js.Any], Set2 = Set2.asInstanceOf[js.Any], Set3 = Set3.asInstanceOf[js.Any], Spectral = Spectral.asInstanceOf[js.Any], YlGn = YlGn.asInstanceOf[js.Any], YlGnBu = YlGnBu.asInstanceOf[js.Any], YlOrBr = YlOrBr.asInstanceOf[js.Any], YlOrRd = YlOrRd.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonAccent]
  }
  @scala.inline
  implicit class AnonAccentOps[Self <: AnonAccent] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAccent(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Accent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBlues(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Blues")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBrBG(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("BrBG")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBuGn(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("BuGn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBuPu(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("BuPu")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDark2(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Dark2")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGnBu(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("GnBu")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGreens(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Greens")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGreys(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Greys")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOrRd(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("OrRd")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOranges(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Oranges")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPRGn(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PRGn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPaired(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Paired")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPastel1(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Pastel1")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPastel2(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Pastel2")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPiYG(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PiYG")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPuBu(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PuBu")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPuBuGn(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PuBuGn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPuOr(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PuOr")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPuRd(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PuRd")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPurples(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Purples")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRdBu(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RdBu")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRdGy(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RdGy")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRdPu(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RdPu")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRdYlBu(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RdYlBu")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRdYlGn(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RdYlGn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withReds(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Reds")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSet1(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Set1")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSet2(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Set2")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSet3(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Set3")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSpectral(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Spectral")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withYlGn(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("YlGn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withYlGnBu(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("YlGnBu")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withYlOrBr(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("YlOrBr")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withYlOrRd(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("YlOrRd")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

