package typingsSlinky.babylonjs.BABYLON

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IShaderMaterialOptions extends js.Object {
  /**
    * The list of attribute names used in the shader
    */
  var attributes: js.Array[String] = js.native
  /**
    * The list of defines used in the shader
    */
  var defines: js.Array[String] = js.native
  /**
    * Does the material work in alpha blend mode
    */
  var needAlphaBlending: Boolean = js.native
  /**
    * Does the material work in alpha test mode
    */
  var needAlphaTesting: Boolean = js.native
  /**
    * The list of sampler names used in the shader
    */
  var samplers: js.Array[String] = js.native
  /**
    * The list of UBO names used in the shader
    */
  var uniformBuffers: js.Array[String] = js.native
  /**
    * The list of unifrom names used in the shader
    */
  var uniforms: js.Array[String] = js.native
}

object IShaderMaterialOptions {
  @scala.inline
  def apply(
    attributes: js.Array[String],
    defines: js.Array[String],
    needAlphaBlending: Boolean,
    needAlphaTesting: Boolean,
    samplers: js.Array[String],
    uniformBuffers: js.Array[String],
    uniforms: js.Array[String]
  ): IShaderMaterialOptions = {
    val __obj = js.Dynamic.literal(attributes = attributes.asInstanceOf[js.Any], defines = defines.asInstanceOf[js.Any], needAlphaBlending = needAlphaBlending.asInstanceOf[js.Any], needAlphaTesting = needAlphaTesting.asInstanceOf[js.Any], samplers = samplers.asInstanceOf[js.Any], uniformBuffers = uniformBuffers.asInstanceOf[js.Any], uniforms = uniforms.asInstanceOf[js.Any])
    __obj.asInstanceOf[IShaderMaterialOptions]
  }
  @scala.inline
  implicit class IShaderMaterialOptionsOps[Self <: IShaderMaterialOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAttributes(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("attributes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDefines(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defines")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNeedAlphaBlending(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("needAlphaBlending")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNeedAlphaTesting(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("needAlphaTesting")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSamplers(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("samplers")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUniformBuffers(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("uniformBuffers")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUniforms(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("uniforms")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

