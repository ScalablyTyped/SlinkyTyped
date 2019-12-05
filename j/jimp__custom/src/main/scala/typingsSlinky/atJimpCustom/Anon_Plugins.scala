package typingsSlinky.atJimpCustom

import typingsSlinky.atJimpCore.typesEtcMod.Image
import typingsSlinky.atJimpCore.typesPluginsMod.JimpPlugin
import typingsSlinky.atJimpCore.typesPluginsMod.JimpType
import typingsSlinky.atJimpCore.typesUtilsMod.FunctionRet
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Plugins[TypesFuncArr /* <: js.UndefOr[FunctionRet[JimpType[Image]]] */, PluginFuncArr /* <: js.UndefOr[FunctionRet[JimpPlugin[Image]]] */] extends js.Object {
  var plugins: js.UndefOr[PluginFuncArr] = js.undefined
  var types: js.UndefOr[TypesFuncArr] = js.undefined
}

object Anon_Plugins {
  @scala.inline
  def apply[TypesFuncArr /* <: js.UndefOr[FunctionRet[JimpType[Image]]] */, PluginFuncArr /* <: js.UndefOr[FunctionRet[JimpPlugin[Image]]] */](plugins: PluginFuncArr = null, types: TypesFuncArr = null): Anon_Plugins[TypesFuncArr, PluginFuncArr] = {
    val __obj = js.Dynamic.literal()
    if (plugins != null) __obj.updateDynamic("plugins")(plugins.asInstanceOf[js.Any])
    if (types != null) __obj.updateDynamic("types")(types.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Plugins[TypesFuncArr, PluginFuncArr]]
  }
}

