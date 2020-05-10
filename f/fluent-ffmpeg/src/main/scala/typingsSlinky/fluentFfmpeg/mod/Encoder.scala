package typingsSlinky.fluentFfmpeg.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Encoder extends js.Object {
  var description: String = js.native
  var directRendering: Boolean = js.native
  var drawHorizBand: Boolean = js.native
  var experimental: Boolean = js.native
  var frameMT: Boolean = js.native
  var sliceMT: Boolean = js.native
  var `type`: String = js.native
}

object Encoder {
  @scala.inline
  def apply(
    description: String,
    directRendering: Boolean,
    drawHorizBand: Boolean,
    experimental: Boolean,
    frameMT: Boolean,
    sliceMT: Boolean,
    `type`: String
  ): Encoder = {
    val __obj = js.Dynamic.literal(description = description.asInstanceOf[js.Any], directRendering = directRendering.asInstanceOf[js.Any], drawHorizBand = drawHorizBand.asInstanceOf[js.Any], experimental = experimental.asInstanceOf[js.Any], frameMT = frameMT.asInstanceOf[js.Any], sliceMT = sliceMT.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Encoder]
  }
  @scala.inline
  implicit class EncoderOps[Self <: Encoder] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDescription(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("description")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDirectRendering(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("directRendering")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDrawHorizBand(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("drawHorizBand")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withExperimental(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("experimental")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFrameMT(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("frameMT")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSliceMT(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sliceMT")(value.asInstanceOf[js.Any])
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

