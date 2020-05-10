package typingsSlinky.babylonjs.engineCapabilitiesMod

import typingsSlinky.babylonjs.AnonCOMPLETIONSTATUSKHR
import typingsSlinky.babylonjs.EXTDisjointTimerQuery
import typingsSlinky.std.EXTTextureFilterAnisotropic
import typingsSlinky.std.WEBGLCompressedTextureS3tc
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EngineCapabilities extends js.Object {
  /** Defines if astc texture compression is supported */
  var astc: js.Any = js.native
  /** Defines if the blend min max extension is supported */
  var blendMinMax: Boolean = js.native
  /** Defines if timestamp can be used with timer query */
  var canUseTimestampForTimerQuery: Boolean = js.native
  /** Defines if float color buffer are supported */
  var colorBufferFloat: Boolean = js.native
  /** Defines if depth textures are supported */
  var depthTextureExtension: Boolean = js.native
  /** Defines if draw buffers extension is supported */
  var drawBuffersExtension: Boolean = js.native
  /** Defines if etc1 texture compression is supported */
  var etc1: js.Any = js.native
  /** Defines if etc2 texture compression is supported */
  var etc2: js.Any = js.native
  /** Defines if depth reading in the fragment shader is supported */
  var fragmentDepthSupported: Boolean = js.native
  /** Defines if high precision shaders are supported */
  var highPrecisionShaderSupported: Boolean = js.native
  /** Defines if instancing is supported */
  var instancedArrays: Boolean = js.native
  /** Gets the maximum level of anisotropy supported */
  var maxAnisotropy: Double = js.native
  /** Maximum textures units in the entire pipeline */
  var maxCombinedTexturesImageUnits: Double = js.native
  /** Maximum cube texture size */
  var maxCubemapTextureSize: Double = js.native
  /** Maximum number of uniforms per fragment shader */
  var maxFragmentUniformVectors: Double = js.native
  /** Max number of texture samples for MSAA */
  var maxMSAASamples: Double = js.native
  /** Maximum render texture size */
  var maxRenderTextureSize: Double = js.native
  /** Maximum texture samples */
  var maxSamples: js.UndefOr[Double] = js.native
  /** Maximum texture size */
  var maxTextureSize: Double = js.native
  /** Maximum textures units per fragment shader */
  var maxTexturesImageUnits: Double = js.native
  /** Maximum number of varyings */
  var maxVaryingVectors: Double = js.native
  /** Maximum number of vertex attributes */
  var maxVertexAttribs: Double = js.native
  /** Maximum texture units per vertex shader */
  var maxVertexTextureImageUnits: Double = js.native
  /** Maximum number of uniforms per vertex shader */
  var maxVertexUniformVectors: Double = js.native
  /** Defines if multiview is supported (https://www.khronos.org/registry/webgl/extensions/WEBGL_multiview/) */
  var multiview: js.UndefOr[js.Any] = js.native
  /** Defines if oculus multiview is supported (https://developer.oculus.com/documentation/oculus-browser/latest/concepts/browser-multiview/) */
  var oculusMultiview: js.UndefOr[js.Any] = js.native
  /** Function used to let the system compiles shaders in background */
  var parallelShaderCompile: js.UndefOr[AnonCOMPLETIONSTATUSKHR] = js.native
  /** Defines if pvrtc texture compression is supported */
  var pvrtc: js.Any = js.native
  /** Defines if s3tc texture compression is supported */
  var s3tc: js.UndefOr[WEBGLCompressedTextureS3tc] = js.native
  /** Defines if standard derivates (dx/dy) are supported */
  var standardDerivatives: Boolean = js.native
  /** Gets the webgl extension for anisotropic filtering (null if not supported) */
  var textureAnisotropicFilterExtension: js.UndefOr[EXTTextureFilterAnisotropic] = js.native
  /** Defines if float textures are supported */
  var textureFloat: Boolean = js.native
  /** Defines if float texture linear filtering is supported*/
  var textureFloatLinearFiltering: Boolean = js.native
  /** Defines if rendering to float textures is supported */
  var textureFloatRender: Boolean = js.native
  /** Defines if half float textures are supported*/
  var textureHalfFloat: Boolean = js.native
  /** Defines if half float texture linear filtering is supported*/
  var textureHalfFloatLinearFiltering: Boolean = js.native
  /** Defines if rendering to half float textures is supported */
  var textureHalfFloatRender: Boolean = js.native
  /** Defines if textureLOD shader command is supported */
  var textureLOD: Boolean = js.native
  /** Gets disjoint timer query extension (null if not supported) */
  var timerQuery: js.UndefOr[EXTDisjointTimerQuery] = js.native
  /** Defines if 32 bits indices are supported */
  var uintIndices: Boolean = js.native
  /** Defines if vertex array objects are supported */
  var vertexArrayObject: Boolean = js.native
}

