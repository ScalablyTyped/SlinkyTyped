package typingsSlinky.ol.styleStyleMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Style extends js.Object {
  def getFill(): typingsSlinky.ol.styleFillMod.default = js.native
  def getGeometry(): String | typingsSlinky.ol.geomGeometryMod.default | GeometryFunction = js.native
  def getGeometryFunction(): GeometryFunction = js.native
  def getImage(): typingsSlinky.ol.styleImageMod.default = js.native
  def getRenderer(): RenderFunction | Null = js.native
  def getStroke(): typingsSlinky.ol.styleStrokeMod.default = js.native
  def getText(): typingsSlinky.ol.styleTextMod.default = js.native
  def getZIndex(): js.UndefOr[Double] = js.native
  def setFill(fill: typingsSlinky.ol.styleFillMod.default): Unit = js.native
  def setGeometry(geometry: String): Unit = js.native
  def setGeometry(geometry: typingsSlinky.ol.geomGeometryMod.default): Unit = js.native
  def setGeometry(geometry: GeometryFunction): Unit = js.native
  def setImage(image: typingsSlinky.ol.styleImageMod.default): Unit = js.native
  def setRenderer(): Unit = js.native
  def setRenderer(renderer: RenderFunction): Unit = js.native
  def setStroke(stroke: typingsSlinky.ol.styleStrokeMod.default): Unit = js.native
  def setText(text: typingsSlinky.ol.styleTextMod.default): Unit = js.native
  def setZIndex(): Unit = js.native
  def setZIndex(zIndex: Double): Unit = js.native
}

