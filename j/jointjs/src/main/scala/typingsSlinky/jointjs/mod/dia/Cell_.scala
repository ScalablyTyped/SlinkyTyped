package typingsSlinky.jointjs.mod.dia

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.backbone.mod.Model
import typingsSlinky.jointjs.anon.BreadthFirst
import typingsSlinky.jointjs.mod.dia.Cell.Attributes
import typingsSlinky.jointjs.mod.dia.Cell.DisconnectableOptions
import typingsSlinky.jointjs.mod.dia.Cell.EmbeddableOptions
import typingsSlinky.jointjs.mod.dia.Cell.Selectors
import typingsSlinky.jointjs.mod.dia.Cell.TransitionOptions
import typingsSlinky.jointjs.mod.dia.Graph.Options
import typingsSlinky.jointjs.mod.g.Rect
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("jointjs", "dia.Cell")
@js.native
class Cell_ () extends Model {
  def this(attributes: Attributes) = this()
  def this(attributes: Attributes, opt: Options) = this()
  var graph: Graph = js.native
  @JSName("id")
  var id_Cell_ : String | Double = js.native
  def addTo(graph: Graph): this.type = js.native
  def addTo(graph: Graph, opt: Options): this.type = js.native
  def angle(): Double = js.native
  def attr(): js.Any = js.native
  def attr(key: String): js.Any = js.native
  def attr(key: String, value: js.Any): this.type = js.native
  def attr(key: String, value: js.Any, opt: typingsSlinky.jointjs.mod.dia.Cell.Options): this.type = js.native
  def attr(`object`: Selectors): this.type = js.native
  def attr(`object`: Selectors, opt: typingsSlinky.jointjs.mod.dia.Cell.Options): this.type = js.native
  def clone(opt: EmbeddableOptions): Cell | js.Array[Cell] = js.native
  def embed(cell: Cell): this.type = js.native
  def embed(cell: Cell, opt: Options): this.type = js.native
  def findView(paper: Paper): CellView = js.native
  /* protected */ def generateId(): String | Double = js.native
  def getAncestors(): js.Array[Cell] = js.native
  def getBBox(): Rect = js.native
  def getChangeFlag(attributes: StringDictionary[Double]): Double = js.native
  def getEmbeddedCells(): js.Array[Cell] = js.native
  def getEmbeddedCells(opt: BreadthFirst): js.Array[Cell] = js.native
  def getParentCell(): Cell | Null = js.native
  def getPointFromConnectedLink(link: Link, endType: LinkEnd): typingsSlinky.jointjs.mod.g.Point = js.native
  def getTransitions(): js.Array[String] = js.native
  def isElement(): Boolean = js.native
  def isEmbedded(): Boolean = js.native
  def isEmbeddedIn(cell: Cell): Boolean = js.native
  def isEmbeddedIn(cell: Cell, opt: EmbeddableOptions): Boolean = js.native
  def isLink(): Boolean = js.native
  def parent(): String = js.native
  def parent(parentId: String): this.type = js.native
  /**
    * @deprecated
    */
  /* protected */ def processPorts(): Unit = js.native
  def prop(key: String): js.Any = js.native
  def prop(key: String, value: js.Any): this.type = js.native
  def prop(key: String, value: js.Any, opt: typingsSlinky.jointjs.mod.dia.Cell.Options): this.type = js.native
  def prop(key: js.Array[String]): js.Any = js.native
  def prop(key: js.Array[String], value: js.Any): this.type = js.native
  def prop(key: js.Array[String], value: js.Any, opt: typingsSlinky.jointjs.mod.dia.Cell.Options): this.type = js.native
  def prop(`object`: Attributes): this.type = js.native
  def prop(`object`: Attributes, opt: typingsSlinky.jointjs.mod.dia.Cell.Options): this.type = js.native
  def remove(): this.type = js.native
  def remove(opt: DisconnectableOptions): this.type = js.native
  def removeAttr(path: String): this.type = js.native
  def removeAttr(path: String, opt: typingsSlinky.jointjs.mod.dia.Cell.Options): this.type = js.native
  def removeAttr(path: js.Array[String]): this.type = js.native
  def removeAttr(path: js.Array[String], opt: typingsSlinky.jointjs.mod.dia.Cell.Options): this.type = js.native
  def removeProp(path: String): this.type = js.native
  def removeProp(path: String, opt: typingsSlinky.jointjs.mod.dia.Cell.Options): this.type = js.native
  def removeProp(path: js.Array[String]): this.type = js.native
  def removeProp(path: js.Array[String], opt: typingsSlinky.jointjs.mod.dia.Cell.Options): this.type = js.native
  def startBatch(name: String): this.type = js.native
  def startBatch(name: String, opt: Options): this.type = js.native
  def stopBatch(name: String): this.type = js.native
  def stopBatch(name: String, opt: Options): this.type = js.native
  def stopTransitions(): this.type = js.native
  def stopTransitions(path: String): this.type = js.native
  def stopTransitions(path: String, delim: String): this.type = js.native
  def toBack(): this.type = js.native
  def toBack(opt: EmbeddableOptions): this.type = js.native
  def toFront(): this.type = js.native
  def toFront(opt: EmbeddableOptions): this.type = js.native
  def toJSON(): js.Any = js.native
  def transition(path: String): Double = js.native
  def transition(path: String, value: js.Any): Double = js.native
  def transition(path: String, value: js.Any, opt: TransitionOptions): Double = js.native
  def transition(path: String, value: js.Any, opt: TransitionOptions, delim: String): Double = js.native
  def unembed(cell: Cell): this.type = js.native
  def unembed(cell: Cell, opt: Options): this.type = js.native
}

