package typingsSlinky.reactKonva.components

import org.scalajs.dom.raw.DragEvent
import org.scalajs.dom.raw.Event
import org.scalajs.dom.raw.HTMLImageElement
import org.scalajs.dom.raw.MouseEvent
import org.scalajs.dom.raw.PointerEvent
import org.scalajs.dom.raw.TouchEvent
import org.scalajs.dom.raw.WheelEvent
import slinky.web.html.img.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.konva.contextMod.Context
import typingsSlinky.konva.mod.Konva.KonvaEventObject
import typingsSlinky.konva.nodeMod.Filter
import typingsSlinky.konva.nodeMod.Node
import typingsSlinky.konva.nodeMod.globalCompositeOperationType
import typingsSlinky.konva.ringMod.RingConfig
import typingsSlinky.konva.shapeMod.LineCap
import typingsSlinky.konva.shapeMod.LineJoin
import typingsSlinky.konva.typesMod.Vector2d
import typingsSlinky.react.mod.ClassAttributes
import typingsSlinky.reactKonva.reactKonvaCoreMod.KonvaNodeEvents
import typingsSlinky.std.Number
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Ring {
  
  @JSImport("react-konva", "Ring")
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, typingsSlinky.konva.mod.Konva.Ring with js.Object] {
    
    @scala.inline
    def clockwise(value: Boolean): this.type = set("clockwise", value.asInstanceOf[js.Any])
    
    @scala.inline
    def dashVarargs(value: Double*): this.type = set("dash", js.Array(value :_*))
    
    @scala.inline
    def dash(value: js.Array[Double]): this.type = set("dash", value.asInstanceOf[js.Any])
    
    @scala.inline
    def dashEnabled(value: Boolean): this.type = set("dashEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def dashOffset(value: Double): this.type = set("dashOffset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def dragBoundFunc(value: js.ThisFunction1[/* this */ Node[RingConfig], /* pos */ Vector2d, Vector2d]): this.type = set("dragBoundFunc", value.asInstanceOf[js.Any])
    
    @scala.inline
    def dragDistance(value: Double): this.type = set("dragDistance", value.asInstanceOf[js.Any])
    
    @scala.inline
    def draggable(value: Boolean): this.type = set("draggable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def fill(value: String): this.type = set("fill", value.asInstanceOf[js.Any])
    
    @scala.inline
    def fillEnabled(value: Boolean): this.type = set("fillEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def fillLinearGradientColorStopsVarargs(value: (Double | String)*): this.type = set("fillLinearGradientColorStops", js.Array(value :_*))
    
    @scala.inline
    def fillLinearGradientColorStops(value: js.Array[Double | String]): this.type = set("fillLinearGradientColorStops", value.asInstanceOf[js.Any])
    
    @scala.inline
    def fillLinearGradientEndPoint(value: Vector2d): this.type = set("fillLinearGradientEndPoint", value.asInstanceOf[js.Any])
    
    @scala.inline
    def fillLinearGradientEndPointX(value: Double): this.type = set("fillLinearGradientEndPointX", value.asInstanceOf[js.Any])
    
    @scala.inline
    def fillLinearGradientEndPointY(value: Double): this.type = set("fillLinearGradientEndPointY", value.asInstanceOf[js.Any])
    
    @scala.inline
    def fillLinearGradientStartPoint(value: Vector2d): this.type = set("fillLinearGradientStartPoint", value.asInstanceOf[js.Any])
    
    @scala.inline
    def fillLinearGradientStartPointX(value: Double): this.type = set("fillLinearGradientStartPointX", value.asInstanceOf[js.Any])
    
    @scala.inline
    def fillLinearGradientStartPointY(value: Double): this.type = set("fillLinearGradientStartPointY", value.asInstanceOf[js.Any])
    
    @scala.inline
    def fillPatternImage(value: HTMLImageElement): this.type = set("fillPatternImage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def fillPatternOffset(value: Vector2d): this.type = set("fillPatternOffset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def fillPatternOffsetX(value: Double): this.type = set("fillPatternOffsetX", value.asInstanceOf[js.Any])
    
    @scala.inline
    def fillPatternOffsetY(value: Double): this.type = set("fillPatternOffsetY", value.asInstanceOf[js.Any])
    
    @scala.inline
    def fillPatternRepeat(value: String): this.type = set("fillPatternRepeat", value.asInstanceOf[js.Any])
    
    @scala.inline
    def fillPatternRotation(value: Double): this.type = set("fillPatternRotation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def fillPatternScale(value: Vector2d): this.type = set("fillPatternScale", value.asInstanceOf[js.Any])
    
    @scala.inline
    def fillPatternScaleX(value: Double): this.type = set("fillPatternScaleX", value.asInstanceOf[js.Any])
    
    @scala.inline
    def fillPatternScaleY(value: Double): this.type = set("fillPatternScaleY", value.asInstanceOf[js.Any])
    
    @scala.inline
    def fillPatternX(value: Double): this.type = set("fillPatternX", value.asInstanceOf[js.Any])
    
    @scala.inline
    def fillPatternY(value: Double): this.type = set("fillPatternY", value.asInstanceOf[js.Any])
    
    @scala.inline
    def fillPriority(value: String): this.type = set("fillPriority", value.asInstanceOf[js.Any])
    
    @scala.inline
    def fillRadialGradientColorStopsVarargs(value: (Double | String)*): this.type = set("fillRadialGradientColorStops", js.Array(value :_*))
    
    @scala.inline
    def fillRadialGradientColorStops(value: js.Array[Double | String]): this.type = set("fillRadialGradientColorStops", value.asInstanceOf[js.Any])
    
    @scala.inline
    def fillRadialGradientEndPoint(value: Vector2d): this.type = set("fillRadialGradientEndPoint", value.asInstanceOf[js.Any])
    
    @scala.inline
    def fillRadialGradientEndPointX(value: Double): this.type = set("fillRadialGradientEndPointX", value.asInstanceOf[js.Any])
    
    @scala.inline
    def fillRadialGradientEndPointY(value: Double): this.type = set("fillRadialGradientEndPointY", value.asInstanceOf[js.Any])
    
    @scala.inline
    def fillRadialGradientEndRadius(value: Double): this.type = set("fillRadialGradientEndRadius", value.asInstanceOf[js.Any])
    
    @scala.inline
    def fillRadialGradientStartPoint(value: Vector2d): this.type = set("fillRadialGradientStartPoint", value.asInstanceOf[js.Any])
    
    @scala.inline
    def fillRadialGradientStartPointX(value: Double): this.type = set("fillRadialGradientStartPointX", value.asInstanceOf[js.Any])
    
    @scala.inline
    def fillRadialGradientStartPointY(value: Double): this.type = set("fillRadialGradientStartPointY", value.asInstanceOf[js.Any])
    
    @scala.inline
    def fillRadialGradientStartRadius(value: Double): this.type = set("fillRadialGradientStartRadius", value.asInstanceOf[js.Any])
    
    @scala.inline
    def filtersVarargs(value: Filter*): this.type = set("filters", js.Array(value :_*))
    
    @scala.inline
    def filters(value: js.Array[Filter]): this.type = set("filters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def globalCompositeOperation(value: globalCompositeOperationType): this.type = set("globalCompositeOperation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def height(value: Double): this.type = set("height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def hitFunc(value: (/* con */ Context, /* shape */ typingsSlinky.konva.shapeMod.Shape[RingConfig]) => Unit): this.type = set("hitFunc", js.Any.fromFunction2(value))
    
    @scala.inline
    def hitStrokeWidth(value: Double | String): this.type = set("hitStrokeWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def id(value: String): this.type = set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def lineCap(value: LineCap): this.type = set("lineCap", value.asInstanceOf[js.Any])
    
    @scala.inline
    def lineJoin(value: LineJoin): this.type = set("lineJoin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def listening(value: Boolean): this.type = set("listening", value.asInstanceOf[js.Any])
    
    @scala.inline
    def name(value: String): this.type = set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def offset(value: Vector2d): this.type = set("offset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def offsetX(value: Double): this.type = set("offsetX", value.asInstanceOf[js.Any])
    
    @scala.inline
    def offsetY(value: Double): this.type = set("offsetY", value.asInstanceOf[js.Any])
    
    @scala.inline
    def onClick(value: /* evt */ KonvaEventObject[MouseEvent] => Unit): this.type = set("onClick", js.Any.fromFunction1(value))
    
    @scala.inline
    def onContextMenu(value: /* evt */ KonvaEventObject[PointerEvent] => Unit): this.type = set("onContextMenu", js.Any.fromFunction1(value))
    
    @scala.inline
    def onDblClick(value: /* evt */ KonvaEventObject[MouseEvent] => Unit): this.type = set("onDblClick", js.Any.fromFunction1(value))
    
    @scala.inline
    def onDblTap(value: /* evt */ KonvaEventObject[Event] => Unit): this.type = set("onDblTap", js.Any.fromFunction1(value))
    
    @scala.inline
    def onDragEnd(value: /* evt */ KonvaEventObject[DragEvent] => Unit): this.type = set("onDragEnd", js.Any.fromFunction1(value))
    
    @scala.inline
    def onDragMove(value: /* evt */ KonvaEventObject[DragEvent] => Unit): this.type = set("onDragMove", js.Any.fromFunction1(value))
    
    @scala.inline
    def onDragStart(value: /* evt */ KonvaEventObject[DragEvent] => Unit): this.type = set("onDragStart", js.Any.fromFunction1(value))
    
    @scala.inline
    def onMouseDown(value: /* evt */ KonvaEventObject[MouseEvent] => Unit): this.type = set("onMouseDown", js.Any.fromFunction1(value))
    
    @scala.inline
    def onMouseEnter(value: /* evt */ KonvaEventObject[MouseEvent] => Unit): this.type = set("onMouseEnter", js.Any.fromFunction1(value))
    
    @scala.inline
    def onMouseLeave(value: /* evt */ KonvaEventObject[MouseEvent] => Unit): this.type = set("onMouseLeave", js.Any.fromFunction1(value))
    
    @scala.inline
    def onMouseMove(value: /* evt */ KonvaEventObject[MouseEvent] => Unit): this.type = set("onMouseMove", js.Any.fromFunction1(value))
    
    @scala.inline
    def onMouseOut(value: /* evt */ KonvaEventObject[MouseEvent] => Unit): this.type = set("onMouseOut", js.Any.fromFunction1(value))
    
    @scala.inline
    def onMouseOver(value: /* evt */ KonvaEventObject[MouseEvent] => Unit): this.type = set("onMouseOver", js.Any.fromFunction1(value))
    
    @scala.inline
    def onMouseUp(value: /* evt */ KonvaEventObject[MouseEvent] => Unit): this.type = set("onMouseUp", js.Any.fromFunction1(value))
    
    @scala.inline
    def onTap(value: /* evt */ KonvaEventObject[Event] => Unit): this.type = set("onTap", js.Any.fromFunction1(value))
    
    @scala.inline
    def onTouchEnd(value: /* evt */ KonvaEventObject[TouchEvent] => Unit): this.type = set("onTouchEnd", js.Any.fromFunction1(value))
    
    @scala.inline
    def onTouchMove(value: /* evt */ KonvaEventObject[TouchEvent] => Unit): this.type = set("onTouchMove", js.Any.fromFunction1(value))
    
    @scala.inline
    def onTouchStart(value: /* evt */ KonvaEventObject[TouchEvent] => Unit): this.type = set("onTouchStart", js.Any.fromFunction1(value))
    
    @scala.inline
    def onTransform(value: /* evt */ KonvaEventObject[Event] => Unit): this.type = set("onTransform", js.Any.fromFunction1(value))
    
    @scala.inline
    def onTransformEnd(value: /* evt */ KonvaEventObject[Event] => Unit): this.type = set("onTransformEnd", js.Any.fromFunction1(value))
    
    @scala.inline
    def onTransformStart(value: /* evt */ KonvaEventObject[Event] => Unit): this.type = set("onTransformStart", js.Any.fromFunction1(value))
    
    @scala.inline
    def onWheel(value: /* evt */ KonvaEventObject[WheelEvent] => Unit): this.type = set("onWheel", js.Any.fromFunction1(value))
    
    @scala.inline
    def opacity(value: Number): this.type = set("opacity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def perfectDrawEnabled(value: Boolean): this.type = set("perfectDrawEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def preventDefault(value: Boolean): this.type = set("preventDefault", value.asInstanceOf[js.Any])
    
    @scala.inline
    def rotation(value: Double): this.type = set("rotation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def rotationDeg(value: Double): this.type = set("rotationDeg", value.asInstanceOf[js.Any])
    
    @scala.inline
    def scale(value: Vector2d): this.type = set("scale", value.asInstanceOf[js.Any])
    
    @scala.inline
    def scaleX(value: Double): this.type = set("scaleX", value.asInstanceOf[js.Any])
    
    @scala.inline
    def scaleY(value: Double): this.type = set("scaleY", value.asInstanceOf[js.Any])
    
    @scala.inline
    def sceneFunc(value: (/* con */ Context, /* shape */ typingsSlinky.konva.shapeMod.Shape[RingConfig]) => Unit): this.type = set("sceneFunc", js.Any.fromFunction2(value))
    
    @scala.inline
    def shadowBlur(value: Double): this.type = set("shadowBlur", value.asInstanceOf[js.Any])
    
    @scala.inline
    def shadowColor(value: String): this.type = set("shadowColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def shadowEnabled(value: Boolean): this.type = set("shadowEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def shadowForStrokeEnabled(value: Boolean): this.type = set("shadowForStrokeEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def shadowOffset(value: Vector2d): this.type = set("shadowOffset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def shadowOffsetX(value: Double): this.type = set("shadowOffsetX", value.asInstanceOf[js.Any])
    
    @scala.inline
    def shadowOffsetY(value: Double): this.type = set("shadowOffsetY", value.asInstanceOf[js.Any])
    
    @scala.inline
    def shadowOpacity(value: Double): this.type = set("shadowOpacity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def stroke(value: String): this.type = set("stroke", value.asInstanceOf[js.Any])
    
    @scala.inline
    def strokeEnabled(value: Boolean): this.type = set("strokeEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def strokeHitEnabled(value: Boolean): this.type = set("strokeHitEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def strokeScaleEnabled(value: Boolean): this.type = set("strokeScaleEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def strokeWidth(value: Double): this.type = set("strokeWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def visible(value: Boolean): this.type = set("visible", value.asInstanceOf[js.Any])
    
    @scala.inline
    def width(value: Double): this.type = set("width", value.asInstanceOf[js.Any])
    
    @scala.inline
    def x(value: Double): this.type = set("x", value.asInstanceOf[js.Any])
    
    @scala.inline
    def y(value: Double): this.type = set("y", value.asInstanceOf[js.Any])
  }
  
  def withProps(
    p: typingsSlinky.konva.mod.Konva.RingConfig with KonvaNodeEvents with ClassAttributes[typingsSlinky.konva.mod.Konva.Ring]
  ): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  
  @scala.inline
  def apply(innerRadius: Double, outerRadius: Double): Builder = {
    val __props = js.Dynamic.literal(innerRadius = innerRadius.asInstanceOf[js.Any], outerRadius = outerRadius.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[typingsSlinky.konva.mod.Konva.RingConfig with KonvaNodeEvents with ClassAttributes[typingsSlinky.konva.mod.Konva.Ring]]))
  }
}
