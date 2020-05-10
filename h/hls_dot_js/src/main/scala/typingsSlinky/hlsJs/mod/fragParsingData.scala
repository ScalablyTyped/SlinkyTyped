package typingsSlinky.hlsJs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait fragParsingData extends js.Object {
  var endDTS: Double = js.native
  var endPTS: Double = js.native
  var frag: Fragment = js.native
  var id: String = js.native
  var mdat: js.Any = js.native
  var moof: js.Any = js.native
  var nb: Double = js.native
  var startDTS: Double = js.native
  var startPTS: Double = js.native
  var `type`: String = js.native
}

object fragParsingData {
  @scala.inline
  def apply(
    endDTS: Double,
    endPTS: Double,
    frag: Fragment,
    id: String,
    mdat: js.Any,
    moof: js.Any,
    nb: Double,
    startDTS: Double,
    startPTS: Double,
    `type`: String
  ): fragParsingData = {
    val __obj = js.Dynamic.literal(endDTS = endDTS.asInstanceOf[js.Any], endPTS = endPTS.asInstanceOf[js.Any], frag = frag.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], mdat = mdat.asInstanceOf[js.Any], moof = moof.asInstanceOf[js.Any], nb = nb.asInstanceOf[js.Any], startDTS = startDTS.asInstanceOf[js.Any], startPTS = startPTS.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[fragParsingData]
  }
  @scala.inline
  implicit class fragParsingDataOps[Self <: fragParsingData] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEndDTS(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("endDTS")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEndPTS(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("endPTS")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFrag(value: Fragment): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("frag")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMdat(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mdat")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMoof(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("moof")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNb(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nb")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStartDTS(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("startDTS")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStartPTS(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("startPTS")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

