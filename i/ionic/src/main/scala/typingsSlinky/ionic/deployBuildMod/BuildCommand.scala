package typingsSlinky.ionic.deployBuildMod

import typingsSlinky.ionic.commandMod.Command
import typingsSlinky.ionicCliFramework.definitionsMod.CommandLineOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("ionic/commands/deploy/build", "BuildCommand")
@js.native
class BuildCommand () extends Command {
  
  def createDeployBuild(appflowId: String, token: String, options: CommandLineOptions): js.Promise[DeployBuild] = js.native
  
  def getDeployBuild(appflowId: String, buildId: Double, token: String): js.Promise[DeployBuild] = js.native
  
  def tailBuildLog(appflowId: String, buildId: Double, token: String): js.Promise[DeployBuild] = js.native
}
