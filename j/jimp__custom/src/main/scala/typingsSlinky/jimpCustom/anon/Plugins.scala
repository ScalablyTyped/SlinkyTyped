package typingsSlinky.jimpCustom.anon

import typingsSlinky.jimpCore.etcMod.Image
import typingsSlinky.jimpCore.pluginsMod.JimpPlugin
import typingsSlinky.jimpCore.pluginsMod.JimpType
import typingsSlinky.jimpCore.utilsMod.FunctionRet
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Plugins[TypesFuncArr /* <: js.UndefOr[FunctionRet[JimpType[Image]]] */, PluginFuncArr /* <: js.UndefOr[FunctionRet[JimpPlugin[Image]]] */] extends js.Object {
  var plugins: js.UndefOr[PluginFuncArr] = js.native
  var types: js.UndefOr[TypesFuncArr] = js.native
}

object Plugins {
  @scala.inline
  def apply[TypesFuncArr, PluginFuncArr](): Plugins[TypesFuncArr, PluginFuncArr] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Plugins[TypesFuncArr, PluginFuncArr]]
  }
  @scala.inline
  implicit class PluginsOps[Self[typesfuncarr, pluginfuncarr] <: Plugins[typesfuncarr, pluginfuncarr], TypesFuncArr, PluginFuncArr] (val x: Self[TypesFuncArr, PluginFuncArr]) extends AnyVal {
    @scala.inline
    def duplicate: Self[TypesFuncArr, PluginFuncArr] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[TypesFuncArr, PluginFuncArr]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): (Self[TypesFuncArr, PluginFuncArr]) with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[(Self[TypesFuncArr, PluginFuncArr]) with Other]
    @scala.inline
    def withPlugins(value: PluginFuncArr): Self[TypesFuncArr, PluginFuncArr] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("plugins")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPlugins: Self[TypesFuncArr, PluginFuncArr] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("plugins")(js.undefined)
        ret
    }
    @scala.inline
    def withTypes(value: TypesFuncArr): Self[TypesFuncArr, PluginFuncArr] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("types")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTypes: Self[TypesFuncArr, PluginFuncArr] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("types")(js.undefined)
        ret
    }
  }
  
}

