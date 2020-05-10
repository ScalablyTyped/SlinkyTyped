package typingsSlinky.googleapis.youtubeV3Mod.youtubeV3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Describes the spatial position of a visual widget inside a video. It is a
  * union of various position types, out of which only will be set one.
  */
@js.native
trait SchemaInvideoPosition extends js.Object {
  /**
    * Describes in which corner of the video the visual widget will appear.
    */
  var cornerPosition: js.UndefOr[String] = js.native
  /**
    * Defines the position type.
    */
  var `type`: js.UndefOr[String] = js.native
}

object SchemaInvideoPosition {
  @scala.inline
  def apply(): SchemaInvideoPosition = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaInvideoPosition]
  }
  @scala.inline
  implicit class SchemaInvideoPositionOps[Self <: SchemaInvideoPosition] (val x: Self) extends AnyVal {
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
    def withoutCornerPosition: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cornerPosition")(js.undefined)
        ret
    }
    @scala.inline
    def withType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(js.undefined)
        ret
    }
  }
  
}

