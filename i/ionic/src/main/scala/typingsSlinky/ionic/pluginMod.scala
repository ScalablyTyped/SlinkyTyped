package typingsSlinky.ionic

import typingsSlinky.ionic.cordovaBaseMod.CordovaCommand
import typingsSlinky.ionic.definitionsMod.CommandInstanceInfo
import typingsSlinky.ionic.definitionsMod.INamespace
import typingsSlinky.ionicCliFramework.definitionsMod.CommandLineInputs
import typingsSlinky.ionicCliFramework.definitionsMod.CommandLineOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object pluginMod {
  
  /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
  - typingsSlinky.ionicCliFramework.definitionsMod.ICommand because Already inherited
  - typingsSlinky.ionic.definitionsMod.ICommand because Already inherited
  - typingsSlinky.ionic.definitionsMod.CommandPreRun because var conflicts: env, namespace, project. Inlined preRun */ @JSImport("ionic/commands/cordova/plugin", "PluginCommand")
  @js.native
  class PluginCommand protected () extends CordovaCommand {
    def this(namespace: INamespace) = this()
    
    def preRun(inputs: CommandLineInputs, options: CommandLineOptions, runinfo: CommandInstanceInfo): js.Promise[Unit] = js.native
  }
}
