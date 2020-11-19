package typingsSlinky.babylonjs.BABYLON

import typingsSlinky.babylonjs.CanvasRenderingContext2D
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DynamicTexture extends Texture {
  
  var _canvas: js.Any = js.native
  
  var _context: js.Any = js.native
  
  var _engine: js.Any = js.native
  
  var _generateMipMaps: js.Any = js.native
  
  var _recreate: js.Any = js.native
  
  /**
    * Clears the texture
    */
  def clear(): Unit = js.native
  
  def drawText(
    text: String,
    x: js.UndefOr[scala.Nothing],
    y: js.UndefOr[scala.Nothing],
    font: String,
    color: String,
    clearColor: String
  ): Unit = js.native
  def drawText(
    text: String,
    x: js.UndefOr[scala.Nothing],
    y: js.UndefOr[scala.Nothing],
    font: String,
    color: String,
    clearColor: String,
    invertY: js.UndefOr[scala.Nothing],
    update: Boolean
  ): Unit = js.native
  def drawText(
    text: String,
    x: js.UndefOr[scala.Nothing],
    y: js.UndefOr[scala.Nothing],
    font: String,
    color: String,
    clearColor: String,
    invertY: Boolean
  ): Unit = js.native
  def drawText(
    text: String,
    x: js.UndefOr[scala.Nothing],
    y: js.UndefOr[scala.Nothing],
    font: String,
    color: String,
    clearColor: String,
    invertY: Boolean,
    update: Boolean
  ): Unit = js.native
  def drawText(
    text: String,
    x: js.UndefOr[scala.Nothing],
    y: Double,
    font: String,
    color: String,
    clearColor: String
  ): Unit = js.native
  def drawText(
    text: String,
    x: js.UndefOr[scala.Nothing],
    y: Double,
    font: String,
    color: String,
    clearColor: String,
    invertY: js.UndefOr[scala.Nothing],
    update: Boolean
  ): Unit = js.native
  def drawText(
    text: String,
    x: js.UndefOr[scala.Nothing],
    y: Double,
    font: String,
    color: String,
    clearColor: String,
    invertY: Boolean
  ): Unit = js.native
  def drawText(
    text: String,
    x: js.UndefOr[scala.Nothing],
    y: Double,
    font: String,
    color: String,
    clearColor: String,
    invertY: Boolean,
    update: Boolean
  ): Unit = js.native
  def drawText(
    text: String,
    x: js.UndefOr[scala.Nothing],
    y: Null,
    font: String,
    color: String,
    clearColor: String
  ): Unit = js.native
  def drawText(
    text: String,
    x: js.UndefOr[scala.Nothing],
    y: Null,
    font: String,
    color: String,
    clearColor: String,
    invertY: js.UndefOr[scala.Nothing],
    update: Boolean
  ): Unit = js.native
  def drawText(
    text: String,
    x: js.UndefOr[scala.Nothing],
    y: Null,
    font: String,
    color: String,
    clearColor: String,
    invertY: Boolean
  ): Unit = js.native
  def drawText(
    text: String,
    x: js.UndefOr[scala.Nothing],
    y: Null,
    font: String,
    color: String,
    clearColor: String,
    invertY: Boolean,
    update: Boolean
  ): Unit = js.native
  def drawText(
    text: String,
    x: Double,
    y: js.UndefOr[scala.Nothing],
    font: String,
    color: String,
    clearColor: String
  ): Unit = js.native
  def drawText(
    text: String,
    x: Double,
    y: js.UndefOr[scala.Nothing],
    font: String,
    color: String,
    clearColor: String,
    invertY: js.UndefOr[scala.Nothing],
    update: Boolean
  ): Unit = js.native
  def drawText(
    text: String,
    x: Double,
    y: js.UndefOr[scala.Nothing],
    font: String,
    color: String,
    clearColor: String,
    invertY: Boolean
  ): Unit = js.native
  def drawText(
    text: String,
    x: Double,
    y: js.UndefOr[scala.Nothing],
    font: String,
    color: String,
    clearColor: String,
    invertY: Boolean,
    update: Boolean
  ): Unit = js.native
  /**
    * Draws text onto the texture
    * @param text defines the text to be drawn
    * @param x defines the placement of the text from the left
    * @param y defines the placement of the text from the top when invertY is true and from the bottom when false
    * @param font defines the font to be used with font-style, font-size, font-name
    * @param color defines the color used for the text
    * @param clearColor defines the color for the canvas, use null to not overwrite canvas
    * @param invertY defines the direction for the Y axis (default is true - y increases downwards)
    * @param update defines whether texture is immediately update (default is true)
    */
  def drawText(text: String, x: Double, y: Double, font: String, color: String, clearColor: String): Unit = js.native
  def drawText(
    text: String,
    x: Double,
    y: Double,
    font: String,
    color: String,
    clearColor: String,
    invertY: js.UndefOr[scala.Nothing],
    update: Boolean
  ): Unit = js.native
  def drawText(
    text: String,
    x: Double,
    y: Double,
    font: String,
    color: String,
    clearColor: String,
    invertY: Boolean
  ): Unit = js.native
  def drawText(
    text: String,
    x: Double,
    y: Double,
    font: String,
    color: String,
    clearColor: String,
    invertY: Boolean,
    update: Boolean
  ): Unit = js.native
  def drawText(text: String, x: Double, y: Null, font: String, color: String, clearColor: String): Unit = js.native
  def drawText(
    text: String,
    x: Double,
    y: Null,
    font: String,
    color: String,
    clearColor: String,
    invertY: js.UndefOr[scala.Nothing],
    update: Boolean
  ): Unit = js.native
  def drawText(
    text: String,
    x: Double,
    y: Null,
    font: String,
    color: String,
    clearColor: String,
    invertY: Boolean
  ): Unit = js.native
  def drawText(
    text: String,
    x: Double,
    y: Null,
    font: String,
    color: String,
    clearColor: String,
    invertY: Boolean,
    update: Boolean
  ): Unit = js.native
  def drawText(
    text: String,
    x: Null,
    y: js.UndefOr[scala.Nothing],
    font: String,
    color: String,
    clearColor: String
  ): Unit = js.native
  def drawText(
    text: String,
    x: Null,
    y: js.UndefOr[scala.Nothing],
    font: String,
    color: String,
    clearColor: String,
    invertY: js.UndefOr[scala.Nothing],
    update: Boolean
  ): Unit = js.native
  def drawText(
    text: String,
    x: Null,
    y: js.UndefOr[scala.Nothing],
    font: String,
    color: String,
    clearColor: String,
    invertY: Boolean
  ): Unit = js.native
  def drawText(
    text: String,
    x: Null,
    y: js.UndefOr[scala.Nothing],
    font: String,
    color: String,
    clearColor: String,
    invertY: Boolean,
    update: Boolean
  ): Unit = js.native
  def drawText(text: String, x: Null, y: Double, font: String, color: String, clearColor: String): Unit = js.native
  def drawText(
    text: String,
    x: Null,
    y: Double,
    font: String,
    color: String,
    clearColor: String,
    invertY: js.UndefOr[scala.Nothing],
    update: Boolean
  ): Unit = js.native
  def drawText(
    text: String,
    x: Null,
    y: Double,
    font: String,
    color: String,
    clearColor: String,
    invertY: Boolean
  ): Unit = js.native
  def drawText(
    text: String,
    x: Null,
    y: Double,
    font: String,
    color: String,
    clearColor: String,
    invertY: Boolean,
    update: Boolean
  ): Unit = js.native
  def drawText(text: String, x: Null, y: Null, font: String, color: String, clearColor: String): Unit = js.native
  def drawText(
    text: String,
    x: Null,
    y: Null,
    font: String,
    color: String,
    clearColor: String,
    invertY: js.UndefOr[scala.Nothing],
    update: Boolean
  ): Unit = js.native
  def drawText(text: String, x: Null, y: Null, font: String, color: String, clearColor: String, invertY: Boolean): Unit = js.native
  def drawText(
    text: String,
    x: Null,
    y: Null,
    font: String,
    color: String,
    clearColor: String,
    invertY: Boolean,
    update: Boolean
  ): Unit = js.native
  
  /**
    * Gets the context of the canvas used by the texture
    * @returns the canvas context of the dynamic texture
    */
  def getContext(): CanvasRenderingContext2D = js.native
  
  /**
    * Resizes the texture
    * @param width the new width
    * @param height the new height
    */
  def scaleTo(width: Double, height: Double): Unit = js.native
  
  /**
    * Updates the texture
    * @param invertY defines the direction for the Y axis (default is true - y increases downwards)
    * @param premulAlpha defines if alpha is stored as premultiplied (default is false)
    */
  def update(): Unit = js.native
  def update(invertY: js.UndefOr[scala.Nothing], premulAlpha: Boolean): Unit = js.native
  def update(invertY: Boolean): Unit = js.native
  def update(invertY: Boolean, premulAlpha: Boolean): Unit = js.native
}
