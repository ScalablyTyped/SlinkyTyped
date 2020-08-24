package typingsSlinky.chromeLauncher

import typingsSlinky.chromeLauncher.chromeLauncherMod.LaunchedChrome
import typingsSlinky.chromeLauncher.chromeLauncherMod.ModuleOverrides
import typingsSlinky.chromeLauncher.chromeLauncherMod.Options
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("chrome-launcher", JSImport.Namespace)
@js.native
object mod extends js.Object {
  @js.native
  class Launcher ()
    extends typingsSlinky.chromeLauncher.chromeLauncherMod.Launcher {
    def this(opts: Options) = this()
    def this(opts: js.UndefOr[scala.Nothing], moduleOverrides: ModuleOverrides) = this()
    def this(opts: Options, moduleOverrides: ModuleOverrides) = this()
  }
  
  def killAll(): js.Promise[js.Array[js.Error]] = js.native
  def launch(): js.Promise[LaunchedChrome] = js.native
  def launch(opts: Options): js.Promise[LaunchedChrome] = js.native
  /* static members */
  @js.native
  object Launcher extends js.Object {
    def defaultFlags(): js.Array[String] = js.native
    /** Returns the highest priority chrome installation. */
    def getFirstInstallation(): js.UndefOr[String] = js.native
    /** Returns all available chrome installations in decreasing priority order. */
    def getInstallations(): js.Array[String] = js.native
  }
  
}

