package typingsSlinky.pixiJs.mod

import org.scalajs.dom.raw.HTMLCanvasElement
import org.scalajs.dom.raw.HTMLImageElement
import org.scalajs.dom.raw.HTMLVideoElement
import typingsSlinky.pixiJs.PIXI.IPointData
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A texture stores the information that represents an image or part of an image.
  *
  * It cannot be added to the display list directly; instead use it as the texture for a Sprite.
  * If no frame is provided for a texture, then the whole image is used.
  *
  * You can directly create a texture from an image and then reuse it multiple times like this :
  *
  * ```js
  * let texture = PIXI.Texture.from('assets/image.png');
  * let sprite1 = new PIXI.Sprite(texture);
  * let sprite2 = new PIXI.Sprite(texture);
  * ```
  *
  * If you didnt pass the texture frame to constructor, it enables `noFrame` mode:
  * it subscribes on baseTexture events, it automatically resizes at the same time as baseTexture.
  *
  * Textures made from SVGs, loaded or not, cannot be used before the file finishes processing.
  * You can check for this by checking the sprite's _textureID property.
  * ```js
  * var texture = PIXI.Texture.from('assets/image.svg');
  * var sprite1 = new PIXI.Sprite(texture);
  * //sprite1._textureID should not be undefined if the texture has finished processing the SVG file
  * ```
  * You can use a ticker or rAF to ensure your sprites load the finished textures after processing. See issue #3068.
  *
  * @class
  * @extends PIXI.utils.EventEmitter
  * @memberof PIXI
  */
