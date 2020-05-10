package typingsSlinky.osService.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AddOptions extends js.Object {
  /**
    * An array of strings specifying other services this service depends on, this is optional
    */
  var dependencies: js.UndefOr[js.Array[String]] = js.native
  /**
    * The services display name, defaults to the name parameter. T
    * his parameter will be used on Windows platforms only
    */
  var displayName: js.UndefOr[String] = js.native
  /**
    * An array of strings specifying parameters to pass to nodePath, defaults to []
    */
  var nodeArgs: js.UndefOr[js.Array[String]] = js.native
  /**
    * The fully qualified path to the node binary used to run the service
    * (i.e. c:\Program Files\nodejs\node.exe, defaults to the value of process.execPath
    */
  var nodePath: js.UndefOr[String] = js.native
  /**
    * See the username parameter
    */
  var password: js.UndefOr[String] = js.native
  /**
    * An array of strings specifying parameters to pass to programPath, defaults to []
    */
  var programArgs: js.UndefOr[js.Array[String]] = js.native
  /**
    * The program to run using nodePath, defaults to the value of process.argv[1]
    */
  var programPath: js.UndefOr[String] = js.native
  /**
    * An array of numbers specifying Linux run-levels at which the service should be started
    * for Linux platforms, defaults to [2, 3, 4, 5], this is only used when chkconfig or
    * update-rc.d is used to install a service
    */
  var runLevels: js.UndefOr[js.Array[Double]] = js.native
  /**
    * For when systemd will be used a target can be specified for the WantedBy
    * attribute under the [Install] section in the generated systemd unit file,
    * defaults to multi-user.target
    */
  var systemdWantedBy: js.UndefOr[String] = js.native
  /**
    * For Windows platforms a username and password can be specified,
    * the service will be run using these credentials when started,
    * see the CreateService() functions win32 API documentation for
    * details on the format of the username, on all other platforms this parameter is ignored
    */
  var username: js.UndefOr[String] = js.native
}

object AddOptions {
  @scala.inline
  def apply(): AddOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AddOptions]
  }
  @scala.inline
  implicit class AddOptionsOps[Self <: AddOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDependencies(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dependencies")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDependencies: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dependencies")(js.undefined)
        ret
    }
    @scala.inline
    def withDisplayName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("displayName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDisplayName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("displayName")(js.undefined)
        ret
    }
    @scala.inline
    def withNodeArgs(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nodeArgs")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNodeArgs: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nodeArgs")(js.undefined)
        ret
    }
    @scala.inline
    def withNodePath(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nodePath")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNodePath: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nodePath")(js.undefined)
        ret
    }
    @scala.inline
    def withPassword(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("password")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPassword: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("password")(js.undefined)
        ret
    }
    @scala.inline
    def withProgramArgs(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("programArgs")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProgramArgs: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("programArgs")(js.undefined)
        ret
    }
    @scala.inline
    def withProgramPath(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("programPath")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProgramPath: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("programPath")(js.undefined)
        ret
    }
    @scala.inline
    def withRunLevels(value: js.Array[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("runLevels")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRunLevels: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("runLevels")(js.undefined)
        ret
    }
    @scala.inline
    def withSystemdWantedBy(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("systemdWantedBy")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSystemdWantedBy: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("systemdWantedBy")(js.undefined)
        ret
    }
    @scala.inline
    def withUsername(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("username")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUsername: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("username")(js.undefined)
        ret
    }
  }
  
}

