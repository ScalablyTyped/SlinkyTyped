package typingsSlinky.gapiYoutube.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CornerPosition extends js.Object {
  /**
    * The corner of the player where the promoted item will appear.
    */
  var cornerPosition: String = js.native
  /**
    * The manner in which the promoted item is positioned in the video player.
    */
  var `type`: String = js.native
}

object CornerPosition {
  @scala.inline
  def apply(cornerPosition: String, `type`: String): CornerPosition = {
    val __obj = js.Dynamic.literal(cornerPosition = cornerPosition.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[CornerPosition]
  }
  @scala.inline
  implicit class CornerPositionOps[Self <: CornerPosition] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCornerPosition(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cornerPosition")(value.asInstanceOf[js.Any])
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

