package typingsSlinky.phaser.Phaser.Types.Input

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait InputPluginContainer extends js.Object {
  /**
    * The unique name of this plugin in the input plugin cache.
    */
  var key: String = js.native
  /**
    * If this plugin is to be injected into the Input Plugin, this is the property key map used.
    */
  var mapping: js.UndefOr[String] = js.native
  /**
    * The plugin to be stored. Should be the source object, not instantiated.
    */
  var plugin: js.Function = js.native
}

object InputPluginContainer {
  @scala.inline
  def apply(key: String, plugin: js.Function): InputPluginContainer = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any], plugin = plugin.asInstanceOf[js.Any])
    __obj.asInstanceOf[InputPluginContainer]
  }
  @scala.inline
  implicit class InputPluginContainerOps[Self <: InputPluginContainer] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withKey(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("key")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPlugin(value: js.Function): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("plugin")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMapping(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mapping")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMapping: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mapping")(js.undefined)
        ret
    }
  }
  
}

