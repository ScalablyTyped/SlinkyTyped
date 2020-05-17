package typingsSlinky.ejWebAll.global.ej.datavisualization

import org.scalajs.dom.raw.Element
import typingsSlinky.ejWebAll.JQuery
import typingsSlinky.ejWebAll.ej.Model
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("ej.datavisualization.BulletGraph")
@js.native
class BulletGraph protected ()
  extends typingsSlinky.ejWebAll.ej.datavisualization.BulletGraph {
  def this(element: JQuery) = this()
  def this(element: Element) = this()
  def this(element: JQuery, options: Model) = this()
  def this(element: Element, options: Model) = this()
}

/* static members */
@JSGlobal("ej.datavisualization.BulletGraph")
@js.native
object BulletGraph extends js.Object {
  var Locale: js.Any = js.native
  var fn: typingsSlinky.ejWebAll.ej.datavisualization.BulletGraph = js.native
  @js.native
  object FlowDirection extends js.Object {
    /* 1 */ val Backward: typingsSlinky.ejWebAll.ej.datavisualization.BulletGraph.FlowDirection.Backward with Double = js.native
    /* 0 */ val Forward: typingsSlinky.ejWebAll.ej.datavisualization.BulletGraph.FlowDirection.Forward with Double = js.native
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[
        typingsSlinky.ejWebAll.ej.datavisualization.BulletGraph.FlowDirection with Double
      ] = js.native
  }
  
