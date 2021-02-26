package typingsSlinky.ol

import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.raw.HTMLCanvasElement
import org.scalajs.dom.raw.HTMLImageElement
import org.scalajs.dom.raw.ImageData
import org.scalajs.dom.raw.WebGLBuffer
import org.scalajs.dom.raw.WebGLProgram
import org.scalajs.dom.raw.WebGLRenderingContext
import org.scalajs.dom.raw.WebGLShader
import org.scalajs.dom.raw.WebGLTexture
import org.scalajs.dom.raw.WebGLUniformLocation
import typingsSlinky.ol.olMod.Transform
import typingsSlinky.ol.pluggableMapMod.FrameState
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object helperMod {
  
  @JSImport("ol/webgl/Helper", JSImport.Default)
  @js.native
  class default () extends WebGLHelper {
    def this(opt_options: Options) = this()
  }
  
  @js.native
  sealed trait AttributeType extends StObject
  @JSImport("ol/webgl/Helper", "AttributeType")
  @js.native
  object AttributeType extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[AttributeType with Double] = js.native
    
    @js.native
    sealed trait FLOAT extends AttributeType
    /* 5126 */ val FLOAT: typingsSlinky.ol.helperMod.AttributeType.FLOAT with Double = js.native
    
    @js.native
    sealed trait UNSIGNED_BYTE extends AttributeType
    /* 5121 */ val UNSIGNED_BYTE: typingsSlinky.ol.helperMod.AttributeType.UNSIGNED_BYTE with Double = js.native
    
    @js.native
    sealed trait UNSIGNED_INT extends AttributeType
    /* 5125 */ val UNSIGNED_INT: typingsSlinky.ol.helperMod.AttributeType.UNSIGNED_INT with Double = js.native
    
    @js.native
    sealed trait UNSIGNED_SHORT extends AttributeType
    /* 5123 */ val UNSIGNED_SHORT: typingsSlinky.ol.helperMod.AttributeType.UNSIGNED_SHORT with Double = js.native
  }
  
  @js.native
  sealed trait DefaultUniform extends StObject
  @JSImport("ol/webgl/Helper", "DefaultUniform")
  @js.native
  object DefaultUniform extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[DefaultUniform with String] = js.native
    
    @js.native
    sealed trait OFFSET_ROTATION_MATRIX extends DefaultUniform
    /* "u_offsetRotateMatrix" */ val OFFSET_ROTATION_MATRIX: typingsSlinky.ol.helperMod.DefaultUniform.OFFSET_ROTATION_MATRIX with String = js.native
    
    @js.native
    sealed trait OFFSET_SCALE_MATRIX extends DefaultUniform
    /* "u_offsetScaleMatrix" */ val OFFSET_SCALE_MATRIX: typingsSlinky.ol.helperMod.DefaultUniform.OFFSET_SCALE_MATRIX with String = js.native
    
    @js.native
    sealed trait PROJECTION_MATRIX extends DefaultUniform
    /* "u_projectionMatrix" */ val PROJECTION_MATRIX: typingsSlinky.ol.helperMod.DefaultUniform.PROJECTION_MATRIX with String = js.native
    
    @js.native
    sealed trait RESOLUTION extends DefaultUniform
    /* "u_resolution" */ val RESOLUTION: typingsSlinky.ol.helperMod.DefaultUniform.RESOLUTION with String = js.native
    
    @js.native
    sealed trait TIME extends DefaultUniform
    /* "u_time" */ val TIME: typingsSlinky.ol.helperMod.DefaultUniform.TIME with String = js.native
    
    @js.native
    sealed trait ZOOM extends DefaultUniform
    /* "u_zoom" */ val ZOOM: typingsSlinky.ol.helperMod.DefaultUniform.ZOOM with String = js.native
  }
  
  @js.native
  sealed trait ShaderType extends StObject
  @JSImport("ol/webgl/Helper", "ShaderType")
  @js.native
  object ShaderType extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[ShaderType with Double] = js.native
    
    @js.native
    sealed trait FRAGMENT_SHADER extends ShaderType
    /* 35632 */ val FRAGMENT_SHADER: typingsSlinky.ol.helperMod.ShaderType.FRAGMENT_SHADER with Double = js.native
    
    @js.native
    sealed trait VERTEX_SHADER extends ShaderType
    /* 35633 */ val VERTEX_SHADER: typingsSlinky.ol.helperMod.ShaderType.VERTEX_SHADER with Double = js.native
  }
  
  @JSImport("ol/webgl/Helper", "computeAttributesStride")
  @js.native
  def computeAttributesStride(attributes: js.Array[AttributeDescription]): Double = js.native
  
  @js.native
  trait AttributeDescription extends StObject {
    
    var name: String = js.native
    
    var size: Double = js.native
    
    var `type`: js.UndefOr[AttributeType] = js.native
  }
  object AttributeDescription {
    
    @scala.inline
    def apply(name: String, size: Double): AttributeDescription = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any])
      __obj.asInstanceOf[AttributeDescription]
    }
    
    @scala.inline
    implicit class AttributeDescriptionMutableBuilder[Self <: AttributeDescription] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setType(value: AttributeType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  @js.native
  trait BufferCacheEntry extends StObject {
    
    var buffer: typingsSlinky.ol.bufferMod.default = js.native
    
    var webGlBuffer: WebGLBuffer = js.native
  }
  object BufferCacheEntry {
    
    @scala.inline
    def apply(buffer: typingsSlinky.ol.bufferMod.default, webGlBuffer: WebGLBuffer): BufferCacheEntry = {
      val __obj = js.Dynamic.literal(buffer = buffer.asInstanceOf[js.Any], webGlBuffer = webGlBuffer.asInstanceOf[js.Any])
      __obj.asInstanceOf[BufferCacheEntry]
    }
    
    @scala.inline
    implicit class BufferCacheEntryMutableBuilder[Self <: BufferCacheEntry] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBuffer(value: typingsSlinky.ol.bufferMod.default): Self = StObject.set(x, "buffer", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWebGlBuffer(value: WebGLBuffer): Self = StObject.set(x, "webGlBuffer", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Options extends StObject {
    
    var postProcesses: js.UndefOr[js.Array[PostProcessesOptions]] = js.native
    
    var uniforms: js.UndefOr[StringDictionary[UniformValue]] = js.native
  }
  object Options {
    
    @scala.inline
    def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit class OptionsMutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setPostProcesses(value: js.Array[PostProcessesOptions]): Self = StObject.set(x, "postProcesses", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPostProcessesUndefined: Self = StObject.set(x, "postProcesses", js.undefined)
      
      @scala.inline
      def setPostProcessesVarargs(value: PostProcessesOptions*): Self = StObject.set(x, "postProcesses", js.Array(value :_*))
      
      @scala.inline
      def setUniforms(value: StringDictionary[UniformValue]): Self = StObject.set(x, "uniforms", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUniformsUndefined: Self = StObject.set(x, "uniforms", js.undefined)
    }
  }
  
  @js.native
  trait PostProcessesOptions extends StObject {
    
    var fragmentShader: js.UndefOr[String] = js.native
    
    var scaleRatio: js.UndefOr[Double] = js.native
    
    var uniforms: js.UndefOr[StringDictionary[UniformValue]] = js.native
    
    var vertexShader: js.UndefOr[String] = js.native
  }
  object PostProcessesOptions {
    
    @scala.inline
    def apply(): PostProcessesOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PostProcessesOptions]
    }
    
    @scala.inline
    implicit class PostProcessesOptionsMutableBuilder[Self <: PostProcessesOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFragmentShader(value: String): Self = StObject.set(x, "fragmentShader", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFragmentShaderUndefined: Self = StObject.set(x, "fragmentShader", js.undefined)
      
      @scala.inline
      def setScaleRatio(value: Double): Self = StObject.set(x, "scaleRatio", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setScaleRatioUndefined: Self = StObject.set(x, "scaleRatio", js.undefined)
      
      @scala.inline
      def setUniforms(value: StringDictionary[UniformValue]): Self = StObject.set(x, "uniforms", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUniformsUndefined: Self = StObject.set(x, "uniforms", js.undefined)
      
      @scala.inline
      def setVertexShader(value: String): Self = StObject.set(x, "vertexShader", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVertexShaderUndefined: Self = StObject.set(x, "vertexShader", js.undefined)
    }
  }
  
  type UniformLiteralValue = Double | js.Array[Double] | HTMLCanvasElement | HTMLImageElement | ImageData | Transform
  
  type UniformValue = UniformLiteralValue | (js.Function1[/* p0 */ FrameState, UniformLiteralValue])
  
  @js.native
  trait WebGLHelper
    extends typingsSlinky.ol.disposableMod.default {
    
    /**
      * Just bind the buffer if it's in the cache. Otherwise create
      * the WebGL buffer, bind it, populate it, and add an entry to
      * the cache.
      */
    def bindBuffer(buffer: typingsSlinky.ol.bufferMod.default): Unit = js.native
    
    /**
      * Will attempt to compile a vertex or fragment shader based on source
      * On error, the shader will be returned but
      * gl.getShaderParameter(shader, gl.COMPILE_STATUS) will return true
      * Use gl.getShaderInfoLog(shader) to have details
      */
    def compileShader(source: String, `type`: ShaderType): WebGLShader = js.native
    
    /**
      * Will create or reuse a given webgl texture and apply the given size. If no image data
      * specified, the texture will be empty, otherwise image data will be used and the size
      * parameter will be ignored.
      * Note: wrap parameters are set to clamp to edge, min filter is set to linear.
      */
    def createTexture(size: js.Array[Double]): WebGLTexture = js.native
    def createTexture(size: js.Array[Double], opt_data: js.UndefOr[scala.Nothing], opt_texture: WebGLTexture): WebGLTexture = js.native
    def createTexture(size: js.Array[Double], opt_data: HTMLCanvasElement): WebGLTexture = js.native
    def createTexture(size: js.Array[Double], opt_data: HTMLCanvasElement, opt_texture: WebGLTexture): WebGLTexture = js.native
    def createTexture(size: js.Array[Double], opt_data: HTMLImageElement): WebGLTexture = js.native
    def createTexture(size: js.Array[Double], opt_data: HTMLImageElement, opt_texture: WebGLTexture): WebGLTexture = js.native
    def createTexture(size: js.Array[Double], opt_data: ImageData): WebGLTexture = js.native
    def createTexture(size: js.Array[Double], opt_data: ImageData, opt_texture: WebGLTexture): WebGLTexture = js.native
    
    def deleteBuffer(buf: typingsSlinky.ol.bufferMod.default): Unit = js.native
    
    /**
      * Execute a draw call based on the currently bound program, texture, buffers, attributes.
      */
    def drawElements(start: Double, end: Double): Unit = js.native
    
    /**
      * Will enable the following attributes to be read from the currently bound buffer,
      * i.e. tell the GPU where to read the different attributes in the buffer. An error in the
      * size/type/order of attributes will most likely break the rendering and throw a WebGL exception.
      */
    def enableAttributes(attributes: js.Array[AttributeDescription]): Unit = js.native
    
    /**
      * Apply the successive post process passes which will eventually render to the actual canvas.
      */
    def finalizeDraw(frameState: FrameState): Unit = js.native
    
    /**
      * Update the data contained in the buffer array; this is required for the
      * new data to be rendered
      */
    def flushBufferData(buffer: typingsSlinky.ol.bufferMod.default): Unit = js.native
    
    /**
      * Will get the location from the shader or the cache
      */
    def getAttributeLocation(name: String): Double = js.native
    
    def getCanvas(): HTMLCanvasElement = js.native
    
    /**
      * Get the WebGL rendering context
      */
    def getGL(): WebGLRenderingContext = js.native
    
    /**
      * Create a program for a vertex and fragment shader. The shaders compilation may have failed:
      * use WebGLHelper.getShaderCompileErrors()to have details if any.
      */
    def getProgram(fragmentShaderSource: String, vertexShaderSource: String): WebGLProgram = js.native
    
    /**
      * Will return the last shader compilation errors. If no error happened, will return null;
      */
    def getShaderCompileErrors(): String | Null = js.native
    
    /**
      * Will get the location from the shader or the cache
      */
    def getUniformLocation(name: String): WebGLUniformLocation = js.native
    
    /**
      * Modifies the given transform to apply the rotation/translation/scaling of the given frame state.
      * The resulting transform can be used to convert world space coordinates to view coordinates.
      */
    def makeProjectionTransform(frameState: FrameState, transform: Transform): Transform = js.native
    
    /**
      * Clear the buffer & set the viewport to draw.
      * Post process passes will be initialized here, the first one being bound as a render target for
      * subsequent draw calls.
      */
    def prepareDraw(frameState: FrameState): Unit = js.native
    
    /**
      * Clear the render target & bind it for future draw operations.
      * This is similar to prepareDraw, only post processes will not be applied.
      * Note: the whole viewport will be drawn to the render target, regardless of its size.
      */
    def prepareDrawToRenderTarget(frameState: FrameState, renderTarget: typingsSlinky.ol.renderTargetMod.default): Unit = js.native
    def prepareDrawToRenderTarget(
      frameState: FrameState,
      renderTarget: typingsSlinky.ol.renderTargetMod.default,
      opt_disableAlphaBlend: Boolean
    ): Unit = js.native
    
    /**
      * Give a value for a standard float uniform
      */
    def setUniformFloatValue(uniform: String, value: Double): Unit = js.native
    
    /**
      * Give a value for a standard matrix4 uniform
      */
    def setUniformMatrixValue(uniform: String, value: js.Array[Double]): Unit = js.native
    
    /**
      * Use a program.  If the program is already in use, this will return false.
      */
    def useProgram(program: WebGLProgram): Boolean = js.native
  }
}
