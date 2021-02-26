package typingsSlinky.konva

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
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
import typingsSlinky.konva.nodeMod.NodeConfig
import typingsSlinky.konva.shapeMod.ShapeConfig
import typingsSlinky.konva.stageMod.StageConfig
import typingsSlinky.konva.tweenMod.TweenConfig
import typingsSlinky.konva.typesMod.AnimationFn
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object coreInternalsMod {
  
  object Konva {
    
    @JSImport("konva/types/_CoreInternals", "Konva")
    @js.native
    val ^ : js.Any = js.native
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("konva/types/_CoreInternals", "Konva.Animation")
    @js.native
    class Animation protected ()
      extends typingsSlinky.konva.animationMod.Animation {
      def this(func: AnimationFn) = this()
      def this(func: AnimationFn, layers: js.Any) = this()
    }
    @JSImport("konva/types/_CoreInternals", "Konva.Animation")
    @js.native
    def Animation: TypeofAnimation = js.native
    @scala.inline
    def Animation_=(x: TypeofAnimation): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Animation")(x.asInstanceOf[js.Any])
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("konva/types/_CoreInternals", "Konva.Canvas")
    @js.native
    class Canvas protected ()
      extends typingsSlinky.konva.canvasMod.Canvas {
      def this(config: ICanvasConfig) = this()
    }
    @JSImport("konva/types/_CoreInternals", "Konva.Canvas")
    @js.native
    def Canvas: Instantiable1[/* config */ ICanvasConfig, typingsSlinky.konva.canvasMod.Canvas] = js.native
    @scala.inline
    def Canvas_=(x: Instantiable1[/* config */ ICanvasConfig, typingsSlinky.konva.canvasMod.Canvas]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Canvas")(x.asInstanceOf[js.Any])
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("konva/types/_CoreInternals", "Konva.Collection")
    @js.native
    class Collection[Child /* <: typingsSlinky.konva.nodeMod.Node[NodeConfig] */] ()
      extends typingsSlinky.konva.utilMod.Collection[Child]
    @JSImport("konva/types/_CoreInternals", "Konva.Collection")
    @js.native
    def Collection: TypeofCollection = js.native
    @scala.inline
    def Collection_=(x: TypeofCollection): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Collection")(x.asInstanceOf[js.Any])
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("konva/types/_CoreInternals", "Konva.Container")
    @js.native
    class Container[ChildType /* <: typingsSlinky.konva.nodeMod.Node[NodeConfig] */] ()
      extends typingsSlinky.konva.containerMod.Container[ChildType]
    @JSImport("konva/types/_CoreInternals", "Konva.Container")
    @js.native
    def Container: Instantiable0[
        typingsSlinky.konva.containerMod.Container[typingsSlinky.konva.nodeMod.Node[NodeConfig]]
      ] = js.native
    @scala.inline
    def Container_=(
      x: Instantiable0[
          typingsSlinky.konva.containerMod.Container[typingsSlinky.konva.nodeMod.Node[NodeConfig]]
        ]
    ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Container")(x.asInstanceOf[js.Any])
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("konva/types/_CoreInternals", "Konva.Context")
    @js.native
    class Context protected ()
      extends typingsSlinky.konva.contextMod.Context {
      def this(canvas: typingsSlinky.konva.canvasMod.Canvas) = this()
    }
    @JSImport("konva/types/_CoreInternals", "Konva.Context")
    @js.native
    def Context: Instantiable1[
        /* canvas */ typingsSlinky.konva.canvasMod.Canvas, 
        typingsSlinky.konva.contextMod.Context
      ] = js.native
    @scala.inline
    def Context_=(
      x: Instantiable1[
          /* canvas */ typingsSlinky.konva.canvasMod.Canvas, 
          typingsSlinky.konva.contextMod.Context
        ]
    ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Context")(x.asInstanceOf[js.Any])
    
    @JSImport("konva/types/_CoreInternals", "Konva.DD")
    @js.native
    def DD: Drag = js.native
    @scala.inline
    def DD_=(x: Drag): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DD")(x.asInstanceOf[js.Any])
    
    @JSImport("konva/types/_CoreInternals", "Konva.Easings")
    @js.native
    def Easings: BackEaseIn = js.native
    @scala.inline
    def Easings_=(x: BackEaseIn): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Easings")(x.asInstanceOf[js.Any])
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("konva/types/_CoreInternals", "Konva.FastLayer")
    @js.native
    class FastLayer protected ()
      extends typingsSlinky.konva.fastLayerMod.FastLayer {
      def this(attrs: js.Any) = this()
    }
    @JSImport("konva/types/_CoreInternals", "Konva.FastLayer")
    @js.native
    def FastLayer: Instantiable1[/* attrs */ js.Any, typingsSlinky.konva.fastLayerMod.FastLayer] = js.native
    @scala.inline
    def FastLayer_=(x: Instantiable1[/* attrs */ js.Any, typingsSlinky.konva.fastLayerMod.FastLayer]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("FastLayer")(x.asInstanceOf[js.Any])
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("konva/types/_CoreInternals", "Konva.Group")
    @js.native
    class Group ()
      extends typingsSlinky.konva.groupMod.Group
    @JSImport("konva/types/_CoreInternals", "Konva.Group")
    @js.native
    def Group: Instantiable0[typingsSlinky.konva.groupMod.Group] = js.native
    @scala.inline
    def Group_=(x: Instantiable0[typingsSlinky.konva.groupMod.Group]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Group")(x.asInstanceOf[js.Any])
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("konva/types/_CoreInternals", "Konva.Layer")
    @js.native
    class Layer ()
      extends typingsSlinky.konva.layerMod.Layer {
      def this(config: LayerConfig) = this()
    }
    @JSImport("konva/types/_CoreInternals", "Konva.Layer")
    @js.native
    def Layer: Instantiable1[/* config */ js.UndefOr[LayerConfig], typingsSlinky.konva.layerMod.Layer] = js.native
    @scala.inline
    def Layer_=(x: Instantiable1[/* config */ js.UndefOr[LayerConfig], typingsSlinky.konva.layerMod.Layer]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Layer")(x.asInstanceOf[js.Any])
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("konva/types/_CoreInternals", "Konva.Node")
    @js.native
    class Node[Config /* <: NodeConfig */] ()
      extends typingsSlinky.konva.nodeMod.Node[Config] {
      def this(config: /* import warning: RewrittenClass.unapply cls was tparam Config */ js.Any) = this()
    }
    @JSImport("konva/types/_CoreInternals", "Konva.Node")
    @js.native
    def Node: TypeofNode = js.native
    @scala.inline
    def Node_=(x: TypeofNode): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Node")(x.asInstanceOf[js.Any])
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("konva/types/_CoreInternals", "Konva.Shape")
    @js.native
    class Shape[Config /* <: ShapeConfig */] ()
      extends typingsSlinky.konva.shapeMod.Shape[Config] {
      def this(config: /* import warning: RewrittenClass.unapply cls was tparam Config */ js.Any) = this()
    }
    @JSImport("konva/types/_CoreInternals", "Konva.Shape")
    @js.native
    def Shape: Instantiable1[
        /* config */ js.UndefOr[/* import warning: RewrittenClass.unapply cls was tparam Config */ js.Any], 
        typingsSlinky.konva.shapeMod.Shape[ShapeConfig]
      ] = js.native
    @scala.inline
    def Shape_=(
      x: Instantiable1[
          /* config */ js.UndefOr[/* import warning: RewrittenClass.unapply cls was tparam Config */ js.Any], 
          typingsSlinky.konva.shapeMod.Shape[ShapeConfig]
        ]
    ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Shape")(x.asInstanceOf[js.Any])
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("konva/types/_CoreInternals", "Konva.Stage")
    @js.native
    class Stage protected ()
      extends typingsSlinky.konva.stageMod.Stage {
      def this(config: StageConfig) = this()
    }
    @JSImport("konva/types/_CoreInternals", "Konva.Stage")
    @js.native
    def Stage: Instantiable1[/* config */ StageConfig, typingsSlinky.konva.stageMod.Stage] = js.native
    @scala.inline
    def Stage_=(x: Instantiable1[/* config */ StageConfig, typingsSlinky.konva.stageMod.Stage]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Stage")(x.asInstanceOf[js.Any])
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("konva/types/_CoreInternals", "Konva.Transform")
    @js.native
    class Transform ()
      extends typingsSlinky.konva.utilMod.Transform {
      def this(m: js.Array[Double]) = this()
    }
    @JSImport("konva/types/_CoreInternals", "Konva.Transform")
    @js.native
    def Transform: Instantiable1[/* m */ js.UndefOr[js.Array[Double]], typingsSlinky.konva.utilMod.Transform] = js.native
    @scala.inline
    def Transform_=(x: Instantiable1[/* m */ js.UndefOr[js.Array[Double]], typingsSlinky.konva.utilMod.Transform]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Transform")(x.asInstanceOf[js.Any])
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("konva/types/_CoreInternals", "Konva.Tween")
    @js.native
    class Tween protected ()
      extends typingsSlinky.konva.tweenMod.Tween {
      def this(config: TweenConfig) = this()
    }
    @JSImport("konva/types/_CoreInternals", "Konva.Tween")
    @js.native
    def Tween: TypeofTween = js.native
    @scala.inline
    def Tween_=(x: TypeofTween): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Tween")(x.asInstanceOf[js.Any])
    
    @JSImport("konva/types/_CoreInternals", "Konva.UA")
    @js.native
    def UA: Browser = js.native
    @scala.inline
    def UA_=(x: Browser): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("UA")(x.asInstanceOf[js.Any])
    
    @JSImport("konva/types/_CoreInternals", "Konva.Util")
    @js.native
    def Util: Assign = js.native
    @scala.inline
    def Util_=(x: Assign): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Util")(x.asInstanceOf[js.Any])
    
    @JSImport("konva/types/_CoreInternals", "Konva.angleDeg")
    @js.native
    def angleDeg: Boolean = js.native
    @scala.inline
    def angleDeg_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("angleDeg")(x.asInstanceOf[js.Any])
    
    @JSImport("konva/types/_CoreInternals", "Konva.captureTouchEventsEnabled")
    @js.native
    def captureTouchEventsEnabled: Boolean = js.native
    @scala.inline
    def captureTouchEventsEnabled_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("captureTouchEventsEnabled")(x.asInstanceOf[js.Any])
    
    @JSImport("konva/types/_CoreInternals", "Konva.dblClickWindow")
    @js.native
    def dblClickWindow: Double = js.native
    @scala.inline
    def dblClickWindow_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("dblClickWindow")(x.asInstanceOf[js.Any])
    
    @JSImport("konva/types/_CoreInternals", "Konva.document")
    @js.native
    def document: js.Any = js.native
    @scala.inline
    def document_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("document")(x.asInstanceOf[js.Any])
    
    @JSImport("konva/types/_CoreInternals", "Konva.dragButtons")
    @js.native
    def dragButtons: js.Array[Double] = js.native
    @scala.inline
    def dragButtons_=(x: js.Array[Double]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("dragButtons")(x.asInstanceOf[js.Any])
    
    @JSImport("konva/types/_CoreInternals", "Konva.dragDistance")
    @js.native
    def dragDistance: Double = js.native
    @scala.inline
    def dragDistance_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("dragDistance")(x.asInstanceOf[js.Any])
    
    @JSImport("konva/types/_CoreInternals", "Konva.enableTrace")
    @js.native
    def enableTrace: Boolean = js.native
    @scala.inline
    def enableTrace_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("enableTrace")(x.asInstanceOf[js.Any])
    
    @JSImport("konva/types/_CoreInternals", "Konva.getAngle")
    @js.native
    def getAngle(angle: js.Any): js.Any = js.native
    
    @JSImport("konva/types/_CoreInternals", "Konva._global")
    @js.native
    def global: js.Any = js.native
    
    @scala.inline
    def global_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_global")(x.asInstanceOf[js.Any])
    
    @JSImport("konva/types/_CoreInternals", "Konva.hitOnDragEnabled")
    @js.native
    def hitOnDragEnabled: Boolean = js.native
    @scala.inline
    def hitOnDragEnabled_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("hitOnDragEnabled")(x.asInstanceOf[js.Any])
    
    @JSImport("konva/types/_CoreInternals", "Konva.ids")
    @js.native
    def ids: js.Any = js.native
    @scala.inline
    def ids_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ids")(x.asInstanceOf[js.Any])
    
    @JSImport("konva/types/_CoreInternals", "Konva.inDblClickWindow")
    @js.native
    def inDblClickWindow: Boolean = js.native
    @scala.inline
    def inDblClickWindow_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("inDblClickWindow")(x.asInstanceOf[js.Any])
    
    @JSImport("konva/types/_CoreInternals", "Konva._injectGlobal")
    @js.native
    def injectGlobal(Konva: js.Any): Unit = js.native
    
    @JSImport("konva/types/_CoreInternals", "Konva.isBrowser")
    @js.native
    def isBrowser: Boolean = js.native
    @scala.inline
    def isBrowser_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("isBrowser")(x.asInstanceOf[js.Any])
    
    @JSImport("konva/types/_CoreInternals", "Konva.isDragReady")
    @js.native
    def isDragReady(): Boolean = js.native
    
    @JSImport("konva/types/_CoreInternals", "Konva.isDragging")
    @js.native
    def isDragging(): js.Any = js.native
    
    @JSImport("konva/types/_CoreInternals", "Konva.isUnminified")
    @js.native
    def isUnminified: Boolean = js.native
    @scala.inline
    def isUnminified_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("isUnminified")(x.asInstanceOf[js.Any])
    
    @JSImport("konva/types/_CoreInternals", "Konva.listenClickTap")
    @js.native
    def listenClickTap: Boolean = js.native
    @scala.inline
    def listenClickTap_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("listenClickTap")(x.asInstanceOf[js.Any])
    
    @JSImport("konva/types/_CoreInternals", "Konva.names")
    @js.native
    def names: js.Any = js.native
    @scala.inline
    def names_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("names")(x.asInstanceOf[js.Any])
    
    @JSImport("konva/types/_CoreInternals", "Konva._parseUA")
    @js.native
    def parseUA(userAgent: js.Any): Browser = js.native
    
    @JSImport("konva/types/_CoreInternals", "Konva.pixelRatio")
    @js.native
    def pixelRatio: js.Any = js.native
    @scala.inline
    def pixelRatio_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("pixelRatio")(x.asInstanceOf[js.Any])
    
    @JSImport("konva/types/_CoreInternals", "Konva._pointerEventsEnabled")
    @js.native
    def pointerEventsEnabled: Boolean = js.native
    
    @scala.inline
    def pointerEventsEnabled_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_pointerEventsEnabled")(x.asInstanceOf[js.Any])
    
    @JSImport("konva/types/_CoreInternals", "Konva.showWarnings")
    @js.native
    def showWarnings: Boolean = js.native
    @scala.inline
    def showWarnings_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("showWarnings")(x.asInstanceOf[js.Any])
    
    @JSImport("konva/types/_CoreInternals", "Konva.stages")
    @js.native
    def stages: js.Array[typingsSlinky.konva.stageMod.Stage] = js.native
    @scala.inline
    def stages_=(x: js.Array[typingsSlinky.konva.stageMod.Stage]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("stages")(x.asInstanceOf[js.Any])
    
    @JSImport("konva/types/_CoreInternals", "Konva.version")
    @js.native
    def version: String = js.native
    @scala.inline
    def version_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("version")(x.asInstanceOf[js.Any])
  }
}
