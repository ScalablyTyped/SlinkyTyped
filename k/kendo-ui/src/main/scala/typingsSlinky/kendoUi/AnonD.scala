package typingsSlinky.kendoUi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonD extends js.Object {
  var D: String = js.native
  var F: String = js.native
  var G: String = js.native
  var M: String = js.native
  var T: String = js.native
  var Y: String = js.native
  var d: String = js.native
  var g: String = js.native
  var m: String = js.native
  var s: String = js.native
  var t: String = js.native
  var u: String = js.native
  var y: String = js.native
}

object AnonD {
  @scala.inline
  def apply(
    D: String,
    F: String,
    G: String,
    M: String,
    T: String,
    Y: String,
    d: String,
    g: String,
    m: String,
    s: String,
    t: String,
    u: String,
    y: String
  ): AnonD = {
    val __obj = js.Dynamic.literal(D = D.asInstanceOf[js.Any], F = F.asInstanceOf[js.Any], G = G.asInstanceOf[js.Any], M = M.asInstanceOf[js.Any], T = T.asInstanceOf[js.Any], Y = Y.asInstanceOf[js.Any], d = d.asInstanceOf[js.Any], g = g.asInstanceOf[js.Any], m = m.asInstanceOf[js.Any], s = s.asInstanceOf[js.Any], t = t.asInstanceOf[js.Any], u = u.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonD]
  }
  @scala.inline
  implicit class AnonDOps[Self <: AnonD] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withD(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("D")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withF(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("F")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withG(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("G")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withM(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("M")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withT(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("T")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withY(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Y")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withS(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("s")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withU(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("u")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

