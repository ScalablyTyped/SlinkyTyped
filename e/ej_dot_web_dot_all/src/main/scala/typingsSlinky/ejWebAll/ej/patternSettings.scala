package typingsSlinky.ejWebAll.ej

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait patternSettings extends js.Object {
  var D: String = js.native
  var F: String = js.native
  var M: String = js.native
  var S: String = js.native
  var T: String = js.native
  var Y: String = js.native
  var d: String = js.native
  var f: String = js.native
  var t: String = js.native
}

object patternSettings {
  @scala.inline
  def apply(D: String, F: String, M: String, S: String, T: String, Y: String, d: String, f: String, t: String): patternSettings = {
    val __obj = js.Dynamic.literal(D = D.asInstanceOf[js.Any], F = F.asInstanceOf[js.Any], M = M.asInstanceOf[js.Any], S = S.asInstanceOf[js.Any], T = T.asInstanceOf[js.Any], Y = Y.asInstanceOf[js.Any], d = d.asInstanceOf[js.Any], f = f.asInstanceOf[js.Any], t = t.asInstanceOf[js.Any])
    __obj.asInstanceOf[patternSettings]
  }
  @scala.inline
  implicit class patternSettingsOps[Self <: patternSettings] (val x: Self) extends AnyVal {
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
    def withM(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("M")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withS(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("S")(value.asInstanceOf[js.Any])
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
  }
  
}

