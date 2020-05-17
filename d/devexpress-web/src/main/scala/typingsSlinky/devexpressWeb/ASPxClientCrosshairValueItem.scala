package typingsSlinky.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The client-side equivalent of the CrosshairValueItem class.
  */
@js.native
trait ASPxClientCrosshairValueItem extends js.Object {
  /**
    * Gets an index of a point for which this crosshair value item is displayed.
    */
  var pointIndex: Double = js.native
  /**
    * Gets the value that is displayed in a crosshair label.
    */
  var value: Double = js.native
}

object ASPxClientCrosshairValueItem {
  @scala.inline
  def apply(pointIndex: Double, value: Double): ASPxClientCrosshairValueItem = {
    val __obj = js.Dynamic.literal(pointIndex = pointIndex.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientCrosshairValueItem]
  }
  @scala.inline
  implicit class ASPxClientCrosshairValueItemOps[Self <: ASPxClientCrosshairValueItem] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withPointIndex(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pointIndex")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withValue(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("value")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

