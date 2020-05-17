package typingsSlinky.colorbrewer.ColorBrewer

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Base extends js.Object {
  var Accent: EightColorScheme = js.native
  var Blues: NineColorScheme = js.native
  var BrBG: ElevenColorScheme = js.native
  var BuGn: NineColorScheme = js.native
  var BuPu: NineColorScheme = js.native
  var Dark2: EightColorScheme = js.native
  var GnBu: NineColorScheme = js.native
  var Greens: NineColorScheme = js.native
  var Greys: NineColorScheme = js.native
  var OrRd: NineColorScheme = js.native
  var Oranges: NineColorScheme = js.native
  var PRGn: ElevenColorScheme = js.native
  var Paired: TwelveColorScheme = js.native
  var Pastel1: NineColorScheme = js.native
  var Pastel2: EightColorScheme = js.native
  var PiYG: ElevenColorScheme = js.native
  var PuBu: NineColorScheme = js.native
  var PuBuGn: NineColorScheme = js.native
  var PuOr: ElevenColorScheme = js.native
  var PuRd: NineColorScheme = js.native
  var Purples: NineColorScheme = js.native
  var RdBu: ElevenColorScheme = js.native
  var RdGy: ElevenColorScheme = js.native
  var RdPu: NineColorScheme = js.native
  var RdYlBu: ElevenColorScheme = js.native
  var RdYlGn: ElevenColorScheme = js.native
  var Reds: NineColorScheme = js.native
  var Set1: NineColorScheme = js.native
  var Set2: EightColorScheme = js.native
  var Set3: TwelveColorScheme = js.native
  var Spectral: ElevenColorScheme = js.native
  var YlGn: NineColorScheme = js.native
  var YlGnBu: NineColorScheme = js.native
  var YlOrBr: NineColorScheme = js.native
  var YlOrRd: NineColorScheme = js.native
}

object Base {
  @scala.inline
  def apply(
    Accent: EightColorScheme,
    Blues: NineColorScheme,
    BrBG: ElevenColorScheme,
    BuGn: NineColorScheme,
    BuPu: NineColorScheme,
    Dark2: EightColorScheme,
    GnBu: NineColorScheme,
    Greens: NineColorScheme,
    Greys: NineColorScheme,
    OrRd: NineColorScheme,
    Oranges: NineColorScheme,
    PRGn: ElevenColorScheme,
    Paired: TwelveColorScheme,
    Pastel1: NineColorScheme,
    Pastel2: EightColorScheme,
    PiYG: ElevenColorScheme,
    PuBu: NineColorScheme,
    PuBuGn: NineColorScheme,
    PuOr: ElevenColorScheme,
    PuRd: NineColorScheme,
    Purples: NineColorScheme,
    RdBu: ElevenColorScheme,
    RdGy: ElevenColorScheme,
    RdPu: NineColorScheme,
    RdYlBu: ElevenColorScheme,
    RdYlGn: ElevenColorScheme,
    Reds: NineColorScheme,
    Set1: NineColorScheme,
    Set2: EightColorScheme,
    Set3: TwelveColorScheme,
    Spectral: ElevenColorScheme,
    YlGn: NineColorScheme,
    YlGnBu: NineColorScheme,
    YlOrBr: NineColorScheme,
    YlOrRd: NineColorScheme
  ): Base = {
    val __obj = js.Dynamic.literal(Accent = Accent.asInstanceOf[js.Any], Blues = Blues.asInstanceOf[js.Any], BrBG = BrBG.asInstanceOf[js.Any], BuGn = BuGn.asInstanceOf[js.Any], BuPu = BuPu.asInstanceOf[js.Any], Dark2 = Dark2.asInstanceOf[js.Any], GnBu = GnBu.asInstanceOf[js.Any], Greens = Greens.asInstanceOf[js.Any], Greys = Greys.asInstanceOf[js.Any], OrRd = OrRd.asInstanceOf[js.Any], Oranges = Oranges.asInstanceOf[js.Any], PRGn = PRGn.asInstanceOf[js.Any], Paired = Paired.asInstanceOf[js.Any], Pastel1 = Pastel1.asInstanceOf[js.Any], Pastel2 = Pastel2.asInstanceOf[js.Any], PiYG = PiYG.asInstanceOf[js.Any], PuBu = PuBu.asInstanceOf[js.Any], PuBuGn = PuBuGn.asInstanceOf[js.Any], PuOr = PuOr.asInstanceOf[js.Any], PuRd = PuRd.asInstanceOf[js.Any], Purples = Purples.asInstanceOf[js.Any], RdBu = RdBu.asInstanceOf[js.Any], RdGy = RdGy.asInstanceOf[js.Any], RdPu = RdPu.asInstanceOf[js.Any], RdYlBu = RdYlBu.asInstanceOf[js.Any], RdYlGn = RdYlGn.asInstanceOf[js.Any], Reds = Reds.asInstanceOf[js.Any], Set1 = Set1.asInstanceOf[js.Any], Set2 = Set2.asInstanceOf[js.Any], Set3 = Set3.asInstanceOf[js.Any], Spectral = Spectral.asInstanceOf[js.Any], YlGn = YlGn.asInstanceOf[js.Any], YlGnBu = YlGnBu.asInstanceOf[js.Any], YlOrBr = YlOrBr.asInstanceOf[js.Any], YlOrRd = YlOrRd.asInstanceOf[js.Any])
    __obj.asInstanceOf[Base]
  }
  @scala.inline
  implicit class BaseOps[Self <: Base] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAccent(value: EightColorScheme): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Accent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBlues(value: NineColorScheme): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Blues")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBrBG(value: ElevenColorScheme): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("BrBG")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBuGn(value: NineColorScheme): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("BuGn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBuPu(value: NineColorScheme): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("BuPu")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDark2(value: EightColorScheme): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Dark2")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGnBu(value: NineColorScheme): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("GnBu")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGreens(value: NineColorScheme): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Greens")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGreys(value: NineColorScheme): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Greys")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOrRd(value: NineColorScheme): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("OrRd")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOranges(value: NineColorScheme): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Oranges")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPRGn(value: ElevenColorScheme): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PRGn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPaired(value: TwelveColorScheme): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Paired")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPastel1(value: NineColorScheme): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Pastel1")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPastel2(value: EightColorScheme): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Pastel2")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPiYG(value: ElevenColorScheme): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PiYG")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPuBu(value: NineColorScheme): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PuBu")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPuBuGn(value: NineColorScheme): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PuBuGn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPuOr(value: ElevenColorScheme): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PuOr")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPuRd(value: NineColorScheme): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PuRd")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPurples(value: NineColorScheme): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Purples")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRdBu(value: ElevenColorScheme): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RdBu")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRdGy(value: ElevenColorScheme): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RdGy")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRdPu(value: NineColorScheme): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RdPu")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRdYlBu(value: ElevenColorScheme): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RdYlBu")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRdYlGn(value: ElevenColorScheme): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RdYlGn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withReds(value: NineColorScheme): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Reds")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSet1(value: NineColorScheme): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Set1")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSet2(value: EightColorScheme): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Set2")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSet3(value: TwelveColorScheme): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Set3")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSpectral(value: ElevenColorScheme): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Spectral")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withYlGn(value: NineColorScheme): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("YlGn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withYlGnBu(value: NineColorScheme): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("YlGnBu")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withYlOrBr(value: NineColorScheme): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("YlOrBr")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withYlOrRd(value: NineColorScheme): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("YlOrRd")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

