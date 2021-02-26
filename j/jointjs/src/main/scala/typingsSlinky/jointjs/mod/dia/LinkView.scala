package typingsSlinky.jointjs.mod.dia

import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.raw.SVGElement
import typingsSlinky.jointjs.anon.Connection
import typingsSlinky.jointjs.mod.dia.CellView.Options
import typingsSlinky.jointjs.mod.dia.Link.Label
import typingsSlinky.jointjs.mod.dia.Link.LabelPosition
import typingsSlinky.jointjs.mod.dia.LinkView.InteractivityOptions
import typingsSlinky.jointjs.mod.dia.LinkView.LabelOptions
import typingsSlinky.jointjs.mod.dia.LinkView.VertexOptions
import typingsSlinky.jointjs.mod.g.Curve
import typingsSlinky.jointjs.mod.g.Line
import typingsSlinky.jointjs.mod.mvc.ViewOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("jointjs", "dia.LinkView")
@js.native
class LinkView () extends CellViewGeneric[Link] {
  def this(opt: Options[Link]) = this()
  
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
  var options_LinkView: typingsSlinky.jointjs.mod.dia.LinkView.Options = js.native
  
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
object LinkView {
  
  type GetConnectionPoint = js.Function5[
    /* linkView */ LinkView, 
    /* view */ ElementView, 
    /* magnet */ SVGElement, 
    /* reference */ Point, 
    /* end */ LinkEnd, 
    Point
  ]
  
  @js.native
  trait InteractivityOptions extends StObject {
    
    var arrowheadMove: js.UndefOr[Boolean] = js.native
    
    var labelMove: js.UndefOr[Boolean] = js.native
    
    var linkMove: js.UndefOr[Boolean] = js.native
    
    var useLinkTools: js.UndefOr[Boolean] = js.native
    
    var vertexAdd: js.UndefOr[Boolean] = js.native
    
    var vertexMove: js.UndefOr[Boolean] = js.native
    
    var vertexRemove: js.UndefOr[Boolean] = js.native
  }
  object InteractivityOptions {
    
    @scala.inline
    def apply(): InteractivityOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[InteractivityOptions]
    }
    
