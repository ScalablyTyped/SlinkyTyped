package typingsSlinky.atIonicCliDashFramework.libMod

import typingsSlinky.atIonicCliDashFramework.definitionsMod.CommandMetadata
import typingsSlinky.atIonicCliDashFramework.definitionsMod.CommandMetadataInput
import typingsSlinky.atIonicCliDashFramework.definitionsMod.CommandMetadataOption
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@ionic/cli-framework/lib", "Command")
@js.native
abstract class Command ()
  extends typingsSlinky.atIonicCliDashFramework.libCommandMod.BaseCommand[
      typingsSlinky.atIonicCliDashFramework.libCommandMod.Command, 
      typingsSlinky.atIonicCliDashFramework.libCommandMod.Namespace, 
      CommandMetadata[CommandMetadataInput, CommandMetadataOption], 
      CommandMetadataInput, 
      CommandMetadataOption
    ]

