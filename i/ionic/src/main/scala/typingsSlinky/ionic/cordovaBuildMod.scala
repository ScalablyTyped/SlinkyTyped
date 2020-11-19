package typingsSlinky.ionic

import typingsSlinky.ionic.cordovaBaseMod.CordovaCommand
import typingsSlinky.ionic.definitionsMod.CommandInstanceInfo
import typingsSlinky.ionicCliFramework.definitionsMod.CommandLineInputs
import typingsSlinky.ionicCliFramework.definitionsMod.CommandLineOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("ionic/commands/cordova/build", JSImport.Namespace)
@js.native
object cordovaBuildMod extends js.Object {
  
  /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
  - typingsSlinky.ionicCliFramework.definitionsMod.ICommand because Already inherited
  - typingsSlinky.ionic.definitionsMod.ICommand because Already inherited
  - typingsSlinky.ionic.definitionsMod.CommandPreRun because var conflicts: env, namespace, project. Inlined preRun */ @js.native
  class BuildCommand () extends CordovaCommand {
    
    def preRun(inputs: CommandLineInputs, options: CommandLineOptions, runinfo: CommandInstanceInfo): js.Promise[Unit] = js.native
  }
}
