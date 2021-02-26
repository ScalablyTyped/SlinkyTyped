package typingsSlinky.maximMazurokGapiClientGameservices.gapi.client.gameservices

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LogConfig extends StObject {
  
  /** Cloud audit options. */
  var cloudAudit: js.UndefOr[CloudAuditOptions] = js.native
  
  /** Counter options. */
  var counter: js.UndefOr[CounterOptions] = js.native
  
  /** Data access options. */
  var dataAccess: js.UndefOr[DataAccessOptions] = js.native
}
object LogConfig {
  
  @scala.inline
  def apply(): LogConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LogConfig]
  }
  
  @scala.inline
  implicit class LogConfigMutableBuilder[Self <: LogConfig] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCloudAudit(value: CloudAuditOptions): Self = StObject.set(x, "cloudAudit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCloudAuditUndefined: Self = StObject.set(x, "cloudAudit", js.undefined)
    
    @scala.inline
    def setCounter(value: CounterOptions): Self = StObject.set(x, "counter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCounterUndefined: Self = StObject.set(x, "counter", js.undefined)
    
    @scala.inline
    def setDataAccess(value: DataAccessOptions): Self = StObject.set(x, "dataAccess", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDataAccessUndefined: Self = StObject.set(x, "dataAccess", js.undefined)
  }
}
