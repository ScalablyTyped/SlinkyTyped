package typingsSlinky.echarts

import org.scalablytyped.runtime.Shortcut
import org.scalajs.dom.raw.HTMLCanvasElement
import org.scalajs.dom.raw.HTMLDivElement
import typingsSlinky.echarts.anon.DevicePixelRatio
import typingsSlinky.echarts.echarts.ECharts
import typingsSlinky.echarts.echarts.Graphic
import typingsSlinky.echarts.echarts.MapObj
import typingsSlinky.zrender.anon.AddColorStop
import typingsSlinky.zrender.zrender.ColorStops
import typingsSlinky.zrender.zrender.GlobalCoords
import typingsSlinky.zrender.zrender.X
import typingsSlinky.zrender.zrender.X2
import typingsSlinky.zrender.zrender.Y
import typingsSlinky.zrender.zrender.Y2
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object echartsMod {
  
  /**
    * Connects interaction of multiple chart series. For example:
    *
    ```js
    // set group id of each instance respectively.
    chart1.group = 'group1';
    chart2.group = 'group1';
    echarts.connect('group1');
    // or incoming instance array that need to be linked.
    echarts.connect([chart1, chart2]);
    ```
    *
    * @param group Group id in string, or array of chart instance.
    */
  @JSImport("echarts/lib/echarts", "connect")
  @js.native
  def connect(group: String): Unit = js.native
  @JSImport("echarts/lib/echarts", "connect")
  @js.native
  def connect(group: js.Array[ECharts]): Unit = js.native
  
  /**
    * Disconnects interaction of multiple chart series. To have one single
    * instance to be removed, you can set `group` of chart instance to be null.
    *
    * @param {string} group Group id in string.
    */
  @JSImport("echarts/lib/echarts", "disConnect")
  @js.native
  def disConnect(group: String): Unit = js.native
  
  @JSImport("echarts/lib/echarts", "dispose")
  @js.native
  def dispose(target: HTMLCanvasElement): Unit = js.native
  @JSImport("echarts/lib/echarts", "dispose")
  @js.native
  def dispose(target: HTMLDivElement): Unit = js.native
  /**
    * Destroys chart instance, after which the instance cannot be used any
    *     more.
    *
    * @param target Chart instance or container.
    */
  @JSImport("echarts/lib/echarts", "dispose")
  @js.native
  def dispose(target: ECharts): Unit = js.native
  
  @JSImport("echarts/lib/echarts", "getInstanceByDom")
  @js.native
  def getInstanceByDom(target: HTMLCanvasElement): ECharts = js.native
  /**
    * Returns chart instance of dom container.
    *
    * @param target Chart container.
    */
  @JSImport("echarts/lib/echarts", "getInstanceByDom")
  @js.native
  def getInstanceByDom(target: HTMLDivElement): ECharts = js.native
  
  /**
    * Get a registed map.
    *
    * @param {string} mapName Map name.
    * @return {MapObj} Map data.
    */
  @JSImport("echarts/lib/echarts", "getMap")
  @js.native
  def getMap(mapName: String): MapObj = js.native
  
  /**
    * Util methods about graphics.
    */
  object graphic extends Shortcut {
    
    @JSImport("echarts/lib/echarts", "graphic")
    @js.native
    val ^ : Graphic = js.native
    
    /**
      * x, y, x2, y2 are all percent from 0 to 1
      */
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("echarts/lib/echarts", "graphic.LinearGradient")
    @js.native
    class LinearGradient protected () extends AddColorStop {
      def this(
        /** @default 0 */
      x: js.UndefOr[X],
        /** @default 0 */
      y: js.UndefOr[Y],
        /** @default 1 */
      x2: js.UndefOr[X2],
        /** @default 0 */
      y2: js.UndefOr[Y2],
        /** @default [] */
      colorStops: js.UndefOr[ColorStops],
        /** @default false */
      globalCoord: js.UndefOr[GlobalCoords]
      ) = this()
    }
    
    type _To = Graphic
    
    /* This means you don't have to write `^`, but can instead just say `graphic.foo` */
    override def _to: Graphic = ^
  }
  
  @JSImport("echarts/lib/echarts", "init")
  @js.native
  def init(dom: HTMLCanvasElement): ECharts = js.native
  @JSImport("echarts/lib/echarts", "init")
  @js.native
  def init(dom: HTMLCanvasElement, theme: js.UndefOr[scala.Nothing], opts: DevicePixelRatio): ECharts = js.native
  @JSImport("echarts/lib/echarts", "init")
  @js.native
  def init(dom: HTMLCanvasElement, theme: String): ECharts = js.native
  @JSImport("echarts/lib/echarts", "init")
  @js.native
  def init(dom: HTMLCanvasElement, theme: String, opts: DevicePixelRatio): ECharts = js.native
  @JSImport("echarts/lib/echarts", "init")
  @js.native
  def init(dom: HTMLCanvasElement, theme: js.Object): ECharts = js.native
  @JSImport("echarts/lib/echarts", "init")
  @js.native
  def init(dom: HTMLCanvasElement, theme: js.Object, opts: DevicePixelRatio): ECharts = js.native
  /**
    * Creates an ECharts instance, and returns an echartsInstance. You shall
    *     not initialize multiple ECharts instances on a single container.
    *
    * @param {HTMLDivElement | HTMLCanvasElement} dom Instance container,
    *     usually is a `div` element with height and width defined.
    * @param {object | string} [theme] Theme to be applied.
    *     This can be a configuring object of a theme, or a theme name
    *     registered through [echarts.registerTheme](https://echarts.apache.org/api.html#echarts.registerTheme).
    * @param {object} [opts] Chart configurations.
    * @param {number} [opts.devicePixelRatio] Ratio of one physical pixel to
    *     the size of one device independent pixels. Browser's
    *     `window.devicePixelRatio` is used by default.
    * @param {string} [opts.renderer] Supports `'canvas'` or `'svg'`.
    *     See [Render by Canvas or SVG](https://echarts.apache.org/tutorial.html#Render%20by%20Canvas%20or%20SVG).
    * @param {number} [opts.width] Specify width explicitly, in pixel.
    *     If setting to `null`/`undefined`/`'auto'`, width of `dom`
    *     (instance container) will be used.
    * @param {number} [opts.height] Specify height explicitly, in pixel.
    *     If setting to `null`/`undefined`/`'auto'`, height of `dom`
    *     (instance container) will be used.
    */
  @JSImport("echarts/lib/echarts", "init")
  @js.native
  def init(dom: HTMLDivElement): ECharts = js.native
  @JSImport("echarts/lib/echarts", "init")
  @js.native
  def init(dom: HTMLDivElement, theme: js.UndefOr[scala.Nothing], opts: DevicePixelRatio): ECharts = js.native
  @JSImport("echarts/lib/echarts", "init")
  @js.native
  def init(dom: HTMLDivElement, theme: String): ECharts = js.native
  @JSImport("echarts/lib/echarts", "init")
  @js.native
  def init(dom: HTMLDivElement, theme: String, opts: DevicePixelRatio): ECharts = js.native
  @JSImport("echarts/lib/echarts", "init")
  @js.native
  def init(dom: HTMLDivElement, theme: js.Object): ECharts = js.native
  @JSImport("echarts/lib/echarts", "init")
  @js.native
  def init(dom: HTMLDivElement, theme: js.Object, opts: DevicePixelRatio): ECharts = js.native
  
  /**
    * Registers available maps. This can only be used after including
    * [geo](https://echarts.apache.org/option.html#geo)
    * component or chart series of
    * [map](https://echarts.apache.org/option.html#series-map).
    *
    * @param {string} mapName Map name, referring to `map` value set in
    *     [geo](https://echarts.apache.org/option.html#geo)
    *     component or
    *     [map](https://echarts.apache.org/option.html#series-map).
    * @param {object} geoJson Data in GeoJson format. See
    *     [http://geojson.org/](http://geojson.org/) for more format information.
    * @param {object} [specialAreas] Zoomed part of a specific area in the map
    *     for better visual effect.
    *     See [USA Population Estimates example](https://echarts.apache.org/examples/en/editor.html?c=map-usa).
    */
  @JSImport("echarts/lib/echarts", "registerMap")
  @js.native
  def registerMap(mapName: String, geoJson: js.Object): Unit = js.native
  @JSImport("echarts/lib/echarts", "registerMap")
  @js.native
  def registerMap(mapName: String, geoJson: js.Object, specialAreas: js.Object): Unit = js.native
  
  /**
    * Registers a theme, should be specified when
    * [initialize the chart instance](https://echarts.apache.org/api.html#echarts.init).
    *
    * @param {string} themeName Theme name.
    * @param {object} theme Theme configurations.
    */
  @JSImport("echarts/lib/echarts", "registerTheme")
  @js.native
  def registerTheme(themeName: String, theme: js.Object): Unit = js.native
}
