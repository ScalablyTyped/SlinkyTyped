package typingsSlinky.babylonjs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait VREyeParameters extends js.Object {
  /** @deprecated */
  val fieldOfView: VRFieldOfView = js.native
  val offset: js.typedarray.Float32Array = js.native
  val renderHeight: Double = js.native
  val renderWidth: Double = js.native
}

object VREyeParameters {
  @scala.inline
  def apply(
    fieldOfView: VRFieldOfView,
    offset: js.typedarray.Float32Array,
    renderHeight: Double,
    renderWidth: Double
  ): VREyeParameters = {
    val __obj = js.Dynamic.literal(fieldOfView = fieldOfView.asInstanceOf[js.Any], offset = offset.asInstanceOf[js.Any], renderHeight = renderHeight.asInstanceOf[js.Any], renderWidth = renderWidth.asInstanceOf[js.Any])
    __obj.asInstanceOf[VREyeParameters]
  }
  @scala.inline
  implicit class VREyeParametersOps[Self <: VREyeParameters] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFieldOfView(value: VRFieldOfView): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fieldOfView")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOffset(value: js.typedarray.Float32Array): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("offset")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRenderHeight(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("renderHeight")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRenderWidth(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("renderWidth")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

