package typingsSlinky.fluentFfmpeg.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Codec extends js.Object {
  var canDecode: Boolean = js.native
  var canEncode: Boolean = js.native
  var description: String = js.native
  var directRendering: js.UndefOr[Boolean] = js.native
  var drawHorizBand: js.UndefOr[Boolean] = js.native
  var intraFrameOnly: js.UndefOr[Boolean] = js.native
  var isLossless: js.UndefOr[Boolean] = js.native
  var isLossy: js.UndefOr[Boolean] = js.native
  var `type`: String = js.native
  var weirdFrameTruncation: js.UndefOr[Boolean] = js.native
}

object Codec {
  @scala.inline
  def apply(canDecode: Boolean, canEncode: Boolean, description: String, `type`: String): Codec = {
    val __obj = js.Dynamic.literal(canDecode = canDecode.asInstanceOf[js.Any], canEncode = canEncode.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Codec]
  }
  @scala.inline
  implicit class CodecOps[Self <: Codec] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCanDecode(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("canDecode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCanEncode(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("canEncode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDescription(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("description")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDirectRendering(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("directRendering")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDirectRendering: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("directRendering")(js.undefined)
        ret
    }
    @scala.inline
    def withDrawHorizBand(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("drawHorizBand")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDrawHorizBand: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("drawHorizBand")(js.undefined)
        ret
    }
    @scala.inline
    def withIntraFrameOnly(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("intraFrameOnly")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIntraFrameOnly: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("intraFrameOnly")(js.undefined)
        ret
    }
    @scala.inline
    def withIsLossless(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isLossless")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsLossless: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isLossless")(js.undefined)
        ret
    }
    @scala.inline
    def withIsLossy(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isLossy")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsLossy: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isLossy")(js.undefined)
        ret
    }
    @scala.inline
    def withWeirdFrameTruncation(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("weirdFrameTruncation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWeirdFrameTruncation: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("weirdFrameTruncation")(js.undefined)
        ret
    }
  }
  
}

