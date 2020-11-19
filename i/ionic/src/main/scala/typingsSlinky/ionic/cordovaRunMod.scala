package typingsSlinky.ionic

import typingsSlinky.ionic.cordovaBaseMod.CordovaCommand
import typingsSlinky.ionic.definitionsMod.CommandInstanceInfo
import typingsSlinky.ionicCliFramework.definitionsMod.CommandLineInputs
import typingsSlinky.ionicCliFramework.definitionsMod.CommandLineOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("ionic/commands/cordova/run", JSImport.Namespace)
@js.native
object cordovaRunMod extends js.Object {
  
  /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
  - typingsSlinky.ionicCliFramework.definitionsMod.ICommand because Already inherited
  - typingsSlinky.ionic.definitionsMod.ICommand because Already inherited
  - typingsSlinky.ionic.definitionsMod.CommandPreRun because var conflicts: env, namespace, project. Inlined preRun */ @js.native
  class RunCommand () extends CordovaCommand {
    
    /* protected */ def checkNativeRun(): js.Promise[Unit] = js.native
    
    def preRun(inputs: CommandLineInputs, options: CommandLineOptions, runinfo: CommandInstanceInfo): js.Promise[Unit] = js.native
    
    /* protected */ def runBuildDeploy(inputs: CommandLineInputs, options: CommandLineOptions): js.Promise[Unit] = js.native
    
    /* protected */ def runNativeRun(args: js.Array[String]): js.Promise[Unit] = js.native
    
    /* protected */ def runServeDeploy(inputs: CommandLineInputs, options: CommandLineOptions): js.Promise[Unit] = js.native
  }
}