  @js.native
  object FontStyle extends js.Object {
    /* 1 */ val Italic: typingsSlinky.ejWebAll.ej.datavisualization.BulletGraph.FontStyle.Italic with Double = js.native
    /* 0 */ val Normal: typingsSlinky.ejWebAll.ej.datavisualization.BulletGraph.FontStyle.Normal with Double = js.native
    /* 2 */ val Oblique: typingsSlinky.ejWebAll.ej.datavisualization.BulletGraph.FontStyle.Oblique with Double = js.native
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsSlinky.ejWebAll.ej.datavisualization.BulletGraph.FontStyle with Double] = js.native
  }
  
  @js.native
  object FontWeight extends js.Object {
    /* 1 */ val Bold: typingsSlinky.ejWebAll.ej.datavisualization.BulletGraph.FontWeight.Bold with Double = js.native
    /* 2 */ val Bolder: typingsSlinky.ejWebAll.ej.datavisualization.BulletGraph.FontWeight.Bolder with Double = js.native
    /* 3 */ val Lighter: typingsSlinky.ejWebAll.ej.datavisualization.BulletGraph.FontWeight.Lighter with Double = js.native
    /* 0 */ val Normal: typingsSlinky.ejWebAll.ej.datavisualization.BulletGraph.FontWeight.Normal with Double = js.native
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsSlinky.ejWebAll.ej.datavisualization.BulletGraph.FontWeight with Double] = js.native
  }
  
  @js.native
  object LabelPlacement extends js.Object {
    /* 0 */ val Inside: typingsSlinky.ejWebAll.ej.datavisualization.BulletGraph.LabelPlacement.Inside with Double = js.native
    /* 1 */ val Outside: typingsSlinky.ejWebAll.ej.datavisualization.BulletGraph.LabelPlacement.Outside with Double = js.native
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[
        typingsSlinky.ejWebAll.ej.datavisualization.BulletGraph.LabelPlacement with Double
      ] = js.native
  }
  
  @js.native
  object LabelPosition extends js.Object {
    /* 0 */ val Above: typingsSlinky.ejWebAll.ej.datavisualization.BulletGraph.LabelPosition.Above with Double = js.native
    /* 1 */ val Below: typingsSlinky.ejWebAll.ej.datavisualization.BulletGraph.LabelPosition.Below with Double = js.native
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[
        typingsSlinky.ejWebAll.ej.datavisualization.BulletGraph.LabelPosition with Double
      ] = js.native
  }
  
  @js.native
  object Orientation extends js.Object {
    /* 0 */ val Horizontal: typingsSlinky.ejWebAll.ej.datavisualization.BulletGraph.Orientation.Horizontal with Double = js.native
    /* 1 */ val Vertical: typingsSlinky.ejWebAll.ej.datavisualization.BulletGraph.Orientation.Vertical with Double = js.native
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsSlinky.ejWebAll.ej.datavisualization.BulletGraph.Orientation with Double] = js.native
  }
  
  @js.native
  object TextAlignment extends js.Object {
    /* 2 */ val Center: typingsSlinky.ejWebAll.ej.datavisualization.BulletGraph.TextAlignment.Center with Double = js.native
    /* 1 */ val Far: typingsSlinky.ejWebAll.ej.datavisualization.BulletGraph.TextAlignment.Far with Double = js.native
    /* 0 */ val Near: typingsSlinky.ejWebAll.ej.datavisualization.BulletGraph.TextAlignment.Near with Double = js.native
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[
        typingsSlinky.ejWebAll.ej.datavisualization.BulletGraph.TextAlignment with Double
      ] = js.native
  }
  
  @js.native
  object TextAnchor extends js.Object {
    /* 2 */ val End: typingsSlinky.ejWebAll.ej.datavisualization.BulletGraph.TextAnchor.End with Double = js.native
    /* 1 */ val Middle: typingsSlinky.ejWebAll.ej.datavisualization.BulletGraph.TextAnchor.Middle with Double = js.native
    /* 0 */ val Start: typingsSlinky.ejWebAll.ej.datavisualization.BulletGraph.TextAnchor.Start with Double = js.native
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsSlinky.ejWebAll.ej.datavisualization.BulletGraph.TextAnchor with Double] = js.native
  }
  
  @js.native
  object TextPosition extends js.Object {
    /* 3 */ val Bottom: typingsSlinky.ejWebAll.ej.datavisualization.BulletGraph.TextPosition.Bottom with Double = js.native
    /* 4 */ val Float: typingsSlinky.ejWebAll.ej.datavisualization.BulletGraph.TextPosition.Float with Double = js.native
    /* 2 */ val Left: typingsSlinky.ejWebAll.ej.datavisualization.BulletGraph.TextPosition.Left with Double = js.native
    /* 1 */ val Right: typingsSlinky.ejWebAll.ej.datavisualization.BulletGraph.TextPosition.Right with Double = js.native
    /* 0 */ val Top: typingsSlinky.ejWebAll.ej.datavisualization.BulletGraph.TextPosition.Top with Double = js.native
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsSlinky.ejWebAll.ej.datavisualization.BulletGraph.TextPosition with Double] = js.native
  }
  
  @js.native
  object TickPlacement extends js.Object {
    /* 0 */ val Inside: typingsSlinky.ejWebAll.ej.datavisualization.BulletGraph.TickPlacement.Inside with Double = js.native
    /* 1 */ val Outside: typingsSlinky.ejWebAll.ej.datavisualization.BulletGraph.TickPlacement.Outside with Double = js.native
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[
        typingsSlinky.ejWebAll.ej.datavisualization.BulletGraph.TickPlacement with Double
      ] = js.native
  }
  
  @js.native
  object TickPosition extends js.Object {
    /* 1 */ val Above: typingsSlinky.ejWebAll.ej.datavisualization.BulletGraph.TickPosition.Above with Double = js.native
    /* 0 */ val Below: typingsSlinky.ejWebAll.ej.datavisualization.BulletGraph.TickPosition.Below with Double = js.native
    /* 2 */ val Cross: typingsSlinky.ejWebAll.ej.datavisualization.BulletGraph.TickPosition.Cross with Double = js.native
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsSlinky.ejWebAll.ej.datavisualization.BulletGraph.TickPosition with Double] = js.native
  }
  
}

