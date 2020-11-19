package typingsSlinky.babylonjs.extensionsIndexMod

import org.scalajs.dom.raw.HTMLImageElement
import typingsSlinky.babylonjs.HTMLCanvasElement
import typingsSlinky.babylonjs.HTMLVideoElement
import typingsSlinky.babylonjs.anon.Height
import typingsSlinky.babylonjs.anon.PartialRenderTargetCreati
import typingsSlinky.babylonjs.dataBufferMod.DataBuffer
import typingsSlinky.babylonjs.depthTextureCreationOptionsMod.DepthTextureCreationOptions
import typingsSlinky.babylonjs.internalTextureMod.InternalTexture
import typingsSlinky.babylonjs.ipipelinecontextMod.IPipelineContext
import typingsSlinky.babylonjs.multiRenderTargetMod.IMultiRenderTargetOptions
import typingsSlinky.babylonjs.renderTargetCreationOptionsMod.RenderTargetCreationOptions
import typingsSlinky.babylonjs.sceneMod.Scene
import typingsSlinky.babylonjs.typesMod.FloatArray
import typingsSlinky.babylonjs.typesMod.Nullable
import typingsSlinky.std.OffscreenCanvas
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* augmented module */
@JSImport("babylonjs/Engines/Extensions/index", "babylonjs/Engines/thinEngine")
@js.native
object babylonjsEnginesThinEngineAugmentingMod extends js.Object {
  
  @js.native
  trait ThinEngine extends js.Object {
    
    /** @hidden */
    def _cascadeLoadFiles(
      scene: Nullable[Scene],
      onfinish: js.Function1[/* images */ js.Array[js.typedarray.ArrayBuffer], Unit],
      files: js.Array[String],
      onError: Nullable[
          js.Function2[/* message */ js.UndefOr[String], /* exception */ js.UndefOr[_], Unit]
        ]
    ): Unit = js.native
    
    /** @hidden */
    def _cascadeLoadImgs(
      scene: Nullable[Scene],
      onfinish: js.Function1[/* images */ js.Array[HTMLImageElement], Unit],
      files: js.Array[String],
      onError: Nullable[
          js.Function2[/* message */ js.UndefOr[String], /* exception */ js.UndefOr[_], Unit]
        ]
    ): Unit = js.native
    def _cascadeLoadImgs(
      scene: Nullable[Scene],
      onfinish: js.Function1[/* images */ js.Array[HTMLImageElement], Unit],
      files: js.Array[String],
      onError: Nullable[
          js.Function2[/* message */ js.UndefOr[String], /* exception */ js.UndefOr[_], Unit]
        ],
      mimeType: String
    ): Unit = js.native
    
    /**
      * Creates a depth stencil cube texture.
      * This is only available in WebGL 2.
      * @param size The size of face edge in the cube texture.
      * @param options The options defining the cube texture.
      * @returns The cube texture
      */
    def _createDepthStencilCubeTexture(size: Double, options: DepthTextureCreationOptions): InternalTexture = js.native
    
    /** @hidden */
    def _createDepthStencilTexture(size: Double, options: DepthTextureCreationOptions): InternalTexture = js.native
    def _createDepthStencilTexture(size: Height, options: DepthTextureCreationOptions): InternalTexture = js.native
    
    /** @hidden */
    def _partialLoadFile(
      url: String,
      index: Double,
      loadedFiles: js.Array[js.typedarray.ArrayBuffer],
      onfinish: js.Function1[/* files */ js.Array[js.typedarray.ArrayBuffer], Unit],
      onErrorCallBack: Nullable[
          js.Function2[/* message */ js.UndefOr[String], /* exception */ js.UndefOr[_], Unit]
        ]
    ): Unit = js.native
    
