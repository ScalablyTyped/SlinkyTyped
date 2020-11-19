package typingsSlinky.promClient.mod

import typingsSlinky.promClient.mod.Pushgateway.Parameters
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("prom-client", "Pushgateway")
@js.native
class Pushgateway_ protected () extends js.Object {
  /**
  	 * @param url Complete url to the Pushgateway. If port is needed append url with :port
  	 * @param options Options
  	 * @param registry Registry
  	 */
  def this(url: String) = this()
  def this(url: String, options: js.Any) = this()
  def this(url: String, options: js.UndefOr[scala.Nothing], registry: Registry) = this()
  def this(url: String, options: js.Any, registry: Registry) = this()
  
  /**
  	 * Delete all metrics for jobName
  	 * @param params Push parameters
  	 * @param callback Callback when request is complete
  	 */
  def delete(
    params: Parameters,
    callback: js.Function3[
      /* error */ js.UndefOr[js.Error], 
      /* httpResponse */ js.UndefOr[js.Any], 
      /* body */ js.UndefOr[js.Any], 
      Unit
    ]
  ): Unit = js.native
  
  /**
  	 * Overwrite all metric (using PUT to Pushgateway)
  	 * @param params Push parameters
  	 * @param callback Callback when request is complete
  	 */
  def push(
    params: Parameters,
    callback: js.Function3[
      /* error */ js.UndefOr[js.Error], 
      /* httpResponse */ js.UndefOr[js.Any], 
      /* body */ js.UndefOr[js.Any], 
      Unit
    ]
  ): Unit = js.native
  
  /**
  	 * Add metric and overwrite old ones
  	 * @param params Push parameters
  	 * @param callback Callback when request is complete
  	 */
  def pushAdd(
    params: Parameters,
    callback: js.Function3[
      /* error */ js.UndefOr[js.Error], 
      /* httpResponse */ js.UndefOr[js.Any], 
      /* body */ js.UndefOr[js.Any], 
      Unit
    ]
  ): Unit = js.native
}
