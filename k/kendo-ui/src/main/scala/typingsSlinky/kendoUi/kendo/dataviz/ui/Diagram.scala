package typingsSlinky.kendoUi.kendo.dataviz.ui

import typingsSlinky.kendoUi.JQuery
import typingsSlinky.kendoUi.JQueryPromise
import typingsSlinky.kendoUi.kendo.data.DataSource
import typingsSlinky.kendoUi.kendo.dataviz.diagram.Connection
import typingsSlinky.kendoUi.kendo.dataviz.diagram.Point
import typingsSlinky.kendoUi.kendo.dataviz.diagram.Rect
import typingsSlinky.kendoUi.kendo.dataviz.diagram.Shape
import typingsSlinky.kendoUi.kendo.drawing.PDFOptions
import typingsSlinky.kendoUi.kendo.ui.Widget
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Diagram extends Widget {
  
  def addConnection(connection: js.Any, undoable: Boolean): Unit = js.native
  
  def addShape(obj: js.Any, undoable: Boolean): Shape = js.native
  
  def alignShapes(direction: String): Unit = js.native
  
  def boundingBox(items: js.Any): Rect = js.native
  
  def bringIntoView(obj: js.Any, options: js.Any): Unit = js.native
  
  def cancelEdit(): Unit = js.native
  
  def clear(): Unit = js.native
  
  def connect(source: js.Any, target: js.Any, options: js.Any): Unit = js.native
  
  def connected(source: js.Any, target: js.Any): Unit = js.native
  
  var connections: js.Array[Connection] = js.native
  
  var connectionsDataSource: DataSource = js.native
  
  def copy(): Unit = js.native
  
  def createConnection(item: js.Any): Unit = js.native
  
  def createShape(item: js.Any): Unit = js.native
  
  def cut(): Unit = js.native
  
  var dataSource: DataSource = js.native
  
  def documentToModel(point: js.Any): js.Any = js.native
  
  def documentToView(point: js.Any): js.Any = js.native
  
  def edit(item: js.Any): Unit = js.native
  
  def exportImage(options: js.Any): JQueryPromise[_] = js.native
  
  def exportPDF(): JQueryPromise[_] = js.native
  def exportPDF(options: PDFOptions): JQueryPromise[_] = js.native
  
  def exportSVG(options: js.Any): JQueryPromise[_] = js.native
  
  def focus(): Unit = js.native
  
  def getConnectionByModelId(id: String): Connection = js.native
  def getConnectionByModelId(id: Double): Connection = js.native
  
  def getConnectionByModelUid(uid: String): Connection = js.native
  
  def getShapeById(id: String): js.Any = js.native
  
  def getShapeByModelId(id: String): Shape = js.native
  def getShapeByModelId(id: Double): Shape = js.native
  
  def getShapeByModelUid(uid: String): Shape = js.native
  
  def layerToModel(point: js.Any): js.Any = js.native
  
  def layout(options: js.Any): Unit = js.native
  
  def load(json: String): Unit = js.native
  
  def modelToDocument(point: js.Any): js.Any = js.native
  
  def modelToLayer(point: js.Any): js.Any = js.native
  
  def modelToView(point: js.Any): js.Any = js.native
  
  @JSName("options")
  var options_Diagram: DiagramOptions = js.native
  
  def pan(pan: js.Any): Unit = js.native
  
  def paste(): Unit = js.native
  
  def redo(): Unit = js.native
  
  def remove(items: js.Any, undoable: Boolean): Unit = js.native
  
  def save(): Unit = js.native
  
  def saveAsPdf(): JQueryPromise[_] = js.native
  
  def saveEdit(): Unit = js.native
  
  def select(): js.Any = js.native
  def select(elements: js.Any, options: js.Any): Unit = js.native
  def select(elements: Connection, options: js.Any): Unit = js.native
  def select(elements: Shape, options: js.Any): Unit = js.native
  
  def selectAll(): Unit = js.native
  
  def selectArea(rect: Rect): Unit = js.native
  
  def setConnectionsDataSource(dataSource: DataSource): Unit = js.native
  
  def setDataSource(dataSource: DataSource): Unit = js.native
  
  var shapes: js.Array[Shape] = js.native
  
  def toBack(items: js.Any, undoable: Boolean): Unit = js.native
  
  def toFront(items: js.Any, undoable: Boolean): Unit = js.native
  
  def transformPoint(p: js.Any): Unit = js.native
  
  def transformRect(r: js.Any): Unit = js.native
  
  def undo(): Unit = js.native
  
  def viewToDocument(point: Point): Point = js.native
  
  def viewToModel(point: Point): Point = js.native
  
  def viewport(): Rect = js.native
  
  var wrapper: JQuery = js.native
  
  def zoom(): Double = js.native
  def zoom(zoom: Double, point: Point): Unit = js.native
}
