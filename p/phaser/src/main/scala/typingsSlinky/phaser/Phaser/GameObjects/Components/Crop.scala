package typingsSlinky.phaser.Phaser.GameObjects.Components

import typingsSlinky.phaser.Phaser.Geom.Rectangle
import typingsSlinky.phaser.Phaser.Textures.CanvasTexture
import typingsSlinky.phaser.Phaser.Textures.Frame
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Provides methods used for getting and setting the texture of a Game Object.
  */
@js.native
trait Crop extends js.Object {
  
  /**
    * The Texture Frame this Game Object is using to render with.
    */
  var frame: Frame = js.native
  
  /**
    * A boolean flag indicating if this Game Object is being cropped or not.
    * You can toggle this at any time after `setCrop` has been called, to turn cropping on or off.
    * Equally, calling `setCrop` with no arguments will reset the crop and disable it.
    */
  var isCropped: Boolean = js.native
  
  /**
    * Applies a crop to a texture based Game Object, such as a Sprite or Image.
    * 
    * The crop is a rectangle that limits the area of the texture frame that is visible during rendering.
    * 
    * Cropping a Game Object does not change its size, dimensions, physics body or hit area, it just
    * changes what is shown when rendered.
    * 
    * The crop coordinates are relative to the texture frame, not the Game Object, meaning 0 x 0 is the top-left.
    * 
    * Therefore, if you had a Game Object that had an 800x600 sized texture, and you wanted to show only the left
    * half of it, you could call `setCrop(0, 0, 400, 600)`.
    * 
    * It is also scaled to match the Game Object scale automatically. Therefore a crop rect of 100x50 would crop
    * an area of 200x100 when applied to a Game Object that had a scale factor of 2.
    * 
    * You can either pass in numeric values directly, or you can provide a single Rectangle object as the first argument.
    * 
    * Call this method with no arguments at all to reset the crop, or toggle the property `isCropped` to `false`.
    * 
    * You should do this if the crop rectangle becomes the same size as the frame itself, as it will allow
    * the renderer to skip several internal calculations.
    * @param x The x coordinate to start the crop from. Or a Phaser.Geom.Rectangle object, in which case the rest of the arguments are ignored.
    * @param y The y coordinate to start the crop from.
    * @param width The width of the crop rectangle in pixels.
    * @param height The height of the crop rectangle in pixels.
    */
  def setCrop(): this.type = js.native
  def setCrop(
    x: js.UndefOr[scala.Nothing],
    y: js.UndefOr[scala.Nothing],
    width: js.UndefOr[scala.Nothing],
    height: Double
  ): this.type = js.native
  def setCrop(x: js.UndefOr[scala.Nothing], y: js.UndefOr[scala.Nothing], width: Double): this.type = js.native
  def setCrop(x: js.UndefOr[scala.Nothing], y: js.UndefOr[scala.Nothing], width: Double, height: Double): this.type = js.native
  def setCrop(x: js.UndefOr[scala.Nothing], y: Double): this.type = js.native
  def setCrop(x: js.UndefOr[scala.Nothing], y: Double, width: js.UndefOr[scala.Nothing], height: Double): this.type = js.native
  def setCrop(x: js.UndefOr[scala.Nothing], y: Double, width: Double): this.type = js.native
  def setCrop(x: js.UndefOr[scala.Nothing], y: Double, width: Double, height: Double): this.type = js.native
  def setCrop(x: Double): this.type = js.native
  def setCrop(x: Double, y: js.UndefOr[scala.Nothing], width: js.UndefOr[scala.Nothing], height: Double): this.type = js.native
  def setCrop(x: Double, y: js.UndefOr[scala.Nothing], width: Double): this.type = js.native
  def setCrop(x: Double, y: js.UndefOr[scala.Nothing], width: Double, height: Double): this.type = js.native
  def setCrop(x: Double, y: Double): this.type = js.native
  def setCrop(x: Double, y: Double, width: js.UndefOr[scala.Nothing], height: Double): this.type = js.native
  def setCrop(x: Double, y: Double, width: Double): this.type = js.native
  def setCrop(x: Double, y: Double, width: Double, height: Double): this.type = js.native
  def setCrop(x: Rectangle): this.type = js.native
  def setCrop(x: Rectangle, y: js.UndefOr[scala.Nothing], width: js.UndefOr[scala.Nothing], height: Double): this.type = js.native
  def setCrop(x: Rectangle, y: js.UndefOr[scala.Nothing], width: Double): this.type = js.native
  def setCrop(x: Rectangle, y: js.UndefOr[scala.Nothing], width: Double, height: Double): this.type = js.native
  def setCrop(x: Rectangle, y: Double): this.type = js.native
  def setCrop(x: Rectangle, y: Double, width: js.UndefOr[scala.Nothing], height: Double): this.type = js.native
  def setCrop(x: Rectangle, y: Double, width: Double): this.type = js.native
  def setCrop(x: Rectangle, y: Double, width: Double, height: Double): this.type = js.native
  
  /**
    * The Texture this Game Object is using to render with.
    */
  var texture: typingsSlinky.phaser.Phaser.Textures.Texture | CanvasTexture = js.native
}
