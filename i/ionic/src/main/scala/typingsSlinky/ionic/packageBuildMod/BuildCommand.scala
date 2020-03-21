package typingsSlinky.ionic.packageBuildMod

import typingsSlinky.ionic.commandMod.Command
import typingsSlinky.ionicCliFramework.definitionsMod.CommandLineInputs
import typingsSlinky.ionicCliFramework.definitionsMod.CommandLineOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ionic/commands/package/build", "BuildCommand")
@js.native
class BuildCommand () extends Command {
  def createPackageBuild(appflowId: String, token: String, platform: String, buildType: String, options: CommandLineOptions): js.Promise[PackageBuild] = js.native
  def downloadBuild(url: String, filename: String): js.Promise[String] = js.native
  def getDownloadUrl(appflowId: String, buildId: Double, token: String): js.Promise[DownloadUrl] = js.native
  def getPackageBuild(appflowId: String, buildId: Double, token: String): js.Promise[PackageBuild] = js.native
  def preRun(inputs: CommandLineInputs, options: CommandLineOptions): js.Promise[Unit] = js.native
  def tailBuildLog(appflowId: String, buildId: Double, token: String): js.Promise[PackageBuild] = js.native
}

