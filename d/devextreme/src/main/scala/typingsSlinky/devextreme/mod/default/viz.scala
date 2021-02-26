package typingsSlinky.devextreme.mod.default

import org.scalajs.dom.raw.Element
import typingsSlinky.devextreme.anon.BackgroundColor
import typingsSlinky.devextreme.anon.BaseColorSet
import typingsSlinky.devextreme.anon.FileName
import typingsSlinky.devextreme.devextremeStrings.Bright
import typingsSlinky.devextreme.devextremeStrings.Carmine
import typingsSlinky.devextreme.devextremeStrings.Material
import typingsSlinky.devextreme.devextremeStrings.Ocean
import typingsSlinky.devextreme.devextremeStrings.Office
import typingsSlinky.devextreme.devextremeStrings.Pastel
import typingsSlinky.devextreme.devextremeStrings.Soft
import typingsSlinky.devextreme.devextremeStrings.Vintage
import typingsSlinky.devextreme.devextremeStrings.Violet
import typingsSlinky.devextreme.devextremeStrings.`Dark Moon`
import typingsSlinky.devextreme.devextremeStrings.`Dark Violet`
import typingsSlinky.devextreme.devextremeStrings.`Green Mist`
import typingsSlinky.devextreme.devextremeStrings.`Harmony Light`
import typingsSlinky.devextreme.devextremeStrings.`Soft Blue`
import typingsSlinky.devextreme.devextremeStrings.`Soft Pastel`
import typingsSlinky.devextreme.devextremeStrings.equirectangular
import typingsSlinky.devextreme.devextremeStrings.lambert
import typingsSlinky.devextreme.devextremeStrings.mercator
import typingsSlinky.devextreme.devextremeStrings.miller
import typingsSlinky.devextreme.mod.DevExpress.viz.BaseChartOptions
import typingsSlinky.devextreme.mod.DevExpress.viz.BaseGaugeOptions
import typingsSlinky.devextreme.mod.DevExpress.viz.BaseSparklineOptions
import typingsSlinky.devextreme.mod.DevExpress.viz.BaseWidgetOptions
import typingsSlinky.devextreme.mod.DevExpress.viz.VectorMapProjectionConfig
import typingsSlinky.devextreme.mod.DevExpress.viz.dxBarGaugeOptions
import typingsSlinky.devextreme.mod.DevExpress.viz.dxBulletOptions
import typingsSlinky.devextreme.mod.DevExpress.viz.dxChartOptions
import typingsSlinky.devextreme.mod.DevExpress.viz.dxCircularGaugeOptions
import typingsSlinky.devextreme.mod.DevExpress.viz.dxFunnelOptions
import typingsSlinky.devextreme.mod.DevExpress.viz.dxLinearGaugeOptions
import typingsSlinky.devextreme.mod.DevExpress.viz.dxPieChartOptions
import typingsSlinky.devextreme.mod.DevExpress.viz.dxPolarChartOptions
import typingsSlinky.devextreme.mod.DevExpress.viz.dxRangeSelectorOptions
import typingsSlinky.devextreme.mod.DevExpress.viz.dxSankeyOptions
import typingsSlinky.devextreme.mod.DevExpress.viz.dxSparklineOptions
import typingsSlinky.devextreme.mod.DevExpress.viz.dxTreeMapOptions
import typingsSlinky.devextreme.mod.DevExpress.viz.dxVectorMapOptions
import typingsSlinky.devextreme.mod.global.JQuery
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("devextreme", "default.viz")
@js.native
class viz ()
  extends typingsSlinky.devextreme.mod.DevExpress.viz
/* static members */
object viz {
  
  @JSImport("devextreme", "default.viz.BaseChart")
  @js.native
  class BaseChart protected ()
    extends typingsSlinky.devextreme.mod.DevExpress.viz.BaseChart {
    def this(element: Element) = this()
    def this(element: JQuery) = this()
    def this(element: Element, options: BaseChartOptions[typingsSlinky.devextreme.mod.DevExpress.viz.BaseChart]) = this()
    def this(element: JQuery, options: BaseChartOptions[typingsSlinky.devextreme.mod.DevExpress.viz.BaseChart]) = this()
  }
  
  @JSImport("devextreme", "default.viz.BaseGauge")
  @js.native
  class BaseGauge protected ()
    extends typingsSlinky.devextreme.mod.DevExpress.viz.BaseGauge {
    def this(element: Element) = this()
    def this(element: JQuery) = this()
    def this(element: Element, options: BaseGaugeOptions[typingsSlinky.devextreme.mod.DevExpress.viz.BaseGauge]) = this()
    def this(element: JQuery, options: BaseGaugeOptions[typingsSlinky.devextreme.mod.DevExpress.viz.BaseGauge]) = this()
  }
  
