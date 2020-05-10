package typingsSlinky.openfin.launcherMod

import typingsSlinky.node.childProcessMod.ChildProcess
import typingsSlinky.openfin.wireMod.ConfigWithRuntime
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Launcher extends js.Object {
  var Installer_Work_Dir: String = js.native
  var OpenFin_Installer: String = js.native
  var Security_Realm_Config_Key: String = js.native
  var macLaunch: js.Any = js.native
  var nixConfig: js.UndefOr[js.Any] = js.native
  var os: js.Any = js.native
  var winLaunch: js.Any = js.native
  def launch(config: ConfigWithRuntime, manifestLocation: String, namedPipeName: String): js.Promise[ChildProcess] = js.native
}

object Launcher {
  @scala.inline
  def apply(
    Installer_Work_Dir: String,
    OpenFin_Installer: String,
    Security_Realm_Config_Key: String,
    launch: (ConfigWithRuntime, String, String) => js.Promise[ChildProcess],
    macLaunch: js.Any,
    os: js.Any,
    winLaunch: js.Any
  ): Launcher = {
    val __obj = js.Dynamic.literal(Installer_Work_Dir = Installer_Work_Dir.asInstanceOf[js.Any], OpenFin_Installer = OpenFin_Installer.asInstanceOf[js.Any], Security_Realm_Config_Key = Security_Realm_Config_Key.asInstanceOf[js.Any], launch = js.Any.fromFunction3(launch), macLaunch = macLaunch.asInstanceOf[js.Any], os = os.asInstanceOf[js.Any], winLaunch = winLaunch.asInstanceOf[js.Any])
    __obj.asInstanceOf[Launcher]
  }
  @scala.inline
  implicit class LauncherOps[Self <: Launcher] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withInstaller_Work_Dir(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Installer_Work_Dir")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOpenFin_Installer(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("OpenFin_Installer")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSecurity_Realm_Config_Key(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Security_Realm_Config_Key")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLaunch(value: (ConfigWithRuntime, String, String) => js.Promise[ChildProcess]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("launch")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withMacLaunch(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("macLaunch")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOs(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("os")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withWinLaunch(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("winLaunch")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNixConfig(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nixConfig")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNixConfig: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nixConfig")(js.undefined)
        ret
    }
  }
  
}

