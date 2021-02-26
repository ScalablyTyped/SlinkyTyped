package typingsSlinky.konva

import typingsSlinky.konva.anon.Antialiased
import typingsSlinky.konva.anon.Height
import typingsSlinky.konva.canvasMod.HitCanvas
import typingsSlinky.konva.canvasMod.SceneCanvas
import typingsSlinky.konva.containerMod.Container
import typingsSlinky.konva.containerMod.ContainerConfig
import typingsSlinky.konva.contextMod.Context
import typingsSlinky.konva.groupMod.Group
import typingsSlinky.konva.nodeMod.Node
import typingsSlinky.konva.nodeMod.NodeConfig
import typingsSlinky.konva.shapeMod.Shape
import typingsSlinky.konva.shapeMod.ShapeConfig
import typingsSlinky.konva.typesMod.GetSet
import typingsSlinky.konva.typesMod.Vector2d
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object layerMod {
  
  @JSImport("konva/types/Layer", "Layer")
  @js.native
  class Layer () extends Container[Group | Shape[ShapeConfig]] {
    def this(config: LayerConfig) = this()
    
    def _checkVisibility(): Unit = js.native
    
    def _getIntersection(pos: Vector2d): Antialiased = js.native
    
    def _setSmoothEnabled(): Unit = js.native
    
    def _validateAdd(child: js.Any): Unit = js.native
    
    var _waitingForDraw: Boolean = js.native
    
    def batchDraw(): this.type = js.native
    
    var canvas: SceneCanvas = js.native
    
    def clear(): this.type = js.native
    def clear(bounds: js.Any): this.type = js.native
    
    def clearBeforeDraw(): Boolean = js.native
    def clearBeforeDraw(v: Boolean): this.type = js.native
    @JSName("clearBeforeDraw")
    var clearBeforeDraw_Original: GetSet[Boolean, this.type] = js.native
    
    def createPNGStream(): js.Any = js.native
    
    def disableHitGraph(): this.type = js.native
    
    def drawHit(can: js.Any, top: js.Any): this.type = js.native
    
    def drawScene(can: js.Any, top: js.Any): this.type = js.native
    
    def enableHitGraph(): this.type = js.native
    
    def getCanvas(): SceneCanvas = js.native
    
    def getContext(): Context = js.native
    
    def getHeight(): Double = js.native
    
    def getHitCanvas(): HitCanvas = js.native
    
    def getHitGraphEnabled(`val`: js.Any): Boolean = js.native
    
    def getIntersection(pos: Vector2d): Node[NodeConfig] | Null = js.native
    def getIntersection(pos: Vector2d, selector: String): Node[NodeConfig] | Null = js.native
    
    def getWidth(): Double = js.native
    
    var hitCanvas: HitCanvas = js.native
    
    def hitGraphEnabled(): Boolean = js.native
    def hitGraphEnabled(v: Boolean): this.type = js.native
    @JSName("hitGraphEnabled")
    var hitGraphEnabled_Original: GetSet[Boolean, this.type] = js.native
    
    def imageSmoothingEnabled(): Boolean = js.native
    def imageSmoothingEnabled(v: Boolean): this.type = js.native
    @JSName("imageSmoothingEnabled")
    var imageSmoothingEnabled_Original: GetSet[Boolean, this.type] = js.native
    
    def setHeight(): Unit = js.native
    
    def setHitGraphEnabled(`val`: js.Any): Unit = js.native
    
    def setSize(hasWidthHeight: Height): this.type = js.native
    
    def setWidth(): Unit = js.native
    
    def toggleHitCanvas(): Unit = js.native
  }
  
  @js.native
  trait LayerConfig extends ContainerConfig {
    
    var hitGraphEnabled: js.UndefOr[Boolean] = js.native
    
    var imageSmoothingEnabled: js.UndefOr[Boolean] = js.native
  }
  object LayerConfig {
    
    @scala.inline
    def apply(): LayerConfig = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[LayerConfig]
    }
    
    @scala.inline
    implicit class LayerConfigMutableBuilder[Self <: LayerConfig] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setHitGraphEnabled(value: Boolean): Self = StObject.set(x, "hitGraphEnabled", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHitGraphEnabledUndefined: Self = StObject.set(x, "hitGraphEnabled", js.undefined)
      
      @scala.inline
      def setImageSmoothingEnabled(value: Boolean): Self = StObject.set(x, "imageSmoothingEnabled", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setImageSmoothingEnabledUndefined: Self = StObject.set(x, "imageSmoothingEnabled", js.undefined)
    }
  }
}
