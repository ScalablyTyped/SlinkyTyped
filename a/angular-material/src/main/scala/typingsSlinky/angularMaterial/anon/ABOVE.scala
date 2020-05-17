package typingsSlinky.angularMaterial.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ABOVE extends js.Object {
  var ABOVE: String = js.native
  var ALIGN_BOTTOMS: String = js.native
  var ALIGN_TOPS: String = js.native
  var BELOW: String = js.native
  var CENTER: String = js.native
}

object ABOVE {
  @scala.inline
  def apply(ABOVE: String, ALIGN_BOTTOMS: String, ALIGN_TOPS: String, BELOW: String, CENTER: String): ABOVE = {
    val __obj = js.Dynamic.literal(ABOVE = ABOVE.asInstanceOf[js.Any], ALIGN_BOTTOMS = ALIGN_BOTTOMS.asInstanceOf[js.Any], ALIGN_TOPS = ALIGN_TOPS.asInstanceOf[js.Any], BELOW = BELOW.asInstanceOf[js.Any], CENTER = CENTER.asInstanceOf[js.Any])
    __obj.asInstanceOf[ABOVE]
  }
  @scala.inline
  implicit class ABOVEOps[Self <: ABOVE] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withABOVE(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ABOVE")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withALIGN_BOTTOMS(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ALIGN_BOTTOMS")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withALIGN_TOPS(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ALIGN_TOPS")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBELOW(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("BELOW")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCENTER(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CENTER")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

