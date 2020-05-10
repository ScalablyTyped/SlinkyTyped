package typingsSlinky.babylonjs.BABYLON

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IEffectCreationOptions extends js.Object {
  /**
    * Atrributes that will be used in the shader.
    */
  var attributes: js.Array[String] = js.native
  /**
    * Define statements that will be set in the shader.
    */
  var defines: js.Any = js.native
  /**
    * Possible fallbacks for this effect to improve performance when needed.
    */
  var fallbacks: Nullable[IEffectFallbacks] = js.native
  /**
    * Parameters to be used with Babylons include syntax to iterate over an array (eg. {lights: 10})
    */
  var indexParameters: js.UndefOr[js.Any] = js.native
  /**
    * Max number of lights that can be used in the shader.
    */
  var maxSimultaneousLights: js.UndefOr[Double] = js.native
  /**
    * Callback that will be called when the shader is compiled.
    */
  var onCompiled: Nullable[js.Function1[/* effect */ Effect, Unit]] = js.native
  /**
    * Callback that will be called if an error occurs during shader compilation.
    */
  var onError: Nullable[js.Function2[/* effect */ Effect, /* errors */ String, Unit]] = js.native
  /**
    * Sampler texture variable names that will be set in the shader.
    */
  var samplers: js.Array[String] = js.native
  /**
    * See https://developer.mozilla.org/en-US/docs/Web/API/WebGL2RenderingContext/transformFeedbackVaryings
    */
  var transformFeedbackVaryings: js.UndefOr[Nullable[js.Array[String]]] = js.native
  /**
    * Uniform buffer variable names that will be set in the shader.
    */
  var uniformBuffersNames: js.Array[String] = js.native
  /**
    * Uniform varible names that will be set in the shader.
    */
  var uniformsNames: js.Array[String] = js.native
}

object IEffectCreationOptions {
  @scala.inline
  def apply(
    attributes: js.Array[String],
    defines: js.Any,
    samplers: js.Array[String],
    uniformBuffersNames: js.Array[String],
    uniformsNames: js.Array[String]
  ): IEffectCreationOptions = {
    val __obj = js.Dynamic.literal(attributes = attributes.asInstanceOf[js.Any], defines = defines.asInstanceOf[js.Any], samplers = samplers.asInstanceOf[js.Any], uniformBuffersNames = uniformBuffersNames.asInstanceOf[js.Any], uniformsNames = uniformsNames.asInstanceOf[js.Any])
    __obj.asInstanceOf[IEffectCreationOptions]
  }
  @scala.inline
  implicit class IEffectCreationOptionsOps[Self <: IEffectCreationOptions] (val x: Self) extends AnyVal {
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
    def withDefines(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defines")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSamplers(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("samplers")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUniformBuffersNames(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("uniformBuffersNames")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUniformsNames(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("uniformsNames")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFallbacks(value: Nullable[IEffectFallbacks]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fallbacks")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFallbacksNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fallbacks")(null)
        ret
    }
    @scala.inline
    def withIndexParameters(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("indexParameters")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIndexParameters: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("indexParameters")(js.undefined)
        ret
    }
    @scala.inline
    def withMaxSimultaneousLights(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxSimultaneousLights")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxSimultaneousLights: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxSimultaneousLights")(js.undefined)
        ret
    }
    @scala.inline
    def withOnCompiled(value: /* effect */ Effect => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onCompiled")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withOnCompiledNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onCompiled")(null)
        ret
    }
    @scala.inline
    def withOnError(value: (/* effect */ Effect, /* errors */ String) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onError")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withOnErrorNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onError")(null)
        ret
    }
    @scala.inline
    def withTransformFeedbackVaryings(value: Nullable[js.Array[String]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transformFeedbackVaryings")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTransformFeedbackVaryings: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transformFeedbackVaryings")(js.undefined)
        ret
    }
    @scala.inline
    def withTransformFeedbackVaryingsNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transformFeedbackVaryings")(null)
        ret
    }
  }
  
}

