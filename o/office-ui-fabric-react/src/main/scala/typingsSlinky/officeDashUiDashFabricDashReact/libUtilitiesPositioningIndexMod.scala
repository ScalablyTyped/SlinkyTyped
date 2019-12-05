package typingsSlinky.officeDashUiDashFabricDashReact

import org.scalajs.dom.raw.HTMLElement
import typingsSlinky.atUifabricUtilities.libIRectangleMod.IRectangle
import typingsSlinky.officeDashUiDashFabricDashReact.libCommonDirectionalHintMod.DirectionalHint
import typingsSlinky.officeDashUiDashFabricDashReact.libUtilitiesPositioningPositioningDotTypesMod.ICalloutBeakPositionedInfo
import typingsSlinky.officeDashUiDashFabricDashReact.libUtilitiesPositioningPositioningDotTypesMod.ICalloutPositionedInfo
import typingsSlinky.officeDashUiDashFabricDashReact.libUtilitiesPositioningPositioningDotTypesMod.IPoint
import typingsSlinky.officeDashUiDashFabricDashReact.libUtilitiesPositioningPositioningDotTypesMod.IPositionDirectionalHintData
import typingsSlinky.officeDashUiDashFabricDashReact.libUtilitiesPositioningPositioningDotTypesMod.IPositionProps
import typingsSlinky.officeDashUiDashFabricDashReact.libUtilitiesPositioningPositioningDotTypesMod.IPositionedData
import typingsSlinky.officeDashUiDashFabricDashReact.libUtilitiesPositioningPositioningDotTypesMod.RectangleEdge
import typingsSlinky.officeDashUiDashFabricDashReact.libUtilitiesPositioningPositioningMod.IElementPosition
import typingsSlinky.officeDashUiDashFabricDashReact.libUtilitiesPositioningPositioningMod.IElementPositionInfo
import typingsSlinky.std.Element
import typingsSlinky.std.MouseEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("office-ui-fabric-react/lib/utilities/positioning/index", JSImport.Namespace)
@js.native
object libUtilitiesPositioningIndexMod extends js.Object {
  @js.native
  class Rectangle ()
    extends typingsSlinky.officeDashUiDashFabricDashReact.libUtilitiesPositioningPositioningMod.Rectangle
  
  def getMaxHeight(target: IPoint, targetEdge: DirectionalHint): Double = js.native
  def getMaxHeight(target: IPoint, targetEdge: DirectionalHint, gapSpace: Double): Double = js.native
  def getMaxHeight(target: IPoint, targetEdge: DirectionalHint, gapSpace: Double, bounds: IRectangle): Double = js.native
  def getMaxHeight(
    target: IPoint,
    targetEdge: DirectionalHint,
    gapSpace: Double,
    bounds: IRectangle,
    coverTarget: Boolean
  ): Double = js.native
  def getMaxHeight(target: Element, targetEdge: DirectionalHint): Double = js.native
  def getMaxHeight(target: Element, targetEdge: DirectionalHint, gapSpace: Double): Double = js.native
  def getMaxHeight(target: Element, targetEdge: DirectionalHint, gapSpace: Double, bounds: IRectangle): Double = js.native
  def getMaxHeight(
    target: Element,
    targetEdge: DirectionalHint,
    gapSpace: Double,
    bounds: IRectangle,
    coverTarget: Boolean
  ): Double = js.native
  def getMaxHeight(target: MouseEvent, targetEdge: DirectionalHint): Double = js.native
  def getMaxHeight(target: MouseEvent, targetEdge: DirectionalHint, gapSpace: Double): Double = js.native
  def getMaxHeight(target: MouseEvent, targetEdge: DirectionalHint, gapSpace: Double, bounds: IRectangle): Double = js.native
  def getMaxHeight(
    target: MouseEvent,
    targetEdge: DirectionalHint,
    gapSpace: Double,
    bounds: IRectangle,
    coverTarget: Boolean
  ): Double = js.native
  def getOppositeEdge(edge: RectangleEdge): RectangleEdge = js.native
  def positionCallout(props: IPositionProps, hostElement: HTMLElement, elementToPosition: HTMLElement): ICalloutPositionedInfo = js.native
  def positionCallout(
    props: IPositionProps,
    hostElement: HTMLElement,
    elementToPosition: HTMLElement,
    previousPositions: ICalloutPositionedInfo
  ): ICalloutPositionedInfo = js.native
  def positionCard(props: IPositionProps, hostElement: HTMLElement, elementToPosition: HTMLElement): ICalloutPositionedInfo = js.native
  def positionCard(
    props: IPositionProps,
    hostElement: HTMLElement,
    elementToPosition: HTMLElement,
    previousPositions: ICalloutPositionedInfo
  ): ICalloutPositionedInfo = js.native
  def positionElement(props: IPositionProps, hostElement: HTMLElement, elementToPosition: HTMLElement): IPositionedData = js.native
  def positionElement(
    props: IPositionProps,
    hostElement: HTMLElement,
    elementToPosition: HTMLElement,
    previousPositions: IPositionedData
  ): IPositionedData = js.native
  @js.native
  object Position extends js.Object {
    /* 1 */ val bottom: typingsSlinky.officeDashUiDashFabricDashReact.libUtilitiesPositioningPositioningDotTypesMod.Position.bottom with Double = js.native
    /* 3 */ val end: typingsSlinky.officeDashUiDashFabricDashReact.libUtilitiesPositioningPositioningDotTypesMod.Position.end with Double = js.native
    /* 2 */ val start: typingsSlinky.officeDashUiDashFabricDashReact.libUtilitiesPositioningPositioningDotTypesMod.Position.start with Double = js.native
    /* 0 */ val top: typingsSlinky.officeDashUiDashFabricDashReact.libUtilitiesPositioningPositioningDotTypesMod.Position.top with Double = js.native
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[
        typingsSlinky.officeDashUiDashFabricDashReact.libUtilitiesPositioningPositioningDotTypesMod.Position with Double
      ] = js.native
  }
  