    @scala.inline
    implicit class InteractivityOptionsMutableBuilder[Self <: InteractivityOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setArrowheadMove(value: Boolean): Self = StObject.set(x, "arrowheadMove", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setArrowheadMoveUndefined: Self = StObject.set(x, "arrowheadMove", js.undefined)
      
      @scala.inline
      def setLabelMove(value: Boolean): Self = StObject.set(x, "labelMove", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLabelMoveUndefined: Self = StObject.set(x, "labelMove", js.undefined)
      
      @scala.inline
      def setLinkMove(value: Boolean): Self = StObject.set(x, "linkMove", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLinkMoveUndefined: Self = StObject.set(x, "linkMove", js.undefined)
      
      @scala.inline
      def setUseLinkTools(value: Boolean): Self = StObject.set(x, "useLinkTools", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUseLinkToolsUndefined: Self = StObject.set(x, "useLinkTools", js.undefined)
      
      @scala.inline
      def setVertexAdd(value: Boolean): Self = StObject.set(x, "vertexAdd", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVertexAddUndefined: Self = StObject.set(x, "vertexAdd", js.undefined)
      
      @scala.inline
      def setVertexMove(value: Boolean): Self = StObject.set(x, "vertexMove", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVertexMoveUndefined: Self = StObject.set(x, "vertexMove", js.undefined)
      
      @scala.inline
      def setVertexRemove(value: Boolean): Self = StObject.set(x, "vertexRemove", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVertexRemoveUndefined: Self = StObject.set(x, "vertexRemove", js.undefined)
    }
  }
  
  @js.native
  trait LabelOptions
    extends typingsSlinky.jointjs.mod.dia.Cell.Options {
    
    var absoluteDistance: js.UndefOr[Boolean] = js.native
    
    var absoluteOffset: js.UndefOr[Boolean] = js.native
    
    var ensureLegibility: js.UndefOr[Boolean] = js.native
    
    var keepGradient: js.UndefOr[Boolean] = js.native
    
    var reverseDistance: js.UndefOr[Boolean] = js.native
  }
  object LabelOptions {
    
    @scala.inline
    def apply(): LabelOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[LabelOptions]
    }
    
    @scala.inline
    implicit class LabelOptionsMutableBuilder[Self <: LabelOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAbsoluteDistance(value: Boolean): Self = StObject.set(x, "absoluteDistance", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAbsoluteDistanceUndefined: Self = StObject.set(x, "absoluteDistance", js.undefined)
      
      @scala.inline
      def setAbsoluteOffset(value: Boolean): Self = StObject.set(x, "absoluteOffset", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAbsoluteOffsetUndefined: Self = StObject.set(x, "absoluteOffset", js.undefined)
      
      @scala.inline
      def setEnsureLegibility(value: Boolean): Self = StObject.set(x, "ensureLegibility", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEnsureLegibilityUndefined: Self = StObject.set(x, "ensureLegibility", js.undefined)
      
      @scala.inline
      def setKeepGradient(value: Boolean): Self = StObject.set(x, "keepGradient", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKeepGradientUndefined: Self = StObject.set(x, "keepGradient", js.undefined)
      
      @scala.inline
      def setReverseDistance(value: Boolean): Self = StObject.set(x, "reverseDistance", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setReverseDistanceUndefined: Self = StObject.set(x, "reverseDistance", js.undefined)
    }
  }
  
  @js.native
  trait Options extends ViewOptions[Link] {
    
    var doubleLinkTools: js.UndefOr[Boolean] = js.native
    
    var doubleLinkToolsOffset: js.UndefOr[Double] = js.native
    
    var linkToolsOffset: js.UndefOr[Double] = js.native
    
    var longLinkLength: js.UndefOr[Double] = js.native
    
    var sampleInterval: js.UndefOr[Double] = js.native
    
    var shortLinkLength: js.UndefOr[Double] = js.native
  }
  object Options {
    
    @scala.inline
    def apply(): typingsSlinky.jointjs.mod.dia.LinkView.Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[typingsSlinky.jointjs.mod.dia.LinkView.Options]
    }
    
    @scala.inline
    implicit class OptionsMutableBuilder[Self <: typingsSlinky.jointjs.mod.dia.LinkView.Options] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDoubleLinkTools(value: Boolean): Self = StObject.set(x, "doubleLinkTools", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDoubleLinkToolsOffset(value: Double): Self = StObject.set(x, "doubleLinkToolsOffset", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDoubleLinkToolsOffsetUndefined: Self = StObject.set(x, "doubleLinkToolsOffset", js.undefined)
      
      @scala.inline
      def setDoubleLinkToolsUndefined: Self = StObject.set(x, "doubleLinkTools", js.undefined)
      
      @scala.inline
      def setLinkToolsOffset(value: Double): Self = StObject.set(x, "linkToolsOffset", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLinkToolsOffsetUndefined: Self = StObject.set(x, "linkToolsOffset", js.undefined)
      
      @scala.inline
      def setLongLinkLength(value: Double): Self = StObject.set(x, "longLinkLength", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLongLinkLengthUndefined: Self = StObject.set(x, "longLinkLength", js.undefined)
      
      @scala.inline
      def setSampleInterval(value: Double): Self = StObject.set(x, "sampleInterval", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSampleIntervalUndefined: Self = StObject.set(x, "sampleInterval", js.undefined)
      
      @scala.inline
      def setShortLinkLength(value: Double): Self = StObject.set(x, "shortLinkLength", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShortLinkLengthUndefined: Self = StObject.set(x, "shortLinkLength", js.undefined)
    }
  }
  
  type VertexOptions = typingsSlinky.jointjs.mod.dia.Cell.Options
}
