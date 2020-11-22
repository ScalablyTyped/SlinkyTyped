package typingsSlinky.reactKonva.components

import org.scalajs.dom.raw.CanvasRenderingContext2D
import org.scalajs.dom.raw.DragEvent
import org.scalajs.dom.raw.Event
import org.scalajs.dom.raw.MouseEvent
import org.scalajs.dom.raw.PointerEvent
import org.scalajs.dom.raw.TouchEvent
import org.scalajs.dom.raw.WheelEvent
import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.konva.layerMod.LayerConfig
import typingsSlinky.konva.mod.Konva.KonvaEventObject
import typingsSlinky.konva.nodeMod.Filter
import typingsSlinky.konva.nodeMod.Node
import typingsSlinky.konva.nodeMod.globalCompositeOperationType
import typingsSlinky.konva.typesMod.Vector2d
import typingsSlinky.react.mod.ClassAttributes
import typingsSlinky.reactKonva.reactKonvaCoreMod.KonvaNodeEvents
import typingsSlinky.std.Number
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object FastLayer {
  
  @JSImport("react-konva", "FastLayer")
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, typingsSlinky.konva.mod.Konva.FastLayer with js.Object] {
    
    @scala.inline
    def clearBeforeDraw(value: Boolean): this.type = set("clearBeforeDraw", value.asInstanceOf[js.Any])
    
    @scala.inline
    def clipFunc(value: /* ctx */ CanvasRenderingContext2D => Unit): this.type = set("clipFunc", js.Any.fromFunction1(value))
    
    @scala.inline
    def clipHeight(value: Double): this.type = set("clipHeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def clipWidth(value: Double): this.type = set("clipWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def clipX(value: Double): this.type = set("clipX", value.asInstanceOf[js.Any])
    
    @scala.inline
    def clipY(value: Double): this.type = set("clipY", value.asInstanceOf[js.Any])
    
    @scala.inline
    def dragBoundFunc(value: js.ThisFunction1[/* this */ Node[LayerConfig], /* pos */ Vector2d, Vector2d]): this.type = set("dragBoundFunc", value.asInstanceOf[js.Any])
    
    @scala.inline
    def dragDistance(value: Double): this.type = set("dragDistance", value.asInstanceOf[js.Any])
    
    @scala.inline
    def draggable(value: Boolean): this.type = set("draggable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def filtersVarargs(value: Filter*): this.type = set("filters", js.Array(value :_*))
    
    @scala.inline
    def filters(value: js.Array[Filter]): this.type = set("filters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def globalCompositeOperation(value: globalCompositeOperationType): this.type = set("globalCompositeOperation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def height(value: Double): this.type = set("height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def hitGraphEnabled(value: Boolean): this.type = set("hitGraphEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def id(value: String): this.type = set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def imageSmoothingEnabled(value: Boolean): this.type = set("imageSmoothingEnabled", value.asInstanceOf[js.Any])
    
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
    def visible(value: Boolean): this.type = set("visible", value.asInstanceOf[js.Any])
    
    @scala.inline
    def width(value: Double): this.type = set("width", value.asInstanceOf[js.Any])
    
    @scala.inline
    def x(value: Double): this.type = set("x", value.asInstanceOf[js.Any])
    
    @scala.inline
    def y(value: Double): this.type = set("y", value.asInstanceOf[js.Any])
  }
  
  def withProps(
    p: typingsSlinky.konva.mod.Konva.LayerConfig with KonvaNodeEvents with ClassAttributes[typingsSlinky.konva.mod.Konva.FastLayer]
  ): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  
  implicit def make(companion: FastLayer.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
}
