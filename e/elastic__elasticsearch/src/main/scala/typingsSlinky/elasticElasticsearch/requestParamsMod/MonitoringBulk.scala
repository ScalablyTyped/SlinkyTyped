package typingsSlinky.elasticElasticsearch.requestParamsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MonitoringBulk[T] extends Generic {
  
  var body: T = js.native
  
  var interval: js.UndefOr[String] = js.native
  
  var system_api_version: js.UndefOr[String] = js.native
  
  var system_id: js.UndefOr[String] = js.native
  
  var `type`: js.UndefOr[String] = js.native
}
object MonitoringBulk {
  
  @scala.inline
  def apply[T](body: T): MonitoringBulk[T] = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any])
    __obj.asInstanceOf[MonitoringBulk[T]]
  }
  
  @scala.inline
  implicit class MonitoringBulkMutableBuilder[Self <: MonitoringBulk[_], T] (val x: Self with MonitoringBulk[T]) extends AnyVal {
    
    @scala.inline
    def setBody(value: T): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInterval(value: String): Self = StObject.set(x, "interval", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIntervalUndefined: Self = StObject.set(x, "interval", js.undefined)
    
    @scala.inline
    def setSystem_api_version(value: String): Self = StObject.set(x, "system_api_version", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSystem_api_versionUndefined: Self = StObject.set(x, "system_api_version", js.undefined)
    
    @scala.inline
    def setSystem_id(value: String): Self = StObject.set(x, "system_id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSystem_idUndefined: Self = StObject.set(x, "system_id", js.undefined)
    
    @scala.inline
    def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
