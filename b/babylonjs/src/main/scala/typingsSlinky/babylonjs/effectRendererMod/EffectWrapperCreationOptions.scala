package typingsSlinky.babylonjs.effectRendererMod

import typingsSlinky.babylonjs.thinEngineMod.ThinEngine
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Options to create an EffectWrapper
  */
@js.native
trait EffectWrapperCreationOptions extends js.Object {
  /**
    * Attributes to use in the shader
    */
  var attributeNames: js.UndefOr[js.Array[String]] = js.native
  /**
    * Engine to use to create the effect
    */
  var engine: ThinEngine = js.native
  /**
    * Fragment shader for the effect
    */
  var fragmentShader: String = js.native
  /**
    * The friendly name of the effect displayed in Spector.
    */
  var name: js.UndefOr[String] = js.native
  /**
    * Texture sampler names to use in the shader
    */
  var samplerNames: js.UndefOr[js.Array[String]] = js.native
  /**
    * Uniforms to use in the shader
    */
  var uniformNames: js.UndefOr[js.Array[String]] = js.native
  /**
    * Vertex shader for the effect
    */
  var vertexShader: js.UndefOr[String] = js.native
}

object EffectWrapperCreationOptions {
  @scala.inline
  def apply(engine: ThinEngine, fragmentShader: String): EffectWrapperCreationOptions = {
    val __obj = js.Dynamic.literal(engine = engine.asInstanceOf[js.Any], fragmentShader = fragmentShader.asInstanceOf[js.Any])
    __obj.asInstanceOf[EffectWrapperCreationOptions]
  }
  @scala.inline
  implicit class EffectWrapperCreationOptionsOps[Self <: EffectWrapperCreationOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEngine(value: ThinEngine): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("engine")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFragmentShader(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fragmentShader")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAttributeNames(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("attributeNames")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAttributeNames: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("attributeNames")(js.undefined)
        ret
    }
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(js.undefined)
        ret
    }
    @scala.inline
    def withSamplerNames(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("samplerNames")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSamplerNames: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("samplerNames")(js.undefined)
        ret
    }
    @scala.inline
    def withUniformNames(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("uniformNames")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUniformNames: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("uniformNames")(js.undefined)
        ret
    }
    @scala.inline
    def withVertexShader(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("vertexShader")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVertexShader: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("vertexShader")(js.undefined)
        ret
    }
  }
  
}

