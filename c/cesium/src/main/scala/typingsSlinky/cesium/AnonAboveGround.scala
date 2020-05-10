package typingsSlinky.cesium

import typingsSlinky.cesium.mod.Material
import typingsSlinky.cesium.mod.RenderState
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonAboveGround extends js.Object {
  var aboveGround: js.UndefOr[Boolean] = js.native
  var faceForward: js.UndefOr[Boolean] = js.native
  var flat: js.UndefOr[Boolean] = js.native
  var fragmentShaderSource: js.UndefOr[String] = js.native
  var material: js.UndefOr[Material] = js.native
  var renderState: js.UndefOr[RenderState] = js.native
  var translucent: js.UndefOr[Boolean] = js.native
  var vertexShaderSource: js.UndefOr[String] = js.native
}

object AnonAboveGround {
  @scala.inline
  def apply(): AnonAboveGround = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnonAboveGround]
  }
  @scala.inline
  implicit class AnonAboveGroundOps[Self <: AnonAboveGround] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAboveGround(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("aboveGround")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAboveGround: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("aboveGround")(js.undefined)
        ret
    }
    @scala.inline
    def withFaceForward(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("faceForward")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFaceForward: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("faceForward")(js.undefined)
        ret
    }
    @scala.inline
    def withFlat(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("flat")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFlat: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("flat")(js.undefined)
        ret
    }
    @scala.inline
    def withFragmentShaderSource(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fragmentShaderSource")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFragmentShaderSource: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fragmentShaderSource")(js.undefined)
        ret
    }
    @scala.inline
    def withMaterial(value: Material): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("material")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaterial: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("material")(js.undefined)
        ret
    }
    @scala.inline
    def withRenderState(value: RenderState): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("renderState")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRenderState: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("renderState")(js.undefined)
        ret
    }
    @scala.inline
    def withTranslucent(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("translucent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTranslucent: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("translucent")(js.undefined)
        ret
    }
    @scala.inline
    def withVertexShaderSource(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("vertexShaderSource")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVertexShaderSource: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("vertexShaderSource")(js.undefined)
        ret
    }
  }
  
}

