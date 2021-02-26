package typingsSlinky.ol

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.ol.helperMod.UniformValue
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object webglLayerMod {
  
  @JSImport("ol/renderer/webgl/Layer", JSImport.Default)
  @js.native
  class default[LayerType /* <: typingsSlinky.ol.layerLayerMod.default[typingsSlinky.ol.sourceSourceMod.default] */] protected () extends WebGLLayerRenderer[LayerType] {
    def this(layer: LayerType) = this()
    def this(layer: LayerType, opt_options: Options) = this()
  }
  
  @js.native
  sealed trait WebGLWorkerMessageType extends StObject
  @JSImport("ol/renderer/webgl/Layer", "WebGLWorkerMessageType")
  @js.native
  object WebGLWorkerMessageType extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[WebGLWorkerMessageType with String] = js.native
    
    @js.native
    sealed trait GENERATE_BUFFERS extends WebGLWorkerMessageType
    /* "GENERATE_BUFFERS" */ val GENERATE_BUFFERS: typingsSlinky.ol.webglLayerMod.WebGLWorkerMessageType.GENERATE_BUFFERS with String = js.native
  }
  
  @JSImport("ol/renderer/webgl/Layer", "colorDecodeId")
  @js.native
  def colorDecodeId(color: js.Array[Double]): Double = js.native
  
  @JSImport("ol/renderer/webgl/Layer", "colorEncodeId")
  @js.native
  def colorEncodeId(id: Double): js.Array[Double] = js.native
  @JSImport("ol/renderer/webgl/Layer", "colorEncodeId")
  @js.native
  def colorEncodeId(id: Double, opt_array: js.Array[Double]): js.Array[Double] = js.native
  
  @js.native
  trait BufferPositions extends StObject {
    
    var indexPosition: Double = js.native
    
    var vertexPosition: Double = js.native
  }
  object BufferPositions {
    
    @scala.inline
    def apply(indexPosition: Double, vertexPosition: Double): BufferPositions = {
      val __obj = js.Dynamic.literal(indexPosition = indexPosition.asInstanceOf[js.Any], vertexPosition = vertexPosition.asInstanceOf[js.Any])
      __obj.asInstanceOf[BufferPositions]
    }
    
    @scala.inline
    implicit class BufferPositionsMutableBuilder[Self <: BufferPositions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setIndexPosition(value: Double): Self = StObject.set(x, "indexPosition", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVertexPosition(value: Double): Self = StObject.set(x, "vertexPosition", value.asInstanceOf[js.Any])
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
  
  @js.native
  trait WebGLLayerRenderer[LayerType /* <: typingsSlinky.ol.layerLayerMod.default[typingsSlinky.ol.sourceSourceMod.default] */]
    extends typingsSlinky.ol.rendererLayerMod.default[typingsSlinky.ol.layerLayerMod.default[typingsSlinky.ol.sourceSourceMod.default]] {
    
    /**
      * Will return the last shader compilation errors. If no error happened, will return null;
      */
    def getShaderCompileErrors(): String | Null = js.native
    
    var helper: typingsSlinky.ol.helperMod.default = js.native
  }
  
  @js.native
  trait WebGLWorkerGenerateBuffersMessage extends StObject {
    
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
    implicit class WebGLWorkerGenerateBuffersMessageMutableBuilder[Self <: WebGLWorkerGenerateBuffersMessage] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCustomAttributesCount(value: Double): Self = StObject.set(x, "customAttributesCount", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCustomAttributesCountUndefined: Self = StObject.set(x, "customAttributesCount", js.undefined)
      
      @scala.inline
      def setIndexBuffer(value: js.typedarray.ArrayBuffer): Self = StObject.set(x, "indexBuffer", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIndexBufferUndefined: Self = StObject.set(x, "indexBuffer", js.undefined)
      
      @scala.inline
      def setRenderInstructions(value: js.typedarray.ArrayBuffer): Self = StObject.set(x, "renderInstructions", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setType(value: WebGLWorkerMessageType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVertexBuffer(value: js.typedarray.ArrayBuffer): Self = StObject.set(x, "vertexBuffer", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVertexBufferUndefined: Self = StObject.set(x, "vertexBuffer", js.undefined)
    }
  }
}
