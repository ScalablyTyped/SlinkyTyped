package typingsSlinky.cesium.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("cesium", "TileProviderError")
@js.native
class TileProviderError protected () extends js.Object {
  def this(
    provider: ImageryProvider | TerrainProvider,
    message: String,
    x: js.UndefOr[Double],
    y: js.UndefOr[Double],
    level: js.UndefOr[Double],
    timesRetried: js.UndefOr[Double],
    error: js.UndefOr[js.Error]
  ) = this()
  
  var error: js.Error = js.native
  
  var level: Double = js.native
  
  var message: String = js.native
  
  var provider: ImageryProvider | TerrainProvider = js.native
  
  var retry: Boolean = js.native
  
  var timesRetried: Double = js.native
  
  var x: Double = js.native
  
  var y: Double = js.native
}
/* static members */
@JSImport("cesium", "TileProviderError")
@js.native
object TileProviderError extends js.Object {
  
  def handleError(
    previousError: TileProviderError,
    provider: ImageryProvider,
    event: Event[js.Array[TileProviderError]],
    message: String,
    x: Double,
    y: Double,
    level: Double,
    retryFunction: RetryFunction
  ): TileProviderError = js.native
  def handleError(
    previousError: TileProviderError,
    provider: ImageryProvider,
    event: Event[js.Array[TileProviderError]],
    message: String,
    x: Double,
    y: Double,
    level: Double,
    retryFunction: RetryFunction,
    errorDetails: js.Error
  ): TileProviderError = js.native
  def handleError(
    previousError: TileProviderError,
    provider: TerrainProvider,
    event: Event[js.Array[TileProviderError]],
    message: String,
    x: Double,
    y: Double,
    level: Double,
    retryFunction: RetryFunction
  ): TileProviderError = js.native
  def handleError(
    previousError: TileProviderError,
    provider: TerrainProvider,
    event: Event[js.Array[TileProviderError]],
    message: String,
    x: Double,
    y: Double,
    level: Double,
    retryFunction: RetryFunction,
    errorDetails: js.Error
  ): TileProviderError = js.native
  
  def handleSuccess(previousError: TileProviderError): Unit = js.native
  
  type RetryFunction = js.Function0[Unit]
}
