package typingsSlinky.ionic.shellMod

import typingsSlinky.ionic.definitionsMod.IShell
import typingsSlinky.ionic.definitionsMod.IShellSpawnOptions
import typingsSlinky.ionicUtilsSubprocess.mod.Subprocess
import typingsSlinky.ionicUtilsSubprocess.mod.SubprocessOptions
import typingsSlinky.node.childProcessMod.SpawnOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("ionic/lib/shell", "Shell")
@js.native
class Shell protected () extends IShell {
  def this(e: ShellDeps) = this()
  def this(e: ShellDeps, options: ShellOptions) = this()
  
  def createSubprocess(command: String): js.Promise[Subprocess] = js.native
  def createSubprocess(command: String, args: js.UndefOr[scala.Nothing], options: SubprocessOptions): js.Promise[Subprocess] = js.native
  
  val e: ShellDeps = js.native
  
  /* protected */ def prepareSpawnOptions(options: IShellSpawnOptions): Unit = js.native
  
  /**
    * When `child_process.spawn` isn't provided a full path to the command
    * binary, it behaves differently on Windows than other platforms. For
    * Windows, discover the full path to the binary, otherwise fallback to the
    * command provided.
    *
    * @see https://github.com/ionic-team/ionic-cli/issues/3563#issuecomment-425232005
    */
  def resolveCommandPath(command: String, options: SpawnOptions): js.Promise[String] = js.native
}
