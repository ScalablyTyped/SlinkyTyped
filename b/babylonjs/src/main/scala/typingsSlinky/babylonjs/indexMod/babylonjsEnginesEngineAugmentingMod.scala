package typingsSlinky.babylonjs.indexMod

import org.scalajs.dom.raw.HTMLElement
import typingsSlinky.babylonjs.HTMLCanvasElement
import typingsSlinky.babylonjs.WebGLProgram
import typingsSlinky.babylonjs.engineMod.IDisplayChangedEventArgs
import typingsSlinky.babylonjs.engineWebVRMod.IVRPresentationAttributes
import typingsSlinky.babylonjs.typesMod.Nullable
import typingsSlinky.babylonjs.typesMod.int
import typingsSlinky.babylonjs.webVRCameraMod.WebVROptions
import typingsSlinky.std.WebGLQuery
import typingsSlinky.std.WebGLTransformFeedback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* augmented module */
@JSImport("babylonjs/index", "babylonjs/Engines/engine")
@js.native
object babylonjsEnginesEngineAugmentingMod extends js.Object {
  
  @js.native
  trait Engine extends js.Object {
    
    /** @hidden */
    def _createTimeQuery(): WebGLQuery = js.native
    
    /** @hidden */
    var _currentNonTimestampToken: Nullable[typingsSlinky.babylonjs.timeTokenMod.TimeToken] = js.native
    
    /** @hidden */
    def _deleteTimeQuery(query: WebGLQuery): Unit = js.native
    
    /** @hidden */
    def _getGlAlgorithmType(algorithmType: Double): Double = js.native
    
    /** @hidden */
    def _getTimeQueryAvailability(query: WebGLQuery): js.Any = js.native
    
    /** @hidden */
    def _getTimeQueryResult(query: WebGLQuery): js.Any = js.native
    
    /** @hidden */
    def _getVRDisplaysAsync(): js.Promise[IDisplayChangedEventArgs] = js.native
    
    /** @hidden */
    var _oldHardwareScaleFactor: Double = js.native
    
    /** @hidden */
    var _oldSize: typingsSlinky.babylonjs.mathSizeMod.Size = js.native
    
    /** @hidden */
    def _onVRDisplayPointerRestricted(): Unit = js.native
    
    /** @hidden */
    def _onVRDisplayPointerUnrestricted(): Unit = js.native
    
    /** @hidden */
    def _onVRFullScreenTriggered(): Unit = js.native
    
    /** @hidden */
    var _onVrDisplayConnect: Nullable[js.Function1[/* display */ _, Unit]] = js.native
    
    /** @hidden */
    var _onVrDisplayDisconnect: Nullable[js.Function0[Unit]] = js.native
    
    /** @hidden */
    var _onVrDisplayPresentChange: Nullable[js.Function0[Unit]] = js.native
    
    /** @hidden */
    var _vrDisplay: js.Any = js.native
    
    /** @hidden */
    var _vrExclusivePointerMode: Boolean = js.native
    
    /** @hidden */
    var _vrSupported: Boolean = js.native
    
    /** @hidden */
    var _webVRInitPromise: js.Promise[IDisplayChangedEventArgs] = js.native
    
    /**
      * Gets the current engine view
      * @see https://doc.babylonjs.com/how_to/multi_canvases
      */
    var activeView: Nullable[typingsSlinky.babylonjs.engineViewsMod.EngineView] = js.native
    
    /**
      * Initiates an occlusion query
      * @param algorithmType defines the algorithm to use
      * @param query defines the query to use
      * @returns the current engine
      * @see http://doc.babylonjs.com/features/occlusionquery
      */
    def beginOcclusionQuery(algorithmType: Double, query: WebGLQuery): typingsSlinky.babylonjs.engineOcclusionQueryMod.babylonjsEnginesEngineAugmentingMod.Engine = js.native
    
    /**
      * Begins a transform feedback operation
      * @param usePoints defines if points or triangles must be used
      */
    def beginTransformFeedback(usePoints: Boolean): Unit = js.native
    
