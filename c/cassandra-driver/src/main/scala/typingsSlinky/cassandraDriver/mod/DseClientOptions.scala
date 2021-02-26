package typingsSlinky.cassandraDriver.mod

import typingsSlinky.cassandraDriver.anon.Enabled
import typingsSlinky.cassandraDriver.typesMod.types.Uuid
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DseClientOptions extends ClientOptions {
  
  var applicationName: js.UndefOr[String] = js.native
  
  var applicationVersion: js.UndefOr[String] = js.native
  
  var graphOptions: js.UndefOr[GraphOptions] = js.native
  
  var id: js.UndefOr[Uuid] = js.native
  
  var monitorReporting: js.UndefOr[Enabled] = js.native
}
object DseClientOptions {
  
  @scala.inline
  def apply(): DseClientOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DseClientOptions]
  }
  
  @scala.inline
  implicit class DseClientOptionsMutableBuilder[Self <: DseClientOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setApplicationName(value: String): Self = StObject.set(x, "applicationName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setApplicationNameUndefined: Self = StObject.set(x, "applicationName", js.undefined)
    
    @scala.inline
    def setApplicationVersion(value: String): Self = StObject.set(x, "applicationVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setApplicationVersionUndefined: Self = StObject.set(x, "applicationVersion", js.undefined)
    
    @scala.inline
    def setGraphOptions(value: GraphOptions): Self = StObject.set(x, "graphOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGraphOptionsUndefined: Self = StObject.set(x, "graphOptions", js.undefined)
    
    @scala.inline
    def setId(value: Uuid): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    @scala.inline
    def setMonitorReporting(value: Enabled): Self = StObject.set(x, "monitorReporting", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMonitorReportingUndefined: Self = StObject.set(x, "monitorReporting", js.undefined)
  }
}
