package typingsSlinky.aframe.mod.THREE

import typingsSlinky.three.webGLRendererMod.WebGLRendererParameters
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("aframe", "THREE.WebGLProgram")
@js.native
class WebGLProgram protected ()
  extends typingsSlinky.three.mod.WebGLProgram {
  def this(
    renderer: typingsSlinky.three.webGLRendererMod.WebGLRenderer,
    extensions: typingsSlinky.three.webGLExtensionsMod.WebGLExtensions,
    code: String,
    material: typingsSlinky.three.shaderMaterialMod.ShaderMaterial,
    shader: typingsSlinky.three.webGLShaderMod.WebGLShader,
    parameters: WebGLRendererParameters
  ) = this()
}