    /**
      * Binds a multiview framebuffer to be drawn to
      * @param multiviewTexture texture to bind
      */
    def bindMultiviewFramebuffer(multiviewTexture: typingsSlinky.babylonjs.internalTextureMod.InternalTexture): Unit = js.native
    
    /**
      * Bind a webGL transform feedback object to the webgl context
      * @param value defines the webGL transform feedback object to bind
      */
    def bindTransformFeedback(value: Nullable[WebGLTransformFeedback]): Unit = js.native
    
    /**
      * Bind a webGL buffer for a transform feedback operation
      * @param value defines the webGL buffer to bind
      */
    def bindTransformFeedbackBuffer(value: Nullable[typingsSlinky.babylonjs.dataBufferMod.DataBuffer]): Unit = js.native
    
    /**
      * Create an effect to use with particle systems.
      * Please note that some parameters like animation sheets or not being billboard are not supported in this configuration
      * @param fragmentName defines the base name of the effect (The name of file without .fragment.fx)
      * @param uniformsNames defines a list of attribute names
      * @param samplers defines an array of string used to represent textures
      * @param defines defines the string containing the defines to use to compile the shaders
      * @param fallbacks defines the list of potential fallbacks to use if shader conmpilation fails
      * @param onCompiled defines a function to call when the effect creation is successful
      * @param onError defines a function to call when the effect creation has failed
      * @returns the new Effect
      */
    def createEffectForParticles(fragmentName: String, uniformsNames: js.Array[String], samplers: js.Array[String], defines: String): typingsSlinky.babylonjs.effectMod.Effect = js.native
    def createEffectForParticles(
      fragmentName: String,
      uniformsNames: js.Array[String],
      samplers: js.Array[String],
      defines: String,
      fallbacks: js.UndefOr[scala.Nothing],
      onCompiled: js.UndefOr[scala.Nothing],
      onError: js.Function2[/* effect */ typingsSlinky.babylonjs.effectMod.Effect, /* errors */ String, Unit]
    ): typingsSlinky.babylonjs.effectMod.Effect = js.native
    def createEffectForParticles(
      fragmentName: String,
      uniformsNames: js.Array[String],
      samplers: js.Array[String],
      defines: String,
      fallbacks: js.UndefOr[scala.Nothing],
      onCompiled: js.Function1[/* effect */ typingsSlinky.babylonjs.effectMod.Effect, Unit]
    ): typingsSlinky.babylonjs.effectMod.Effect = js.native
    def createEffectForParticles(
      fragmentName: String,
      uniformsNames: js.Array[String],
      samplers: js.Array[String],
      defines: String,
      fallbacks: js.UndefOr[scala.Nothing],
      onCompiled: js.Function1[/* effect */ typingsSlinky.babylonjs.effectMod.Effect, Unit],
      onError: js.Function2[/* effect */ typingsSlinky.babylonjs.effectMod.Effect, /* errors */ String, Unit]
    ): typingsSlinky.babylonjs.effectMod.Effect = js.native
    def createEffectForParticles(
      fragmentName: String,
      uniformsNames: js.Array[String],
      samplers: js.Array[String],
      defines: String,
      fallbacks: typingsSlinky.babylonjs.effectFallbacksMod.EffectFallbacks
    ): typingsSlinky.babylonjs.effectMod.Effect = js.native
    def createEffectForParticles(
      fragmentName: String,
      uniformsNames: js.Array[String],
      samplers: js.Array[String],
      defines: String,
      fallbacks: typingsSlinky.babylonjs.effectFallbacksMod.EffectFallbacks,
      onCompiled: js.UndefOr[scala.Nothing],
      onError: js.Function2[/* effect */ typingsSlinky.babylonjs.effectMod.Effect, /* errors */ String, Unit]
    ): typingsSlinky.babylonjs.effectMod.Effect = js.native
    def createEffectForParticles(
      fragmentName: String,
      uniformsNames: js.Array[String],
      samplers: js.Array[String],
      defines: String,
      fallbacks: typingsSlinky.babylonjs.effectFallbacksMod.EffectFallbacks,
      onCompiled: js.Function1[/* effect */ typingsSlinky.babylonjs.effectMod.Effect, Unit]
    ): typingsSlinky.babylonjs.effectMod.Effect = js.native
    def createEffectForParticles(
      fragmentName: String,
      uniformsNames: js.Array[String],
      samplers: js.Array[String],
      defines: String,
      fallbacks: typingsSlinky.babylonjs.effectFallbacksMod.EffectFallbacks,
      onCompiled: js.Function1[/* effect */ typingsSlinky.babylonjs.effectMod.Effect, Unit],
      onError: js.Function2[/* effect */ typingsSlinky.babylonjs.effectMod.Effect, /* errors */ String, Unit]
    ): typingsSlinky.babylonjs.effectMod.Effect = js.native
    