  @JSImport("devextreme", "default.viz.BaseSparkline")
  @js.native
  class BaseSparkline protected ()
    extends typingsSlinky.devextreme.mod.DevExpress.viz.BaseWidget {
    def this(element: Element) = this()
    def this(element: JQuery) = this()
    def this(
      element: Element,
      options: BaseSparklineOptions[typingsSlinky.devextreme.mod.DevExpress.viz.BaseSparkline]
    ) = this()
    def this(
      element: JQuery,
      options: BaseSparklineOptions[typingsSlinky.devextreme.mod.DevExpress.viz.BaseSparkline]
    ) = this()
  }
  
  @JSImport("devextreme", "default.viz.BaseWidget")
  @js.native
  class BaseWidget protected ()
    extends typingsSlinky.devextreme.mod.DevExpress.viz.BaseWidget {
    def this(element: Element) = this()
    def this(element: JQuery) = this()
    def this(
      element: Element,
      options: BaseWidgetOptions[typingsSlinky.devextreme.mod.DevExpress.viz.BaseWidget]
    ) = this()
    def this(
      element: JQuery,
      options: BaseWidgetOptions[typingsSlinky.devextreme.mod.DevExpress.viz.BaseWidget]
    ) = this()
  }
  
  @JSImport("devextreme", "default.viz.MapLayer")
  @js.native
  class MapLayer ()
    extends typingsSlinky.devextreme.mod.DevExpress.viz.MapLayer
  
  @JSImport("devextreme", "default.viz.MapLayerElement")
  @js.native
  class MapLayerElement ()
    extends typingsSlinky.devextreme.mod.DevExpress.viz.MapLayerElement
  
  @JSImport("devextreme", "default.viz.baseLabelObject")
  @js.native
  class baseLabelObject ()
    extends typingsSlinky.devextreme.mod.DevExpress.viz.baseLabelObject
  
  @JSImport("devextreme", "default.viz.basePointObject")
  @js.native
  class basePointObject ()
    extends typingsSlinky.devextreme.mod.DevExpress.viz.basePointObject
  
  @JSImport("devextreme", "default.viz.baseSeriesObject")
  @js.native
  class baseSeriesObject ()
    extends typingsSlinky.devextreme.mod.DevExpress.viz.baseSeriesObject
  
  @JSImport("devextreme", "default.viz.chartAxisObject")
  @js.native
  class chartAxisObject ()
    extends typingsSlinky.devextreme.mod.DevExpress.viz.chartAxisObject
  
  @JSImport("devextreme", "default.viz.chartPointObject")
  @js.native
  class chartPointObject ()
    extends typingsSlinky.devextreme.mod.DevExpress.viz.chartPointObject
  
  @JSImport("devextreme", "default.viz.chartSeriesObject")
  @js.native
  class chartSeriesObject ()
    extends typingsSlinky.devextreme.mod.DevExpress.viz.chartSeriesObject
  
  /**
    * [descr:viz.currentPalette()]
    */
  @JSImport("devextreme", "default.viz.currentPalette")
  @js.native
  def currentPalette(): String = js.native
  /**
    * [descr:viz.currentPalette(paletteName)]
    */
  @JSImport("devextreme", "default.viz.currentPalette")
  @js.native
  def currentPalette(paletteName: String): Unit = js.native
  
  /**
    * [descr:viz.currentTheme()]
    */
  @JSImport("devextreme", "default.viz.currentTheme")
  @js.native
  def currentTheme(): String = js.native
  /**
    * [descr:viz.currentTheme(platform, colorScheme)]
    */
  @JSImport("devextreme", "default.viz.currentTheme")
  @js.native
  def currentTheme(platform: String, colorScheme: String): Unit = js.native
  /**
    * [descr:viz.currentTheme(theme)]
    */
  @JSImport("devextreme", "default.viz.currentTheme")
  @js.native
  def currentTheme(theme: String): Unit = js.native
  
  @JSImport("devextreme", "default.viz.dxBarGauge")
  @js.native
  class dxBarGauge protected ()
    extends typingsSlinky.devextreme.mod.DevExpress.viz.dxBarGauge {
    def this(element: Element) = this()
    def this(element: JQuery) = this()
    def this(element: Element, options: dxBarGaugeOptions) = this()
    def this(element: JQuery, options: dxBarGaugeOptions) = this()
  }
  
