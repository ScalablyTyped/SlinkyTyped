package typingsSlinky.reactAlert.mod

import typingsSlinky.reactAlert.reactAlertStrings.`bottom center`
import typingsSlinky.reactAlert.reactAlertStrings.`bottom left`
import typingsSlinky.reactAlert.reactAlertStrings.`bottom right`
import typingsSlinky.reactAlert.reactAlertStrings.`middle left`
import typingsSlinky.reactAlert.reactAlertStrings.`middle right`
import typingsSlinky.reactAlert.reactAlertStrings.`top center`
import typingsSlinky.reactAlert.reactAlertStrings.`top left`
import typingsSlinky.reactAlert.reactAlertStrings.`top right`
import typingsSlinky.reactAlert.reactAlertStrings.middle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Positions_ extends js.Object {
  var BOTTOM_CENTER: `bottom center` = js.native
  var BOTTOM_LEFT: `bottom left` = js.native
  var BOTTOM_RIGHT: `bottom right` = js.native
  var MIDDLE: middle = js.native
  var MIDDLE_LEFT: `middle left` = js.native
  var MIDDLE_RIGHT: `middle right` = js.native
  var TOP_CENTER: `top center` = js.native
  var TOP_LEFT: `top left` = js.native
  var TOP_RIGHT: `top right` = js.native
}

object Positions_ {
  @scala.inline
  def apply(
    BOTTOM_CENTER: `bottom center`,
    BOTTOM_LEFT: `bottom left`,
    BOTTOM_RIGHT: `bottom right`,
    MIDDLE: middle,
    MIDDLE_LEFT: `middle left`,
    MIDDLE_RIGHT: `middle right`,
    TOP_CENTER: `top center`,
    TOP_LEFT: `top left`,
    TOP_RIGHT: `top right`
  ): Positions_ = {
    val __obj = js.Dynamic.literal(BOTTOM_CENTER = BOTTOM_CENTER.asInstanceOf[js.Any], BOTTOM_LEFT = BOTTOM_LEFT.asInstanceOf[js.Any], BOTTOM_RIGHT = BOTTOM_RIGHT.asInstanceOf[js.Any], MIDDLE = MIDDLE.asInstanceOf[js.Any], MIDDLE_LEFT = MIDDLE_LEFT.asInstanceOf[js.Any], MIDDLE_RIGHT = MIDDLE_RIGHT.asInstanceOf[js.Any], TOP_CENTER = TOP_CENTER.asInstanceOf[js.Any], TOP_LEFT = TOP_LEFT.asInstanceOf[js.Any], TOP_RIGHT = TOP_RIGHT.asInstanceOf[js.Any])
    __obj.asInstanceOf[Positions_]
  }
  @scala.inline
  implicit class Positions_Ops[Self <: Positions_] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBOTTOM_CENTER(value: `bottom center`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("BOTTOM_CENTER")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBOTTOM_LEFT(value: `bottom left`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("BOTTOM_LEFT")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBOTTOM_RIGHT(value: `bottom right`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("BOTTOM_RIGHT")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMIDDLE(value: middle): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MIDDLE")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMIDDLE_LEFT(value: `middle left`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MIDDLE_LEFT")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMIDDLE_RIGHT(value: `middle right`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MIDDLE_RIGHT")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTOP_CENTER(value: `top center`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TOP_CENTER")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTOP_LEFT(value: `top left`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TOP_LEFT")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTOP_RIGHT(value: `top right`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TOP_RIGHT")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

