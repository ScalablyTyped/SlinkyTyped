package typingsSlinky.materialMenuSurface.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ANCHOR extends js.Object {
  var ANCHOR: String = js.native
  var ANIMATING_CLOSED: String = js.native
  var ANIMATING_OPEN: String = js.native
  var FIXED: String = js.native
  var OPEN: String = js.native
  var ROOT: String = js.native
}

object ANCHOR {
  @scala.inline
  def apply(
    ANCHOR: String,
    ANIMATING_CLOSED: String,
    ANIMATING_OPEN: String,
    FIXED: String,
    OPEN: String,
    ROOT: String
  ): ANCHOR = {
    val __obj = js.Dynamic.literal(ANCHOR = ANCHOR.asInstanceOf[js.Any], ANIMATING_CLOSED = ANIMATING_CLOSED.asInstanceOf[js.Any], ANIMATING_OPEN = ANIMATING_OPEN.asInstanceOf[js.Any], FIXED = FIXED.asInstanceOf[js.Any], OPEN = OPEN.asInstanceOf[js.Any], ROOT = ROOT.asInstanceOf[js.Any])
    __obj.asInstanceOf[ANCHOR]
  }
  @scala.inline
  implicit class ANCHOROps[Self <: ANCHOR] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withANCHOR(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ANCHOR")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withANIMATING_CLOSED(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ANIMATING_CLOSED")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withANIMATING_OPEN(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ANIMATING_OPEN")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFIXED(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("FIXED")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOPEN(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("OPEN")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withROOT(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ROOT")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

