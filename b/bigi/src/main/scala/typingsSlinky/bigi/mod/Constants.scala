package typingsSlinky.bigi.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Constants extends js.Object {
  val DB: Double = js.native
  val DM: Double = js.native
  val DV: Double = js.native
  val F1: Double = js.native
  val F2: Double = js.native
  val FV: Double = js.native
  val s: Double = js.native
  val t: Double = js.native
}

object Constants {
  @scala.inline
  def apply(DB: Double, DM: Double, DV: Double, F1: Double, F2: Double, FV: Double, s: Double, t: Double): Constants = {
    val __obj = js.Dynamic.literal(DB = DB.asInstanceOf[js.Any], DM = DM.asInstanceOf[js.Any], DV = DV.asInstanceOf[js.Any], F1 = F1.asInstanceOf[js.Any], F2 = F2.asInstanceOf[js.Any], FV = FV.asInstanceOf[js.Any], s = s.asInstanceOf[js.Any], t = t.asInstanceOf[js.Any])
    __obj.asInstanceOf[Constants]
  }
  @scala.inline
  implicit class ConstantsOps[Self <: Constants] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDB(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DB")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDM(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DM")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDV(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DV")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withF1(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("F1")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withF2(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("F2")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFV(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("FV")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withS(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("s")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withT(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("t")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