  @JSImport("devextreme", "default.viz.dxBullet")
  @js.native
  class dxBullet protected ()
    extends typingsSlinky.devextreme.mod.DevExpress.viz.BaseWidget {
    def this(element: Element) = this()
    def this(element: JQuery) = this()
    def this(element: Element, options: dxBulletOptions) = this()
    def this(element: JQuery, options: dxBulletOptions) = this()
  }
  
  @JSImport("devextreme", "default.viz.dxChart")
  @js.native
  class dxChart protected ()
    extends typingsSlinky.devextreme.mod.DevExpress.viz.dxChart {
    def this(element: Element) = this()
    def this(element: JQuery) = this()
    def this(element: Element, options: dxChartOptions) = this()
    def this(element: JQuery, options: dxChartOptions) = this()
  }
  
  @JSImport("devextreme", "default.viz.dxCircularGauge")
  @js.native
  class dxCircularGauge protected ()
    extends typingsSlinky.devextreme.mod.DevExpress.viz.BaseGauge {
    def this(element: Element) = this()
    def this(element: JQuery) = this()
    def this(element: Element, options: dxCircularGaugeOptions) = this()
    def this(element: JQuery, options: dxCircularGaugeOptions) = this()
  }
  
  @JSImport("devextreme", "default.viz.dxFunnel")
  @js.native
  class dxFunnel protected ()
    extends typingsSlinky.devextreme.mod.DevExpress.viz.dxFunnel {
    def this(element: Element) = this()
    def this(element: JQuery) = this()
    def this(element: Element, options: dxFunnelOptions) = this()
    def this(element: JQuery, options: dxFunnelOptions) = this()
  }
  
  @JSImport("devextreme", "default.viz.dxFunnelItem")
  @js.native
  class dxFunnelItem ()
    extends typingsSlinky.devextreme.mod.DevExpress.viz.dxFunnelItem
  
  @JSImport("devextreme", "default.viz.dxLinearGauge")
  @js.native
  class dxLinearGauge protected ()
    extends typingsSlinky.devextreme.mod.DevExpress.viz.BaseGauge {
    def this(element: Element) = this()
    def this(element: JQuery) = this()
    def this(element: Element, options: dxLinearGaugeOptions) = this()
    def this(element: JQuery, options: dxLinearGaugeOptions) = this()
  }
  
  @JSImport("devextreme", "default.viz.dxPieChart")
  @js.native
  class dxPieChart protected ()
    extends typingsSlinky.devextreme.mod.DevExpress.viz.dxPieChart {
    def this(element: Element) = this()
    def this(element: JQuery) = this()
    def this(element: Element, options: dxPieChartOptions) = this()
    def this(element: JQuery, options: dxPieChartOptions) = this()
  }
  
  @JSImport("devextreme", "default.viz.dxPolarChart")
  @js.native
  class dxPolarChart protected ()
    extends typingsSlinky.devextreme.mod.DevExpress.viz.dxPolarChart {
    def this(element: Element) = this()
    def this(element: JQuery) = this()
    def this(element: Element, options: dxPolarChartOptions) = this()
    def this(element: JQuery, options: dxPolarChartOptions) = this()
  }
  
  @JSImport("devextreme", "default.viz.dxRangeSelector")
  @js.native
  class dxRangeSelector protected ()
    extends typingsSlinky.devextreme.mod.DevExpress.viz.dxRangeSelector {
    def this(element: Element) = this()
    def this(element: JQuery) = this()
    def this(element: Element, options: dxRangeSelectorOptions) = this()
    def this(element: JQuery, options: dxRangeSelectorOptions) = this()
  }
  
  @JSImport("devextreme", "default.viz.dxSankey")
  @js.native
  class dxSankey protected ()
    extends typingsSlinky.devextreme.mod.DevExpress.viz.dxSankey {
    def this(element: Element) = this()
    def this(element: JQuery) = this()
    def this(element: Element, options: dxSankeyOptions) = this()
    def this(element: JQuery, options: dxSankeyOptions) = this()
  }
  
  @JSImport("devextreme", "default.viz.dxSankeyLink")
  @js.native
  class dxSankeyLink ()
    extends typingsSlinky.devextreme.mod.DevExpress.viz.dxSankeyLink
  
  @JSImport("devextreme", "default.viz.dxSankeyNode")
  @js.native
  class dxSankeyNode ()
    extends typingsSlinky.devextreme.mod.DevExpress.viz.dxSankeyNode
  
