package typingsSlinky.jointjs.mod.dia

import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.raw.SVGElement
import typingsSlinky.jointjs.anon.Connection
import typingsSlinky.jointjs.mod.dia.Link.Label
import typingsSlinky.jointjs.mod.dia.Link.LabelPosition
import typingsSlinky.jointjs.mod.dia.LinkView.InteractivityOptions
import typingsSlinky.jointjs.mod.dia.LinkView.LabelOptions
import typingsSlinky.jointjs.mod.dia.LinkView.Options
import typingsSlinky.jointjs.mod.dia.LinkView.VertexOptions
import typingsSlinky.jointjs.mod.g.Curve
import typingsSlinky.jointjs.mod.g.Line
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("jointjs", "dia.LinkView")
@js.native
class LinkView_ () extends CellViewGeneric[Link] {
  
  def addLabel(coordinates: Point): Double = js.native
  def addLabel(coordinates: Point, angle: Double): Double = js.native
  def addLabel(coordinates: Point, angle: Double, opt: LabelOptions): Double = js.native
  def addLabel(coordinates: Point, opt: LabelOptions): Double = js.native
  def addLabel(x: Double, y: Double): Double = js.native
  def addLabel(x: Double, y: Double, angle: Double): Double = js.native
  def addLabel(x: Double, y: Double, angle: Double, opt: LabelOptions): Double = js.native
  def addLabel(x: Double, y: Double, opt: LabelOptions): Double = js.native
  
  def addVertex(coordinates: Point): Double = js.native
  def addVertex(coordinates: Point, opt: VertexOptions): Double = js.native
  def addVertex(x: Double, y: Double): Double = js.native
  def addVertex(x: Double, y: Double, opt: VertexOptions): Double = js.native
  
  /* protected */ def drag(evt: Event, x: Double, y: Double): Unit = js.native
  
  /* protected */ def dragArrowhead(evt: Event, x: Double, y: Double): Unit = js.native
  
  /* protected */ def dragArrowheadEnd(evt: Event, x: Double, y: Double): Unit = js.native
  
  /* protected */ def dragArrowheadStart(evt: Event, x: Double, y: Double): Unit = js.native
  
  /* protected */ def dragConnection(evt: Event, x: Double, y: Double): Unit = js.native
  
  /* protected */ def dragConnectionEnd(evt: Event, x: Double, y: Double): Unit = js.native
  
  /* protected */ def dragConnectionStart(evt: Event, x: Double, y: Double): Unit = js.native
  
  /* protected */ def dragEnd(evt: Event, x: Double, y: Double): Unit = js.native
  
  /* protected */ def dragLabel(evt: Event, x: Double, y: Double): Unit = js.native
  
  /* protected */ def dragLabelEnd(evt: Event, x: Double, y: Double): Unit = js.native
  
  /* protected */ def dragLabelStart(evt: Event, x: Double, y: Double): Unit = js.native
  
  /* protected */ def dragStart(evt: Event, x: Double, y: Double): Unit = js.native
  
  /* protected */ def dragVertex(evt: Event, x: Double, y: Double): Unit = js.native
  
  /* protected */ def dragVertexEnd(evt: Event, x: Double, y: Double): Unit = js.native
  
  /* protected */ def dragVertexStart(evt: Event, x: Double, y: Double): Unit = js.native
  
  def getClosestPoint(point: Point): typingsSlinky.jointjs.mod.g.Point = js.native
  
  def getClosestPointLength(point: Point): Double = js.native
  
  def getClosestPointRatio(point: Point): Double = js.native
  
  def getConnection(): typingsSlinky.jointjs.mod.g.Path = js.native
  
  def getConnectionLength(): Double = js.native
  
  def getConnectionSubdivisions(): js.Array[js.Array[Curve]] = js.native
  
  def getEndAnchor(endType: LinkEnd): typingsSlinky.jointjs.mod.g.Point = js.native
  
  def getEndConnectionPoint(endType: LinkEnd): typingsSlinky.jointjs.mod.g.Point = js.native
  
  def getEndMagnet(endType: LinkEnd): SVGElement | Null = js.native
  
  def getEndView(endType: LinkEnd): CellView | Null = js.native
  
  def getLabelCoordinates(labelPosition: LabelPosition): typingsSlinky.jointjs.mod.g.Point = js.native
  
  def getLabelPosition(x: Double, y: Double): LabelPosition = js.native
  def getLabelPosition(x: Double, y: Double, angle: Double): LabelPosition = js.native
  def getLabelPosition(x: Double, y: Double, angle: Double, opt: LabelOptions): LabelPosition = js.native
  def getLabelPosition(x: Double, y: Double, opt: LabelOptions): LabelPosition = js.native
  
  def getPointAtLength(length: Double): typingsSlinky.jointjs.mod.g.Point = js.native
  
  def getPointAtRatio(ratio: Double): typingsSlinky.jointjs.mod.g.Point = js.native
  
  def getSerializedConnection(): String = js.native
  
  def getTangentAtLength(length: Double): Line = js.native
  
  def getTangentAtRatio(ratio: Double): Line = js.native
  
  def getVertexIndex(point: Point): Double = js.native
  def getVertexIndex(x: Double, y: Double): Double = js.native
  
  /* protected */ def notifyPointerdown(evt: Event, x: Double, y: Double): Unit = js.native
  
  /* protected */ def notifyPointermove(evt: Event, x: Double, y: Double): Unit = js.native
  
  /* protected */ def notifyPointerup(evt: Event, x: Double, y: Double): Unit = js.native
  
  /* protected */ def onLabelsChange(link: Link, labels: js.Array[Label], opt: StringDictionary[js.Any]): Unit = js.native
  
  /* protected */ def onSourceChange(element: Element, sourceEnd: js.Any, opt: StringDictionary[js.Any]): Unit = js.native
  
  /* protected */ def onTargetChange(element: Element, targetEnd: js.Any, opt: StringDictionary[js.Any]): Unit = js.native
  
  /* protected */ def onToolsChange(link: Link, toolsMarkup: String, opt: StringDictionary[js.Any]): Unit = js.native
  
  /* protected */ def onVerticesChange(link: Link, vertices: js.Array[Point], opt: StringDictionary[js.Any]): Unit = js.native
  
  /* protected */ def onlabel(evt: Event, x: Double, y: Double): Unit = js.native
  
  @JSName("options")
  var options_LinkView_ : Options = js.native
  
  def requestConnectionUpdate(): Unit = js.native
  def requestConnectionUpdate(opt: StringDictionary[js.Any]): Unit = js.native
  
  def sendToken(token: SVGElement): Unit = js.native
  def sendToken(token: SVGElement, duration: js.UndefOr[scala.Nothing], callback: js.Function0[Unit]): Unit = js.native
  def sendToken(token: SVGElement, duration: Double): Unit = js.native
  def sendToken(token: SVGElement, duration: Double, callback: js.Function0[Unit]): Unit = js.native
  def sendToken(token: SVGElement, opt: Connection): Unit = js.native
  def sendToken(token: SVGElement, opt: Connection, callback: js.Function0[Unit]): Unit = js.native
  
  def setInteractivity(value: Boolean): Unit = js.native
  def setInteractivity(value: InteractivityOptions): Unit = js.native
  
  def update(link: Link, attributes: js.Any): this.type = js.native
  def update(link: Link, attributes: js.Any, opt: StringDictionary[js.Any]): this.type = js.native
}
