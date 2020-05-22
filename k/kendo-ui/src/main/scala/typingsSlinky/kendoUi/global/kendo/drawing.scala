package typingsSlinky.kendoUi.global.kendo

import typingsSlinky.kendoUi.JQuery
import typingsSlinky.kendoUi.JQueryPromise
import typingsSlinky.kendoUi.kendo.drawing.ArcOptions
import typingsSlinky.kendoUi.kendo.drawing.CircleOptions
import typingsSlinky.kendoUi.kendo.drawing.ElementOptions
import typingsSlinky.kendoUi.kendo.drawing.GradientOptions
import typingsSlinky.kendoUi.kendo.drawing.GradientStopOptions
import typingsSlinky.kendoUi.kendo.drawing.GroupOptions
import typingsSlinky.kendoUi.kendo.drawing.LayoutOptions
import typingsSlinky.kendoUi.kendo.drawing.LinearGradientOptions
import typingsSlinky.kendoUi.kendo.drawing.MultiPathOptions
import typingsSlinky.kendoUi.kendo.drawing.OptionsStoreOptions
import typingsSlinky.kendoUi.kendo.drawing.PDFOptions
import typingsSlinky.kendoUi.kendo.drawing.PathOptions
import typingsSlinky.kendoUi.kendo.drawing.RadialGradientOptions
import typingsSlinky.kendoUi.kendo.drawing.RectOptions
import typingsSlinky.kendoUi.kendo.drawing.SurfaceOptions
import typingsSlinky.kendoUi.kendo.drawing.TextOptions
import typingsSlinky.kendoUi.kendo.geometry.Point
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("kendo.drawing")
@js.native
object drawing extends js.Object {
  @js.native
  class Arc protected ()
    extends typingsSlinky.kendoUi.kendo.drawing.Arc {
    def this(geometry: typingsSlinky.kendoUi.kendo.geometry.Arc) = this()
    def this(geometry: typingsSlinky.kendoUi.kendo.geometry.Arc, options: ArcOptions) = this()
  }
  
  @js.native
  class Circle protected ()
    extends typingsSlinky.kendoUi.kendo.drawing.Circle {
    def this(geometry: typingsSlinky.kendoUi.kendo.geometry.Circle) = this()
    def this(geometry: typingsSlinky.kendoUi.kendo.geometry.Circle, options: CircleOptions) = this()
  }
  
  @js.native
  class Element ()
    extends typingsSlinky.kendoUi.kendo.drawing.Element {
    def this(options: ElementOptions) = this()
  }
  
  @js.native
  class Gradient ()
    extends typingsSlinky.kendoUi.kendo.drawing.Gradient {
    def this(options: GradientOptions) = this()
    /* CompleteClass */
    override var options: GradientOptions = js.native
    /* CompleteClass */
    override var stops: js.Any = js.native
    /* CompleteClass */
    override def addStop(offset: Double, color: String, opacity: Double): typingsSlinky.kendoUi.kendo.drawing.GradientStop = js.native
    /* CompleteClass */
    override def removeStop(stop: typingsSlinky.kendoUi.kendo.drawing.GradientStop): Unit = js.native
  }
  
  @js.native
  class GradientStop ()
    extends typingsSlinky.kendoUi.kendo.drawing.GradientStop {
    def this(options: GradientStopOptions) = this()
    /* CompleteClass */
    override var options: GradientStopOptions = js.native
  }
  
  @js.native
  class Group ()
    extends typingsSlinky.kendoUi.kendo.drawing.Group {
    def this(options: GroupOptions) = this()
  }
  
  @js.native
  class Image protected ()
    extends typingsSlinky.kendoUi.kendo.drawing.Image {
    def this(src: String, rect: typingsSlinky.kendoUi.kendo.geometry.Rect) = this()
  }
  
  @js.native
  class Layout protected ()
    extends typingsSlinky.kendoUi.kendo.drawing.Layout {
    def this(rect: typingsSlinky.kendoUi.kendo.geometry.Rect) = this()
    def this(rect: typingsSlinky.kendoUi.kendo.geometry.Rect, options: LayoutOptions) = this()
  }
  
  @js.native
  class LinearGradient ()
    extends typingsSlinky.kendoUi.kendo.drawing.LinearGradient {
    def this(options: LinearGradientOptions) = this()
    /* CompleteClass */
    override var options: GradientOptions = js.native
    /* CompleteClass */
    override var stops: js.Any = js.native
    /* CompleteClass */
    override def addStop(offset: Double, color: String, opacity: Double): typingsSlinky.kendoUi.kendo.drawing.GradientStop = js.native
    /* CompleteClass */
    override def removeStop(stop: typingsSlinky.kendoUi.kendo.drawing.GradientStop): Unit = js.native
  }
  
  @js.native
  class MultiPath ()
    extends typingsSlinky.kendoUi.kendo.drawing.MultiPath {
    def this(options: MultiPathOptions) = this()
  }
  