    /** @hidden */
    def _partialLoadImg(
      url: String,
      index: Double,
      loadedImages: js.Array[HTMLImageElement],
      scene: Nullable[Scene],
      onfinish: js.Function1[/* images */ js.Array[HTMLImageElement], Unit],
      onErrorCallBack: Nullable[
          js.Function2[/* message */ js.UndefOr[String], /* exception */ js.UndefOr[_], Unit]
        ]
    ): Unit = js.native
    def _partialLoadImg(
      url: String,
      index: Double,
      loadedImages: js.Array[HTMLImageElement],
      scene: Nullable[Scene],
      onfinish: js.Function1[/* images */ js.Array[HTMLImageElement], Unit],
      onErrorCallBack: Nullable[
          js.Function2[/* message */ js.UndefOr[String], /* exception */ js.UndefOr[_], Unit]
        ],
      mimeType: String
    ): Unit = js.native
    
    /**
      * @hidden
      */
    def _setCubeMapTextureParams(loadMipmap: Boolean): Unit = js.native
    
    /**
      * Bind a specific block at a given index in a specific shader program
      * @param pipelineContext defines the pipeline context to use
      * @param blockName defines the block name
      * @param index defines the index where to bind the block
      */
    def bindUniformBlock(pipelineContext: IPipelineContext, blockName: String, index: Double): Unit = js.native
    
    /**
      * Bind an uniform buffer to the current webGL context
      * @param buffer defines the buffer to bind
      */
    def bindUniformBuffer(buffer: Nullable[DataBuffer]): Unit = js.native
    
    /**
      * Bind a buffer to the current webGL context at a given location
      * @param buffer defines the buffer to bind
      * @param location defines the index where to bind the buffer
      */
    def bindUniformBufferBase(buffer: DataBuffer, location: Double): Unit = js.native
    