@JSImport("pixi.js", "Texture")
@js.native
class Texture protected ()
  extends typingsSlinky.pixiJs.PIXI.Texture {
  def this(baseTexture: typingsSlinky.pixiJs.PIXI.BaseTexture) = this()
  def this(baseTexture: typingsSlinky.pixiJs.PIXI.BaseTexture, frame: typingsSlinky.pixiJs.PIXI.Rectangle) = this()
  def this(
    baseTexture: typingsSlinky.pixiJs.PIXI.BaseTexture,
    frame: js.UndefOr[scala.Nothing],
    orig: typingsSlinky.pixiJs.PIXI.Rectangle
  ) = this()
  def this(
    baseTexture: typingsSlinky.pixiJs.PIXI.BaseTexture,
    frame: typingsSlinky.pixiJs.PIXI.Rectangle,
    orig: typingsSlinky.pixiJs.PIXI.Rectangle
  ) = this()
  def this(
    baseTexture: typingsSlinky.pixiJs.PIXI.BaseTexture,
    frame: js.UndefOr[scala.Nothing],
    orig: js.UndefOr[scala.Nothing],
    trim: typingsSlinky.pixiJs.PIXI.Rectangle
  ) = this()
  def this(
    baseTexture: typingsSlinky.pixiJs.PIXI.BaseTexture,
    frame: js.UndefOr[scala.Nothing],
    orig: typingsSlinky.pixiJs.PIXI.Rectangle,
    trim: typingsSlinky.pixiJs.PIXI.Rectangle
  ) = this()
  def this(
    baseTexture: typingsSlinky.pixiJs.PIXI.BaseTexture,
    frame: typingsSlinky.pixiJs.PIXI.Rectangle,
    orig: js.UndefOr[scala.Nothing],
    trim: typingsSlinky.pixiJs.PIXI.Rectangle
  ) = this()
  def this(
    baseTexture: typingsSlinky.pixiJs.PIXI.BaseTexture,
    frame: typingsSlinky.pixiJs.PIXI.Rectangle,
    orig: typingsSlinky.pixiJs.PIXI.Rectangle,
    trim: typingsSlinky.pixiJs.PIXI.Rectangle
  ) = this()
  def this(
    baseTexture: typingsSlinky.pixiJs.PIXI.BaseTexture,
    frame: js.UndefOr[scala.Nothing],
    orig: js.UndefOr[scala.Nothing],
    trim: js.UndefOr[scala.Nothing],
    rotate: Double
  ) = this()
  def this(
    baseTexture: typingsSlinky.pixiJs.PIXI.BaseTexture,
    frame: js.UndefOr[scala.Nothing],
    orig: js.UndefOr[scala.Nothing],
    trim: typingsSlinky.pixiJs.PIXI.Rectangle,
    rotate: Double
  ) = this()
  def this(
    baseTexture: typingsSlinky.pixiJs.PIXI.BaseTexture,
    frame: js.UndefOr[scala.Nothing],
    orig: typingsSlinky.pixiJs.PIXI.Rectangle,
    trim: js.UndefOr[scala.Nothing],
    rotate: Double
  ) = this()
  def this(
    baseTexture: typingsSlinky.pixiJs.PIXI.BaseTexture,
    frame: js.UndefOr[scala.Nothing],
    orig: typingsSlinky.pixiJs.PIXI.Rectangle,
    trim: typingsSlinky.pixiJs.PIXI.Rectangle,
    rotate: Double
  ) = this()
  def this(
    baseTexture: typingsSlinky.pixiJs.PIXI.BaseTexture,
    frame: typingsSlinky.pixiJs.PIXI.Rectangle,
    orig: js.UndefOr[scala.Nothing],
    trim: js.UndefOr[scala.Nothing],
    rotate: Double
  ) = this()
  def this(
    baseTexture: typingsSlinky.pixiJs.PIXI.BaseTexture,
    frame: typingsSlinky.pixiJs.PIXI.Rectangle,
    orig: js.UndefOr[scala.Nothing],
    trim: typingsSlinky.pixiJs.PIXI.Rectangle,
    rotate: Double
  ) = this()
  def this(
    baseTexture: typingsSlinky.pixiJs.PIXI.BaseTexture,
    frame: typingsSlinky.pixiJs.PIXI.Rectangle,
    orig: typingsSlinky.pixiJs.PIXI.Rectangle,
    trim: js.UndefOr[scala.Nothing],
    rotate: Double
  ) = this()
  def this(
    baseTexture: typingsSlinky.pixiJs.PIXI.BaseTexture,
    frame: typingsSlinky.pixiJs.PIXI.Rectangle,
    orig: typingsSlinky.pixiJs.PIXI.Rectangle,
    trim: typingsSlinky.pixiJs.PIXI.Rectangle,
    rotate: Double
  ) = this()
  def this(
    baseTexture: typingsSlinky.pixiJs.PIXI.BaseTexture,
    frame: js.UndefOr[scala.Nothing],
    orig: js.UndefOr[scala.Nothing],
    trim: js.UndefOr[scala.Nothing],
    rotate: js.UndefOr[scala.Nothing],
    anchor: IPointData
  ) = this()
  def this(
    baseTexture: typingsSlinky.pixiJs.PIXI.BaseTexture,
    frame: js.UndefOr[scala.Nothing],
    orig: js.UndefOr[scala.Nothing],
    trim: js.UndefOr[scala.Nothing],
    rotate: Double,
    anchor: IPointData
  ) = this()
  def this(
    baseTexture: typingsSlinky.pixiJs.PIXI.BaseTexture,
    frame: js.UndefOr[scala.Nothing],
    orig: js.UndefOr[scala.Nothing],
    trim: typingsSlinky.pixiJs.PIXI.Rectangle,
    rotate: js.UndefOr[scala.Nothing],
    anchor: IPointData
  ) = this()
  def this(
    baseTexture: typingsSlinky.pixiJs.PIXI.BaseTexture,
    frame: js.UndefOr[scala.Nothing],
    orig: js.UndefOr[scala.Nothing],
    trim: typingsSlinky.pixiJs.PIXI.Rectangle,
    rotate: Double,
    anchor: IPointData
  ) = this()
  def this(
    baseTexture: typingsSlinky.pixiJs.PIXI.BaseTexture,
    frame: js.UndefOr[scala.Nothing],
    orig: typingsSlinky.pixiJs.PIXI.Rectangle,
    trim: js.UndefOr[scala.Nothing],
    rotate: js.UndefOr[scala.Nothing],
    anchor: IPointData
  ) = this()
  def this(
    baseTexture: typingsSlinky.pixiJs.PIXI.BaseTexture,
    frame: js.UndefOr[scala.Nothing],
    orig: typingsSlinky.pixiJs.PIXI.Rectangle,
    trim: js.UndefOr[scala.Nothing],
    rotate: Double,
    anchor: IPointData
  ) = this()
  def this(
    baseTexture: typingsSlinky.pixiJs.PIXI.BaseTexture,
    frame: js.UndefOr[scala.Nothing],
    orig: typingsSlinky.pixiJs.PIXI.Rectangle,
    trim: typingsSlinky.pixiJs.PIXI.Rectangle,
    rotate: js.UndefOr[scala.Nothing],
    anchor: IPointData
  ) = this()
  def this(
    baseTexture: typingsSlinky.pixiJs.PIXI.BaseTexture,
    frame: js.UndefOr[scala.Nothing],
    orig: typingsSlinky.pixiJs.PIXI.Rectangle,
    trim: typingsSlinky.pixiJs.PIXI.Rectangle,
    rotate: Double,
    anchor: IPointData
  ) = this()
  def this(
    baseTexture: typingsSlinky.pixiJs.PIXI.BaseTexture,
    frame: typingsSlinky.pixiJs.PIXI.Rectangle,
    orig: js.UndefOr[scala.Nothing],
    trim: js.UndefOr[scala.Nothing],
    rotate: js.UndefOr[scala.Nothing],
    anchor: IPointData
  ) = this()
  def this(
    baseTexture: typingsSlinky.pixiJs.PIXI.BaseTexture,
    frame: typingsSlinky.pixiJs.PIXI.Rectangle,
    orig: js.UndefOr[scala.Nothing],
    trim: js.UndefOr[scala.Nothing],
    rotate: Double,
    anchor: IPointData
  ) = this()
  def this(
    baseTexture: typingsSlinky.pixiJs.PIXI.BaseTexture,
    frame: typingsSlinky.pixiJs.PIXI.Rectangle,
    orig: js.UndefOr[scala.Nothing],
    trim: typingsSlinky.pixiJs.PIXI.Rectangle,
    rotate: js.UndefOr[scala.Nothing],
    anchor: IPointData
  ) = this()
  def this(
    baseTexture: typingsSlinky.pixiJs.PIXI.BaseTexture,
    frame: typingsSlinky.pixiJs.PIXI.Rectangle,
    orig: js.UndefOr[scala.Nothing],
    trim: typingsSlinky.pixiJs.PIXI.Rectangle,
    rotate: Double,
    anchor: IPointData
  ) = this()
  def this(
    baseTexture: typingsSlinky.pixiJs.PIXI.BaseTexture,
    frame: typingsSlinky.pixiJs.PIXI.Rectangle,
    orig: typingsSlinky.pixiJs.PIXI.Rectangle,
    trim: js.UndefOr[scala.Nothing],
    rotate: js.UndefOr[scala.Nothing],
    anchor: IPointData
  ) = this()
  def this(
    baseTexture: typingsSlinky.pixiJs.PIXI.BaseTexture,
    frame: typingsSlinky.pixiJs.PIXI.Rectangle,
    orig: typingsSlinky.pixiJs.PIXI.Rectangle,
    trim: js.UndefOr[scala.Nothing],
    rotate: Double,
    anchor: IPointData
  ) = this()
  def this(
    baseTexture: typingsSlinky.pixiJs.PIXI.BaseTexture,
    frame: typingsSlinky.pixiJs.PIXI.Rectangle,
    orig: typingsSlinky.pixiJs.PIXI.Rectangle,
    trim: typingsSlinky.pixiJs.PIXI.Rectangle,
    rotate: js.UndefOr[scala.Nothing],
    anchor: IPointData
  ) = this()
  def this(
    baseTexture: typingsSlinky.pixiJs.PIXI.BaseTexture,
    frame: typingsSlinky.pixiJs.PIXI.Rectangle,
    orig: typingsSlinky.pixiJs.PIXI.Rectangle,
    trim: typingsSlinky.pixiJs.PIXI.Rectangle,
    rotate: Double,
    anchor: IPointData
  ) = this()
}
object Texture {
  
