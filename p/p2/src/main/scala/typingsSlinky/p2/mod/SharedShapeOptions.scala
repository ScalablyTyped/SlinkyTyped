package typingsSlinky.p2.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SharedShapeOptions extends js.Object {
  var angle: js.UndefOr[Double] = js.native
  var collisionGroup: js.UndefOr[Double] = js.native
  var collisionMask: js.UndefOr[Double] = js.native
  var collisionResponse: js.UndefOr[Boolean] = js.native
  var position: js.UndefOr[js.Tuple2[Double, Double]] = js.native
  var sensor: js.UndefOr[Boolean] = js.native
}

object SharedShapeOptions {
  @scala.inline
  def apply(): SharedShapeOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SharedShapeOptions]
  }
  @scala.inline
  implicit class SharedShapeOptionsOps[Self <: SharedShapeOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAngle(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("angle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAngle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("angle")(js.undefined)
        ret
    }
    @scala.inline
    def withCollisionGroup(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("collisionGroup")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCollisionGroup: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("collisionGroup")(js.undefined)
        ret
    }
    @scala.inline
    def withCollisionMask(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("collisionMask")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCollisionMask: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("collisionMask")(js.undefined)
        ret
    }
    @scala.inline
    def withCollisionResponse(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("collisionResponse")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCollisionResponse: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("collisionResponse")(js.undefined)
        ret
    }
    @scala.inline
    def withPosition(value: js.Tuple2[Double, Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("position")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPosition: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("position")(js.undefined)
        ret
    }
    @scala.inline
    def withSensor(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sensor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSensor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sensor")(js.undefined)
        ret
    }
  }
  
}

