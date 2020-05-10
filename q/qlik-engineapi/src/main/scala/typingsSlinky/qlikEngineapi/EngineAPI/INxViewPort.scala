package typingsSlinky.qlikEngineapi.EngineAPI

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * NxViewPort...
  */
@js.native
trait INxViewPort extends js.Object {
  /**
    * Height of the canvas in pixels.
    */
  var qHeight: Double = js.native
  /**
    * Width of the canvas in pixels.
    */
  var qWidth: Double = js.native
  /*
    * Zoom level.
    */
  var qZoomLevel: Double = js.native
}

object INxViewPort {
  @scala.inline
  def apply(qHeight: Double, qWidth: Double, qZoomLevel: Double): INxViewPort = {
    val __obj = js.Dynamic.literal(qHeight = qHeight.asInstanceOf[js.Any], qWidth = qWidth.asInstanceOf[js.Any], qZoomLevel = qZoomLevel.asInstanceOf[js.Any])
    __obj.asInstanceOf[INxViewPort]
  }
  @scala.inline
  implicit class INxViewPortOps[Self <: INxViewPort] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withQHeight(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("qHeight")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withQWidth(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("qWidth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withQZoomLevel(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("qZoomLevel")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

