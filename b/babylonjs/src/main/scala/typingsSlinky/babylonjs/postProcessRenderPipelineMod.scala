package typingsSlinky.babylonjs

import typingsSlinky.babylonjs.cameraMod.Camera
import typingsSlinky.babylonjs.engineMod.Engine
import typingsSlinky.babylonjs.iInspectableMod.IInspectable
import typingsSlinky.babylonjs.postProcessRenderEffectMod.PostProcessRenderEffect
import typingsSlinky.babylonjs.prePassRendererMod.PrePassRenderer
import typingsSlinky.babylonjs.typesMod.Nullable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("babylonjs/PostProcesses/RenderPipeline/postProcessRenderPipeline", JSImport.Namespace)
@js.native
object postProcessRenderPipelineMod extends js.Object {
  
  @js.native
  class PostProcessRenderPipeline protected () extends js.Object {
    /**
      * Initializes a PostProcessRenderPipeline
      * @param engine engine to add the pipeline to
      * @param name name of the pipeline
      */
    def this(engine: Engine, name: String) = this()
    
    /** @hidden */
    def _attachCameras(cameras: js.Array[Camera], unique: Boolean): Unit = js.native
    /** @hidden */
    def _attachCameras(cameras: Camera, unique: Boolean): Unit = js.native
    
    /**
      * @hidden
      */
    var _cameras: js.Array[Camera] = js.native
    
    /** @hidden */
    def _detachCameras(cameras: Camera): Unit = js.native
    /** @hidden */
    def _detachCameras(cameras: Nullable[js.Array[Camera]]): Unit = js.native
    
    /** @hidden */
    def _disableEffect(renderEffectName: String, cameras: Nullable[js.Array[Camera]]): Unit = js.native
    
    /** @hidden */
    def _enableEffect(renderEffectName: String, cameras: js.Array[Camera]): Unit = js.native
    /** @hidden */
    def _enableEffect(renderEffectName: String, cameras: Camera): Unit = js.native
    
    /* protected */ def _enableMSAAOnFirstPostProcess(sampleCount: Double): Boolean = js.native
    
    /** @hidden */
    var _name: String = js.native
    
    /** @hidden */
    def _rebuild(): Unit = js.native
    
    var _renderEffects: js.Any = js.native
    
    var _renderEffectsForIsolatedPass: js.Any = js.native
    
    /** @hidden */
    def _reset(): Unit = js.native
    
    /** @hidden */
    def _update(): Unit = js.native
    
    /**
      * Adds an effect to the pipeline
      * @param renderEffect the effect to add
      */
    def addEffect(renderEffect: PostProcessRenderEffect): Unit = js.native
    
    /** Gets the list of attached cameras */
    def cameras: js.Array[Camera] = js.native
    
    /**
      * Disposes of the pipeline
      */
    def dispose(): Unit = js.native
    
    var engine: js.Any = js.native
    
    /**
      * Gets the class name
      * @returns "PostProcessRenderPipeline"
      */
    def getClassName(): String = js.native
    
    /**
      * List of inspectable custom properties (used by the Inspector)
      * @see https://doc.babylonjs.com/how_to/debug_layer#extensibility
      */
    var inspectableCustomProperties: js.Array[IInspectable] = js.native
    
    /**
      * If all the render effects in the pipeline are supported
      */
    def isSupported: Boolean = js.native
    
    /**
      * Gets pipeline name
      */
    def name: String = js.native
    
    /**
      * Sets the required values to the prepass renderer.
      * @param prePassRenderer defines the prepass renderer to setup.
      * @returns true if the pre pass is needed.
      */
    def setPrePassRenderer(prePassRenderer: PrePassRenderer): Boolean = js.native
  }
}
