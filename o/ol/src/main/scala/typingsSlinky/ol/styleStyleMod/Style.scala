package typingsSlinky.ol.styleStyleMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Style extends js.Object {
  
  /**
    * Get the fill style.
    */
  def getFill(): typingsSlinky.ol.fillMod.default = js.native
  
  /**
    * Get the geometry to be rendered.
    */
  def getGeometry(): String | typingsSlinky.ol.geometryMod.default | GeometryFunction = js.native
  
  /**
    * Get the function used to generate a geometry for rendering.
    */
  def getGeometryFunction(): GeometryFunction = js.native
  
  /**
    * Get the image style.
    */
  def getImage(): typingsSlinky.ol.styleImageMod.default = js.native
  
  /**
    * Get the custom renderer function that was configured with
    * {@link #setRenderer} or the renderer constructor option.
    */
  def getRenderer(): RenderFunction | Null = js.native
  
  /**
    * Get the stroke style.
    */
  def getStroke(): typingsSlinky.ol.strokeMod.default = js.native
  
  /**
    * Get the text style.
    */
  def getText(): typingsSlinky.ol.textMod.default = js.native
  
  /**
    * Get the z-index for the style.
    */
  def getZIndex(): js.UndefOr[Double] = js.native
  
  /**
    * Set the fill style.
    */
  def setFill(fill: typingsSlinky.ol.fillMod.default): Unit = js.native
  
  /**
    * Set a geometry that is rendered instead of the feature's geometry.
    */
  def setGeometry(geometry: String): Unit = js.native
  def setGeometry(geometry: typingsSlinky.ol.geometryMod.default): Unit = js.native
  def setGeometry(geometry: GeometryFunction): Unit = js.native
  
  /**
    * Set the image style.
    */
  def setImage(image: typingsSlinky.ol.styleImageMod.default): Unit = js.native
  
  /**
    * Sets a custom renderer function for this style. When set, fill, stroke
    * and image options of the style will be ignored.
    */
  def setRenderer(): Unit = js.native
  def setRenderer(renderer: RenderFunction): Unit = js.native
  
  /**
    * Set the stroke style.
    */
  def setStroke(stroke: typingsSlinky.ol.strokeMod.default): Unit = js.native
  
  /**
    * Set the text style.
    */
  def setText(text: typingsSlinky.ol.textMod.default): Unit = js.native
  
  /**
    * Set the z-index.
    */
  def setZIndex(): Unit = js.native
  def setZIndex(zIndex: Double): Unit = js.native
}
