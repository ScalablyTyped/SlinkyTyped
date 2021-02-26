package typingsSlinky.ol

import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.raw.HTMLCanvasElement
import org.scalajs.dom.raw.UIEvent
import typingsSlinky.ol.assertionErrorMod.default
import typingsSlinky.ol.collectionMod.Options
import typingsSlinky.ol.extentMod.Extent
import typingsSlinky.ol.imageStateMod.ImageState
import typingsSlinky.ol.olImageCanvasMod.Loader
import typingsSlinky.ol.olImageMod.LoadFunction
import typingsSlinky.ol.pluggableMapMod.FrameState
import typingsSlinky.ol.pluggableMapMod.MapOptions
import typingsSlinky.ol.tileQueueMod.PriorityFunction
import typingsSlinky.ol.tileStateMod.TileState
import typingsSlinky.ol.tilecoordMod.TileCoord
import typingsSlinky.ol.viewMod.ViewOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("ol", "AssertionError")
  @js.native
  class AssertionError protected () extends default {
    def this(code: Double) = this()
  }
  
  @JSImport("ol", "Collection")
  @js.native
  class Collection[T] ()
    extends typingsSlinky.ol.collectionMod.default[T] {
    def this(opt_array: js.Array[T]) = this()
    def this(opt_array: js.UndefOr[scala.Nothing], opt_options: Options) = this()
    def this(opt_array: js.Array[T], opt_options: Options) = this()
  }
  
  @JSImport("ol", "Disposable")
  @js.native
  class Disposable ()
    extends typingsSlinky.ol.disposableMod.default
  
  @JSImport("ol", "Feature")
  @js.native
  class Feature[GeomType /* <: typingsSlinky.ol.geometryMod.default */] ()
    extends typingsSlinky.ol.olFeatureMod.default[GeomType] {
    def this(opt_geometryOrProperties: GeomType) = this()
    def this(opt_geometryOrProperties: StringDictionary[js.Any]) = this()
  }
  
  @JSImport("ol", "Geolocation")
  @js.native
  class Geolocation ()
    extends typingsSlinky.ol.geolocationMod.default {
    def this(opt_options: typingsSlinky.ol.geolocationMod.Options) = this()
  }
  
  @JSImport("ol", "Graticule")
  @js.native
  class Graticule ()
    extends typingsSlinky.ol.graticuleMod.default {
    def this(opt_options: typingsSlinky.ol.graticuleMod.Options) = this()
  }
  
  @JSImport("ol", "Image")
  @js.native
  class Image protected ()
    extends typingsSlinky.ol.olImageMod.default {
    def this(
      extent: Extent,
      resolution: js.UndefOr[scala.Nothing],
      pixelRatio: Double,
      src: String,
      crossOrigin: String,
      imageLoadFunction: LoadFunction
    ) = this()
    def this(
      extent: Extent,
      resolution: Double,
      pixelRatio: Double,
      src: String,
      crossOrigin: String,
      imageLoadFunction: LoadFunction
    ) = this()
  }
  
  @JSImport("ol", "ImageBase")
  @js.native
  abstract class ImageBase protected ()
    extends typingsSlinky.ol.imageBaseMod.default {
    def this(extent: Extent, resolution: js.UndefOr[scala.Nothing], pixelRatio: Double, state: ImageState) = this()
    def this(extent: Extent, resolution: Double, pixelRatio: Double, state: ImageState) = this()
  }
  
  @JSImport("ol", "ImageCanvas")
  @js.native
  class ImageCanvas protected ()
    extends typingsSlinky.ol.olImageCanvasMod.default {
    def this(extent: Extent, resolution: Double, pixelRatio: Double, canvas: HTMLCanvasElement) = this()
    def this(
      extent: Extent,
      resolution: Double,
      pixelRatio: Double,
      canvas: HTMLCanvasElement,
      opt_loader: Loader
    ) = this()
  }
  
  @JSImport("ol", "ImageTile")
  @js.native
  class ImageTile protected ()
    extends typingsSlinky.ol.imageTileMod.default {
    def this(
      tileCoord: TileCoord,
      state: TileState,
      src: String,
      crossOrigin: String,
      tileLoadFunction: typingsSlinky.ol.olTileMod.LoadFunction
    ) = this()
    def this(
      tileCoord: TileCoord,
      state: TileState,
      src: String,
      crossOrigin: String,
      tileLoadFunction: typingsSlinky.ol.olTileMod.LoadFunction,
      opt_options: typingsSlinky.ol.olTileMod.Options
    ) = this()
  }
  
  @JSImport("ol", "Kinetic")
  @js.native
  class Kinetic protected ()
    extends typingsSlinky.ol.kineticMod.default {
    def this(decay: Double, minVelocity: Double, delay: Double) = this()
  }
  
  @JSImport("ol", "Map")
  @js.native
  class Map protected ()
    extends typingsSlinky.ol.olMapMod.default {
    def this(options: MapOptions) = this()
  }
  
  @JSImport("ol", "MapBrowserEvent")
  @js.native
  class MapBrowserEvent[EVENT /* <: UIEvent */] protected ()
    extends typingsSlinky.ol.mapBrowserEventMod.default[EVENT] {
    def this(`type`: String, map: typingsSlinky.ol.pluggableMapMod.default, originalEvent: EVENT) = this()
    def this(
      `type`: String,
      map: typingsSlinky.ol.pluggableMapMod.default,
      originalEvent: EVENT,
      opt_dragging: Boolean
    ) = this()
    def this(
      `type`: String,
      map: typingsSlinky.ol.pluggableMapMod.default,
      originalEvent: EVENT,
      opt_dragging: js.UndefOr[scala.Nothing],
      opt_frameState: FrameState
    ) = this()
    def this(
      `type`: String,
      map: typingsSlinky.ol.pluggableMapMod.default,
      originalEvent: EVENT,
      opt_dragging: Boolean,
      opt_frameState: FrameState
    ) = this()
  }
  
  @JSImport("ol", "MapBrowserEventHandler")
  @js.native
  class MapBrowserEventHandler protected ()
    extends typingsSlinky.ol.mapBrowserEventHandlerMod.default {
    def this(map: typingsSlinky.ol.pluggableMapMod.default) = this()
    def this(map: typingsSlinky.ol.pluggableMapMod.default, moveTolerance: Double) = this()
  }
  
  @JSImport("ol", "MapEvent")
  @js.native
  class MapEvent protected ()
    extends typingsSlinky.ol.mapEventMod.default {
    def this(`type`: String, map: typingsSlinky.ol.pluggableMapMod.default) = this()
    def this(`type`: String, map: typingsSlinky.ol.pluggableMapMod.default, opt_frameState: FrameState) = this()
  }
  
  @JSImport("ol", "Object")
  @js.native
  class Object ()
    extends typingsSlinky.ol.objectMod.default {
    def this(opt_values: StringDictionary[js.Any]) = this()
  }
  
  @JSImport("ol", "Observable")
  @js.native
  class Observable ()
    extends typingsSlinky.ol.observableMod.default
  
  @JSImport("ol", "Overlay")
  @js.native
  class Overlay protected ()
    extends typingsSlinky.ol.overlayMod.default {
    def this(options: typingsSlinky.ol.overlayMod.Options) = this()
  }
  
  @JSImport("ol", "PluggableMap")
  @js.native
  class PluggableMap protected ()
    extends typingsSlinky.ol.pluggableMapMod.default {
    def this(options: MapOptions) = this()
  }
  
  @JSImport("ol", "Tile")
  @js.native
  abstract class Tile protected ()
    extends typingsSlinky.ol.olTileMod.default {
    def this(tileCoord: TileCoord, state: TileState) = this()
    def this(tileCoord: TileCoord, state: TileState, opt_options: typingsSlinky.ol.olTileMod.Options) = this()
  }
  
  @JSImport("ol", "TileCache")
  @js.native
  class TileCache ()
    extends typingsSlinky.ol.tileCacheMod.default
  
  @JSImport("ol", "TileQueue")
  @js.native
  class TileQueue protected ()
    extends typingsSlinky.ol.tileQueueMod.default {
    def this(tilePriorityFunction: PriorityFunction, tileChangeCallback: js.Function0[_]) = this()
  }
  
  @JSImport("ol", "TileRange")
  @js.native
  class TileRange protected ()
    extends typingsSlinky.ol.tileRangeMod.default {
    def this(minX: Double, maxX: Double, minY: Double, maxY: Double) = this()
  }
  
  @JSImport("ol", "VERSION")
  @js.native
  val VERSION: String = js.native
  
  @JSImport("ol", "VectorRenderTile")
  @js.native
  class VectorRenderTile protected ()
    extends typingsSlinky.ol.vectorRenderTileMod.default {
    def this(
      tileCoord: TileCoord,
      state: TileState,
      urlTileCoord: TileCoord,
      getSourceTiles: js.Function1[
            /* p0 */ typingsSlinky.ol.vectorRenderTileMod.VectorRenderTile, 
            js.Array[typingsSlinky.ol.olVectorTileMod.default]
          ]
    ) = this()
  }
  
  @JSImport("ol", "VectorTile")
  @js.native
  class VectorTile protected ()
    extends typingsSlinky.ol.olVectorTileMod.default {
    def this(
      tileCoord: TileCoord,
      state: TileState,
      src: String,
      format: typingsSlinky.ol.featureMod.default,
      tileLoadFunction: typingsSlinky.ol.olTileMod.LoadFunction
    ) = this()
    def this(
      tileCoord: TileCoord,
      state: TileState,
      src: String,
      format: typingsSlinky.ol.featureMod.default,
      tileLoadFunction: typingsSlinky.ol.olTileMod.LoadFunction,
      opt_options: typingsSlinky.ol.olTileMod.Options
    ) = this()
  }
  
  @JSImport("ol", "View")
  @js.native
  class View ()
    extends typingsSlinky.ol.viewMod.default {
    def this(opt_options: ViewOptions) = this()
  }
  
  @JSImport("ol", "getUid")
  @js.native
  def getUid(obj: js.Any): String = js.native
}
