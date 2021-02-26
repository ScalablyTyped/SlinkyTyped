package typingsSlinky.awsSdk.emrMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreateSecurityConfigurationOutput extends StObject {
  
  /**
    * The date and time the security configuration was created.
    */
  var CreationDateTime: js.Date = js.native
  
  /**
    * The name of the security configuration.
    */
  var Name: XmlString = js.native
}
object CreateSecurityConfigurationOutput {
  
  @scala.inline
  def apply(CreationDateTime: js.Date, Name: XmlString): CreateSecurityConfigurationOutput = {
    val __obj = js.Dynamic.literal(CreationDateTime = CreationDateTime.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateSecurityConfigurationOutput]
  }
  
  @scala.inline
  implicit class CreateSecurityConfigurationOutputMutableBuilder[Self <: CreateSecurityConfigurationOutput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCreationDateTime(value: js.Date): Self = StObject.set(x, "CreationDateTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: XmlString): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
  }
}