  @JSImport("pixi.js", "Texture")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * An empty texture, used often to not have to create multiple empty textures.
    * Can not be destroyed.
    *
    * @static
    * @constant
    * @member {PIXI.Texture}
    */
  /* static member */
  @JSImport("pixi.js", "Texture.EMPTY")
  @js.native
  def EMPTY: typingsSlinky.pixiJs.PIXI.Texture = js.native
  @scala.inline
  def EMPTY_=(x: typingsSlinky.pixiJs.PIXI.Texture): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("EMPTY")(x.asInstanceOf[js.Any])
  
  /**
    * A white texture of 16x16 size, used for graphics and other things
    * Can not be destroyed.
    *
    * @static
    * @constant
    * @member {PIXI.Texture}
    */
  /* static member */
  @JSImport("pixi.js", "Texture.WHITE")
  @js.native
  def WHITE: typingsSlinky.pixiJs.PIXI.Texture = js.native
  @scala.inline
  def WHITE_=(x: typingsSlinky.pixiJs.PIXI.Texture): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("WHITE")(x.asInstanceOf[js.Any])
  
  /**
    * Adds a Texture to the global TextureCache. This cache is shared across the whole PIXI object.
    *
    * @static
    * @param {PIXI.Texture} texture - The Texture to add to the cache.
    * @param {string} id - The id that the Texture will be stored against.
    */
  /* static member */
  @JSImport("pixi.js", "Texture.addToCache")
  @js.native
  def addToCache(texture: typingsSlinky.pixiJs.PIXI.Texture, id: String): Unit = js.native
  
