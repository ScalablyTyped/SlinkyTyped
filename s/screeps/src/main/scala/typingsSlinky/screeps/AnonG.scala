package typingsSlinky.screeps

import typingsSlinky.screeps.screepsStrings.GH
import typingsSlinky.screeps.screepsStrings.KH
import typingsSlinky.screeps.screepsStrings.LH
import typingsSlinky.screeps.screepsStrings.OH
import typingsSlinky.screeps.screepsStrings.UH
import typingsSlinky.screeps.screepsStrings.ZH
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonG extends js.Object {
  var G: GH = js.native
  var K: KH = js.native
  var L: LH = js.native
  var O: OH = js.native
  var U: UH = js.native
  var Z: ZH = js.native
}

object AnonG {
  @scala.inline
  def apply(G: GH, K: KH, L: LH, O: OH, U: UH, Z: ZH): AnonG = {
    val __obj = js.Dynamic.literal(G = G.asInstanceOf[js.Any], K = K.asInstanceOf[js.Any], L = L.asInstanceOf[js.Any], O = O.asInstanceOf[js.Any], U = U.asInstanceOf[js.Any], Z = Z.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonG]
  }
  @scala.inline
  implicit class AnonGOps[Self <: AnonG] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withG(value: GH): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("G")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withK(value: KH): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("K")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withL(value: LH): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("L")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withO(value: OH): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("O")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withU(value: UH): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("U")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withZ(value: ZH): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Z")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