  @JSImport("devextreme", "default.viz.dxSparkline")
  @js.native
  class dxSparkline protected ()
    extends typingsSlinky.devextreme.mod.DevExpress.viz.dxSparkline {
    def this(element: Element) = this()
    def this(element: JQuery) = this()
    def this(element: Element, options: dxSparklineOptions) = this()
    def this(element: JQuery, options: dxSparklineOptions) = this()
  }
  
  @JSImport("devextreme", "default.viz.dxTreeMap")
  @js.native
  class dxTreeMap protected ()
    extends typingsSlinky.devextreme.mod.DevExpress.viz.dxTreeMap {
    def this(element: Element) = this()
    def this(element: JQuery) = this()
    def this(element: Element, options: dxTreeMapOptions) = this()
    def this(element: JQuery, options: dxTreeMapOptions) = this()
  }
  
  @JSImport("devextreme", "default.viz.dxTreeMapNode")
  @js.native
  class dxTreeMapNode ()
    extends typingsSlinky.devextreme.mod.DevExpress.viz.dxTreeMapNode
  
  @JSImport("devextreme", "default.viz.dxVectorMap")
  @js.native
  class dxVectorMap protected ()
    extends typingsSlinky.devextreme.mod.DevExpress.viz.dxVectorMap {
    def this(element: Element) = this()
    def this(element: JQuery) = this()
    def this(element: Element, options: dxVectorMapOptions) = this()
    def this(element: JQuery, options: dxVectorMapOptions) = this()
  }
  
  /**
    * [descr:viz.exportFromMarkup(markup, options)]
    */
  @JSImport("devextreme", "default.viz.exportFromMarkup")
  @js.native
  def exportFromMarkup(markup: String, options: BackgroundColor): Unit = js.native
  
  /**
    * [descr:viz.exportWidgets(widgetInstances)]
    */
  @JSImport("devextreme", "default.viz.exportWidgets")
  @js.native
  def exportWidgets(widgetInstances: js.Array[js.Array[typingsSlinky.devextreme.mod.DevExpress.DOMComponent]]): Unit = js.native
  /**
    * [descr:viz.exportWidgets(widgetInstances, options)]
    */
  @JSImport("devextreme", "default.viz.exportWidgets")
  @js.native
  def exportWidgets(
    widgetInstances: js.Array[js.Array[typingsSlinky.devextreme.mod.DevExpress.DOMComponent]],
    options: FileName
  ): Unit = js.native
  
  @JSImport("devextreme", "default.viz.generateColors")
  @js.native
  def generateColors(palette: js.Array[String], count: Double, options: BaseColorSet): js.Array[String] = js.native
  /**
    * [descr:viz.generateColors(palette, count, options)]
    */
  @JSImport("devextreme", "default.viz.generateColors")
  @js.native
  def generateColors_Bright(palette: Bright, count: Double, options: BaseColorSet): js.Array[String] = js.native
  @JSImport("devextreme", "default.viz.generateColors")
  @js.native
  def generateColors_Carmine(palette: Carmine, count: Double, options: BaseColorSet): js.Array[String] = js.native
  @JSImport("devextreme", "default.viz.generateColors")
  @js.native
  def generateColors_DarkMoon(palette: `Dark Moon`, count: Double, options: BaseColorSet): js.Array[String] = js.native
  @JSImport("devextreme", "default.viz.generateColors")
  @js.native
  def generateColors_DarkViolet(palette: `Dark Violet`, count: Double, options: BaseColorSet): js.Array[String] = js.native
  @JSImport("devextreme", "default.viz.generateColors")
  @js.native
  def generateColors_GreenMist(palette: `Green Mist`, count: Double, options: BaseColorSet): js.Array[String] = js.native
  @JSImport("devextreme", "default.viz.generateColors")
  @js.native
  def generateColors_HarmonyLight(palette: `Harmony Light`, count: Double, options: BaseColorSet): js.Array[String] = js.native
  @JSImport("devextreme", "default.viz.generateColors")
  @js.native
  def generateColors_Material(palette: Material, count: Double, options: BaseColorSet): js.Array[String] = js.native
  @JSImport("devextreme", "default.viz.generateColors")
  @js.native
  def generateColors_Ocean(palette: Ocean, count: Double, options: BaseColorSet): js.Array[String] = js.native
  @JSImport("devextreme", "default.viz.generateColors")
  @js.native
  def generateColors_Office(palette: Office, count: Double, options: BaseColorSet): js.Array[String] = js.native
  @JSImport("devextreme", "default.viz.generateColors")
  @js.native
  def generateColors_Pastel(palette: Pastel, count: Double, options: BaseColorSet): js.Array[String] = js.native
  @JSImport("devextreme", "default.viz.generateColors")
  @js.native
  def generateColors_Soft(palette: Soft, count: Double, options: BaseColorSet): js.Array[String] = js.native
  @JSImport("devextreme", "default.viz.generateColors")
  @js.native
  def generateColors_SoftBlue(palette: `Soft Blue`, count: Double, options: BaseColorSet): js.Array[String] = js.native
  @JSImport("devextreme", "default.viz.generateColors")
  @js.native
  def generateColors_SoftPastel(palette: `Soft Pastel`, count: Double, options: BaseColorSet): js.Array[String] = js.native
  @JSImport("devextreme", "default.viz.generateColors")
  @js.native
  def generateColors_Vintage(palette: Vintage, count: Double, options: BaseColorSet): js.Array[String] = js.native
  @JSImport("devextreme", "default.viz.generateColors")
  @js.native
  def generateColors_Violet(palette: Violet, count: Double, options: BaseColorSet): js.Array[String] = js.native
  
