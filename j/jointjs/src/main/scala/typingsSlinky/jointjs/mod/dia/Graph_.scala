package typingsSlinky.jointjs.mod.dia

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.backbone.mod.Model
import typingsSlinky.backbone.mod.ModelSetOptions
import typingsSlinky.jointjs.anon.CellModel
import typingsSlinky.jointjs.anon.SearchBy
import typingsSlinky.jointjs.anon.Strict
import typingsSlinky.jointjs.mod.dia.Cell.DisconnectableOptions
import typingsSlinky.jointjs.mod.dia.Cell.EmbeddableOptions
import typingsSlinky.jointjs.mod.dia.Element.TranslateOptions
import typingsSlinky.jointjs.mod.dia.Graph.ConnectionOptions
import typingsSlinky.jointjs.mod.dia.Graph.ExploreOptions
import typingsSlinky.jointjs.mod.g.Rect
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("jointjs", "dia.Graph")
@js.native
class Graph_ ()
  extends Model[js.Any, ModelSetOptions, js.Object] {
  def this(attributes: js.Any) = this()
  def this(attributes: js.UndefOr[scala.Nothing], opt: CellModel) = this()
  def this(attributes: js.Any, opt: CellModel) = this()
  
  def addCell(cell: js.Array[Cell]): this.type = js.native
  def addCell(cell: js.Array[Cell], opt: StringDictionary[js.Any]): this.type = js.native
  def addCell(cell: Cell): this.type = js.native
  def addCell(cell: Cell, opt: StringDictionary[js.Any]): this.type = js.native
  
  def addCells(cells: js.Array[Cell]): this.type = js.native
  def addCells(cells: js.Array[Cell], opt: StringDictionary[js.Any]): this.type = js.native
  
  def bfs(element: Element, iteratee: js.Function2[/* element */ Element, /* distance */ Double, Boolean]): Unit = js.native
  def bfs(
    element: Element,
    iteratee: js.Function2[/* element */ Element, /* distance */ Double, Boolean],
    opt: ConnectionOptions
  ): Unit = js.native
  
  def clear(opt: StringDictionary[js.Any]): this.type = js.native
  
  def cloneCells(cells: js.Array[Cell]): StringDictionary[Cell] = js.native
  
  def cloneSubgraph(cells: js.Array[Cell]): StringDictionary[Cell] = js.native
  def cloneSubgraph(cells: js.Array[Cell], opt: EmbeddableOptions): StringDictionary[Cell] = js.native
  
  def dfs(element: Element, iteratee: js.Function2[/* element */ Element, /* distance */ Double, Boolean]): Unit = js.native
  def dfs(
    element: Element,
    iteratee: js.Function2[/* element */ Element, /* distance */ Double, Boolean],
    opt: ConnectionOptions
  ): Unit = js.native
  
  def disconnectLinks(cell: Cell): Unit = js.native
  def disconnectLinks(cell: Cell, opt: StringDictionary[js.Any]): Unit = js.native
  
  def findModelsFromPoint(p: Point): js.Array[Element] = js.native
  
  def findModelsInArea(rect: BBox): js.Array[Element] = js.native
  def findModelsInArea(rect: BBox, opt: Strict): js.Array[Element] = js.native
  
  def findModelsUnderElement(element: Element): js.Array[Element] = js.native
  def findModelsUnderElement(element: Element, opt: SearchBy): js.Array[Element] = js.native
  
  def fromGraphLib(glGraph: js.Any): this.type = js.native
  def fromGraphLib(glGraph: js.Any, opt: StringDictionary[js.Any]): this.type = js.native
  
  def fromJSON(json: js.Any): this.type = js.native
  def fromJSON(json: js.Any, opt: StringDictionary[js.Any]): this.type = js.native
  
  def getBBox(): Rect | Null = js.native
  
  def getCell(id: String): Cell = js.native
  def getCell(id: Double): Cell = js.native
  def getCell(id: Cell): Cell = js.native
  
  def getCells(): js.Array[Cell] = js.native
  
  def getCellsBBox(cells: js.Array[Cell]): Rect | Null = js.native
  def getCellsBBox(cells: js.Array[Cell], opt: EmbeddableOptions): Rect | Null = js.native
  
  def getCommonAncestor(cells: Cell*): js.UndefOr[Element] = js.native
  
  def getConnectedLinks(cell: Cell): js.Array[Link] = js.native
  def getConnectedLinks(cell: Cell, opt: ConnectionOptions): js.Array[Link] = js.native
  
  def getElements(): js.Array[Element] = js.native
  
  def getFirstCell(): js.UndefOr[Cell] = js.native
  
  def getLastCell(): js.UndefOr[Cell] = js.native
  
  def getLinks(): js.Array[Link] = js.native
  
  def getNeighbors(element: Element): js.Array[Element] = js.native
  def getNeighbors(element: Element, opt: ConnectionOptions): js.Array[Element] = js.native
  
  def getPredecessors(element: Element): js.Array[Element] = js.native
  def getPredecessors(element: Element, opt: ExploreOptions): js.Array[Element] = js.native
  
  def getSinks(): js.Array[Element] = js.native
  
  def getSources(): js.Array[Element] = js.native
  
  def getSubgraph(cells: js.Array[Cell]): js.Array[Cell] = js.native
  def getSubgraph(cells: js.Array[Cell], opt: EmbeddableOptions): js.Array[Cell] = js.native
  
  def getSuccessors(element: Element): js.Array[Element] = js.native
  def getSuccessors(element: Element, opt: ExploreOptions): js.Array[Element] = js.native
  
  def hasActiveBatch(): Boolean = js.native
  def hasActiveBatch(name: String): Boolean = js.native
  def hasActiveBatch(name: js.Array[String]): Boolean = js.native
  
  def isNeighbor(elementA: Element, elementB: Element): Boolean = js.native
  def isNeighbor(elementA: Element, elementB: Element, opt: ConnectionOptions): Boolean = js.native
  
  def isPredecessor(elementA: Element, elementB: Element): Boolean = js.native
  
  def isSink(element: Element): Boolean = js.native
  
  def isSource(element: Element): Boolean = js.native
  
  def isSuccessor(elementA: Element, elementB: Element): Boolean = js.native
  
  def maxZIndex(): Double = js.native
  
  def minZIndex(): Double = js.native
  
  def removeCells(cells: js.Array[Cell]): this.type = js.native
  def removeCells(cells: js.Array[Cell], opt: DisconnectableOptions): this.type = js.native
  
  def removeLinks(cell: Cell): Unit = js.native
  def removeLinks(cell: Cell, opt: StringDictionary[js.Any]): Unit = js.native
  
  def resetCells(cells: js.Array[Cell]): this.type = js.native
  def resetCells(cells: js.Array[Cell], opt: StringDictionary[js.Any]): this.type = js.native
  
  def resize(width: Double, height: Double): this.type = js.native
  def resize(width: Double, height: Double, opt: StringDictionary[js.Any]): this.type = js.native
  
  def resizeCells(width: Double, height: Double, cells: js.Array[Cell]): this.type = js.native
  def resizeCells(width: Double, height: Double, cells: js.Array[Cell], opt: StringDictionary[js.Any]): this.type = js.native
  
  def search(element: Element, iteratee: js.Function2[/* element */ Element, /* distance */ Double, Boolean]): Unit = js.native
  def search(
    element: Element,
    iteratee: js.Function2[/* element */ Element, /* distance */ Double, Boolean],
    opt: ExploreOptions
  ): Unit = js.native
  
  def startBatch(name: String): this.type = js.native
  def startBatch(name: String, data: StringDictionary[js.Any]): this.type = js.native
  
  def stopBatch(name: String): this.type = js.native
  def stopBatch(name: String, data: StringDictionary[js.Any]): this.type = js.native
  
  def toGraphLib(): js.Any = js.native
  def toGraphLib(opt: StringDictionary[js.Any]): js.Any = js.native
  
  def toJSON(): js.Any = js.native
  
  def translate(tx: Double): this.type = js.native
  def translate(tx: Double, ty: js.UndefOr[scala.Nothing], opt: TranslateOptions): this.type = js.native
  def translate(tx: Double, ty: Double): this.type = js.native
  def translate(tx: Double, ty: Double, opt: TranslateOptions): this.type = js.native
}