  /**
    * Helper function that creates a new Texture based on the source you provide.
    * The source can be - frame id, image url, video url, canvas element, video element, base texture
    *
    * @static
    * @param {string|HTMLImageElement|HTMLCanvasElement|HTMLVideoElement|PIXI.BaseTexture} source
    *        Source to create texture from
    * @param {object} [options] See {@link PIXI.BaseTexture}'s constructor for options.
    * @param {boolean} [strict] - Enforce strict-mode, see {@link PIXI.settings.STRICT_TEXTURE_CACHE}.
    * @return {PIXI.Texture} The newly created texture
    */
  /* static member */
  @JSImport("pixi.js", "Texture.from")
  @js.native
  def from(source: String): typingsSlinky.pixiJs.PIXI.Texture = js.native
  @JSImport("pixi.js", "Texture.from")
  @js.native
  def from(source: String, options: js.UndefOr[scala.Nothing], strict: Boolean): typingsSlinky.pixiJs.PIXI.Texture = js.native
  @JSImport("pixi.js", "Texture.from")
  @js.native
  def from(source: String, options: js.Any): typingsSlinky.pixiJs.PIXI.Texture = js.native
  @JSImport("pixi.js", "Texture.from")
  @js.native
  def from(source: String, options: js.Any, strict: Boolean): typingsSlinky.pixiJs.PIXI.Texture = js.native
  @JSImport("pixi.js", "Texture.from")
  @js.native
  def from(source: HTMLCanvasElement): typingsSlinky.pixiJs.PIXI.Texture = js.native
  @JSImport("pixi.js", "Texture.from")
  @js.native
  def from(source: HTMLCanvasElement, options: js.UndefOr[scala.Nothing], strict: Boolean): typingsSlinky.pixiJs.PIXI.Texture = js.native
  @JSImport("pixi.js", "Texture.from")
  @js.native
  def from(source: HTMLCanvasElement, options: js.Any): typingsSlinky.pixiJs.PIXI.Texture = js.native
  @JSImport("pixi.js", "Texture.from")
  @js.native
  def from(source: HTMLCanvasElement, options: js.Any, strict: Boolean): typingsSlinky.pixiJs.PIXI.Texture = js.native
  @JSImport("pixi.js", "Texture.from")
  @js.native
  def from(source: HTMLImageElement): typingsSlinky.pixiJs.PIXI.Texture = js.native
  @JSImport("pixi.js", "Texture.from")
  @js.native
  def from(source: HTMLImageElement, options: js.UndefOr[scala.Nothing], strict: Boolean): typingsSlinky.pixiJs.PIXI.Texture = js.native
  @JSImport("pixi.js", "Texture.from")
  @js.native
  def from(source: HTMLImageElement, options: js.Any): typingsSlinky.pixiJs.PIXI.Texture = js.native
  @JSImport("pixi.js", "Texture.from")
  @js.native
  def from(source: HTMLImageElement, options: js.Any, strict: Boolean): typingsSlinky.pixiJs.PIXI.Texture = js.native
  @JSImport("pixi.js", "Texture.from")
  @js.native
  def from(source: HTMLVideoElement): typingsSlinky.pixiJs.PIXI.Texture = js.native
  @JSImport("pixi.js", "Texture.from")
  @js.native
  def from(source: HTMLVideoElement, options: js.UndefOr[scala.Nothing], strict: Boolean): typingsSlinky.pixiJs.PIXI.Texture = js.native
  @JSImport("pixi.js", "Texture.from")
  @js.native
  def from(source: HTMLVideoElement, options: js.Any): typingsSlinky.pixiJs.PIXI.Texture = js.native
  @JSImport("pixi.js", "Texture.from")
  @js.native
  def from(source: HTMLVideoElement, options: js.Any, strict: Boolean): typingsSlinky.pixiJs.PIXI.Texture = js.native
  @JSImport("pixi.js", "Texture.from")
  @js.native
  def from(source: typingsSlinky.pixiJs.PIXI.BaseTexture): typingsSlinky.pixiJs.PIXI.Texture = js.native
  @JSImport("pixi.js", "Texture.from")
  @js.native
  def from(source: typingsSlinky.pixiJs.PIXI.BaseTexture, options: js.UndefOr[scala.Nothing], strict: Boolean): typingsSlinky.pixiJs.PIXI.Texture = js.native
  @JSImport("pixi.js", "Texture.from")
  @js.native
  def from(source: typingsSlinky.pixiJs.PIXI.BaseTexture, options: js.Any): typingsSlinky.pixiJs.PIXI.Texture = js.native
  @JSImport("pixi.js", "Texture.from")
  @js.native
  def from(source: typingsSlinky.pixiJs.PIXI.BaseTexture, options: js.Any, strict: Boolean): typingsSlinky.pixiJs.PIXI.Texture = js.native
  
