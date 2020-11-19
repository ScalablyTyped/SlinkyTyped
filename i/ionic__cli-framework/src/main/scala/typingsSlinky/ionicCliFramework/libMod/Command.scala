package typingsSlinky.ionicCliFramework.libMod

import typingsSlinky.ionicCliFramework.definitionsMod.CommandMetadata
import typingsSlinky.ionicCliFramework.definitionsMod.CommandMetadataInput
import typingsSlinky.ionicCliFramework.definitionsMod.CommandMetadataOption
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@ionic/cli-framework/lib", "Command")
@js.native
abstract class Command ()
  extends typingsSlinky.ionicCliFramework.commandMod.BaseCommand[
      typingsSlinky.ionicCliFramework.commandMod.Command, 
      typingsSlinky.ionicCliFramework.commandMod.Namespace, 
      CommandMetadata[CommandMetadataInput, CommandMetadataOption], 
      CommandMetadataInput, 
      CommandMetadataOption
    ]
