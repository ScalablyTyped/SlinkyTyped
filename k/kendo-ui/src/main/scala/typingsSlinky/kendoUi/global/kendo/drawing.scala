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
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object drawing {
  
  @JSGlobal("kendo.drawing.Arc")
  @js.native
  class Arc protected ()
    extends typingsSlinky.kendoUi.kendo.drawing.Arc {
    def this(geometry: typingsSlinky.kendoUi.kendo.geometry.Arc) = this()
    def this(geometry: typingsSlinky.kendoUi.kendo.geometry.Arc, options: ArcOptions) = this()
  }
  
  @JSGlobal("kendo.drawing.Circle")
  @js.native
  class Circle protected ()
    extends typingsSlinky.kendoUi.kendo.drawing.Circle {
    def this(geometry: typingsSlinky.kendoUi.kendo.geometry.Circle) = this()
    def this(geometry: typingsSlinky.kendoUi.kendo.geometry.Circle, options: CircleOptions) = this()
  }
  
  @JSGlobal("kendo.drawing.Element")
  @js.native
  class Element ()
    extends typingsSlinky.kendoUi.kendo.drawing.Element {
    def this(options: ElementOptions) = this()
  }
  
  @JSGlobal("kendo.drawing.Gradient")
  @js.native
  class Gradient ()
    extends typingsSlinky.kendoUi.kendo.drawing.Gradient {
    def this(options: GradientOptions) = this()
  }
  
  @JSGlobal("kendo.drawing.GradientStop")
  @js.native
  class GradientStop ()
    extends typingsSlinky.kendoUi.kendo.drawing.GradientStop {
    def this(options: GradientStopOptions) = this()
  }
  
  @JSGlobal("kendo.drawing.Group")
  @js.native
  class Group ()
    extends typingsSlinky.kendoUi.kendo.drawing.Group {
    def this(options: GroupOptions) = this()
  }
  
  @JSGlobal("kendo.drawing.Image")
  @js.native
  class Image protected ()
    extends typingsSlinky.kendoUi.kendo.drawing.Image {
    def this(src: String, rect: typingsSlinky.kendoUi.kendo.geometry.Rect) = this()
  }
  
  @JSGlobal("kendo.drawing.Layout")
  @js.native
  class Layout protected ()
    extends typingsSlinky.kendoUi.kendo.drawing.Layout {
    def this(rect: typingsSlinky.kendoUi.kendo.geometry.Rect) = this()
    def this(rect: typingsSlinky.kendoUi.kendo.geometry.Rect, options: LayoutOptions) = this()
  }
  
  @JSGlobal("kendo.drawing.LinearGradient")
  @js.native
  class LinearGradient ()
    extends typingsSlinky.kendoUi.kendo.drawing.LinearGradient {
    def this(options: LinearGradientOptions) = this()
  }
  
  @JSGlobal("kendo.drawing.MultiPath")
  @js.native
  class MultiPath ()
    extends typingsSlinky.kendoUi.kendo.drawing.MultiPath {
    def this(options: MultiPathOptions) = this()
  }
  
  @JSGlobal("kendo.drawing.OptionsStore")
  @js.native
  class OptionsStore ()
    extends typingsSlinky.kendoUi.kendo.drawing.OptionsStore {
    def this(options: OptionsStoreOptions) = this()
  }
  
  @JSGlobal("kendo.drawing.Path")
  @js.native
  class Path ()
    extends typingsSlinky.kendoUi.kendo.drawing.Path {
    def this(options: PathOptions) = this()
  }
  object Path {
    
    /* static member */
    @JSGlobal("kendo.drawing.Path.fromArc")
    @js.native
    def fromArc(arc: typingsSlinky.kendoUi.kendo.geometry.Arc): typingsSlinky.kendoUi.kendo.drawing.Path = js.native
    @JSGlobal("kendo.drawing.Path.fromArc")
    @js.native
    def fromArc(arc: typingsSlinky.kendoUi.kendo.geometry.Arc, options: js.Any): typingsSlinky.kendoUi.kendo.drawing.Path = js.native
    
    /* static member */
    @JSGlobal("kendo.drawing.Path.fromPoints")
    @js.native
    def fromPoints(points: js.Any): typingsSlinky.kendoUi.kendo.drawing.Path = js.native
    @JSGlobal("kendo.drawing.Path.fromPoints")
    @js.native
    def fromPoints(points: js.Any, options: js.Any): typingsSlinky.kendoUi.kendo.drawing.Path = js.native
    
    /* static member */
    @JSGlobal("kendo.drawing.Path.fromRect")
    @js.native
    def fromRect(rect: typingsSlinky.kendoUi.kendo.geometry.Rect): typingsSlinky.kendoUi.kendo.drawing.Path = js.native
    @JSGlobal("kendo.drawing.Path.fromRect")
    @js.native
    def fromRect(rect: typingsSlinky.kendoUi.kendo.geometry.Rect, options: js.Any): typingsSlinky.kendoUi.kendo.drawing.Path = js.native
    
    /* static member */
    @JSGlobal("kendo.drawing.Path.parse")
    @js.native
    def parse(svgPath: String): typingsSlinky.kendoUi.kendo.drawing.MultiPath = js.native
    @JSGlobal("kendo.drawing.Path.parse")
    @js.native
    def parse(svgPath: String, options: js.Any): typingsSlinky.kendoUi.kendo.drawing.MultiPath = js.native
  }
  
  @JSGlobal("kendo.drawing.RadialGradient")
  @js.native
  class RadialGradient ()
    extends typingsSlinky.kendoUi.kendo.drawing.RadialGradient {
    def this(options: RadialGradientOptions) = this()
  }
  
  @JSGlobal("kendo.drawing.Rect")
  @js.native
  class Rect protected ()
    extends typingsSlinky.kendoUi.kendo.drawing.Rect {
    def this(geometry: typingsSlinky.kendoUi.kendo.geometry.Rect) = this()
    def this(geometry: typingsSlinky.kendoUi.kendo.geometry.Rect, options: RectOptions) = this()
  }
  
  @JSGlobal("kendo.drawing.Segment")
  @js.native
  class Segment protected ()
    extends typingsSlinky.kendoUi.kendo.drawing.Segment {
    def this(anchor: Point, controlIn: Point, controlOut: Point) = this()
  }
  
  @JSGlobal("kendo.drawing.Surface")
  @js.native
  class Surface ()
    extends typingsSlinky.kendoUi.kendo.drawing.Surface {
    def this(options: SurfaceOptions) = this()
  }
  object Surface {
    
    /* static member */
    @JSGlobal("kendo.drawing.Surface.create")
    @js.native
    def create(element: JQuery): typingsSlinky.kendoUi.kendo.drawing.Surface = js.native
    @JSGlobal("kendo.drawing.Surface.create")
    @js.native
    def create(element: JQuery, options: js.Any): typingsSlinky.kendoUi.kendo.drawing.Surface = js.native
    /* static member */
    @JSGlobal("kendo.drawing.Surface.create")
    @js.native
    def create(element: typingsSlinky.kendoUi.kendo.drawing.Element): typingsSlinky.kendoUi.kendo.drawing.Surface = js.native
    @JSGlobal("kendo.drawing.Surface.create")
    @js.native
    def create(element: typingsSlinky.kendoUi.kendo.drawing.Element, options: js.Any): typingsSlinky.kendoUi.kendo.drawing.Surface = js.native
  }
  
  @JSGlobal("kendo.drawing.Text")
  @js.native
  class Text protected ()
    extends typingsSlinky.kendoUi.kendo.drawing.Text {
    def this(content: String, position: Point) = this()
    def this(content: String, position: Point, options: TextOptions) = this()
  }
  
  @JSGlobal("kendo.drawing.align")
  @js.native
  def align(elements: js.Any, rect: typingsSlinky.kendoUi.kendo.geometry.Rect, alignment: String): Unit = js.native
  
  @JSGlobal("kendo.drawing.drawDOM")
  @js.native
  def drawDOM(element: JQuery, options: js.Any): JQueryPromise[_] = js.native
  
  @JSGlobal("kendo.drawing.exportImage")
  @js.native
  def exportImage(group: typingsSlinky.kendoUi.kendo.drawing.Group): JQueryPromise[_] = js.native
  @JSGlobal("kendo.drawing.exportImage")
  @js.native
  def exportImage(group: typingsSlinky.kendoUi.kendo.drawing.Group, options: js.Any): JQueryPromise[_] = js.native
  
  @JSGlobal("kendo.drawing.exportPDF")
  @js.native
  def exportPDF(group: typingsSlinky.kendoUi.kendo.drawing.Group): JQueryPromise[_] = js.native
  @JSGlobal("kendo.drawing.exportPDF")
  @js.native
  def exportPDF(group: typingsSlinky.kendoUi.kendo.drawing.Group, options: PDFOptions): JQueryPromise[_] = js.native
  
  @JSGlobal("kendo.drawing.exportSVG")
  @js.native
  def exportSVG(group: typingsSlinky.kendoUi.kendo.drawing.Group): JQueryPromise[_] = js.native
  @JSGlobal("kendo.drawing.exportSVG")
  @js.native
  def exportSVG(group: typingsSlinky.kendoUi.kendo.drawing.Group, options: js.Any): JQueryPromise[_] = js.native
  
  @JSGlobal("kendo.drawing.fit")
  @js.native
  def fit(
    element: typingsSlinky.kendoUi.kendo.drawing.Element,
    rect: typingsSlinky.kendoUi.kendo.geometry.Rect
  ): Unit = js.native
  
  object pdf {
    
    @JSGlobal("kendo.drawing.pdf.saveAs")
    @js.native
    def saveAs(group: typingsSlinky.kendoUi.kendo.drawing.Group, fileName: String): Unit = js.native
    @JSGlobal("kendo.drawing.pdf.saveAs")
    @js.native
    def saveAs(
      group: typingsSlinky.kendoUi.kendo.drawing.Group,
      fileName: String,
      proxyUrl: js.UndefOr[scala.Nothing],
      callback: js.Function
    ): Unit = js.native
    @JSGlobal("kendo.drawing.pdf.saveAs")
    @js.native
    def saveAs(group: typingsSlinky.kendoUi.kendo.drawing.Group, fileName: String, proxyUrl: String): Unit = js.native
    @JSGlobal("kendo.drawing.pdf.saveAs")
    @js.native
    def saveAs(
      group: typingsSlinky.kendoUi.kendo.drawing.Group,
      fileName: String,
      proxyUrl: String,
      callback: js.Function
    ): Unit = js.native
  }
  
  @JSGlobal("kendo.drawing.stack")
  @js.native
  def stack(elements: js.Any): Unit = js.native
  
  @JSGlobal("kendo.drawing.vAlign")
  @js.native
  def vAlign(elements: js.Any, rect: typingsSlinky.kendoUi.kendo.geometry.Rect, alignment: String): Unit = js.native
  
  @JSGlobal("kendo.drawing.vStack")
  @js.native
  def vStack(elements: js.Any): Unit = js.native
  
  @JSGlobal("kendo.drawing.vWrap")
  @js.native
  def vWrap(elements: js.Any, rect: typingsSlinky.kendoUi.kendo.geometry.Rect): js.Any = js.native
  
  @JSGlobal("kendo.drawing.wrap")
  @js.native
  def wrap(elements: js.Any, rect: typingsSlinky.kendoUi.kendo.geometry.Rect): js.Any = js.native
}
