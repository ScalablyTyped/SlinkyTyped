package typingsSlinky.konva

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.TopLevel
import typingsSlinky.konva.anon.Assign
import typingsSlinky.konva.anon.BackEaseIn
import typingsSlinky.konva.anon.Browser
import typingsSlinky.konva.anon.Drag
import typingsSlinky.konva.anon.TypeofAnimation
import typingsSlinky.konva.anon.TypeofCollection
import typingsSlinky.konva.anon.TypeofNode
import typingsSlinky.konva.anon.TypeofTween
import typingsSlinky.konva.canvasMod.ICanvasConfig
import typingsSlinky.konva.layerMod.LayerConfig
import typingsSlinky.konva.nodeMod.Node
import typingsSlinky.konva.nodeMod.NodeConfig
import typingsSlinky.konva.shapeMod.ShapeConfig
import typingsSlinky.konva.stageMod.StageConfig
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("konva/types/_CoreInternals", JSImport.Namespace)
@js.native
object coreInternalsMod extends js.Object {
  
  @js.native
  object Konva extends js.Object {
    
    var Animation: TypeofAnimation = js.native
    
    var Collection: TypeofCollection = js.native
    
    var DD: Drag = js.native
    
    var Easings: BackEaseIn = js.native
    
    var Node: TypeofNode = js.native
    
    var Tween: TypeofTween = js.native
    
    var UA: Browser = js.native
    
    var Util: Assign = js.native
    
    var _global: js.Any = js.native
    
    def _injectGlobal(Konva: js.Any): Unit = js.native
    
    def _parseUA(userAgent: js.Any): Browser = js.native
    
    var _pointerEventsEnabled: Boolean = js.native
    
    var angleDeg: Boolean = js.native
    
    var captureTouchEventsEnabled: Boolean = js.native
    
    var dblClickWindow: Double = js.native
    
    var document: js.Any = js.native
    
    var dragButtons: js.Array[Double] = js.native
    
    var dragDistance: Double = js.native
    
    var enableTrace: Boolean = js.native
    
    def getAngle(angle: js.Any): js.Any = js.native
    
    var hitOnDragEnabled: Boolean = js.native
    
    var ids: js.Any = js.native
    
    var inDblClickWindow: Boolean = js.native
    
    var isBrowser: Boolean = js.native
    
    def isDragReady(): Boolean = js.native
    
    def isDragging(): js.Any = js.native
    
    var isUnminified: Boolean = js.native
    
    var listenClickTap: Boolean = js.native
    
    var names: js.Any = js.native
    
    var pixelRatio: js.Any = js.native
    
    var shapes: StringDictionary[typingsSlinky.konva.shapeMod.Shape[ShapeConfig]] = js.native
    
    var showWarnings: Boolean = js.native
    
    var stages: js.Array[typingsSlinky.konva.stageMod.Stage] = js.native
    
    var version: String = js.native
    
    @js.native
    class Canvas protected ()
      extends typingsSlinky.konva.canvasMod.Canvas {
      def this(config: ICanvasConfig) = this()
    }
    @js.native
    object Canvas
      extends TopLevel[Instantiable1[/* config */ ICanvasConfig, typingsSlinky.konva.canvasMod.Canvas]]
    
    @js.native
    class Container[ChildType /* <: Node[NodeConfig] */] ()
      extends typingsSlinky.konva.containerMod.Container[ChildType]
    @js.native
    object Container
      extends TopLevel[Instantiable0[typingsSlinky.konva.containerMod.Container[Node[NodeConfig]]]]
    
    @js.native
    class Context protected ()
      extends typingsSlinky.konva.contextMod.Context {
      def this(canvas: typingsSlinky.konva.canvasMod.Canvas) = this()
    }
    @js.native
    object Context
      extends TopLevel[
              Instantiable1[
                /* canvas */ typingsSlinky.konva.canvasMod.Canvas, 
                typingsSlinky.konva.contextMod.Context
              ]
            ]
    
    @js.native
    class FastLayer protected ()
      extends typingsSlinky.konva.fastLayerMod.FastLayer {
      def this(attrs: js.Any) = this()
    }
    @js.native
    object FastLayer
      extends TopLevel[Instantiable1[/* attrs */ js.Any, typingsSlinky.konva.fastLayerMod.FastLayer]]
    
    @js.native
    class Group ()
      extends typingsSlinky.konva.groupMod.Group
    @js.native
    object Group
      extends TopLevel[Instantiable0[typingsSlinky.konva.groupMod.Group]]
    
    @js.native
    class Layer ()
      extends typingsSlinky.konva.layerMod.Layer {
      def this(config: LayerConfig) = this()
    }
    @js.native
    object Layer
      extends TopLevel[
              Instantiable1[/* config */ js.UndefOr[LayerConfig], typingsSlinky.konva.layerMod.Layer]
            ]
    
    @js.native
    class Shape[Config /* <: ShapeConfig */] ()
      extends typingsSlinky.konva.shapeMod.Shape[Config] {
      def this(config: /* import warning: RewrittenClass.unapply cls was tparam Config */ js.Any) = this()
    }
    @js.native
    object Shape
      extends TopLevel[
              Instantiable1[
                /* config */ js.UndefOr[/* import warning: RewrittenClass.unapply cls was tparam Config */ js.Any], 
                typingsSlinky.konva.shapeMod.Shape[ShapeConfig]
              ]
            ]
    
    @js.native
    class Stage protected ()
      extends typingsSlinky.konva.stageMod.Stage {
      def this(config: StageConfig) = this()
    }
    @js.native
    object Stage
      extends TopLevel[Instantiable1[/* config */ StageConfig, typingsSlinky.konva.stageMod.Stage]]
    
    @js.native
    class Transform ()
      extends typingsSlinky.konva.utilMod.Transform {
      def this(m: js.Array[Double]) = this()
    }
    @js.native
    object Transform
      extends TopLevel[
              Instantiable1[/* m */ js.UndefOr[js.Array[Double]], typingsSlinky.konva.utilMod.Transform]
            ]
  }
}