  @js.native
  object RectangleEdge extends js.Object {
    /* -1 */ val bottom: typingsSlinky.officeDashUiDashFabricDashReact.libUtilitiesPositioningPositioningDotTypesMod.RectangleEdge.bottom with Double = js.native
    /* 2 */ val left: typingsSlinky.officeDashUiDashFabricDashReact.libUtilitiesPositioningPositioningDotTypesMod.RectangleEdge.left with Double = js.native
    /* -2 */ val right: typingsSlinky.officeDashUiDashFabricDashReact.libUtilitiesPositioningPositioningDotTypesMod.RectangleEdge.right with Double = js.native
    /* 1 */ val top: typingsSlinky.officeDashUiDashFabricDashReact.libUtilitiesPositioningPositioningDotTypesMod.RectangleEdge.top with Double = js.native
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[
        typingsSlinky.officeDashUiDashFabricDashReact.libUtilitiesPositioningPositioningDotTypesMod.RectangleEdge with Double
      ] = js.native
  }
  
  @js.native
  object __positioningTestPackage extends js.Object {
    var _calculateActualBeakWidthInPixels: js.Function1[/* beakWidth */ Double, Double] = js.native
    var _finalizeBeakPosition: js.Function3[
        /* elementPosition */ IElementPosition, 
        /* positionedBeak */ typingsSlinky.officeDashUiDashFabricDashReact.libUtilitiesPositioningPositioningMod.Rectangle, 
        /* bounds */ js.UndefOr[
          typingsSlinky.officeDashUiDashFabricDashReact.libUtilitiesPositioningPositioningMod.Rectangle
        ], 
        ICalloutBeakPositionedInfo
      ] = js.native
    var _finalizePositionData: js.Function5[
        /* positionedElement */ IElementPosition, 
        /* hostElement */ HTMLElement, 
        /* bounds */ js.UndefOr[
          typingsSlinky.officeDashUiDashFabricDashReact.libUtilitiesPositioningPositioningMod.Rectangle
        ], 
        /* coverTarget */ js.UndefOr[Boolean], 
        /* doNotFinalizeReturnEdge */ js.UndefOr[Boolean], 
        IPositionedData
      ] = js.native
    var _getMaxHeightFromTargetRectangle: js.Function5[
        /* targetRectangle */ typingsSlinky.officeDashUiDashFabricDashReact.libUtilitiesPositioningPositioningMod.Rectangle, 
        /* targetEdge */ DirectionalHint, 
        /* gapSpace */ Double, 
        /* bounds */ typingsSlinky.officeDashUiDashFabricDashReact.libUtilitiesPositioningPositioningMod.Rectangle, 
        /* coverTarget */ js.UndefOr[Boolean], 
        Double
      ] = js.native
    var _getPositionData: js.Function3[
        /* directionalHint */ js.UndefOr[DirectionalHint], 
        /* directionalHintForRTL */ js.UndefOr[DirectionalHint], 
        /* previousPositions */ js.UndefOr[IPositionDirectionalHintData], 
        IPositionDirectionalHintData
      ] = js.native
    var _positionBeak: js.Function2[
        /* beakWidth */ Double, 
        /* elementPosition */ IElementPositionInfo, 
        typingsSlinky.officeDashUiDashFabricDashReact.libUtilitiesPositioningPositioningMod.Rectangle
      ] = js.native
    var _positionElementWithinBounds: js.Function7[
        /* elementToPosition */ typingsSlinky.officeDashUiDashFabricDashReact.libUtilitiesPositioningPositioningMod.Rectangle, 
        /* target */ typingsSlinky.officeDashUiDashFabricDashReact.libUtilitiesPositioningPositioningMod.Rectangle, 
        /* bounding */ typingsSlinky.officeDashUiDashFabricDashReact.libUtilitiesPositioningPositioningMod.Rectangle, 
        /* positionData */ IPositionDirectionalHintData, 
        /* gap */ Double, 
        /* directionalHintFixed */ js.UndefOr[Boolean], 
        /* coverTarget */ js.UndefOr[Boolean], 
        IElementPosition
      ] = js.native
  }
  
}

