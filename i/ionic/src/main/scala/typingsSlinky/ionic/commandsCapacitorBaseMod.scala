package typingsSlinky.ionic

import typingsSlinky.ionic.definitionsMod.CommandInstanceInfo
import typingsSlinky.ionic.definitionsMod.ProjectIntegration
import typingsSlinky.ionic.libCommandMod.Command
import typingsSlinky.std.Required
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ionic/commands/capacitor/base", JSImport.Namespace)
@js.native
object commandsCapacitorBaseMod extends js.Object {
  @js.native
  abstract class CapacitorCommand () extends Command {
    var _integration: js.UndefOr[js.Any] = js.native
    var _runCapacitor: js.Any = js.native
    var promptToInstallCapacitor: js.Any = js.native
    def checkCapacitor(runinfo: CommandInstanceInfo): js.Promise[Unit] = js.native
    def checkForPlatformInstallation(platform: String): js.Promise[Unit] = js.native
    def integration(): Required[ProjectIntegration] = js.native
    def preRunChecks(runinfo: CommandInstanceInfo): js.Promise[Unit] = js.native
    def runCapacitor(argList: js.Array[String]): js.Promise[Unit] = js.native
  }
  
}