  /**
    * [descr:viz.getMarkup(widgetInstances)]
    */
  @JSImport("devextreme", "default.viz.getMarkup")
  @js.native
  def getMarkup(widgetInstances: js.Array[typingsSlinky.devextreme.mod.DevExpress.DOMComponent]): String = js.native
  
  /**
    * [descr:viz.getPalette(paletteName)]
    */
  @JSImport("devextreme", "default.viz.getPalette")
  @js.native
  def getPalette(paletteName: String): js.Any = js.native
  
  /**
    * [descr:viz.getTheme(theme)]
    */
  @JSImport("devextreme", "default.viz.getTheme")
  @js.native
  def getTheme(theme: String): js.Any = js.native
  
  object map {
    
    object projection {
      
      @JSImport("devextreme", "default.viz.map.projection")
      @js.native
      def apply(data: VectorMapProjectionConfig): js.Any = js.native
      
      @JSImport("devextreme", "default.viz.map.projection.add")
      @js.native
      def add(name: String, projection: js.Any): Unit = js.native
      @JSImport("devextreme", "default.viz.map.projection.add")
      @js.native
      def add(name: String, projection: VectorMapProjectionConfig): Unit = js.native
      
      @JSImport("devextreme", "default.viz.map.projection.get")
      @js.native
      def get(name: String): js.Any = js.native
      @JSImport("devextreme", "default.viz.map.projection.get")
      @js.native
      def get_equirectangular(name: equirectangular): js.Any = js.native
      @JSImport("devextreme", "default.viz.map.projection.get")
      @js.native
      def get_lambert(name: lambert): js.Any = js.native
      @JSImport("devextreme", "default.viz.map.projection.get")
      @js.native
      def get_mercator(name: mercator): js.Any = js.native
      @JSImport("devextreme", "default.viz.map.projection.get")
      @js.native
      def get_miller(name: miller): js.Any = js.native
    }
  }
  
  @JSImport("devextreme", "default.viz.pieChartSeriesObject")
  @js.native
  class pieChartSeriesObject ()
    extends typingsSlinky.devextreme.mod.DevExpress.viz.baseSeriesObject
  
  @JSImport("devextreme", "default.viz.piePointObject")
  @js.native
  class piePointObject ()
    extends typingsSlinky.devextreme.mod.DevExpress.viz.piePointObject
  
  @JSImport("devextreme", "default.viz.polarChartSeriesObject")
  @js.native
  class polarChartSeriesObject ()
    extends typingsSlinky.devextreme.mod.DevExpress.viz.baseSeriesObject
  
  @JSImport("devextreme", "default.viz.polarPointObject")
  @js.native
  class polarPointObject ()
    extends typingsSlinky.devextreme.mod.DevExpress.viz.basePointObject
  
  /**
    * [descr:viz.refreshPaths()]
    */
  @JSImport("devextreme", "default.viz.refreshPaths")
  @js.native
  def refreshPaths(): Unit = js.native
  
  /**
    * [descr:viz.refreshTheme()]
    */
  @JSImport("devextreme", "default.viz.refreshTheme")
  @js.native
  def refreshTheme(): Unit = js.native
  
  /**
    * [descr:viz.registerPalette(paletteName, palette)]
    */
  @JSImport("devextreme", "default.viz.registerPalette")
  @js.native
  def registerPalette(paletteName: String, palette: js.Any): Unit = js.native
  
  /**
    * [descr:viz.registerTheme(customTheme, baseTheme)]
    */
  @JSImport("devextreme", "default.viz.registerTheme")
  @js.native
  def registerTheme(customTheme: js.Any, baseTheme: String): Unit = js.native
}
