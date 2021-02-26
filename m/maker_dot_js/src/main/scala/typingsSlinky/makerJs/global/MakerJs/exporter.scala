package typingsSlinky.makerJs.global.MakerJs

import typingsSlinky.makerJs.MakerJs.IChain
import typingsSlinky.makerJs.MakerJs.IModel
import typingsSlinky.makerJs.MakerJs.IPath
import typingsSlinky.makerJs.MakerJs.IPathOriginFunctionMap
import typingsSlinky.makerJs.MakerJs.IPoint
import typingsSlinky.makerJs.MakerJs.exporter.IDXFRenderOptions
import typingsSlinky.makerJs.MakerJs.exporter.IOpenJsCadOptions
import typingsSlinky.makerJs.MakerJs.exporter.IPDFRenderOptions
import typingsSlinky.makerJs.MakerJs.exporter.IPathDataByLayerMap
import typingsSlinky.makerJs.MakerJs.exporter.ISVGRenderOptions
import typingsSlinky.makerJs.MakerJs.exporter.IXmlTagAttrs
import typingsSlinky.makerJs.MakerJs.exporter.svgUnitConversion
import typingsSlinky.pdfkit.PDFKit.PDFDocument
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object exporter {
  
  @JSGlobal("MakerJs.exporter")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Class to traverse an item 's models or paths and ultimately render each path.
    * @private
    */
  @JSGlobal("MakerJs.exporter.Exporter")
  @js.native
  class Exporter protected ()
    extends typingsSlinky.makerJs.MakerJs.exporter.Exporter {
    /**
      * @param map Object containing properties: property name is the type of path, e.g. "line", "circle"; property value
      * is a function to render a path. Function parameters are path and point.
      * @param fixPoint Optional function to modify a point prior to export. Function parameter is a point; function must return a point.
      * @param fixPath Optional function to modify a path prior to output. Function parameters are path and offset point; function must return a path.
      */
    def this(map: IPathOriginFunctionMap) = this()
    def this(map: IPathOriginFunctionMap, fixPoint: js.Function1[/* pointToFix */ IPoint, IPoint]) = this()
    def this(
      map: IPathOriginFunctionMap,
      fixPoint: js.UndefOr[scala.Nothing],
      fixPath: js.Function2[/* pathToFix */ IPath, /* origin */ IPoint, IPath]
    ) = this()
    def this(
      map: IPathOriginFunctionMap,
      fixPoint: js.Function1[/* pointToFix */ IPoint, IPoint],
      fixPath: js.Function2[/* pathToFix */ IPath, /* origin */ IPoint, IPath]
    ) = this()
    def this(
      map: IPathOriginFunctionMap,
      fixPoint: js.UndefOr[scala.Nothing],
      fixPath: js.UndefOr[scala.Nothing],
      beginModel: js.Function2[/* id */ String, /* modelContext */ IModel, Unit]
    ) = this()
    def this(
      map: IPathOriginFunctionMap,
      fixPoint: js.UndefOr[scala.Nothing],
      fixPath: js.Function2[/* pathToFix */ IPath, /* origin */ IPoint, IPath],
      beginModel: js.Function2[/* id */ String, /* modelContext */ IModel, Unit]
    ) = this()
    def this(
      map: IPathOriginFunctionMap,
      fixPoint: js.Function1[/* pointToFix */ IPoint, IPoint],
      fixPath: js.UndefOr[scala.Nothing],
      beginModel: js.Function2[/* id */ String, /* modelContext */ IModel, Unit]
    ) = this()
    def this(
      map: IPathOriginFunctionMap,
      fixPoint: js.Function1[/* pointToFix */ IPoint, IPoint],
      fixPath: js.Function2[/* pathToFix */ IPath, /* origin */ IPoint, IPath],
      beginModel: js.Function2[/* id */ String, /* modelContext */ IModel, Unit]
    ) = this()
    def this(
      map: IPathOriginFunctionMap,
      fixPoint: js.UndefOr[scala.Nothing],
      fixPath: js.UndefOr[scala.Nothing],
      beginModel: js.UndefOr[scala.Nothing],
      endModel: js.Function1[/* modelContext */ IModel, Unit]
    ) = this()
    def this(
      map: IPathOriginFunctionMap,
      fixPoint: js.UndefOr[scala.Nothing],
      fixPath: js.UndefOr[scala.Nothing],
      beginModel: js.Function2[/* id */ String, /* modelContext */ IModel, Unit],
      endModel: js.Function1[/* modelContext */ IModel, Unit]
    ) = this()
    def this(
      map: IPathOriginFunctionMap,
      fixPoint: js.UndefOr[scala.Nothing],
      fixPath: js.Function2[/* pathToFix */ IPath, /* origin */ IPoint, IPath],
      beginModel: js.UndefOr[scala.Nothing],
      endModel: js.Function1[/* modelContext */ IModel, Unit]
    ) = this()
    def this(
      map: IPathOriginFunctionMap,
      fixPoint: js.UndefOr[scala.Nothing],
      fixPath: js.Function2[/* pathToFix */ IPath, /* origin */ IPoint, IPath],
      beginModel: js.Function2[/* id */ String, /* modelContext */ IModel, Unit],
      endModel: js.Function1[/* modelContext */ IModel, Unit]
    ) = this()
    def this(
      map: IPathOriginFunctionMap,
      fixPoint: js.Function1[/* pointToFix */ IPoint, IPoint],
      fixPath: js.UndefOr[scala.Nothing],
      beginModel: js.UndefOr[scala.Nothing],
      endModel: js.Function1[/* modelContext */ IModel, Unit]
    ) = this()
    def this(
      map: IPathOriginFunctionMap,
      fixPoint: js.Function1[/* pointToFix */ IPoint, IPoint],
      fixPath: js.UndefOr[scala.Nothing],
      beginModel: js.Function2[/* id */ String, /* modelContext */ IModel, Unit],
      endModel: js.Function1[/* modelContext */ IModel, Unit]
    ) = this()
    def this(
      map: IPathOriginFunctionMap,
      fixPoint: js.Function1[/* pointToFix */ IPoint, IPoint],
      fixPath: js.Function2[/* pathToFix */ IPath, /* origin */ IPoint, IPath],
      beginModel: js.UndefOr[scala.Nothing],
      endModel: js.Function1[/* modelContext */ IModel, Unit]
    ) = this()
    def this(
      map: IPathOriginFunctionMap,
      fixPoint: js.Function1[/* pointToFix */ IPoint, IPoint],
      fixPath: js.Function2[/* pathToFix */ IPath, /* origin */ IPoint, IPath],
      beginModel: js.Function2[/* id */ String, /* modelContext */ IModel, Unit],
      endModel: js.Function1[/* modelContext */ IModel, Unit]
    ) = this()
  }
  
  /**
    * Class for an XML tag.
    * @private
    */
  @JSGlobal("MakerJs.exporter.XmlTag")
  @js.native
  class XmlTag protected ()
    extends typingsSlinky.makerJs.MakerJs.exporter.XmlTag {
    /**
      * @param name Name of the XML tag.
      * @param attrs Optional attributes for the tag.
      */
    def this(name: String) = this()
    def this(name: String, attrs: IXmlTagAttrs) = this()
  }
  object XmlTag {
    
    /**
      * Escapes certain characters within a string so that it can appear in a tag or its attribute.
      *
      * @returns Escaped string.
      */
    /* static member */
    @JSGlobal("MakerJs.exporter.XmlTag.escapeString")
    @js.native
    def escapeString(value: String): String = js.native
  }
  
  /**
    * Convert a chain to SVG path data.
    */
  @JSGlobal("MakerJs.exporter.chainToSVGPathData")
  @js.native
  def chainToSVGPathData(chain: IChain, offset: IPoint): String = js.native
  
  /**
    * Convert a path to SVG path data.
    */
  @JSGlobal("MakerJs.exporter.pathToSVGPathData")
  @js.native
  def pathToSVGPathData(pathToExport: IPath, offset: IPoint, offset2: IPoint): String = js.native
  
  /**
    * Map of MakerJs unit system to SVG unit system
    */
  @JSGlobal("MakerJs.exporter.svgUnit")
  @js.native
  def svgUnit: svgUnitConversion = js.native
  @scala.inline
  def svgUnit_=(x: svgUnitConversion): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("svgUnit")(x.asInstanceOf[js.Any])
  
  @JSGlobal("MakerJs.exporter.toDXF")
  @js.native
  def toDXF(modelToExport: IModel): String = js.native
  @JSGlobal("MakerJs.exporter.toDXF")
  @js.native
  def toDXF(modelToExport: IModel, options: IDXFRenderOptions): String = js.native
  @JSGlobal("MakerJs.exporter.toDXF")
  @js.native
  def toDXF(pathToExport: IPath): String = js.native
  @JSGlobal("MakerJs.exporter.toDXF")
  @js.native
  def toDXF(pathToExport: IPath, options: IDXFRenderOptions): String = js.native
  @JSGlobal("MakerJs.exporter.toDXF")
  @js.native
  def toDXF(pathsToExport: js.Array[IPath]): String = js.native
  @JSGlobal("MakerJs.exporter.toDXF")
  @js.native
  def toDXF(pathsToExport: js.Array[IPath], options: IDXFRenderOptions): String = js.native
  
  @JSGlobal("MakerJs.exporter.toOpenJsCad")
  @js.native
  def toOpenJsCad(modelToExport: IModel): String = js.native
  @JSGlobal("MakerJs.exporter.toOpenJsCad")
  @js.native
  def toOpenJsCad(modelToExport: IModel, options: IOpenJsCadOptions): String = js.native
  @JSGlobal("MakerJs.exporter.toOpenJsCad")
  @js.native
  def toOpenJsCad(pathToExport: IPath): String = js.native
  @JSGlobal("MakerJs.exporter.toOpenJsCad")
  @js.native
  def toOpenJsCad(pathToExport: IPath, options: IOpenJsCadOptions): String = js.native
  @JSGlobal("MakerJs.exporter.toOpenJsCad")
  @js.native
  def toOpenJsCad(pathsToExport: js.Array[IPath]): String = js.native
  @JSGlobal("MakerJs.exporter.toOpenJsCad")
  @js.native
  def toOpenJsCad(pathsToExport: js.Array[IPath], options: IOpenJsCadOptions): String = js.native
  
  /**
    * Injects drawing into a PDFKit document.
    *
    * @param modelToExport Model object to export.
    * @param options Export options object.
    * @returns String of PDF file contents.
    */
  @JSGlobal("MakerJs.exporter.toPDF")
  @js.native
  def toPDF(doc: PDFDocument, modelToExport: IModel): Unit = js.native
  @JSGlobal("MakerJs.exporter.toPDF")
  @js.native
  def toPDF(doc: PDFDocument, modelToExport: IModel, options: IPDFRenderOptions): Unit = js.native
  
  /**
    * Executes a JavaScript string with the OpenJsCad engine - converts 2D to 3D.
    *
    * @param modelToExport Model object to export.
    * @param options Export options object.
    * @param options.extrusion Height of 3D extrusion.
    * @param options.resolution Size of facets.
    * @returns String of STL format of 3D object.
    */
  @JSGlobal("MakerJs.exporter.toSTL")
  @js.native
  def toSTL(modelToExport: IModel): String = js.native
  @JSGlobal("MakerJs.exporter.toSTL")
  @js.native
  def toSTL(modelToExport: IModel, options: IOpenJsCadOptions): String = js.native
  
  @JSGlobal("MakerJs.exporter.toSVG")
  @js.native
  def toSVG(modelToExport: IModel): String = js.native
  @JSGlobal("MakerJs.exporter.toSVG")
  @js.native
  def toSVG(modelToExport: IModel, options: ISVGRenderOptions): String = js.native
  @JSGlobal("MakerJs.exporter.toSVG")
  @js.native
  def toSVG(pathToExport: IPath): String = js.native
  @JSGlobal("MakerJs.exporter.toSVG")
  @js.native
  def toSVG(pathToExport: IPath, options: ISVGRenderOptions): String = js.native
  @JSGlobal("MakerJs.exporter.toSVG")
  @js.native
  def toSVG(pathsToExport: js.Array[IPath]): String = js.native
  @JSGlobal("MakerJs.exporter.toSVG")
  @js.native
  def toSVG(pathsToExport: js.Array[IPath], options: ISVGRenderOptions): String = js.native
  
  /**
    * Convert a model to SVG path data.
    *
    * @param modelToExport Model to export.
    * @param byLayers Boolean flag (default true) to return a map of path data by layer.
    * @param origin Optional reference origin.
    * @returns String of SVG path data (if byLayers is false) or an object map of path data by layer .
    */
  @JSGlobal("MakerJs.exporter.toSVGPathData")
  @js.native
  def toSVGPathData(modelToExport: IModel): IPathDataByLayerMap | String = js.native
  @JSGlobal("MakerJs.exporter.toSVGPathData")
  @js.native
  def toSVGPathData(modelToExport: IModel, byLayers: js.UndefOr[scala.Nothing], origin: IPoint): IPathDataByLayerMap | String = js.native
  @JSGlobal("MakerJs.exporter.toSVGPathData")
  @js.native
  def toSVGPathData(modelToExport: IModel, byLayers: Boolean): IPathDataByLayerMap | String = js.native
  @JSGlobal("MakerJs.exporter.toSVGPathData")
  @js.native
  def toSVGPathData(modelToExport: IModel, byLayers: Boolean, origin: IPoint): IPathDataByLayerMap | String = js.native
  
  /**
    * Try to get the unit system from a model
    * @private
    */
  @JSGlobal("MakerJs.exporter.tryGetModelUnits")
  @js.native
  def tryGetModelUnits(itemToExport: js.Any): String = js.native
}
