package typingsSlinky.ionicCliFramework.mod

import typingsSlinky.ionicCliFramework.definitionsMod.CommandMetadata
import typingsSlinky.ionicCliFramework.definitionsMod.CommandMetadataInput
import typingsSlinky.ionicCliFramework.definitionsMod.CommandMetadataOption
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@ionic/cli-framework", "Command")
@js.native
abstract class Command ()
  extends typingsSlinky.ionicCliFramework.commandMod.BaseCommand[
      typingsSlinky.ionicCliFramework.commandMod.Command, 
      typingsSlinky.ionicCliFramework.commandMod.Namespace, 
      CommandMetadata[CommandMetadataInput, CommandMetadataOption], 
      CommandMetadataInput, 
      CommandMetadataOption
    ]

