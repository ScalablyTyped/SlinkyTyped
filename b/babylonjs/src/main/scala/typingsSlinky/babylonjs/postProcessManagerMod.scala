package typingsSlinky.babylonjs

import typingsSlinky.babylonjs.internalTextureMod.InternalTexture
import typingsSlinky.babylonjs.postProcessMod.PostProcess
import typingsSlinky.babylonjs.sceneMod.Scene
import typingsSlinky.babylonjs.typesMod.Nullable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object postProcessManagerMod {
  
  @JSImport("babylonjs/PostProcesses/postProcessManager", "PostProcessManager")
  @js.native
  class PostProcessManager protected () extends StObject {
    /**
      * Creates a new instance PostProcess
      * @param scene The scene that the post process is associated with.
      */
    def this(scene: Scene) = this()
    
    var _buildIndexBuffer: js.Any = js.native
    
    /**
      * Finalize the result of the output of the postprocesses.
      * @param doNotPresent If true the result will not be displayed to the screen.
      * @param targetTexture The target texture to render to.
      * @param faceIndex The index of the face to bind the target texture to.
      * @param postProcesses The array of post processes to render.
      * @param forceFullscreenViewport force gl.viewport to be full screen eg. 0,0,textureWidth,textureHeight (default: false)
      * @hidden
      */
    def _finalizeFrame(): Unit = js.native
    def _finalizeFrame(
      doNotPresent: js.UndefOr[scala.Nothing],
      targetTexture: js.UndefOr[scala.Nothing],
      faceIndex: js.UndefOr[scala.Nothing],
      postProcesses: js.UndefOr[scala.Nothing],
      forceFullscreenViewport: Boolean
    ): Unit = js.native
    def _finalizeFrame(
      doNotPresent: js.UndefOr[scala.Nothing],
      targetTexture: js.UndefOr[scala.Nothing],
      faceIndex: js.UndefOr[scala.Nothing],
      postProcesses: js.Array[PostProcess]
    ): Unit = js.native
    def _finalizeFrame(
      doNotPresent: js.UndefOr[scala.Nothing],
      targetTexture: js.UndefOr[scala.Nothing],
      faceIndex: js.UndefOr[scala.Nothing],
      postProcesses: js.Array[PostProcess],
      forceFullscreenViewport: Boolean
    ): Unit = js.native
    def _finalizeFrame(
      doNotPresent: js.UndefOr[scala.Nothing],
      targetTexture: js.UndefOr[scala.Nothing],
      faceIndex: Double
    ): Unit = js.native
    def _finalizeFrame(
      doNotPresent: js.UndefOr[scala.Nothing],
      targetTexture: js.UndefOr[scala.Nothing],
      faceIndex: Double,
      postProcesses: js.UndefOr[scala.Nothing],
      forceFullscreenViewport: Boolean
    ): Unit = js.native
    def _finalizeFrame(
      doNotPresent: js.UndefOr[scala.Nothing],
      targetTexture: js.UndefOr[scala.Nothing],
      faceIndex: Double,
      postProcesses: js.Array[PostProcess]
    ): Unit = js.native
    def _finalizeFrame(
      doNotPresent: js.UndefOr[scala.Nothing],
      targetTexture: js.UndefOr[scala.Nothing],
      faceIndex: Double,
      postProcesses: js.Array[PostProcess],
      forceFullscreenViewport: Boolean
    ): Unit = js.native
    def _finalizeFrame(doNotPresent: js.UndefOr[scala.Nothing], targetTexture: InternalTexture): Unit = js.native
    def _finalizeFrame(
      doNotPresent: js.UndefOr[scala.Nothing],
      targetTexture: InternalTexture,
      faceIndex: js.UndefOr[scala.Nothing],
      postProcesses: js.UndefOr[scala.Nothing],
      forceFullscreenViewport: Boolean
    ): Unit = js.native
    def _finalizeFrame(
      doNotPresent: js.UndefOr[scala.Nothing],
      targetTexture: InternalTexture,
      faceIndex: js.UndefOr[scala.Nothing],
      postProcesses: js.Array[PostProcess]
    ): Unit = js.native
    def _finalizeFrame(
      doNotPresent: js.UndefOr[scala.Nothing],
      targetTexture: InternalTexture,
      faceIndex: js.UndefOr[scala.Nothing],
      postProcesses: js.Array[PostProcess],
      forceFullscreenViewport: Boolean
    ): Unit = js.native
    def _finalizeFrame(doNotPresent: js.UndefOr[scala.Nothing], targetTexture: InternalTexture, faceIndex: Double): Unit = js.native
    def _finalizeFrame(
      doNotPresent: js.UndefOr[scala.Nothing],
      targetTexture: InternalTexture,
      faceIndex: Double,
      postProcesses: js.UndefOr[scala.Nothing],
      forceFullscreenViewport: Boolean
    ): Unit = js.native
    def _finalizeFrame(
      doNotPresent: js.UndefOr[scala.Nothing],
      targetTexture: InternalTexture,
      faceIndex: Double,
      postProcesses: js.Array[PostProcess]
    ): Unit = js.native
    def _finalizeFrame(
      doNotPresent: js.UndefOr[scala.Nothing],
      targetTexture: InternalTexture,
      faceIndex: Double,
      postProcesses: js.Array[PostProcess],
      forceFullscreenViewport: Boolean
    ): Unit = js.native
    def _finalizeFrame(doNotPresent: Boolean): Unit = js.native
    def _finalizeFrame(
      doNotPresent: Boolean,
      targetTexture: js.UndefOr[scala.Nothing],
      faceIndex: js.UndefOr[scala.Nothing],
      postProcesses: js.UndefOr[scala.Nothing],
      forceFullscreenViewport: Boolean
    ): Unit = js.native
    def _finalizeFrame(
      doNotPresent: Boolean,
      targetTexture: js.UndefOr[scala.Nothing],
      faceIndex: js.UndefOr[scala.Nothing],
      postProcesses: js.Array[PostProcess]
    ): Unit = js.native
    def _finalizeFrame(
      doNotPresent: Boolean,
      targetTexture: js.UndefOr[scala.Nothing],
      faceIndex: js.UndefOr[scala.Nothing],
      postProcesses: js.Array[PostProcess],
      forceFullscreenViewport: Boolean
    ): Unit = js.native
    def _finalizeFrame(doNotPresent: Boolean, targetTexture: js.UndefOr[scala.Nothing], faceIndex: Double): Unit = js.native
    def _finalizeFrame(
      doNotPresent: Boolean,
      targetTexture: js.UndefOr[scala.Nothing],
      faceIndex: Double,
      postProcesses: js.UndefOr[scala.Nothing],
      forceFullscreenViewport: Boolean
    ): Unit = js.native
    def _finalizeFrame(
      doNotPresent: Boolean,
      targetTexture: js.UndefOr[scala.Nothing],
      faceIndex: Double,
      postProcesses: js.Array[PostProcess]
    ): Unit = js.native
    def _finalizeFrame(
      doNotPresent: Boolean,
      targetTexture: js.UndefOr[scala.Nothing],
      faceIndex: Double,
      postProcesses: js.Array[PostProcess],
      forceFullscreenViewport: Boolean
    ): Unit = js.native
    def _finalizeFrame(doNotPresent: Boolean, targetTexture: InternalTexture): Unit = js.native
    def _finalizeFrame(
      doNotPresent: Boolean,
      targetTexture: InternalTexture,
      faceIndex: js.UndefOr[scala.Nothing],
      postProcesses: js.UndefOr[scala.Nothing],
      forceFullscreenViewport: Boolean
    ): Unit = js.native
    def _finalizeFrame(
      doNotPresent: Boolean,
      targetTexture: InternalTexture,
      faceIndex: js.UndefOr[scala.Nothing],
      postProcesses: js.Array[PostProcess]
    ): Unit = js.native
    def _finalizeFrame(
      doNotPresent: Boolean,
      targetTexture: InternalTexture,
      faceIndex: js.UndefOr[scala.Nothing],
      postProcesses: js.Array[PostProcess],
      forceFullscreenViewport: Boolean
    ): Unit = js.native
    def _finalizeFrame(doNotPresent: Boolean, targetTexture: InternalTexture, faceIndex: Double): Unit = js.native
    def _finalizeFrame(
      doNotPresent: Boolean,
      targetTexture: InternalTexture,
      faceIndex: Double,
      postProcesses: js.UndefOr[scala.Nothing],
      forceFullscreenViewport: Boolean
    ): Unit = js.native
    def _finalizeFrame(
      doNotPresent: Boolean,
      targetTexture: InternalTexture,
      faceIndex: Double,
      postProcesses: js.Array[PostProcess]
    ): Unit = js.native
    def _finalizeFrame(
      doNotPresent: Boolean,
      targetTexture: InternalTexture,
      faceIndex: Double,
      postProcesses: js.Array[PostProcess],
      forceFullscreenViewport: Boolean
    ): Unit = js.native
    
    var _indexBuffer: js.Any = js.native
    
    var _prepareBuffers: js.Any = js.native
    
    /**
      * Prepares a frame to be run through a post process.
      * @param sourceTexture The input texture to the post procesess. (default: null)
      * @param postProcesses An array of post processes to be run. (default: null)
      * @returns True if the post processes were able to be run.
      * @hidden
      */
    def _prepareFrame(): Boolean = js.native
    def _prepareFrame(
      sourceTexture: js.UndefOr[Nullable[InternalTexture]],
      postProcesses: Nullable[js.Array[PostProcess]]
    ): Boolean = js.native
    def _prepareFrame(sourceTexture: Nullable[InternalTexture]): Boolean = js.native
    
    /**
      * Rebuilds the vertex buffers of the manager.
      * @hidden
      */
    def _rebuild(): Unit = js.native
    
    var _scene: js.Any = js.native
    
    var _vertexBuffers: js.Any = js.native
    
    /**
      * Manually render a set of post processes to a texture.
      * Please note, the frame buffer won't be unbound after the call in case you have more render to do.
      * @param postProcesses An array of post processes to be run.
      * @param targetTexture The target texture to render to.
      * @param forceFullscreenViewport force gl.viewport to be full screen eg. 0,0,textureWidth,textureHeight
      * @param faceIndex defines the face to render to if a cubemap is defined as the target
      * @param lodLevel defines which lod of the texture to render to
      * @param doNotBindFrambuffer If set to true, assumes that the framebuffer has been bound previously
      */
    def directRender(postProcesses: js.Array[PostProcess]): Unit = js.native
    def directRender(
      postProcesses: js.Array[PostProcess],
      targetTexture: js.UndefOr[Nullable[InternalTexture]],
      forceFullscreenViewport: js.UndefOr[scala.Nothing],
      faceIndex: js.UndefOr[scala.Nothing],
      lodLevel: js.UndefOr[scala.Nothing],
      doNotBindFrambuffer: Boolean
    ): Unit = js.native
    def directRender(
      postProcesses: js.Array[PostProcess],
      targetTexture: js.UndefOr[Nullable[InternalTexture]],
      forceFullscreenViewport: js.UndefOr[scala.Nothing],
      faceIndex: js.UndefOr[scala.Nothing],
      lodLevel: Double
    ): Unit = js.native
    def directRender(
      postProcesses: js.Array[PostProcess],
      targetTexture: js.UndefOr[Nullable[InternalTexture]],
      forceFullscreenViewport: js.UndefOr[scala.Nothing],
      faceIndex: js.UndefOr[scala.Nothing],
      lodLevel: Double,
      doNotBindFrambuffer: Boolean
    ): Unit = js.native
    def directRender(
      postProcesses: js.Array[PostProcess],
      targetTexture: js.UndefOr[Nullable[InternalTexture]],
      forceFullscreenViewport: js.UndefOr[scala.Nothing],
      faceIndex: Double
    ): Unit = js.native
    def directRender(
      postProcesses: js.Array[PostProcess],
      targetTexture: js.UndefOr[Nullable[InternalTexture]],
      forceFullscreenViewport: js.UndefOr[scala.Nothing],
      faceIndex: Double,
      lodLevel: js.UndefOr[scala.Nothing],
      doNotBindFrambuffer: Boolean
    ): Unit = js.native
    def directRender(
      postProcesses: js.Array[PostProcess],
      targetTexture: js.UndefOr[Nullable[InternalTexture]],
      forceFullscreenViewport: js.UndefOr[scala.Nothing],
      faceIndex: Double,
      lodLevel: Double
    ): Unit = js.native
    def directRender(
      postProcesses: js.Array[PostProcess],
      targetTexture: js.UndefOr[Nullable[InternalTexture]],
      forceFullscreenViewport: js.UndefOr[scala.Nothing],
      faceIndex: Double,
      lodLevel: Double,
      doNotBindFrambuffer: Boolean
    ): Unit = js.native
    def directRender(
      postProcesses: js.Array[PostProcess],
      targetTexture: js.UndefOr[Nullable[InternalTexture]],
      forceFullscreenViewport: Boolean
    ): Unit = js.native
    def directRender(
      postProcesses: js.Array[PostProcess],
      targetTexture: js.UndefOr[Nullable[InternalTexture]],
      forceFullscreenViewport: Boolean,
      faceIndex: js.UndefOr[scala.Nothing],
      lodLevel: js.UndefOr[scala.Nothing],
      doNotBindFrambuffer: Boolean
    ): Unit = js.native
    def directRender(
      postProcesses: js.Array[PostProcess],
      targetTexture: js.UndefOr[Nullable[InternalTexture]],
      forceFullscreenViewport: Boolean,
      faceIndex: js.UndefOr[scala.Nothing],
      lodLevel: Double
    ): Unit = js.native
    def directRender(
      postProcesses: js.Array[PostProcess],
      targetTexture: js.UndefOr[Nullable[InternalTexture]],
      forceFullscreenViewport: Boolean,
      faceIndex: js.UndefOr[scala.Nothing],
      lodLevel: Double,
      doNotBindFrambuffer: Boolean
    ): Unit = js.native
    def directRender(
      postProcesses: js.Array[PostProcess],
      targetTexture: js.UndefOr[Nullable[InternalTexture]],
      forceFullscreenViewport: Boolean,
      faceIndex: Double
    ): Unit = js.native
    def directRender(
      postProcesses: js.Array[PostProcess],
      targetTexture: js.UndefOr[Nullable[InternalTexture]],
      forceFullscreenViewport: Boolean,
      faceIndex: Double,
      lodLevel: js.UndefOr[scala.Nothing],
      doNotBindFrambuffer: Boolean
    ): Unit = js.native
    def directRender(
      postProcesses: js.Array[PostProcess],
      targetTexture: js.UndefOr[Nullable[InternalTexture]],
      forceFullscreenViewport: Boolean,
      faceIndex: Double,
      lodLevel: Double
    ): Unit = js.native
    def directRender(
      postProcesses: js.Array[PostProcess],
      targetTexture: js.UndefOr[Nullable[InternalTexture]],
      forceFullscreenViewport: Boolean,
      faceIndex: Double,
      lodLevel: Double,
      doNotBindFrambuffer: Boolean
    ): Unit = js.native
    def directRender(postProcesses: js.Array[PostProcess], targetTexture: Nullable[InternalTexture]): Unit = js.native
    
    /**
      * Disposes of the post process manager.
      */
    def dispose(): Unit = js.native
  }
}
