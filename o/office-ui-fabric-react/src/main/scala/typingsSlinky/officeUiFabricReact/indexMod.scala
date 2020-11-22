package typingsSlinky.officeUiFabricReact

import org.scalajs.dom.raw.Element
import org.scalajs.dom.raw.HTMLElement
import org.scalajs.dom.raw.MouseEvent
import typingsSlinky.officeUiFabricReact.directionalHintMod.DirectionalHint
import typingsSlinky.officeUiFabricReact.positioningTypesMod.ICalloutPositionedInfo
import typingsSlinky.officeUiFabricReact.positioningTypesMod.IPositionProps
import typingsSlinky.officeUiFabricReact.positioningTypesMod.IPositionedData
import typingsSlinky.officeUiFabricReact.positioningTypesMod.IWindowWithSegments
import typingsSlinky.officeUiFabricReact.positioningTypesMod.RectangleEdge
import typingsSlinky.uifabricUtilities.irectangleMod.IRectangle
import typingsSlinky.uifabricUtilities.pointMod.Point
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("office-ui-fabric-react/lib/utilities/positioning/index", JSImport.Namespace)
@js.native
object indexMod extends js.Object {
  
  def getBoundsFromTargetWindow(target: Null, targetWindow: IWindowWithSegments): IRectangle = js.native
  def getBoundsFromTargetWindow(target: Element, targetWindow: IWindowWithSegments): IRectangle = js.native
  def getBoundsFromTargetWindow(target: MouseEvent, targetWindow: IWindowWithSegments): IRectangle = js.native
  def getBoundsFromTargetWindow(target: Point, targetWindow: IWindowWithSegments): IRectangle = js.native
  
  def getMaxHeight(target: Element, targetEdge: DirectionalHint): Double = js.native
  def getMaxHeight(
    target: Element,
    targetEdge: DirectionalHint,
    gapSpace: js.UndefOr[scala.Nothing],
    bounds: js.UndefOr[scala.Nothing],
    coverTarget: Boolean
  ): Double = js.native
  def getMaxHeight(
    target: Element,
    targetEdge: DirectionalHint,
    gapSpace: js.UndefOr[scala.Nothing],
    bounds: IRectangle
  ): Double = js.native
  def getMaxHeight(
    target: Element,
    targetEdge: DirectionalHint,
    gapSpace: js.UndefOr[scala.Nothing],
    bounds: IRectangle,
    coverTarget: Boolean
  ): Double = js.native
  def getMaxHeight(target: Element, targetEdge: DirectionalHint, gapSpace: Double): Double = js.native
  def getMaxHeight(
    target: Element,
    targetEdge: DirectionalHint,
    gapSpace: Double,
    bounds: js.UndefOr[scala.Nothing],
    coverTarget: Boolean
  ): Double = js.native
  def getMaxHeight(target: Element, targetEdge: DirectionalHint, gapSpace: Double, bounds: IRectangle): Double = js.native
  def getMaxHeight(
    target: Element,
    targetEdge: DirectionalHint,
    gapSpace: Double,
    bounds: IRectangle,
    coverTarget: Boolean
  ): Double = js.native
  def getMaxHeight(target: MouseEvent, targetEdge: DirectionalHint): Double = js.native
  def getMaxHeight(
    target: MouseEvent,
    targetEdge: DirectionalHint,
    gapSpace: js.UndefOr[scala.Nothing],
    bounds: js.UndefOr[scala.Nothing],
    coverTarget: Boolean
  ): Double = js.native
  def getMaxHeight(
    target: MouseEvent,
    targetEdge: DirectionalHint,
    gapSpace: js.UndefOr[scala.Nothing],
    bounds: IRectangle
  ): Double = js.native
  def getMaxHeight(
    target: MouseEvent,
    targetEdge: DirectionalHint,
    gapSpace: js.UndefOr[scala.Nothing],
    bounds: IRectangle,
    coverTarget: Boolean
  ): Double = js.native
  def getMaxHeight(target: MouseEvent, targetEdge: DirectionalHint, gapSpace: Double): Double = js.native
  def getMaxHeight(
    target: MouseEvent,
    targetEdge: DirectionalHint,
    gapSpace: Double,
    bounds: js.UndefOr[scala.Nothing],
    coverTarget: Boolean
  ): Double = js.native
  def getMaxHeight(target: MouseEvent, targetEdge: DirectionalHint, gapSpace: Double, bounds: IRectangle): Double = js.native
  def getMaxHeight(
    target: MouseEvent,
    targetEdge: DirectionalHint,
    gapSpace: Double,
    bounds: IRectangle,
    coverTarget: Boolean
  ): Double = js.native
  def getMaxHeight(target: Point, targetEdge: DirectionalHint): Double = js.native
  def getMaxHeight(
    target: Point,
    targetEdge: DirectionalHint,
    gapSpace: js.UndefOr[scala.Nothing],
    bounds: js.UndefOr[scala.Nothing],
    coverTarget: Boolean
  ): Double = js.native
  def getMaxHeight(
    target: Point,
    targetEdge: DirectionalHint,
    gapSpace: js.UndefOr[scala.Nothing],
    bounds: IRectangle
  ): Double = js.native
  def getMaxHeight(
    target: Point,
    targetEdge: DirectionalHint,
    gapSpace: js.UndefOr[scala.Nothing],
    bounds: IRectangle,
    coverTarget: Boolean
  ): Double = js.native
  def getMaxHeight(target: Point, targetEdge: DirectionalHint, gapSpace: Double): Double = js.native
  def getMaxHeight(
    target: Point,
    targetEdge: DirectionalHint,
    gapSpace: Double,
    bounds: js.UndefOr[scala.Nothing],
    coverTarget: Boolean
  ): Double = js.native
  def getMaxHeight(target: Point, targetEdge: DirectionalHint, gapSpace: Double, bounds: IRectangle): Double = js.native
  def getMaxHeight(
    target: Point,
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
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsSlinky.officeUiFabricReact.positioningTypesMod.Position with Double] = js.native
    
    /* 1 */ val bottom: typingsSlinky.officeUiFabricReact.positioningTypesMod.Position.bottom with Double = js.native
    
    /* 3 */ val end: typingsSlinky.officeUiFabricReact.positioningTypesMod.Position.end with Double = js.native
    
    /* 2 */ val start: typingsSlinky.officeUiFabricReact.positioningTypesMod.Position.start with Double = js.native
    
    /* 0 */ val top: typingsSlinky.officeUiFabricReact.positioningTypesMod.Position.top with Double = js.native
  }
  
  @js.native
  object RectangleEdge extends js.Object {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsSlinky.officeUiFabricReact.positioningTypesMod.RectangleEdge with Double] = js.native
    
    /* -1 */ val bottom: typingsSlinky.officeUiFabricReact.positioningTypesMod.RectangleEdge.bottom with Double = js.native
    
    /* 2 */ val left: typingsSlinky.officeUiFabricReact.positioningTypesMod.RectangleEdge.left with Double = js.native
    
    /* -2 */ val right: typingsSlinky.officeUiFabricReact.positioningTypesMod.RectangleEdge.right with Double = js.native
    
    /* 1 */ val top: typingsSlinky.officeUiFabricReact.positioningTypesMod.RectangleEdge.top with Double = js.native
  }
}
