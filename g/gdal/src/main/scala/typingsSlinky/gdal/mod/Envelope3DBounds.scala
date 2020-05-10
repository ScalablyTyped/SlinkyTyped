package typingsSlinky.gdal.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Envelope3DBounds extends EnvelopeBounds {
  var maxZ: Double = js.native
  var minZ: Double = js.native
}

object Envelope3DBounds {
  @scala.inline
  def apply(maxX: Double, maxY: Double, maxZ: Double, minX: Double, minY: Double, minZ: Double): Envelope3DBounds = {
    val __obj = js.Dynamic.literal(maxX = maxX.asInstanceOf[js.Any], maxY = maxY.asInstanceOf[js.Any], maxZ = maxZ.asInstanceOf[js.Any], minX = minX.asInstanceOf[js.Any], minY = minY.asInstanceOf[js.Any], minZ = minZ.asInstanceOf[js.Any])
    __obj.asInstanceOf[Envelope3DBounds]
  }
  @scala.inline
  implicit class Envelope3DBoundsOps[Self <: Envelope3DBounds] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withMaxZ(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxZ")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMinZ(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minZ")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

