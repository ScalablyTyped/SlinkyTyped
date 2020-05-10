package typingsSlinky.asn1js.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LocalSidValueBlockParams extends LocalHexBlockParams {
  var isFirstSid: js.UndefOr[scala.Boolean] = js.native
  var valueDec: js.UndefOr[Double] = js.native
}

object LocalSidValueBlockParams {
  @scala.inline
  def apply(): LocalSidValueBlockParams = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LocalSidValueBlockParams]
  }
  @scala.inline
  implicit class LocalSidValueBlockParamsOps[Self <: LocalSidValueBlockParams] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withIsFirstSid(value: scala.Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isFirstSid")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsFirstSid: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isFirstSid")(js.undefined)
        ret
    }
    @scala.inline
    def withValueDec(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("valueDec")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutValueDec: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("valueDec")(js.undefined)
        ret
    }
  }
  
}

