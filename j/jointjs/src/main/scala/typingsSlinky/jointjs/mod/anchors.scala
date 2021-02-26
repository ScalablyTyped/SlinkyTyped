package typingsSlinky.jointjs.mod

import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.raw.SVGElement
import typingsSlinky.jointjs.jointjsStrings.bottom
import typingsSlinky.jointjs.jointjsStrings.bottomLeft
import typingsSlinky.jointjs.jointjsStrings.bottomRight
import typingsSlinky.jointjs.jointjsStrings.center
import typingsSlinky.jointjs.jointjsStrings.left
import typingsSlinky.jointjs.jointjsStrings.midSide
import typingsSlinky.jointjs.jointjsStrings.perpendicular
import typingsSlinky.jointjs.jointjsStrings.right
import typingsSlinky.jointjs.jointjsStrings.top
import typingsSlinky.jointjs.jointjsStrings.topLeft
import typingsSlinky.jointjs.jointjsStrings.topRight
import typingsSlinky.jointjs.mod.dia.CellView
import typingsSlinky.jointjs.mod.g.Point
import typingsSlinky.jointjs.mod.linkAnchors.ConnectionClosestAnchorArguments
import typingsSlinky.jointjs.mod.linkAnchors.ConnectionLengthAnchorArguments
import typingsSlinky.jointjs.mod.linkAnchors.ConnectionPerpendicularAnchorArguments
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anchors {
  
  @JSImport("jointjs", "anchors")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("jointjs", "anchors.bottom")
  @js.native
  def bottom: GenericAnchor[typingsSlinky.jointjs.jointjsStrings.bottom] = js.native
  
  @JSImport("jointjs", "anchors.bottomLeft")
  @js.native
  def bottomLeft: GenericAnchor[typingsSlinky.jointjs.jointjsStrings.bottomLeft] = js.native
  @scala.inline
  def bottomLeft_=(x: GenericAnchor[bottomLeft]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("bottomLeft")(x.asInstanceOf[js.Any])
  
  @JSImport("jointjs", "anchors.bottomRight")
  @js.native
  def bottomRight: GenericAnchor[typingsSlinky.jointjs.jointjsStrings.bottomRight] = js.native
  @scala.inline
  def bottomRight_=(x: GenericAnchor[bottomRight]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("bottomRight")(x.asInstanceOf[js.Any])
  
  @scala.inline
  def bottom_=(x: GenericAnchor[bottom]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("bottom")(x.asInstanceOf[js.Any])
  
  @JSImport("jointjs", "anchors.center")
  @js.native
  def center: GenericAnchor[typingsSlinky.jointjs.jointjsStrings.center] = js.native
  @scala.inline
  def center_=(x: GenericAnchor[center]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("center")(x.asInstanceOf[js.Any])
  
  @JSImport("jointjs", "anchors.left")
  @js.native
  def left: GenericAnchor[typingsSlinky.jointjs.jointjsStrings.left] = js.native
  @scala.inline
  def left_=(x: GenericAnchor[left]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("left")(x.asInstanceOf[js.Any])
  
  @JSImport("jointjs", "anchors.midSide")
  @js.native
  def midSide: GenericAnchor[typingsSlinky.jointjs.jointjsStrings.midSide] = js.native
  @scala.inline
  def midSide_=(x: GenericAnchor[midSide]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("midSide")(x.asInstanceOf[js.Any])
  
  @JSImport("jointjs", "anchors.perpendicular")
  @js.native
  def perpendicular: GenericAnchor[typingsSlinky.jointjs.jointjsStrings.perpendicular] = js.native
  @scala.inline
  def perpendicular_=(x: GenericAnchor[perpendicular]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("perpendicular")(x.asInstanceOf[js.Any])
  
  @JSImport("jointjs", "anchors.right")
  @js.native
  def right: GenericAnchor[typingsSlinky.jointjs.jointjsStrings.right] = js.native
  @scala.inline
  def right_=(x: GenericAnchor[right]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("right")(x.asInstanceOf[js.Any])
  
  @JSImport("jointjs", "anchors.top")
  @js.native
  def top: GenericAnchor[typingsSlinky.jointjs.jointjsStrings.top] = js.native
  
  @JSImport("jointjs", "anchors.topLeft")
  @js.native
  def topLeft: GenericAnchor[typingsSlinky.jointjs.jointjsStrings.topLeft] = js.native
  @scala.inline
  def topLeft_=(x: GenericAnchor[topLeft]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("topLeft")(x.asInstanceOf[js.Any])
  
  @JSImport("jointjs", "anchors.topRight")
  @js.native
  def topRight: GenericAnchor[typingsSlinky.jointjs.jointjsStrings.topRight] = js.native
  @scala.inline
  def topRight_=(x: GenericAnchor[topRight]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("topRight")(x.asInstanceOf[js.Any])
  
  @scala.inline
  def top_=(x: GenericAnchor[top]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("top")(x.asInstanceOf[js.Any])
  
  type Anchor = GenericAnchor[AnchorType]
  
  /* Inlined jointjs.jointjs.anchors.GenericAnchorArguments<jointjs.jointjs.anchors.AnchorType> */
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.jointjs.jointjsStrings.length
    - typingsSlinky.jointjs.jointjsStrings.dx
    - typingsSlinky.jointjs.jointjsStrings.padding
    - typingsSlinky.jointjs.jointjsStrings.fallbackAt
    - typingsSlinky.jointjs.jointjsStrings.fixedAt
    - typingsSlinky.jointjs.jointjsStrings.dy
  */
  trait AnchorArguments extends StObject
  object AnchorArguments {
    
    @scala.inline
    def dx: typingsSlinky.jointjs.jointjsStrings.dx = "dx".asInstanceOf[typingsSlinky.jointjs.jointjsStrings.dx]
    
    @scala.inline
    def dy: typingsSlinky.jointjs.jointjsStrings.dy = "dy".asInstanceOf[typingsSlinky.jointjs.jointjsStrings.dy]
    
    @scala.inline
    def fallbackAt: typingsSlinky.jointjs.jointjsStrings.fallbackAt = "fallbackAt".asInstanceOf[typingsSlinky.jointjs.jointjsStrings.fallbackAt]
    
    @scala.inline
    def fixedAt: typingsSlinky.jointjs.jointjsStrings.fixedAt = "fixedAt".asInstanceOf[typingsSlinky.jointjs.jointjsStrings.fixedAt]
    
    @scala.inline
    def length: typingsSlinky.jointjs.jointjsStrings.length = "length".asInstanceOf[typingsSlinky.jointjs.jointjsStrings.length]
    
    @scala.inline
    def padding: typingsSlinky.jointjs.jointjsStrings.padding = "padding".asInstanceOf[typingsSlinky.jointjs.jointjsStrings.padding]
  }
  
  @js.native
  trait AnchorArgumentsMap
    extends /* key */ StringDictionary[StringDictionary[js.Any]] {
    
    var bottom: BBoxAnchorArguments = js.native
    
    var bottomLeft: BBoxAnchorArguments = js.native
    
    var bottomRight: BBoxAnchorArguments = js.native
    
    var center: BBoxAnchorArguments = js.native
    
    var connectionClosest: ConnectionClosestAnchorArguments = js.native
    
    var connectionLength: ConnectionLengthAnchorArguments = js.native
    
    var connectionPerpendicular: ConnectionPerpendicularAnchorArguments = js.native
    
    var connectionRatio: ConnectionLengthAnchorArguments = js.native
    
    var left: BBoxAnchorArguments = js.native
    
    var midSide: MidSideAnchorArguments = js.native
    
    var modelCenter: ModelCenterAnchorArguments = js.native
    
    var perpendicular: PaddingAnchorArguments = js.native
    
    var right: BBoxAnchorArguments = js.native
    
    var top: BBoxAnchorArguments = js.native
    
    var topLeft: BBoxAnchorArguments = js.native
    
    var topRight: BBoxAnchorArguments = js.native
  }
  object AnchorArgumentsMap {
    
    @scala.inline
    def apply(
      bottom: BBoxAnchorArguments,
      bottomLeft: BBoxAnchorArguments,
      bottomRight: BBoxAnchorArguments,
      center: BBoxAnchorArguments,
      connectionClosest: ConnectionClosestAnchorArguments,
      connectionLength: ConnectionLengthAnchorArguments,
      connectionPerpendicular: ConnectionPerpendicularAnchorArguments,
      connectionRatio: ConnectionLengthAnchorArguments,
      left: BBoxAnchorArguments,
      midSide: MidSideAnchorArguments,
      modelCenter: ModelCenterAnchorArguments,
      perpendicular: PaddingAnchorArguments,
      right: BBoxAnchorArguments,
      top: BBoxAnchorArguments,
      topLeft: BBoxAnchorArguments,
      topRight: BBoxAnchorArguments
    ): AnchorArgumentsMap = {
      val __obj = js.Dynamic.literal(bottom = bottom.asInstanceOf[js.Any], bottomLeft = bottomLeft.asInstanceOf[js.Any], bottomRight = bottomRight.asInstanceOf[js.Any], center = center.asInstanceOf[js.Any], connectionClosest = connectionClosest.asInstanceOf[js.Any], connectionLength = connectionLength.asInstanceOf[js.Any], connectionPerpendicular = connectionPerpendicular.asInstanceOf[js.Any], connectionRatio = connectionRatio.asInstanceOf[js.Any], left = left.asInstanceOf[js.Any], midSide = midSide.asInstanceOf[js.Any], modelCenter = modelCenter.asInstanceOf[js.Any], perpendicular = perpendicular.asInstanceOf[js.Any], right = right.asInstanceOf[js.Any], top = top.asInstanceOf[js.Any], topLeft = topLeft.asInstanceOf[js.Any], topRight = topRight.asInstanceOf[js.Any])
      __obj.asInstanceOf[AnchorArgumentsMap]
    }
    
    @scala.inline
    implicit class AnchorArgumentsMapMutableBuilder[Self <: AnchorArgumentsMap] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBottom(value: BBoxAnchorArguments): Self = StObject.set(x, "bottom", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBottomLeft(value: BBoxAnchorArguments): Self = StObject.set(x, "bottomLeft", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBottomRight(value: BBoxAnchorArguments): Self = StObject.set(x, "bottomRight", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCenter(value: BBoxAnchorArguments): Self = StObject.set(x, "center", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setConnectionClosest(value: ConnectionClosestAnchorArguments): Self = StObject.set(x, "connectionClosest", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setConnectionLength(value: ConnectionLengthAnchorArguments): Self = StObject.set(x, "connectionLength", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setConnectionPerpendicular(value: ConnectionPerpendicularAnchorArguments): Self = StObject.set(x, "connectionPerpendicular", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setConnectionRatio(value: ConnectionLengthAnchorArguments): Self = StObject.set(x, "connectionRatio", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLeft(value: BBoxAnchorArguments): Self = StObject.set(x, "left", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMidSide(value: MidSideAnchorArguments): Self = StObject.set(x, "midSide", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setModelCenter(value: ModelCenterAnchorArguments): Self = StObject.set(x, "modelCenter", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPerpendicular(value: PaddingAnchorArguments): Self = StObject.set(x, "perpendicular", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRight(value: BBoxAnchorArguments): Self = StObject.set(x, "right", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTop(value: BBoxAnchorArguments): Self = StObject.set(x, "top", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTopLeft(value: BBoxAnchorArguments): Self = StObject.set(x, "topLeft", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTopRight(value: BBoxAnchorArguments): Self = StObject.set(x, "topRight", value.asInstanceOf[js.Any])
    }
  }
  
  type AnchorJSON = GenericAnchorJSON[AnchorType]
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.jointjs.jointjsStrings.center
    - typingsSlinky.jointjs.jointjsStrings.top
    - typingsSlinky.jointjs.jointjsStrings.bottom
    - typingsSlinky.jointjs.jointjsStrings.left
    - typingsSlinky.jointjs.jointjsStrings.right
    - typingsSlinky.jointjs.jointjsStrings.topLeft
    - typingsSlinky.jointjs.jointjsStrings.topRight
    - typingsSlinky.jointjs.jointjsStrings.bottomLeft
    - typingsSlinky.jointjs.jointjsStrings.bottomRight
    - typingsSlinky.jointjs.jointjsStrings.perpendicular
    - typingsSlinky.jointjs.jointjsStrings.midSide
    - typingsSlinky.jointjs.jointjsStrings.modelCenter
    - typingsSlinky.jointjs.jointjsStrings.connectionRatio
    - typingsSlinky.jointjs.jointjsStrings.connectionLength
    - typingsSlinky.jointjs.jointjsStrings.connectionPerpendicular
    - typingsSlinky.jointjs.jointjsStrings.connectionClosest
  */
  trait AnchorType extends StObject
  
  @js.native
  trait BBoxAnchorArguments extends RotateAnchorArguments {
    
    var dx: js.UndefOr[Double | String] = js.native
    
    var dy: js.UndefOr[Double | String] = js.native
  }
  object BBoxAnchorArguments {
    
    @scala.inline
    def apply(): BBoxAnchorArguments = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[BBoxAnchorArguments]
    }
    
    @scala.inline
    implicit class BBoxAnchorArgumentsMutableBuilder[Self <: BBoxAnchorArguments] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDx(value: Double | String): Self = StObject.set(x, "dx", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDxUndefined: Self = StObject.set(x, "dx", js.undefined)
      
      @scala.inline
      def setDy(value: Double | String): Self = StObject.set(x, "dy", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDyUndefined: Self = StObject.set(x, "dy", js.undefined)
    }
  }
  
  type GenericAnchor[K /* <: AnchorType */] = js.Function4[
    /* endView */ CellView, 
    /* endMagnet */ SVGElement, 
    /* anchorReference */ Point | SVGElement, 
    /* import warning: importer.ImportType#apply Failed type conversion: jointjs.jointjs.anchors.AnchorArgumentsMap[K] */ /* opt */ js.Any, 
    Point
  ]
  
  type GenericAnchorArguments[K /* <: AnchorType */] = /* import warning: importer.ImportType#apply Failed type conversion: jointjs.jointjs.anchors.AnchorArgumentsMap[K] */ js.Any
  
  @js.native
  trait GenericAnchorJSON[K /* <: AnchorType */] extends StObject {
    
    var args: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: jointjs.jointjs.anchors.AnchorArgumentsMap[K] */ js.Any
      ] = js.native
    
    var name: K = js.native
  }
  object GenericAnchorJSON {
    
    @scala.inline
    def apply[K /* <: AnchorType */](name: K): GenericAnchorJSON[K] = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[GenericAnchorJSON[K]]
    }
    
    @scala.inline
    implicit class GenericAnchorJSONMutableBuilder[Self <: GenericAnchorJSON[_], K /* <: AnchorType */] (val x: Self with GenericAnchorJSON[K]) extends AnyVal {
      
      @scala.inline
      def setArgs(
        value: /* import warning: importer.ImportType#apply Failed type conversion: jointjs.jointjs.anchors.AnchorArgumentsMap[K] */ js.Any
      ): Self = StObject.set(x, "args", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setArgsUndefined: Self = StObject.set(x, "args", js.undefined)
      
      @scala.inline
      def setName(value: K): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait MidSideAnchorArguments
    extends RotateAnchorArguments
       with PaddingAnchorArguments
  object MidSideAnchorArguments {
    
    @scala.inline
    def apply(): MidSideAnchorArguments = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[MidSideAnchorArguments]
    }
  }
  
  @js.native
  trait ModelCenterAnchorArguments extends StObject {
    
    var dx: js.UndefOr[Double] = js.native
    
    var dy: js.UndefOr[Double] = js.native
  }
  object ModelCenterAnchorArguments {
    
    @scala.inline
    def apply(): ModelCenterAnchorArguments = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ModelCenterAnchorArguments]
    }
    
    @scala.inline
    implicit class ModelCenterAnchorArgumentsMutableBuilder[Self <: ModelCenterAnchorArguments] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDx(value: Double): Self = StObject.set(x, "dx", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDxUndefined: Self = StObject.set(x, "dx", js.undefined)
      
      @scala.inline
      def setDy(value: Double): Self = StObject.set(x, "dy", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDyUndefined: Self = StObject.set(x, "dy", js.undefined)
    }
  }
  
  @js.native
  trait PaddingAnchorArguments extends StObject {
    
    var padding: js.UndefOr[Double] = js.native
  }
  object PaddingAnchorArguments {
    
    @scala.inline
    def apply(): PaddingAnchorArguments = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PaddingAnchorArguments]
    }
    
    @scala.inline
    implicit class PaddingAnchorArgumentsMutableBuilder[Self <: PaddingAnchorArguments] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setPadding(value: Double): Self = StObject.set(x, "padding", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPaddingUndefined: Self = StObject.set(x, "padding", js.undefined)
    }
  }
  
  @js.native
  trait RotateAnchorArguments extends StObject {
    
    var rotate: js.UndefOr[Boolean] = js.native
  }
  object RotateAnchorArguments {
    
    @scala.inline
    def apply(): RotateAnchorArguments = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[RotateAnchorArguments]
    }
    
    @scala.inline
    implicit class RotateAnchorArgumentsMutableBuilder[Self <: RotateAnchorArguments] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setRotate(value: Boolean): Self = StObject.set(x, "rotate", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRotateUndefined: Self = StObject.set(x, "rotate", js.undefined)
    }
  }
}
