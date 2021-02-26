package typingsSlinky.ionic

import typingsSlinky.ionic.commandMod.Command
import typingsSlinky.ionic.definitionsMod.CommandInstanceInfo
import typingsSlinky.ionic.definitionsMod.INamespace
import typingsSlinky.ionic.definitionsMod.ResolvedStarterTemplate
import typingsSlinky.ionic.definitionsMod.StarterManifest
import typingsSlinky.ionicCliFramework.definitionsMod.CommandLineInputs
import typingsSlinky.ionicCliFramework.definitionsMod.CommandLineOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object startMod {
  
  /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
  - typingsSlinky.ionicCliFramework.definitionsMod.ICommand because Already inherited
  - typingsSlinky.ionic.definitionsMod.ICommand because Already inherited
  - typingsSlinky.ionic.definitionsMod.CommandPreRun because var conflicts: env, namespace, project. Inlined preRun */ @JSImport("ionic/commands/start", "StartCommand")
  @js.native
  class StartCommand protected () extends Command {
    def this(namespace: INamespace) = this()
    
    var canRemoveExisting: js.Any = js.native
    
    def checkForExisting(projectDir: String): js.Promise[Unit] = js.native
    
    def downloadStarterTemplate(projectDir: String, starterTemplate: ResolvedStarterTemplate): js.Promise[Unit] = js.native
    
    def findStarterTemplate(template: String, `type`: String, tag: String): js.Promise[ResolvedStarterTemplate] = js.native
    
    def getProjectType(): js.Promise[String] = js.native
    
    def loadManifest(manifestPath: String): js.Promise[js.UndefOr[StarterManifest]] = js.native
    
    def performManifestOps(manifest: StarterManifest): js.Promise[Unit] = js.native
    
    def preRun(inputs: CommandLineInputs, options: CommandLineOptions): js.Promise[Unit] = js.native
    def preRun(inputs: CommandLineInputs, options: CommandLineOptions, metadata: CommandInstanceInfo): js.Promise[Unit] = js.native
    
    def run(inputs: CommandLineInputs, options: CommandLineOptions, runinfo: CommandInstanceInfo): js.Promise[Unit] = js.native
    
    var schema: js.Any = js.native
    
    def showNextSteps(projectDir: String, cloned: Boolean, linkConfirmed: Boolean): js.Promise[Unit] = js.native
    
    def validateProjectId(projectId: String): js.Promise[Unit] = js.native
    
    def validateProjectType(`type`: String): js.Promise[Unit] = js.native
  }
}