object EngineCapabilities {
  @scala.inline
  def apply(
    astc: js.Any,
    blendMinMax: Boolean,
    canUseTimestampForTimerQuery: Boolean,
    colorBufferFloat: Boolean,
    depthTextureExtension: Boolean,
    drawBuffersExtension: Boolean,
    etc1: js.Any,
    etc2: js.Any,
    fragmentDepthSupported: Boolean,
    highPrecisionShaderSupported: Boolean,
    instancedArrays: Boolean,
    maxAnisotropy: Double,
    maxCombinedTexturesImageUnits: Double,
    maxCubemapTextureSize: Double,
    maxFragmentUniformVectors: Double,
    maxMSAASamples: Double,
    maxRenderTextureSize: Double,
    maxTextureSize: Double,
    maxTexturesImageUnits: Double,
    maxVaryingVectors: Double,
    maxVertexAttribs: Double,
    maxVertexTextureImageUnits: Double,
    maxVertexUniformVectors: Double,
    pvrtc: js.Any,
    standardDerivatives: Boolean,
    textureFloat: Boolean,
    textureFloatLinearFiltering: Boolean,
    textureFloatRender: Boolean,
    textureHalfFloat: Boolean,
    textureHalfFloatLinearFiltering: Boolean,
    textureHalfFloatRender: Boolean,
    textureLOD: Boolean,
    uintIndices: Boolean,
    vertexArrayObject: Boolean
  ): EngineCapabilities = {
    val __obj = js.Dynamic.literal(astc = astc.asInstanceOf[js.Any], blendMinMax = blendMinMax.asInstanceOf[js.Any], canUseTimestampForTimerQuery = canUseTimestampForTimerQuery.asInstanceOf[js.Any], colorBufferFloat = colorBufferFloat.asInstanceOf[js.Any], depthTextureExtension = depthTextureExtension.asInstanceOf[js.Any], drawBuffersExtension = drawBuffersExtension.asInstanceOf[js.Any], etc1 = etc1.asInstanceOf[js.Any], etc2 = etc2.asInstanceOf[js.Any], fragmentDepthSupported = fragmentDepthSupported.asInstanceOf[js.Any], highPrecisionShaderSupported = highPrecisionShaderSupported.asInstanceOf[js.Any], instancedArrays = instancedArrays.asInstanceOf[js.Any], maxAnisotropy = maxAnisotropy.asInstanceOf[js.Any], maxCombinedTexturesImageUnits = maxCombinedTexturesImageUnits.asInstanceOf[js.Any], maxCubemapTextureSize = maxCubemapTextureSize.asInstanceOf[js.Any], maxFragmentUniformVectors = maxFragmentUniformVectors.asInstanceOf[js.Any], maxMSAASamples = maxMSAASamples.asInstanceOf[js.Any], maxRenderTextureSize = maxRenderTextureSize.asInstanceOf[js.Any], maxTextureSize = maxTextureSize.asInstanceOf[js.Any], maxTexturesImageUnits = maxTexturesImageUnits.asInstanceOf[js.Any], maxVaryingVectors = maxVaryingVectors.asInstanceOf[js.Any], maxVertexAttribs = maxVertexAttribs.asInstanceOf[js.Any], maxVertexTextureImageUnits = maxVertexTextureImageUnits.asInstanceOf[js.Any], maxVertexUniformVectors = maxVertexUniformVectors.asInstanceOf[js.Any], pvrtc = pvrtc.asInstanceOf[js.Any], standardDerivatives = standardDerivatives.asInstanceOf[js.Any], textureFloat = textureFloat.asInstanceOf[js.Any], textureFloatLinearFiltering = textureFloatLinearFiltering.asInstanceOf[js.Any], textureFloatRender = textureFloatRender.asInstanceOf[js.Any], textureHalfFloat = textureHalfFloat.asInstanceOf[js.Any], textureHalfFloatLinearFiltering = textureHalfFloatLinearFiltering.asInstanceOf[js.Any], textureHalfFloatRender = textureHalfFloatRender.asInstanceOf[js.Any], textureLOD = textureLOD.asInstanceOf[js.Any], uintIndices = uintIndices.asInstanceOf[js.Any], vertexArrayObject = vertexArrayObject.asInstanceOf[js.Any])
    __obj.asInstanceOf[EngineCapabilities]
  }
  @scala.inline
  implicit class EngineCapabilitiesOps[Self <: EngineCapabilities] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAstc(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("astc")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBlendMinMax(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("blendMinMax")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCanUseTimestampForTimerQuery(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("canUseTimestampForTimerQuery")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withColorBufferFloat(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("colorBufferFloat")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDepthTextureExtension(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("depthTextureExtension")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDrawBuffersExtension(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("drawBuffersExtension")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEtc1(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("etc1")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEtc2(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("etc2")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFragmentDepthSupported(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fragmentDepthSupported")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHighPrecisionShaderSupported(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("highPrecisionShaderSupported")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withInstancedArrays(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("instancedArrays")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMaxAnisotropy(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxAnisotropy")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMaxCombinedTexturesImageUnits(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxCombinedTexturesImageUnits")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMaxCubemapTextureSize(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxCubemapTextureSize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMaxFragmentUniformVectors(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxFragmentUniformVectors")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMaxMSAASamples(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxMSAASamples")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMaxRenderTextureSize(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxRenderTextureSize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMaxTextureSize(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxTextureSize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMaxTexturesImageUnits(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxTexturesImageUnits")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMaxVaryingVectors(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxVaryingVectors")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMaxVertexAttribs(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxVertexAttribs")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMaxVertexTextureImageUnits(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxVertexTextureImageUnits")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMaxVertexUniformVectors(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxVertexUniformVectors")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPvrtc(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pvrtc")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStandardDerivatives(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("standardDerivatives")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTextureFloat(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("textureFloat")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTextureFloatLinearFiltering(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("textureFloatLinearFiltering")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTextureFloatRender(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("textureFloatRender")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTextureHalfFloat(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("textureHalfFloat")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTextureHalfFloatLinearFiltering(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("textureHalfFloatLinearFiltering")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTextureHalfFloatRender(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("textureHalfFloatRender")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTextureLOD(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("textureLOD")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUintIndices(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("uintIndices")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withVertexArrayObject(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("vertexArrayObject")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMaxSamples(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxSamples")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxSamples: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxSamples")(js.undefined)
        ret
    }
    @scala.inline
    def withMultiview(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("multiview")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMultiview: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("multiview")(js.undefined)
        ret
    }
    @scala.inline
    def withOculusMultiview(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("oculusMultiview")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOculusMultiview: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("oculusMultiview")(js.undefined)
        ret
    }
    @scala.inline
    def withParallelShaderCompile(value: AnonCOMPLETIONSTATUSKHR): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parallelShaderCompile")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutParallelShaderCompile: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parallelShaderCompile")(js.undefined)
        ret
    }
    @scala.inline
    def withS3tc(value: WEBGLCompressedTextureS3tc): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("s3tc")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutS3tc: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("s3tc")(js.undefined)
        ret
    }
    @scala.inline
    def withTextureAnisotropicFilterExtension(value: EXTTextureFilterAnisotropic): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("textureAnisotropicFilterExtension")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTextureAnisotropicFilterExtension: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("textureAnisotropicFilterExtension")(js.undefined)
        ret
    }
    @scala.inline
    def withTimerQuery(value: EXTDisjointTimerQuery): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timerQuery")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTimerQuery: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timerQuery")(js.undefined)
        ret
    }
  }
  
}

