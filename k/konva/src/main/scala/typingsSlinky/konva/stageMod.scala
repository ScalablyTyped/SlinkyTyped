package typingsSlinky.konva

import org.scalajs.dom.raw.HTMLDivElement
import org.scalajs.dom.raw.PointerEvent
import typingsSlinky.konva.anon.Left
import typingsSlinky.konva.anon.Vector2didnumberundefined
import typingsSlinky.konva.canvasMod.HitCanvas
import typingsSlinky.konva.canvasMod.SceneCanvas
import typingsSlinky.konva.containerMod.Container
import typingsSlinky.konva.containerMod.ContainerConfig
import typingsSlinky.konva.layerMod.Layer
import typingsSlinky.konva.nodeMod.Node
import typingsSlinky.konva.nodeMod.NodeConfig
import typingsSlinky.konva.shapeMod.Shape
import typingsSlinky.konva.shapeMod.ShapeConfig
import typingsSlinky.konva.typesMod.GetSet
import typingsSlinky.konva.typesMod.Vector2d
import typingsSlinky.konva.utilMod.Collection
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object stageMod {
  
  @JSImport("konva/types/Stage", "Stage")
  @js.native
  class Stage protected () extends Container[Layer] {
    def this(config: StageConfig) = this()
    
    def _bindContentEvents(): Unit = js.native
    
    def _buildDOM(): Unit = js.native
    
    var _changedPointerPositions: js.Array[Vector2didnumberundefined] = js.native
    
    def _checkVisibility(): Unit = js.native
    
    def _contextmenu(evt: js.Any): Unit = js.native
    
    def _getContentPosition(): Left = js.native
    
    def _getPointerById(): Vector2didnumberundefined = js.native
    def _getPointerById(id: Double): Vector2didnumberundefined = js.native
    
    def _lostpointercapture(evt: PointerEvent): Unit = js.native
    
    def _mousedown(evt: js.Any): Unit = js.native
    
    def _mouseenter(evt: js.Any): Unit = js.native
    
    def _mousemove(evt: js.Any): Unit = js.native
    
    def _mouseout(evt: js.Any): Unit = js.native
    
    def _mouseover(evt: js.Any): Unit = js.native
    
    def _mouseup(evt: js.Any): Unit = js.native
    
    var _pointerPositions: js.Array[Vector2didnumberundefined] = js.native
    
    def _pointercancel(evt: PointerEvent): Unit = js.native
    
    def _pointerdown(evt: PointerEvent): Unit = js.native
    
    def _pointermove(evt: PointerEvent): Unit = js.native
    
    def _pointerup(evt: PointerEvent): Unit = js.native
    
    def _resizeDOM(): Unit = js.native
    
    def _setPointerPosition(evt: js.Any): Unit = js.native
    
    def _touchend(evt: js.Any): Unit = js.native
    
    def _touchmove(evt: js.Any): Unit = js.native
    
    def _touchstart(evt: js.Any): Unit = js.native
    
    def _validateAdd(child: js.Any): Unit = js.native
    
    def _wheel(evt: js.Any): Unit = js.native
    
    def add(layer: Layer): this.type = js.native
    
    def batchDraw(): this.type = js.native
    
    var bufferCanvas: SceneCanvas = js.native
    
    var bufferHitCanvas: HitCanvas = js.native
    
    def clear(): this.type = js.native
    
    var clickEndShape: Shape[ShapeConfig] = js.native
    
    var clickStartShape: Shape[ShapeConfig] = js.native
    
    def container(): HTMLDivElement = js.native
    def container(v: HTMLDivElement): this.type = js.native
    @JSName("container")
    var container_Original: GetSet[HTMLDivElement, this.type] = js.native
    
    var content: HTMLDivElement = js.native
    
    var dblTimeout: js.Any = js.native
    
    def getContent(): HTMLDivElement = js.native
    
    def getIntersection(): Shape[ShapeConfig] | Null = js.native
    def getIntersection(pos: Null, selector: String): Shape[ShapeConfig] | Null = js.native
    def getIntersection(pos: Vector2d): Shape[ShapeConfig] | Null = js.native
    def getIntersection(pos: Vector2d, selector: String): Shape[ShapeConfig] | Null = js.native
    
    def getLayers(): Collection[Node[NodeConfig]] = js.native
    
    def getPointerPosition(): Vector2d | Null = js.native
    
    def getPointersPositions(): js.Array[Vector2didnumberundefined] = js.native
    
    def hasPointerCapture(pointerId: Double): Boolean = js.native
    
    var pointerPos: Vector2d | Null = js.native
    
    def releaseCapture(pointerId: Double): Unit = js.native
    
    def setContainer(container: js.Any): this.type = js.native
    
    def setPointerCapture(pointerId: Double): Unit = js.native
    
    def setPointersPositions(evt: js.Any): Unit = js.native
    
    var tapEndShape: Shape[ShapeConfig] = js.native
    
    var tapStartShape: Shape[ShapeConfig] = js.native
    
    var targetShape: Shape[ShapeConfig] = js.native
  }
  
  @JSImport("konva/types/Stage", "stages")
  @js.native
  val stages: js.Array[Stage] = js.native
  
  @js.native
  trait StageConfig extends ContainerConfig {
    
    var container: HTMLDivElement | String = js.native
  }
  object StageConfig {
    
    @scala.inline
    def apply(container: HTMLDivElement | String): StageConfig = {
      val __obj = js.Dynamic.literal(container = container.asInstanceOf[js.Any])
      __obj.asInstanceOf[StageConfig]
    }
    
    @scala.inline
    implicit class StageConfigMutableBuilder[Self <: StageConfig] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setContainer(value: HTMLDivElement | String): Self = StObject.set(x, "container", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContainerHTMLDivElement(value: HTMLDivElement): Self = StObject.set(x, "container", value.asInstanceOf[js.Any])
    }
  }
}
