package typingsSlinky.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The client-side equivalent of the CrosshairLabelPosition class.
  */
@js.native
trait ASPxClientCrosshairPosition extends js.Object {
  /**
    * Gets the horizontal offset of a crosshair cursor.
    */
  var offsetX: Double = js.native
  /**
    * Gets the vertical offset of a crosshair cursor.
    */
  var offsetY: Double = js.native
}

object ASPxClientCrosshairPosition {
  @scala.inline
  def apply(offsetX: Double, offsetY: Double): ASPxClientCrosshairPosition = {
    val __obj = js.Dynamic.literal(offsetX = offsetX.asInstanceOf[js.Any], offsetY = offsetY.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientCrosshairPosition]
  }
  @scala.inline
  implicit class ASPxClientCrosshairPositionOps[Self <: ASPxClientCrosshairPosition] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withOffsetX(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("offsetX")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOffsetY(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("offsetY")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

