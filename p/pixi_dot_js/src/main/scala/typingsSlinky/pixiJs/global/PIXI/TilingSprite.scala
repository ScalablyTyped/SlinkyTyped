package typingsSlinky.pixiJs.global.PIXI

import org.scalajs.dom.raw.HTMLCanvasElement
import org.scalajs.dom.raw.HTMLVideoElement
import typingsSlinky.pixiJs.anon.HeightWidth
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A tiling sprite is a fast way of rendering a tiling image
  *
  * @class
  * @extends PIXI.Sprite
  * @memberof PIXI
  */
@JSGlobal("PIXI.TilingSprite")
@js.native
class TilingSprite protected ()
  extends typingsSlinky.pixiJs.PIXI.TilingSprite {
  def this(texture: typingsSlinky.pixiJs.PIXI.Texture) = this()
  def this(texture: typingsSlinky.pixiJs.PIXI.Texture, width: Double) = this()
  def this(texture: typingsSlinky.pixiJs.PIXI.Texture, width: js.UndefOr[scala.Nothing], height: Double) = this()
  def this(texture: typingsSlinky.pixiJs.PIXI.Texture, width: Double, height: Double) = this()
}
object TilingSprite {
  
  @JSGlobal("PIXI.TilingSprite.from")
  @js.native
  def from(source: String): typingsSlinky.pixiJs.PIXI.Sprite = js.native
  @JSGlobal("PIXI.TilingSprite.from")
  @js.native
  def from(source: String, options: js.Any): typingsSlinky.pixiJs.PIXI.Sprite = js.native
  /**
    * Helper function that creates a new tiling sprite based on the source you provide.
    * The source can be - frame id, image url, video url, canvas element, video element, base texture
    *
    * @static
    * @param {string|PIXI.Texture|HTMLCanvasElement|HTMLVideoElement} source - Source to create texture from
    * @param {Object} options - See {@link PIXI.BaseTexture}'s constructor for options.
    * @param {number} options.width - required width of the tiling sprite
    * @param {number} options.height - required height of the tiling sprite
    * @return {PIXI.TilingSprite} The newly created texture
    */
  /* static member */
  @JSGlobal("PIXI.TilingSprite.from")
  @js.native
  def from(source: String, options: HeightWidth): typingsSlinky.pixiJs.PIXI.TilingSprite = js.native
  @JSGlobal("PIXI.TilingSprite.from")
  @js.native
  def from(source: HTMLCanvasElement): typingsSlinky.pixiJs.PIXI.Sprite = js.native
  @JSGlobal("PIXI.TilingSprite.from")
  @js.native
  def from(source: HTMLCanvasElement, options: js.Any): typingsSlinky.pixiJs.PIXI.Sprite = js.native
  @JSGlobal("PIXI.TilingSprite.from")
  @js.native
  def from(source: HTMLCanvasElement, options: HeightWidth): typingsSlinky.pixiJs.PIXI.TilingSprite = js.native
  @JSGlobal("PIXI.TilingSprite.from")
  @js.native
  def from(source: HTMLVideoElement): typingsSlinky.pixiJs.PIXI.Sprite = js.native
  @JSGlobal("PIXI.TilingSprite.from")
  @js.native
  def from(source: HTMLVideoElement, options: js.Any): typingsSlinky.pixiJs.PIXI.Sprite = js.native
  @JSGlobal("PIXI.TilingSprite.from")
  @js.native
  def from(source: HTMLVideoElement, options: HeightWidth): typingsSlinky.pixiJs.PIXI.TilingSprite = js.native
  /* static member */
  @JSGlobal("PIXI.TilingSprite.from")
  @js.native
  def from(source: Double): typingsSlinky.pixiJs.PIXI.Sprite = js.native
  @JSGlobal("PIXI.TilingSprite.from")
  @js.native
  def from(source: Double, options: js.Any): typingsSlinky.pixiJs.PIXI.Sprite = js.native
  @JSGlobal("PIXI.TilingSprite.from")
  @js.native
  def from(source: typingsSlinky.pixiJs.PIXI.Texture): typingsSlinky.pixiJs.PIXI.Sprite = js.native
  @JSGlobal("PIXI.TilingSprite.from")
  @js.native
  def from(source: typingsSlinky.pixiJs.PIXI.Texture, options: js.Any): typingsSlinky.pixiJs.PIXI.Sprite = js.native
  @JSGlobal("PIXI.TilingSprite.from")
  @js.native
  def from(source: typingsSlinky.pixiJs.PIXI.Texture, options: HeightWidth): typingsSlinky.pixiJs.PIXI.TilingSprite = js.native
  
  /* static member */
  @JSGlobal("PIXI.TilingSprite.fromFrame")
  @js.native
  def fromFrame(): typingsSlinky.pixiJs.PIXI.Sprite = js.native
  
  /* static member */
  @JSGlobal("PIXI.TilingSprite.fromImage")
  @js.native
  def fromImage(): typingsSlinky.pixiJs.PIXI.Sprite = js.native
}
