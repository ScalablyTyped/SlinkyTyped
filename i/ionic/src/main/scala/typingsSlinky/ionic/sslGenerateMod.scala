package typingsSlinky.ionic

import typingsSlinky.ionic.definitionsMod.CommandInstanceInfo
import typingsSlinky.ionic.definitionsMod.INamespace
import typingsSlinky.ionic.sslBaseMod.SSLBaseCommand
import typingsSlinky.ionicCliFramework.definitionsMod.CommandLineInputs
import typingsSlinky.ionicCliFramework.definitionsMod.CommandLineOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sslGenerateMod {
  
  /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
  - typingsSlinky.ionicCliFramework.definitionsMod.ICommand because Already inherited
  - typingsSlinky.ionic.definitionsMod.ICommand because Already inherited
  - typingsSlinky.ionic.definitionsMod.CommandPreRun because var conflicts: env, namespace, project. Inlined preRun */ @JSImport("ionic/commands/ssl/generate", "SSLGenerateCommand")
  @js.native
  class SSLGenerateCommand protected () extends SSLBaseCommand {
    def this(namespace: INamespace) = this()
    
    var checkExistingFile: js.Any = js.native
    
    var ensureDirectory: js.Any = js.native
    
    var formatSubj: js.Any = js.native
    
    def getDefaultCertPath(): String = js.native
    
    def getDefaultKeyPath(): String = js.native
    
    def preRun(inputs: CommandLineInputs, options: CommandLineOptions): js.Promise[Unit] = js.native
    def preRun(inputs: CommandLineInputs, options: CommandLineOptions, metadata: CommandInstanceInfo): js.Promise[Unit] = js.native
    
    var writeConfig: js.Any = js.native
  }
}
