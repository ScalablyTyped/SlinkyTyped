package typingsSlinky.screeps

import typingsSlinky.screeps.screepsStrings.GO
import typingsSlinky.screeps.screepsStrings.KO
import typingsSlinky.screeps.screepsStrings.LO
import typingsSlinky.screeps.screepsStrings.OH
import typingsSlinky.screeps.screepsStrings.UO
import typingsSlinky.screeps.screepsStrings.ZO
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonH extends js.Object {
  var G: GO = js.native
  var H: OH = js.native
  var K: KO = js.native
  var L: LO = js.native
  var U: UO = js.native
  var Z: ZO = js.native
}

object AnonH {
  @scala.inline
  def apply(G: GO, H: OH, K: KO, L: LO, U: UO, Z: ZO): AnonH = {
    val __obj = js.Dynamic.literal(G = G.asInstanceOf[js.Any], H = H.asInstanceOf[js.Any], K = K.asInstanceOf[js.Any], L = L.asInstanceOf[js.Any], U = U.asInstanceOf[js.Any], Z = Z.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonH]
  }
  @scala.inline
  implicit class AnonHOps[Self <: AnonH] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withG(value: GO): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("G")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withH(value: OH): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("H")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withK(value: KO): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("K")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withL(value: LO): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("L")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withU(value: UO): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("U")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withZ(value: ZO): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Z")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

