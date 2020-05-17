package typingsSlinky.pixiJs.anon

import typingsSlinky.std.EXTTextureFilterAnisotropic
import typingsSlinky.std.OESTextureFloat
import typingsSlinky.std.OESVertexArrayObject
import typingsSlinky.std.WEBGLDepthTexture
import typingsSlinky.std.WEBGLDrawBuffers
import typingsSlinky.std.WEBGLLoseContext
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnisotropicFiltering extends js.Object {
  var anisotropicFiltering: EXTTextureFilterAnisotropic = js.native
  var depthTexture: WEBGLDepthTexture = js.native
  var drawBuffers: WEBGLDrawBuffers = js.native
  var floatTexture: OESTextureFloat = js.native
  var loseContext: WEBGLLoseContext = js.native
  var vertexArrayObject: OESVertexArrayObject = js.native
}

object AnisotropicFiltering {
  @scala.inline
  def apply(
    anisotropicFiltering: EXTTextureFilterAnisotropic,
    depthTexture: WEBGLDepthTexture,
    drawBuffers: WEBGLDrawBuffers,
    floatTexture: OESTextureFloat,
    loseContext: WEBGLLoseContext,
    vertexArrayObject: OESVertexArrayObject
  ): AnisotropicFiltering = {
    val __obj = js.Dynamic.literal(anisotropicFiltering = anisotropicFiltering.asInstanceOf[js.Any], depthTexture = depthTexture.asInstanceOf[js.Any], drawBuffers = drawBuffers.asInstanceOf[js.Any], floatTexture = floatTexture.asInstanceOf[js.Any], loseContext = loseContext.asInstanceOf[js.Any], vertexArrayObject = vertexArrayObject.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnisotropicFiltering]
  }
  @scala.inline
  implicit class AnisotropicFilteringOps[Self <: AnisotropicFiltering] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAnisotropicFiltering(value: EXTTextureFilterAnisotropic): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("anisotropicFiltering")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDepthTexture(value: WEBGLDepthTexture): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("depthTexture")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDrawBuffers(value: WEBGLDrawBuffers): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("drawBuffers")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFloatTexture(value: OESTextureFloat): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("floatTexture")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLoseContext(value: WEBGLLoseContext): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("loseContext")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withVertexArrayObject(value: OESVertexArrayObject): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("vertexArrayObject")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

