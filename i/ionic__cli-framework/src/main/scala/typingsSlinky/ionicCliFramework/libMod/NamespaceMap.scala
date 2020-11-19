package typingsSlinky.ionicCliFramework.libMod

import typingsSlinky.ionicCliFramework.definitionsMod.CommandMetadata
import typingsSlinky.ionicCliFramework.definitionsMod.CommandMetadataInput
import typingsSlinky.ionicCliFramework.definitionsMod.CommandMetadataOption
import typingsSlinky.ionicCliFramework.definitionsMod.NamespaceMapGetter
import typingsSlinky.ionicUtilsObject.mod.AliasedMap
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@ionic/cli-framework/lib", "NamespaceMap")
@js.native
class NamespaceMap ()
  extends AliasedMap[
      String, 
      NamespaceMapGetter[
        typingsSlinky.ionicCliFramework.commandMod.Command, 
        typingsSlinky.ionicCliFramework.commandMod.Namespace, 
        CommandMetadata[CommandMetadataInput, CommandMetadataOption], 
        CommandMetadataInput, 
        CommandMetadataOption
      ]
    ]