    def createCubeTexture(
      rootUrl: String,
      scene: Nullable[Scene],
      files: Nullable[js.Array[String]],
      noMipmap: js.UndefOr[scala.Nothing],
      onLoad: Nullable[js.Function1[/* data */ js.UndefOr[_], Unit]],
      onError: Nullable[
          js.Function2[/* message */ js.UndefOr[String], /* exception */ js.UndefOr[_], Unit]
        ],
      format: js.UndefOr[scala.Nothing],
      forcedExtension: js.Any,
      createPolynomials: Boolean,
      lodScale: Double,
      lodOffset: Double,
      fallback: Nullable[InternalTexture]
    ): InternalTexture = js.native
    def createCubeTexture(
      rootUrl: String,
      scene: Nullable[Scene],
      files: Nullable[js.Array[String]],
      noMipmap: js.UndefOr[scala.Nothing],
      onLoad: Nullable[js.Function1[/* data */ js.UndefOr[_], Unit]],
      onError: Nullable[
          js.Function2[/* message */ js.UndefOr[String], /* exception */ js.UndefOr[_], Unit]
        ],
      format: Double,
      forcedExtension: js.Any,
      createPolynomials: Boolean,
      lodScale: Double,
      lodOffset: Double,
      fallback: Nullable[InternalTexture]
    ): InternalTexture = js.native
    def createCubeTexture(
      rootUrl: String,
      scene: Nullable[Scene],
      files: Nullable[js.Array[String]],
      noMipmap: Boolean,
      onLoad: Nullable[js.Function1[/* data */ js.UndefOr[_], Unit]],
      onError: Nullable[
          js.Function2[/* message */ js.UndefOr[String], /* exception */ js.UndefOr[_], Unit]
        ],
      format: js.UndefOr[scala.Nothing],
      forcedExtension: js.Any
    ): InternalTexture = js.native
    def createCubeTexture(
      rootUrl: String,
      scene: Nullable[Scene],
      files: Nullable[js.Array[String]],
      noMipmap: Boolean,
      onLoad: Nullable[js.Function1[/* data */ js.UndefOr[_], Unit]],
      onError: Nullable[
          js.Function2[/* message */ js.UndefOr[String], /* exception */ js.UndefOr[_], Unit]
        ],
      format: js.UndefOr[scala.Nothing],
      forcedExtension: js.Any,
      createPolynomials: Boolean,
      lodScale: Double,
      lodOffset: Double
    ): InternalTexture = js.native
    def createCubeTexture(
      rootUrl: String,
      scene: Nullable[Scene],
      files: Nullable[js.Array[String]],
      noMipmap: Boolean,
      onLoad: Nullable[js.Function1[/* data */ js.UndefOr[_], Unit]],
      onError: Nullable[
          js.Function2[/* message */ js.UndefOr[String], /* exception */ js.UndefOr[_], Unit]
        ],
      format: js.UndefOr[scala.Nothing],
      forcedExtension: js.Any,
      createPolynomials: Boolean,
      lodScale: Double,
      lodOffset: Double,
      fallback: Nullable[InternalTexture]
    ): InternalTexture = js.native
    /**
      * Creates a cube texture
      * @param rootUrl defines the url where the files to load is located
      * @param scene defines the current scene
      * @param files defines the list of files to load (1 per face)
      * @param noMipmap defines a boolean indicating that no mipmaps shall be generated (false by default)
      * @param onLoad defines an optional callback raised when the texture is loaded
      * @param onError defines an optional callback raised if there is an issue to load the texture
      * @param format defines the format of the data
      * @param forcedExtension defines the extension to use to pick the right loader
      * @returns the cube texture as an InternalTexture
      */
    def createCubeTexture(
      rootUrl: String,
      scene: Nullable[Scene],
      files: Nullable[js.Array[String]],
      noMipmap: Boolean,
      onLoad: Nullable[js.Function1[/* data */ js.UndefOr[_], Unit]],
      onError: Nullable[
          js.Function2[/* message */ js.UndefOr[String], /* exception */ js.UndefOr[_], Unit]
        ],
      format: Double,
      forcedExtension: js.Any
    ): InternalTexture = js.native
    /**
      * Creates a cube texture
      * @param rootUrl defines the url where the files to load is located
      * @param scene defines the current scene
      * @param files defines the list of files to load (1 per face)
      * @param noMipmap defines a boolean indicating that no mipmaps shall be generated (false by default)
      * @param onLoad defines an optional callback raised when the texture is loaded
      * @param onError defines an optional callback raised if there is an issue to load the texture
      * @param format defines the format of the data
      * @param forcedExtension defines the extension to use to pick the right loader
      * @param createPolynomials if a polynomial sphere should be created for the cube texture
      * @param lodScale defines the scale applied to environment texture. This manages the range of LOD level used for IBL according to the roughness
      * @param lodOffset defines the offset applied to environment texture. This manages first LOD level used for IBL according to the roughness
      * @returns the cube texture as an InternalTexture
      */
    def createCubeTexture(
      rootUrl: String,
      scene: Nullable[Scene],
      files: Nullable[js.Array[String]],
      noMipmap: Boolean,
      onLoad: Nullable[js.Function1[/* data */ js.UndefOr[_], Unit]],
      onError: Nullable[
          js.Function2[/* message */ js.UndefOr[String], /* exception */ js.UndefOr[_], Unit]
        ],
      format: Double,
      forcedExtension: js.Any,
      createPolynomials: Boolean,
      lodScale: Double,
      lodOffset: Double
    ): InternalTexture = js.native
    /**
      * Creates a cube texture
      * @param rootUrl defines the url where the files to load is located
      * @param scene defines the current scene
      * @param files defines the list of files to load (1 per face)
      * @param noMipmap defines a boolean indicating that no mipmaps shall be generated (false by default)
      * @param onLoad defines an optional callback raised when the texture is loaded
      * @param onError defines an optional callback raised if there is an issue to load the texture
      * @param format defines the format of the data
      * @param forcedExtension defines the extension to use to pick the right loader
      * @param createPolynomials if a polynomial sphere should be created for the cube texture
      * @param lodScale defines the scale applied to environment texture. This manages the range of LOD level used for IBL according to the roughness
      * @param lodOffset defines the offset applied to environment texture. This manages first LOD level used for IBL according to the roughness
      * @param fallback defines texture to use while falling back when (compressed) texture file not found.
      * @returns the cube texture as an InternalTexture
      */
    def createCubeTexture(
      rootUrl: String,
      scene: Nullable[Scene],
      files: Nullable[js.Array[String]],
      noMipmap: Boolean,
      onLoad: Nullable[js.Function1[/* data */ js.UndefOr[_], Unit]],
      onError: Nullable[
          js.Function2[/* message */ js.UndefOr[String], /* exception */ js.UndefOr[_], Unit]
        ],
      format: Double,
      forcedExtension: js.Any,
      createPolynomials: Boolean,
      lodScale: Double,
      lodOffset: Double,
      fallback: Nullable[InternalTexture]
    ): InternalTexture = js.native
    
