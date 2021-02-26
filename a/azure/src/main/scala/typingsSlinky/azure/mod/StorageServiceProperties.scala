package typingsSlinky.azure.mod

import typingsSlinky.azure.anon.Delete
import typingsSlinky.azure.anon.Enabled
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait StorageServiceProperties extends StObject {
  
  var DefaultServiceVersion: String = js.native
  
  var Logging: Delete = js.native
  
  var Metrics: Enabled = js.native
}
object StorageServiceProperties {
  
  @scala.inline
  def apply(DefaultServiceVersion: String, Logging: Delete, Metrics: Enabled): StorageServiceProperties = {
    val __obj = js.Dynamic.literal(DefaultServiceVersion = DefaultServiceVersion.asInstanceOf[js.Any], Logging = Logging.asInstanceOf[js.Any], Metrics = Metrics.asInstanceOf[js.Any])
    __obj.asInstanceOf[StorageServiceProperties]
  }
  
  @scala.inline
  implicit class StorageServicePropertiesMutableBuilder[Self <: StorageServiceProperties] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDefaultServiceVersion(value: String): Self = StObject.set(x, "DefaultServiceVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLogging(value: Delete): Self = StObject.set(x, "Logging", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMetrics(value: Enabled): Self = StObject.set(x, "Metrics", value.asInstanceOf[js.Any])
  }
}
