package typingsSlinky.babylonjs

import typingsSlinky.babylonjs.animationMod.Animation
import typingsSlinky.babylonjs.cameraMod.Camera
import typingsSlinky.babylonjs.effectMod.Effect
import typingsSlinky.babylonjs.engineMod.Engine
import typingsSlinky.babylonjs.iInspectableMod.IInspectable
import typingsSlinky.babylonjs.internalTextureMod.InternalTexture
import typingsSlinky.babylonjs.mathColorMod.Color4
import typingsSlinky.babylonjs.mathVectorMod.Vector2
import typingsSlinky.babylonjs.nodeMaterialMod.NodeMaterial
import typingsSlinky.babylonjs.observableMod.Observable
import typingsSlinky.babylonjs.prePassEffectConfigurationMod.PrePassEffectConfiguration
import typingsSlinky.babylonjs.prePassRendererMod.PrePassRenderer
import typingsSlinky.babylonjs.sceneMod.Scene
import typingsSlinky.babylonjs.smartArrayMod.SmartArray
import typingsSlinky.babylonjs.typesMod.Nullable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object postProcessMod {
  
  @JSImport("babylonjs/PostProcesses/postProcess", "PostProcess")
  @js.native
  class PostProcess protected () extends StObject {
    /**
      * Creates a new instance PostProcess
      * @param name The name of the PostProcess.
      * @param fragmentUrl The url of the fragment shader to be used.
      * @param parameters Array of the names of uniform non-sampler2D variables that will be passed to the shader.
      * @param samplers Array of the names of uniform sampler2D variables that will be passed to the shader.
      * @param options The required width/height ratio to downsize to before computing the render pass. (Use 1.0 for full size)
      * @param camera The camera to apply the render pass to.
      * @param samplingMode The sampling mode to be used when computing the pass. (default: 0)
      * @param engine The engine which the post process will be applied. (default: current engine)
      * @param reusable If the post process can be reused on the same frame. (default: false)
      * @param defines String of defines that will be set when running the fragment shader. (default: null)
      * @param textureType Type of textures used when performing the post process. (default: 0)
      * @param vertexUrl The url of the vertex shader to be used. (default: "postprocess")
      * @param indexParameters The index parameters to be used for babylons include syntax "#include<kernelBlurVaryingDeclaration>[0..varyingCount]". (default: undefined) See usage in babylon.blurPostProcess.ts and kernelBlur.vertex.fx
      * @param blockCompilation If the shader should not be compiled immediatly. (default: false)
      * @param textureFormat Format of textures used when performing the post process. (default: TEXTUREFORMAT_RGBA)
      */
    def this(
      name: String,
      fragmentUrl: String,
      parameters: Nullable[js.Array[String]],
      samplers: Nullable[js.Array[String]],
      options: Double | PostProcessOptions,
      camera: Nullable[Camera],
      samplingMode: js.UndefOr[Double],
      engine: js.UndefOr[Engine],
      reusable: js.UndefOr[Boolean],
      defines: js.UndefOr[Nullable[String]],
      textureType: js.UndefOr[Double],
      vertexUrl: js.UndefOr[String],
      indexParameters: js.UndefOr[js.Any],
      blockCompilation: js.UndefOr[Boolean],
      textureFormat: js.UndefOr[Double]
    ) = this()
    
    var _camera: js.Any = js.native
    
    /**
      * The index in _textures that corresponds to the output texture.
      * @hidden
      */
    var _currentRenderTextureInd: Double = js.native
    
    var _disposeTextures: js.Any = js.native
    
    var _effect: js.Any = js.native
    
    var _engine: js.Any = js.native
    
    var _forcedOutputTexture: js.Any = js.native
    
    var _fragmentUrl: js.Any = js.native
    
    var _indexParameters: js.Any = js.native
    
    var _onActivateObserver: js.Any = js.native
    
    var _onAfterRenderObserver: js.Any = js.native
    
    var _onApplyObserver: js.Any = js.native
    
    var _onBeforeRenderObserver: js.Any = js.native
    
    var _onSizeChangedObserver: js.Any = js.native
    
    var _options: js.Any = js.native
    
    /**
      * Internal, reference to the location where this postprocess was output to. (Typically the texture on the next postprocess in the chain)
      * @hidden
      */
    var _outputTexture: Nullable[InternalTexture] = js.native
    
    var _parameters: js.Any = js.native
    
    /**
      * Prepass configuration in case this post process needs a texture from prepass
      * @hidden
      */
    var _prePassEffectConfiguration: PrePassEffectConfiguration = js.native
    
    var _reusable: js.Any = js.native
    
    var _samplers: js.Any = js.native
    
    var _samples: js.Any = js.native
    
    var _scaleRatio: js.Any = js.native
    
    var _scene: Scene = js.native
    
    var _shareOutputWithPostProcess: js.Any = js.native
    
    var _texelSize: js.Any = js.native
    
    var _textureFormat: js.Any = js.native
    
    var _textureType: js.Any = js.native
    
    /**
      * Smart array of input and output textures for the post process.
      * @hidden
      */
    var _textures: SmartArray[InternalTexture] = js.native
    
    var _vertexUrl: js.Any = js.native
    
    /**
      * Activates the post process by intializing the textures to be used when executed. Notifies onActivateObservable.
      * When this post process is used in a pipeline, this is call will bind the input texture of this post process to the output of the previous.
      * @param camera The camera that will be used in the post process. This camera will be used when calling onActivateObservable.
      * @param sourceTexture The source texture to be inspected to get the width and height if not specified in the post process constructor. (default: null)
      * @param forceDepthStencil If true, a depth and stencil buffer will be generated. (default: false)
      * @returns The target texture that was bound to be written to.
      */
    def activate(camera: Nullable[Camera]): InternalTexture = js.native
    def activate(
      camera: Nullable[Camera],
      sourceTexture: js.UndefOr[Nullable[InternalTexture]],
      forceDepthStencil: Boolean
    ): InternalTexture = js.native
    def activate(camera: Nullable[Camera], sourceTexture: Nullable[InternalTexture]): InternalTexture = js.native
    
    /**
      * Modify the scale of the post process to be the same as the viewport (default: false)
      */
    var adaptScaleToCurrentViewport: Boolean = js.native
    
    /**
      * Sets the setAlphaBlendConstants of the babylon engine
      */
    var alphaConstants: Color4 = js.native
    
    /**
      * Type of alpha mode to use when performing the post process (default: Engine.ALPHA_DISABLE)
      */
    var alphaMode: Double = js.native
    
    /**
      * Force textures to be a power of two (default: false)
      */
    var alwaysForcePOT: Boolean = js.native
    
    /**
      * Animations to be used for the post processing
      */
    var animations: js.Array[Animation] = js.native
    
    /**
      * Binds all textures and uniforms to the shader, this will be run on every pass.
      * @returns the effect corresponding to this post process. Null if not compiled or not ready.
      */
    @JSName("apply")
    def apply(): Nullable[Effect] = js.native
    
    /**
      * The aspect ratio of the output texture.
      */
    def aspectRatio: Double = js.native
    
    /**
      * If the buffer needs to be cleared before applying the post process. (default: true)
      * Should be set to false if shader will overwrite all previous pixels.
      */
    var autoClear: Boolean = js.native
    
    /**
      * Clear color to use when screen clearing
      */
    var clearColor: Color4 = js.native
    
    /**
      * Disposes the post process.
      * @param camera The camera to dispose the post process on.
      */
    def dispose(): Unit = js.native
    def dispose(camera: Camera): Unit = js.native
    
    /**
      * Enable Pixel Perfect mode where texture is not scaled to be power of 2.
      * Can only be used on a single postprocess or on the last one of a chain. (default: false)
      */
    var enablePixelPerfectMode: Boolean = js.native
    
    /**
      * Force the postprocess to be applied without taking in account viewport
      */
    var forceFullscreenViewport: Boolean = js.native
    
    /**
      * Gets the camera which post process is applied to.
      * @returns The camera the post process is applied to.
      */
    def getCamera(): Camera = js.native
    
    /**
      * Gets a string identifying the name of the class
      * @returns "PostProcess" string
      */
    def getClassName(): String = js.native
    
    /**
      * The effect that is created when initializing the post process.
      * @returns The created effect corresponding the the postprocess.
      */
    def getEffect(): Effect = js.native
    
    /**
      * Returns the fragment url or shader name used in the post process.
      * @returns the fragment url or name in the shader store.
      */
    def getEffectName(): String = js.native
    
    /**
      * Gets the engine which this post process belongs to.
      * @returns The engine the post process was enabled with.
      */
    def getEngine(): Engine = js.native
    
    /**
      * Height of the texture to apply the post process on
      */
    var height: Double = js.native
    
    /**
      * The input texture for this post process and the output texture of the previous post process. When added to a pipeline the previous post process will
      * render it's output into this texture and this texture will be used as textureSampler in the fragment shader of this post process.
      */
    def inputTexture: InternalTexture = js.native
    def inputTexture_=(value: InternalTexture): Unit = js.native
    
    /**
      * List of inspectable custom properties (used by the Inspector)
      * @see https://doc.babylonjs.com/how_to/debug_layer#extensibility
      */
    var inspectableCustomProperties: js.Array[IInspectable] = js.native
    
    /**
      * Get a value indicating if the post-process is ready to be used
      * @returns true if the post-process is ready (shader is compiled)
      */
    def isReady(): Boolean = js.native
    
    /**
      * The post process is reusable if it can be used multiple times within one frame.
      * @returns If the post process is reusable
      */
    def isReusable(): Boolean = js.native
    
    /**
      * If the post process is supported.
      */
    def isSupported: Boolean = js.native
    
    /** invalidate frameBuffer to hint the postprocess to create a depth buffer */
    def markTextureDirty(): Unit = js.native
    
    /** Name of the PostProcess. */
    var name: String = js.native
    
    /**
      * Gets the node material used to create this postprocess (null if the postprocess was manually created)
      */
    var nodeMaterialSource: Nullable[NodeMaterial] = js.native
    
    /**
      * An event triggered when the postprocess is activated.
      */
    var onActivateObservable: Observable[Camera] = js.native
    
    /**
      * A function that is added to the onActivateObservable
      */
    def onActivate_=(callback: Nullable[js.Function1[/* camera */ Camera, Unit]]): Unit = js.native
    
    /**
      * An event triggered after rendering the postprocess
      */
    var onAfterRenderObservable: Observable[Effect] = js.native
    
    /**
      * A function that is added to the onAfterRenderObservable
      */
    def onAfterRender_=(callback: js.Function1[/* efect */ Effect, Unit]): Unit = js.native
    
    /**
      * An event triggered when the postprocess applies its effect.
      */
    var onApplyObservable: Observable[Effect] = js.native
    
    /**
      * A function that is added to the onApplyObservable
      */
    def onApply_=(callback: js.Function1[/* effect */ Effect, Unit]): Unit = js.native
    
    /**
      * An event triggered before rendering the postprocess
      */
    var onBeforeRenderObservable: Observable[Effect] = js.native
    
    /**
      * A function that is added to the onBeforeRenderObservable
      */
    def onBeforeRender_=(callback: js.Function1[/* effect */ Effect, Unit]): Unit = js.native
    
    /**
      * An event triggered when the postprocess changes its size.
      */
    var onSizeChangedObservable: Observable[PostProcess] = js.native
    
    /**
      * A function that is added to the onSizeChangedObservable
      */
    def onSizeChanged_=(callback: js.Function1[/* postProcess */ this.type, Unit]): Unit = js.native
    
    /**
      * Sampling mode used by the shader
      * See https://doc.babylonjs.com/classes/3.1/texture
      */
    var renderTargetSamplingMode: Double = js.native
    
    /**
      * Since inputTexture should always be defined, if we previously manually set `inputTexture`,
      * the only way to unset it is to use this function to restore its internal state
      */
    def restoreDefaultInputTexture(): Unit = js.native
    
    /**
      * Number of sample textures (default: 1)
      */
    def samples: Double = js.native
    def samples_=(n: Double): Unit = js.native
    
    /**
      * Scale mode for the post process (default: Engine.SCALEMODE_FLOOR)
      *
      * | Value | Type                                | Description |
      * | ----- | ----------------------------------- | ----------- |
      * | 1     | SCALEMODE_FLOOR                     | [engine.scalemode_floor](https://doc.babylonjs.com/api/classes/babylon.engine#scalemode_floor) |
      * | 2     | SCALEMODE_NEAREST                   | [engine.scalemode_nearest](https://doc.babylonjs.com/api/classes/babylon.engine#scalemode_nearest) |
      * | 3     | SCALEMODE_CEILING                   | [engine.scalemode_ceiling](https://doc.babylonjs.com/api/classes/babylon.engine#scalemode_ceiling) |
      *
      */
    var scaleMode: Double = js.native
    
    /**
      * Serializes the particle system to a JSON object
      * @returns the JSON object
      */
    def serialize(): js.Any = js.native
    
    /**
      * Sets the required values to the prepass renderer.
      * @param prePassRenderer defines the prepass renderer to setup.
      * @returns true if the pre pass is needed.
      */
    def setPrePassRenderer(prePassRenderer: PrePassRenderer): Boolean = js.native
    
    /**
      * To avoid multiple redundant textures for multiple post process, the output the output texture for this post process can be shared with another.
      * @param postProcess The post process to share the output with.
      * @returns This post process.
      */
    def shareOutputWith(postProcess: PostProcess): PostProcess = js.native
    
    /**
      * Gets the texel size of the postprocess.
      * See https://en.wikipedia.org/wiki/Texel_(graphics)
      */
    def texelSize: Vector2 = js.native
    
    /**
      * Gets or sets the unique id of the post process
      */
    var uniqueId: Double = js.native
    
    /**
      * Updates the effect with the current post process compile time values and recompiles the shader.
      * @param defines Define statements that should be added at the beginning of the shader. (default: null)
      * @param uniforms Set of uniform variables that will be passed to the shader. (default: null)
      * @param samplers Set of Texture2D variables that will be passed to the shader. (default: null)
      * @param indexParameters The index parameters to be used for babylons include syntax "#include<kernelBlurVaryingDeclaration>[0..varyingCount]". (default: undefined) See usage in babylon.blurPostProcess.ts and kernelBlur.vertex.fx
      * @param onCompiled Called when the shader has been compiled.
      * @param onError Called if there is an error when compiling a shader.
      * @param vertexUrl The url of the vertex shader to be used (default: the one given at construction time)
      * @param fragmentUrl The url of the fragment shader to be used (default: the one given at construction time)
      */
    def updateEffect(
      defines: js.UndefOr[Nullable[String]],
      uniforms: js.UndefOr[Nullable[js.Array[String]]],
      samplers: js.UndefOr[Nullable[js.Array[String]]],
      indexParameters: js.UndefOr[js.Any],
      onCompiled: js.UndefOr[js.Function1[/* effect */ Effect, Unit]],
      onError: js.UndefOr[js.Function2[/* effect */ Effect, /* errors */ String, Unit]],
      vertexUrl: js.UndefOr[String],
      fragmentUrl: js.UndefOr[String]
    ): Unit = js.native
    
    /**
      * Reverses the effect of calling shareOutputWith and returns the post process back to its original state.
      * This should be called if the post process that shares output with this post process is disabled/disposed.
      */
    def useOwnOutput(): Unit = js.native
    
    /**
      * Width of the texture to apply the post process on
      */
    var width: Double = js.native
  }
  /* static members */
  object PostProcess {
    
    /**
      * Creates a material from parsed material data
      * @param parsedPostProcess defines parsed post process data
      * @param scene defines the hosting scene
      * @param rootUrl defines the root URL to use to load textures
      * @returns a new post process
      */
    @JSImport("babylonjs/PostProcesses/postProcess", "PostProcess.Parse")
    @js.native
    def Parse(parsedPostProcess: js.Any, scene: Scene, rootUrl: String): Nullable[PostProcess] = js.native
  }
  
  @js.native
  trait PostProcessOptions extends StObject {
    
    var height: Double = js.native
    
    var width: Double = js.native
  }
  object PostProcessOptions {
    
    @scala.inline
    def apply(height: Double, width: Double): PostProcessOptions = {
      val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
      __obj.asInstanceOf[PostProcessOptions]
    }
    
    @scala.inline
    implicit class PostProcessOptionsMutableBuilder[Self <: PostProcessOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    }
  }
}
