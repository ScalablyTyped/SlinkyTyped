package typingsSlinky.awsSdkBuildTypes.customizationMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ServiceCustomizationDefinition extends js.Object {
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
  implicit class ServiceCustomizationDefinitionOps[Self <: ServiceCustomizationDefinition] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withClient(value: js.Array[CustomizationDefinition]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("client")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCommands(value: StringDictionary[js.Array[CustomizationDefinition]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("commands")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

