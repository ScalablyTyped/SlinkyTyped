package typingsSlinky.awsSdk.glueMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreateSecurityConfigurationResponse extends StObject {
  
  /**
    * The time at which the new security configuration was created.
    */
  var CreatedTimestamp: js.UndefOr[js.Date] = js.native
  
  /**
    * The name assigned to the new security configuration.
    */
  var Name: js.UndefOr[NameString] = js.native
}
object CreateSecurityConfigurationResponse {
  
  @scala.inline
  def apply(): CreateSecurityConfigurationResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateSecurityConfigurationResponse]
  }
  
  @scala.inline
  implicit class CreateSecurityConfigurationResponseMutableBuilder[Self <: CreateSecurityConfigurationResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCreatedTimestamp(value: js.Date): Self = StObject.set(x, "CreatedTimestamp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreatedTimestampUndefined: Self = StObject.set(x, "CreatedTimestamp", js.undefined)
    
    @scala.inline
    def setName(value: NameString): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "Name", js.undefined)
  }
}
