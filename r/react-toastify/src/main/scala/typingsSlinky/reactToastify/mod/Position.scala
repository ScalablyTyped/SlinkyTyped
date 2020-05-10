package typingsSlinky.reactToastify.mod

import typingsSlinky.reactToastify.reactToastifyStrings.`bottom-center`
import typingsSlinky.reactToastify.reactToastifyStrings.`bottom-left`
import typingsSlinky.reactToastify.reactToastifyStrings.`bottom-right`
import typingsSlinky.reactToastify.reactToastifyStrings.`top-center`
import typingsSlinky.reactToastify.reactToastifyStrings.`top-left`
import typingsSlinky.reactToastify.reactToastifyStrings.`top-right`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Position extends js.Object {
  /**
    * Set the position to `'bottom-center'`
    */
  var BOTTOM_CENTER: `bottom-center` = js.native
  /**
    * Set the position to `'bottom-left'`
    */
  var BOTTOM_LEFT: `bottom-left` = js.native
  /**
    * Set the position to `'bottom-right'`
    */
  var BOTTOM_RIGHT: `bottom-right` = js.native
  /**
    * Set the position to `'top-center'`
    */
  var TOP_CENTER: `top-center` = js.native
  /**
    * Set the position to `'top-left'`
    */
  var TOP_LEFT: `top-left` = js.native
  /**
    * Set the position to `'top-right'`
    */
  var TOP_RIGHT: `top-right` = js.native
}

object Position {
  @scala.inline
  def apply(
    BOTTOM_CENTER: `bottom-center`,
    BOTTOM_LEFT: `bottom-left`,
    BOTTOM_RIGHT: `bottom-right`,
    TOP_CENTER: `top-center`,
    TOP_LEFT: `top-left`,
    TOP_RIGHT: `top-right`
  ): Position = {
    val __obj = js.Dynamic.literal(BOTTOM_CENTER = BOTTOM_CENTER.asInstanceOf[js.Any], BOTTOM_LEFT = BOTTOM_LEFT.asInstanceOf[js.Any], BOTTOM_RIGHT = BOTTOM_RIGHT.asInstanceOf[js.Any], TOP_CENTER = TOP_CENTER.asInstanceOf[js.Any], TOP_LEFT = TOP_LEFT.asInstanceOf[js.Any], TOP_RIGHT = TOP_RIGHT.asInstanceOf[js.Any])
    __obj.asInstanceOf[Position]
  }
  @scala.inline
  implicit class PositionOps[Self <: Position] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBOTTOM_CENTER(value: `bottom-center`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("BOTTOM_CENTER")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBOTTOM_LEFT(value: `bottom-left`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("BOTTOM_LEFT")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBOTTOM_RIGHT(value: `bottom-right`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("BOTTOM_RIGHT")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTOP_CENTER(value: `top-center`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TOP_CENTER")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTOP_LEFT(value: `top-left`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TOP_LEFT")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTOP_RIGHT(value: `top-right`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TOP_RIGHT")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

