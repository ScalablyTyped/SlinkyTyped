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

object resourcesMod {
  
  /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
  - typingsSlinky.ionicCliFramework.definitionsMod.ICommand because Already inherited
  - typingsSlinky.ionic.definitionsMod.ICommand because Already inherited
  - typingsSlinky.ionic.definitionsMod.CommandPreRun because var conflicts: env, namespace, project. Inlined preRun */ @JSImport("ionic/commands/cordova/resources", "ResourcesCommand")
  @js.native
  class ResourcesCommand protected () extends CordovaCommand {
    def this(namespace: INamespace) = this()
    
    def getBuildPlatforms(): js.Promise[js.Array[String]] = js.native
    
    def preRun(inputs: CommandLineInputs, options: CommandLineOptions, runinfo: CommandInstanceInfo): js.Promise[Unit] = js.native
    
    def runCordovaRes(platform: js.UndefOr[scala.Nothing], options: CommandLineOptions): js.Promise[Unit] = js.native
    def runCordovaRes(platform: String, options: CommandLineOptions): js.Promise[Unit] = js.native
    
    def runResourceServer(platform: js.UndefOr[scala.Nothing], options: CommandLineOptions): js.Promise[Unit] = js.native
    def runResourceServer(platform: String, options: CommandLineOptions): js.Promise[Unit] = js.native
  }
}