    /**
      * Creates a new multiview render target
      * @param width defines the width of the texture
      * @param height defines the height of the texture
      * @returns the created multiview texture
      */
    def createMultiviewRenderTargetTexture(width: Double, height: Double): typingsSlinky.babylonjs.internalTextureMod.InternalTexture = js.native
    
    /**
      * Create a new webGL query (you must be sure that queries are supported by checking getCaps() function)
      * @return the new query
      */
    def createQuery(): WebGLQuery = js.native
    
    /**
      * Creates a new raw cube texture
      * @param data defines the array of data to use to create each face
      * @param size defines the size of the textures
      * @param format defines the format of the data
      * @param type defines the type of the data (like Engine.TEXTURETYPE_UNSIGNED_INT)
      * @param generateMipMaps  defines if the engine should generate the mip levels
      * @param invertY defines if data must be stored with Y axis inverted
      * @param samplingMode defines the required sampling mode (like Texture.NEAREST_SAMPLINGMODE)
      * @param compression defines the compression used (null by default)
      * @returns the cube texture as an InternalTexture
      */
    def createRawCubeTexture(
      data: Nullable[js.Array[js.typedarray.ArrayBufferView]],
      size: Double,
      format: Double,
      `type`: Double,
      generateMipMaps: Boolean,
      invertY: Boolean,
      samplingMode: Double,
      compression: Nullable[String]
    ): typingsSlinky.babylonjs.internalTextureMod.InternalTexture = js.native
    
