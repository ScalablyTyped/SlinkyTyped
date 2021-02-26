package typingsSlinky.babylonjs

import org.scalajs.dom.raw.WebGLShader
import typingsSlinky.babylonjs.ipipelinecontextMod.IPipelineContext
import typingsSlinky.babylonjs.thinEngineMod.ThinEngine
import typingsSlinky.babylonjs.typesMod.Nullable
import typingsSlinky.std.WebGLTransformFeedback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object webGLPipelineContextMod {
  
  @JSImport("babylonjs/Engines/WebGL/webGLPipelineContext", "WebGLPipelineContext")
  @js.native
  class WebGLPipelineContext () extends IPipelineContext {
    
    var context: js.UndefOr[WebGLRenderingContext] = js.native
    
    var engine: ThinEngine = js.native
    
    var fragmentCompilationError: Nullable[String] = js.native
    
    var fragmentShader: js.UndefOr[WebGLShader] = js.native
    
    @JSName("isAsync")
    def isAsync_MWebGLPipelineContext: Boolean = js.native
    
    var isParallelCompiled: Boolean = js.native
    
    @JSName("isReady")
    def isReady_MWebGLPipelineContext: Boolean = js.native
    
    var onCompiled: js.UndefOr[js.Function0[Unit]] = js.native
    
    var program: Nullable[WebGLProgram] = js.native
    
    var programLinkError: Nullable[String] = js.native
    
    var programValidationError: Nullable[String] = js.native
    
    var transformFeedback: js.UndefOr[WebGLTransformFeedback | Null] = js.native
    
    var vertexCompilationError: Nullable[String] = js.native
    
    var vertexShader: js.UndefOr[WebGLShader] = js.native
  }
}
