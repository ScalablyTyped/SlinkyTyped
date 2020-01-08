package typingsSlinky.atJimpCustom

import typingsSlinky.atJimpCore.typesEtcMod.Image
import typingsSlinky.atJimpCore.typesJimpMod.Jimp
import typingsSlinky.atJimpCore.typesJimpMod.JimpConstructors
import typingsSlinky.atJimpCore.typesPluginsMod.JimpPlugin
import typingsSlinky.atJimpCore.typesPluginsMod.JimpType
import typingsSlinky.atJimpCore.typesUtilsMod.FunctionRet
import typingsSlinky.atJimpCore.typesUtilsMod.GetIntersectionFromPlugins
import typingsSlinky.std.Exclude
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@jimp/custom", JSImport.Namespace)
@js.native
object atJimpCustomMod extends js.Object {
  def default[TypesFuncArr /* <: js.UndefOr[FunctionRet[JimpType[Image]]] */, PluginFuncArr /* <: js.UndefOr[FunctionRet[JimpPlugin[Image]]] */, J /* <: Jimp */](configuration: Anon_Plugins[TypesFuncArr, PluginFuncArr]): JimpInstance[TypesFuncArr, PluginFuncArr, J] = js.native
  def default[TypesFuncArr /* <: js.UndefOr[FunctionRet[JimpType[Image]]] */, PluginFuncArr /* <: js.UndefOr[FunctionRet[JimpPlugin[Image]]] */, J /* <: Jimp */](configuration: Anon_Plugins[TypesFuncArr, PluginFuncArr], jimpInstance: J): JimpInstance[TypesFuncArr, PluginFuncArr, J] = js.native
  type JimpInstance[TypesFuncArr /* <: js.UndefOr[FunctionRet[JimpType[Image]]] */, PluginFuncArr /* <: js.UndefOr[FunctionRet[JimpPlugin[Image]]] */, J /* <: Jimp */] = (Exclude[J, js.UndefOr[scala.Nothing]]) with (GetIntersectionFromPlugins[Exclude[TypesFuncArr | PluginFuncArr, js.UndefOr[scala.Nothing]]]) with JimpConstructors
}

