package typingsSlinky.awsSdkBuildTypes.customizationMod

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ServiceCustomizationDefinition extends StObject {
  
  /**
    * The customization definitions that should be applied to a service client.
    */
  var client: js.Array[CustomizationDefinition] = js.native
  
  /**
    * The customization definitions that should be applied to individual
    * operations within a service client.
    */
  var commands: StringDictionary[js.Array[CustomizationDefinition]] = js.native
}
object ServiceCustomizationDefinition {
  
  @scala.inline
  def apply(
    client: js.Array[CustomizationDefinition],
    commands: StringDictionary[js.Array[CustomizationDefinition]]
  ): ServiceCustomizationDefinition = {
    val __obj = js.Dynamic.literal(client = client.asInstanceOf[js.Any], commands = commands.asInstanceOf[js.Any])
    __obj.asInstanceOf[ServiceCustomizationDefinition]
  }
  
  @scala.inline
  implicit class ServiceCustomizationDefinitionMutableBuilder[Self <: ServiceCustomizationDefinition] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setClient(value: js.Array[CustomizationDefinition]): Self = StObject.set(x, "client", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClientVarargs(value: CustomizationDefinition*): Self = StObject.set(x, "client", js.Array(value :_*))
    
    @scala.inline
    def setCommands(value: StringDictionary[js.Array[CustomizationDefinition]]): Self = StObject.set(x, "commands", value.asInstanceOf[js.Any])
  }
}
