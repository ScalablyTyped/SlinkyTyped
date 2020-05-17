package typingsSlinky.jointjs.mod.dia

import typingsSlinky.jointjs.mod.connectors.Connector
import typingsSlinky.jointjs.mod.connectors.ConnectorArguments
import typingsSlinky.jointjs.mod.connectors.ConnectorJSON
import typingsSlinky.jointjs.mod.connectors.ConnectorType
import typingsSlinky.jointjs.mod.dia.Cell.EmbeddableOptions
import typingsSlinky.jointjs.mod.dia.Graph.Options
import typingsSlinky.jointjs.mod.dia.Link.Attributes
import typingsSlinky.jointjs.mod.dia.Link.EndCellArgs
import typingsSlinky.jointjs.mod.dia.Link.EndJSON
import typingsSlinky.jointjs.mod.dia.Link.Label
import typingsSlinky.jointjs.mod.dia.Link.Vertex
import typingsSlinky.jointjs.mod.g.Polyline
import typingsSlinky.jointjs.mod.routers.Router
import typingsSlinky.jointjs.mod.routers.RouterArguments
import typingsSlinky.jointjs.mod.routers.RouterJSON
import typingsSlinky.jointjs.mod.routers.RouterType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("jointjs", "dia.Link")
@js.native
 // default label props
