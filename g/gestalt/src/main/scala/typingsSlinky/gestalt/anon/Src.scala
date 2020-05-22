package typingsSlinky.gestalt.anon

import typingsSlinky.gestalt.gestaltStrings.videoSlashm3u8
import typingsSlinky.gestalt.gestaltStrings.videoSlashmp4
import typingsSlinky.gestalt.gestaltStrings.videoSlashogg
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Src extends js.Object {
  var src: String
  var `type`: videoSlashm3u8 | videoSlashmp4 | videoSlashogg
}

object Src {
  @scala.inline
  def apply(src: String, `type`: videoSlashm3u8 | videoSlashmp4 | videoSlashogg): Src = {
    val __obj = js.Dynamic.literal(src = src.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Src]
  }
}

