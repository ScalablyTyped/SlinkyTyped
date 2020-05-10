package typingsSlinky.mapsjs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait envObject extends js.Object {
  /**
  	 * @returns {number} maxX coord as integer
  	 */
  var maxX: Double = js.native
  /**
  	 * @returns {number} maxY coord as integer
  	 */
  var maxY: Double = js.native
  /**
  	 * @returns {number} minX as integer
  	 */
  var minX: Double = js.native
  /**
  	 * @returns {number} minY coord as integer
  	 */
  var minY: Double = js.native
}

object envObject {
  @scala.inline
  def apply(maxX: Double, maxY: Double, minX: Double, minY: Double): envObject = {
    val __obj = js.Dynamic.literal(maxX = maxX.asInstanceOf[js.Any], maxY = maxY.asInstanceOf[js.Any], minX = minX.asInstanceOf[js.Any], minY = minY.asInstanceOf[js.Any])
    __obj.asInstanceOf[envObject]
  }
  @scala.inline
  implicit class envObjectOps[Self <: envObject] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withMaxX(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxX")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMaxY(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxY")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMinX(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minX")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMinY(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minY")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

