package typingsSlinky.makerJs.MakerJs.measure

import typingsSlinky.makerJs.MakerJs.IModel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A hexagon which surrounds a model.
  */
@js.native
trait IBoundingHex extends IModel {
  /**
    * Radius of the hexagon, which is also the length of a side.
    */
  var radius: Double = js.native
}

object IBoundingHex {
  @scala.inline
  def apply(radius: Double): IBoundingHex = {
    val __obj = js.Dynamic.literal(radius = radius.asInstanceOf[js.Any])
    __obj.asInstanceOf[IBoundingHex]
  }
  @scala.inline
  implicit class IBoundingHexOps[Self <: IBoundingHex] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withRadius(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("radius")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

