package typingsSlinky.electron.Electron

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EnableNetworkEmulationOptions extends StObject {
  
  /**
    * Download rate in Bps. Defaults to 0 which will disable download throttling.
    */
  var downloadThroughput: js.UndefOr[Double] = js.native
  
  /**
    * RTT in ms. Defaults to 0 which will disable latency throttling.
    */
  var latency: js.UndefOr[Double] = js.native
  
  /**
    * Whether to emulate network outage. Defaults to false.
    */
  var offline: js.UndefOr[Boolean] = js.native
  
  /**
    * Upload rate in Bps. Defaults to 0 which will disable upload throttling.
    */
  var uploadThroughput: js.UndefOr[Double] = js.native
}
object EnableNetworkEmulationOptions {
  
  @scala.inline
  def apply(): EnableNetworkEmulationOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EnableNetworkEmulationOptions]
  }
  
  @scala.inline
  implicit class EnableNetworkEmulationOptionsMutableBuilder[Self <: EnableNetworkEmulationOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDownloadThroughput(value: Double): Self = StObject.set(x, "downloadThroughput", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDownloadThroughputUndefined: Self = StObject.set(x, "downloadThroughput", js.undefined)
    
    @scala.inline
    def setLatency(value: Double): Self = StObject.set(x, "latency", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLatencyUndefined: Self = StObject.set(x, "latency", js.undefined)
    
    @scala.inline
    def setOffline(value: Boolean): Self = StObject.set(x, "offline", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOfflineUndefined: Self = StObject.set(x, "offline", js.undefined)
    
    @scala.inline
    def setUploadThroughput(value: Double): Self = StObject.set(x, "uploadThroughput", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUploadThroughputUndefined: Self = StObject.set(x, "uploadThroughput", js.undefined)
  }
}