    /**
      * Creates a new raw cube texture from a specified url
      * @param url defines the url where the data is located
      * @param scene defines the current scene
      * @param size defines the size of the textures
      * @param format defines the format of the data
      * @param type defines the type fo the data (like Engine.TEXTURETYPE_UNSIGNED_INT)
      * @param noMipmap defines if the engine should avoid generating the mip levels
      * @param callback defines a callback used to extract texture data from loaded data
      * @param mipmapGenerator defines to provide an optional tool to generate mip levels
      * @param onLoad defines a callback called when texture is loaded
      * @param onError defines a callback called if there is an error
      * @returns the cube texture as an InternalTexture
      */
    def createRawCubeTextureFromUrl(
      url: String,
      scene: typingsSlinky.babylonjs.sceneMod.Scene,
      size: Double,
      format: Double,
      `type`: Double,
      noMipmap: Boolean,
      callback: js.Function1[
          /* ArrayBuffer */ js.typedarray.ArrayBuffer, 
          Nullable[js.Array[js.typedarray.ArrayBufferView]]
        ],
      mipmapGenerator: Nullable[
          js.Function1[
            /* faces */ js.Array[js.typedarray.ArrayBufferView], 
            js.Array[js.Array[js.typedarray.ArrayBufferView]]
          ]
        ],
      onLoad: Nullable[js.Function0[Unit]],
      onError: Nullable[
          js.Function2[/* message */ js.UndefOr[String], /* exception */ js.UndefOr[_], Unit]
        ]
    ): typingsSlinky.babylonjs.internalTextureMod.InternalTexture = js.native
    /**
      * Creates a new raw cube texture from a specified url
      * @param url defines the url where the data is located
      * @param scene defines the current scene
      * @param size defines the size of the textures
      * @param format defines the format of the data
      * @param type defines the type fo the data (like Engine.TEXTURETYPE_UNSIGNED_INT)
      * @param noMipmap defines if the engine should avoid generating the mip levels
      * @param callback defines a callback used to extract texture data from loaded data
      * @param mipmapGenerator defines to provide an optional tool to generate mip levels
      * @param onLoad defines a callback called when texture is loaded
      * @param onError defines a callback called if there is an error
      * @param samplingMode defines the required sampling mode (like Texture.NEAREST_SAMPLINGMODE)
      * @param invertY defines if data must be stored with Y axis inverted
      * @returns the cube texture as an InternalTexture
      */
    def createRawCubeTextureFromUrl(
      url: String,
      scene: typingsSlinky.babylonjs.sceneMod.Scene,
      size: Double,
      format: Double,
      `type`: Double,
      noMipmap: Boolean,
      callback: js.Function1[
          /* ArrayBuffer */ js.typedarray.ArrayBuffer, 
          Nullable[js.Array[js.typedarray.ArrayBufferView]]
        ],
      mipmapGenerator: Nullable[
          js.Function1[
            /* faces */ js.Array[js.typedarray.ArrayBufferView], 
            js.Array[js.Array[js.typedarray.ArrayBufferView]]
          ]
        ],
      onLoad: Nullable[js.Function0[Unit]],
      onError: Nullable[
          js.Function2[/* message */ js.UndefOr[String], /* exception */ js.UndefOr[_], Unit]
        ],
      samplingMode: Double,
      invertY: Boolean
    ): typingsSlinky.babylonjs.internalTextureMod.InternalTexture = js.native
    
    /**
      * Creates a raw texture
      * @param data defines the data to store in the texture
      * @param width defines the width of the texture
      * @param height defines the height of the texture
      * @param format defines the format of the data
      * @param generateMipMaps defines if the engine should generate the mip levels
      * @param invertY defines if data must be stored with Y axis inverted
      * @param samplingMode defines the required sampling mode (Texture.NEAREST_SAMPLINGMODE by default)
      * @param compression defines the compression used (null by default)
      * @param type defines the type fo the data (Engine.TEXTURETYPE_UNSIGNED_INT by default)
      * @returns the raw texture inside an InternalTexture
      */
    def createRawTexture(
      data: Nullable[js.typedarray.ArrayBufferView],
      width: Double,
      height: Double,
      format: Double,
      generateMipMaps: Boolean,
      invertY: Boolean,
      samplingMode: Double,
      compression: Nullable[String],
      `type`: Double
    ): typingsSlinky.babylonjs.internalTextureMod.InternalTexture = js.native
    
    /**
      * Creates a new raw 2D array texture
      * @param data defines the data used to create the texture
      * @param width defines the width of the texture
      * @param height defines the height of the texture
      * @param depth defines the number of layers of the texture
      * @param format defines the format of the texture
      * @param generateMipMaps defines if the engine must generate mip levels
      * @param invertY defines if data must be stored with Y axis inverted
      * @param samplingMode defines the required sampling mode (like Texture.NEAREST_SAMPLINGMODE)
      * @param compression defines the compressed used (can be null)
      * @param textureType defines the compressed used (can be null)
      * @returns a new raw 2D array texture (stored in an InternalTexture)
      */
    def createRawTexture2DArray(
      data: Nullable[js.typedarray.ArrayBufferView],
      width: Double,
      height: Double,
      depth: Double,
      format: Double,
      generateMipMaps: Boolean,
      invertY: Boolean,
      samplingMode: Double,
      compression: Nullable[String],
      textureType: Double
    ): typingsSlinky.babylonjs.internalTextureMod.InternalTexture = js.native
    