    /**
      * Creates a depth stencil texture.
      * This is only available in WebGL 2 or with the depth texture extension available.
      * @param size The size of face edge in the texture.
      * @param options The options defining the texture.
      * @returns The texture
      */
    def createDepthStencilTexture(size: Double, options: DepthTextureCreationOptions): InternalTexture = js.native
    def createDepthStencilTexture(size: Height, options: DepthTextureCreationOptions): InternalTexture = js.native
    
    /**
      * Creates a dynamic texture
      * @param width defines the width of the texture
      * @param height defines the height of the texture
      * @param generateMipMaps defines if the engine should generate the mip levels
      * @param samplingMode defines the required sampling mode (Texture.NEAREST_SAMPLINGMODE by default)
      * @returns the dynamic texture inside an InternalTexture
      */
    def createDynamicTexture(width: Double, height: Double, generateMipMaps: Boolean, samplingMode: Double): InternalTexture = js.native
    
    /**
      * Create a dynamic uniform buffer
      * @see http://doc.babylonjs.com/features/webgl2#uniform-buffer-objets
      * @param elements defines the content of the uniform buffer
      * @returns the webGL uniform buffer
      */
    def createDynamicUniformBuffer(elements: FloatArray): DataBuffer = js.native
    
    /**
      * Create a multi render target texture
      * @see http://doc.babylonjs.com/features/webgl2#multiple-render-target
      * @param size defines the size of the texture
      * @param options defines the creation options
      * @returns the cube texture as an InternalTexture
      */
    def createMultipleRenderTarget(size: js.Any, options: IMultiRenderTargetOptions): js.Array[InternalTexture] = js.native
    
    /**
      * Creates a new render target cube texture
      * @param size defines the size of the texture
      * @param options defines the options used to create the texture
      * @returns a new render target cube texture stored in an InternalTexture
      */
    def createRenderTargetCubeTexture(size: Double): InternalTexture = js.native
    def createRenderTargetCubeTexture(size: Double, options: PartialRenderTargetCreati): InternalTexture = js.native
    
    /**
      * Creates a new render target texture
      * @param size defines the size of the texture
      * @param options defines the options used to create the texture
      * @returns a new render target texture stored in an InternalTexture
      */
    def createRenderTargetTexture(size: Double, options: Boolean): InternalTexture = js.native
    def createRenderTargetTexture(size: Double, options: RenderTargetCreationOptions): InternalTexture = js.native
    def createRenderTargetTexture(size: Height, options: Boolean): InternalTexture = js.native
    def createRenderTargetTexture(size: Height, options: RenderTargetCreationOptions): InternalTexture = js.native
    
    /**
      * Create an uniform buffer
      * @see http://doc.babylonjs.com/features/webgl2#uniform-buffer-objets
      * @param elements defines the content of the uniform buffer
      * @returns the webGL uniform buffer
      */
    def createUniformBuffer(elements: FloatArray): DataBuffer = js.native
    
    /**
      * Gets the current alpha equation.
      * @returns the current alpha equation
      */
    def getAlphaEquation(): Double = js.native
    
