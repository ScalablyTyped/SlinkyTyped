package typingsSlinky.phaser.Phaser.Types.Core

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PluginObject extends js.Object {
  /**
    * The default set of scene plugins (names).
    */
  var default: js.UndefOr[js.Array[String]] = js.native
  /**
    * Plugins to *add* to the default set of scene plugins.
    */
  var defaultMerge: js.UndefOr[js.Array[String]] = js.native
  /**
    * Global plugins to install.
    */
  var global: js.UndefOr[js.Array[PluginObjectItem]] = js.native
  /**
    * Scene plugins to install.
    */
  var scene: js.UndefOr[js.Array[PluginObjectItem]] = js.native
}

object PluginObject {
  @scala.inline
  def apply(): PluginObject = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PluginObject]
  }
  @scala.inline
  implicit class PluginObjectOps[Self <: PluginObject] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDefault(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("default")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDefault: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("default")(js.undefined)
        ret
    }
    @scala.inline
    def withDefaultMerge(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultMerge")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDefaultMerge: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultMerge")(js.undefined)
        ret
    }
    @scala.inline
    def withGlobal(value: js.Array[PluginObjectItem]): Self = {
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
    def withScene(value: js.Array[PluginObjectItem]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scene")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutScene: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scene")(js.undefined)
        ret
    }
  }
  
}

