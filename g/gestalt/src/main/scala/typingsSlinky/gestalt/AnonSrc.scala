package typingsSlinky.gestalt

import typingsSlinky.gestalt.gestaltStrings.videoSlashm3u8
import typingsSlinky.gestalt.gestaltStrings.videoSlashmp4
import typingsSlinky.gestalt.gestaltStrings.videoSlashogg
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonSrc extends js.Object {
  var src: String = js.native
  var `type`: videoSlashm3u8 | videoSlashmp4 | videoSlashogg = js.native
}

object AnonSrc {
  @scala.inline
  def apply(src: String, `type`: videoSlashm3u8 | videoSlashmp4 | videoSlashogg): AnonSrc = {
    val __obj = js.Dynamic.literal(src = src.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonSrc]
  }
  @scala.inline
  implicit class AnonSrcOps[Self <: AnonSrc] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withSrc(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("src")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withType(value: videoSlashm3u8 | videoSlashmp4 | videoSlashogg): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

