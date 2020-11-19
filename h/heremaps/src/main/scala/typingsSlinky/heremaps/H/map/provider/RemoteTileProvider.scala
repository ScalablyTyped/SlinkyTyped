package typingsSlinky.heremaps.H.map.provider

import org.scalajs.dom.raw.HTMLCanvasElement
import org.scalajs.dom.raw.HTMLImageElement
import typingsSlinky.heremaps.H.map.Object
import typingsSlinky.heremaps.H.util.ICache
import typingsSlinky.heremaps.H.util.ICancelable
import typingsSlinky.heremaps.H.util.Job.Priority
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * RemoteTileProvider is an abstract class which should be used by classes implementing data provision on a tile basis. Every child class needs to implement 'requestInternal'
  * (to request remote tile) and 'getCache' (to provide configured cache object were tiled data is being cached)
  */
@js.native
trait RemoteTileProvider extends TileProvider {
  
  /**
    * This method returns cache which should be used to store tiles
    * @returns {H.util.ICache} - cache
    */
  def getCache(): ICache = js.native
  
  /**
    * This method instructs the provider to reload data from it's source.
    * @param hard {boolean} - a boolean flag indicating whether to invalidate in hard mode (true) or in soft mode (false);
    */
  def reload(hard: Boolean): Unit = js.native
  
  /**
    * This method request tile from remote service
    * @param x {number} - The row number of the tile
    * @param y {number} - The column number of the tile
    * @param z {number} - The zoom level for which the tile is requested
    * @param onResponse {function((Array<H.map.Object> | HTMLImageElement | HTMLCanvasElement | ArrayBuffer | null), *=)} - function which is called after response arrives
    * @param onError {function(string=)} - function which is called in case of communication error
    * @param opt_priority {H.net.Request.Priority=} - optional request priority level
    * @returns {H.util.ICancelable}
    */
  def requestInternal(x: Double, y: Double, z: Double): ICancelable = js.native
  def requestInternal(
    x: Double,
    y: Double,
    z: Double,
    onResponse: js.UndefOr[scala.Nothing],
    onError: js.UndefOr[scala.Nothing],
    opt_priority: Priority
  ): ICancelable = js.native
  def requestInternal(
    x: Double,
    y: Double,
    z: Double,
    onResponse: js.UndefOr[scala.Nothing],
    onError: js.Function1[/* s */ String, Unit]
  ): ICancelable = js.native
  def requestInternal(
    x: Double,
    y: Double,
    z: Double,
    onResponse: js.UndefOr[scala.Nothing],
    onError: js.Function1[/* s */ String, Unit],
    opt_priority: Priority
  ): ICancelable = js.native
  def requestInternal(
    x: Double,
    y: Double,
    z: Double,
    onResponse: js.Function2[
      /* object */ js.Array[Object] | HTMLImageElement | HTMLCanvasElement | js.typedarray.ArrayBuffer, 
      /* response */ js.Any, 
      Unit
    ]
  ): ICancelable = js.native
  def requestInternal(
    x: Double,
    y: Double,
    z: Double,
    onResponse: js.Function2[
      /* object */ js.Array[Object] | HTMLImageElement | HTMLCanvasElement | js.typedarray.ArrayBuffer, 
      /* response */ js.Any, 
      Unit
    ],
    onError: js.UndefOr[scala.Nothing],
    opt_priority: Priority
  ): ICancelable = js.native
  def requestInternal(
    x: Double,
    y: Double,
    z: Double,
    onResponse: js.Function2[
      /* object */ js.Array[Object] | HTMLImageElement | HTMLCanvasElement | js.typedarray.ArrayBuffer, 
      /* response */ js.Any, 
      Unit
    ],
    onError: js.Function1[/* s */ String, Unit]
  ): ICancelable = js.native
  def requestInternal(
    x: Double,
    y: Double,
    z: Double,
    onResponse: js.Function2[
      /* object */ js.Array[Object] | HTMLImageElement | HTMLCanvasElement | js.typedarray.ArrayBuffer, 
      /* response */ js.Any, 
      Unit
    ],
    onError: js.Function1[/* s */ String, Unit],
    opt_priority: Priority
  ): ICancelable = js.native
}
