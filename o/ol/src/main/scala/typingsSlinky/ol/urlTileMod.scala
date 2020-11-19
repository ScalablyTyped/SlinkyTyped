package typingsSlinky.ol

import typingsSlinky.ol.eventsMod.EventsKey
import typingsSlinky.ol.olStrings.tileloadend
import typingsSlinky.ol.olStrings.tileloaderror
import typingsSlinky.ol.olStrings.tileloadstart
import typingsSlinky.ol.olTileMod.LoadFunction
import typingsSlinky.ol.olTileMod.Tile
import typingsSlinky.ol.olTileMod.UrlFunction
import typingsSlinky.ol.projMod.ProjectionLike
import typingsSlinky.ol.sourceSourceMod.AttributionLike
import typingsSlinky.ol.sourceTileMod.TileSourceEvent
import typingsSlinky.ol.stateMod.State
import typingsSlinky.ol.tilecoordMod.TileCoord
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("ol/source/UrlTile", JSImport.Namespace)
@js.native
object urlTileMod extends js.Object {
  
  @js.native
  trait Options extends js.Object {
    
    var attributions: js.UndefOr[AttributionLike] = js.native
    
    var attributionsCollapsible: js.UndefOr[Boolean] = js.native
    
    var cacheSize: js.UndefOr[Double] = js.native
    
    var key: js.UndefOr[String] = js.native
    
    var opaque: js.UndefOr[Boolean] = js.native
    
    var projection: js.UndefOr[ProjectionLike] = js.native
    
    var state: js.UndefOr[State] = js.native
    
    var tileGrid: js.UndefOr[typingsSlinky.ol.tilegridTileGridMod.default] = js.native
    
    def tileLoadFunction(p0: Tile, p1: String): Unit = js.native
    @JSName("tileLoadFunction")
    var tileLoadFunction_Original: LoadFunction = js.native
    
    var tilePixelRatio: js.UndefOr[Double] = js.native
    
    var tileUrlFunction: js.UndefOr[UrlFunction] = js.native
    
    var transition: js.UndefOr[Double] = js.native
    
    var url: js.UndefOr[String] = js.native
    
    var urls: js.UndefOr[js.Array[String]] = js.native
    
    var wrapX: js.UndefOr[Boolean] = js.native
    
    var zDirection: js.UndefOr[Double] = js.native
  }
  
  @js.native
  trait UrlTile
    extends typingsSlinky.ol.sourceTileMod.default {
    
    def getTileLoadFunction(): LoadFunction = js.native
    
    def getTileUrlFunction(): UrlFunction = js.native
    
    def getUrls(): js.Array[String] = js.native
    
    /* protected */ def handleTileChange(event: typingsSlinky.ol.eventMod.default): Unit = js.native
    
    @JSName("on")
    def on_tileloadend(`type`: tileloadend, listener: js.Function1[/* evt */ TileSourceEvent, Unit]): EventsKey = js.native
    @JSName("on")
    def on_tileloaderror(`type`: tileloaderror, listener: js.Function1[/* evt */ TileSourceEvent, Unit]): EventsKey = js.native
    @JSName("on")
    def on_tileloadstart(`type`: tileloadstart, listener: js.Function1[/* evt */ TileSourceEvent, Unit]): EventsKey = js.native
    
    @JSName("once")
    def once_tileloadend(`type`: tileloadend, listener: js.Function1[/* evt */ TileSourceEvent, Unit]): EventsKey = js.native
    @JSName("once")
    def once_tileloaderror(`type`: tileloaderror, listener: js.Function1[/* evt */ TileSourceEvent, Unit]): EventsKey = js.native
    @JSName("once")
    def once_tileloadstart(`type`: tileloadstart, listener: js.Function1[/* evt */ TileSourceEvent, Unit]): EventsKey = js.native
    
    def setTileLoadFunction(tileLoadFunction: LoadFunction): Unit = js.native
    
    def setTileUrlFunction(tileUrlFunction: UrlFunction): Unit = js.native
    def setTileUrlFunction(tileUrlFunction: UrlFunction, key: String): Unit = js.native
    
    def setUrl(url: String): Unit = js.native
    
    def setUrls(urls: js.Array[String]): Unit = js.native
    
    /* protected */ def tileLoadFunction(p0: Tile, p1: String): Unit = js.native
    @JSName("tileLoadFunction")
    var tileLoadFunction_Original: LoadFunction = js.native
    
    /* protected */ def tileUrlFunction(p0: TileCoord, p1: Double, p2: typingsSlinky.ol.projectionMod.default): String = js.native
    @JSName("tileUrlFunction")
    var tileUrlFunction_Original: UrlFunction = js.native
    
    @JSName("un")
    def un_tileloadend(`type`: tileloadend, listener: js.Function1[/* evt */ TileSourceEvent, Unit]): Unit = js.native
    @JSName("un")
    def un_tileloaderror(`type`: tileloaderror, listener: js.Function1[/* evt */ TileSourceEvent, Unit]): Unit = js.native
    @JSName("un")
    def un_tileloadstart(`type`: tileloadstart, listener: js.Function1[/* evt */ TileSourceEvent, Unit]): Unit = js.native
    
    var urls: js.Array[String] = js.native
  }
  
  @js.native
  class default protected () extends UrlTile {
    def this(options: Options) = this()
  }
}