    /**
      * Gets the current alpha mode
      * @see http://doc.babylonjs.com/resources/transparency_and_how_meshes_are_rendered
      * @returns the current alpha mode
      */
    def getAlphaMode(): Double = js.native
    
    /**
      * Sets alpha constants used by some alpha blending modes
      * @param r defines the red component
      * @param g defines the green component
      * @param b defines the blue component
      * @param a defines the alpha component
      */
    def setAlphaConstants(r: Double, g: Double, b: Double, a: Double): Unit = js.native
    
    /**
      * Sets the current alpha equation
      * @param equation defines the equation to use (one of the Engine.ALPHA_EQUATION_XXX)
      */
    def setAlphaEquation(equation: Double): Unit = js.native
    
    /**
      * Sets the current alpha mode
      * @param mode defines the mode to use (one of the Engine.ALPHA_XXX)
      * @param noDepthWriteChange defines if depth writing state should remains unchanged (false by default)
      * @see http://doc.babylonjs.com/resources/transparency_and_how_meshes_are_rendered
      */
    def setAlphaMode(mode: Double): Unit = js.native
    def setAlphaMode(mode: Double, noDepthWriteChange: Boolean): Unit = js.native
    
    /**
      * Unbind a list of render target textures from the webGL context
      * This is used only when drawBuffer extension or webGL2 are active
      * @param textures defines the render target textures to unbind
      * @param disableGenerateMipMaps defines a boolean indicating that mipmaps must not be generated
      * @param onBeforeUnbind defines a function which will be called before the effective unbind
      */
    def unBindMultiColorAttachmentFramebuffer(textures: js.Array[InternalTexture], disableGenerateMipMaps: Boolean): Unit = js.native
    def unBindMultiColorAttachmentFramebuffer(
      textures: js.Array[InternalTexture],
      disableGenerateMipMaps: Boolean,
      onBeforeUnbind: js.Function0[Unit]
    ): Unit = js.native
    
