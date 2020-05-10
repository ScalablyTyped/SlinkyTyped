package typingsSlinky.babylonjs.shadowGeneratorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ICustomShaderOptions extends js.Object {
  /**
    * The list of attribute names used in the shader
    */
  var attributes: js.UndefOr[js.Array[String]] = js.native
  /**
    * The list of defines used in the shader
    */
  var defines: js.UndefOr[js.Array[String]] = js.native
  /**
    * The list of sampler names used in the shader
    */
  var samplers: js.UndefOr[js.Array[String]] = js.native
  /**
    * Gets or sets the custom shader name to use
    */
  var shaderName: String = js.native
  /**
    * The list of unifrom names used in the shader
    */
  var uniforms: js.UndefOr[js.Array[String]] = js.native
}

object ICustomShaderOptions {
  @scala.inline
  def apply(shaderName: String): ICustomShaderOptions = {
    val __obj = js.Dynamic.literal(shaderName = shaderName.asInstanceOf[js.Any])
    __obj.asInstanceOf[ICustomShaderOptions]
  }
  @scala.inline
  implicit class ICustomShaderOptionsOps[Self <: ICustomShaderOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withShaderName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shaderName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAttributes(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("attributes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAttributes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("attributes")(js.undefined)
        ret
    }
    @scala.inline
    def withDefines(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defines")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDefines: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defines")(js.undefined)
        ret
    }
    @scala.inline
    def withSamplers(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("samplers")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSamplers: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("samplers")(js.undefined)
        ret
    }
    @scala.inline
    def withUniforms(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("uniforms")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUniforms: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("uniforms")(js.undefined)
        ret
    }
  }
  
}