    /**
      * Creates a new raw 3D texture
      * @param data defines the data used to create the texture
      * @param width defines the width of the texture
      * @param height defines the height of the texture
      * @param depth defines the depth of the texture
      * @param format defines the format of the texture
      * @param generateMipMaps defines if the engine must generate mip levels
      * @param invertY defines if data must be stored with Y axis inverted
      * @param samplingMode defines the required sampling mode (like Texture.NEAREST_SAMPLINGMODE)
      * @param compression defines the compressed used (can be null)
      * @param textureType defines the compressed used (can be null)
      * @returns a new raw 3D texture (stored in an InternalTexture)
      */
    def createRawTexture3D(
      data: Nullable[js.typedarray.ArrayBufferView],
      width: Double,
      height: Double,
      depth: Double,
      format: Double,
      generateMipMaps: Boolean,
      invertY: Boolean,
      samplingMode: Double,
      compression: Nullable[String],
      textureType: Double
    ): typingsSlinky.babylonjs.internalTextureMod.InternalTexture = js.native
    
    /**
      * Creates a webGL transform feedback object
      * Please makes sure to check webGLVersion property to check if you are running webGL 2+
      * @returns the webGL transform feedback object
      */
    def createTransformFeedback(): WebGLTransformFeedback = js.native
    
    /**
      * Delete and release a webGL query
      * @param query defines the query to delete
      * @return the current engine
      */
    def deleteQuery(query: WebGLQuery): typingsSlinky.babylonjs.engineOcclusionQueryMod.babylonjsEnginesEngineAugmentingMod.Engine = js.native
    
    /**
      * Delete a webGL transform feedback object
      * @param value defines the webGL transform feedback object to delete
      */
    def deleteTransformFeedback(value: WebGLTransformFeedback): Unit = js.native
    
    /**
      * Call this function to switch to webVR mode
      * Will do nothing if webVR is not supported or if there is no webVR device
      * @param options the webvr options provided to the camera. mainly used for multiview
      * @see http://doc.babylonjs.com/how_to/webvr_camera
      */
    def enableVR(options: WebVROptions): Unit = js.native
    
    /**
      * Ends an occlusion query
      * @see http://doc.babylonjs.com/features/occlusionquery
      * @param algorithmType defines the algorithm to use
      * @returns the current engine
      */
    def endOcclusionQuery(algorithmType: Double): typingsSlinky.babylonjs.engineOcclusionQueryMod.babylonjsEnginesEngineAugmentingMod.Engine = js.native
    
    /**
      * Ends a time query
      * @param token defines the token used to measure the time span
      * @returns the time spent (in ns)
      */
    def endTimeQuery(token: typingsSlinky.babylonjs.timeTokenMod.TimeToken): int = js.native
    
    /**
      * Ends a transform feedback operation
      */
    def endTransformFeedback(): Unit = js.native
    
    /**
      * Gets the value of a given query
      * @param query defines the query to check
      * @returns the value of the query
      */
    def getQueryResult(query: WebGLQuery): Double = js.native
    
    /**
      * Gets the current webVR device
      * @returns the current webVR device (or null)
      */
    def getVRDevice(): js.Any = js.native
    
    /**
      * Initializes a webVR display and starts listening to display change events
      * The onVRDisplayChangedObservable will be notified upon these changes
      * @returns A promise containing a VRDisplay and if vr is supported
      */
    def initWebVRAsync(): js.Promise[IDisplayChangedEventArgs] = js.native
    
    /**
      * Gets or sets the  HTML element to use for attaching events
      */
    var inputElement: Nullable[HTMLElement] = js.native
    
    /**
      * Gets a boolean indicating that the engine is currently in VR exclusive mode for the pointers
      * @see https://docs.microsoft.com/en-us/microsoft-edge/webvr/essentials#mouse-input
      */
    var isInVRExclusivePointerMode: Boolean = js.native
    
    /**
      * Check if a given query has resolved and got its value
      * @param query defines the query to check
      * @returns true if the query got its value
      */
    def isQueryResultAvailable(query: WebGLQuery): Boolean = js.native
    
    /**
      * Gets a boolean indicating if a webVR device was detected
      * @returns true if a webVR device was detected
      */
    def isVRDevicePresent(): Boolean = js.native
    