  @js.native
  class OptionsStore ()
    extends typingsSlinky.kendoUi.kendo.drawing.OptionsStore {
    def this(options: OptionsStoreOptions) = this()
    /* CompleteClass */
    override var observer: js.Any = js.native
    /* CompleteClass */
    override var options: OptionsStoreOptions = js.native
    /* CompleteClass */
    override def get(field: String): js.Any = js.native
    /* CompleteClass */
    override def set(field: String, value: js.Any): Unit = js.native
  }
  
  @js.native
  class Path ()
    extends typingsSlinky.kendoUi.kendo.drawing.Path {
    def this(options: PathOptions) = this()
  }
  
  @js.native
  class RadialGradient ()
    extends typingsSlinky.kendoUi.kendo.drawing.RadialGradient {
    def this(options: RadialGradientOptions) = this()
    /* CompleteClass */
    override var options: GradientOptions = js.native
    /* CompleteClass */
    override var stops: js.Any = js.native
    /* CompleteClass */
    override def addStop(offset: Double, color: String, opacity: Double): typingsSlinky.kendoUi.kendo.drawing.GradientStop = js.native
    /* CompleteClass */
    override def removeStop(stop: typingsSlinky.kendoUi.kendo.drawing.GradientStop): Unit = js.native
  }
  
  @js.native
  class Rect protected ()
    extends typingsSlinky.kendoUi.kendo.drawing.Rect {
    def this(geometry: typingsSlinky.kendoUi.kendo.geometry.Rect) = this()
    def this(geometry: typingsSlinky.kendoUi.kendo.geometry.Rect, options: RectOptions) = this()
  }
  
  @js.native
  class Segment protected ()
    extends typingsSlinky.kendoUi.kendo.drawing.Segment {
    def this(anchor: Point, controlIn: Point, controlOut: Point) = this()
  }
  
  @js.native
  class Surface ()
    extends typingsSlinky.kendoUi.kendo.drawing.Surface {
    def this(options: SurfaceOptions) = this()
  }
  
  @js.native
  class Text protected ()
    extends typingsSlinky.kendoUi.kendo.drawing.Text {
    def this(content: String, position: Point) = this()
    def this(content: String, position: Point, options: TextOptions) = this()
  }
  
  def align(elements: js.Any, rect: typingsSlinky.kendoUi.kendo.geometry.Rect, alignment: String): Unit = js.native
  def drawDOM(element: JQuery, options: js.Any): JQueryPromise[_] = js.native
  def exportImage(group: typingsSlinky.kendoUi.kendo.drawing.Group): JQueryPromise[_] = js.native
  def exportImage(group: typingsSlinky.kendoUi.kendo.drawing.Group, options: js.Any): JQueryPromise[_] = js.native
  def exportPDF(group: typingsSlinky.kendoUi.kendo.drawing.Group): JQueryPromise[_] = js.native
  def exportPDF(group: typingsSlinky.kendoUi.kendo.drawing.Group, options: PDFOptions): JQueryPromise[_] = js.native
  def exportSVG(group: typingsSlinky.kendoUi.kendo.drawing.Group): JQueryPromise[_] = js.native
  def exportSVG(group: typingsSlinky.kendoUi.kendo.drawing.Group, options: js.Any): JQueryPromise[_] = js.native
  def fit(
    element: typingsSlinky.kendoUi.kendo.drawing.Element,
    rect: typingsSlinky.kendoUi.kendo.geometry.Rect
  ): Unit = js.native
  def stack(elements: js.Any): Unit = js.native
  def vAlign(elements: js.Any, rect: typingsSlinky.kendoUi.kendo.geometry.Rect, alignment: String): Unit = js.native
  def vStack(elements: js.Any): Unit = js.native
  def vWrap(elements: js.Any, rect: typingsSlinky.kendoUi.kendo.geometry.Rect): js.Any = js.native
  def wrap(elements: js.Any, rect: typingsSlinky.kendoUi.kendo.geometry.Rect): js.Any = js.native
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
    def create(element: typingsSlinky.kendoUi.kendo.drawing.Element): typingsSlinky.kendoUi.kendo.drawing.Surface = js.native
    def create(element: typingsSlinky.kendoUi.kendo.drawing.Element, options: js.Any): typingsSlinky.kendoUi.kendo.drawing.Surface = js.native
  }
  
  @js.native
  object pdf extends js.Object {
    def saveAs(group: typingsSlinky.kendoUi.kendo.drawing.Group, fileName: String): Unit = js.native
    def saveAs(group: typingsSlinky.kendoUi.kendo.drawing.Group, fileName: String, proxyUrl: String): Unit = js.native
    def saveAs(
      group: typingsSlinky.kendoUi.kendo.drawing.Group,
      fileName: String,
      proxyUrl: String,
      callback: js.Function
    ): Unit = js.native
  }
  
}

