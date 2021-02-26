package typingsSlinky.ionic

import typingsSlinky.ionic.coreMod.DeployConfCommand
import typingsSlinky.ionic.definitionsMod.CommandInstanceInfo
import typingsSlinky.ionic.definitionsMod.INamespace
import typingsSlinky.ionicCliFramework.definitionsMod.CommandLineInputs
import typingsSlinky.ionicCliFramework.definitionsMod.CommandLineOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object deployAddMod {
  
  @JSImport("ionic/commands/deploy/add", "AddCommand")
  @js.native
  class AddCommand protected () extends DeployConfCommand {
    def this(namespace: INamespace) = this()
    
    /* protected */ def buildCordovaDeployOptions(options: CommandLineOptions): js.Array[String] = js.native
    
    def preRun(inputs: CommandLineInputs, options: CommandLineOptions): js.Promise[Unit] = js.native
    
    def run(inputs: CommandLineInputs, options: CommandLineOptions, runinfo: CommandInstanceInfo): js.Promise[Unit] = js.native
  }
}