    /**
      * Observable signaled when VR display mode changes
      */
    var onVRDisplayChangedObservable: typingsSlinky.babylonjs.observableMod.Observable[IDisplayChangedEventArgs] = js.native
    
    /**
      * Observable signaled when VR request present is complete
      */
    var onVRRequestPresentComplete: typingsSlinky.babylonjs.observableMod.Observable[Boolean] = js.native
    
    /**
      * Observable signaled when VR request present starts
      */
    var onVRRequestPresentStart: typingsSlinky.babylonjs.observableMod.Observable[
        typingsSlinky.babylonjs.engineWebVRMod.babylonjsEnginesEngineAugmentingMod.Engine
      ] = js.native
    
    /**
      * Register a new child canvas
      * @param canvas defines the canvas to register
      * @param camera defines an optional camera to use with this canvas (it will overwrite the scene.camera for this view)
      * @returns the associated view
      */
    def registerView(canvas: HTMLCanvasElement): typingsSlinky.babylonjs.engineViewsMod.EngineView = js.native
    def registerView(canvas: HTMLCanvasElement, camera: typingsSlinky.babylonjs.cameraMod.Camera): typingsSlinky.babylonjs.engineViewsMod.EngineView = js.native
    
    /**
      * Specify the varyings to use with transform feedback
      * @param program defines the associated webGL program
      * @param value defines the list of strings representing the varying names
      */
    def setTranformFeedbackVaryings(program: WebGLProgram, value: js.Array[String]): Unit = js.native
    
    /**
      * Starts a time query (used to measure time spent by the GPU on a specific frame)
      * Please note that only one query can be issued at a time
      * @returns a time token used to track the time span
      */
    def startTimeQuery(): Nullable[typingsSlinky.babylonjs.timeTokenMod.TimeToken] = js.native
    
    /**
      * Remove a registered child canvas
      * @param canvas defines the canvas to remove
      * @returns the current engine
      */
    def unRegisterView(canvas: HTMLCanvasElement): typingsSlinky.babylonjs.engineViewsMod.babylonjsEnginesEngineAugmentingMod.Engine = js.native
    
    /**
      * Update a raw cube texture
      * @param texture defines the texture to udpdate
      * @param data defines the data to store
      * @param format defines the data format
      * @param type defines the type fo the data (Engine.TEXTURETYPE_UNSIGNED_INT by default)
      * @param invertY defines if data must be stored with Y axis inverted
      */
    def updateRawCubeTexture(
      texture: typingsSlinky.babylonjs.internalTextureMod.InternalTexture,
      data: js.Array[js.typedarray.ArrayBufferView],
      format: Double,
      `type`: Double,
      invertY: Boolean
    ): Unit = js.native
    /**
      * Update a raw cube texture
      * @param texture defines the texture to udpdate
      * @param data defines the data to store
      * @param format defines the data format
      * @param type defines the type fo the data (Engine.TEXTURETYPE_UNSIGNED_INT by default)
      * @param invertY defines if data must be stored with Y axis inverted
      * @param compression defines the compression used (null by default)
      */
    def updateRawCubeTexture(
      texture: typingsSlinky.babylonjs.internalTextureMod.InternalTexture,
      data: js.Array[js.typedarray.ArrayBufferView],
      format: Double,
      `type`: Double,
      invertY: Boolean,
      compression: Nullable[String]
    ): Unit = js.native
    /**
      * Update a raw cube texture
      * @param texture defines the texture to udpdate
      * @param data defines the data to store
      * @param format defines the data format
      * @param type defines the type fo the data (Engine.TEXTURETYPE_UNSIGNED_INT by default)
      * @param invertY defines if data must be stored with Y axis inverted
      * @param compression defines the compression used (null by default)
      * @param level defines which level of the texture to update
      */
    def updateRawCubeTexture(
      texture: typingsSlinky.babylonjs.internalTextureMod.InternalTexture,
      data: js.Array[js.typedarray.ArrayBufferView],
      format: Double,
      `type`: Double,
      invertY: Boolean,
      compression: Nullable[String],
      level: Double
    ): Unit = js.native
    
