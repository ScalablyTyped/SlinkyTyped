package typingsSlinky.screeps

import typingsSlinky.screeps.screepsStrings.GH2O
import typingsSlinky.screeps.screepsStrings.GHO2
import typingsSlinky.screeps.screepsStrings.KH2O
import typingsSlinky.screeps.screepsStrings.KHO2
import typingsSlinky.screeps.screepsStrings.LH2O
import typingsSlinky.screeps.screepsStrings.LHO2
import typingsSlinky.screeps.screepsStrings.UH2O
import typingsSlinky.screeps.screepsStrings.UHO2
import typingsSlinky.screeps.screepsStrings.ZH2O
import typingsSlinky.screeps.screepsStrings.ZHO2
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonGH extends js.Object {
  var GH: GH2O = js.native
  var GO: GHO2 = js.native
  var KH: KH2O = js.native
  var KO: KHO2 = js.native
  var LH: LH2O = js.native
  var LO: LHO2 = js.native
  var UH: UH2O = js.native
  var UO: UHO2 = js.native
  var ZH: ZH2O = js.native
  var ZO: ZHO2 = js.native
}

object AnonGH {
  @scala.inline
  def apply(GH: GH2O, GO: GHO2, KH: KH2O, KO: KHO2, LH: LH2O, LO: LHO2, UH: UH2O, UO: UHO2, ZH: ZH2O, ZO: ZHO2): AnonGH = {
    val __obj = js.Dynamic.literal(GH = GH.asInstanceOf[js.Any], GO = GO.asInstanceOf[js.Any], KH = KH.asInstanceOf[js.Any], KO = KO.asInstanceOf[js.Any], LH = LH.asInstanceOf[js.Any], LO = LO.asInstanceOf[js.Any], UH = UH.asInstanceOf[js.Any], UO = UO.asInstanceOf[js.Any], ZH = ZH.asInstanceOf[js.Any], ZO = ZO.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonGH]
  }
  @scala.inline
  implicit class AnonGHOps[Self <: AnonGH] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGH(value: GH2O): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("GH")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGO(value: GHO2): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("GO")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withKH(value: KH2O): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("KH")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withKO(value: KHO2): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("KO")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLH(value: LH2O): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LH")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLO(value: LHO2): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LO")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUH(value: UH2O): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("UH")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUO(value: UHO2): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("UO")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withZH(value: ZH2O): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ZH")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withZO(value: ZHO2): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ZO")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

