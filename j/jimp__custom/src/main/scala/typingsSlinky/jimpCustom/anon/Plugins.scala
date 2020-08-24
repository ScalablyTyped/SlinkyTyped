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
  def apply[/* <: js.UndefOr[
  typingsSlinky.jimpCore.utilsMod.FunctionRet[typingsSlinky.jimpCore.pluginsMod.JimpType[typingsSlinky.jimpCore.etcMod.Image]]] */ TypesFuncArr, /* <: js.UndefOr[
  typingsSlinky.jimpCore.utilsMod.FunctionRet[
    typingsSlinky.jimpCore.pluginsMod.JimpPlugin[typingsSlinky.jimpCore.etcMod.Image]
  ]] */ PluginFuncArr](): Plugins[TypesFuncArr, PluginFuncArr] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Plugins[TypesFuncArr, PluginFuncArr]]
  }
  @scala.inline
  implicit class PluginsOps[Self <: Plugins[_, _], /* <: js.UndefOr[
  typingsSlinky.jimpCore.utilsMod.FunctionRet[typingsSlinky.jimpCore.pluginsMod.JimpType[typingsSlinky.jimpCore.etcMod.Image]]] */ TypesFuncArr, /* <: js.UndefOr[
  typingsSlinky.jimpCore.utilsMod.FunctionRet[
    typingsSlinky.jimpCore.pluginsMod.JimpPlugin[typingsSlinky.jimpCore.etcMod.Image]
  ]] */ PluginFuncArr] (val x: Self with (Plugins[TypesFuncArr, PluginFuncArr])) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setPlugins(value: PluginFuncArr): Self = this.set("plugins", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePlugins: Self = this.set("plugins", js.undefined)
    @scala.inline
    def setTypes(value: TypesFuncArr): Self = this.set("types", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTypes: Self = this.set("types", js.undefined)
  }
  
}

