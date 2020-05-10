package typingsSlinky.qlikEngineapi.EngineAPI

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Point...
  */
@js.native
trait IPoint extends js.Object {
  /**
    * x-coordinate in pixels.
    * The origin is the top left of the screen.
    */
  var qx: Double = js.native
  /**
    * y-coordinate in pixels.
    * The origin is the top left of the screen.
    */
  var qy: Double = js.native
}

object IPoint {
  @scala.inline
  def apply(qx: Double, qy: Double): IPoint = {
    val __obj = js.Dynamic.literal(qx = qx.asInstanceOf[js.Any], qy = qy.asInstanceOf[js.Any])
    __obj.asInstanceOf[IPoint]
  }
  @scala.inline
  implicit class IPointOps[Self <: IPoint] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withQx(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("qx")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withQy(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("qy")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

