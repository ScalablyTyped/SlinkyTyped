package typingsSlinky.heremaps.global.H.service

import typingsSlinky.heremaps.H.map.provider.RemoteTileProvider
import typingsSlinky.heremaps.H.service.ServiceParameters
import typingsSlinky.heremaps.H.service.metaInfo.Service.Options
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("H.service.metaInfo")
@js.native
object metaInfo extends js.Object {
  
  /**
    * This class encapsulates a Metainfo Tile end point of the HERE Map Tile API.
    */
  @js.native
  /**
    * Constructor
    * @param opt_options {H.service.metaInfo.Service.Options=} - additional service parameters
    */
  class Service ()
    extends typingsSlinky.heremaps.H.service.metaInfo.Service {
    def this(opt_options: Options) = this()
  }
  
  /**
    * This class utilizes Metainfo Tiles functionality provided by the Map Tile API to load meta information about map objects (buildings, labels, public transport etc.).
    */
  @js.native
  class TileProvider protected () extends RemoteTileProvider {
    def this(service: typingsSlinky.heremaps.H.service.MapTileService) = this()
    /**
      * Constructor
      * @param service {(H.service.metaInfo.Service | H.service.MapTileService)} - the tile service which holds information from about the source of the tiles
      * @param opt_params {H.service.ServiceParameters=} - an additional set of URL parameters
      * @param opt_options {H.service.metaInfo.TileProvider.Options=} - additional parameters
      */
    def this(service: typingsSlinky.heremaps.H.service.metaInfo.Service) = this()
    def this(service: typingsSlinky.heremaps.H.service.MapTileService, opt_params: ServiceParameters) = this()
    def this(service: typingsSlinky.heremaps.H.service.metaInfo.Service, opt_params: ServiceParameters) = this()
    def this(
      service: typingsSlinky.heremaps.H.service.MapTileService,
      opt_params: js.UndefOr[scala.Nothing],
      opt_options: typingsSlinky.heremaps.H.service.metaInfo.TileProvider.Options
    ) = this()
    def this(
      service: typingsSlinky.heremaps.H.service.MapTileService,
      opt_params: ServiceParameters,
      opt_options: typingsSlinky.heremaps.H.service.metaInfo.TileProvider.Options
    ) = this()
    def this(
      service: typingsSlinky.heremaps.H.service.metaInfo.Service,
      opt_params: js.UndefOr[scala.Nothing],
      opt_options: typingsSlinky.heremaps.H.service.metaInfo.TileProvider.Options
    ) = this()
    def this(
      service: typingsSlinky.heremaps.H.service.metaInfo.Service,
      opt_params: ServiceParameters,
      opt_options: typingsSlinky.heremaps.H.service.metaInfo.TileProvider.Options
    ) = this()
  }
}
