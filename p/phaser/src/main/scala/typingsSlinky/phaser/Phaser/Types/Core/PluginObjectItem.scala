package typingsSlinky.phaser.Phaser.Types.Core

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PluginObjectItem extends js.Object {
  /**
    * Arbitrary data passed to the plugin's init() method.
    */
  var data: js.UndefOr[js.Any] = js.native
  /**
    * A key to identify the plugin in the Plugin Manager.
    */
  var key: js.UndefOr[String] = js.native
  /**
    * If this plugin is to be injected into the Scene Systems, this is the property key map used.
    */
  var mapping: js.UndefOr[String] = js.native
  /**
    * The plugin itself. Usually a class/constructor.
    */
  var plugin: js.UndefOr[js.Any] = js.native
  /**
    * For a scene plugin, add the plugin to the scene object under this key (`this.KEY`, from the scene).
    */
  var sceneKey: js.UndefOr[String] = js.native
  /**
    * Whether the plugin should be started automatically.
    */
  var start: js.UndefOr[Boolean] = js.native
  /**
    * For a scene plugin, add the plugin to the scene's systems object under this key (`this.sys.KEY`, from the scene).
    */
  var systemKey: js.UndefOr[String] = js.native
}

object PluginObjectItem {
  @scala.inline
  def apply(): PluginObjectItem = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PluginObjectItem]
  }
  @scala.inline
  implicit class PluginObjectItemOps[Self <: PluginObjectItem] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withData(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("data")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutData: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("data")(js.undefined)
        ret
    }
    @scala.inline
    def withKey(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("key")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutKey: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("key")(js.undefined)
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
    @scala.inline
    def withPlugin(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("plugin")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPlugin: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("plugin")(js.undefined)
        ret
    }
    @scala.inline
    def withSceneKey(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sceneKey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSceneKey: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sceneKey")(js.undefined)
        ret
    }
    @scala.inline
    def withStart(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("start")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStart: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("start")(js.undefined)
        ret
    }
    @scala.inline
    def withSystemKey(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("systemKey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSystemKey: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("systemKey")(js.undefined)
        ret
    }
  }
  
}

