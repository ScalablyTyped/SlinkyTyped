package typingsSlinky.awsSdk.appflowMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DynatraceConnectorProfileProperties extends StObject {
  
  /**
    *  The location of the Dynatrace resource. 
    */
  var instanceUrl: InstanceUrl = js.native
}
object DynatraceConnectorProfileProperties {
  
  @scala.inline
  def apply(instanceUrl: InstanceUrl): DynatraceConnectorProfileProperties = {
    val __obj = js.Dynamic.literal(instanceUrl = instanceUrl.asInstanceOf[js.Any])
    __obj.asInstanceOf[DynatraceConnectorProfileProperties]
  }
  
  @scala.inline
  implicit class DynatraceConnectorProfilePropertiesMutableBuilder[Self <: DynatraceConnectorProfileProperties] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setInstanceUrl(value: InstanceUrl): Self = StObject.set(x, "instanceUrl", value.asInstanceOf[js.Any])
  }
}
