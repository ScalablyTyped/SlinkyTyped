package typingsSlinky.phaser.Phaser.Types.Physics.Arcade

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ArcadeBodyCollision extends js.Object {
  /**
    * True if the Body is colliding on its lower edge.
    */
  var down: Boolean = js.native
  /**
    * True if the Body is colliding on its left edge.
    */
  var left: Boolean = js.native
  /**
    * True if the Body is not colliding.
    */
  var none: Boolean = js.native
  /**
    * True if the Body is colliding on its right edge.
    */
  var right: Boolean = js.native
  /**
    * True if the Body is colliding on its upper edge.
    */
  var up: Boolean = js.native
}

object ArcadeBodyCollision {
  @scala.inline
  def apply(down: Boolean, left: Boolean, none: Boolean, right: Boolean, up: Boolean): ArcadeBodyCollision = {
    val __obj = js.Dynamic.literal(down = down.asInstanceOf[js.Any], left = left.asInstanceOf[js.Any], none = none.asInstanceOf[js.Any], right = right.asInstanceOf[js.Any], up = up.asInstanceOf[js.Any])
    __obj.asInstanceOf[ArcadeBodyCollision]
  }
  @scala.inline
  implicit class ArcadeBodyCollisionOps[Self <: ArcadeBodyCollision] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDown(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("down")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLeft(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("left")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNone(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("none")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRight(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("right")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUp(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("up")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

