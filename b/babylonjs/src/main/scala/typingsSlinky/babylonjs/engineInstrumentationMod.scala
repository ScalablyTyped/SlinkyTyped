package typingsSlinky.babylonjs

import typingsSlinky.babylonjs.engineMod.Engine
import typingsSlinky.babylonjs.perfCounterMod.PerfCounter
import typingsSlinky.babylonjs.sceneMod.IDisposable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object engineInstrumentationMod {
  
  @JSImport("babylonjs/Instrumentation/engineInstrumentation", "EngineInstrumentation")
  @js.native
  class EngineInstrumentation protected () extends IDisposable {
    /**
      * Instantiates a new engine instrumentation.
      * This class can be used to get instrumentation data from a Babylon engine
      * @see https://doc.babylonjs.com/how_to/optimizing_your_scene#engineinstrumentation
      * @param engine Defines the engine to instrument
      */
    def this(/**
      * Define the instrumented engine.
      */
    engine: Engine) = this()
    
    var _captureGPUFrameTime: js.Any = js.native
    
    var _captureShaderCompilationTime: js.Any = js.native
    
    var _gpuFrameTime: js.Any = js.native
    
    var _gpuFrameTimeToken: js.Any = js.native
    
    var _onAfterShaderCompilationObserver: js.Any = js.native
    
    var _onBeforeShaderCompilationObserver: js.Any = js.native
    
    var _onBeginFrameObserver: js.Any = js.native
    
    var _onEndFrameObserver: js.Any = js.native
    
    var _shaderCompilationTime: js.Any = js.native
    
    /**
      * Gets the GPU frame time capture status
      */
    def captureGPUFrameTime: Boolean = js.native
    /**
      * Enable or disable the GPU frame time capture
      */
    def captureGPUFrameTime_=(value: Boolean): Unit = js.native
    
    /**
      * Gets the shader compilation time capture status
      */
    def captureShaderCompilationTime: Boolean = js.native
    /**
      * Enable or disable the shader compilation time capture
      */
    def captureShaderCompilationTime_=(value: Boolean): Unit = js.native
    
    /**
      * Define the instrumented engine.
      */
    var engine: Engine = js.native
    
    /**
      * Gets the perf counter used for GPU frame time
      */
    def gpuFrameTimeCounter: PerfCounter = js.native
    
    /**
      * Gets the perf counter used for shader compilation time
      */
    def shaderCompilationTimeCounter: PerfCounter = js.native
  }
}