class Link_ () extends Cell {
  def this(attributes: Attributes) = this()
  def this(attributes: Attributes, opt: Options) = this()
  var arrowHeadMarkup: String = js.native
  var doubleToolMarkup: js.UndefOr[String] = js.native
  var labelMarkup: js.UndefOr[String | MarkupJSON] = js.native
   // default label markup
  var labelProps: js.UndefOr[Label] = js.native
  var markup: String = js.native
  var toolMarkup: String = js.native
  var vertexMarkup: String = js.native
  def appendLabel(label: Label): js.Array[Label] = js.native
  def appendLabel(label: Label, opt: typingsSlinky.jointjs.mod.dia.Cell.Options): js.Array[Label] = js.native
  def applyToPoints(fn: js.Function1[/* p */ Point, Point]): this.type = js.native
  def applyToPoints(fn: js.Function1[/* p */ Point, Point], opt: typingsSlinky.jointjs.mod.dia.Cell.Options): this.type = js.native
  def connector(): Connector | ConnectorJSON | Null = js.native
  def connector(connector: Connector): this.type = js.native
  def connector(connector: ConnectorJSON): this.type = js.native
  def connector(connector: ConnectorJSON, opt: typingsSlinky.jointjs.mod.dia.Cell.Options): this.type = js.native
  def connector(connector: Connector, opt: typingsSlinky.jointjs.mod.dia.Cell.Options): this.type = js.native
  def connector(name: ConnectorType): this.type = js.native
  def connector(name: ConnectorType, args: ConnectorArguments): this.type = js.native
  def connector(name: ConnectorType, args: ConnectorArguments, opt: typingsSlinky.jointjs.mod.dia.Cell.Options): this.type = js.native
  def disconnect(): this.type = js.native
  def getPolyline(): Polyline = js.native
  def getRelationshipAncestor(): js.UndefOr[Element] = js.native
  def getSourceCell(): Null | Cell = js.native
  def getSourceElement(): Null | Element = js.native
  def getSourcePoint(): typingsSlinky.jointjs.mod.g.Point = js.native
  def getTargetCell(): Null | Cell = js.native
  def getTargetElement(): Null | Element = js.native
  def getTargetPoint(): typingsSlinky.jointjs.mod.g.Point = js.native
  def hasLoop(): Boolean = js.native
  def hasLoop(opt: EmbeddableOptions): Boolean = js.native
  def insertLabel(index: Double, label: Label): js.Array[Label] = js.native
  def insertLabel(index: Double, label: Label, opt: typingsSlinky.jointjs.mod.dia.Cell.Options): js.Array[Label] = js.native
  def insertVertex(index: Double, vertex: Vertex): js.Array[Vertex] = js.native
  def insertVertex(index: Double, vertex: Vertex, opt: typingsSlinky.jointjs.mod.dia.Cell.Options): js.Array[Vertex] = js.native
  def isRelationshipEmbeddedIn(cell: Cell): Boolean = js.native
  def label(): Label = js.native
  def label(index: Double): Label = js.native
  def label(index: Double, label: Label): this.type = js.native
  def label(index: Double, label: Label, opt: typingsSlinky.jointjs.mod.dia.Cell.Options): this.type = js.native
  def labels(): js.Array[Label] = js.native
  def labels(labels: js.Array[Label]): this.type = js.native
  def removeLabel(): js.Array[Label] = js.native
  def removeLabel(index: Double): js.Array[Label] = js.native
  def removeLabel(index: Double, opt: typingsSlinky.jointjs.mod.dia.Cell.Options): js.Array[Label] = js.native
  def removeVertex(): js.Array[Vertex] = js.native
  def removeVertex(index: Double): js.Array[Vertex] = js.native
  def removeVertex(index: Double, opt: typingsSlinky.jointjs.mod.dia.Cell.Options): js.Array[Vertex] = js.native
  def reparent(): Element = js.native
  def reparent(opt: typingsSlinky.jointjs.mod.dia.Cell.Options): Element = js.native
  def router(): Router | RouterJSON | Null = js.native
  def router(name: RouterType): this.type = js.native
  def router(name: RouterType, args: RouterArguments): this.type = js.native
  def router(name: RouterType, args: RouterArguments, opt: typingsSlinky.jointjs.mod.dia.Cell.Options): this.type = js.native
  def router(router: Router): this.type = js.native
  def router(router: RouterJSON): this.type = js.native
  def router(router: RouterJSON, opt: typingsSlinky.jointjs.mod.dia.Cell.Options): this.type = js.native
  def router(router: Router, opt: typingsSlinky.jointjs.mod.dia.Cell.Options): this.type = js.native
  def scale(sx: Double, sy: Double): this.type = js.native
  def scale(sx: Double, sy: Double, origin: Point): this.type = js.native
  def scale(sx: Double, sy: Double, origin: Point, opt: typingsSlinky.jointjs.mod.dia.Cell.Options): this.type = js.native
  def source(): EndJSON = js.native
  def source(source: Cell): this.type = js.native
  def source(source: Cell, args: EndCellArgs): this.type = js.native
  def source(source: Cell, args: EndCellArgs, opt: typingsSlinky.jointjs.mod.dia.Cell.Options): this.type = js.native
  def source(source: EndJSON): this.type = js.native
  def source(source: EndJSON, opt: typingsSlinky.jointjs.mod.dia.Cell.Options): this.type = js.native
  def target(): EndJSON = js.native
  def target(target: Cell): this.type = js.native
  def target(target: Cell, args: EndCellArgs): this.type = js.native
  def target(target: Cell, args: EndCellArgs, opt: typingsSlinky.jointjs.mod.dia.Cell.Options): this.type = js.native
  def target(target: EndJSON): this.type = js.native
  def target(target: EndJSON, opt: typingsSlinky.jointjs.mod.dia.Cell.Options): this.type = js.native
  def translate(tx: Double, ty: Double): this.type = js.native
  def translate(tx: Double, ty: Double, opt: typingsSlinky.jointjs.mod.dia.Cell.Options): this.type = js.native
  def vertex(): Vertex = js.native
  def vertex(index: Double): Vertex = js.native
  def vertex(index: Double, vertex: Vertex): this.type = js.native
  def vertex(index: Double, vertex: Vertex, opt: typingsSlinky.jointjs.mod.dia.Cell.Options): this.type = js.native
  def vertices(): js.Array[Vertex] = js.native
  def vertices(vertices: js.Array[Vertex]): this.type = js.native
}