    /**
      * Update the content of a dynamic texture
      * @param texture defines the texture to update
      * @param canvas defines the canvas containing the source
      * @param invertY defines if data must be stored with Y axis inverted
      * @param premulAlpha defines if alpha is stored as premultiplied
      * @param format defines the format of the data
      * @param forceBindTexture if the texture should be forced to be bound eg. after a graphics context loss (Default: false)
      */
    def updateDynamicTexture(texture: Nullable[InternalTexture], canvas: HTMLCanvasElement, invertY: Boolean): Unit = js.native
    def updateDynamicTexture(
      texture: Nullable[InternalTexture],
      canvas: HTMLCanvasElement,
      invertY: Boolean,
      premulAlpha: js.UndefOr[scala.Nothing],
      format: js.UndefOr[scala.Nothing],
      forceBindTexture: Boolean
    ): Unit = js.native
    def updateDynamicTexture(
      texture: Nullable[InternalTexture],
      canvas: HTMLCanvasElement,
      invertY: Boolean,
      premulAlpha: js.UndefOr[scala.Nothing],
      format: Double
    ): Unit = js.native
    def updateDynamicTexture(
      texture: Nullable[InternalTexture],
      canvas: HTMLCanvasElement,
      invertY: Boolean,
      premulAlpha: js.UndefOr[scala.Nothing],
      format: Double,
      forceBindTexture: Boolean
    ): Unit = js.native
    def updateDynamicTexture(
      texture: Nullable[InternalTexture],
      canvas: HTMLCanvasElement,
      invertY: Boolean,
      premulAlpha: Boolean
    ): Unit = js.native
    def updateDynamicTexture(
      texture: Nullable[InternalTexture],
      canvas: HTMLCanvasElement,
      invertY: Boolean,
      premulAlpha: Boolean,
      format: js.UndefOr[scala.Nothing],
      forceBindTexture: Boolean
    ): Unit = js.native
    def updateDynamicTexture(
      texture: Nullable[InternalTexture],
      canvas: HTMLCanvasElement,
      invertY: Boolean,
      premulAlpha: Boolean,
      format: Double
    ): Unit = js.native
    def updateDynamicTexture(
      texture: Nullable[InternalTexture],
      canvas: HTMLCanvasElement,
      invertY: Boolean,
      premulAlpha: Boolean,
      format: Double,
      forceBindTexture: Boolean
    ): Unit = js.native
    def updateDynamicTexture(texture: Nullable[InternalTexture], canvas: OffscreenCanvas, invertY: Boolean): Unit = js.native
    def updateDynamicTexture(
      texture: Nullable[InternalTexture],
      canvas: OffscreenCanvas,
      invertY: Boolean,
      premulAlpha: js.UndefOr[scala.Nothing],
      format: js.UndefOr[scala.Nothing],
      forceBindTexture: Boolean
    ): Unit = js.native
    def updateDynamicTexture(
      texture: Nullable[InternalTexture],
      canvas: OffscreenCanvas,
      invertY: Boolean,
      premulAlpha: js.UndefOr[scala.Nothing],
      format: Double
    ): Unit = js.native
    def updateDynamicTexture(
      texture: Nullable[InternalTexture],
      canvas: OffscreenCanvas,
      invertY: Boolean,
      premulAlpha: js.UndefOr[scala.Nothing],
      format: Double,
      forceBindTexture: Boolean
    ): Unit = js.native
    def updateDynamicTexture(
      texture: Nullable[InternalTexture],
      canvas: OffscreenCanvas,
      invertY: Boolean,
      premulAlpha: Boolean
    ): Unit = js.native
    def updateDynamicTexture(
      texture: Nullable[InternalTexture],
      canvas: OffscreenCanvas,
      invertY: Boolean,
      premulAlpha: Boolean,
      format: js.UndefOr[scala.Nothing],
      forceBindTexture: Boolean
    ): Unit = js.native
    def updateDynamicTexture(
      texture: Nullable[InternalTexture],
      canvas: OffscreenCanvas,
      invertY: Boolean,
      premulAlpha: Boolean,
      format: Double
    ): Unit = js.native
    def updateDynamicTexture(
      texture: Nullable[InternalTexture],
      canvas: OffscreenCanvas,
      invertY: Boolean,
      premulAlpha: Boolean,
      format: Double,
      forceBindTexture: Boolean
    ): Unit = js.native
    
    /**
      * Update the sample count for a given multiple render target texture
      * @see http://doc.babylonjs.com/features/webgl2#multisample-render-targets
      * @param textures defines the textures to update
      * @param samples defines the sample count to set
      * @returns the effective sample count (could be 0 if multisample render targets are not supported)
      */
    def updateMultipleRenderTargetTextureSampleCount(textures: Nullable[js.Array[InternalTexture]], samples: Double): Double = js.native
    
    /**
      * Update an existing uniform buffer
      * @see http://doc.babylonjs.com/features/webgl2#uniform-buffer-objets
      * @param uniformBuffer defines the target uniform buffer
      * @param elements defines the content to update
      * @param offset defines the offset in the uniform buffer where update should start
      * @param count defines the size of the data to update
      */
    def updateUniformBuffer(uniformBuffer: DataBuffer, elements: FloatArray): Unit = js.native
    def updateUniformBuffer(uniformBuffer: DataBuffer, elements: FloatArray, offset: js.UndefOr[scala.Nothing], count: Double): Unit = js.native
    def updateUniformBuffer(uniformBuffer: DataBuffer, elements: FloatArray, offset: Double): Unit = js.native
    def updateUniformBuffer(uniformBuffer: DataBuffer, elements: FloatArray, offset: Double, count: Double): Unit = js.native
    
    /**
      * Update a video texture
      * @param texture defines the texture to update
      * @param video defines the video element to use
      * @param invertY defines if data must be stored with Y axis inverted
      */
    def updateVideoTexture(texture: Nullable[InternalTexture], video: HTMLVideoElement, invertY: Boolean): Unit = js.native
  }
}
