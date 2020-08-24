package typingsSlinky.kendoUi.global.kendo.dataviz

import typingsSlinky.kendoUi.JQuery
import typingsSlinky.kendoUi.kendo.dataviz.drawing.ArcOptions
import typingsSlinky.kendoUi.kendo.dataviz.drawing.CircleOptions
import typingsSlinky.kendoUi.kendo.dataviz.drawing.ElementOptions
import typingsSlinky.kendoUi.kendo.dataviz.drawing.GradientOptions
import typingsSlinky.kendoUi.kendo.dataviz.drawing.GradientStopOptions
import typingsSlinky.kendoUi.kendo.dataviz.drawing.GroupOptions
import typingsSlinky.kendoUi.kendo.dataviz.drawing.LayoutOptions
import typingsSlinky.kendoUi.kendo.dataviz.drawing.LinearGradientOptions
import typingsSlinky.kendoUi.kendo.dataviz.drawing.MultiPathOptions
import typingsSlinky.kendoUi.kendo.dataviz.drawing.OptionsStoreOptions
import typingsSlinky.kendoUi.kendo.dataviz.drawing.PathOptions
import typingsSlinky.kendoUi.kendo.dataviz.drawing.RadialGradientOptions
import typingsSlinky.kendoUi.kendo.dataviz.drawing.RectOptions
import typingsSlinky.kendoUi.kendo.dataviz.drawing.SurfaceOptions
import typingsSlinky.kendoUi.kendo.dataviz.drawing.TextOptions
import typingsSlinky.kendoUi.kendo.geometry.Point
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("kendo.dataviz.drawing")
@js.native
object drawing extends js.Object {
  @js.native
  class Arc protected ()
    extends typingsSlinky.kendoUi.kendo.dataviz.drawing.Arc {
    def this(geometry: typingsSlinky.kendoUi.kendo.geometry.Arc) = this()
    def this(geometry: typingsSlinky.kendoUi.kendo.geometry.Arc, options: ArcOptions) = this()
  }
  
  @js.native
  class Circle protected ()
    extends typingsSlinky.kendoUi.kendo.dataviz.drawing.Circle {
    def this(geometry: typingsSlinky.kendoUi.kendo.geometry.Circle) = this()
    def this(geometry: typingsSlinky.kendoUi.kendo.geometry.Circle, options: CircleOptions) = this()
  }
  
  @js.native
  class Element ()
    extends typingsSlinky.kendoUi.kendo.dataviz.drawing.Element {
    def this(options: ElementOptions) = this()
  }
  
  @js.native
  class Gradient ()
    extends typingsSlinky.kendoUi.kendo.dataviz.drawing.Gradient {
    def this(options: GradientOptions) = this()
  }
  
  @js.native
  class GradientStop ()
    extends typingsSlinky.kendoUi.kendo.dataviz.drawing.GradientStop {
    def this(options: GradientStopOptions) = this()
  }
  
  @js.native
  class Group ()
    extends typingsSlinky.kendoUi.kendo.dataviz.drawing.Group {
    def this(options: GroupOptions) = this()
  }
  
  @js.native
  class Image protected ()
    extends typingsSlinky.kendoUi.kendo.dataviz.drawing.Image {
    def this(src: String, rect: typingsSlinky.kendoUi.kendo.geometry.Rect) = this()
  }
  
  @js.native
  class Layout protected ()
    extends typingsSlinky.kendoUi.kendo.dataviz.drawing.Layout {
    def this(rect: typingsSlinky.kendoUi.kendo.geometry.Rect) = this()
    def this(rect: typingsSlinky.kendoUi.kendo.geometry.Rect, options: LayoutOptions) = this()
  }
  
  @js.native
  class LinearGradient ()
    extends typingsSlinky.kendoUi.kendo.dataviz.drawing.LinearGradient {
    def this(options: LinearGradientOptions) = this()
  }
  
  @js.native
  class MultiPath ()
    extends typingsSlinky.kendoUi.kendo.dataviz.drawing.MultiPath {
    def this(options: MultiPathOptions) = this()
  }
  
  @js.native
  class OptionsStore ()
    extends typingsSlinky.kendoUi.kendo.dataviz.drawing.OptionsStore {
    def this(options: OptionsStoreOptions) = this()
  }
  
  @js.native
  class Path ()
    extends typingsSlinky.kendoUi.kendo.dataviz.drawing.Path {
    def this(options: PathOptions) = this()
  }
  
  @js.native
  class RadialGradient ()
    extends typingsSlinky.kendoUi.kendo.dataviz.drawing.RadialGradient {
    def this(options: RadialGradientOptions) = this()
  }
  
  @js.native
  class Rect protected ()
    extends typingsSlinky.kendoUi.kendo.dataviz.drawing.Rect {
    def this(geometry: typingsSlinky.kendoUi.kendo.geometry.Rect) = this()
    def this(geometry: typingsSlinky.kendoUi.kendo.geometry.Rect, options: RectOptions) = this()
  }
  
  @js.native
  class Segment protected ()
    extends typingsSlinky.kendoUi.kendo.dataviz.drawing.Segment {
    def this(anchor: Point, controlIn: Point, controlOut: Point) = this()
  }
  
  @js.native
  class Surface ()
    extends typingsSlinky.kendoUi.kendo.dataviz.drawing.Surface {
    def this(options: SurfaceOptions) = this()
  }
  
  @js.native
  class Text protected ()
    extends typingsSlinky.kendoUi.kendo.dataviz.drawing.Text {
    def this(content: String, position: Point) = this()
    def this(content: String, position: Point, options: TextOptions) = this()
  }
  
  /* static members */
  @js.native
  object Path extends js.Object {
    def fromArc(arc: typingsSlinky.kendoUi.kendo.geometry.Arc): typingsSlinky.kendoUi.kendo.drawing.Path = js.native
    def fromArc(arc: typingsSlinky.kendoUi.kendo.geometry.Arc, options: js.Any): typingsSlinky.kendoUi.kendo.drawing.Path = js.native
    def fromPoints(points: js.Any): typingsSlinky.kendoUi.kendo.drawing.Path = js.native
    def fromPoints(points: js.Any, options: js.Any): typingsSlinky.kendoUi.kendo.drawing.Path = js.native
    def fromRect(rect: typingsSlinky.kendoUi.kendo.geometry.Rect): typingsSlinky.kendoUi.kendo.drawing.Path = js.native
    def fromRect(rect: typingsSlinky.kendoUi.kendo.geometry.Rect, options: js.Any): typingsSlinky.kendoUi.kendo.drawing.Path = js.native
    def parse(svgPath: String): typingsSlinky.kendoUi.kendo.drawing.MultiPath = js.native
    def parse(svgPath: String, options: js.Any): typingsSlinky.kendoUi.kendo.drawing.MultiPath = js.native
  }
  
  /* static members */
  @js.native
  object Surface extends js.Object {
    def create(element: JQuery): typingsSlinky.kendoUi.kendo.drawing.Surface = js.native
    def create(element: JQuery, options: js.Any): typingsSlinky.kendoUi.kendo.drawing.Surface = js.native
    def create(element: typingsSlinky.kendoUi.kendo.dataviz.drawing.Element): typingsSlinky.kendoUi.kendo.drawing.Surface = js.native
    def create(element: typingsSlinky.kendoUi.kendo.dataviz.drawing.Element, options: js.Any): typingsSlinky.kendoUi.kendo.drawing.Surface = js.native
  }
  
}

