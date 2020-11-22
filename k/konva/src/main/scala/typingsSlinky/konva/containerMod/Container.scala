package typingsSlinky.konva.containerMod

import org.scalajs.dom.raw.CanvasRenderingContext2D
import typingsSlinky.konva.canvasMod.HitCanvas
import typingsSlinky.konva.canvasMod.SceneCanvas
import typingsSlinky.konva.nodeMod.Node
import typingsSlinky.konva.nodeMod.NodeConfig
import typingsSlinky.konva.typesMod.GetSet
import typingsSlinky.konva.typesMod.IRect
import typingsSlinky.konva.utilMod.Collection
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("konva/types/Container", "Container")
@js.native
abstract class Container[ChildType /* <: Node[NodeConfig] */] () extends Node[ContainerConfig] {
  
  var _descendants: js.Any = js.native
  
  def _drawChildren(drawMethod: js.Any, canvas: js.Any, top: js.Any): Unit = js.native
  
  def _generalFind[ChildNode /* <: Node[NodeConfig] */](selector: String, findOne: Boolean): Collection[ChildNode] = js.native
  def _generalFind[ChildNode /* <: Node[NodeConfig] */](selector: js.Function, findOne: Boolean): Collection[ChildNode] = js.native
  
  def _setChildrenIndices(): Unit = js.native
  
  def _validateAdd(node: Node[NodeConfig]): Unit = js.native
  
  def add(children: ChildType*): this.type = js.native
  
  @JSName("children")
  var children_Container: Collection[ChildType] = js.native
  
  def clip(): IRect = js.native
  def clip(v: IRect): this.type = js.native
  
  def clipFunc(): js.Function2[/* ctx */ CanvasRenderingContext2D, /* shape */ Container[ChildType], Unit] = js.native
  def clipFunc(v: js.Function2[/* ctx */ CanvasRenderingContext2D, /* shape */ Container[ChildType], Unit]): this.type = js.native
  @JSName("clipFunc")
  var clipFunc_Original: GetSet[
    js.Function2[/* ctx */ CanvasRenderingContext2D, /* shape */ Container[ChildType], Unit], 
    this.type
  ] = js.native
  
  def clipHeight(): Double = js.native
  def clipHeight(v: Double): this.type = js.native
  @JSName("clipHeight")
  var clipHeight_Original: GetSet[Double, this.type] = js.native
  
  def clipWidth(): Double = js.native
  def clipWidth(v: Double): this.type = js.native
  @JSName("clipWidth")
  var clipWidth_Original: GetSet[Double, this.type] = js.native
  
  def clipX(): Double = js.native
  def clipX(v: Double): this.type = js.native
  @JSName("clipX")
  var clipX_Original: GetSet[Double, this.type] = js.native
  
  def clipY(): Double = js.native
  def clipY(v: Double): this.type = js.native
  @JSName("clipY")
  var clipY_Original: GetSet[Double, this.type] = js.native
  
  @JSName("clip")
  var clip_Original: GetSet[IRect, this.type] = js.native
  
  def destroyChildren(): this.type = js.native
  
  def drawHit(can: HitCanvas): this.type = js.native
  def drawHit(can: HitCanvas, top: Node[NodeConfig]): this.type = js.native
  
  def drawScene(can: SceneCanvas): this.type = js.native
  def drawScene(can: SceneCanvas, top: Node[NodeConfig]): this.type = js.native
  
  def find[ChildNode /* <: Node[NodeConfig] */](selector: js.Any): Collection[ChildNode] = js.native
  
  def findOne[ChildNode /* <: Node[NodeConfig] */](selector: String): ChildNode = js.native
  def findOne[ChildNode /* <: Node[NodeConfig] */](selector: js.Function): ChildNode = js.native
  
  def get(selector: js.Any): Collection[Node[NodeConfig]] = js.native
  
  def getAllIntersections(pos: js.Any): js.Array[_] = js.native
  
  def getChildren(filterFunc: js.Function1[/* item */ Node[NodeConfig], Boolean]): Collection[Node[NodeConfig]] = js.native
  
  def isAncestorOf(node: Node[NodeConfig]): Boolean = js.native
  
  def removeChildren(): this.type = js.native
}
