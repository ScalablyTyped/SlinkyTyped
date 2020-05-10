package typingsSlinky.hlsJs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait initPtsFoundData extends js.Object {
  var d: String = js.native
  var frag: Fragment = js.native
  var initPTS: Double = js.native
}

object initPtsFoundData {
  @scala.inline
  def apply(d: String, frag: Fragment, initPTS: Double): initPtsFoundData = {
    val __obj = js.Dynamic.literal(d = d.asInstanceOf[js.Any], frag = frag.asInstanceOf[js.Any], initPTS = initPTS.asInstanceOf[js.Any])
    __obj.asInstanceOf[initPtsFoundData]
  }
  @scala.inline
  implicit class initPtsFoundDataOps[Self <: initPtsFoundData] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withD(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("d")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFrag(value: Fragment): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("frag")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withInitPTS(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("initPTS")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

