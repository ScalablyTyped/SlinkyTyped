package typingsSlinky.ionicCliFramework.libMod

import typingsSlinky.ionicCliFramework.definitionsMod.CommandMapGetter
import typingsSlinky.ionicCliFramework.definitionsMod.CommandMetadata
import typingsSlinky.ionicCliFramework.definitionsMod.CommandMetadataInput
import typingsSlinky.ionicCliFramework.definitionsMod.CommandMetadataOption
import typingsSlinky.ionicUtilsObject.mod.AliasedMap
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@ionic/cli-framework/lib", "CommandMap")
@js.native
class CommandMap ()
  extends AliasedMap[
      String, 
      CommandMapGetter[
        typingsSlinky.ionicCliFramework.commandMod.Command, 
        typingsSlinky.ionicCliFramework.commandMod.Namespace, 
        CommandMetadata[CommandMetadataInput, CommandMetadataOption], 
        CommandMetadataInput, 
        CommandMetadataOption
      ]
    ]

