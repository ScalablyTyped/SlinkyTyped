package typingsSlinky.awsSdk.appflowMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ServiceNowSourceProperties extends StObject {
  
  /**
    *  The object specified in the ServiceNow flow source. 
    */
  var `object`: Object = js.native
}
object ServiceNowSourceProperties {
  
  @scala.inline
  def apply(`object`: Object): ServiceNowSourceProperties = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("object")(`object`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ServiceNowSourceProperties]
  }
  
  @scala.inline
  implicit class ServiceNowSourcePropertiesMutableBuilder[Self <: ServiceNowSourceProperties] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setObject(value: Object): Self = StObject.set(x, "object", value.asInstanceOf[js.Any])
  }
}
