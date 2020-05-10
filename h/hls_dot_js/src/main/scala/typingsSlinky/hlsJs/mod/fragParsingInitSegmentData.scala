package typingsSlinky.hlsJs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait fragParsingInitSegmentData extends js.Object {
  var codecs: js.Any = js.native
  var frag: Fragment = js.native
  var id: String = js.native
  var moov: js.Any = js.native
}

object fragParsingInitSegmentData {
  @scala.inline
  def apply(codecs: js.Any, frag: Fragment, id: String, moov: js.Any): fragParsingInitSegmentData = {
    val __obj = js.Dynamic.literal(codecs = codecs.asInstanceOf[js.Any], frag = frag.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], moov = moov.asInstanceOf[js.Any])
    __obj.asInstanceOf[fragParsingInitSegmentData]
  }
  @scala.inline
  implicit class fragParsingInitSegmentDataOps[Self <: fragParsingInitSegmentData] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCodecs(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("codecs")(value.asInstanceOf[js.Any])
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
    def withMoov(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("moov")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

