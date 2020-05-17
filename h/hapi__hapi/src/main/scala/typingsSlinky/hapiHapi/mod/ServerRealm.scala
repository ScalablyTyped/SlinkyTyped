package typingsSlinky.hapiHapi.mod

import typingsSlinky.hapiHapi.anon.Bind
import typingsSlinky.hapiHapi.anon.Route
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ServerRealm extends js.Object {
  /** when the server object is provided as an argument to the plugin register() method, modifiers provides the registration preferences passed the server.register() method and includes: */
  var modifiers: Route = js.native
  /** the realm of the parent server object, or null for the root server. */
  var parent: ServerRealm | Null = js.native
  /** the active plugin name (empty string if at the server root). */
  var plugin: String = js.native
  /** the plugin options object passed at registration. */
  var pluginOptions: js.Object = js.native
  /** plugin-specific state to be shared only among activities sharing the same active state. plugins is an object where each key is a plugin name and the value is the plugin state. */
  var plugins: PluginsStates = js.native
  /** settings overrides */
  var settings: Bind = js.native
}

object ServerRealm {
  @scala.inline
  def apply(modifiers: Route, plugin: String, pluginOptions: js.Object, plugins: PluginsStates, settings: Bind): ServerRealm = {
    val __obj = js.Dynamic.literal(modifiers = modifiers.asInstanceOf[js.Any], plugin = plugin.asInstanceOf[js.Any], pluginOptions = pluginOptions.asInstanceOf[js.Any], plugins = plugins.asInstanceOf[js.Any], settings = settings.asInstanceOf[js.Any])
    __obj.asInstanceOf[ServerRealm]
  }
  @scala.inline
  implicit class ServerRealmOps[Self <: ServerRealm] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withModifiers(value: Route): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("modifiers")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPlugin(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("plugin")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPluginOptions(value: js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pluginOptions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPlugins(value: PluginsStates): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("plugins")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSettings(value: Bind): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("settings")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withParent(value: ServerRealm): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withParentNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parent")(null)
        ret
    }
  }
  
}

