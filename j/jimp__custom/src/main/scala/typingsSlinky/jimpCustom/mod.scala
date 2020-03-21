package typingsSlinky.jimpCustom

import typingsSlinky.jimpCore.etcMod.Image
import typingsSlinky.jimpCore.jimpMod.Jimp
import typingsSlinky.jimpCore.jimpMod.JimpConstructors
import typingsSlinky.jimpCore.pluginsMod.JimpPlugin
import typingsSlinky.jimpCore.pluginsMod.JimpType
import typingsSlinky.jimpCore.utilsMod.FunctionRet
import typingsSlinky.jimpCore.utilsMod.GetIntersectionFromPlugins
import typingsSlinky.std.Exclude
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@jimp/custom", JSImport.Namespace)
@js.native
object mod extends js.Object {
  def default[TypesFuncArr /* <: js.UndefOr[FunctionRet[JimpType[Image]]] */, PluginFuncArr /* <: js.UndefOr[FunctionRet[JimpPlugin[Image]]] */, J /* <: Jimp */](configuration: AnonPlugins[TypesFuncArr, PluginFuncArr]): JimpInstance[TypesFuncArr, PluginFuncArr, J] = js.native
  def default[TypesFuncArr /* <: js.UndefOr[FunctionRet[JimpType[Image]]] */, PluginFuncArr /* <: js.UndefOr[FunctionRet[JimpPlugin[Image]]] */, J /* <: Jimp */](configuration: AnonPlugins[TypesFuncArr, PluginFuncArr], jimpInstance: J): JimpInstance[TypesFuncArr, PluginFuncArr, J] = js.native
  type JimpInstance[TypesFuncArr /* <: js.UndefOr[FunctionRet[JimpType[Image]]] */, PluginFuncArr /* <: js.UndefOr[FunctionRet[JimpPlugin[Image]]] */, J /* <: Jimp */] = (Exclude[J, js.UndefOr[scala.Nothing]]) with (GetIntersectionFromPlugins[Exclude[TypesFuncArr | PluginFuncArr, js.UndefOr[scala.Nothing]]]) with JimpConstructors
}

