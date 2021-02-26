package typingsSlinky.officeUiFabricReact

import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.raw.Element
import org.scalajs.dom.raw.MouseEvent
import typingsSlinky.officeUiFabricReact.directionalHintMod.DirectionalHint
import typingsSlinky.std.DOMRect
import typingsSlinky.std.Window
import typingsSlinky.uifabricUtilities.irectangleMod.IRectangle
import typingsSlinky.uifabricUtilities.pointMod.Point
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object positioningTypesMod {
  
  @js.native
  sealed trait Position extends StObject
  @JSImport("office-ui-fabric-react/lib/utilities/positioning/positioning.types", "Position")
  @js.native
  object Position extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[Position with Double] = js.native
    
    @js.native
    sealed trait bottom extends Position
    /* 1 */ val bottom: typingsSlinky.officeUiFabricReact.positioningTypesMod.Position.bottom with Double = js.native
    
    @js.native
    sealed trait end extends Position
    /* 3 */ val end: typingsSlinky.officeUiFabricReact.positioningTypesMod.Position.end with Double = js.native
    
    @js.native
    sealed trait start extends Position
    /* 2 */ val start: typingsSlinky.officeUiFabricReact.positioningTypesMod.Position.start with Double = js.native
    
    @js.native
    sealed trait top extends Position
    /* 0 */ val top: typingsSlinky.officeUiFabricReact.positioningTypesMod.Position.top with Double = js.native
  }
  
  @js.native
  sealed trait RectangleEdge extends StObject
  @JSImport("office-ui-fabric-react/lib/utilities/positioning/positioning.types", "RectangleEdge")
  @js.native
  object RectangleEdge extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[RectangleEdge with Double] = js.native
    
    @js.native
    sealed trait bottom extends RectangleEdge
    /* -1 */ val bottom: typingsSlinky.officeUiFabricReact.positioningTypesMod.RectangleEdge.bottom with Double = js.native
    
    @js.native
    sealed trait left extends RectangleEdge
    /* 2 */ val left: typingsSlinky.officeUiFabricReact.positioningTypesMod.RectangleEdge.left with Double = js.native
    
    @js.native
    sealed trait right extends RectangleEdge
    /* -2 */ val right: typingsSlinky.officeUiFabricReact.positioningTypesMod.RectangleEdge.right with Double = js.native
    
    @js.native
    sealed trait top extends RectangleEdge
    /* 1 */ val top: typingsSlinky.officeUiFabricReact.positioningTypesMod.RectangleEdge.top with Double = js.native
  }
  
  @js.native
  trait ICalloutBeakPositionedInfo extends IPositionedData {
    
    var closestEdge: RectangleEdge = js.native
  }
  object ICalloutBeakPositionedInfo {
    
    @scala.inline
    def apply(closestEdge: RectangleEdge, elementPosition: IPosition, targetEdge: RectangleEdge): ICalloutBeakPositionedInfo = {
      val __obj = js.Dynamic.literal(closestEdge = closestEdge.asInstanceOf[js.Any], elementPosition = elementPosition.asInstanceOf[js.Any], targetEdge = targetEdge.asInstanceOf[js.Any])
      __obj.asInstanceOf[ICalloutBeakPositionedInfo]
    }
    
    @scala.inline
    implicit class ICalloutBeakPositionedInfoMutableBuilder[Self <: ICalloutBeakPositionedInfo] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setClosestEdge(value: RectangleEdge): Self = StObject.set(x, "closestEdge", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait ICalloutPositionProps extends IPositionProps {
    
    /**
      * The width of the beak.
      */
    var beakWidth: js.UndefOr[Double] = js.native
    
    /**
      * Whether or not the beak is visible
      */
    var isBeakVisible: js.UndefOr[Boolean] = js.native
  }
  object ICalloutPositionProps {
    
    @scala.inline
    def apply(): ICalloutPositionProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ICalloutPositionProps]
    }
    
    @scala.inline
    implicit class ICalloutPositionPropsMutableBuilder[Self <: ICalloutPositionProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBeakWidth(value: Double): Self = StObject.set(x, "beakWidth", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBeakWidthUndefined: Self = StObject.set(x, "beakWidth", js.undefined)
      
      @scala.inline
      def setIsBeakVisible(value: Boolean): Self = StObject.set(x, "isBeakVisible", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsBeakVisibleUndefined: Self = StObject.set(x, "isBeakVisible", js.undefined)
    }
  }
  
  @js.native
  trait ICalloutPositionedInfo extends IPositionedData {
    
    var beakPosition: ICalloutBeakPositionedInfo = js.native
  }
  object ICalloutPositionedInfo {
    
    @scala.inline
    def apply(beakPosition: ICalloutBeakPositionedInfo, elementPosition: IPosition, targetEdge: RectangleEdge): ICalloutPositionedInfo = {
      val __obj = js.Dynamic.literal(beakPosition = beakPosition.asInstanceOf[js.Any], elementPosition = elementPosition.asInstanceOf[js.Any], targetEdge = targetEdge.asInstanceOf[js.Any])
      __obj.asInstanceOf[ICalloutPositionedInfo]
    }
    
    @scala.inline
    implicit class ICalloutPositionedInfoMutableBuilder[Self <: ICalloutPositionedInfo] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBeakPosition(value: ICalloutBeakPositionedInfo): Self = StObject.set(x, "beakPosition", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait IPosition
    extends /* key */ StringDictionary[js.UndefOr[Double]] {
    
    var bottom: js.UndefOr[Double] = js.native
    
    var left: js.UndefOr[Double] = js.native
    
    var right: js.UndefOr[Double] = js.native
    
    var top: js.UndefOr[Double] = js.native
  }
  object IPosition {
    
    @scala.inline
    def apply(): IPosition = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IPosition]
    }
    
    @scala.inline
    implicit class IPositionMutableBuilder[Self <: IPosition] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBottom(value: Double): Self = StObject.set(x, "bottom", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBottomUndefined: Self = StObject.set(x, "bottom", js.undefined)
      
      @scala.inline
      def setLeft(value: Double): Self = StObject.set(x, "left", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLeftUndefined: Self = StObject.set(x, "left", js.undefined)
      
      @scala.inline
      def setRight(value: Double): Self = StObject.set(x, "right", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRightUndefined: Self = StObject.set(x, "right", js.undefined)
      
      @scala.inline
      def setTop(value: Double): Self = StObject.set(x, "top", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTopUndefined: Self = StObject.set(x, "top", js.undefined)
    }
  }
  
  @js.native
  trait IPositionDirectionalHintData extends StObject {
    
    var alignTargetEdge: js.UndefOr[Boolean] = js.native
    
    var alignmentEdge: js.UndefOr[RectangleEdge] = js.native
    
    var isAuto: js.UndefOr[Boolean] = js.native
    
    var targetEdge: RectangleEdge = js.native
  }
  object IPositionDirectionalHintData {
    
    @scala.inline
    def apply(targetEdge: RectangleEdge): IPositionDirectionalHintData = {
      val __obj = js.Dynamic.literal(targetEdge = targetEdge.asInstanceOf[js.Any])
      __obj.asInstanceOf[IPositionDirectionalHintData]
    }
    
    @scala.inline
    implicit class IPositionDirectionalHintDataMutableBuilder[Self <: IPositionDirectionalHintData] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAlignTargetEdge(value: Boolean): Self = StObject.set(x, "alignTargetEdge", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAlignTargetEdgeUndefined: Self = StObject.set(x, "alignTargetEdge", js.undefined)
      
      @scala.inline
      def setAlignmentEdge(value: RectangleEdge): Self = StObject.set(x, "alignmentEdge", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAlignmentEdgeUndefined: Self = StObject.set(x, "alignmentEdge", js.undefined)
      
      @scala.inline
      def setIsAuto(value: Boolean): Self = StObject.set(x, "isAuto", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsAutoUndefined: Self = StObject.set(x, "isAuto", js.undefined)
      
      @scala.inline
      def setTargetEdge(value: RectangleEdge): Self = StObject.set(x, "targetEdge", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait IPositionProps extends StObject {
    
    /**
      * If true the positioning logic will prefer flipping edges over nudging the rectangle to fit within bounds,
      * thus making sure the element align perfectly with target.
      */
    var alignTargetEdge: js.UndefOr[Boolean] = js.native
    
    /**
      * The bounding rectangle for which  the contextual menu can appear in.
      */
    var bounds: js.UndefOr[IRectangle] = js.native
    
    /**
      * If true the position returned will have the menu element cover the target.
      * If false then it will position next to the target;
      */
    var coverTarget: js.UndefOr[Boolean] = js.native
    
    /** how the element should be positioned */
    var directionalHint: js.UndefOr[DirectionalHint] = js.native
    
    /**
      * If true the position will not change edges in an attempt to fit the rectangle within bounds.
      * It will still attempt to align it to whatever bounds are given.
      * @defaultvalue false
      */
    var directionalHintFixed: js.UndefOr[Boolean] = js.native
    
    /**
      * How the element should be positioned in RTL layouts.
      * If not specified, a mirror of `directionalHint` will be used instead
      */
    var directionalHintForRTL: js.UndefOr[DirectionalHint] = js.native
    
    /** The gap between the callout and the target */
    var gapSpace: js.UndefOr[Double] = js.native
    
    var target: js.UndefOr[Element | MouseEvent | Point] = js.native
  }
  object IPositionProps {
    
    @scala.inline
    def apply(): IPositionProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IPositionProps]
    }
    
    @scala.inline
    implicit class IPositionPropsMutableBuilder[Self <: IPositionProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAlignTargetEdge(value: Boolean): Self = StObject.set(x, "alignTargetEdge", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAlignTargetEdgeUndefined: Self = StObject.set(x, "alignTargetEdge", js.undefined)
      
      @scala.inline
      def setBounds(value: IRectangle): Self = StObject.set(x, "bounds", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBoundsUndefined: Self = StObject.set(x, "bounds", js.undefined)
      
      @scala.inline
      def setCoverTarget(value: Boolean): Self = StObject.set(x, "coverTarget", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCoverTargetUndefined: Self = StObject.set(x, "coverTarget", js.undefined)
      
      @scala.inline
      def setDirectionalHint(value: DirectionalHint): Self = StObject.set(x, "directionalHint", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDirectionalHintFixed(value: Boolean): Self = StObject.set(x, "directionalHintFixed", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDirectionalHintFixedUndefined: Self = StObject.set(x, "directionalHintFixed", js.undefined)
      
      @scala.inline
      def setDirectionalHintForRTL(value: DirectionalHint): Self = StObject.set(x, "directionalHintForRTL", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDirectionalHintForRTLUndefined: Self = StObject.set(x, "directionalHintForRTL", js.undefined)
      
      @scala.inline
      def setDirectionalHintUndefined: Self = StObject.set(x, "directionalHint", js.undefined)
      
      @scala.inline
      def setGapSpace(value: Double): Self = StObject.set(x, "gapSpace", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGapSpaceUndefined: Self = StObject.set(x, "gapSpace", js.undefined)
      
      @scala.inline
      def setTarget(value: Element | MouseEvent | Point): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTargetElement(value: Element): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTargetMouseEvent(value: MouseEvent): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTargetUndefined: Self = StObject.set(x, "target", js.undefined)
    }
  }
  
  @js.native
  trait IPositionedData extends StObject {
    
    /**
      * The finalized alignment edge that the element is aligning too. For instance, RectangleEdge.left means
      * that the left edge of the target should be in line with the left edge of the element being positioned.
      */
    var alignmentEdge: js.UndefOr[RectangleEdge] = js.native
    
    /**
      * The new position of the element.
      */
    var elementPosition: IPosition = js.native
    
    /**
      * The finalized target edge that element is aligning to. For instance RectangleEdge.bottom would mean
      * that the bottom edge of the target is being aligned to by the RectangleEdge.top of the element
      * that is being positioned.
      */
    var targetEdge: RectangleEdge = js.native
  }
  object IPositionedData {
    
    @scala.inline
    def apply(elementPosition: IPosition, targetEdge: RectangleEdge): IPositionedData = {
      val __obj = js.Dynamic.literal(elementPosition = elementPosition.asInstanceOf[js.Any], targetEdge = targetEdge.asInstanceOf[js.Any])
      __obj.asInstanceOf[IPositionedData]
    }
    
    @scala.inline
    implicit class IPositionedDataMutableBuilder[Self <: IPositionedData] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAlignmentEdge(value: RectangleEdge): Self = StObject.set(x, "alignmentEdge", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAlignmentEdgeUndefined: Self = StObject.set(x, "alignmentEdge", js.undefined)
      
      @scala.inline
      def setElementPosition(value: IPosition): Self = StObject.set(x, "elementPosition", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTargetEdge(value: RectangleEdge): Self = StObject.set(x, "targetEdge", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait IRelativePositions extends StObject {
    
    var beakPosition: typingsSlinky.officeUiFabricReact.anon.Position = js.native
    
    var calloutPosition: IPosition = js.native
    
    var directionalClassName: String = js.native
    
    var submenuDirection: DirectionalHint = js.native
  }
  object IRelativePositions {
    
    @scala.inline
    def apply(
      beakPosition: typingsSlinky.officeUiFabricReact.anon.Position,
      calloutPosition: IPosition,
      directionalClassName: String,
      submenuDirection: DirectionalHint
    ): IRelativePositions = {
      val __obj = js.Dynamic.literal(beakPosition = beakPosition.asInstanceOf[js.Any], calloutPosition = calloutPosition.asInstanceOf[js.Any], directionalClassName = directionalClassName.asInstanceOf[js.Any], submenuDirection = submenuDirection.asInstanceOf[js.Any])
      __obj.asInstanceOf[IRelativePositions]
    }
    
    @scala.inline
    implicit class IRelativePositionsMutableBuilder[Self <: IRelativePositions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBeakPosition(value: typingsSlinky.officeUiFabricReact.anon.Position): Self = StObject.set(x, "beakPosition", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCalloutPosition(value: IPosition): Self = StObject.set(x, "calloutPosition", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDirectionalClassName(value: String): Self = StObject.set(x, "directionalClassName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSubmenuDirection(value: DirectionalHint): Self = StObject.set(x, "submenuDirection", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait IWindowWithSegments extends Window {
    
    var getWindowSegments: js.UndefOr[js.Function0[js.Array[DOMRect]]] = js.native
  }
}
