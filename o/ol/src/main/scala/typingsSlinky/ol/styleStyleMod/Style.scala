package typingsSlinky.ol.styleStyleMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Style extends js.Object {
  def getFill(): typingsSlinky.ol.fillMod.default = js.native
  def getGeometry(): String | typingsSlinky.ol.geometryMod.default | GeometryFunction = js.native
  def getGeometryFunction(): GeometryFunction = js.native
  def getImage(): typingsSlinky.ol.styleImageMod.default = js.native
  def getRenderer(): RenderFunction = js.native
  def getStroke(): typingsSlinky.ol.strokeMod.default = js.native
  def getText(): typingsSlinky.ol.textMod.default = js.native
  def getZIndex(): Double = js.native
  def setFill(fill: typingsSlinky.ol.fillMod.default): Unit = js.native
  def setGeometry(geometry: String): Unit = js.native
  def setGeometry(geometry: typingsSlinky.ol.geometryMod.default): Unit = js.native
  def setGeometry(geometry: GeometryFunction): Unit = js.native
  def setImage(image: typingsSlinky.ol.styleImageMod.default): Unit = js.native
  def setRenderer(): Unit = js.native
  def setRenderer(renderer: RenderFunction): Unit = js.native
  def setStroke(stroke: typingsSlinky.ol.strokeMod.default): Unit = js.native
  def setText(text: typingsSlinky.ol.textMod.default): Unit = js.native
  def setZIndex(): Unit = js.native
  def setZIndex(zIndex: Double): Unit = js.native
}

