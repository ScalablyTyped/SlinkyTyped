package typingsSlinky.cesium

import typingsSlinky.cesium.mod.RenderState
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonAttributeName extends js.Object {
  var attributeName: String = js.native
  var fragmentShaderSource: js.UndefOr[String] = js.native
  var glslDatatype: js.UndefOr[String] = js.native
  var renderState: js.UndefOr[RenderState] = js.native
  var vertexShaderSource: js.UndefOr[String] = js.native
}

object AnonAttributeName {
  @scala.inline
  def apply(attributeName: String): AnonAttributeName = {
    val __obj = js.Dynamic.literal(attributeName = attributeName.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonAttributeName]
  }
  @scala.inline
  implicit class AnonAttributeNameOps[Self <: AnonAttributeName] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAttributeName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("attributeName")(value.asInstanceOf[js.Any])
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
    def withGlslDatatype(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("glslDatatype")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGlslDatatype: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("glslDatatype")(js.undefined)
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

