package typingsSlinky.cesium.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Flat extends js.Object {
  var closed: js.UndefOr[Boolean] = js.native
  var faceForward: js.UndefOr[Boolean] = js.native
  var flat: js.UndefOr[Boolean] = js.native
  var fragmentShaderSource: js.UndefOr[String] = js.native
  var renderState: js.UndefOr[typingsSlinky.cesium.mod.RenderState] = js.native
  var translucent: js.UndefOr[Boolean] = js.native
  var vertexShaderSource: js.UndefOr[String] = js.native
}

object Flat {
  @scala.inline
  def apply(): Flat = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Flat]
  }
  @scala.inline
  implicit class FlatOps[Self <: Flat] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withClosed(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("closed")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClosed: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("closed")(js.undefined)
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
    def withRenderState(value: typingsSlinky.cesium.mod.RenderState): Self = {
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

