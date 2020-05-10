package typingsSlinky.ol.webglLayerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WebGLWorkerGenerateBuffersMessage extends js.Object {
  var customAttributesCount: js.UndefOr[Double] = js.native
  var indexBuffer: js.UndefOr[js.typedarray.ArrayBuffer] = js.native
  var renderInstructions: js.typedarray.ArrayBuffer = js.native
  var `type`: WebGLWorkerMessageType = js.native
  var vertexBuffer: js.UndefOr[js.typedarray.ArrayBuffer] = js.native
}

object WebGLWorkerGenerateBuffersMessage {
  @scala.inline
  def apply(renderInstructions: js.typedarray.ArrayBuffer, `type`: WebGLWorkerMessageType): WebGLWorkerGenerateBuffersMessage = {
    val __obj = js.Dynamic.literal(renderInstructions = renderInstructions.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[WebGLWorkerGenerateBuffersMessage]
  }
  @scala.inline
  implicit class WebGLWorkerGenerateBuffersMessageOps[Self <: WebGLWorkerGenerateBuffersMessage] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withRenderInstructions(value: js.typedarray.ArrayBuffer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("renderInstructions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withType(value: WebGLWorkerMessageType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCustomAttributesCount(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("customAttributesCount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCustomAttributesCount: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("customAttributesCount")(js.undefined)
        ret
    }
    @scala.inline
    def withIndexBuffer(value: js.typedarray.ArrayBuffer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("indexBuffer")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIndexBuffer: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("indexBuffer")(js.undefined)
        ret
    }
    @scala.inline
    def withVertexBuffer(value: js.typedarray.ArrayBuffer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("vertexBuffer")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVertexBuffer: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("vertexBuffer")(js.undefined)
        ret
    }
  }
  
}