    /**
      * Update a raw texture
      * @param texture defines the texture to update
      * @param data defines the data to store in the texture
      * @param format defines the format of the data
      * @param invertY defines if data must be stored with Y axis inverted
      */
    def updateRawTexture(
      texture: Nullable[typingsSlinky.babylonjs.internalTextureMod.InternalTexture],
      data: Nullable[js.typedarray.ArrayBufferView],
      format: Double,
      invertY: Boolean
    ): Unit = js.native
    /**
      * Update a raw texture
      * @param texture defines the texture to update
      * @param data defines the data to store in the texture
      * @param format defines the format of the data
      * @param invertY defines if data must be stored with Y axis inverted
      * @param compression defines the compression used (null by default)
      * @param type defines the type fo the data (Engine.TEXTURETYPE_UNSIGNED_INT by default)
      */
    def updateRawTexture(
      texture: Nullable[typingsSlinky.babylonjs.internalTextureMod.InternalTexture],
      data: Nullable[js.typedarray.ArrayBufferView],
      format: Double,
      invertY: Boolean,
      compression: Nullable[String],
      `type`: Double
    ): Unit = js.native
    
    /**
      * Update a raw 2D array texture
      * @param texture defines the texture to update
      * @param data defines the data to store
      * @param format defines the data format
      * @param invertY defines if data must be stored with Y axis inverted
      */
    def updateRawTexture2DArray(
      texture: typingsSlinky.babylonjs.internalTextureMod.InternalTexture,
      data: Nullable[js.typedarray.ArrayBufferView],
      format: Double,
      invertY: Boolean
    ): Unit = js.native
    /**
      * Update a raw 2D array texture
      * @param texture defines the texture to update
      * @param data defines the data to store
      * @param format defines the data format
      * @param invertY defines if data must be stored with Y axis inverted
      * @param compression defines the used compression (can be null)
      * @param textureType defines the texture Type (Engine.TEXTURETYPE_UNSIGNED_INT, Engine.TEXTURETYPE_FLOAT...)
      */
    def updateRawTexture2DArray(
      texture: typingsSlinky.babylonjs.internalTextureMod.InternalTexture,
      data: Nullable[js.typedarray.ArrayBufferView],
      format: Double,
      invertY: Boolean,
      compression: Nullable[String],
      textureType: Double
    ): Unit = js.native
    
    /**
      * Update a raw 3D texture
      * @param texture defines the texture to update
      * @param data defines the data to store
      * @param format defines the data format
      * @param invertY defines if data must be stored with Y axis inverted
      */
    def updateRawTexture3D(
      texture: typingsSlinky.babylonjs.internalTextureMod.InternalTexture,
      data: Nullable[js.typedarray.ArrayBufferView],
      format: Double,
      invertY: Boolean
    ): Unit = js.native
    /**
      * Update a raw 3D texture
      * @param texture defines the texture to update
      * @param data defines the data to store
      * @param format defines the data format
      * @param invertY defines if data must be stored with Y axis inverted
      * @param compression defines the used compression (can be null)
      * @param textureType defines the texture Type (Engine.TEXTURETYPE_UNSIGNED_INT, Engine.TEXTURETYPE_FLOAT...)
      */
    def updateRawTexture3D(
      texture: typingsSlinky.babylonjs.internalTextureMod.InternalTexture,
      data: Nullable[js.typedarray.ArrayBufferView],
      format: Double,
      invertY: Boolean,
      compression: Nullable[String],
      textureType: Double
    ): Unit = js.native
    
    /** Gets or sets the list of views */
    var views: js.Array[typingsSlinky.babylonjs.engineViewsMod.EngineView] = js.native
    
    /**
      * Gets or sets the presentation attributes used to configure VR rendering
      */
    var vrPresentationAttributes: js.UndefOr[IVRPresentationAttributes] = js.native
  }
}
