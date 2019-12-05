package typingsSlinky.atAntDashDesignIconsDashAngular

import org.scalajs.dom.raw.SVGElement
import typingsSlinky.atAngularCommon.httpMod.HttpBackend
import typingsSlinky.atAngularCommon.httpMod.HttpClient
import typingsSlinky.atAngularCore.atAngularCoreMod.Renderer2
import typingsSlinky.atAngularCore.atAngularCoreMod.RendererFactory2
import typingsSlinky.atAngularPlatformDashBrowser.atAngularPlatformDashBrowserMod.DomSanitizer
import typingsSlinky.atAntDashDesignIconsDashAngular.typesMod.CachedIconDefinition
import typingsSlinky.atAntDashDesignIconsDashAngular.typesMod.IconDefinition
import typingsSlinky.atAntDashDesignIconsDashAngular.typesMod.ThemeType
import typingsSlinky.atAntDashDesignIconsDashAngular.typesMod.TwoToneColorPalette
import typingsSlinky.atAntDashDesignIconsDashAngular.typesMod.TwoToneColorPaletteSetter
import typingsSlinky.rxjs.rxjsMod.Observable
import typingsSlinky.std.Map
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@ant-design/icons-angular/component/icon.service", JSImport.Namespace)
@js.native
object componentIconDotServiceMod extends js.Object {
  @js.native
  class IconService protected () extends js.Object {
    def this(
      _rendererFactory: RendererFactory2,
      _handler: HttpBackend,
      _document: js.Any,
      sanitizer: DomSanitizer
    ) = this()
    /**
      * Url prefix for fetching inline SVG by dynamic importing.
      */
    var _assetsUrlRoot: String = js.native
    var _document: js.Any = js.native
    /** A flag indicates whether jsonp loading is enabled. */
    var _enableJsonpLoading: js.Any = js.native
    var _handler: HttpBackend = js.native
    var _http: HttpClient = js.native
    var _inProgressFetches: Map[String, Observable[IconDefinition | Null]] = js.native
    @JSName("_jsonpIconLoad$")
    val _jsonpIconLoad$: js.Any = js.native
    var _renderer: Renderer2 = js.native
    var _rendererFactory: RendererFactory2 = js.native
    /**
      * All icon definitions would be registered here.
      */
    val _svgDefinitions: Map[String, IconDefinition] = js.native
    /**
      * Cache all rendered icons. Icons are identified by name, theme,
      * and for twotone icons, primary color and secondary color.
      */
    val _svgRenderedDefinitions: Map[String, CachedIconDefinition] = js.native
    var _twoToneColorPalette: TwoToneColorPalette = js.native
    var defaultTheme: ThemeType = js.native
    var sanitizer: DomSanitizer = js.native
    var twoToneColor: TwoToneColorPaletteSetter = js.native
    /* protected */ def _colorizeSVGIcon(svg: SVGElement, twotone: Boolean, pri: String, sec: String): SVGElement = js.native
    /* protected */ def _createSVGElementFromString(str: String): SVGElement = js.native
    /**
      * Get raw svg and assemble a `IconDefinition` object.
      * @param type
      */
    /* protected */ def _loadIconDynamically(`type`: String): Observable[IconDefinition | Null] = js.native
    /* protected */ def _loadIconDynamicallyWithJsonp(icon: IconDefinition, url: String): Observable[IconDefinition] = js.native
    /**
      * Render a new `SVGElement` for a given `IconDefinition`, or make a copy from cache.
      * @param icon
      * @param twoToneColor
      */
    /* protected */ def _loadSVGFromCacheOrCreateNew(icon: IconDefinition): SVGElement = js.native
    /* protected */ def _loadSVGFromCacheOrCreateNew(icon: IconDefinition, twoToneColor: String): SVGElement = js.native
    /* protected */ def _setSVGAttribute(svg: SVGElement): SVGElement = js.native
    /**
      * Add icons provided by ant design.
      * @param icons
      */
    def addIcon(icons: IconDefinition*): Unit = js.native
    /**
      * Register an icon. Namespace is required.
      * @param type
      * @param literal
      */
    def addIconLiteral(`type`: String, literal: String): Unit = js.native
    /**
      * Change the prefix of the inline svg resources, so they could be deployed elsewhere, like CDN.
      * @param prefix
      */
    def changeAssetsSource(prefix: String): Unit = js.native
    /**
      * Remove all cache.
      */
    def clear(): Unit = js.native
    def getCachedIcons(): Map[String, IconDefinition] = js.native
    def getRenderedContent(icon: String): Observable[SVGElement] = js.native
    def getRenderedContent(icon: String, twoToneColor: String): Observable[SVGElement] = js.native
    /**
      * Get a rendered `SVGElement`.
      * @param icon
      * @param twoToneColor
      */
    def getRenderedContent(icon: IconDefinition): Observable[SVGElement] = js.native
    def getRenderedContent(icon: IconDefinition, twoToneColor: String): Observable[SVGElement] = js.native
    /**
      * Call this method to switch to jsonp like loading.
      */
    def useJsonpLoading(): Unit = js.native
  }
  
}

