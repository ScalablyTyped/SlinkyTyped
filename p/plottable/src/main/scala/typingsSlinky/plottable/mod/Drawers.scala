package typingsSlinky.plottable.mod

import org.scalajs.dom.raw.CanvasRenderingContext2D
import typingsSlinky.d3Shape.mod.Area_
import typingsSlinky.d3Shape.mod.Line_
import typingsSlinky.plottable.canvasBufferMod.CanvasBuffer
import typingsSlinky.plottable.canvasDrawerMod.CanvasDrawStep
import typingsSlinky.plottable.canvasDrawerMod.IFillStyle
import typingsSlinky.plottable.canvasDrawerMod.IStrokeStyle
import typingsSlinky.plottable.interfacesMod.AttributeToAppliedProjector
import typingsSlinky.plottable.interfacesMod.IAccessor
import typingsSlinky.plottable.symbolFactoriesMod.SymbolFactory
import typingsSlinky.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Drawers {
  
  @JSImport("plottable", "Drawers.ArcOutlineSVGDrawer")
  @js.native
  class ArcOutlineSVGDrawer ()
    extends typingsSlinky.plottable.drawersMod.ArcOutlineSVGDrawer
  
  @JSImport("plottable", "Drawers.ArcSVGDrawer")
  @js.native
  class ArcSVGDrawer ()
    extends typingsSlinky.plottable.drawersMod.ArcSVGDrawer
  
  @JSImport("plottable", "Drawers.AreaSVGDrawer")
  @js.native
  class AreaSVGDrawer ()
    extends typingsSlinky.plottable.drawersMod.AreaSVGDrawer
  
  @JSImport("plottable", "Drawers.CanvasDrawer")
  @js.native
  class CanvasDrawer protected ()
    extends typingsSlinky.plottable.drawersMod.CanvasDrawer {
    /**
      * @param _context The context for a canvas that this drawer will draw to.
      * @param _drawStep The draw step logic that actually draws.
      */
    def this(_context: CanvasRenderingContext2D, _drawStep: CanvasDrawStep) = this()
  }
  
  @JSImport("plottable", "Drawers.ContextStyleAttrs")
  @js.native
  val ContextStyleAttrs: js.Array[String] = js.native
  
  @JSImport("plottable", "Drawers.LineSVGDrawer")
  @js.native
  class LineSVGDrawer ()
    extends typingsSlinky.plottable.drawersMod.LineSVGDrawer
  
  @JSImport("plottable", "Drawers.ProxyDrawer")
  @js.native
  class ProxyDrawer protected ()
    extends typingsSlinky.plottable.drawersMod.ProxyDrawer {
    /**
      * A Drawer draws svg elements based on the input Dataset.
      *
      * @constructor
      * @param _svgDrawerFactory A factory that will be invoked to create an SVGDrawer whenever useSVG is called
      * @param _canvasDrawStep The DrawStep to be fed into a new CanvasDrawer whenever useCanvas is called
      */
    def this(
      _svgDrawerFactory: js.Function0[typingsSlinky.plottable.svgDrawerMod.SVGDrawer],
      _canvasDrawerFactory: js.Function1[
            /* ctx */ CanvasRenderingContext2D, 
            typingsSlinky.plottable.canvasDrawerMod.CanvasDrawer
          ]
    ) = this()
  }
  
  @JSImport("plottable", "Drawers.RectangleCanvasDrawStep")
  @js.native
  val RectangleCanvasDrawStep: CanvasDrawStep = js.native
  
  @JSImport("plottable", "Drawers.RectangleCanvasDrawer")
  @js.native
  class RectangleCanvasDrawer protected ()
    extends typingsSlinky.plottable.drawersMod.RectangleCanvasDrawer {
    def this(ctx: CanvasRenderingContext2D) = this()
  }
  
  @JSImport("plottable", "Drawers.RectangleSVGDrawer")
  @js.native
  class RectangleSVGDrawer ()
    extends typingsSlinky.plottable.drawersMod.RectangleSVGDrawer {
    def this(_rootClassName: String) = this()
  }
  
  @JSImport("plottable", "Drawers.SVGDrawer")
  @js.native
  class SVGDrawer protected ()
    extends typingsSlinky.plottable.drawersMod.SVGDrawer {
    /**
      * @param svgElementName an HTML/SVG tag name to be created, one per datum.
      * @param className CSS classes to be applied to the drawn primitives.
      * @param applyDefaultAttributes
      */
    def this(svgElementName: String, className: String) = this()
  }
  
  @JSImport("plottable", "Drawers.SegmentSVGDrawer")
  @js.native
  class SegmentSVGDrawer ()
    extends typingsSlinky.plottable.drawersMod.SegmentSVGDrawer
  
  @JSImport("plottable", "Drawers.SymbolSVGDrawer")
  @js.native
  class SymbolSVGDrawer ()
    extends typingsSlinky.plottable.drawersMod.SymbolSVGDrawer
  
  @JSImport("plottable", "Drawers.getStrokeDashArray")
  @js.native
  def getStrokeDashArray(style: Record[String, _]): js.Array[Double] = js.native
  
  @JSImport("plottable", "Drawers.getStrokeWidth")
  @js.native
  def getStrokeWidth(style: Record[String, _]): Double = js.native
  
  @JSImport("plottable", "Drawers.makeAreaCanvasDrawStep")
  @js.native
  def makeAreaCanvasDrawStep(d3AreaFactory: js.Function0[Area_[_]], d3LineFactory: js.Function0[Line_[_]]): CanvasDrawStep = js.native
  
  @JSImport("plottable", "Drawers.makeLineCanvasDrawStep")
  @js.native
  def makeLineCanvasDrawStep(d3LineFactory: js.Function0[Line_[_]]): CanvasDrawStep = js.native
  
  @JSImport("plottable", "Drawers.makeSymbolCanvasDrawStep")
  @js.native
  def makeSymbolCanvasDrawStep(
    dataset: typingsSlinky.plottable.datasetMod.Dataset,
    symbolProjector: js.Function0[IAccessor[SymbolFactory]],
    sizeProjector: js.Function0[IAccessor[Double]]
  ): CanvasDrawStep = js.native
  @JSImport("plottable", "Drawers.makeSymbolCanvasDrawStep")
  @js.native
  def makeSymbolCanvasDrawStep(
    dataset: typingsSlinky.plottable.datasetMod.Dataset,
    symbolProjector: js.Function0[IAccessor[SymbolFactory]],
    sizeProjector: js.Function0[IAccessor[Double]],
    stepBuffer: CanvasBuffer
  ): CanvasDrawStep = js.native
  
  @JSImport("plottable", "Drawers.renderArea")
  @js.native
  def renderArea(
    context: CanvasRenderingContext2D,
    d3Area: Area_[_],
    data: js.Array[_],
    style: IFillStyle with IStrokeStyle
  ): Unit = js.native
  
  @JSImport("plottable", "Drawers.renderLine")
  @js.native
  def renderLine(context: CanvasRenderingContext2D, d3Line: Line_[_], data: js.Array[_], style: IStrokeStyle): Unit = js.native
  
  @JSImport("plottable", "Drawers.renderPathWithStyle")
  @js.native
  def renderPathWithStyle(context: CanvasRenderingContext2D, style: Record[String, _]): Unit = js.native
  
  @JSImport("plottable", "Drawers.resolveAttributes")
  @js.native
  def resolveAttributes(projector: AttributeToAppliedProjector, attrKeys: js.Array[String], datum: js.Any, index: Double): Record[String, _] = js.native
  
  @JSImport("plottable", "Drawers.resolveAttributesSubsetWithStyles")
  @js.native
  def resolveAttributesSubsetWithStyles(projector: AttributeToAppliedProjector, extraKeys: js.Array[String], datum: js.Any, index: Double): Record[String, _] = js.native
}
