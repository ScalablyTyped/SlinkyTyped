package typingsSlinky.ol

import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.raw.WebGLFramebuffer
import org.scalajs.dom.raw.WebGLRenderingContext
import typingsSlinky.ol.helperMod.UniformValue
import typingsSlinky.ol.pluggableMapMod.FrameState
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object postProcessingPassMod {
  
  @JSImport("ol/webgl/PostProcessingPass", JSImport.Default)
  @js.native
  class default protected () extends WebGLPostProcessingPass {
    def this(options: Options) = this()
  }
  
  @js.native
  trait Options extends StObject {
    
    var fragmentShader: js.UndefOr[String] = js.native
    
    var scaleRatio: js.UndefOr[Double] = js.native
    
    var uniforms: js.UndefOr[StringDictionary[UniformValue]] = js.native
    
    var vertexShader: js.UndefOr[String] = js.native
    
    var webGlContext: WebGLRenderingContext = js.native
  }
  object Options {
    
    @scala.inline
    def apply(webGlContext: WebGLRenderingContext): Options = {
      val __obj = js.Dynamic.literal(webGlContext = webGlContext.asInstanceOf[js.Any])
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit class OptionsMutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
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
      
      @scala.inline
      def setWebGlContext(value: WebGLRenderingContext): Self = StObject.set(x, "webGlContext", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait WebGLPostProcessingPass extends StObject {
    
    /**
      * Render to the next postprocessing pass (or to the canvas if final pass).
      */
    @JSName("apply")
    def apply(frameState: FrameState): Unit = js.native
    @JSName("apply")
    def apply(frameState: FrameState, nextPass: WebGLPostProcessingPass): Unit = js.native
    
    def getFrameBuffer(): WebGLFramebuffer = js.native
    
    /**
      * Get the WebGL rendering context
      */
    def getGL(): WebGLRenderingContext = js.native
    
    /**
      * Initialize the render target texture of the post process, make sure it is at the
      * right size and bind it as a render target for the next draw calls.
      * The last step to be initialized will be the one where the primitives are rendered.
      */
    def init(frameState: FrameState): Unit = js.native
  }
}