  /**
    * Create a new Texture with a BufferResource from a Float32Array.
    * RGBA values are floats from 0 to 1.
    * @static
    * @param {Float32Array|Uint8Array} buffer - The optional array to use, if no data
    *        is provided, a new Float32Array is created.
    * @param {number} width - Width of the resource
    * @param {number} height - Height of the resource
    * @param {object} [options] See {@link PIXI.BaseTexture}'s constructor for options.
    * @return {PIXI.Texture} The resulting new BaseTexture
    */
  /* static member */
  @JSImport("pixi.js", "Texture.fromBuffer")
  @js.native
  def fromBuffer(buffer: js.typedarray.Float32Array, width: Double, height: Double): typingsSlinky.pixiJs.PIXI.Texture = js.native
  @JSImport("pixi.js", "Texture.fromBuffer")
  @js.native
  def fromBuffer(buffer: js.typedarray.Float32Array, width: Double, height: Double, options: js.Any): typingsSlinky.pixiJs.PIXI.Texture = js.native
  @JSImport("pixi.js", "Texture.fromBuffer")
  @js.native
  def fromBuffer(buffer: js.typedarray.Uint8Array, width: Double, height: Double): typingsSlinky.pixiJs.PIXI.Texture = js.native
  @JSImport("pixi.js", "Texture.fromBuffer")
  @js.native
  def fromBuffer(buffer: js.typedarray.Uint8Array, width: Double, height: Double, options: js.Any): typingsSlinky.pixiJs.PIXI.Texture = js.native
  
  @JSImport("pixi.js", "Texture.fromLoader")
  @js.native
  def fromLoader(source: HTMLCanvasElement, imageUrl: String): typingsSlinky.pixiJs.PIXI.Texture = js.native
  @JSImport("pixi.js", "Texture.fromLoader")
  @js.native
  def fromLoader(source: HTMLCanvasElement, imageUrl: String, name: String): typingsSlinky.pixiJs.PIXI.Texture = js.native
  /**
    * Create a texture from a source and add to the cache.
    *
    * @static
    * @param {HTMLImageElement|HTMLCanvasElement} source - The input source.
    * @param {String} imageUrl - File name of texture, for cache and resolving resolution.
    * @param {String} [name] - Human readable name for the texture cache. If no name is
    *        specified, only `imageUrl` will be used as the cache ID.
    * @return {PIXI.Texture} Output texture
    */
  /* static member */
  @JSImport("pixi.js", "Texture.fromLoader")
  @js.native
  def fromLoader(source: HTMLImageElement, imageUrl: String): typingsSlinky.pixiJs.PIXI.Texture = js.native
  @JSImport("pixi.js", "Texture.fromLoader")
  @js.native
  def fromLoader(source: HTMLImageElement, imageUrl: String, name: String): typingsSlinky.pixiJs.PIXI.Texture = js.native
  
  /**
    * Useful for loading textures via URLs. Use instead of `Texture.from` because
    * it does a better job of handling failed URLs more effectively. This also ignores
    * `PIXI.settings.STRICT_TEXTURE_CACHE`. Works for Videos, SVGs, Images.
    * @param {string} url The remote URL to load.
    * @param {object} [options] Optional options to include
    * @return {Promise<PIXI.Texture>} A Promise that resolves to a Texture.
    */
  /* static member */
  @JSImport("pixi.js", "Texture.fromURL")
  @js.native
  def fromURL(url: String): js.Promise[typingsSlinky.pixiJs.PIXI.Texture] = js.native
  @JSImport("pixi.js", "Texture.fromURL")
  @js.native
  def fromURL(url: String, options: js.Any): js.Promise[typingsSlinky.pixiJs.PIXI.Texture] = js.native
  
  /**
    * Remove a Texture from the global TextureCache.
    *
    * @static
    * @param {string|PIXI.Texture} texture - id of a Texture to be removed, or a Texture instance itself
    * @return {PIXI.Texture|null} The Texture that was removed
    */
  /* static member */
  @JSImport("pixi.js", "Texture.removeFromCache")
  @js.native
  def removeFromCache(texture: String): typingsSlinky.pixiJs.PIXI.Texture | Null = js.native
  @JSImport("pixi.js", "Texture.removeFromCache")
  @js.native
  def removeFromCache(texture: typingsSlinky.pixiJs.PIXI.Texture): typingsSlinky.pixiJs.PIXI.Texture | Null = js.native
}
