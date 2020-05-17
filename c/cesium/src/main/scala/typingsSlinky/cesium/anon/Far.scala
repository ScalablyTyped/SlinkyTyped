package typingsSlinky.cesium.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Far extends js.Object {
  var aspectRatio: Double = js.native
  var far: Double = js.native
  var fov: Double = js.native
  var near: Double = js.native
  var xOffset: Double = js.native
  var yOffset: Double = js.native
}

object Far {
  @scala.inline
  def apply(aspectRatio: Double, far: Double, fov: Double, near: Double, xOffset: Double, yOffset: Double): Far = {
    val __obj = js.Dynamic.literal(aspectRatio = aspectRatio.asInstanceOf[js.Any], far = far.asInstanceOf[js.Any], fov = fov.asInstanceOf[js.Any], near = near.asInstanceOf[js.Any], xOffset = xOffset.asInstanceOf[js.Any], yOffset = yOffset.asInstanceOf[js.Any])
    __obj.asInstanceOf[Far]
  }
  @scala.inline
  implicit class FarOps[Self <: Far] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAspectRatio(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("aspectRatio")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFar(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("far")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFov(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fov")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNear(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("near")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withXOffset(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("xOffset")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withYOffset(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("yOffset")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

