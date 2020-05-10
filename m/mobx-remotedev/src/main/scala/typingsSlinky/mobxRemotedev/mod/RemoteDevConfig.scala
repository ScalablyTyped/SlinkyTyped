package typingsSlinky.mobxRemotedev.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RemoteDevConfig extends js.Object {
  /**map of arrays named whitelist or blacklist to filter action types. You can also set it globally in the extension settings.
    */
  var filters: js.UndefOr[js.Object] = js.native
  /**set it to true in order to assign dispatching of all unhandled actions to this store. Useful for nested classes /
    *  observables or when having async actions without specifying the scope explicitly. */
  var global: js.UndefOr[Boolean] = js.native
  /**use to specify host for remotedev-server. If port is specified, default value is localhost. */
  var hostname: js.UndefOr[String] = js.native
  /**the instance name to be showed on the monitor page. Default value is document.title. */
  var name: js.UndefOr[String] = js.native
  /**set it to true to have a clear log only with actions. If MobX is in strict mode, it is true by default. Don't forget about async actions. */
  var onlyActions: js.UndefOr[Boolean] = js.native
  /**use to specify host's port for remotedev-server. */
  var port: js.UndefOr[Double] = js.native
  /** set it to true to have remote monitoring via the local or remotedev.io server. remote: false is used for the extension or react-native-debugger */
  var remote: js.UndefOr[Boolean] = js.native
}

object RemoteDevConfig {
  @scala.inline
  def apply(): RemoteDevConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RemoteDevConfig]
  }
  @scala.inline
  implicit class RemoteDevConfigOps[Self <: RemoteDevConfig] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFilters(value: js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filters")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFilters: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filters")(js.undefined)
        ret
    }
    @scala.inline
    def withGlobal(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("global")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGlobal: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("global")(js.undefined)
        ret
    }
    @scala.inline
    def withHostname(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hostname")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHostname: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hostname")(js.undefined)
        ret
    }
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(js.undefined)
        ret
    }
    @scala.inline
    def withOnlyActions(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onlyActions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOnlyActions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onlyActions")(js.undefined)
        ret
    }
    @scala.inline
    def withPort(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("port")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPort: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("port")(js.undefined)
        ret
    }
    @scala.inline
    def withRemote(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("remote")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRemote: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("remote")(js.undefined)
        ret
    }
  }
  
}

