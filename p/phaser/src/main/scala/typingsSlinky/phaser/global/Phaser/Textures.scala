package typingsSlinky.phaser.global.Phaser

import org.scalajs.dom.raw.HTMLCanvasElement
import org.scalajs.dom.raw.HTMLImageElement
import org.scalajs.dom.raw.HTMLVideoElement
import org.scalajs.dom.raw.WebGLTexture
import typingsSlinky.phaser.Phaser.GameObjects.RenderTexture
import typingsSlinky.phaser.integer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Textures {
  
  /**
    * A Canvas Texture is a special kind of Texture that is backed by an HTML Canvas Element as its source.
    * 
    * You can use the properties of this texture to draw to the canvas element directly, using all of the standard
    * canvas operations available in the browser. Any Game Object can be given this texture and will render with it.
    * 
    * Note: When running under WebGL the Canvas Texture needs to re-generate its base WebGLTexture and reupload it to
    * the GPU every time you modify it, otherwise the changes you make to this texture will not be visible. To do this
    * you should call `CanvasTexture.refresh()` once you are finished with your changes to the canvas. Try and keep
    * this to a minimum, especially on large canvas sizes, or you may inadvertently thrash the GPU by constantly uploading
    * texture data to it. This restriction does not apply if using the Canvas Renderer.
    * 
    * It starts with only one frame that covers the whole of the canvas. You can add further frames, that specify
    * sections of the canvas using the `add` method.
    * 
    * Should you need to resize the canvas use the `setSize` method so that it accurately updates all of the underlying
    * texture data as well. Forgetting to do this (i.e. by changing the canvas size directly from your code) could cause
    * graphical errors.
    */
  @JSGlobal("Phaser.Textures.CanvasTexture")
  @js.native
  class CanvasTexture protected ()
    extends typingsSlinky.phaser.Phaser.Textures.CanvasTexture {
    /**
      * 
      * @param manager A reference to the Texture Manager this Texture belongs to.
      * @param key The unique string-based key of this Texture.
      * @param source The canvas element that is used as the base of this texture.
      * @param width The width of the canvas.
      * @param height The height of the canvas.
      */
    def this(
      manager: typingsSlinky.phaser.Phaser.Textures.TextureManager,
      key: String,
      source: HTMLCanvasElement,
      width: integer,
      height: integer
    ) = this()
  }
  
  object Events {
    
    /**
      * The Texture Add Event.
      * 
      * This event is dispatched by the Texture Manager when a texture is added to it.
      * 
      * Listen to this event from within a Scene using: `this.textures.on('addtexture', listener)`.
      */
    @JSGlobal("Phaser.Textures.Events.ADD")
    @js.native
    val ADD: js.Any = js.native
    
    /**
      * The Texture Load Error Event.
      * 
      * This event is dispatched by the Texture Manager when a texture it requested to load failed.
      * This only happens when base64 encoded textures fail. All other texture types are loaded via the Loader Plugin.
      * 
      * Listen to this event from within a Scene using: `this.textures.on('onerror', listener)`.
      */
    @JSGlobal("Phaser.Textures.Events.ERROR")
    @js.native
    val ERROR: js.Any = js.native
    
    /**
      * The Texture Load Event.
      * 
      * This event is dispatched by the Texture Manager when a texture has finished loading on it.
      * This only happens for base64 encoded textures. All other texture types are loaded via the Loader Plugin.
      * 
      * Listen to this event from within a Scene using: `this.textures.on('onload', listener)`.
      * 
      * This event is dispatched after the [ADD]{@linkcode Phaser.Textures.Events#event:ADD} event.
      */
    @JSGlobal("Phaser.Textures.Events.LOAD")
    @js.native
    val LOAD: js.Any = js.native
    
    /**
      * This internal event signifies that the Texture Manager is now ready and the Game can continue booting.
      * 
      * When a Phaser Game instance is booting for the first time, the Texture Manager has to wait on a couple of non-blocking
      * async events before it's fully ready to carry on. When those complete the Texture Manager emits this event via the Game
      * instance, which tells the Game to carry on booting.
      */
    @JSGlobal("Phaser.Textures.Events.READY")
    @js.native
    val READY: js.Any = js.native
    
    /**
      * The Texture Remove Event.
      * 
      * This event is dispatched by the Texture Manager when a texture is removed from it.
      * 
      * Listen to this event from within a Scene using: `this.textures.on('removetexture', listener)`.
      * 
      * If you have any Game Objects still using the removed texture, they will start throwing
      * errors the next time they try to render. Be sure to clear all use of the texture in this event handler.
      */
    @JSGlobal("Phaser.Textures.Events.REMOVE")
    @js.native
    val REMOVE: js.Any = js.native
  }
  
  /**
    * Filter Types.
    */
  @JSGlobal("Phaser.Textures.FilterMode")
  @js.native
  object FilterMode extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsSlinky.phaser.Phaser.Textures.FilterMode with Double] = js.native
    
    /* 0 */ val LINEAR: typingsSlinky.phaser.Phaser.Textures.FilterMode.LINEAR with Double = js.native
    
    /* 1 */ val NEAREST: typingsSlinky.phaser.Phaser.Textures.FilterMode.NEAREST with Double = js.native
  }
  
  /**
    * A Frame is a section of a Texture.
    */
  @JSGlobal("Phaser.Textures.Frame")
  @js.native
  class Frame protected ()
    extends typingsSlinky.phaser.Phaser.Textures.Frame {
    def this(
      texture: typingsSlinky.phaser.Phaser.Textures.Texture,
      name: String,
      sourceIndex: integer,
      x: Double,
      y: Double,
      width: Double,
      height: Double
    ) = this()
    /**
      * 
      * @param texture The Texture this Frame is a part of.
      * @param name The name of this Frame. The name is unique within the Texture.
      * @param sourceIndex The index of the TextureSource that this Frame is a part of.
      * @param x The x coordinate of the top-left of this Frame.
      * @param y The y coordinate of the top-left of this Frame.
      * @param width The width of this Frame.
      * @param height The height of this Frame.
      */
    def this(
      texture: typingsSlinky.phaser.Phaser.Textures.Texture,
      name: integer,
      sourceIndex: integer,
      x: Double,
      y: Double,
      width: Double,
      height: Double
    ) = this()
  }
  
  /**
    * Linear filter type.
    */
  @JSGlobal("Phaser.Textures.LINEAR")
  @js.native
  val LINEAR: integer = js.native
  
  /**
    * Nearest Neighbor filter type.
    */
  @JSGlobal("Phaser.Textures.NEAREST")
  @js.native
  val NEAREST: integer = js.native
  
  /**
    * A Texture consists of a source, usually an Image from the Cache, and a collection of Frames.
    * The Frames represent the different areas of the Texture. For example a texture atlas
    * may have many Frames, one for each element within the atlas. Where-as a single image would have
    * just one frame, that encompasses the whole image.
    * 
    * Every Texture, no matter where it comes from, always has at least 1 frame called the `__BASE` frame.
    * This frame represents the entirety of the source image.
    * 
    * Textures are managed by the global TextureManager. This is a singleton class that is
    * responsible for creating and delivering Textures and their corresponding Frames to Game Objects.
    * 
    * Sprites and other Game Objects get the texture data they need from the TextureManager.
    */
  @JSGlobal("Phaser.Textures.Texture")
  @js.native
  class Texture protected ()
    extends typingsSlinky.phaser.Phaser.Textures.Texture {
    def this(
      manager: typingsSlinky.phaser.Phaser.Textures.TextureManager,
      key: String,
      source: js.Array[HTMLCanvasElement | HTMLImageElement]
    ) = this()
    def this(
      manager: typingsSlinky.phaser.Phaser.Textures.TextureManager,
      key: String,
      source: HTMLCanvasElement
    ) = this()
    /**
      * 
      * @param manager A reference to the Texture Manager this Texture belongs to.
      * @param key The unique string-based key of this Texture.
      * @param source An array of sources that are used to create the texture. Usually Images, but can also be a Canvas.
      * @param width The width of the Texture. This is optional and automatically derived from the source images.
      * @param height The height of the Texture. This is optional and automatically derived from the source images.
      */
    def this(
      manager: typingsSlinky.phaser.Phaser.Textures.TextureManager,
      key: String,
      source: HTMLImageElement
    ) = this()
    def this(
      manager: typingsSlinky.phaser.Phaser.Textures.TextureManager,
      key: String,
      source: js.Array[HTMLCanvasElement | HTMLImageElement],
      width: Double
    ) = this()
    def this(
      manager: typingsSlinky.phaser.Phaser.Textures.TextureManager,
      key: String,
      source: HTMLCanvasElement,
      width: Double
    ) = this()
    def this(
      manager: typingsSlinky.phaser.Phaser.Textures.TextureManager,
      key: String,
      source: HTMLImageElement,
      width: Double
    ) = this()
    def this(
      manager: typingsSlinky.phaser.Phaser.Textures.TextureManager,
      key: String,
      source: js.Array[HTMLCanvasElement | HTMLImageElement],
      width: js.UndefOr[scala.Nothing],
      height: Double
    ) = this()
    def this(
      manager: typingsSlinky.phaser.Phaser.Textures.TextureManager,
      key: String,
      source: js.Array[HTMLCanvasElement | HTMLImageElement],
      width: Double,
      height: Double
    ) = this()
    def this(
      manager: typingsSlinky.phaser.Phaser.Textures.TextureManager,
      key: String,
      source: HTMLCanvasElement,
      width: js.UndefOr[scala.Nothing],
      height: Double
    ) = this()
    def this(
      manager: typingsSlinky.phaser.Phaser.Textures.TextureManager,
      key: String,
      source: HTMLCanvasElement,
      width: Double,
      height: Double
    ) = this()
    def this(
      manager: typingsSlinky.phaser.Phaser.Textures.TextureManager,
      key: String,
      source: HTMLImageElement,
      width: js.UndefOr[scala.Nothing],
      height: Double
    ) = this()
    def this(
      manager: typingsSlinky.phaser.Phaser.Textures.TextureManager,
      key: String,
      source: HTMLImageElement,
      width: Double,
      height: Double
    ) = this()
  }
  
  /**
    * Textures are managed by the global TextureManager. This is a singleton class that is
    * responsible for creating and delivering Textures and their corresponding Frames to Game Objects.
    * 
    * Sprites and other Game Objects get the texture data they need from the TextureManager.
    * 
    * Access it via `scene.textures`.
    */
  @JSGlobal("Phaser.Textures.TextureManager")
  @js.native
  class TextureManager protected ()
    extends typingsSlinky.phaser.Phaser.Textures.TextureManager {
    /**
      * 
      * @param game The Phaser.Game instance this Texture Manager belongs to.
      */
    def this(game: typingsSlinky.phaser.Phaser.Game) = this()
  }
  
  /**
    * A Texture Source is the encapsulation of the actual source data for a Texture.
    * 
    * This is typically an Image Element, loaded from the file system or network, a Canvas Element or a Video Element.
    * 
    * A Texture can contain multiple Texture Sources, which only happens when a multi-atlas is loaded.
    */
  @JSGlobal("Phaser.Textures.TextureSource")
  @js.native
  class TextureSource protected ()
    extends typingsSlinky.phaser.Phaser.Textures.TextureSource {
    def this(texture: typingsSlinky.phaser.Phaser.Textures.Texture, source: HTMLCanvasElement) = this()
    /**
      * 
      * @param texture The Texture this TextureSource belongs to.
      * @param source The source image data.
      * @param width Optional width of the source image. If not given it's derived from the source itself.
      * @param height Optional height of the source image. If not given it's derived from the source itself.
      * @param flipY Sets the `UNPACK_FLIP_Y_WEBGL` flag the WebGL Texture uses during upload. Default false.
      */
    def this(texture: typingsSlinky.phaser.Phaser.Textures.Texture, source: HTMLImageElement) = this()
    def this(texture: typingsSlinky.phaser.Phaser.Textures.Texture, source: HTMLVideoElement) = this()
    def this(texture: typingsSlinky.phaser.Phaser.Textures.Texture, source: WebGLTexture) = this()
    def this(texture: typingsSlinky.phaser.Phaser.Textures.Texture, source: RenderTexture) = this()
    def this(texture: typingsSlinky.phaser.Phaser.Textures.Texture, source: HTMLCanvasElement, width: integer) = this()
    def this(texture: typingsSlinky.phaser.Phaser.Textures.Texture, source: HTMLImageElement, width: integer) = this()
    def this(texture: typingsSlinky.phaser.Phaser.Textures.Texture, source: HTMLVideoElement, width: integer) = this()
    def this(texture: typingsSlinky.phaser.Phaser.Textures.Texture, source: WebGLTexture, width: integer) = this()
    def this(texture: typingsSlinky.phaser.Phaser.Textures.Texture, source: RenderTexture, width: integer) = this()
    def this(
      texture: typingsSlinky.phaser.Phaser.Textures.Texture,
      source: HTMLCanvasElement,
      width: js.UndefOr[scala.Nothing],
      height: integer
    ) = this()
    def this(
      texture: typingsSlinky.phaser.Phaser.Textures.Texture,
      source: HTMLCanvasElement,
      width: integer,
      height: integer
    ) = this()
    def this(
      texture: typingsSlinky.phaser.Phaser.Textures.Texture,
      source: HTMLImageElement,
      width: js.UndefOr[scala.Nothing],
      height: integer
    ) = this()
    def this(
      texture: typingsSlinky.phaser.Phaser.Textures.Texture,
      source: HTMLImageElement,
      width: integer,
      height: integer
    ) = this()
    def this(
      texture: typingsSlinky.phaser.Phaser.Textures.Texture,
      source: HTMLVideoElement,
      width: js.UndefOr[scala.Nothing],
      height: integer
    ) = this()
    def this(
      texture: typingsSlinky.phaser.Phaser.Textures.Texture,
      source: HTMLVideoElement,
      width: integer,
      height: integer
    ) = this()
    def this(
      texture: typingsSlinky.phaser.Phaser.Textures.Texture,
      source: WebGLTexture,
      width: js.UndefOr[scala.Nothing],
      height: integer
    ) = this()
    def this(
      texture: typingsSlinky.phaser.Phaser.Textures.Texture,
      source: WebGLTexture,
      width: integer,
      height: integer
    ) = this()
    def this(
      texture: typingsSlinky.phaser.Phaser.Textures.Texture,
      source: RenderTexture,
      width: js.UndefOr[scala.Nothing],
      height: integer
    ) = this()
    def this(
      texture: typingsSlinky.phaser.Phaser.Textures.Texture,
      source: RenderTexture,
      width: integer,
      height: integer
    ) = this()
    def this(
      texture: typingsSlinky.phaser.Phaser.Textures.Texture,
      source: HTMLCanvasElement,
      width: js.UndefOr[scala.Nothing],
      height: js.UndefOr[scala.Nothing],
      flipY: Boolean
    ) = this()
    def this(
      texture: typingsSlinky.phaser.Phaser.Textures.Texture,
      source: HTMLCanvasElement,
      width: js.UndefOr[scala.Nothing],
      height: integer,
      flipY: Boolean
    ) = this()
    def this(
      texture: typingsSlinky.phaser.Phaser.Textures.Texture,
      source: HTMLCanvasElement,
      width: integer,
      height: js.UndefOr[scala.Nothing],
      flipY: Boolean
    ) = this()
    def this(
      texture: typingsSlinky.phaser.Phaser.Textures.Texture,
      source: HTMLCanvasElement,
      width: integer,
      height: integer,
      flipY: Boolean
    ) = this()
    def this(
      texture: typingsSlinky.phaser.Phaser.Textures.Texture,
      source: HTMLImageElement,
      width: js.UndefOr[scala.Nothing],
      height: js.UndefOr[scala.Nothing],
      flipY: Boolean
    ) = this()
    def this(
      texture: typingsSlinky.phaser.Phaser.Textures.Texture,
      source: HTMLImageElement,
      width: js.UndefOr[scala.Nothing],
      height: integer,
      flipY: Boolean
    ) = this()
    def this(
      texture: typingsSlinky.phaser.Phaser.Textures.Texture,
      source: HTMLImageElement,
      width: integer,
      height: js.UndefOr[scala.Nothing],
      flipY: Boolean
    ) = this()
    def this(
      texture: typingsSlinky.phaser.Phaser.Textures.Texture,
      source: HTMLImageElement,
      width: integer,
      height: integer,
      flipY: Boolean
    ) = this()
    def this(
      texture: typingsSlinky.phaser.Phaser.Textures.Texture,
      source: HTMLVideoElement,
      width: js.UndefOr[scala.Nothing],
      height: js.UndefOr[scala.Nothing],
      flipY: Boolean
    ) = this()
    def this(
      texture: typingsSlinky.phaser.Phaser.Textures.Texture,
      source: HTMLVideoElement,
      width: js.UndefOr[scala.Nothing],
      height: integer,
      flipY: Boolean
    ) = this()
    def this(
      texture: typingsSlinky.phaser.Phaser.Textures.Texture,
      source: HTMLVideoElement,
      width: integer,
      height: js.UndefOr[scala.Nothing],
      flipY: Boolean
    ) = this()
    def this(
      texture: typingsSlinky.phaser.Phaser.Textures.Texture,
      source: HTMLVideoElement,
      width: integer,
      height: integer,
      flipY: Boolean
    ) = this()
    def this(
      texture: typingsSlinky.phaser.Phaser.Textures.Texture,
      source: WebGLTexture,
      width: js.UndefOr[scala.Nothing],
      height: js.UndefOr[scala.Nothing],
      flipY: Boolean
    ) = this()
    def this(
      texture: typingsSlinky.phaser.Phaser.Textures.Texture,
      source: WebGLTexture,
      width: js.UndefOr[scala.Nothing],
      height: integer,
      flipY: Boolean
    ) = this()
    def this(
      texture: typingsSlinky.phaser.Phaser.Textures.Texture,
      source: WebGLTexture,
      width: integer,
      height: js.UndefOr[scala.Nothing],
      flipY: Boolean
    ) = this()
    def this(
      texture: typingsSlinky.phaser.Phaser.Textures.Texture,
      source: WebGLTexture,
      width: integer,
      height: integer,
      flipY: Boolean
    ) = this()
    def this(
      texture: typingsSlinky.phaser.Phaser.Textures.Texture,
      source: RenderTexture,
      width: js.UndefOr[scala.Nothing],
      height: js.UndefOr[scala.Nothing],
      flipY: Boolean
    ) = this()
    def this(
      texture: typingsSlinky.phaser.Phaser.Textures.Texture,
      source: RenderTexture,
      width: js.UndefOr[scala.Nothing],
      height: integer,
      flipY: Boolean
    ) = this()
    def this(
      texture: typingsSlinky.phaser.Phaser.Textures.Texture,
      source: RenderTexture,
      width: integer,
      height: js.UndefOr[scala.Nothing],
      flipY: Boolean
    ) = this()
    def this(
      texture: typingsSlinky.phaser.Phaser.Textures.Texture,
      source: RenderTexture,
      width: integer,
      height: integer,
      flipY: Boolean
    ) = this()
  }
}
