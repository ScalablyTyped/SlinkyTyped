package typingsSlinky.maximMazurokGapiClientDataflow.gapi.client.dataflow

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MemInfo extends StObject {
  
  /** Instantenous memory limit in bytes. */
  var currentLimitBytes: js.UndefOr[String] = js.native
  
  /** Instantenous memory (RSS) size in bytes. */
  var currentRssBytes: js.UndefOr[String] = js.native
  
  /** Timestamp of the measurement. */
  var timestamp: js.UndefOr[String] = js.native
  
  /** Total memory (RSS) usage since start up in GB * ms. */
  var totalGbMs: js.UndefOr[String] = js.native
}
object MemInfo {
  
  @scala.inline
  def apply(): MemInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MemInfo]
  }
  
  @scala.inline
  implicit class MemInfoMutableBuilder[Self <: MemInfo] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCurrentLimitBytes(value: String): Self = StObject.set(x, "currentLimitBytes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCurrentLimitBytesUndefined: Self = StObject.set(x, "currentLimitBytes", js.undefined)
    
    @scala.inline
    def setCurrentRssBytes(value: String): Self = StObject.set(x, "currentRssBytes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCurrentRssBytesUndefined: Self = StObject.set(x, "currentRssBytes", js.undefined)
    
    @scala.inline
    def setTimestamp(value: String): Self = StObject.set(x, "timestamp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimestampUndefined: Self = StObject.set(x, "timestamp", js.undefined)
    
    @scala.inline
    def setTotalGbMs(value: String): Self = StObject.set(x, "totalGbMs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTotalGbMsUndefined: Self = StObject.set(x, "totalGbMs", js.undefined)
  }
}
