package typingsSlinky.babylonjs.ispritesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ISpriteJSONSpriteFrameData extends js.Object {
  /**
    * number of the height of the Frame
    */
  var h: Double = js.native
  /**
    * number of the width of the Frame
    */
  var w: Double = js.native
  /**
    * number of the x offset of the Frame
    */
  var x: Double = js.native
  /**
    * number of the y offset of the Frame
    */
  var y: Double = js.native
}

object ISpriteJSONSpriteFrameData {
  @scala.inline
  def apply(h: Double, w: Double, x: Double, y: Double): ISpriteJSONSpriteFrameData = {
    val __obj = js.Dynamic.literal(h = h.asInstanceOf[js.Any], w = w.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
    __obj.asInstanceOf[ISpriteJSONSpriteFrameData]
  }
  @scala.inline
  implicit class ISpriteJSONSpriteFrameDataOps[Self <: ISpriteJSONSpriteFrameData] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withH(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("h")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withW(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("w")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withX(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("x")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withY(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("y")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

