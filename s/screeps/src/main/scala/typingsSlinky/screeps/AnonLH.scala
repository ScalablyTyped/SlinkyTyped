package typingsSlinky.screeps

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonLH extends js.Object {
  var GH: AnonUpgradeController = js.native
  var GH2O: Anon22 = js.native
  var LH: AnonBuild = js.native
  var LH2O: AnonRepair = js.native
  var UHO2: Anon18 = js.native
  var UO: AnonHarvest = js.native
  var XGH2O: Anon23 = js.native
  var XLH2O: AnonBuildRepair = js.native
  var XUHO2: Anon19 = js.native
  var XZH2O: Anon21 = js.native
  var ZH: AnonDismantle = js.native
  var ZH2O: Anon20 = js.native
}

object AnonLH {
  @scala.inline
  def apply(
    GH: AnonUpgradeController,
    GH2O: Anon22,
    LH: AnonBuild,
    LH2O: AnonRepair,
    UHO2: Anon18,
    UO: AnonHarvest,
    XGH2O: Anon23,
    XLH2O: AnonBuildRepair,
    XUHO2: Anon19,
    XZH2O: Anon21,
    ZH: AnonDismantle,
    ZH2O: Anon20
  ): AnonLH = {
    val __obj = js.Dynamic.literal(GH = GH.asInstanceOf[js.Any], GH2O = GH2O.asInstanceOf[js.Any], LH = LH.asInstanceOf[js.Any], LH2O = LH2O.asInstanceOf[js.Any], UHO2 = UHO2.asInstanceOf[js.Any], UO = UO.asInstanceOf[js.Any], XGH2O = XGH2O.asInstanceOf[js.Any], XLH2O = XLH2O.asInstanceOf[js.Any], XUHO2 = XUHO2.asInstanceOf[js.Any], XZH2O = XZH2O.asInstanceOf[js.Any], ZH = ZH.asInstanceOf[js.Any], ZH2O = ZH2O.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonLH]
  }
  @scala.inline
  implicit class AnonLHOps[Self <: AnonLH] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGH(value: AnonUpgradeController): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("GH")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGH2O(value: Anon22): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("GH2O")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLH(value: AnonBuild): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LH")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLH2O(value: AnonRepair): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LH2O")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUHO2(value: Anon18): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("UHO2")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUO(value: AnonHarvest): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("UO")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withXGH2O(value: Anon23): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("XGH2O")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withXLH2O(value: AnonBuildRepair): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("XLH2O")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withXUHO2(value: Anon19): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("XUHO2")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withXZH2O(value: Anon21): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("XZH2O")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withZH(value: AnonDismantle): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ZH")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withZH2O(value: Anon20): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ZH2O")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

