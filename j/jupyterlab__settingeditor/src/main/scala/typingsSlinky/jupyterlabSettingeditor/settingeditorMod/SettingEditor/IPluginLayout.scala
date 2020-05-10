package typingsSlinky.jupyterlabSettingeditor.settingeditorMod.SettingEditor

import typingsSlinky.phosphorCoreutils.jsonMod.JSONObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The layout information that is stored and restored from the state database.
  */
@js.native
trait IPluginLayout extends JSONObject {
  /**
    * The current plugin being displayed.
    */
  var plugin: String = js.native
  var sizes: js.Array[Double] = js.native
}

object IPluginLayout {
  @scala.inline
  def apply(plugin: String, sizes: js.Array[Double]): IPluginLayout = {
    val __obj = js.Dynamic.literal(plugin = plugin.asInstanceOf[js.Any], sizes = sizes.asInstanceOf[js.Any])
    __obj.asInstanceOf[IPluginLayout]
  }
  @scala.inline
  implicit class IPluginLayoutOps[Self <: IPluginLayout] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withPlugin(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("plugin")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSizes(value: js.Array[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sizes")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

