package typingsSlinky.ionic

import typingsSlinky.ionic.anon.NameString
import typingsSlinky.ionic.commandMod.Command
import typingsSlinky.ionic.definitionsMod.App
import typingsSlinky.ionic.definitionsMod.CommandInstanceInfo
import typingsSlinky.ionic.definitionsMod.INamespace
import typingsSlinky.ionicCliFramework.definitionsMod.CommandLineInputs
import typingsSlinky.ionicCliFramework.definitionsMod.CommandLineOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object linkMod {
  
  /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
  - typingsSlinky.ionicCliFramework.definitionsMod.ICommand because Already inherited
  - typingsSlinky.ionic.definitionsMod.ICommand because Already inherited
  - typingsSlinky.ionic.definitionsMod.CommandPreRun because var conflicts: env, namespace, project. Inlined preRun */ @JSImport("ionic/commands/link", "LinkCommand")
  @js.native
  class LinkCommand protected () extends Command {
    def this(namespace: INamespace) = this()
    
    def chooseApp(apps: js.Array[App]): js.Promise[String] = js.native
    
    def confirmGithubRepoExists(): js.Promise[Unit] = js.native
    
    def connectGithub(app: App, repoId: Double, branches: js.Array[String]): js.Promise[js.UndefOr[String]] = js.native
    
    def createApp(hasName: NameString, runinfo: CommandInstanceInfo): js.Promise[String] = js.native
    
    def formatRepoName(fullName: String): String = js.native
    
    var getAppClient: js.Any = js.native
    
    var getUserClient: js.Any = js.native
    
    def linkApp(app: App, runinfo: CommandInstanceInfo): js.Promise[Unit] = js.native
    
    def linkGithub(app: App): js.Promise[js.UndefOr[String]] = js.native
    
    def lookUpApp(id: String): js.Promise[App] = js.native
    
    def needsAssociation(app: App, userId: Double): js.Promise[Boolean] = js.native
    
    def oAuthProcess(userId: Double): js.Promise[Unit] = js.native
    
    def preRun(inputs: CommandLineInputs, options: CommandLineOptions): js.Promise[Unit] = js.native
    def preRun(inputs: CommandLineInputs, options: CommandLineOptions, metadata: CommandInstanceInfo): js.Promise[Unit] = js.native
    
    def run(inputs: CommandLineInputs, options: CommandLineOptions, runinfo: CommandInstanceInfo): js.Promise[Unit] = js.native
    
    def selectGithubBranches(repoId: Double): js.Promise[js.Array[String]] = js.native
    
    def selectGithubRepo(): js.Promise[Double] = js.native
  }
}
